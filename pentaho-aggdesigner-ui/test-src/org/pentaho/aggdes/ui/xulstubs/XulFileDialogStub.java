/*
 * This program is free software; you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License, version 2 as published by the Free Software 
 * Foundation.
 *
 * You should have received a copy of the GNU General Public License along with this 
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/gpl-2.0.html 
 * or from the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 *
 * Copyright 2008 Pentaho Corporation.  All rights reserved. 
*/
package org.pentaho.aggdes.ui.xulstubs;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.pentaho.ui.xul.XulComponent;
import org.pentaho.ui.xul.XulDomException;
import org.pentaho.ui.xul.components.XulFileDialog;
import org.pentaho.ui.xul.dom.Attribute;
import org.pentaho.ui.xul.dom.Document;
import org.pentaho.ui.xul.dom.Element;
import org.pentaho.ui.xul.dom.Namespace;

public class XulFileDialogStub implements XulFileDialog {

  public static List<XulFileDialog> openedFileDialogs = new ArrayList<XulFileDialog>();
  public static RETURN_CODE returnCode = RETURN_CODE.OK;
  public static File returnFile = null;
  
  String dialogType;
  
  public File getFile() { return returnFile; }
  public File[] getFiles() { return null; }
  public SEL_TYPE getSelectionMode() { return null; }
  public VIEW_TYPE getViewType() { return null; }
  public void setSelectionMode(SEL_TYPE type) {}
  public void setViewType(VIEW_TYPE type) {}
  public RETURN_CODE showOpenDialog() {
    dialogType="open";
    openedFileDialogs.add(this);
    return returnCode;
  }
  public RETURN_CODE showOpenDialog(File f) {
    dialogType="open";
    openedFileDialogs.add(this);
    return returnCode;
  }
  public RETURN_CODE showSaveDialog() { 
    dialogType="save";
    openedFileDialogs.add(this);
    return returnCode;
  }
  public RETURN_CODE showSaveDialog(File f) {
    dialogType="save";
    openedFileDialogs.add(this);
    return returnCode;
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) { }
  public int getFlex() { return 0; }
  public int getHeight() { return 0; }
  public String getID() { return null; }
  public String getId() { return null; }
  public Object getManagedObject() { return null; }
  public String getName() { return null; }
  public int getWidth() { return 0; }
  public boolean isDisabled() { return false; }
  public void removePropertyChangeListener(PropertyChangeListener listener) {}
  public void setDisabled(boolean disabled) {}
  public void setFlex(int flex) {}
  public void setHeight(int height) {}
  public void setID(String id) {}
  public void setId(String id) {}
  public void setOnblur(String method) {}
  public void setWidth(int width) {}
  public void addChild(Element element) {}
  public void addChildAt(Element element, int idx) {}
  public String getAttributeValue(String attributeName) { return null; }
  public List<Attribute> getAttributes() { return null; }
  public List<XulComponent> getChildNodes() { return null; }
  public Document getDocument() { return null; }
  public XulComponent getElementById(String id) { return null; }
  public XulComponent getElementByXPath(String path) { return null; }
  public Object getElementObject() { return null; }
  public List<XulComponent> getElementsByTagName(String tagName) { return null; }
  public XulComponent getFirstChild() { return null; }
  public Namespace getNamespace() { return null; }
  public XulComponent getParent() { return null; }
  public String getText() { return null; }
  public void removeChild(Element element) {}
  public void replaceChild(XulComponent oldElement, XulComponent newElement) throws XulDomException {}
  public void setAttribute(Attribute attribute) {}
  public void setAttribute(String name, String value) {}
  public void setAttributes(List<Attribute> attribute) {}
  public void setNamespace(String prefix, String uri) {}
  public String getTooltiptext() {return null;}
  public void setTooltiptext(String tooltip) {}
  public String getBgcolor() {return null;}
  public void setBgcolor(String bgcolor) {}
  public int getPadding() {return -1;}
  public void setPadding(int padding) {}
  public void setModalParent(Object parent) {}
  public String getOnblur() {return null;}
  public RETURN_CODE showOpenDialog(Object f) {
    dialogType="open";
    openedFileDialogs.add(this);
    return RETURN_CODE.OK;
      
  }
  public RETURN_CODE showSaveDialog(Object f) {
    dialogType="save";
    openedFileDialogs.add(this);
    return RETURN_CODE.OK;
  }
  public void adoptAttributes(XulComponent component) {
    
        // TODO Auto-generated method stub 
      
  }
  public String getInsertafter() {
    return null;  
  }
  public String getInsertbefore() {
    return null;  
  }
  public int getPosition() {
    return 0;
  }
  public boolean getRemoveelement() {
    return false;
  }
  public boolean isVisible() {
    return true;  
  }
  public void setInsertafter(String id) {
    
        // TODO Auto-generated method stub 
      
  }
  public void setInsertbefore(String id) {
    
        // TODO Auto-generated method stub 
      
  }
  public void setPosition(int pos) {
    
        // TODO Auto-generated method stub 
      
  }
  public void setRemoveelement(boolean flag) {
    
        // TODO Auto-generated method stub 
      
  }
  public void setVisible(boolean visible) {
    
        // TODO Auto-generated method stub 
      
  }
  public void onDomReady() {
    // TODO Auto-generated method stub
    
  }

  public String getAlign() {
    return null;
  }

  public void setAlign(String align) {
    
  }
}
