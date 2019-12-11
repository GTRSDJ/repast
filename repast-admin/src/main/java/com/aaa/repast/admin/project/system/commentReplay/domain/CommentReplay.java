package com.aaa.repast.admin.project.system.commentReplay.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 产品评价回复表 pms_comment_replay
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
public class CommentReplay extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/**  */
	private Long commentId;
	/**  */
	private String memberNickName;
	/**  */
	private String memberIcon;
	/**  */
	private String content;
	/**  */
	private Date createTime;
	/** 评论人员类型；0->会员；1->管理员 */
	private Integer type;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setCommentId(Long commentId) 
	{
		this.commentId = commentId;
	}

	public Long getCommentId() 
	{
		return commentId;
	}
	public void setMemberNickName(String memberNickName) 
	{
		this.memberNickName = memberNickName;
	}

	public String getMemberNickName() 
	{
		return memberNickName;
	}
	public void setMemberIcon(String memberIcon) 
	{
		this.memberIcon = memberIcon;
	}

	public String getMemberIcon() 
	{
		return memberIcon;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setType(Integer type) 
	{
		this.type = type;
	}

	public Integer getType() 
	{
		return type;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("commentId", getCommentId())
            .append("memberNickName", getMemberNickName())
            .append("memberIcon", getMemberIcon())
            .append("content", getContent())
            .append("createTime", getCreateTime())
            .append("type", getType())
            .toString();
    }
}
