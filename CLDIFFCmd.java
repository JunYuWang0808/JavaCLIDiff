public class CLDIFFCmd {
  public int keyDownEvent (int wParam, int lParam) {
  
       switch (wParam) {
         case OS.VK_SPACE:
         case OS.VK_RETURN:
         Event event = new Event ();
         
         event.item = focusItem;
         sendEvent(focusItem.expanded ? COLLAPSE:EXPAND, event);
         refreshItem(focusItem);
       }
  }
  
  
 public int keyReleaseEvent (int wParam, int lParam) {
  
   switch (wParam) {
     case OS.GDK_RETURN:
     case OS.GDK_SPACE:
     Event ev = new Event ();
     ev.item = focusItem;
     sendEvent(focusItem.expanded ? COLLAPSE:EXPAND, ev);
     refreshItem(focusItem);
   }
  }
  
 public int buttonUpEvent (int wParam, int lParam) {
   
   if (lParam == HOVER) {
   Event bEvent = new Event ();
   bEvent.item = focusItem;
   sendEvent(focusItem.expanded ? EXPAND:COLLAPSE, bEvent);
   refreshItem(focusItem);
   }
  }
  
  
  

    public static void main(String args[]){
        
    }
}
