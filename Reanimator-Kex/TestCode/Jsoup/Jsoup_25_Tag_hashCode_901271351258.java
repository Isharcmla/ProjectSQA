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

public class Tag_hashCode_901271351258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20155;
     Object term20378;

    public Tag_hashCode_901271351258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20155 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20155, term20155.getClass(), "tagName", "");
        setBooleanField(term20155, term20155.getClass(), "isBlock", true);
        setBooleanField(term20155, term20155.getClass(), "formatAsBlock", true);
        setBooleanField(term20155, term20155.getClass(), "canContainBlock", true);
        setBooleanField(term20155, term20155.getClass(), "canContainInline", true);
        setBooleanField(term20155, term20155.getClass(), "empty", true);
        setBooleanField(term20155, term20155.getClass(), "selfClosing", false);
        setBooleanField(term20155, term20155.getClass(), "preserveWhitespace", true);
        term20378 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20378, term20378.getClass(), "tagName", "");
        setBooleanField(term20378, term20378.getClass(), "isBlock", true);
        setBooleanField(term20378, term20378.getClass(), "formatAsBlock", true);
        setBooleanField(term20378, term20378.getClass(), "canContainBlock", true);
        setBooleanField(term20378, term20378.getClass(), "canContainInline", true);
        setBooleanField(term20378, term20378.getClass(), "empty", true);
        setBooleanField(term20378, term20378.getClass(), "selfClosing", false);
        setBooleanField(term20378, term20378.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20155, args);
        assertTrue(recursiveEquals(term20155, term20378));
        assertTrue(recursiveEquals(retValue, 917087106));
    }

};


