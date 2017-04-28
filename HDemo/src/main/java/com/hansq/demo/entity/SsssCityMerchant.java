package com.hansq.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class SsssCityMerchant implements Serializable{

	private static final long serialVersionUID = -4957662611128731955L;

	private Long id;

	private Date createDateTime;
	
	private Date updateTime;
	
	private Byte invalid;
	
    private String merchantNumber;
    
    private String merchantCode;

    private Long parentCityMerchantId;

    private Long adminId;

    private String cityMerchantName;

    private String cityMerchantAddress;
    
    private String bankAccountName;

    private String bankName;

    private String bankNumber;

    private String bankAddress;

    private String linkMan;

    private String identityCard;

    private String linkTel;

    private Long userId;

    private Float money;

    private Float lowestMoney;

    private Byte level;
    
    private Float freezedMoney;
    
    private String provinceCode;//省代码

    private String provinceName;//省名称

    private String cityCode;//市代码

    private String cityName;//市名称
    
    private Float areaProfit;//跨区域利润比例
    
    private Float fixateProfit;//固定提成利润比例
    
    private Float firstGoodsMoney;//首批提货款
    
    private Float firstGoodsMoneyBalance;//首批提货款余额

    private String countyCode;

    private String countyName;
    
    private Float freezeCoupon;
    
    private Float unfreezeCoupon;
    
    private Float bondMoney;

    private Float bondMoneyBalance;

    private Float saleTotalMoney;
    
    private Float rebateMoney;

    private Byte status;
    
	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getInvalid() {
		return invalid;
	}

	public void setInvalid(Byte invalid) {
		this.invalid = invalid;
	}

	public String getMerchantNumber() {
		return merchantNumber;
	}

	public void setMerchantNumber(String merchantNumber) {
		this.merchantNumber = merchantNumber;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public Long getParentCityMerchantId() {
		return parentCityMerchantId;
	}

	public void setParentCityMerchantId(Long parentCityMerchantId) {
		this.parentCityMerchantId = parentCityMerchantId;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getCityMerchantName() {
		return cityMerchantName;
	}

	public void setCityMerchantName(String cityMerchantName) {
		this.cityMerchantName = cityMerchantName;
	}

	public String getCityMerchantAddress() {
		return cityMerchantAddress;
	}

	public void setCityMerchantAddress(String cityMerchantAddress) {
		this.cityMerchantAddress = cityMerchantAddress;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getLinkTel() {
		return linkTel;
	}

	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Float getLowestMoney() {
		return lowestMoney;
	}

	public void setLowestMoney(Float lowestMoney) {
		this.lowestMoney = lowestMoney;
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}

	public Float getFreezedMoney() {
		return freezedMoney;
	}

	public void setFreezedMoney(Float freezedMoney) {
		this.freezedMoney = freezedMoney;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Float getAreaProfit() {
		return areaProfit;
	}

	public void setAreaProfit(Float areaProfit) {
		this.areaProfit = areaProfit;
	}

	public Float getFixateProfit() {
		return fixateProfit;
	}

	public void setFixateProfit(Float fixateProfit) {
		this.fixateProfit = fixateProfit;
	}

	public Float getFirstGoodsMoney() {
		return firstGoodsMoney;
	}

	public void setFirstGoodsMoney(Float firstGoodsMoney) {
		this.firstGoodsMoney = firstGoodsMoney;
	}

	public Float getFirstGoodsMoneyBalance() {
		return firstGoodsMoneyBalance;
	}

	public void setFirstGoodsMoneyBalance(Float firstGoodsMoneyBalance) {
		this.firstGoodsMoneyBalance = firstGoodsMoneyBalance;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public Float getFreezeCoupon() {
		return freezeCoupon;
	}

	public void setFreezeCoupon(Float freezeCoupon) {
		this.freezeCoupon = freezeCoupon;
	}

	public Float getUnfreezeCoupon() {
		return unfreezeCoupon;
	}

	public void setUnfreezeCoupon(Float unfreezeCoupon) {
		this.unfreezeCoupon = unfreezeCoupon;
	}

	public Float getBondMoney() {
		return bondMoney;
	}

	public void setBondMoney(Float bondMoney) {
		this.bondMoney = bondMoney;
	}

	public Float getBondMoneyBalance() {
		return bondMoneyBalance;
	}

	public void setBondMoneyBalance(Float bondMoneyBalance) {
		this.bondMoneyBalance = bondMoneyBalance;
	}

	public Float getSaleTotalMoney() {
		return saleTotalMoney;
	}

	public void setSaleTotalMoney(Float saleTotalMoney) {
		this.saleTotalMoney = saleTotalMoney;
	}

	public Float getRebateMoney() {
		return rebateMoney;
	}

	public void setRebateMoney(Float rebateMoney) {
		this.rebateMoney = rebateMoney;
	}

	@Override
	public String toString() {
		return "SsssCityMerchant [id=" + id + ", createDateTime="
				+ createDateTime + ", updateTime=" + updateTime + ", invalid="
				+ invalid + ", merchantNumber=" + merchantNumber
				+ ", merchantCode=" + merchantCode + ", parentCityMerchantId="
				+ parentCityMerchantId + ", adminId=" + adminId
				+ ", cityMerchantName=" + cityMerchantName
				+ ", cityMerchantAddress=" + cityMerchantAddress
				+ ", bankAccountName=" + bankAccountName + ", bankName="
				+ bankName + ", bankNumber=" + bankNumber + ", bankAddress="
				+ bankAddress + ", linkMan=" + linkMan + ", identityCard="
				+ identityCard + ", linkTel=" + linkTel + ", userId=" + userId
				+ ", money=" + money + ", lowestMoney=" + lowestMoney
				+ ", level=" + level + ", freezedMoney=" + freezedMoney
				+ ", provinceCode=" + provinceCode + ", provinceName="
				+ provinceName + ", cityCode=" + cityCode + ", cityName="
				+ cityName + ", areaProfit=" + areaProfit + ", fixateProfit="
				+ fixateProfit + ", firstGoodsMoney=" + firstGoodsMoney
				+ ", firstGoodsMoneyBalance=" + firstGoodsMoneyBalance
				+ ", countyCode=" + countyCode + ", countyName=" + countyName
				+ ", freezeCoupon=" + freezeCoupon + ", unfreezeCoupon="
				+ unfreezeCoupon + ", bondMoney=" + bondMoney
				+ ", bondMoneyBalance=" + bondMoneyBalance
				+ ", saleTotalMoney=" + saleTotalMoney + ", rebateMoney="
				+ rebateMoney + "]";
	}
}