
package com.ibm.watson.developer_cloud.language_translation.v2.model;

import com.google.gson.annotations.Expose;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;

/**
 * The Translation result used as POJO by the {@link LanguageTranslation}
 *
 * @author German Attanasio Ruiz <germanatt@us.ibm.com>
 */
public class Translation {

    /** The translation. */
    @Expose
    private String translation;

    /**
     * Gets the translation.
     *
     * @return     The translation
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the translation.
     *
     * @param translation     The translation
     */
    public void setTranslation(String translation) {
        this.translation = translation;
    }

    /**
     * With translation.
     *
     * @param translation the translation
     * @return the translation
     */
    public Translation withTranslation(String translation) {
        this.translation = translation;
        return this;
    }

}
