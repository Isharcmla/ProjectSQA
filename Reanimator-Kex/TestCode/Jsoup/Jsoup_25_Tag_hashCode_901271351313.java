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

public class Tag_hashCode_901271351313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24811;
     Object term25156;

    public Tag_hashCode_901271351313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24811 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24811, term24811.getClass(), "tagName", "");
        setBooleanField(term24811, term24811.getClass(), "isBlock", false);
        setBooleanField(term24811, term24811.getClass(), "formatAsBlock", false);
        setBooleanField(term24811, term24811.getClass(), "canContainBlock", false);
        setBooleanField(term24811, term24811.getClass(), "canContainInline", true);
        setBooleanField(term24811, term24811.getClass(), "empty", true);
        setBooleanField(term24811, term24811.getClass(), "selfClosing", true);
        setBooleanField(term24811, term24811.getClass(), "preserveWhitespace", true);
        term25156 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25156, term25156.getClass(), "tagName", "");
        setBooleanField(term25156, term25156.getClass(), "isBlock", false);
        setBooleanField(term25156, term25156.getClass(), "formatAsBlock", false);
        setBooleanField(term25156, term25156.getClass(), "canContainBlock", false);
        setBooleanField(term25156, term25156.getClass(), "canContainInline", true);
        setBooleanField(term25156, term25156.getClass(), "empty", true);
        setBooleanField(term25156, term25156.getClass(), "selfClosing", true);
        setBooleanField(term25156, term25156.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24811, args);
        assertTrue(recursiveEquals(term24811, term25156));
        assertTrue(recursiveEquals(retValue, 30784));
    }

};


