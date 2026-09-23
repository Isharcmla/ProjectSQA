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
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_364627238147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4621;
     Object term4673;
     Object term28563;
     Object term28559;

    public Element_getElementsByIndexGreaterThan_364627238147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4644 = new ArrayList();
        LinkedHashMap term4649 = new LinkedHashMap();
        term4621 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4622 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4648 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4622, term4622.getClass(), "tagName", "QSrDQfEsTR");
        setBooleanField(term4622, term4622.getClass(), "isBlock", false);
        setBooleanField(term4622, term4622.getClass(), "formatAsBlock", false);
        setBooleanField(term4622, term4622.getClass(), "canContainBlock", true);
        setBooleanField(term4622, term4622.getClass(), "canContainInline", false);
        setBooleanField(term4622, term4622.getClass(), "empty", true);
        setBooleanField(term4622, term4622.getClass(), "selfClosing", false);
        setBooleanField(term4622, term4622.getClass(), "preserveWhitespace", false);
        setBooleanField(term4622, term4622.getClass(), "formList", true);
        setBooleanField(term4622, term4622.getClass(), "formSubmit", true);
        setField(term4621, term4621.getClass(), "tag", term4622);
        setField(term4621, term4621.getClass(), "parentNode", null);
        setField(term4621, term4621.getClass(), "childNodes", term4644);
        setField(term4648, term4648.getClass(), "attributes", term4649);
        setField(term4621, term4621.getClass(), "attributes", term4648);
        setField(term4621, term4621.getClass(), "baseUri", "WxYUTuqmIq");
        setIntField(term4621, term4621.getClass(), "siblingIndex", -1034506028);
        term4673 = new Integer(-1263114719);
        ArrayList term28566 = new ArrayList();
        LinkedHashMap term28569 = new LinkedHashMap();
        term28563 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28564 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28568 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28564, term28564.getClass(), "tagName", "");
        setBooleanField(term28564, term28564.getClass(), "isBlock", false);
        setBooleanField(term28564, term28564.getClass(), "formatAsBlock", false);
        setBooleanField(term28564, term28564.getClass(), "canContainBlock", true);
        setBooleanField(term28564, term28564.getClass(), "canContainInline", false);
        setBooleanField(term28564, term28564.getClass(), "empty", true);
        setBooleanField(term28564, term28564.getClass(), "selfClosing", false);
        setBooleanField(term28564, term28564.getClass(), "preserveWhitespace", false);
        setBooleanField(term28564, term28564.getClass(), "formList", true);
        setBooleanField(term28564, term28564.getClass(), "formSubmit", true);
        setField(term28563, term28563.getClass(), "tag", term28564);
        setField(term28563, term28563.getClass(), "parentNode", null);
        setField(term28563, term28563.getClass(), "childNodes", term28566);
        setField(term28568, term28568.getClass(), "attributes", term28569);
        setField(term28563, term28563.getClass(), "attributes", term28568);
        setField(term28563, term28563.getClass(), "baseUri", "WxYUTuqmIq");
        setIntField(term28563, term28563.getClass(), "siblingIndex", -1034506028);
        ArrayList term28271 = new ArrayList();
        LinkedHashMap term28276 = new LinkedHashMap();
        term28559 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term28560 = (Object[]) newArray("java.lang.Object", 10);
        Object term28259 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28260 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28275 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28260, term28260.getClass(), "tagName", "");
        setBooleanField(term28260, term28260.getClass(), "isBlock", false);
        setBooleanField(term28260, term28260.getClass(), "formatAsBlock", false);
        setBooleanField(term28260, term28260.getClass(), "canContainBlock", true);
        setBooleanField(term28260, term28260.getClass(), "canContainInline", false);
        setBooleanField(term28260, term28260.getClass(), "empty", true);
        setBooleanField(term28260, term28260.getClass(), "selfClosing", false);
        setBooleanField(term28260, term28260.getClass(), "preserveWhitespace", false);
        setBooleanField(term28260, term28260.getClass(), "formList", true);
        setBooleanField(term28260, term28260.getClass(), "formSubmit", true);
        setField(term28259, term28259.getClass(), "tag", term28260);
        setField(term28259, term28259.getClass(), "parentNode", null);
        setField(term28259, term28259.getClass(), "childNodes", term28271);
        setField(term28275, term28275.getClass(), "attributes", term28276);
        setField(term28259, term28259.getClass(), "attributes", term28275);
        setField(term28259, term28259.getClass(), "baseUri", "WxYUTuqmIq");
        setIntField(term28259, term28259.getClass(), "siblingIndex", -1034506028);
        setElement(term28560, 0, term28259);
        setField(term28559, term28559.getClass(), "elementData", term28560);
        setIntField(term28559, term28559.getClass(), "size", 1);
        setIntField(term28559, term28559.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4673;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term4621, args);
        assertTrue(recursiveEquals(term4621, term28563));
        assertTrue(recursiveEquals(term4673, -1263114719));
        assertTrue(recursiveEquals(retValue, term28559));
    }

};


