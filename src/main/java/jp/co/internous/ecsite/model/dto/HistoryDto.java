package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(TblPurchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.createdAt = f.format(d);
	}
	
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public int getItemCount() {
		return itemCount;
	}
	public int getTotal() {
		return total;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
