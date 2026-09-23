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

public class Tag_hashCode_901271351227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20027;
     Object term20376;

    public Tag_hashCode_901271351227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20027 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20027, term20027.getClass(), "tagName", "");
        setBooleanField(term20027, term20027.getClass(), "isBlock", false);
        setBooleanField(term20027, term20027.getClass(), "formatAsBlock", true);
        setBooleanField(term20027, term20027.getClass(), "canContainInline", false);
        setBooleanField(term20027, term20027.getClass(), "empty", true);
        setBooleanField(term20027, term20027.getClass(), "selfClosing", false);
        setBooleanField(term20027, term20027.getClass(), "preserveWhitespace", false);
        setBooleanField(term20027, term20027.getClass(), "formList", true);
        setBooleanField(term20027, term20027.getClass(), "formSubmit", true);
        term20376 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20376, term20376.getClass(), "tagName", "");
        setBooleanField(term20376, term20376.getClass(), "isBlock", false);
        setBooleanField(term20376, term20376.getClass(), "formatAsBlock", true);
        setBooleanField(term20376, term20376.getClass(), "canContainInline", false);
        setBooleanField(term20376, term20376.getClass(), "empty", true);
        setBooleanField(term20376, term20376.getClass(), "selfClosing", false);
        setBooleanField(term20376, term20376.getClass(), "preserveWhitespace", false);
        setBooleanField(term20376, term20376.getClass(), "formList", true);
        setBooleanField(term20376, term20376.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20027, args);
        assertTrue(recursiveEquals(term20027, term20376));
        assertTrue(recursiveEquals(retValue, 888427234));
    }

};


