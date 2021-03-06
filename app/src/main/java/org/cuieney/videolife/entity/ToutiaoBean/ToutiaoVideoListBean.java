package org.cuieney.videolife.entity.ToutiaoBean;

import java.util.List;

/**
 * Created by daimaren on 2017/10/12
 * 975808394@qq.com
 */

public class ToutiaoVideoListBean {

	/**
	 * login_status : 0
	 * total_number : 15
	 * has_more : true
	 * post_content_hint : 分享今日新鲜事
	 * show_et_status : 0
	 * feed_flag : 0
	 * action_to_last_stick : 1
	 * message : success
	 * has_more_to_refresh : true
	 * tips : {"display_info":"今日头条推荐引擎有15条更新","open_url":"","web_url":"","app_name":"今日头条","package_name":"","display_template":"今日头条推荐引擎有%s条更新","type":"app","display_duration":2,"download_url":""}
	 */

	private int login_status;
	private int total_number;
	private boolean has_more;
	private String post_content_hint;
	private int show_et_status;
	private int feed_flag;
	private int action_to_last_stick;
	private String message;
	private boolean has_more_to_refresh;
	private TipsBean tips;
	private List<ToutiaoItemListBean> data;

	public int getLogin_status() {
		return login_status;
	}

	public void setLogin_status(int login_status) {
		this.login_status = login_status;
	}

	public int getTotal_number() {
		return total_number;
	}

	public void setTotal_number(int total_number) {
		this.total_number = total_number;
	}

	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public String getPost_content_hint() {
		return post_content_hint;
	}

	public void setPost_content_hint(String post_content_hint) {
		this.post_content_hint = post_content_hint;
	}

	public int getShow_et_status() {
		return show_et_status;
	}

	public void setShow_et_status(int show_et_status) {
		this.show_et_status = show_et_status;
	}

	public int getFeed_flag() {
		return feed_flag;
	}

	public void setFeed_flag(int feed_flag) {
		this.feed_flag = feed_flag;
	}

	public int getAction_to_last_stick() {
		return action_to_last_stick;
	}

	public void setAction_to_last_stick(int action_to_last_stick) {
		this.action_to_last_stick = action_to_last_stick;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isHas_more_to_refresh() {
		return has_more_to_refresh;
	}

	public void setHas_more_to_refresh(boolean has_more_to_refresh) {
		this.has_more_to_refresh = has_more_to_refresh;
	}

	public TipsBean getTips() {
		return tips;
	}

	public void setTips(TipsBean tips) {
		this.tips = tips;
	}

	public List<ToutiaoItemListBean> getItemList() {
		return data;
	}

	public void setData(List<ToutiaoItemListBean> data) {
		this.data = data;
	}

	public static class TipsBean {
		/**
		 * display_info : 今日头条推荐引擎有15条更新
		 * open_url :
		 * web_url :
		 * app_name : 今日头条
		 * package_name :
		 * display_template : 今日头条推荐引擎有%s条更新
		 * type : app
		 * display_duration : 2
		 * download_url :
		 */

		private String display_info;
		private String open_url;
		private String web_url;
		private String app_name;
		private String package_name;
		private String display_template;
		private String type;
		private int display_duration;
		private String download_url;

		public String getDisplay_info() {
			return display_info;
		}

		public void setDisplay_info(String display_info) {
			this.display_info = display_info;
		}

		public String getOpen_url() {
			return open_url;
		}

		public void setOpen_url(String open_url) {
			this.open_url = open_url;
		}

		public String getWeb_url() {
			return web_url;
		}

		public void setWeb_url(String web_url) {
			this.web_url = web_url;
		}

		public String getApp_name() {
			return app_name;
		}

		public void setApp_name(String app_name) {
			this.app_name = app_name;
		}

		public String getPackage_name() {
			return package_name;
		}

		public void setPackage_name(String package_name) {
			this.package_name = package_name;
		}

		public String getDisplay_template() {
			return display_template;
		}

		public void setDisplay_template(String display_template) {
			this.display_template = display_template;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getDisplay_duration() {
			return display_duration;
		}

		public void setDisplay_duration(int display_duration) {
			this.display_duration = display_duration;
		}

		public String getDownload_url() {
			return download_url;
		}

		public void setDownload_url(String download_url) {
			this.download_url = download_url;
		}
	}
}
