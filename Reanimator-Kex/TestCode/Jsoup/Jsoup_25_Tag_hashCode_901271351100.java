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

public class Tag_hashCode_901271351100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7597;
     Object term7790;

    public Tag_hashCode_901271351100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7597 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7597, term7597.getClass(), "tagName", "");
        setBooleanField(term7597, term7597.getClass(), "isBlock", false);
        setBooleanField(term7597, term7597.getClass(), "formatAsBlock", false);
        setBooleanField(term7597, term7597.getClass(), "canContainBlock", false);
        setBooleanField(term7597, term7597.getClass(), "canContainInline", false);
        setBooleanField(term7597, term7597.getClass(), "empty", false);
        setBooleanField(term7597, term7597.getClass(), "selfClosing", true);
        term7790 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7790, term7790.getClass(), "tagName", "");
        setBooleanField(term7790, term7790.getClass(), "isBlock", false);
        setBooleanField(term7790, term7790.getClass(), "formatAsBlock", false);
        setBooleanField(term7790, term7790.getClass(), "canContainBlock", false);
        setBooleanField(term7790, term7790.getClass(), "canContainInline", false);
        setBooleanField(term7790, term7790.getClass(), "empty", false);
        setBooleanField(term7790, term7790.getClass(), "selfClosing", true);
        setBooleanField(term7790, term7790.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term7597, args);
        assertTrue(recursiveEquals(term7597, term7790));
        assertTrue(recursiveEquals(retValue, 31));
    }

};


