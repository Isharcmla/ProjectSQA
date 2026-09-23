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

public class Tag_equals_134995802682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6290;
     Object term6336;
     Object term6478;
     Object term6479;

    public Tag_equals_134995802682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6290 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6290, term6290.getClass(), "canContainBlock", false);
        setBooleanField(term6290, term6290.getClass(), "canContainInline", false);
        setBooleanField(term6290, term6290.getClass(), "empty", false);
        setBooleanField(term6290, term6290.getClass(), "formatAsBlock", false);
        setBooleanField(term6290, term6290.getClass(), "isBlock", false);
        setBooleanField(term6290, term6290.getClass(), "preserveWhitespace", false);
        setBooleanField(term6290, term6290.getClass(), "selfClosing", false);
        term6336 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term6336, term6336.getClass(), "canContainBlock", false);
        setBooleanField(term6336, term6336.getClass(), "canContainInline", false);
        setBooleanField(term6336, term6336.getClass(), "empty", false);
        setBooleanField(term6336, term6336.getClass(), "formatAsBlock", false);
        setBooleanField(term6336, term6336.getClass(), "isBlock", false);
        setBooleanField(term6336, term6336.getClass(), "preserveWhitespace", false);
        setBooleanField(term6336, term6336.getClass(), "selfClosing", true);
        term6478 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6478, term6478.getClass(), "tagName", null);
        setBooleanField(term6478, term6478.getClass(), "isBlock", false);
        setBooleanField(term6478, term6478.getClass(), "formatAsBlock", false);
        setBooleanField(term6478, term6478.getClass(), "canContainBlock", false);
        setBooleanField(term6478, term6478.getClass(), "canContainInline", false);
        setBooleanField(term6478, term6478.getClass(), "empty", false);
        setBooleanField(term6478, term6478.getClass(), "selfClosing", false);
        setBooleanField(term6478, term6478.getClass(), "preserveWhitespace", false);
        term6479 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6479, term6479.getClass(), "tagName", null);
        setBooleanField(term6479, term6479.getClass(), "isBlock", false);
        setBooleanField(term6479, term6479.getClass(), "formatAsBlock", false);
        setBooleanField(term6479, term6479.getClass(), "canContainBlock", false);
        setBooleanField(term6479, term6479.getClass(), "canContainInline", false);
        setBooleanField(term6479, term6479.getClass(), "empty", false);
        setBooleanField(term6479, term6479.getClass(), "selfClosing", true);
        setBooleanField(term6479, term6479.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6336;
        Object retValue = callMethod(klass, "equals", argTypes, term6290, args);
        assertTrue(recursiveEquals(term6290, term6478));
        assertTrue(recursiveEquals(term6336, term6479));
        assertTrue(recursiveEquals(retValue, false));
    }

};


