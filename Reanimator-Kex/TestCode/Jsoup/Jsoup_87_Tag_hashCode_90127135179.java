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

public class Tag_hashCode_90127135179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5243;
     Object term5302;

    public Tag_hashCode_90127135179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5243 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5243, term5243.getClass(), "tagName", "");
        setBooleanField(term5243, term5243.getClass(), "isBlock", false);
        setBooleanField(term5243, term5243.getClass(), "formatAsBlock", false);
        setBooleanField(term5243, term5243.getClass(), "canContainInline", true);
        setBooleanField(term5243, term5243.getClass(), "empty", false);
        setBooleanField(term5243, term5243.getClass(), "selfClosing", false);
        setBooleanField(term5243, term5243.getClass(), "preserveWhitespace", false);
        setBooleanField(term5243, term5243.getClass(), "formList", true);
        term5302 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5302, term5302.getClass(), "tagName", "");
        setBooleanField(term5302, term5302.getClass(), "isBlock", false);
        setBooleanField(term5302, term5302.getClass(), "formatAsBlock", false);
        setBooleanField(term5302, term5302.getClass(), "canContainInline", true);
        setBooleanField(term5302, term5302.getClass(), "empty", false);
        setBooleanField(term5302, term5302.getClass(), "selfClosing", false);
        setBooleanField(term5302, term5302.getClass(), "preserveWhitespace", false);
        setBooleanField(term5302, term5302.getClass(), "formList", true);
        setBooleanField(term5302, term5302.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5243, args);
        assertTrue(recursiveEquals(term5243, term5302));
        assertTrue(recursiveEquals(retValue, 28629182));
    }

};


