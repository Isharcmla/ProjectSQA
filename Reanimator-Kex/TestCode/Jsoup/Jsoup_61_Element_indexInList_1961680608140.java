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
import java.util.LinkedList;

public class Element_indexInList_1961680608140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3263;
     Object term3314;
     Object term22062;
     Object term22072;

    public Element_indexInList_1961680608140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3285 = new ArrayList();
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        ((ArrayList) term3285).add((Object)null);
        LinkedHashMap term3290 = new LinkedHashMap();
        term3263 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3264 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3289 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3264, term3264.getClass(), "tagName", "gUvcueTURF");
        setBooleanField(term3264, term3264.getClass(), "isBlock", false);
        setBooleanField(term3264, term3264.getClass(), "formatAsBlock", true);
        setBooleanField(term3264, term3264.getClass(), "canContainInline", true);
        setBooleanField(term3264, term3264.getClass(), "empty", true);
        setBooleanField(term3264, term3264.getClass(), "selfClosing", false);
        setBooleanField(term3264, term3264.getClass(), "preserveWhitespace", true);
        setBooleanField(term3264, term3264.getClass(), "formList", false);
        setBooleanField(term3264, term3264.getClass(), "formSubmit", true);
        setField(term3263, term3263.getClass(), "tag", term3264);
        setField(term3263, term3263.getClass(), "parentNode", null);
        setField(term3263, term3263.getClass(), "childNodes", term3285);
        setField(term3289, term3289.getClass(), "attributes", term3290);
        setField(term3263, term3263.getClass(), "attributes", term3289);
        setField(term3263, term3263.getClass(), "baseUri", "HBGNxdNURv");
        setIntField(term3263, term3263.getClass(), "siblingIndex", -157887805);
        term3314 = new LinkedList();
        ArrayList term22066 = new ArrayList();
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        ((ArrayList) term22066).add((Object)null);
        LinkedHashMap term22069 = new LinkedHashMap();
        term22062 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22063 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22068 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22063, term22063.getClass(), "tagName", "gUvcueTURF");
        setBooleanField(term22063, term22063.getClass(), "isBlock", false);
        setBooleanField(term22063, term22063.getClass(), "formatAsBlock", true);
        setBooleanField(term22063, term22063.getClass(), "canContainInline", true);
        setBooleanField(term22063, term22063.getClass(), "empty", true);
        setBooleanField(term22063, term22063.getClass(), "selfClosing", false);
        setBooleanField(term22063, term22063.getClass(), "preserveWhitespace", true);
        setBooleanField(term22063, term22063.getClass(), "formList", false);
        setBooleanField(term22063, term22063.getClass(), "formSubmit", true);
        setField(term22062, term22062.getClass(), "tag", term22063);
        setField(term22062, term22062.getClass(), "parentNode", null);
        setField(term22062, term22062.getClass(), "childNodes", term22066);
        setField(term22068, term22068.getClass(), "attributes", term22069);
        setField(term22062, term22062.getClass(), "attributes", term22068);
        setField(term22062, term22062.getClass(), "baseUri", "HBGNxdNURv");
        setIntField(term22062, term22062.getClass(), "siblingIndex", -157887805);
        term22072 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3263;
        args[1] = term3314;
        Object retValue = callMethod(klass, "indexInList", argTypes, null, args);
        assertTrue(recursiveEquals(term3263, term22062));
        assertTrue(recursiveEquals(term3314, term22072));
        assertTrue(recursiveEquals(retValue, null));
    }

};


