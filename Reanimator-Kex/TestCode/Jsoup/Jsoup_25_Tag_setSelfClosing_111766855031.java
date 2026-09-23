package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class Tag_setSelfClosing_111766855031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367;
     Object term1208;
     Object term1188;

    public Tag_setSelfClosing_111766855031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term367, term367.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term367, term367.getClass(), "isBlock", false);
        setBooleanField(term367, term367.getClass(), "formatAsBlock", false);
        setBooleanField(term367, term367.getClass(), "canContainBlock", false);
        setBooleanField(term367, term367.getClass(), "canContainInline", false);
        setBooleanField(term367, term367.getClass(), "empty", false);
        setBooleanField(term367, term367.getClass(), "selfClosing", false);
        setBooleanField(term367, term367.getClass(), "preserveWhitespace", true);
        term1208 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1208, term1208.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term1208, term1208.getClass(), "isBlock", false);
        setBooleanField(term1208, term1208.getClass(), "formatAsBlock", false);
        setBooleanField(term1208, term1208.getClass(), "canContainBlock", false);
        setBooleanField(term1208, term1208.getClass(), "canContainInline", false);
        setBooleanField(term1208, term1208.getClass(), "empty", false);
        setBooleanField(term1208, term1208.getClass(), "selfClosing", true);
        setBooleanField(term1208, term1208.getClass(), "preserveWhitespace", true);
        term1188 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1188, term1188.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term1188, term1188.getClass(), "isBlock", false);
        setBooleanField(term1188, term1188.getClass(), "formatAsBlock", false);
        setBooleanField(term1188, term1188.getClass(), "canContainBlock", false);
        setBooleanField(term1188, term1188.getClass(), "canContainInline", false);
        setBooleanField(term1188, term1188.getClass(), "empty", false);
        setBooleanField(term1188, term1188.getClass(), "selfClosing", true);
        setBooleanField(term1188, term1188.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "setSelfClosing", argTypes, term367, args);
        assertTrue(recursiveEquals(term367, term1208));
        assertTrue(recursiveEquals(retValue, term1188));
    }

};


