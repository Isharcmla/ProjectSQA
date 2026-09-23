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

public class Tag_equals_134995802683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16895;
     Object term16918;
     Object term16942;
     Object term16943;

    public Tag_equals_134995802683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16895 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term16895, term16895.getClass(), "canContainBlock", true);
        setBooleanField(term16895, term16895.getClass(), "canContainInline", false);
        setBooleanField(term16895, term16895.getClass(), "empty", false);
        setBooleanField(term16895, term16895.getClass(), "isBlock", true);
        setBooleanField(term16895, term16895.getClass(), "optionalClosing", false);
        term16918 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term16918, term16918.getClass(), "canContainBlock", true);
        setBooleanField(term16918, term16918.getClass(), "canContainInline", false);
        setBooleanField(term16918, term16918.getClass(), "empty", false);
        setBooleanField(term16918, term16918.getClass(), "isBlock", true);
        setBooleanField(term16918, term16918.getClass(), "optionalClosing", true);
        term16942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16942, term16942.getClass(), "tagName", null);
        setBooleanField(term16942, term16942.getClass(), "isBlock", true);
        setBooleanField(term16942, term16942.getClass(), "canContainBlock", true);
        setBooleanField(term16942, term16942.getClass(), "canContainInline", false);
        setBooleanField(term16942, term16942.getClass(), "optionalClosing", false);
        setBooleanField(term16942, term16942.getClass(), "empty", false);
        setBooleanField(term16942, term16942.getClass(), "preserveWhitespace", false);
        setField(term16942, term16942.getClass(), "ancestors", null);
        term16943 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16943, term16943.getClass(), "tagName", null);
        setBooleanField(term16943, term16943.getClass(), "isBlock", true);
        setBooleanField(term16943, term16943.getClass(), "canContainBlock", true);
        setBooleanField(term16943, term16943.getClass(), "canContainInline", false);
        setBooleanField(term16943, term16943.getClass(), "optionalClosing", true);
        setBooleanField(term16943, term16943.getClass(), "empty", false);
        setBooleanField(term16943, term16943.getClass(), "preserveWhitespace", false);
        setField(term16943, term16943.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16918;
        Object retValue = callMethod(klass, "equals", argTypes, term16895, args);
        assertTrue(recursiveEquals(term16895, term16942));
        assertTrue(recursiveEquals(term16918, term16943));
        assertTrue(recursiveEquals(retValue, false));
    }

};


