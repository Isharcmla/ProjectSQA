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

public class Element_after_1304948324130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2531;

    public Element_after_1304948324130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2553 = new ArrayList();
        ((ArrayList) term2553).add((Object)null);
        ((ArrayList) term2553).add((Object)null);
        ((ArrayList) term2553).add((Object)null);
        ((ArrayList) term2553).add((Object)null);
        ((ArrayList) term2553).add((Object)null);
        ((ArrayList) term2553).add((Object)null);
        LinkedHashMap term2558 = new LinkedHashMap();
        term2531 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2557 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2532, term2532.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term2532, term2532.getClass(), "isBlock", true);
        setBooleanField(term2532, term2532.getClass(), "formatAsBlock", false);
        setBooleanField(term2532, term2532.getClass(), "canContainInline", false);
        setBooleanField(term2532, term2532.getClass(), "empty", true);
        setBooleanField(term2532, term2532.getClass(), "selfClosing", true);
        setBooleanField(term2532, term2532.getClass(), "preserveWhitespace", false);
        setBooleanField(term2532, term2532.getClass(), "formList", true);
        setBooleanField(term2532, term2532.getClass(), "formSubmit", true);
        setField(term2531, term2531.getClass(), "tag", term2532);
        setField(term2531, term2531.getClass(), "parentNode", null);
        setField(term2531, term2531.getClass(), "childNodes", term2553);
        setField(term2557, term2557.getClass(), "attributes", term2558);
        setField(term2531, term2531.getClass(), "attributes", term2557);
        setField(term2531, term2531.getClass(), "baseUri", "VGizxZnyHX");
        setIntField(term2531, term2531.getClass(), "siblingIndex", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "after", argTypes, term2531, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


