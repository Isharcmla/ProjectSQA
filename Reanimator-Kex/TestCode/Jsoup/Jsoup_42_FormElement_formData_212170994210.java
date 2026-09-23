package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FormElement_formData_212170994210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term2431;
     Object term2376;

    public FormElement_formData_212170994210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term407 = new ArrayList();
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        ((ArrayList) term407).add((Object)null);
        LinkedHashMap term412 = new LinkedHashMap();
        term380 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term381 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term382 = (Object[]) newArray("java.lang.Object", 0);
        Object term385 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term411 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term381, term381.getClass(), "elementData", term382);
        setIntField(term381, term381.getClass(), "size", 0);
        setIntField(term381, term381.getClass(), "modCount", 0);
        setField(term380, term380.getClass(), "elements", term381);
        setField(term385, term385.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term385, term385.getClass(), "isBlock", true);
        setBooleanField(term385, term385.getClass(), "formatAsBlock", true);
        setBooleanField(term385, term385.getClass(), "canContainBlock", true);
        setBooleanField(term385, term385.getClass(), "canContainInline", false);
        setBooleanField(term385, term385.getClass(), "empty", true);
        setBooleanField(term385, term385.getClass(), "selfClosing", false);
        setBooleanField(term385, term385.getClass(), "preserveWhitespace", false);
        setBooleanField(term385, term385.getClass(), "formList", true);
        setBooleanField(term385, term385.getClass(), "formSubmit", false);
        setField(term380, term380.getClass(), "tag", term385);
        setField(term380, term380.getClass(), "parentNode", null);
        setField(term380, term380.getClass(), "childNodes", term407);
        setField(term411, term411.getClass(), "attributes", term412);
        setField(term380, term380.getClass(), "attributes", term411);
        setField(term380, term380.getClass(), "baseUri", "TEParAifyi");
        setIntField(term380, term380.getClass(), "siblingIndex", -1922583790);
        ArrayList term2437 = new ArrayList();
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        ((ArrayList) term2437).add((Object)null);
        LinkedHashMap term2440 = new LinkedHashMap();
        term2431 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term2432 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term2433 = (Object[]) newArray("java.lang.Object", 0);
        Object term2434 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2439 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2432, term2432.getClass(), "elementData", term2433);
        setIntField(term2432, term2432.getClass(), "size", 0);
        setIntField(term2432, term2432.getClass(), "modCount", 0);
        setField(term2431, term2431.getClass(), "elements", term2432);
        setField(term2434, term2434.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term2434, term2434.getClass(), "isBlock", true);
        setBooleanField(term2434, term2434.getClass(), "formatAsBlock", true);
        setBooleanField(term2434, term2434.getClass(), "canContainBlock", true);
        setBooleanField(term2434, term2434.getClass(), "canContainInline", false);
        setBooleanField(term2434, term2434.getClass(), "empty", true);
        setBooleanField(term2434, term2434.getClass(), "selfClosing", false);
        setBooleanField(term2434, term2434.getClass(), "preserveWhitespace", false);
        setBooleanField(term2434, term2434.getClass(), "formList", true);
        setBooleanField(term2434, term2434.getClass(), "formSubmit", false);
        setField(term2431, term2431.getClass(), "tag", term2434);
        setField(term2431, term2431.getClass(), "parentNode", null);
        setField(term2431, term2431.getClass(), "childNodes", term2437);
        setField(term2439, term2439.getClass(), "attributes", term2440);
        setField(term2431, term2431.getClass(), "attributes", term2439);
        setField(term2431, term2431.getClass(), "baseUri", "TEParAifyi");
        setIntField(term2431, term2431.getClass(), "siblingIndex", -1922583790);
        term2376 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "formData", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term2431));
        assertTrue(recursiveEquals(retValue, term2376));
    }

};


