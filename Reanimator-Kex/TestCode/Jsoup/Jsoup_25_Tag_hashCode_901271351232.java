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

public class Tag_hashCode_901271351232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18053;
     Object term18269;

    public Tag_hashCode_901271351232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18053 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18053, term18053.getClass(), "tagName", "");
        setBooleanField(term18053, term18053.getClass(), "isBlock", true);
        setBooleanField(term18053, term18053.getClass(), "formatAsBlock", false);
        setBooleanField(term18053, term18053.getClass(), "canContainBlock", false);
        setBooleanField(term18053, term18053.getClass(), "canContainInline", true);
        setBooleanField(term18053, term18053.getClass(), "empty", true);
        setBooleanField(term18053, term18053.getClass(), "selfClosing", true);
        term18269 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18269, term18269.getClass(), "tagName", "");
        setBooleanField(term18269, term18269.getClass(), "isBlock", true);
        setBooleanField(term18269, term18269.getClass(), "formatAsBlock", false);
        setBooleanField(term18269, term18269.getClass(), "canContainBlock", false);
        setBooleanField(term18269, term18269.getClass(), "canContainInline", true);
        setBooleanField(term18269, term18269.getClass(), "empty", true);
        setBooleanField(term18269, term18269.getClass(), "selfClosing", true);
        setBooleanField(term18269, term18269.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18053, args);
        assertTrue(recursiveEquals(term18053, term18269));
        assertTrue(recursiveEquals(retValue, 887534464));
    }

};


