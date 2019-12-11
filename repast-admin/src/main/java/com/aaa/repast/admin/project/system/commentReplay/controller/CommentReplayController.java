package com.aaa.repast.admin.project.system.commentReplay.controller;

import java.util.List;
import com.aaa.repast.admin.framework.aspectj.lang.annotation.Log;
import com.aaa.repast.admin.framework.aspectj.lang.enums.BusinessType;
import com.aaa.repast.admin.framework.poi.ExcelUtil;
import com.aaa.repast.admin.framework.web.controller.BaseController;
import com.aaa.repast.admin.framework.web.domain.AjaxResult;
import com.aaa.repast.admin.framework.web.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.repast.admin.project.system.commentReplay.domain.CommentReplay;
import com.aaa.repast.admin.project.system.commentReplay.service.ICommentReplayService;

/**
 * 产品评价回复 信息操作处理
 * 
 * @author Seven Lee
 * @date 2019-12-05
 */
@Controller
@RequestMapping("/system/commentReplay")
public class CommentReplayController extends BaseController
{
    private String prefix = "system/commentReplay";
	
	@Autowired
	private ICommentReplayService commentReplayService;
	
	@RequiresPermissions("system:commentReplay:view")
	@GetMapping()
	public String commentReplay()
	{
	    return prefix + "/commentReplay";
	}
	
	/**
	 * 查询产品评价回复列表
	 */
	@RequiresPermissions("system:commentReplay:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(CommentReplay commentReplay)
	{
		startPage();
        List<CommentReplay> list = commentReplayService.selectCommentReplayList(commentReplay);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出产品评价回复列表
	 */
	@RequiresPermissions("system:commentReplay:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommentReplay commentReplay)
    {
    	List<CommentReplay> list = commentReplayService.selectCommentReplayList(commentReplay);
        ExcelUtil<CommentReplay> util = new ExcelUtil<CommentReplay>(CommentReplay.class);
        return util.exportExcel(list, "commentReplay");
    }
	
	/**
	 * 新增产品评价回复
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存产品评价回复
	 */
	@RequiresPermissions("system:commentReplay:add")
	@Log(title = "产品评价回复", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(CommentReplay commentReplay)
	{		
		return toAjax(commentReplayService.insertCommentReplay(commentReplay));
	}

	/**
	 * 修改产品评价回复
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		CommentReplay commentReplay = commentReplayService.selectCommentReplayById(id);
		mmap.put("commentReplay", commentReplay);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存产品评价回复
	 */
	@RequiresPermissions("system:commentReplay:edit")
	@Log(title = "产品评价回复", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(CommentReplay commentReplay)
	{		
		return toAjax(commentReplayService.updateCommentReplay(commentReplay));
	}
	
	/**
	 * 删除产品评价回复
	 */
	@RequiresPermissions("system:commentReplay:remove")
	@Log(title = "产品评价回复", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(commentReplayService.deleteCommentReplayByIds(ids));
	}
	
}
