package com.aaa.repast.admin.project.system.commentReplay.service;

import com.aaa.repast.common.support.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.aaa.repast.admin.project.system.commentReplay.mapper.CommentReplayMapper;
import com.aaa.repast.admin.project.system.commentReplay.domain.CommentReplay;

/**
 * 产品评价回复 服务层实现
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Service
public class CommentReplayServiceImpl implements ICommentReplayService 
{
	@Autowired
	private CommentReplayMapper commentReplayMapper;

	/**
     * 查询产品评价回复信息
     * 
     * @param id 产品评价回复ID
     * @return 产品评价回复信息
     */
    @Override
	public CommentReplay selectCommentReplayById(Long id)
	{
	    return commentReplayMapper.selectCommentReplayById(id);
	}
	
	/**
     * 查询产品评价回复列表
     * 
     * @param commentReplay 产品评价回复信息
     * @return 产品评价回复集合
     */
	@Override
	public List<CommentReplay> selectCommentReplayList(CommentReplay commentReplay)
	{
	    return commentReplayMapper.selectCommentReplayList(commentReplay);
	}
	
    /**
     * 新增产品评价回复
     * 
     * @param commentReplay 产品评价回复信息
     * @return 结果
     */
	@Override
	public int insertCommentReplay(CommentReplay commentReplay)
	{
	    return commentReplayMapper.insertCommentReplay(commentReplay);
	}
	
	/**
     * 修改产品评价回复
     * 
     * @param commentReplay 产品评价回复信息
     * @return 结果
     */
	@Override
	public int updateCommentReplay(CommentReplay commentReplay)
	{
	    return commentReplayMapper.updateCommentReplay(commentReplay);
	}

	/**
     * 删除产品评价回复对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCommentReplayByIds(String ids)
	{
		return commentReplayMapper.deleteCommentReplayByIds(Convert.toStrArray(ids));
	}
	
}
