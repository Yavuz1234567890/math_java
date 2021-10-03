package math_java;

public class Vector2 {
	private float x, y;
	
	public Vector2() {
		x = 0.0f;
		y = 0.0f;
	}
	
	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Vector2 vector) {
		return x == vector.x && y == vector.y;
	}
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void mul(Vector2 vector) {
		x = x * vector.x;
		y = y * vector.y;
	}
	
	public void div(Vector2 vector) {
		x = x / vector.x;
		y = y / vector.y;
	}
	
	public void add(Vector2 vector) {
		x = x + vector.x;
		y = y + vector.y;
	}
	
	public void min(Vector2 vector) {
		x = x - vector.x;
		y = y - vector.y;
	}
	
	public static Vector2 mul(Vector2 dst, Vector2 src) {
		Vector2 vector = dst;
		vector.mul(src);
		return vector;
	}
	
	public static Vector2 div(Vector2 dst, Vector2 src) {
		Vector2 vector = dst;
		vector.div(src);
		return vector;
	}
	
	public static Vector2 add(Vector2 dst, Vector2 src) {
		Vector2 vector = dst;
		vector.add(src);
		return vector;
	}
	
	public static Vector2 min(Vector2 dst, Vector2 src) {
		Vector2 vector = dst;
		vector.min(src);
		return vector;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
}
