package com.aaa.repast.admin.project.system.order.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表 oms_order
 * 
 * @author Seven Lee
 * @date 2019-12-07
 */
public class Order extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 订单id */
	private Long id;
	/**  */
	private Long memberId;
	/**  */
	private Long shopId;
	/** 拼团活动ID */
	private Long groupPromotionId;
	/** 促销活动ID */
	private Long couponId;
	/** 订单编号 */
	private String orderSn;
	/** 提交时间 */
	private Date createTime;
	/** 用户帐号 */
	private String memberUsername;
	/** 订单总金额 */
	private BigDecimal totalAmount;
	/** 应付金额（实际支付金额） */
	private BigDecimal payAmount;
	/** 运费金额 */
	private BigDecimal freightAmount;
	/** 促销优化金额（促销价、满减、阶梯价） */
	private BigDecimal promotionAmount;
	/** 积分抵扣金额 */
	private BigDecimal integrationAmount;
	/** 优惠券抵扣金额 */
	private BigDecimal couponAmount;
	/** 管理员后台调整订单使用的折扣金额 */
	private BigDecimal discountAmount;
	/** 支付方式：0->未支付；1->支付宝；2->微信 */
	private Integer payType;
	/** 订单来源：0->PC订单；1->app订单 */
	private Integer sourceType;
	/** 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单 */
	private Integer status;
	/** 订单类型：0->正常订单；1->秒杀订单 */
	private Integer orderType;
	/** 物流公司(配送方式) */
	private String deliveryCompany;
	/** 物流单号 */
	private String deliverySn;
	/** 自动确认时间（天） */
	private Integer autoConfirmDay;
	/** 可以获得的积分 */
	private Integer integration;
	/** 可以活动的成长值 */
	private Integer growth;
	/** 活动信息 */
	private String promotionInfo;
	/** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
	private Integer billType;
	/** 发票抬头 */
	private String billHeader;
	/** 发票内容 */
	private String billContent;
	/** 收票人电话 */
	private String billReceiverPhone;
	/** 收票人邮箱 */
	private String billReceiverEmail;
	/** 收货人姓名 */
	private String receiverName;
	/** 收货人电话 */
	private String receiverPhone;
	/** 收货人邮编 */
	private String receiverPostCode;
	/** 省份/直辖市 */
	private String receiverProvince;
	/** 城市 */
	private String receiverCity;
	/** 区 */
	private String receiverRegion;
	/** 详细地址 */
	private String receiverDetailAddress;
	/** 订单备注 */
	private String note;
	/** 确认收货状态：0->未确认；1->已确认 */
	private Integer confirmStatus;
	/** 删除状态：0->未删除；1->已删除 */
	private Integer deleteStatus;
	/** 下单时使用的积分 */
	private Integer useIntegration;
	/** 支付时间 */
	private Date paymentTime;
	/** 发货时间 */
	private Date deliveryTime;
	/** 确认收货时间 */
	private Date receiveTime;
	/** 评价时间 */
	private Date commentTime;
	/** 修改时间 */
	private Date modifyTime;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}
	public void setShopId(Long shopId) 
	{
		this.shopId = shopId;
	}

	public Long getShopId() 
	{
		return shopId;
	}
	public void setGroupPromotionId(Long groupPromotionId) 
	{
		this.groupPromotionId = groupPromotionId;
	}

	public Long getGroupPromotionId() 
	{
		return groupPromotionId;
	}
	public void setCouponId(Long couponId) 
	{
		this.couponId = couponId;
	}

	public Long getCouponId() 
	{
		return couponId;
	}
	public void setOrderSn(String orderSn) 
	{
		this.orderSn = orderSn;
	}

	public String getOrderSn() 
	{
		return orderSn;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setMemberUsername(String memberUsername) 
	{
		this.memberUsername = memberUsername;
	}

	public String getMemberUsername() 
	{
		return memberUsername;
	}
	public void setTotalAmount(BigDecimal totalAmount) 
	{
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalAmount() 
	{
		return totalAmount;
	}
	public void setPayAmount(BigDecimal payAmount) 
	{
		this.payAmount = payAmount;
	}

	public BigDecimal getPayAmount() 
	{
		return payAmount;
	}
	public void setFreightAmount(BigDecimal freightAmount) 
	{
		this.freightAmount = freightAmount;
	}

	public BigDecimal getFreightAmount() 
	{
		return freightAmount;
	}
	public void setPromotionAmount(BigDecimal promotionAmount) 
	{
		this.promotionAmount = promotionAmount;
	}

	public BigDecimal getPromotionAmount() 
	{
		return promotionAmount;
	}
	public void setIntegrationAmount(BigDecimal integrationAmount) 
	{
		this.integrationAmount = integrationAmount;
	}

	public BigDecimal getIntegrationAmount() 
	{
		return integrationAmount;
	}
	public void setCouponAmount(BigDecimal couponAmount) 
	{
		this.couponAmount = couponAmount;
	}

	public BigDecimal getCouponAmount() 
	{
		return couponAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) 
	{
		this.discountAmount = discountAmount;
	}

	public BigDecimal getDiscountAmount() 
	{
		return discountAmount;
	}
	public void setPayType(Integer payType) 
	{
		this.payType = payType;
	}

	public Integer getPayType() 
	{
		return payType;
	}
	public void setSourceType(Integer sourceType) 
	{
		this.sourceType = sourceType;
	}

	public Integer getSourceType() 
	{
		return sourceType;
	}
	public void setStatus(Integer status) 
	{
		this.status = status;
	}

	public Integer getStatus() 
	{
		return status;
	}
	public void setOrderType(Integer orderType) 
	{
		this.orderType = orderType;
	}

	public Integer getOrderType() 
	{
		return orderType;
	}
	public void setDeliveryCompany(String deliveryCompany) 
	{
		this.deliveryCompany = deliveryCompany;
	}

	public String getDeliveryCompany() 
	{
		return deliveryCompany;
	}
	public void setDeliverySn(String deliverySn) 
	{
		this.deliverySn = deliverySn;
	}

	public String getDeliverySn() 
	{
		return deliverySn;
	}
	public void setAutoConfirmDay(Integer autoConfirmDay) 
	{
		this.autoConfirmDay = autoConfirmDay;
	}

	public Integer getAutoConfirmDay() 
	{
		return autoConfirmDay;
	}
	public void setIntegration(Integer integration) 
	{
		this.integration = integration;
	}

	public Integer getIntegration() 
	{
		return integration;
	}
	public void setGrowth(Integer growth) 
	{
		this.growth = growth;
	}

	public Integer getGrowth() 
	{
		return growth;
	}
	public void setPromotionInfo(String promotionInfo) 
	{
		this.promotionInfo = promotionInfo;
	}

	public String getPromotionInfo() 
	{
		return promotionInfo;
	}
	public void setBillType(Integer billType) 
	{
		this.billType = billType;
	}

	public Integer getBillType() 
	{
		return billType;
	}
	public void setBillHeader(String billHeader) 
	{
		this.billHeader = billHeader;
	}

	public String getBillHeader() 
	{
		return billHeader;
	}
	public void setBillContent(String billContent) 
	{
		this.billContent = billContent;
	}

	public String getBillContent() 
	{
		return billContent;
	}
	public void setBillReceiverPhone(String billReceiverPhone) 
	{
		this.billReceiverPhone = billReceiverPhone;
	}

	public String getBillReceiverPhone() 
	{
		return billReceiverPhone;
	}
	public void setBillReceiverEmail(String billReceiverEmail) 
	{
		this.billReceiverEmail = billReceiverEmail;
	}

	public String getBillReceiverEmail() 
	{
		return billReceiverEmail;
	}
	public void setReceiverName(String receiverName) 
	{
		this.receiverName = receiverName;
	}

	public String getReceiverName() 
	{
		return receiverName;
	}
	public void setReceiverPhone(String receiverPhone) 
	{
		this.receiverPhone = receiverPhone;
	}

	public String getReceiverPhone() 
	{
		return receiverPhone;
	}
	public void setReceiverPostCode(String receiverPostCode) 
	{
		this.receiverPostCode = receiverPostCode;
	}

	public String getReceiverPostCode() 
	{
		return receiverPostCode;
	}
	public void setReceiverProvince(String receiverProvince) 
	{
		this.receiverProvince = receiverProvince;
	}

	public String getReceiverProvince() 
	{
		return receiverProvince;
	}
	public void setReceiverCity(String receiverCity) 
	{
		this.receiverCity = receiverCity;
	}

	public String getReceiverCity() 
	{
		return receiverCity;
	}
	public void setReceiverRegion(String receiverRegion) 
	{
		this.receiverRegion = receiverRegion;
	}

	public String getReceiverRegion() 
	{
		return receiverRegion;
	}
	public void setReceiverDetailAddress(String receiverDetailAddress) 
	{
		this.receiverDetailAddress = receiverDetailAddress;
	}

	public String getReceiverDetailAddress() 
	{
		return receiverDetailAddress;
	}
	public void setNote(String note) 
	{
		this.note = note;
	}

	public String getNote() 
	{
		return note;
	}
	public void setConfirmStatus(Integer confirmStatus) 
	{
		this.confirmStatus = confirmStatus;
	}

	public Integer getConfirmStatus() 
	{
		return confirmStatus;
	}
	public void setDeleteStatus(Integer deleteStatus) 
	{
		this.deleteStatus = deleteStatus;
	}

	public Integer getDeleteStatus() 
	{
		return deleteStatus;
	}
	public void setUseIntegration(Integer useIntegration) 
	{
		this.useIntegration = useIntegration;
	}

	public Integer getUseIntegration() 
	{
		return useIntegration;
	}
	public void setPaymentTime(Date paymentTime) 
	{
		this.paymentTime = paymentTime;
	}

	public Date getPaymentTime() 
	{
		return paymentTime;
	}
	public void setDeliveryTime(Date deliveryTime) 
	{
		this.deliveryTime = deliveryTime;
	}

	public Date getDeliveryTime() 
	{
		return deliveryTime;
	}
	public void setReceiveTime(Date receiveTime) 
	{
		this.receiveTime = receiveTime;
	}

	public Date getReceiveTime() 
	{
		return receiveTime;
	}
	public void setCommentTime(Date commentTime) 
	{
		this.commentTime = commentTime;
	}

	public Date getCommentTime() 
	{
		return commentTime;
	}
	public void setModifyTime(Date modifyTime) 
	{
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime() 
	{
		return modifyTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("memberId", getMemberId())
            .append("shopId", getShopId())
            .append("groupPromotionId", getGroupPromotionId())
            .append("couponId", getCouponId())
            .append("orderSn", getOrderSn())
            .append("createTime", getCreateTime())
            .append("memberUsername", getMemberUsername())
            .append("totalAmount", getTotalAmount())
            .append("payAmount", getPayAmount())
            .append("freightAmount", getFreightAmount())
            .append("promotionAmount", getPromotionAmount())
            .append("integrationAmount", getIntegrationAmount())
            .append("couponAmount", getCouponAmount())
            .append("discountAmount", getDiscountAmount())
            .append("payType", getPayType())
            .append("sourceType", getSourceType())
            .append("status", getStatus())
            .append("orderType", getOrderType())
            .append("deliveryCompany", getDeliveryCompany())
            .append("deliverySn", getDeliverySn())
            .append("autoConfirmDay", getAutoConfirmDay())
            .append("integration", getIntegration())
            .append("growth", getGrowth())
            .append("promotionInfo", getPromotionInfo())
            .append("billType", getBillType())
            .append("billHeader", getBillHeader())
            .append("billContent", getBillContent())
            .append("billReceiverPhone", getBillReceiverPhone())
            .append("billReceiverEmail", getBillReceiverEmail())
            .append("receiverName", getReceiverName())
            .append("receiverPhone", getReceiverPhone())
            .append("receiverPostCode", getReceiverPostCode())
            .append("receiverProvince", getReceiverProvince())
            .append("receiverCity", getReceiverCity())
            .append("receiverRegion", getReceiverRegion())
            .append("receiverDetailAddress", getReceiverDetailAddress())
            .append("note", getNote())
            .append("confirmStatus", getConfirmStatus())
            .append("deleteStatus", getDeleteStatus())
            .append("useIntegration", getUseIntegration())
            .append("paymentTime", getPaymentTime())
            .append("deliveryTime", getDeliveryTime())
            .append("receiveTime", getReceiveTime())
            .append("commentTime", getCommentTime())
            .append("modifyTime", getModifyTime())
            .toString();
    }
}
