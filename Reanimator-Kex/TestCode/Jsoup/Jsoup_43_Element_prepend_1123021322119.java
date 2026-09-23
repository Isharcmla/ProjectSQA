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

public class Element_prepend_1123021322119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1924;

    public Element_prepend_1123021322119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1947 = new ArrayList();
        ((ArrayList) term1947).add((Object)null);
        ((ArrayList) term1947).add((Object)null);
        ((ArrayList) term1947).add((Object)null);
        ((ArrayList) term1947).add((Object)null);
        ((ArrayList) term1947).add((Object)null);
        LinkedHashMap term1952 = new LinkedHashMap();
        term1924 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1925 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1951 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1925, term1925.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term1925, term1925.getClass(), "isBlock", true);
        setBooleanField(term1925, term1925.getClass(), "formatAsBlock", true);
        setBooleanField(term1925, term1925.getClass(), "canContainBlock", true);
        setBooleanField(term1925, term1925.getClass(), "canContainInline", true);
        setBooleanField(term1925, term1925.getClass(), "empty", true);
        setBooleanField(term1925, term1925.getClass(), "selfClosing", false);
        setBooleanField(term1925, term1925.getClass(), "preserveWhitespace", false);
        setBooleanField(term1925, term1925.getClass(), "formList", true);
        setBooleanField(term1925, term1925.getClass(), "formSubmit", false);
        setField(term1924, term1924.getClass(), "tag", term1925);
        setField(term1924, term1924.getClass(), "parentNode", null);
        setField(term1924, term1924.getClass(), "childNodes", term1947);
        setField(term1951, term1951.getClass(), "attributes", term1952);
        setField(term1924, term1924.getClass(), "attributes", term1951);
        setField(term1924, term1924.getClass(), "baseUri", "LWyEaeIyAo");
        setIntField(term1924, term1924.getClass(), "siblingIndex", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yVMkkQhvmN";
        try {
            callMethod(klass, "prepend", argTypes, term1924, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


