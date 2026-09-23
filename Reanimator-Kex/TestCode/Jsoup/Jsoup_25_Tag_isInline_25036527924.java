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

public class Tag_isInline_25036527924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term904;

    public Tag_isInline_25036527924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term165, term165.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term165, term165.getClass(), "isBlock", true);
        setBooleanField(term165, term165.getClass(), "formatAsBlock", true);
        setBooleanField(term165, term165.getClass(), "canContainBlock", true);
        setBooleanField(term165, term165.getClass(), "canContainInline", true);
        setBooleanField(term165, term165.getClass(), "empty", true);
        setBooleanField(term165, term165.getClass(), "selfClosing", true);
        setBooleanField(term165, term165.getClass(), "preserveWhitespace", false);
        term904 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term904, term904.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term904, term904.getClass(), "isBlock", true);
        setBooleanField(term904, term904.getClass(), "formatAsBlock", true);
        setBooleanField(term904, term904.getClass(), "canContainBlock", true);
        setBooleanField(term904, term904.getClass(), "canContainInline", true);
        setBooleanField(term904, term904.getClass(), "empty", true);
        setBooleanField(term904, term904.getClass(), "selfClosing", true);
        setBooleanField(term904, term904.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isInline", argTypes, term165, args);
        assertTrue(recursiveEquals(term165, term904));
        assertTrue(recursiveEquals(retValue, false));
    }

};


