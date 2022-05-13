
package funding.service.face;

import java.util.List;

import funding.dto.Project;
import funding.dto.ProjectComment;
import funding.dto.ProjectNews;
import funding.dto.Reward;

public interface ProjectViewService {

	public Project getProject(Project project);

	public Project getPlan(Project project);

	public List<ProjectNews> getNewsList(int projectNo);

	public List<ProjectComment> getCommentList(int projectNo);

	public Project getContent(int projectNo);

	public ProjectNews getNewsView(ProjectNews news);

	public void writeNews(ProjectNews news);

	public void deleteNews(ProjectNews news);

	public void writeComment(ProjectComment comment);

	public void deleteComment(ProjectComment comment);

	public List<Reward> getReward(Project project);

}