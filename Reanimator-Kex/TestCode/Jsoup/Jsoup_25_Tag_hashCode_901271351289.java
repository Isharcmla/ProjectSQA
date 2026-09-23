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

public class Tag_hashCode_901271351289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22860;
     Object term23188;

    public Tag_hashCode_901271351289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22860 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22860, term22860.getClass(), "tagName", "");
        setBooleanField(term22860, term22860.getClass(), "isBlock", false);
        setBooleanField(term22860, term22860.getClass(), "formatAsBlock", false);
        setBooleanField(term22860, term22860.getClass(), "canContainBlock", false);
        setBooleanField(term22860, term22860.getClass(), "canContainInline", true);
        setBooleanField(term22860, term22860.getClass(), "empty", false);
        setBooleanField(term22860, term22860.getClass(), "selfClosing", true);
        setBooleanField(term22860, term22860.getClass(), "preserveWhitespace", true);
        term23188 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23188, term23188.getClass(), "tagName", "");
        setBooleanField(term23188, term23188.getClass(), "isBlock", false);
        setBooleanField(term23188, term23188.getClass(), "formatAsBlock", false);
        setBooleanField(term23188, term23188.getClass(), "canContainBlock", false);
        setBooleanField(term23188, term23188.getClass(), "canContainInline", true);
        setBooleanField(term23188, term23188.getClass(), "empty", false);
        setBooleanField(term23188, term23188.getClass(), "selfClosing", true);
        setBooleanField(term23188, term23188.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term22860, args);
        assertTrue(recursiveEquals(term22860, term23188));
        assertTrue(recursiveEquals(retValue, 29823));
    }

};


