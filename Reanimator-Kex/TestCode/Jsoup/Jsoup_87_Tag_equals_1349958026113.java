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

public class Tag_equals_1349958026113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10458;
     Object term10542;
     Object term10591;
     Object term10594;

    public Tag_equals_1349958026113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10458 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10458, term10458.getClass(), "tagName", "");
        setBooleanField(term10458, term10458.getClass(), "canContainInline", true);
        setBooleanField(term10458, term10458.getClass(), "empty", true);
        setBooleanField(term10458, term10458.getClass(), "formatAsBlock", true);
        term10542 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10542, term10542.getClass(), "tagName", "");
        setBooleanField(term10542, term10542.getClass(), "canContainInline", true);
        setBooleanField(term10542, term10542.getClass(), "empty", true);
        setBooleanField(term10542, term10542.getClass(), "formatAsBlock", false);
        term10591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10591, term10591.getClass(), "tagName", "");
        setBooleanField(term10591, term10591.getClass(), "isBlock", false);
        setBooleanField(term10591, term10591.getClass(), "formatAsBlock", true);
        setBooleanField(term10591, term10591.getClass(), "canContainInline", true);
        setBooleanField(term10591, term10591.getClass(), "empty", true);
        setBooleanField(term10591, term10591.getClass(), "selfClosing", false);
        setBooleanField(term10591, term10591.getClass(), "preserveWhitespace", false);
        setBooleanField(term10591, term10591.getClass(), "formList", false);
        setBooleanField(term10591, term10591.getClass(), "formSubmit", false);
        term10594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10594, term10594.getClass(), "tagName", "");
        setBooleanField(term10594, term10594.getClass(), "isBlock", false);
        setBooleanField(term10594, term10594.getClass(), "formatAsBlock", false);
        setBooleanField(term10594, term10594.getClass(), "canContainInline", true);
        setBooleanField(term10594, term10594.getClass(), "empty", true);
        setBooleanField(term10594, term10594.getClass(), "selfClosing", false);
        setBooleanField(term10594, term10594.getClass(), "preserveWhitespace", false);
        setBooleanField(term10594, term10594.getClass(), "formList", false);
        setBooleanField(term10594, term10594.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10542;
        Object retValue = callMethod(klass, "equals", argTypes, term10458, args);
        assertTrue(recursiveEquals(term10458, term10591));
        assertTrue(recursiveEquals(term10542, term10594));
        assertTrue(recursiveEquals(retValue, false));
    }

};


