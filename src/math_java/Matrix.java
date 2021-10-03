package math_java;

import java.nio.FloatBuffer;

public class Matrix {
	public static final int WIDTH = 4, HEIGHT = 4;
	
	private float[][] matrix = new float[WIDTH][HEIGHT];
	
	public Matrix() {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				matrix[x][y] = 0.0f;
			}
		}
	}
	
	public boolean equals(Matrix matrix) {
		boolean status = false;
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				status = this.matrix[x][y] == matrix.matrix[x][y];
			}
		}
		return status;	
	}
	
	public void fill(float number) {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				matrix[x][y] = number;
			}
		}
	}
	
	public void set(float e00, float e01, float e02, float e03,
					float e10, float e11, float e12, float e13,
					float e20, float e21, float e22, float e23,
					float e30, float e31, float e32, float e33) {
		matrix[0][0] = e00; matrix[0][1] = e01; matrix[0][2] = e02; matrix[0][3] = e03;
		matrix[1][0] = e10; matrix[1][1] = e11; matrix[1][2] = e12; matrix[1][3] = e13;
		matrix[2][0] = e20; matrix[2][1] = e21; matrix[2][2] = e22; matrix[2][3] = e23;
		matrix[3][0] = e30; matrix[3][1] = e31; matrix[3][2] = e32; matrix[3][3] = e33;
	}
	
	public void setIdentity(float diagonal) {
		matrix[0][0] = diagonal;
		matrix[1][1] = diagonal;
		matrix[2][2] = diagonal;
		matrix[3][3] = diagonal;
	}
	
	public void setElement(int row, int column, float number) {
		matrix[row][column] = number;
	}
	
	public float getElement(int row, int column) {
		return matrix[row][column];
	}
	
	public void setRow(int row, Vector4 vector) {
		setElement(row, 0, vector.getX());
		setElement(row, 1, vector.getY());
		setElement(row, 2, vector.getZ());
		setElement(row, 3, vector.getW());
	}
	
	public void setColumn(int column, Vector4 vector) {
		setElement(0, column, vector.getX());
		setElement(1, column, vector.getY());
		setElement(2, column, vector.getZ());
		setElement(3, column, vector.getW());
	}
	
	public Vector4 getRow(int column) {
		return new Vector4(getElement(0, column), getElement(1, column), getElement(2, column), getElement(3, column));
	}
	
	public Vector4 getColumn(int row) {
		return new Vector4(getElement(row, 0), getElement(row, 1), getElement(row, 2), getElement(row, 3));
	}
	
	public void mul(Matrix matrix) {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				for(int i = 0; i < 4; i++) {
					this.matrix[x][y] += this.matrix[x][i] * matrix.matrix[i][y];
				}
			}
		}
	}
	
	public void div(Matrix matrix) {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				this.matrix[x][y] = this.matrix[x][y] / matrix.matrix[x][y];
			}
		}
	}
	
	public void add(Matrix matrix) {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				this.matrix[x][y] = this.matrix[x][y] + matrix.matrix[x][y];
			}
		}
	}
	
	public void min(Matrix matrix) {
		for(int x = 0; x < WIDTH; x++) {
			for(int y = 0; y < HEIGHT; y++) {
				this.matrix[x][y] = this.matrix[x][y] - matrix.matrix[x][y];
			}
		}
	}
	
	public static Matrix mul(Matrix dst, Matrix src) {
		Matrix matrix = dst;
		matrix.mul(src);
		return matrix;
	}
	
	public static Matrix div(Matrix dst, Matrix src) {
		Matrix matrix = dst;
		matrix.div(src);
		return matrix;
	}
	
	public static Matrix add(Matrix dst, Matrix src) {
		Matrix matrix = dst;
		matrix.add(src);
		return matrix;
	}
	
	public static Matrix min(Matrix dst, Matrix src) {
		Matrix matrix = dst;
		matrix.min(src);
		return matrix;
	}
	
	public void toBuffer(FloatBuffer buffer) {
		buffer.put(matrix[0][0]).put(matrix[0][1]).put(matrix[0][2]).put(matrix[0][3]);
		buffer.put(matrix[1][0]).put(matrix[1][1]).put(matrix[1][2]).put(matrix[1][3]);
		buffer.put(matrix[2][0]).put(matrix[2][1]).put(matrix[2][2]).put(matrix[2][3]);
		buffer.put(matrix[3][0]).put(matrix[3][1]).put(matrix[3][2]).put(matrix[3][3]);
		buffer.flip();
	}
}
