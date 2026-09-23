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

public class Tag_equals_134995802678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5593;
     Object term5677;
     Object term5897;
     Object term5900;

    public Tag_equals_134995802678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5593 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5593, term5593.getClass(), "canContainBlock", false);
        setBooleanField(term5593, term5593.getClass(), "canContainInline", false);
        setBooleanField(term5593, term5593.getClass(), "empty", false);
        setBooleanField(term5593, term5593.getClass(), "formatAsBlock", false);
        setBooleanField(term5593, term5593.getClass(), "isBlock", false);
        setBooleanField(term5593, term5593.getClass(), "preserveWhitespace", false);
        setBooleanField(term5593, term5593.getClass(), "selfClosing", false);
        setField(term5593, term5593.getClass(), "tagName", "");
        term5677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term5677, term5677.getClass(), "canContainBlock", false);
        setBooleanField(term5677, term5677.getClass(), "canContainInline", false);
        setBooleanField(term5677, term5677.getClass(), "empty", false);
        setBooleanField(term5677, term5677.getClass(), "formatAsBlock", false);
        setBooleanField(term5677, term5677.getClass(), "isBlock", false);
        setBooleanField(term5677, term5677.getClass(), "preserveWhitespace", false);
        setBooleanField(term5677, term5677.getClass(), "selfClosing", false);
        setField(term5677, term5677.getClass(), "tagName", "");
        term5897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5897, term5897.getClass(), "tagName", "");
        setBooleanField(term5897, term5897.getClass(), "isBlock", false);
        setBooleanField(term5897, term5897.getClass(), "formatAsBlock", false);
        setBooleanField(term5897, term5897.getClass(), "canContainBlock", false);
        setBooleanField(term5897, term5897.getClass(), "canContainInline", false);
        setBooleanField(term5897, term5897.getClass(), "empty", false);
        setBooleanField(term5897, term5897.getClass(), "selfClosing", false);
        setBooleanField(term5897, term5897.getClass(), "preserveWhitespace", false);
        term5900 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5900, term5900.getClass(), "tagName", "");
        setBooleanField(term5900, term5900.getClass(), "isBlock", false);
        setBooleanField(term5900, term5900.getClass(), "formatAsBlock", false);
        setBooleanField(term5900, term5900.getClass(), "canContainBlock", false);
        setBooleanField(term5900, term5900.getClass(), "canContainInline", false);
        setBooleanField(term5900, term5900.getClass(), "empty", false);
        setBooleanField(term5900, term5900.getClass(), "selfClosing", false);
        setBooleanField(term5900, term5900.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5677;
        Object retValue = callMethod(klass, "equals", argTypes, term5593, args);
        assertTrue(recursiveEquals(term5593, term5897));
        assertTrue(recursiveEquals(term5677, term5900));
        assertTrue(recursiveEquals(retValue, true));
    }

};


