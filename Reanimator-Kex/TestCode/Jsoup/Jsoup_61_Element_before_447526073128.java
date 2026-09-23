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

public class Element_before_447526073128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;

    public Element_before_447526073128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2389 = new ArrayList();
        ((ArrayList) term2389).add((Object)null);
        ((ArrayList) term2389).add((Object)null);
        LinkedHashMap term2394 = new LinkedHashMap();
        term2367 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2368 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2393 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2368, term2368.getClass(), "tagName", "smnHEqRFRx");
        setBooleanField(term2368, term2368.getClass(), "isBlock", false);
        setBooleanField(term2368, term2368.getClass(), "formatAsBlock", false);
        setBooleanField(term2368, term2368.getClass(), "canContainInline", false);
        setBooleanField(term2368, term2368.getClass(), "empty", false);
        setBooleanField(term2368, term2368.getClass(), "selfClosing", false);
        setBooleanField(term2368, term2368.getClass(), "preserveWhitespace", true);
        setBooleanField(term2368, term2368.getClass(), "formList", true);
        setBooleanField(term2368, term2368.getClass(), "formSubmit", true);
        setField(term2367, term2367.getClass(), "tag", term2368);
        setField(term2367, term2367.getClass(), "parentNode", null);
        setField(term2367, term2367.getClass(), "childNodes", term2389);
        setField(term2393, term2393.getClass(), "attributes", term2394);
        setField(term2367, term2367.getClass(), "attributes", term2393);
        setField(term2367, term2367.getClass(), "baseUri", "sQvGcVjdEx");
        setIntField(term2367, term2367.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "before", argTypes, term2367, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


