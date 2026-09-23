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

public class Tag_isBlock_9747519925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term1061;

    public Tag_isBlock_9747519925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term101, term101.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term101, term101.getClass(), "isBlock", false);
        setBooleanField(term101, term101.getClass(), "formatAsBlock", true);
        setBooleanField(term101, term101.getClass(), "canContainInline", false);
        setBooleanField(term101, term101.getClass(), "empty", true);
        setBooleanField(term101, term101.getClass(), "selfClosing", false);
        setBooleanField(term101, term101.getClass(), "preserveWhitespace", false);
        setBooleanField(term101, term101.getClass(), "formList", true);
        setBooleanField(term101, term101.getClass(), "formSubmit", true);
        term1061 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1061, term1061.getClass(), "tagName", "jJCZpVmanW");
        setBooleanField(term1061, term1061.getClass(), "isBlock", false);
        setBooleanField(term1061, term1061.getClass(), "formatAsBlock", true);
        setBooleanField(term1061, term1061.getClass(), "canContainInline", false);
        setBooleanField(term1061, term1061.getClass(), "empty", true);
        setBooleanField(term1061, term1061.getClass(), "selfClosing", false);
        setBooleanField(term1061, term1061.getClass(), "preserveWhitespace", false);
        setBooleanField(term1061, term1061.getClass(), "formList", true);
        setBooleanField(term1061, term1061.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term101, args);
        assertTrue(recursiveEquals(term101, term1061));
    }

};


