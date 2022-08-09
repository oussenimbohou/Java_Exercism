class Darts {

	private double x;
	private double y;
	Darts(double x,double y){
		this.x = x;
		this.y = y;
	}

    int score() {
		if( x*x + y*y <= 100 && x*x + y*y > 25) return 1;
		if(x*x + y*y <= 25 && x*x + y*y > 1) return 5;
		if(x*x + y*y <= 1 ) return 10;
		if(x < -10 && x > 10 || y < -10 && y > 10) return 0;
		return 0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}



