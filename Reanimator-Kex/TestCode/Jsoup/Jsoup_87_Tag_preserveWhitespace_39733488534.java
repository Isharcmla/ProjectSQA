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

public class Tag_preserveWhitespace_39733488534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term1465;

    public Tag_preserveWhitespace_39733488534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term371, term371.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term371, term371.getClass(), "isBlock", false);
        setBooleanField(term371, term371.getClass(), "formatAsBlock", false);
        setBooleanField(term371, term371.getClass(), "canContainInline", true);
        setBooleanField(term371, term371.getClass(), "empty", false);
        setBooleanField(term371, term371.getClass(), "selfClosing", false);
        setBooleanField(term371, term371.getClass(), "preserveWhitespace", true);
        setBooleanField(term371, term371.getClass(), "formList", false);
        setBooleanField(term371, term371.getClass(), "formSubmit", false);
        term1465 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1465, term1465.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term1465, term1465.getClass(), "isBlock", false);
        setBooleanField(term1465, term1465.getClass(), "formatAsBlock", false);
        setBooleanField(term1465, term1465.getClass(), "canContainInline", true);
        setBooleanField(term1465, term1465.getClass(), "empty", false);
        setBooleanField(term1465, term1465.getClass(), "selfClosing", false);
        setBooleanField(term1465, term1465.getClass(), "preserveWhitespace", true);
        setBooleanField(term1465, term1465.getClass(), "formList", false);
        setBooleanField(term1465, term1465.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preserveWhitespace", argTypes, term371, args);
        assertTrue(recursiveEquals(term371, term1465));
    }

};


