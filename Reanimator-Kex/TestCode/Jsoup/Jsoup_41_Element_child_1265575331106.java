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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_child_1265575331106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term922;
     Object term974;

    public Element_child_1265575331106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term945 = new ArrayList();
        ((ArrayList) term945).add((Object)null);
        ((ArrayList) term945).add((Object)null);
        ((ArrayList) term945).add((Object)null);
        ((ArrayList) term945).add((Object)null);
        ((ArrayList) term945).add((Object)null);
        LinkedHashMap term950 = new LinkedHashMap();
        term922 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term923 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term949 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term923, term923.getClass(), "tagName", "uWHnvSvaPl");
        setBooleanField(term923, term923.getClass(), "isBlock", true);
        setBooleanField(term923, term923.getClass(), "formatAsBlock", false);
        setBooleanField(term923, term923.getClass(), "canContainBlock", false);
        setBooleanField(term923, term923.getClass(), "canContainInline", false);
        setBooleanField(term923, term923.getClass(), "empty", false);
        setBooleanField(term923, term923.getClass(), "selfClosing", false);
        setBooleanField(term923, term923.getClass(), "preserveWhitespace", false);
        setBooleanField(term923, term923.getClass(), "formList", false);
        setBooleanField(term923, term923.getClass(), "formSubmit", false);
        setField(term922, term922.getClass(), "tag", term923);
        setField(term922, term922.getClass(), "parentNode", null);
        setField(term922, term922.getClass(), "childNodes", term945);
        setField(term949, term949.getClass(), "attributes", term950);
        setField(term922, term922.getClass(), "attributes", term949);
        setField(term922, term922.getClass(), "baseUri", "bLPjGVBhlX");
        setIntField(term922, term922.getClass(), "siblingIndex", -522618178);
        term974 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term974;
        try {
            callMethod(klass, "child", argTypes, term922, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


