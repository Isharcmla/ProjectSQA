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
import java.util.ArrayList;
import java.lang.Object;

public class Tag_register_34362463115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25249;
     Object term25378;
     Object term25349;

    public Tag_register_34362463115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25301 = new ArrayList();
        term25249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25249, term25249.getClass(), "ancestors", term25301);
        ArrayList term25383 = new ArrayList();
        ((ArrayList) term25383).add((Object)null);
        Object term25381 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25381, term25381.getClass(), "tagName", "");
        setBooleanField(term25381, term25381.getClass(), "isBlock", true);
        setBooleanField(term25381, term25381.getClass(), "canContainBlock", true);
        setBooleanField(term25381, term25381.getClass(), "canContainInline", true);
        setBooleanField(term25381, term25381.getClass(), "optionalClosing", false);
        setBooleanField(term25381, term25381.getClass(), "empty", false);
        setBooleanField(term25381, term25381.getClass(), "preserveWhitespace", false);
        setField(term25381, term25381.getClass(), "ancestors", term25383);
        ArrayList term25379 = new ArrayList();
        ((ArrayList) term25379).add(term25381);
        term25378 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25378, term25378.getClass(), "tagName", null);
        setBooleanField(term25378, term25378.getClass(), "isBlock", false);
        setBooleanField(term25378, term25378.getClass(), "canContainBlock", false);
        setBooleanField(term25378, term25378.getClass(), "canContainInline", false);
        setBooleanField(term25378, term25378.getClass(), "optionalClosing", false);
        setBooleanField(term25378, term25378.getClass(), "empty", false);
        setBooleanField(term25378, term25378.getClass(), "preserveWhitespace", false);
        setField(term25378, term25378.getClass(), "ancestors", term25379);
        ArrayList term25366 = new ArrayList();
        ((ArrayList) term25366).add((Object)null);
        Object term25358 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25358, term25358.getClass(), "tagName", "");
        setBooleanField(term25358, term25358.getClass(), "isBlock", true);
        setBooleanField(term25358, term25358.getClass(), "canContainBlock", true);
        setBooleanField(term25358, term25358.getClass(), "canContainInline", true);
        setBooleanField(term25358, term25358.getClass(), "optionalClosing", false);
        setBooleanField(term25358, term25358.getClass(), "empty", false);
        setBooleanField(term25358, term25358.getClass(), "preserveWhitespace", false);
        setField(term25358, term25358.getClass(), "ancestors", term25366);
        ArrayList term25356 = new ArrayList();
        ((ArrayList) term25356).add(term25358);
        term25349 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25349, term25349.getClass(), "tagName", null);
        setBooleanField(term25349, term25349.getClass(), "isBlock", false);
        setBooleanField(term25349, term25349.getClass(), "canContainBlock", false);
        setBooleanField(term25349, term25349.getClass(), "canContainInline", false);
        setBooleanField(term25349, term25349.getClass(), "optionalClosing", false);
        setBooleanField(term25349, term25349.getClass(), "empty", false);
        setBooleanField(term25349, term25349.getClass(), "preserveWhitespace", false);
        setField(term25349, term25349.getClass(), "ancestors", term25356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term25249;
        Object retValue = callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term25249, term25378));
        assertTrue(recursiveEquals(retValue, term25349));
    }

};


