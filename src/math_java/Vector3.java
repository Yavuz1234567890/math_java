package math_java;

public class Vector3 {
	private float x, y, z;
	
	public Vector3() {
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	
	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean equals(Vector3 vector) {
		return x == vector.x && y == vector.y && z == vector.z;
	}
	
	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void mul(Vector3 vector) {
		x = x * vector.x;
		y = y * vector.y;
		z = z * vector.z;
	}
	
	public void div(Vector3 vector) {
		x = x / vector.x;
		y = y / vector.y;
		z = z / vector.z;
	}
	
	public void add(Vector3 vector) {
		x = x + vector.x;
		y = y + vector.y;
		z = z + vector.z;
	}
	
	public void min(Vector3 vector) {
		x = x - vector.x;
		y = y - vector.y;
		z = z - vector.z;
	}
	
	public static Vector3 mul(Vector3 dst, Vector3 src) {
		Vector3 vector = dst;
		vector.mul(src);
		return vector;
	}
	
	public static Vector3 div(Vector3 dst, Vector3 src) {
		Vector3 vector = dst;
		vector.div(src);
		return vector;
	}
	
	public static Vector3 add(Vector3 dst, Vector3 src) {
		Vector3 vector = dst;
		vector.add(src);
		return vector;
	}
	
	public static Vector3 min(Vector3 dst, Vector3 src) {
		Vector3 vector = dst;
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
}
