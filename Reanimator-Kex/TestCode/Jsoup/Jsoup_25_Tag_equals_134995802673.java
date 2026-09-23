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

public class Tag_equals_134995802673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5013;
     Object term5059;
     Object term5356;
     Object term5357;

    public Tag_equals_134995802673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5013 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5013, term5013.getClass(), "canContainBlock", true);
        term5059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5059, term5059.getClass(), "canContainBlock", false);
        term5356 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5356, term5356.getClass(), "tagName", null);
        setBooleanField(term5356, term5356.getClass(), "isBlock", false);
        setBooleanField(term5356, term5356.getClass(), "formatAsBlock", false);
        setBooleanField(term5356, term5356.getClass(), "canContainBlock", true);
        setBooleanField(term5356, term5356.getClass(), "canContainInline", false);
        setBooleanField(term5356, term5356.getClass(), "empty", false);
        setBooleanField(term5356, term5356.getClass(), "selfClosing", false);
        setBooleanField(term5356, term5356.getClass(), "preserveWhitespace", false);
        term5357 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5357, term5357.getClass(), "tagName", null);
        setBooleanField(term5357, term5357.getClass(), "isBlock", false);
        setBooleanField(term5357, term5357.getClass(), "formatAsBlock", false);
        setBooleanField(term5357, term5357.getClass(), "canContainBlock", false);
        setBooleanField(term5357, term5357.getClass(), "canContainInline", false);
        setBooleanField(term5357, term5357.getClass(), "empty", false);
        setBooleanField(term5357, term5357.getClass(), "selfClosing", false);
        setBooleanField(term5357, term5357.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5059;
        Object retValue = callMethod(klass, "equals", argTypes, term5013, args);
        assertTrue(recursiveEquals(term5013, term5356));
        assertTrue(recursiveEquals(term5059, term5357));
        assertTrue(recursiveEquals(retValue, false));
    }

};


