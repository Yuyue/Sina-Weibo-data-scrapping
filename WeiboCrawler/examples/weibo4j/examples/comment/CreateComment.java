package weibo4j.examples.comment;

import weibo4j.Comments;
import weibo4j.Weibo;
import weibo4j.examples.Log;
import weibo4j.model.Comment;
import weibo4j.model.WeiboException;

public class CreateComment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String access_token = args[0];
		Weibo weibo = new Weibo();
		weibo.setToken(access_token);
		String comments = args[1];
		String id = args[2];
		Comments cm = new Comments();
		try {
			Comment comment = cm.createComment(comments, id);
			Log.logInfo(comment.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
