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

public class Tag_hashCode_901271351281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22347;
     Object term22425;

    public Tag_hashCode_901271351281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22347 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22347, term22347.getClass(), "tagName", "");
        setBooleanField(term22347, term22347.getClass(), "isBlock", false);
        setBooleanField(term22347, term22347.getClass(), "formatAsBlock", true);
        setBooleanField(term22347, term22347.getClass(), "canContainBlock", true);
        setBooleanField(term22347, term22347.getClass(), "canContainInline", false);
        setBooleanField(term22347, term22347.getClass(), "empty", false);
        setBooleanField(term22347, term22347.getClass(), "selfClosing", true);
        term22425 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22425, term22425.getClass(), "tagName", "");
        setBooleanField(term22425, term22425.getClass(), "isBlock", false);
        setBooleanField(term22425, term22425.getClass(), "formatAsBlock", true);
        setBooleanField(term22425, term22425.getClass(), "canContainBlock", true);
        setBooleanField(term22425, term22425.getClass(), "canContainInline", false);
        setBooleanField(term22425, term22425.getClass(), "empty", false);
        setBooleanField(term22425, term22425.getClass(), "selfClosing", true);
        setBooleanField(term22425, term22425.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22347, args);
        assertTrue(recursiveEquals(term22347, term22425));
        assertTrue(recursiveEquals(retValue, 29552703));
    }

};


