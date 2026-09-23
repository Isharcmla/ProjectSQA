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

public class Tag_equals_1349958026101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7053;
     Object term7137;
     Object term7184;
     Object term7187;

    public Tag_equals_1349958026101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7053 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7053, term7053.getClass(), "tagName", "");
        setBooleanField(term7053, term7053.getClass(), "canContainInline", true);
        term7137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7137, term7137.getClass(), "tagName", "");
        setBooleanField(term7137, term7137.getClass(), "canContainInline", false);
        term7184 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7184, term7184.getClass(), "tagName", "");
        setBooleanField(term7184, term7184.getClass(), "isBlock", false);
        setBooleanField(term7184, term7184.getClass(), "formatAsBlock", false);
        setBooleanField(term7184, term7184.getClass(), "canContainInline", true);
        setBooleanField(term7184, term7184.getClass(), "empty", false);
        setBooleanField(term7184, term7184.getClass(), "selfClosing", false);
        setBooleanField(term7184, term7184.getClass(), "preserveWhitespace", false);
        setBooleanField(term7184, term7184.getClass(), "formList", false);
        setBooleanField(term7184, term7184.getClass(), "formSubmit", false);
        term7187 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7187, term7187.getClass(), "tagName", "");
        setBooleanField(term7187, term7187.getClass(), "isBlock", false);
        setBooleanField(term7187, term7187.getClass(), "formatAsBlock", false);
        setBooleanField(term7187, term7187.getClass(), "canContainInline", false);
        setBooleanField(term7187, term7187.getClass(), "empty", false);
        setBooleanField(term7187, term7187.getClass(), "selfClosing", false);
        setBooleanField(term7187, term7187.getClass(), "preserveWhitespace", false);
        setBooleanField(term7187, term7187.getClass(), "formList", false);
        setBooleanField(term7187, term7187.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7137;
        Object retValue = callMethod(klass, "equals", argTypes, term7053, args);
        assertTrue(recursiveEquals(term7053, term7184));
        assertTrue(recursiveEquals(term7137, term7187));
        assertTrue(recursiveEquals(retValue, false));
    }

};


