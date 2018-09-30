package bean;
import java.sql.Date;
import java.util.Set;
public class ChannelPackage 
{
	private int PackId;
	private String PacName;
	private Set<String> PacCategory; 
	private String PacChargingType;
	private String PacTransmissionType;
	private String PacChannels;
	private double PacCost;
	private Date PacFromDate;
	private Date PacToDate;
	private String pacAdded;


	public ChannelPackage(int packId, String pacName, Set<String> pacCategory,
			String pacChargingType, String pacTransmissionType,
			String pacChannels, double pacCost, Date pacFromDate,
			Date pacToDate, String pacAdded) {
		super();
		PackId = packId;
		PacName = pacName;
		PacCategory = pacCategory;
		PacChargingType = pacChargingType;
		PacTransmissionType = pacTransmissionType;
		PacChannels = pacChannels;
		PacCost = pacCost;
		PacFromDate = pacFromDate;
		PacToDate = pacToDate;
		this.pacAdded = pacAdded;
	}
	public Set<String> getPacCategory() {
		return PacCategory;
	}
	public void setPacCategory(Set<String> pacCategory) {
		PacCategory = pacCategory;
	}
	public int getPackId() {
		return PackId;
	}
	public void setPackId(int packId) {
		PackId = packId;
	}
	public String getPacName() {
		return PacName;
	}
	public void setPacName(String pacName) {
		PacName = pacName;
	}
	public String getPacChargingType() {
		return PacChargingType;
	}
	public void setPacChargingType(String pacChargingType) {
		PacChargingType = pacChargingType;
	}
	public String getPacTransmissionType() {
		return PacTransmissionType;
	}
	public void setPacTransmissionType(String pacTransmissionType) {
		PacTransmissionType = pacTransmissionType;
	}
	public String getPacChannels() {
		return PacChannels;
	}
	public void setPacChannels(String pacChannels) {
		PacChannels = pacChannels;
	}
	public double getPacCost() {
		return PacCost;
	}
	public void setPacCost(double pacCost) {
		PacCost = pacCost;
	}
	public Date getPacFromDate() {
		return PacFromDate;
	}
	public void setPacFromDate(Date date1) {
		PacFromDate = date1;
	}
	public Date getPacToDate() {
		return PacToDate;
	}
	public void setPacToDate(Date pacToDate2) {
		PacToDate = pacToDate2;
	}
	public String getPacAdded() {
		return pacAdded;
	}
	public void setPacAdded(String pacAdded) {
		this.pacAdded = pacAdded;
	}
	public ChannelPackage() {
		super();
	}
}
