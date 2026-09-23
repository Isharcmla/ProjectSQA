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

public class Tag_hashCode_901271351146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11414;
     Object term11605;

    public Tag_hashCode_901271351146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11414 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11414, term11414.getClass(), "tagName", "");
        setBooleanField(term11414, term11414.getClass(), "isBlock", true);
        setBooleanField(term11414, term11414.getClass(), "formatAsBlock", true);
        setBooleanField(term11414, term11414.getClass(), "canContainBlock", true);
        setBooleanField(term11414, term11414.getClass(), "canContainInline", false);
        setBooleanField(term11414, term11414.getClass(), "empty", true);
        term11605 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11605, term11605.getClass(), "tagName", "");
        setBooleanField(term11605, term11605.getClass(), "isBlock", true);
        setBooleanField(term11605, term11605.getClass(), "formatAsBlock", true);
        setBooleanField(term11605, term11605.getClass(), "canContainBlock", true);
        setBooleanField(term11605, term11605.getClass(), "canContainInline", false);
        setBooleanField(term11605, term11605.getClass(), "empty", true);
        setBooleanField(term11605, term11605.getClass(), "selfClosing", false);
        setBooleanField(term11605, term11605.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11414, args);
        assertTrue(recursiveEquals(term11414, term11605));
        assertTrue(recursiveEquals(retValue, 917057314));
    }

};


