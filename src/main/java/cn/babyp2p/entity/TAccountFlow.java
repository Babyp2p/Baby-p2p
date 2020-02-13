package cn.babyp2p.entity;

import java.util.Date;

public class TAccountFlow {

  private long id;
  private String accountId;//账户
  private long amount;//金额
  private long flowType;//资金流水类型
  private long availableAmount;//可用余额
  private long freezeAmount;//冻结余额
  private String remark;//流水说明
  private Date createTime;//创建时间


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public long getFlowType() {
    return flowType;
  }

  public void setFlowType(long flowType) {
    this.flowType = flowType;
  }


  public long getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(long availableAmount) {
    this.availableAmount = availableAmount;
  }


  public long getFreezeAmount() {
    return freezeAmount;
  }

  public void setFreezeAmount(long freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
