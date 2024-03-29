package distributor;

public class ServerResult {
  private Integer m_computedResult = null;
  private Exception m_failure = null;

  public ServerResult() {}

  public void setResult(Integer i) {
    this.m_computedResult = i;
  }

  public void setFailure(Exception e) {
    this.m_failure = e;
  }

  public Integer getResult() {return this.m_computedResult;}
  public Exception getFailure() {return this.m_failure;}
}
