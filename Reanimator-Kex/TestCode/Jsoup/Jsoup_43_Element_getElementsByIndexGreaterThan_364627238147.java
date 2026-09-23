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
     Object term28388;
     Object term28384;

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
        ArrayList term28391 = new ArrayList();
        LinkedHashMap term28394 = new LinkedHashMap();
        term28388 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28389 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28393 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28389, term28389.getClass(), "tagName", "");
        setBooleanField(term28389, term28389.getClass(), "isBlock", false);
        setBooleanField(term28389, term28389.getClass(), "formatAsBlock", false);
        setBooleanField(term28389, term28389.getClass(), "canContainBlock", true);
        setBooleanField(term28389, term28389.getClass(), "canContainInline", false);
        setBooleanField(term28389, term28389.getClass(), "empty", true);
        setBooleanField(term28389, term28389.getClass(), "selfClosing", false);
        setBooleanField(term28389, term28389.getClass(), "preserveWhitespace", false);
        setBooleanField(term28389, term28389.getClass(), "formList", true);
        setBooleanField(term28389, term28389.getClass(), "formSubmit", true);
        setField(term28388, term28388.getClass(), "tag", term28389);
        setField(term28388, term28388.getClass(), "parentNode", null);
        setField(term28388, term28388.getClass(), "childNodes", term28391);
        setField(term28393, term28393.getClass(), "attributes", term28394);
        setField(term28388, term28388.getClass(), "attributes", term28393);
        setField(term28388, term28388.getClass(), "baseUri", "WxYUTuqmIq");
        setIntField(term28388, term28388.getClass(), "siblingIndex", -1034506028);
        ArrayList term28096 = new ArrayList();
        LinkedHashMap term28101 = new LinkedHashMap();
        term28384 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term28385 = (Object[]) newArray("java.lang.Object", 10);
        Object term28084 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28100 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28085, term28085.getClass(), "tagName", "");
        setBooleanField(term28085, term28085.getClass(), "isBlock", false);
        setBooleanField(term28085, term28085.getClass(), "formatAsBlock", false);
        setBooleanField(term28085, term28085.getClass(), "canContainBlock", true);
        setBooleanField(term28085, term28085.getClass(), "canContainInline", false);
        setBooleanField(term28085, term28085.getClass(), "empty", true);
        setBooleanField(term28085, term28085.getClass(), "selfClosing", false);
        setBooleanField(term28085, term28085.getClass(), "preserveWhitespace", false);
        setBooleanField(term28085, term28085.getClass(), "formList", true);
        setBooleanField(term28085, term28085.getClass(), "formSubmit", true);
        setField(term28084, term28084.getClass(), "tag", term28085);
        setField(term28084, term28084.getClass(), "parentNode", null);
        setField(term28084, term28084.getClass(), "childNodes", term28096);
        setField(term28100, term28100.getClass(), "attributes", term28101);
        setField(term28084, term28084.getClass(), "attributes", term28100);
        setField(term28084, term28084.getClass(), "baseUri", "WxYUTuqmIq");
        setIntField(term28084, term28084.getClass(), "siblingIndex", -1034506028);
        setElement(term28385, 0, term28084);
        setField(term28384, term28384.getClass(), "elementData", term28385);
        setIntField(term28384, term28384.getClass(), "size", 1);
        setIntField(term28384, term28384.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4673;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term4621, args);
        assertTrue(recursiveEquals(term4621, term28388));
        assertTrue(recursiveEquals(term4673, -1263114719));
        assertTrue(recursiveEquals(retValue, term28384));
    }

};


