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

public class Tag_canContain_237447391149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32540;
     Object term32601;
     Object term32643;
     Object term32646;

    public Tag_canContain_237447391149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32540 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term32540, term32540.getClass(), "canContainInline", true);
        setBooleanField(term32540, term32540.getClass(), "optionalClosing", true);
        setBooleanField(term32540, term32540.getClass(), "canContainBlock", true);
        setBooleanField(term32540, term32540.getClass(), "empty", false);
        setField(term32540, term32540.getClass(), "tagName", "int");
        term32601 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term32601, term32601.getClass(), "isBlock", false);
        setBooleanField(term32601, term32601.getClass(), "canContainBlock", false);
        term32643 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32643, term32643.getClass(), "tagName", "int");
        setBooleanField(term32643, term32643.getClass(), "isBlock", false);
        setBooleanField(term32643, term32643.getClass(), "canContainBlock", true);
        setBooleanField(term32643, term32643.getClass(), "canContainInline", true);
        setBooleanField(term32643, term32643.getClass(), "optionalClosing", true);
        setBooleanField(term32643, term32643.getClass(), "empty", false);
        setBooleanField(term32643, term32643.getClass(), "preserveWhitespace", false);
        setField(term32643, term32643.getClass(), "ancestors", null);
        term32646 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32646, term32646.getClass(), "tagName", null);
        setBooleanField(term32646, term32646.getClass(), "isBlock", false);
        setBooleanField(term32646, term32646.getClass(), "canContainBlock", false);
        setBooleanField(term32646, term32646.getClass(), "canContainInline", false);
        setBooleanField(term32646, term32646.getClass(), "optionalClosing", false);
        setBooleanField(term32646, term32646.getClass(), "empty", false);
        setBooleanField(term32646, term32646.getClass(), "preserveWhitespace", false);
        setField(term32646, term32646.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term32601;
        Object retValue = callMethod(klass, "canContain", argTypes, term32540, args);
        assertTrue(recursiveEquals(term32540, term32643));
        assertTrue(recursiveEquals(term32601, term32646));
        assertTrue(recursiveEquals(retValue, true));
    }

};


