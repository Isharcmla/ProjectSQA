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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_append_990907754118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1830;

    public Element_append_990907754118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1853 = new ArrayList();
        ((ArrayList) term1853).add((Object)null);
        ((ArrayList) term1853).add((Object)null);
        ((ArrayList) term1853).add((Object)null);
        LinkedHashMap term1858 = new LinkedHashMap();
        term1830 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1831 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1857 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1831, term1831.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term1831, term1831.getClass(), "isBlock", true);
        setBooleanField(term1831, term1831.getClass(), "formatAsBlock", false);
        setBooleanField(term1831, term1831.getClass(), "canContainBlock", false);
        setBooleanField(term1831, term1831.getClass(), "canContainInline", true);
        setBooleanField(term1831, term1831.getClass(), "empty", false);
        setBooleanField(term1831, term1831.getClass(), "selfClosing", true);
        setBooleanField(term1831, term1831.getClass(), "preserveWhitespace", true);
        setBooleanField(term1831, term1831.getClass(), "formList", true);
        setBooleanField(term1831, term1831.getClass(), "formSubmit", false);
        setField(term1830, term1830.getClass(), "tag", term1831);
        setField(term1830, term1830.getClass(), "parentNode", null);
        setField(term1830, term1830.getClass(), "childNodes", term1853);
        setField(term1857, term1857.getClass(), "attributes", term1858);
        setField(term1830, term1830.getClass(), "attributes", term1857);
        setField(term1830, term1830.getClass(), "baseUri", "gCWtLVKVVe");
        setIntField(term1830, term1830.getClass(), "siblingIndex", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        try {
            callMethod(klass, "append", argTypes, term1830, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


