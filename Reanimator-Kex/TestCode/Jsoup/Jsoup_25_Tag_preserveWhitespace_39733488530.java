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

public class Tag_preserveWhitespace_39733488530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;
     Object term1165;

    public Tag_preserveWhitespace_39733488530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term337, term337.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term337, term337.getClass(), "isBlock", true);
        setBooleanField(term337, term337.getClass(), "formatAsBlock", false);
        setBooleanField(term337, term337.getClass(), "canContainBlock", false);
        setBooleanField(term337, term337.getClass(), "canContainInline", true);
        setBooleanField(term337, term337.getClass(), "empty", true);
        setBooleanField(term337, term337.getClass(), "selfClosing", true);
        setBooleanField(term337, term337.getClass(), "preserveWhitespace", false);
        term1165 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1165, term1165.getClass(), "tagName", "MxlszYVzRf");
        setBooleanField(term1165, term1165.getClass(), "isBlock", true);
        setBooleanField(term1165, term1165.getClass(), "formatAsBlock", false);
        setBooleanField(term1165, term1165.getClass(), "canContainBlock", false);
        setBooleanField(term1165, term1165.getClass(), "canContainInline", true);
        setBooleanField(term1165, term1165.getClass(), "empty", true);
        setBooleanField(term1165, term1165.getClass(), "selfClosing", true);
        setBooleanField(term1165, term1165.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "preserveWhitespace", argTypes, term337, args);
        assertTrue(recursiveEquals(term337, term1165));
    }

};


