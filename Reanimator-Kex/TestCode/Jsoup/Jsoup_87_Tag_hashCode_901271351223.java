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

public class Tag_hashCode_901271351223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19831;
     Object term19913;

    public Tag_hashCode_901271351223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19831 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19831, term19831.getClass(), "tagName", "");
        setBooleanField(term19831, term19831.getClass(), "isBlock", true);
        setBooleanField(term19831, term19831.getClass(), "formatAsBlock", true);
        setBooleanField(term19831, term19831.getClass(), "canContainInline", true);
        setBooleanField(term19831, term19831.getClass(), "empty", false);
        setBooleanField(term19831, term19831.getClass(), "selfClosing", false);
        setBooleanField(term19831, term19831.getClass(), "preserveWhitespace", true);
        term19913 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19913, term19913.getClass(), "tagName", "");
        setBooleanField(term19913, term19913.getClass(), "isBlock", true);
        setBooleanField(term19913, term19913.getClass(), "formatAsBlock", true);
        setBooleanField(term19913, term19913.getClass(), "canContainInline", true);
        setBooleanField(term19913, term19913.getClass(), "empty", false);
        setBooleanField(term19913, term19913.getClass(), "selfClosing", false);
        setBooleanField(term19913, term19913.getClass(), "preserveWhitespace", true);
        setBooleanField(term19913, term19913.getClass(), "formList", false);
        setBooleanField(term19913, term19913.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19831, args);
        assertTrue(recursiveEquals(term19831, term19913));
        assertTrue(recursiveEquals(retValue, -1636023168));
    }

};


