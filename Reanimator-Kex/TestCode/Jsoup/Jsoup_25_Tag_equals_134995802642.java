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

public class Tag_equals_134995802642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963;
     Object term2077;
     Object term2078;

    public Tag_equals_134995802642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1963 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term2077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2077, term2077.getClass(), "tagName", null);
        setBooleanField(term2077, term2077.getClass(), "isBlock", false);
        setBooleanField(term2077, term2077.getClass(), "formatAsBlock", false);
        setBooleanField(term2077, term2077.getClass(), "canContainBlock", false);
        setBooleanField(term2077, term2077.getClass(), "canContainInline", false);
        setBooleanField(term2077, term2077.getClass(), "empty", false);
        setBooleanField(term2077, term2077.getClass(), "selfClosing", false);
        setBooleanField(term2077, term2077.getClass(), "preserveWhitespace", false);
        term2078 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2078, term2078.getClass(), "tagName", null);
        setBooleanField(term2078, term2078.getClass(), "isBlock", false);
        setBooleanField(term2078, term2078.getClass(), "formatAsBlock", false);
        setBooleanField(term2078, term2078.getClass(), "canContainBlock", false);
        setBooleanField(term2078, term2078.getClass(), "canContainInline", false);
        setBooleanField(term2078, term2078.getClass(), "empty", false);
        setBooleanField(term2078, term2078.getClass(), "selfClosing", false);
        setBooleanField(term2078, term2078.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1963;
        Object retValue = callMethod(klass, "equals", argTypes, term1963, args);
        assertTrue(recursiveEquals(term1963, term2077));
        assertTrue(recursiveEquals(term1963, term2078));
        assertTrue(recursiveEquals(retValue, true));
    }

};


