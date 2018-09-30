package bean;

public class channel 
{
	private int cid;
	private String chargeType;
	private String transType;
	private String chan;
	public channel() {
		super();
	}
	public channel(int cid, String chargeType, String transType, String chan) {
		super();
		this.cid = cid;
		this.chargeType = chargeType;
		this.transType = transType;
		this.chan = chan;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getChan() {
		return chan;
	}
	public void setChan(String chan) {
		this.chan = chan;
	}
	
}
