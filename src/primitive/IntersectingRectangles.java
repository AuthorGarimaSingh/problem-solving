package primitive;

public class IntersectingRectangles {

	static class Rectangle {

		int x1, x2, y1, y2;

		Rectangle(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public static void main(String[] args) {

		Rectangle A = new Rectangle(3, 1, 4, 2);
		Rectangle B = new Rectangle(4, 2, 9, 4);
		Rectangle C = new Rectangle(7, 1, 8, 5);
		Rectangle D = new Rectangle(11, 1, 13, 4);
		Rectangle E = new Rectangle(13, 1, 14, 2);
		Rectangle F = new Rectangle(12, 3, 19, 6);
		Rectangle G = new Rectangle(15, 4, 17, 5);
		Rectangle H = new Rectangle(18, 2, 23, 7);
		Rectangle I = new Rectangle(21, 2, 23, 7);
		Rectangle J = new Rectangle(21, 1, 22, 3);

		IntersectingRectangles obj = new IntersectingRectangles();

		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(A, B));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(B, C));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(D, E));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(D, F));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(F, G));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(G, H));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(H, I));
		System.out.println("Are rectangles intersecting? " + obj.isIntersecting(I, J));

	}

	private boolean isIntersecting(Rectangle R1, Rectangle R2) {
		if (((R1.y1 == R2.y1) && (R1.y2 == R2.y2))
				|| ((R1.y1 > R2.y1) && (R1.y2 > R2.y1) && (R1.y1 < R2.y2) && (R1.y2 > R2.y2))
				|| ((R1.y1 < R2.y1) && (R1.y2 > R2.y1) && (R1.y1 < R2.y2) && (R1.y2 < R2.y2))
				|| (((R1.y1 < R2.y1) && (R1.y2 > R2.y1) && (R1.y1 < R2.y2) && (R1.y2 > R2.y2))))
			return true;
		else if (((R1.x1 == R2.x1) && (R1.x2 == R2.x2))
				|| ((R1.x1 > R2.x1) && (R1.x2 > R2.x1) && (R1.x1 < R2.x2) && (R1.x2 > R2.x2))
				|| ((R1.x1 < R2.x1) && (R1.x2 > R2.x1) && (R1.x1 < R2.x2) && (R1.x2 < R2.x2))
				|| (((R1.x1 < R2.x1) && (R1.x2 > R2.x1) && (R1.x1 < R2.x2) && (R1.x2 > R2.x2))))
			return true;
		else
			return false;
	}

}
