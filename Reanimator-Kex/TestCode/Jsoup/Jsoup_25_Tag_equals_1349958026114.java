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

public class Tag_equals_1349958026114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8941;
     Object term9025;
     Object term9134;
     Object term9137;

    public Tag_equals_1349958026114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8941 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term8941, term8941.getClass(), "canContainBlock", true);
        setBooleanField(term8941, term8941.getClass(), "canContainInline", false);
        setBooleanField(term8941, term8941.getClass(), "empty", true);
        setBooleanField(term8941, term8941.getClass(), "formatAsBlock", false);
        setBooleanField(term8941, term8941.getClass(), "isBlock", true);
        setBooleanField(term8941, term8941.getClass(), "preserveWhitespace", true);
        setBooleanField(term8941, term8941.getClass(), "selfClosing", true);
        setField(term8941, term8941.getClass(), "tagName", "");
        term9025 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term9025, term9025.getClass(), "canContainBlock", true);
        setBooleanField(term9025, term9025.getClass(), "canContainInline", false);
        setBooleanField(term9025, term9025.getClass(), "empty", true);
        setBooleanField(term9025, term9025.getClass(), "formatAsBlock", false);
        setBooleanField(term9025, term9025.getClass(), "isBlock", true);
        setBooleanField(term9025, term9025.getClass(), "preserveWhitespace", true);
        setBooleanField(term9025, term9025.getClass(), "selfClosing", true);
        setField(term9025, term9025.getClass(), "tagName", null);
        term9134 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9134, term9134.getClass(), "tagName", "");
        setBooleanField(term9134, term9134.getClass(), "isBlock", true);
        setBooleanField(term9134, term9134.getClass(), "formatAsBlock", false);
        setBooleanField(term9134, term9134.getClass(), "canContainBlock", true);
        setBooleanField(term9134, term9134.getClass(), "canContainInline", false);
        setBooleanField(term9134, term9134.getClass(), "empty", true);
        setBooleanField(term9134, term9134.getClass(), "selfClosing", true);
        setBooleanField(term9134, term9134.getClass(), "preserveWhitespace", true);
        term9137 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9137, term9137.getClass(), "tagName", null);
        setBooleanField(term9137, term9137.getClass(), "isBlock", true);
        setBooleanField(term9137, term9137.getClass(), "formatAsBlock", false);
        setBooleanField(term9137, term9137.getClass(), "canContainBlock", true);
        setBooleanField(term9137, term9137.getClass(), "canContainInline", false);
        setBooleanField(term9137, term9137.getClass(), "empty", true);
        setBooleanField(term9137, term9137.getClass(), "selfClosing", true);
        setBooleanField(term9137, term9137.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9025;
        Object retValue = callMethod(klass, "equals", argTypes, term8941, args);
        assertTrue(recursiveEquals(term8941, term9134));
        assertTrue(recursiveEquals(term9025, term9137));
        assertTrue(recursiveEquals(retValue, false));
    }

};


