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

public class Tag_hashCode_901271351265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20831;
     Object term20888;

    public Tag_hashCode_901271351265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20831 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20831, term20831.getClass(), "tagName", "");
        setBooleanField(term20831, term20831.getClass(), "isBlock", false);
        setBooleanField(term20831, term20831.getClass(), "formatAsBlock", false);
        setBooleanField(term20831, term20831.getClass(), "canContainBlock", true);
        setBooleanField(term20831, term20831.getClass(), "canContainInline", true);
        setBooleanField(term20831, term20831.getClass(), "empty", false);
        setBooleanField(term20831, term20831.getClass(), "selfClosing", false);
        setBooleanField(term20831, term20831.getClass(), "preserveWhitespace", true);
        term20888 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20888, term20888.getClass(), "tagName", "");
        setBooleanField(term20888, term20888.getClass(), "isBlock", false);
        setBooleanField(term20888, term20888.getClass(), "formatAsBlock", false);
        setBooleanField(term20888, term20888.getClass(), "canContainBlock", true);
        setBooleanField(term20888, term20888.getClass(), "canContainInline", true);
        setBooleanField(term20888, term20888.getClass(), "empty", false);
        setBooleanField(term20888, term20888.getClass(), "selfClosing", false);
        setBooleanField(term20888, term20888.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20831, args);
        assertTrue(recursiveEquals(term20831, term20888));
        assertTrue(recursiveEquals(retValue, 953313));
    }

};


