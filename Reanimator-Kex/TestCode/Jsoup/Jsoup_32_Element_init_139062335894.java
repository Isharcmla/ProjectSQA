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

public class Element_init_139062335894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term9344;
     Object term9355;

    public Element_init_139062335894() {
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
        ArrayList term9348 = new ArrayList();
        term9344 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9345 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9350 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9345, term9345.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term9345, term9345.getClass(), "isBlock", true);
        setBooleanField(term9345, term9345.getClass(), "formatAsBlock", false);
        setBooleanField(term9345, term9345.getClass(), "canContainBlock", true);
        setBooleanField(term9345, term9345.getClass(), "canContainInline", false);
        setBooleanField(term9345, term9345.getClass(), "empty", true);
        setBooleanField(term9345, term9345.getClass(), "selfClosing", false);
        setBooleanField(term9345, term9345.getClass(), "preserveWhitespace", true);
        setField(term9344, term9344.getClass(), "tag", term9345);
        setField(term9344, term9344.getClass(), "classNames", null);
        setField(term9344, term9344.getClass(), "parentNode", null);
        setField(term9344, term9344.getClass(), "childNodes", term9348);
        setField(term9350, term9350.getClass(), "attributes", null);
        setField(term9344, term9344.getClass(), "attributes", term9350);
        setField(term9344, term9344.getClass(), "baseUri", "SzjVpOQTyS");
        setIntField(term9344, term9344.getClass(), "siblingIndex", 0);
        term9355 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9355, term9355.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term9355, term9355.getClass(), "isBlock", true);
        setBooleanField(term9355, term9355.getClass(), "formatAsBlock", false);
        setBooleanField(term9355, term9355.getClass(), "canContainBlock", true);
        setBooleanField(term9355, term9355.getClass(), "canContainInline", false);
        setBooleanField(term9355, term9355.getClass(), "empty", true);
        setBooleanField(term9355, term9355.getClass(), "selfClosing", false);
        setBooleanField(term9355, term9355.getClass(), "preserveWhitespace", true);
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
        assertTrue(recursiveEquals(instance, term9344));
        assertTrue(recursiveEquals(term78, "SzjVpOQTyS"));
    }

};


