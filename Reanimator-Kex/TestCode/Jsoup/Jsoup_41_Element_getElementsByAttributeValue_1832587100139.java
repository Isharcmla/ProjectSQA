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

public class Element_getElementsByAttributeValue_1832587100139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3612;
     Object term23813;
     Object term23809;

    public Element_getElementsByAttributeValue_1832587100139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3635 = new ArrayList();
        LinkedHashMap term3640 = new LinkedHashMap();
        term3612 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3613 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3639 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3613, term3613.getClass(), "tagName", "qYzsiuXOgS");
        setBooleanField(term3613, term3613.getClass(), "isBlock", false);
        setBooleanField(term3613, term3613.getClass(), "formatAsBlock", true);
        setBooleanField(term3613, term3613.getClass(), "canContainBlock", false);
        setBooleanField(term3613, term3613.getClass(), "canContainInline", false);
        setBooleanField(term3613, term3613.getClass(), "empty", false);
        setBooleanField(term3613, term3613.getClass(), "selfClosing", false);
        setBooleanField(term3613, term3613.getClass(), "preserveWhitespace", false);
        setBooleanField(term3613, term3613.getClass(), "formList", false);
        setBooleanField(term3613, term3613.getClass(), "formSubmit", true);
        setField(term3612, term3612.getClass(), "tag", term3613);
        setField(term3612, term3612.getClass(), "parentNode", null);
        setField(term3612, term3612.getClass(), "childNodes", term3635);
        setField(term3639, term3639.getClass(), "attributes", term3640);
        setField(term3612, term3612.getClass(), "attributes", term3639);
        setField(term3612, term3612.getClass(), "baseUri", "WZzvmIHhzZ");
        setIntField(term3612, term3612.getClass(), "siblingIndex", -1968847291);
        ArrayList term23817 = new ArrayList();
        LinkedHashMap term23820 = new LinkedHashMap();
        term23813 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23814 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23819 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23814, term23814.getClass(), "tagName", "qYzsiuXOgS");
        setBooleanField(term23814, term23814.getClass(), "isBlock", false);
        setBooleanField(term23814, term23814.getClass(), "formatAsBlock", true);
        setBooleanField(term23814, term23814.getClass(), "canContainBlock", false);
        setBooleanField(term23814, term23814.getClass(), "canContainInline", false);
        setBooleanField(term23814, term23814.getClass(), "empty", false);
        setBooleanField(term23814, term23814.getClass(), "selfClosing", false);
        setBooleanField(term23814, term23814.getClass(), "preserveWhitespace", false);
        setBooleanField(term23814, term23814.getClass(), "formList", false);
        setBooleanField(term23814, term23814.getClass(), "formSubmit", true);
        setField(term23813, term23813.getClass(), "tag", term23814);
        setField(term23813, term23813.getClass(), "parentNode", null);
        setField(term23813, term23813.getClass(), "childNodes", term23817);
        setField(term23819, term23819.getClass(), "attributes", term23820);
        setField(term23813, term23813.getClass(), "attributes", term23819);
        setField(term23813, term23813.getClass(), "baseUri", "WZzvmIHhzZ");
        setIntField(term23813, term23813.getClass(), "siblingIndex", -1968847291);
        term23809 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term23810 = (Object[]) newArray("java.lang.Object", 0);
        setField(term23809, term23809.getClass(), "elementData", term23810);
        setIntField(term23809, term23809.getClass(), "size", 0);
        setIntField(term23809, term23809.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "doQLHkjpNm";
        args[1] = "lCyLIcSuom";
        Object retValue = callMethod(klass, "getElementsByAttributeValue", argTypes, term3612, args);
        assertTrue(recursiveEquals(term3612, term23813));
        assertTrue(recursiveEquals(retValue, term23809));
    }

};


