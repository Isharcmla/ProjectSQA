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

public class Tag_hashCode_901271351416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36053;
     Object term36263;

    public Tag_hashCode_901271351416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36053 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36053, term36053.getClass(), "tagName", "");
        setBooleanField(term36053, term36053.getClass(), "isBlock", true);
        setBooleanField(term36053, term36053.getClass(), "formatAsBlock", true);
        setBooleanField(term36053, term36053.getClass(), "canContainInline", true);
        setBooleanField(term36053, term36053.getClass(), "empty", true);
        setBooleanField(term36053, term36053.getClass(), "selfClosing", true);
        setBooleanField(term36053, term36053.getClass(), "preserveWhitespace", false);
        setBooleanField(term36053, term36053.getClass(), "formList", false);
        setBooleanField(term36053, term36053.getClass(), "formSubmit", true);
        term36263 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36263, term36263.getClass(), "tagName", "");
        setBooleanField(term36263, term36263.getClass(), "isBlock", true);
        setBooleanField(term36263, term36263.getClass(), "formatAsBlock", true);
        setBooleanField(term36263, term36263.getClass(), "canContainInline", true);
        setBooleanField(term36263, term36263.getClass(), "empty", true);
        setBooleanField(term36263, term36263.getClass(), "selfClosing", true);
        setBooleanField(term36263, term36263.getClass(), "preserveWhitespace", false);
        setBooleanField(term36263, term36263.getClass(), "formList", false);
        setBooleanField(term36263, term36263.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36053, args);
        assertTrue(recursiveEquals(term36053, term36263));
        assertTrue(recursiveEquals(retValue, -1635070816));
    }

};


