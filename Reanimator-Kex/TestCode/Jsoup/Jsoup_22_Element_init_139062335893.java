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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Element_init_139062335893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term17957;
     Object term17968;

    public Element_init_139062335893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term78, term78.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term78, term78.getClass(), "isBlock", true);
        setBooleanField(term78, term78.getClass(), "formatAsBlock", false);
        setBooleanField(term78, term78.getClass(), "canContainBlock", true);
        setBooleanField(term78, term78.getClass(), "canContainInline", false);
        setBooleanField(term78, term78.getClass(), "empty", true);
        setBooleanField(term78, term78.getClass(), "selfClosing", false);
        setBooleanField(term78, term78.getClass(), "preserveWhitespace", true);
        ArrayList term17961 = new ArrayList();
        term17957 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17958 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17963 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17958, term17958.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term17958, term17958.getClass(), "isBlock", true);
        setBooleanField(term17958, term17958.getClass(), "formatAsBlock", false);
        setBooleanField(term17958, term17958.getClass(), "canContainBlock", true);
        setBooleanField(term17958, term17958.getClass(), "canContainInline", false);
        setBooleanField(term17958, term17958.getClass(), "empty", true);
        setBooleanField(term17958, term17958.getClass(), "selfClosing", false);
        setBooleanField(term17958, term17958.getClass(), "preserveWhitespace", true);
        setField(term17957, term17957.getClass(), "tag", term17958);
        setField(term17957, term17957.getClass(), "classNames", null);
        setField(term17957, term17957.getClass(), "parentNode", null);
        setField(term17957, term17957.getClass(), "childNodes", term17961);
        setField(term17963, term17963.getClass(), "attributes", null);
        setField(term17957, term17957.getClass(), "attributes", term17963);
        setField(term17957, term17957.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term17957, term17957.getClass(), "siblingIndex", 0);
        term17968 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17968, term17968.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term17968, term17968.getClass(), "isBlock", true);
        setBooleanField(term17968, term17968.getClass(), "formatAsBlock", false);
        setBooleanField(term17968, term17968.getClass(), "canContainBlock", true);
        setBooleanField(term17968, term17968.getClass(), "canContainInline", false);
        setBooleanField(term17968, term17968.getClass(), "empty", true);
        setBooleanField(term17968, term17968.getClass(), "selfClosing", false);
        setBooleanField(term17968, term17968.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term78;
        args[1] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17957));
        assertTrue(recursiveEquals(term78, "SzjVpOQTyS"));
    }

};


