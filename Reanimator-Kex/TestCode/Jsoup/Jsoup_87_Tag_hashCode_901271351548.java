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

public class Tag_hashCode_901271351548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47199;
     Object term47402;

    public Tag_hashCode_901271351548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47199 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47199, term47199.getClass(), "tagName", "");
        setBooleanField(term47199, term47199.getClass(), "isBlock", true);
        setBooleanField(term47199, term47199.getClass(), "formatAsBlock", true);
        setBooleanField(term47199, term47199.getClass(), "canContainInline", true);
        setBooleanField(term47199, term47199.getClass(), "empty", false);
        setBooleanField(term47199, term47199.getClass(), "selfClosing", true);
        setBooleanField(term47199, term47199.getClass(), "preserveWhitespace", true);
        setBooleanField(term47199, term47199.getClass(), "formList", false);
        setBooleanField(term47199, term47199.getClass(), "formSubmit", true);
        term47402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47402, term47402.getClass(), "tagName", "");
        setBooleanField(term47402, term47402.getClass(), "isBlock", true);
        setBooleanField(term47402, term47402.getClass(), "formatAsBlock", true);
        setBooleanField(term47402, term47402.getClass(), "canContainInline", true);
        setBooleanField(term47402, term47402.getClass(), "empty", false);
        setBooleanField(term47402, term47402.getClass(), "selfClosing", true);
        setBooleanField(term47402, term47402.getClass(), "preserveWhitespace", true);
        setBooleanField(term47402, term47402.getClass(), "formList", false);
        setBooleanField(term47402, term47402.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47199, args);
        assertTrue(recursiveEquals(term47199, term47402));
        assertTrue(recursiveEquals(retValue, -1635993376));
    }

};


