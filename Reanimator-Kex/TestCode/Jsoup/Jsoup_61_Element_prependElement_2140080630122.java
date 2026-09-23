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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_prependElement_2140080630122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809;

    public Element_prependElement_2140080630122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1831 = new ArrayList();
        ((ArrayList) term1831).add((Object)null);
        ((ArrayList) term1831).add((Object)null);
        ((ArrayList) term1831).add((Object)null);
        LinkedHashMap term1836 = new LinkedHashMap();
        term1809 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1810 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1835 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1810, term1810.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term1810, term1810.getClass(), "isBlock", false);
        setBooleanField(term1810, term1810.getClass(), "formatAsBlock", true);
        setBooleanField(term1810, term1810.getClass(), "canContainInline", true);
        setBooleanField(term1810, term1810.getClass(), "empty", true);
        setBooleanField(term1810, term1810.getClass(), "selfClosing", true);
        setBooleanField(term1810, term1810.getClass(), "preserveWhitespace", true);
        setBooleanField(term1810, term1810.getClass(), "formList", true);
        setBooleanField(term1810, term1810.getClass(), "formSubmit", false);
        setField(term1809, term1809.getClass(), "tag", term1810);
        setField(term1809, term1809.getClass(), "parentNode", null);
        setField(term1809, term1809.getClass(), "childNodes", term1831);
        setField(term1835, term1835.getClass(), "attributes", term1836);
        setField(term1809, term1809.getClass(), "attributes", term1835);
        setField(term1809, term1809.getClass(), "baseUri", "gCWtLVKVVe");
        setIntField(term1809, term1809.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        try {
            callMethod(klass, "prependElement", argTypes, term1809, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


