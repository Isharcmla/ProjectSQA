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

public class Tag_hashCode_901271351233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20672;
     Object term20731;

    public Tag_hashCode_901271351233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20672 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20672, term20672.getClass(), "tagName", "");
        setBooleanField(term20672, term20672.getClass(), "isBlock", true);
        setBooleanField(term20672, term20672.getClass(), "formatAsBlock", true);
        setBooleanField(term20672, term20672.getClass(), "canContainInline", false);
        setBooleanField(term20672, term20672.getClass(), "empty", true);
        setBooleanField(term20672, term20672.getClass(), "selfClosing", true);
        term20731 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20731, term20731.getClass(), "tagName", "");
        setBooleanField(term20731, term20731.getClass(), "isBlock", true);
        setBooleanField(term20731, term20731.getClass(), "formatAsBlock", true);
        setBooleanField(term20731, term20731.getClass(), "canContainInline", false);
        setBooleanField(term20731, term20731.getClass(), "empty", true);
        setBooleanField(term20731, term20731.getClass(), "selfClosing", true);
        setBooleanField(term20731, term20731.getClass(), "preserveWhitespace", false);
        setBooleanField(term20731, term20731.getClass(), "formList", false);
        setBooleanField(term20731, term20731.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20672, args);
        assertTrue(recursiveEquals(term20672, term20731));
        assertTrue(recursiveEquals(retValue, -1663699968));
    }

};


