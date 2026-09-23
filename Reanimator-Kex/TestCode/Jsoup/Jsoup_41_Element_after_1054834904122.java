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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_after_1054834904122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2184;

    public Element_after_1054834904122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2207 = new ArrayList();
        ((ArrayList) term2207).add((Object)null);
        ((ArrayList) term2207).add((Object)null);
        ((ArrayList) term2207).add((Object)null);
        LinkedHashMap term2212 = new LinkedHashMap();
        term2184 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2185 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2211 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2185, term2185.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term2185, term2185.getClass(), "isBlock", false);
        setBooleanField(term2185, term2185.getClass(), "formatAsBlock", false);
        setBooleanField(term2185, term2185.getClass(), "canContainBlock", false);
        setBooleanField(term2185, term2185.getClass(), "canContainInline", false);
        setBooleanField(term2185, term2185.getClass(), "empty", true);
        setBooleanField(term2185, term2185.getClass(), "selfClosing", false);
        setBooleanField(term2185, term2185.getClass(), "preserveWhitespace", false);
        setBooleanField(term2185, term2185.getClass(), "formList", true);
        setBooleanField(term2185, term2185.getClass(), "formSubmit", true);
        setField(term2184, term2184.getClass(), "tag", term2185);
        setField(term2184, term2184.getClass(), "parentNode", null);
        setField(term2184, term2184.getClass(), "childNodes", term2207);
        setField(term2211, term2211.getClass(), "attributes", term2212);
        setField(term2184, term2184.getClass(), "attributes", term2211);
        setField(term2184, term2184.getClass(), "baseUri", "PtirvZmsGt");
        setIntField(term2184, term2184.getClass(), "siblingIndex", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        try {
            callMethod(klass, "after", argTypes, term2184, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


