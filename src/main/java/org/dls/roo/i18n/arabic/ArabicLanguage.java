package org.dls.roo.i18n.arabic;

import java.io.InputStream;
import java.util.Locale;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.addon.web.mvc.jsp.i18n.AbstractLanguage;
import org.springframework.roo.support.util.FileUtils;

/** 
 * Arabic language support.
 *
 */
@Component(immediate = true)
@Service
public class ArabicLanguage extends AbstractLanguage {

    public Locale getLocale() {
        return new Locale("ar");
    }
    
    public String getLanguage() {
        return "Arabic";
    }

    public InputStream getFlagGraphic() {
        return FileUtils.getInputStream(getClass(), "arabic.png");
    }

    public InputStream getMessageBundle() {
        return FileUtils.getInputStream(getClass(), "messages_ar.properties");
    }
}
