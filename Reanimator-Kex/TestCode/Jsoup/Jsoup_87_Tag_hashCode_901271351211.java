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

public class Tag_hashCode_901271351211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18854;
     Object term18913;

    public Tag_hashCode_901271351211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18854 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18854, term18854.getClass(), "tagName", "");
        setBooleanField(term18854, term18854.getClass(), "isBlock", false);
        setBooleanField(term18854, term18854.getClass(), "formatAsBlock", true);
        setBooleanField(term18854, term18854.getClass(), "canContainInline", true);
        setBooleanField(term18854, term18854.getClass(), "empty", false);
        setBooleanField(term18854, term18854.getClass(), "selfClosing", true);
        term18913 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18913, term18913.getClass(), "tagName", "");
        setBooleanField(term18913, term18913.getClass(), "isBlock", false);
        setBooleanField(term18913, term18913.getClass(), "formatAsBlock", true);
        setBooleanField(term18913, term18913.getClass(), "canContainInline", true);
        setBooleanField(term18913, term18913.getClass(), "empty", false);
        setBooleanField(term18913, term18913.getClass(), "selfClosing", true);
        setBooleanField(term18913, term18913.getClass(), "preserveWhitespace", false);
        setBooleanField(term18913, term18913.getClass(), "formList", false);
        setBooleanField(term18913, term18913.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18854, args);
        assertTrue(recursiveEquals(term18854, term18913));
        assertTrue(recursiveEquals(retValue, 916162623));
    }

};


