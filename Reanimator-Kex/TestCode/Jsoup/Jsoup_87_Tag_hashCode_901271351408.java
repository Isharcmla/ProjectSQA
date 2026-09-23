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

public class Tag_hashCode_901271351408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35349;
     Object term35568;

    public Tag_hashCode_901271351408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35349 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35349, term35349.getClass(), "tagName", "");
        setBooleanField(term35349, term35349.getClass(), "isBlock", true);
        setBooleanField(term35349, term35349.getClass(), "formatAsBlock", false);
        setBooleanField(term35349, term35349.getClass(), "canContainInline", true);
        setBooleanField(term35349, term35349.getClass(), "empty", true);
        setBooleanField(term35349, term35349.getClass(), "selfClosing", true);
        setBooleanField(term35349, term35349.getClass(), "preserveWhitespace", false);
        setBooleanField(term35349, term35349.getClass(), "formList", true);
        setBooleanField(term35349, term35349.getClass(), "formSubmit", true);
        term35568 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35568, term35568.getClass(), "tagName", "");
        setBooleanField(term35568, term35568.getClass(), "isBlock", true);
        setBooleanField(term35568, term35568.getClass(), "formatAsBlock", false);
        setBooleanField(term35568, term35568.getClass(), "canContainInline", true);
        setBooleanField(term35568, term35568.getClass(), "empty", true);
        setBooleanField(term35568, term35568.getClass(), "selfClosing", true);
        setBooleanField(term35568, term35568.getClass(), "preserveWhitespace", false);
        setBooleanField(term35568, term35568.getClass(), "formList", true);
        setBooleanField(term35568, term35568.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term35349, args);
        assertTrue(recursiveEquals(term35349, term35568));
        assertTrue(recursiveEquals(retValue, 1772392830));
    }

};


