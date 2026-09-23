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

public class Element_after_1054834904129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2438;

    public Element_after_1054834904129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2460 = new ArrayList();
        ((ArrayList) term2460).add((Object)null);
        ((ArrayList) term2460).add((Object)null);
        ((ArrayList) term2460).add((Object)null);
        ((ArrayList) term2460).add((Object)null);
        ((ArrayList) term2460).add((Object)null);
        ((ArrayList) term2460).add((Object)null);
        LinkedHashMap term2465 = new LinkedHashMap();
        term2438 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2439 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2464 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2439, term2439.getClass(), "tagName", "rLHAoqXgPh");
        setBooleanField(term2439, term2439.getClass(), "isBlock", false);
        setBooleanField(term2439, term2439.getClass(), "formatAsBlock", true);
        setBooleanField(term2439, term2439.getClass(), "canContainInline", false);
        setBooleanField(term2439, term2439.getClass(), "empty", true);
        setBooleanField(term2439, term2439.getClass(), "selfClosing", false);
        setBooleanField(term2439, term2439.getClass(), "preserveWhitespace", false);
        setBooleanField(term2439, term2439.getClass(), "formList", false);
        setBooleanField(term2439, term2439.getClass(), "formSubmit", false);
        setField(term2438, term2438.getClass(), "tag", term2439);
        setField(term2438, term2438.getClass(), "parentNode", null);
        setField(term2438, term2438.getClass(), "childNodes", term2460);
        setField(term2464, term2464.getClass(), "attributes", term2465);
        setField(term2438, term2438.getClass(), "attributes", term2464);
        setField(term2438, term2438.getClass(), "baseUri", "cudZvLMQon");
        setIntField(term2438, term2438.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        try {
            callMethod(klass, "after", argTypes, term2438, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


