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

public class Tag_hashCode_901271351173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13497;
     Object term13596;

    public Tag_hashCode_901271351173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13497 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13497, term13497.getClass(), "tagName", "");
        setBooleanField(term13497, term13497.getClass(), "isBlock", false);
        setBooleanField(term13497, term13497.getClass(), "formatAsBlock", false);
        setBooleanField(term13497, term13497.getClass(), "canContainBlock", false);
        setBooleanField(term13497, term13497.getClass(), "canContainInline", false);
        setBooleanField(term13497, term13497.getClass(), "empty", false);
        setBooleanField(term13497, term13497.getClass(), "selfClosing", true);
        setBooleanField(term13497, term13497.getClass(), "preserveWhitespace", true);
        term13596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13596, term13596.getClass(), "tagName", "");
        setBooleanField(term13596, term13596.getClass(), "isBlock", false);
        setBooleanField(term13596, term13596.getClass(), "formatAsBlock", false);
        setBooleanField(term13596, term13596.getClass(), "canContainBlock", false);
        setBooleanField(term13596, term13596.getClass(), "canContainInline", false);
        setBooleanField(term13596, term13596.getClass(), "empty", false);
        setBooleanField(term13596, term13596.getClass(), "selfClosing", true);
        setBooleanField(term13596, term13596.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term13497, args);
        assertTrue(recursiveEquals(term13497, term13596));
        assertTrue(recursiveEquals(retValue, 32));
    }

};


