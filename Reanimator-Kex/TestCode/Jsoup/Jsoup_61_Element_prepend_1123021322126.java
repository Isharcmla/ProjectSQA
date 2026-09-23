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
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prepend_1123021322126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;

    public Element_prepend_1123021322126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2203 = new ArrayList();
        ((ArrayList) term2203).add((Object)null);
        ((ArrayList) term2203).add((Object)null);
        ((ArrayList) term2203).add((Object)null);
        LinkedHashMap term2208 = new LinkedHashMap();
        term2181 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2182 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2207 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2182, term2182.getClass(), "tagName", "XkIoWJRNwN");
        setBooleanField(term2182, term2182.getClass(), "isBlock", false);
        setBooleanField(term2182, term2182.getClass(), "formatAsBlock", true);
        setBooleanField(term2182, term2182.getClass(), "canContainInline", true);
        setBooleanField(term2182, term2182.getClass(), "empty", true);
        setBooleanField(term2182, term2182.getClass(), "selfClosing", true);
        setBooleanField(term2182, term2182.getClass(), "preserveWhitespace", true);
        setBooleanField(term2182, term2182.getClass(), "formList", false);
        setBooleanField(term2182, term2182.getClass(), "formSubmit", false);
        setField(term2181, term2181.getClass(), "tag", term2182);
        setField(term2181, term2181.getClass(), "parentNode", null);
        setField(term2181, term2181.getClass(), "childNodes", term2203);
        setField(term2207, term2207.getClass(), "attributes", term2208);
        setField(term2181, term2181.getClass(), "attributes", term2207);
        setField(term2181, term2181.getClass(), "baseUri", "HWkpTmtlrc");
        setIntField(term2181, term2181.getClass(), "siblingIndex", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        try {
            callMethod(klass, "prepend", argTypes, term2181, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


