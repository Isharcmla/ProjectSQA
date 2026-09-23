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

public class Tag_hashCode_901271351247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19359;
     Object term19437;

    public Tag_hashCode_901271351247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19359, term19359.getClass(), "tagName", "");
        setBooleanField(term19359, term19359.getClass(), "isBlock", false);
        setBooleanField(term19359, term19359.getClass(), "formatAsBlock", true);
        setBooleanField(term19359, term19359.getClass(), "canContainBlock", false);
        setBooleanField(term19359, term19359.getClass(), "canContainInline", true);
        setBooleanField(term19359, term19359.getClass(), "empty", true);
        setBooleanField(term19359, term19359.getClass(), "selfClosing", false);
        setBooleanField(term19359, term19359.getClass(), "preserveWhitespace", true);
        term19437 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19437, term19437.getClass(), "tagName", "");
        setBooleanField(term19437, term19437.getClass(), "isBlock", false);
        setBooleanField(term19437, term19437.getClass(), "formatAsBlock", true);
        setBooleanField(term19437, term19437.getClass(), "canContainBlock", false);
        setBooleanField(term19437, term19437.getClass(), "canContainInline", true);
        setBooleanField(term19437, term19437.getClass(), "empty", true);
        setBooleanField(term19437, term19437.getClass(), "selfClosing", false);
        setBooleanField(term19437, term19437.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19359, args);
        assertTrue(recursiveEquals(term19359, term19437));
        assertTrue(recursiveEquals(retValue, 28659904));
    }

};


