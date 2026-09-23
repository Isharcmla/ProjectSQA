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

public class Tag_hashCode_901271351270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21136;
     Object term21359;

    public Tag_hashCode_901271351270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21136 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21136, term21136.getClass(), "tagName", "");
        setBooleanField(term21136, term21136.getClass(), "isBlock", true);
        setBooleanField(term21136, term21136.getClass(), "formatAsBlock", true);
        setBooleanField(term21136, term21136.getClass(), "canContainBlock", true);
        setBooleanField(term21136, term21136.getClass(), "canContainInline", false);
        setBooleanField(term21136, term21136.getClass(), "empty", true);
        setBooleanField(term21136, term21136.getClass(), "selfClosing", true);
        setBooleanField(term21136, term21136.getClass(), "preserveWhitespace", true);
        term21359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21359, term21359.getClass(), "tagName", "");
        setBooleanField(term21359, term21359.getClass(), "isBlock", true);
        setBooleanField(term21359, term21359.getClass(), "formatAsBlock", true);
        setBooleanField(term21359, term21359.getClass(), "canContainBlock", true);
        setBooleanField(term21359, term21359.getClass(), "canContainInline", false);
        setBooleanField(term21359, term21359.getClass(), "empty", true);
        setBooleanField(term21359, term21359.getClass(), "selfClosing", true);
        setBooleanField(term21359, term21359.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21136, args);
        assertTrue(recursiveEquals(term21136, term21359));
        assertTrue(recursiveEquals(retValue, 917057346));
    }

};


