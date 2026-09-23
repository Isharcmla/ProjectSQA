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

public class Tag_hashCode_901271351109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8359;
     Object term8437;

    public Tag_hashCode_901271351109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8359 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8359, term8359.getClass(), "tagName", "");
        setBooleanField(term8359, term8359.getClass(), "isBlock", true);
        setBooleanField(term8359, term8359.getClass(), "formatAsBlock", false);
        setBooleanField(term8359, term8359.getClass(), "canContainBlock", true);
        setBooleanField(term8359, term8359.getClass(), "canContainInline", false);
        setBooleanField(term8359, term8359.getClass(), "empty", false);
        setBooleanField(term8359, term8359.getClass(), "selfClosing", false);
        setBooleanField(term8359, term8359.getClass(), "preserveWhitespace", true);
        term8437 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8437, term8437.getClass(), "tagName", "");
        setBooleanField(term8437, term8437.getClass(), "isBlock", true);
        setBooleanField(term8437, term8437.getClass(), "formatAsBlock", false);
        setBooleanField(term8437, term8437.getClass(), "canContainBlock", true);
        setBooleanField(term8437, term8437.getClass(), "canContainInline", false);
        setBooleanField(term8437, term8437.getClass(), "empty", false);
        setBooleanField(term8437, term8437.getClass(), "selfClosing", false);
        setBooleanField(term8437, term8437.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8359, args);
        assertTrue(recursiveEquals(term8359, term8437));
        assertTrue(recursiveEquals(retValue, 888427203));
    }

};


