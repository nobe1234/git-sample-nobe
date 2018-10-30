package jp.co.sample;

/**
 * @author soheinobe 車を表すドメイン
 */
public class Car {

	/**
	 * スピード
	 */
	private Integer spped;
	private String bodyColor;
	

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public Integer getSpped() {
		return spped;
	}

	public void setSpped(Integer spped) {
		this.spped = spped;
	}

}
