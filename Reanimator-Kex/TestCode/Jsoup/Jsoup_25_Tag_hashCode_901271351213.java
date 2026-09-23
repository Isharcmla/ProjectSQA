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

public class Tag_hashCode_901271351213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16633;
     Object term16711;

    public Tag_hashCode_901271351213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16633 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16633, term16633.getClass(), "tagName", "");
        setBooleanField(term16633, term16633.getClass(), "isBlock", true);
        setBooleanField(term16633, term16633.getClass(), "formatAsBlock", true);
        setBooleanField(term16633, term16633.getClass(), "canContainBlock", true);
        setBooleanField(term16633, term16633.getClass(), "canContainInline", false);
        setBooleanField(term16633, term16633.getClass(), "empty", true);
        setBooleanField(term16633, term16633.getClass(), "selfClosing", false);
        setBooleanField(term16633, term16633.getClass(), "preserveWhitespace", true);
        term16711 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16711, term16711.getClass(), "tagName", "");
        setBooleanField(term16711, term16711.getClass(), "isBlock", true);
        setBooleanField(term16711, term16711.getClass(), "formatAsBlock", true);
        setBooleanField(term16711, term16711.getClass(), "canContainBlock", true);
        setBooleanField(term16711, term16711.getClass(), "canContainInline", false);
        setBooleanField(term16711, term16711.getClass(), "empty", true);
        setBooleanField(term16711, term16711.getClass(), "selfClosing", false);
        setBooleanField(term16711, term16711.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16633, args);
        assertTrue(recursiveEquals(term16633, term16711));
        assertTrue(recursiveEquals(retValue, 917057315));
    }

};


