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
     Object term18191;
     Object term18290;

    public Tag_hashCode_901271351233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18191 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18191, term18191.getClass(), "tagName", "");
        setBooleanField(term18191, term18191.getClass(), "isBlock", true);
        setBooleanField(term18191, term18191.getClass(), "formatAsBlock", true);
        setBooleanField(term18191, term18191.getClass(), "canContainBlock", true);
        setBooleanField(term18191, term18191.getClass(), "canContainInline", false);
        setBooleanField(term18191, term18191.getClass(), "empty", true);
        setBooleanField(term18191, term18191.getClass(), "selfClosing", true);
        term18290 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18290, term18290.getClass(), "tagName", "");
        setBooleanField(term18290, term18290.getClass(), "isBlock", true);
        setBooleanField(term18290, term18290.getClass(), "formatAsBlock", true);
        setBooleanField(term18290, term18290.getClass(), "canContainBlock", true);
        setBooleanField(term18290, term18290.getClass(), "canContainInline", false);
        setBooleanField(term18290, term18290.getClass(), "empty", true);
        setBooleanField(term18290, term18290.getClass(), "selfClosing", true);
        setBooleanField(term18290, term18290.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18191, args);
        assertTrue(recursiveEquals(term18191, term18290));
        assertTrue(recursiveEquals(retValue, 917057345));
    }

};


