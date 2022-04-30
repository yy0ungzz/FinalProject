package funding.dto;

import java.sql.Date;

public class Notice {
	private int noticeNo;
	private String title;
	private String content;
	private String fileOrigin;
	private String fileStorage;
	private Date date;
	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", title=" + title + ", content=" + content + ", fileOrigin="
				+ fileOrigin + ", fileStorage=" + fileStorage + ", date=" + date + "]";
	}
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileOrigin() {
		return fileOrigin;
	}
	public void setFileOrigin(String fileOrigin) {
		this.fileOrigin = fileOrigin;
	}
	public String getFileStorage() {
		return fileStorage;
	}
	public void setFileStorage(String fileStorage) {
		this.fileStorage = fileStorage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
