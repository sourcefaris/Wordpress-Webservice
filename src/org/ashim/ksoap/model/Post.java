package org.ashim.ksoap.model;

public class Post {
	private String id;
	private String author;
	private String date;
	private String dateGmt;
	private String content;
	private String title;
	private String excerpt;
	private String status;
	private String commentStatus;
	private String pingStatus;
	private String password;
	private String name;
	private String toPing;
	private String pinged;
	private String modified;
	private String modifiedGmt;
	private String contentFiltered;
	private String parentId;
	private String guid;
	private String menuOrder;
	private String type;
	private String mymeType;
	private String commentCount;
	private String filter;
	public Post(String id, String author, String date, String dateGmt,
			String content, String title, String excerpt, String status,
			String commentStatus, String pingStatus, String password,
			String name, String toPing, String pinged, String modified,
			String modifiedGmt, String contentFiltered, String parentId,
			String guid, String menuOrder, String type, String mymeType,
			String commentCount, String filter) {
		super();
		this.id = id;
		this.author = author;
		this.date = date;
		this.dateGmt = dateGmt;
		this.content = content;
		this.title = title;
		this.excerpt = excerpt;
		this.status = status;
		this.commentStatus = commentStatus;
		this.pingStatus = pingStatus;
		this.password = password;
		this.name = name;
		this.toPing = toPing;
		this.pinged = pinged;
		this.modified = modified;
		this.modifiedGmt = modifiedGmt;
		this.contentFiltered = contentFiltered;
		this.parentId = parentId;
		this.guid = guid;
		this.menuOrder = menuOrder;
		this.type = type;
		this.mymeType = mymeType;
		this.commentCount = commentCount;
		this.filter = filter;
	}
	public String getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public String getDate() {
		return date;
	}
	public String getDateGmt() {
		return dateGmt;
	}
	public String getContent() {
		return content;
	}
	public String getTitle() {
		return title;
	}
	public String getExcerpt() {
		return excerpt;
	}
	public String getStatus() {
		return status;
	}
	public String getCommentStatus() {
		return commentStatus;
	}
	public String getPingStatus() {
		return pingStatus;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getToPing() {
		return toPing;
	}
	public String getPinged() {
		return pinged;
	}
	public String getModified() {
		return modified;
	}
	public String getModifiedGmt() {
		return modifiedGmt;
	}
	public String getContentFiltered() {
		return contentFiltered;
	}
	public String getParentId() {
		return parentId;
	}
	public String getGuid() {
		return guid;
	}
	public String getMenuOrder() {
		return menuOrder;
	}
	public String getType() {
		return type;
	}
	public String getMymeType() {
		return mymeType;
	}
	public String getCommentCount() {
		return commentCount;
	}
	public String getFilter() {
		return filter;
	}
	
	

}
