package math_java;

public class Vector4 {
	private float x, y, z, w;
	
	public Vector4() {
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
		w = 0.0f;
	}
	
	public Vector4(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public boolean equals(Vector4 vector) {
		return x == vector.x && y == vector.y && z == vector.z && w == vector.w;
	}
	
	public void set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void mul(Vector4 vector) {
		x = x * vector.x;
		y = y * vector.y;
		z = z * vector.z;
		w = w * vector.w;
	}
	
	public void div(Vector4 vector) {
		x = x / vector.x;
		y = y / vector.y;
		z = z / vector.z;
		w = w / vector.w;
	}
	
	public void add(Vector4 vector) {
		x = x + vector.x;
		y = y + vector.y;
		z = z + vector.z;
		w = w + vector.w;
	}
	
	public void min(Vector4 vector) {
		x = x - vector.x;
		y = y - vector.y;
		z = z - vector.z;
		w = w - vector.w;
	}
	
	public static Vector4 mul(Vector4 dst, Vector4 src) {
		Vector4 vector = dst;
		vector.mul(src);
		return vector;
	}
	
	public static Vector4 div(Vector4 dst, Vector4 src) {
		Vector4 vector = dst;
		vector.div(src);
		return vector;
	}
	
	public static Vector4 add(Vector4 dst, Vector4 src) {
		Vector4 vector = dst;
		vector.add(src);
		return vector;
	}
	
	public static Vector4 min(Vector4 dst, Vector4 src) {
		Vector4 vector = dst;
		vector.min(src);
		return vector;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public float getW() {
		return w;
	}
}
