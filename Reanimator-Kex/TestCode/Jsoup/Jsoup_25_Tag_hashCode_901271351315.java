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

public class Tag_hashCode_901271351315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25099;
     Object term25198;

    public Tag_hashCode_901271351315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25099 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25099, term25099.getClass(), "tagName", "");
        setBooleanField(term25099, term25099.getClass(), "isBlock", false);
        setBooleanField(term25099, term25099.getClass(), "formatAsBlock", true);
        setBooleanField(term25099, term25099.getClass(), "canContainBlock", true);
        setBooleanField(term25099, term25099.getClass(), "canContainInline", false);
        setBooleanField(term25099, term25099.getClass(), "empty", false);
        setBooleanField(term25099, term25099.getClass(), "selfClosing", true);
        setBooleanField(term25099, term25099.getClass(), "preserveWhitespace", true);
        term25198 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25198, term25198.getClass(), "tagName", "");
        setBooleanField(term25198, term25198.getClass(), "isBlock", false);
        setBooleanField(term25198, term25198.getClass(), "formatAsBlock", true);
        setBooleanField(term25198, term25198.getClass(), "canContainBlock", true);
        setBooleanField(term25198, term25198.getClass(), "canContainInline", false);
        setBooleanField(term25198, term25198.getClass(), "empty", false);
        setBooleanField(term25198, term25198.getClass(), "selfClosing", true);
        setBooleanField(term25198, term25198.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25099, args);
        assertTrue(recursiveEquals(term25099, term25198));
        assertTrue(recursiveEquals(retValue, 29552704));
    }

};


