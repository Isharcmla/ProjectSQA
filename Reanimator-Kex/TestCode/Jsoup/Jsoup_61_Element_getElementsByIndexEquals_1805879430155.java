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

public class Element_getElementsByIndexEquals_1805879430155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4862;
     Object term4913;
     Object term30406;
     Object term30402;

    public Element_getElementsByIndexEquals_1805879430155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4884 = new ArrayList();
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        ((ArrayList) term4884).add((Object)null);
        LinkedHashMap term4889 = new LinkedHashMap();
        term4862 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4863 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4888 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4863, term4863.getClass(), "tagName", "pumvwBWvpy");
        setBooleanField(term4863, term4863.getClass(), "isBlock", true);
        setBooleanField(term4863, term4863.getClass(), "formatAsBlock", false);
        setBooleanField(term4863, term4863.getClass(), "canContainInline", true);
        setBooleanField(term4863, term4863.getClass(), "empty", false);
        setBooleanField(term4863, term4863.getClass(), "selfClosing", true);
        setBooleanField(term4863, term4863.getClass(), "preserveWhitespace", false);
        setBooleanField(term4863, term4863.getClass(), "formList", false);
        setBooleanField(term4863, term4863.getClass(), "formSubmit", true);
        setField(term4862, term4862.getClass(), "tag", term4863);
        setField(term4862, term4862.getClass(), "parentNode", null);
        setField(term4862, term4862.getClass(), "childNodes", term4884);
        setField(term4888, term4888.getClass(), "attributes", term4889);
        setField(term4862, term4862.getClass(), "attributes", term4888);
        setField(term4862, term4862.getClass(), "baseUri", "hePqROaplw");
        setIntField(term4862, term4862.getClass(), "siblingIndex", -505439934);
        term4913 = new Integer(-344842608);
        ArrayList term30410 = new ArrayList();
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        ((ArrayList) term30410).add((Object)null);
        LinkedHashMap term30413 = new LinkedHashMap();
        term30406 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30407 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30412 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term30407, term30407.getClass(), "tagName", "pumvwBWvpy");
        setBooleanField(term30407, term30407.getClass(), "isBlock", true);
        setBooleanField(term30407, term30407.getClass(), "formatAsBlock", false);
        setBooleanField(term30407, term30407.getClass(), "canContainInline", true);
        setBooleanField(term30407, term30407.getClass(), "empty", false);
        setBooleanField(term30407, term30407.getClass(), "selfClosing", true);
        setBooleanField(term30407, term30407.getClass(), "preserveWhitespace", false);
        setBooleanField(term30407, term30407.getClass(), "formList", false);
        setBooleanField(term30407, term30407.getClass(), "formSubmit", true);
        setField(term30406, term30406.getClass(), "tag", term30407);
        setField(term30406, term30406.getClass(), "parentNode", null);
        setField(term30406, term30406.getClass(), "childNodes", term30410);
        setField(term30412, term30412.getClass(), "attributes", term30413);
        setField(term30406, term30406.getClass(), "attributes", term30412);
        setField(term30406, term30406.getClass(), "baseUri", "hePqROaplw");
        setIntField(term30406, term30406.getClass(), "siblingIndex", -505439934);
        term30402 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term30403 = (Object[]) newArray("java.lang.Object", 0);
        setField(term30402, term30402.getClass(), "elementData", term30403);
        setIntField(term30402, term30402.getClass(), "size", 0);
        setIntField(term30402, term30402.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4913;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term4862, args);
        assertTrue(recursiveEquals(term4862, term30406));
        assertTrue(recursiveEquals(term4913, -344842608));
        assertTrue(recursiveEquals(retValue, term30402));
    }

};


