package org.exoplatform.blog;

import org.exoplatform.com.blog.service.rest.BlogServiceRest;

import javax.ws.rs.core.Response;

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Aug 7, 2014
 */
public class TestBlogServiceRest extends TestBlog {
  private BlogServiceRest restService;

  public void setUp() throws Exception {
    super.setUp();
    restService = (BlogServiceRest)
            this.container.getComponentInstanceOfType(BlogServiceRest.class);
//    this.binder.addResource(restService, null);
  }

  public void testGetBlogByMonth() throws Exception {
    System.out.println("-------------getBlogByMonth-------------");
    Response response = restService.getBlogs(2014, 7);
    System.out.println(response.getEntity());
  }

  public void tearDown() throws Exception {
    super.tearDown();
  }
}
