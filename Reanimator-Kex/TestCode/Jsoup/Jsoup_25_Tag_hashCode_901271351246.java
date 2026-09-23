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

public class Tag_hashCode_901271351246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19216;
     Object term19416;

    public Tag_hashCode_901271351246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19216 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19216, term19216.getClass(), "tagName", "");
        setBooleanField(term19216, term19216.getClass(), "isBlock", false);
        setBooleanField(term19216, term19216.getClass(), "formatAsBlock", false);
        setBooleanField(term19216, term19216.getClass(), "canContainBlock", false);
        setBooleanField(term19216, term19216.getClass(), "canContainInline", false);
        setBooleanField(term19216, term19216.getClass(), "empty", true);
        setBooleanField(term19216, term19216.getClass(), "selfClosing", false);
        setBooleanField(term19216, term19216.getClass(), "preserveWhitespace", true);
        term19416 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term19416, term19416.getClass(), "tagName", "");
        setBooleanField(term19416, term19416.getClass(), "isBlock", false);
        setBooleanField(term19416, term19416.getClass(), "formatAsBlock", false);
        setBooleanField(term19416, term19416.getClass(), "canContainBlock", false);
        setBooleanField(term19416, term19416.getClass(), "canContainInline", false);
        setBooleanField(term19416, term19416.getClass(), "empty", true);
        setBooleanField(term19416, term19416.getClass(), "selfClosing", false);
        setBooleanField(term19416, term19416.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term19216, args);
        assertTrue(recursiveEquals(term19216, term19416));
        assertTrue(recursiveEquals(retValue, 962));
    }

};


