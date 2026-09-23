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

public class Tag_equals_134995802636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term881;
     Object term948;
     Object term3402;
     Object term3419;

    public Tag_equals_134995802636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term910 = new ArrayList();
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        Object term902 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term902, term902.getClass(), "tagName", "");
        setBooleanField(term902, term902.getClass(), "isBlock", false);
        setBooleanField(term902, term902.getClass(), "canContainBlock", true);
        setBooleanField(term902, term902.getClass(), "canContainInline", true);
        setBooleanField(term902, term902.getClass(), "optionalClosing", false);
        setBooleanField(term902, term902.getClass(), "empty", true);
        setBooleanField(term902, term902.getClass(), "preserveWhitespace", true);
        setField(term902, term902.getClass(), "ancestors", term910);
        ArrayList term921 = new ArrayList();
        ((ArrayList) term921).add((Object)null);
        Object term913 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term913, term913.getClass(), "tagName", "");
        setBooleanField(term913, term913.getClass(), "isBlock", false);
        setBooleanField(term913, term913.getClass(), "canContainBlock", false);
        setBooleanField(term913, term913.getClass(), "canContainInline", true);
        setBooleanField(term913, term913.getClass(), "optionalClosing", false);
        setBooleanField(term913, term913.getClass(), "empty", false);
        setBooleanField(term913, term913.getClass(), "preserveWhitespace", true);
        setField(term913, term913.getClass(), "ancestors", term921);
        ArrayList term932 = new ArrayList();
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        ((ArrayList) term932).add((Object)null);
        Object term924 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term924, term924.getClass(), "tagName", "");
        setBooleanField(term924, term924.getClass(), "isBlock", false);
        setBooleanField(term924, term924.getClass(), "canContainBlock", true);
        setBooleanField(term924, term924.getClass(), "canContainInline", true);
        setBooleanField(term924, term924.getClass(), "optionalClosing", true);
        setBooleanField(term924, term924.getClass(), "empty", false);
        setBooleanField(term924, term924.getClass(), "preserveWhitespace", true);
        setField(term924, term924.getClass(), "ancestors", term932);
        ArrayList term943 = new ArrayList();
        ((ArrayList) term943).add((Object)null);
        ((ArrayList) term943).add((Object)null);
        ((ArrayList) term943).add((Object)null);
        Object term935 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term935, term935.getClass(), "tagName", "");
        setBooleanField(term935, term935.getClass(), "isBlock", false);
        setBooleanField(term935, term935.getClass(), "canContainBlock", false);
        setBooleanField(term935, term935.getClass(), "canContainInline", false);
        setBooleanField(term935, term935.getClass(), "optionalClosing", false);
        setBooleanField(term935, term935.getClass(), "empty", false);
        setBooleanField(term935, term935.getClass(), "preserveWhitespace", true);
        setField(term935, term935.getClass(), "ancestors", term943);
        ArrayList term900 = new ArrayList();
        ((ArrayList) term900).add(term902);
        ((ArrayList) term900).add(term913);
        ((ArrayList) term900).add(term913);
        ((ArrayList) term900).add(term924);
        ((ArrayList) term900).add(term935);
        term881 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term881, term881.getClass(), "tagName", "RYdKCNNMBR");
        setBooleanField(term881, term881.getClass(), "isBlock", false);
        setBooleanField(term881, term881.getClass(), "canContainBlock", false);
        setBooleanField(term881, term881.getClass(), "canContainInline", false);
        setBooleanField(term881, term881.getClass(), "optionalClosing", false);
        setBooleanField(term881, term881.getClass(), "empty", false);
        setBooleanField(term881, term881.getClass(), "preserveWhitespace", false);
        setField(term881, term881.getClass(), "ancestors", term900);
        term948 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term3409 = new ArrayList();
        ((ArrayList) term3409).add((Object)null);
        ((ArrayList) term3409).add((Object)null);
        ((ArrayList) term3409).add((Object)null);
        ((ArrayList) term3409).add((Object)null);
        Object term3407 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3407, term3407.getClass(), "tagName", "");
        setBooleanField(term3407, term3407.getClass(), "isBlock", false);
        setBooleanField(term3407, term3407.getClass(), "canContainBlock", true);
        setBooleanField(term3407, term3407.getClass(), "canContainInline", true);
        setBooleanField(term3407, term3407.getClass(), "optionalClosing", false);
        setBooleanField(term3407, term3407.getClass(), "empty", true);
        setBooleanField(term3407, term3407.getClass(), "preserveWhitespace", true);
        setField(term3407, term3407.getClass(), "ancestors", term3409);
        ArrayList term3412 = new ArrayList();
        ((ArrayList) term3412).add((Object)null);
        Object term3410 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3410, term3410.getClass(), "tagName", "");
        setBooleanField(term3410, term3410.getClass(), "isBlock", false);
        setBooleanField(term3410, term3410.getClass(), "canContainBlock", false);
        setBooleanField(term3410, term3410.getClass(), "canContainInline", true);
        setBooleanField(term3410, term3410.getClass(), "optionalClosing", false);
        setBooleanField(term3410, term3410.getClass(), "empty", false);
        setBooleanField(term3410, term3410.getClass(), "preserveWhitespace", true);
        setField(term3410, term3410.getClass(), "ancestors", term3412);
        ArrayList term3415 = new ArrayList();
        ((ArrayList) term3415).add((Object)null);
        ((ArrayList) term3415).add((Object)null);
        ((ArrayList) term3415).add((Object)null);
        ((ArrayList) term3415).add((Object)null);
        ((ArrayList) term3415).add((Object)null);
        ((ArrayList) term3415).add((Object)null);
        Object term3413 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3413, term3413.getClass(), "tagName", "");
        setBooleanField(term3413, term3413.getClass(), "isBlock", false);
        setBooleanField(term3413, term3413.getClass(), "canContainBlock", true);
        setBooleanField(term3413, term3413.getClass(), "canContainInline", true);
        setBooleanField(term3413, term3413.getClass(), "optionalClosing", true);
        setBooleanField(term3413, term3413.getClass(), "empty", false);
        setBooleanField(term3413, term3413.getClass(), "preserveWhitespace", true);
        setField(term3413, term3413.getClass(), "ancestors", term3415);
        ArrayList term3418 = new ArrayList();
        ((ArrayList) term3418).add((Object)null);
        ((ArrayList) term3418).add((Object)null);
        ((ArrayList) term3418).add((Object)null);
        Object term3416 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3416, term3416.getClass(), "tagName", "");
        setBooleanField(term3416, term3416.getClass(), "isBlock", false);
        setBooleanField(term3416, term3416.getClass(), "canContainBlock", false);
        setBooleanField(term3416, term3416.getClass(), "canContainInline", false);
        setBooleanField(term3416, term3416.getClass(), "optionalClosing", false);
        setBooleanField(term3416, term3416.getClass(), "empty", false);
        setBooleanField(term3416, term3416.getClass(), "preserveWhitespace", true);
        setField(term3416, term3416.getClass(), "ancestors", term3418);
        ArrayList term3405 = new ArrayList();
        ((ArrayList) term3405).add(term3407);
        ((ArrayList) term3405).add(term3410);
        ((ArrayList) term3405).add(term3410);
        ((ArrayList) term3405).add(term3413);
        ((ArrayList) term3405).add(term3416);
        term3402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term3402, term3402.getClass(), "tagName", "RYdKCNNMBR");
        setBooleanField(term3402, term3402.getClass(), "isBlock", false);
        setBooleanField(term3402, term3402.getClass(), "canContainBlock", false);
        setBooleanField(term3402, term3402.getClass(), "canContainInline", false);
        setBooleanField(term3402, term3402.getClass(), "optionalClosing", false);
        setBooleanField(term3402, term3402.getClass(), "empty", false);
        setBooleanField(term3402, term3402.getClass(), "preserveWhitespace", false);
        setField(term3402, term3402.getClass(), "ancestors", term3405);
        term3419 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term948;
        Object retValue = callMethod(klass, "equals", argTypes, term881, args);
        assertTrue(recursiveEquals(term881, term3402));
        assertTrue(recursiveEquals(term948, term3419));
        assertTrue(recursiveEquals(retValue, false));
    }

};


