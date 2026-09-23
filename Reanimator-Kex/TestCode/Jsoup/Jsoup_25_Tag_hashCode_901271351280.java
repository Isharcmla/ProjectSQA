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

public class Tag_hashCode_901271351280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22212;
     Object term22404;

    public Tag_hashCode_901271351280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22212 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22212, term22212.getClass(), "tagName", "");
        setBooleanField(term22212, term22212.getClass(), "isBlock", false);
        setBooleanField(term22212, term22212.getClass(), "formatAsBlock", false);
        setBooleanField(term22212, term22212.getClass(), "canContainBlock", true);
        setBooleanField(term22212, term22212.getClass(), "canContainInline", true);
        setBooleanField(term22212, term22212.getClass(), "empty", false);
        setBooleanField(term22212, term22212.getClass(), "selfClosing", true);
        setBooleanField(term22212, term22212.getClass(), "preserveWhitespace", true);
        term22404 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22404, term22404.getClass(), "tagName", "");
        setBooleanField(term22404, term22404.getClass(), "isBlock", false);
        setBooleanField(term22404, term22404.getClass(), "formatAsBlock", false);
        setBooleanField(term22404, term22404.getClass(), "canContainBlock", true);
        setBooleanField(term22404, term22404.getClass(), "canContainInline", true);
        setBooleanField(term22404, term22404.getClass(), "empty", false);
        setBooleanField(term22404, term22404.getClass(), "selfClosing", true);
        setBooleanField(term22404, term22404.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22212, args);
        assertTrue(recursiveEquals(term22212, term22404));
        assertTrue(recursiveEquals(retValue, 953344));
    }

};


