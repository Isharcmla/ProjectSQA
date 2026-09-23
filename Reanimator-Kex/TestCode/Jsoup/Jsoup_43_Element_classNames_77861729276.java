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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_classNames_77861729276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6345;

    public Element_classNames_77861729276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6368 = new ArrayList();
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        ((ArrayList) term6368).add((Object)null);
        LinkedHashMap term6373 = new LinkedHashMap();
        term6345 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6346 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6372 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6346, term6346.getClass(), "tagName", "WPxXsahPRq");
        setBooleanField(term6346, term6346.getClass(), "isBlock", true);
        setBooleanField(term6346, term6346.getClass(), "formatAsBlock", true);
        setBooleanField(term6346, term6346.getClass(), "canContainBlock", false);
        setBooleanField(term6346, term6346.getClass(), "canContainInline", false);
        setBooleanField(term6346, term6346.getClass(), "empty", false);
        setBooleanField(term6346, term6346.getClass(), "selfClosing", false);
        setBooleanField(term6346, term6346.getClass(), "preserveWhitespace", false);
        setBooleanField(term6346, term6346.getClass(), "formList", true);
        setBooleanField(term6346, term6346.getClass(), "formSubmit", true);
        setField(term6345, term6345.getClass(), "tag", term6346);
        setField(term6345, term6345.getClass(), "parentNode", null);
        setField(term6345, term6345.getClass(), "childNodes", term6368);
        setField(term6372, term6372.getClass(), "attributes", term6373);
        setField(term6345, term6345.getClass(), "attributes", term6372);
        setField(term6345, term6345.getClass(), "baseUri", "yeSXGqQExb");
        setIntField(term6345, term6345.getClass(), "siblingIndex", 1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term6345, args);
    }

};


