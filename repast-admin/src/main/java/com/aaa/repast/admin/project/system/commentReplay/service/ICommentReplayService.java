package com.aaa.repast.admin.project.system.commentReplay.service;

import com.aaa.repast.admin.project.system.commentReplay.domain.CommentReplay;
import java.util.List;

/**
 * 产品评价回复 服务层
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
public interface ICommentReplayService 
{
	/**
     * 查询产品评价回复信息
     * 
     * @param id 产品评价回复ID
     * @return 产品评价回复信息
     */
	public CommentReplay selectCommentReplayById(Long id);
	
	/**
     * 查询产品评价回复列表
     * 
     * @param commentReplay 产品评价回复信息
     * @return 产品评价回复集合
     */
	public List<CommentReplay> selectCommentReplayList(CommentReplay commentReplay);
	
	/**
     * 新增产品评价回复
     * 
     * @param commentReplay 产品评价回复信息
     * @return 结果
     */
	public int insertCommentReplay(CommentReplay commentReplay);
	
	/**
     * 修改产品评价回复
     * 
     * @param commentReplay 产品评价回复信息
     * @return 结果
     */
	public int updateCommentReplay(CommentReplay commentReplay);
		
	/**
     * 删除产品评价回复信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteCommentReplayByIds(String ids);
	
}
