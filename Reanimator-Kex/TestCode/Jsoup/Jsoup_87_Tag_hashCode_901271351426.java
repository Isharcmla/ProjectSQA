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

public class Tag_hashCode_901271351426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36915;
     Object term37118;

    public Tag_hashCode_901271351426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36915 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36915, term36915.getClass(), "tagName", "");
        setBooleanField(term36915, term36915.getClass(), "isBlock", true);
        setBooleanField(term36915, term36915.getClass(), "formatAsBlock", true);
        setBooleanField(term36915, term36915.getClass(), "canContainInline", false);
        setBooleanField(term36915, term36915.getClass(), "empty", false);
        setBooleanField(term36915, term36915.getClass(), "selfClosing", true);
        setBooleanField(term36915, term36915.getClass(), "preserveWhitespace", true);
        setBooleanField(term36915, term36915.getClass(), "formList", true);
        term37118 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37118, term37118.getClass(), "tagName", "");
        setBooleanField(term37118, term37118.getClass(), "isBlock", true);
        setBooleanField(term37118, term37118.getClass(), "formatAsBlock", true);
        setBooleanField(term37118, term37118.getClass(), "canContainInline", false);
        setBooleanField(term37118, term37118.getClass(), "empty", false);
        setBooleanField(term37118, term37118.getClass(), "selfClosing", true);
        setBooleanField(term37118, term37118.getClass(), "preserveWhitespace", true);
        setBooleanField(term37118, term37118.getClass(), "formList", true);
        setBooleanField(term37118, term37118.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36915, args);
        assertTrue(recursiveEquals(term36915, term37118));
        assertTrue(recursiveEquals(retValue, -1664622497));
    }

};


