package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;

/** =====================================================
 * Info about Asterisk status
 * 
 * Defined in file :asterisk.json
 * ====================================================== */
public class StatusInfo_impl_ari_0_0_1 implements StatusInfo, java.io.Serializable {
  /**  Time when Asterisk was last reloaded.  */
  private Date last_reload_time;
 public Date getLast_reload_time() {
   return last_reload_time;
 }

 public void setLast_reload_time(Date val ) {
   last_reload_time = val;
 }

  /**  Time when Asterisk was started.  */
  private Date startup_time;
 public Date getStartup_time() {
   return startup_time;
 }

 public void setStartup_time(Date val ) {
   startup_time = val;
 }

}

