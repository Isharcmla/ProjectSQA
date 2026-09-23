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

public class Tag_hashCode_901271351102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7733;
     Object term7923;

    public Tag_hashCode_901271351102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7733 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7733, term7733.getClass(), "tagName", "");
        setBooleanField(term7733, term7733.getClass(), "isBlock", false);
        setBooleanField(term7733, term7733.getClass(), "formatAsBlock", false);
        setBooleanField(term7733, term7733.getClass(), "canContainBlock", false);
        setBooleanField(term7733, term7733.getClass(), "canContainInline", false);
        setBooleanField(term7733, term7733.getClass(), "empty", false);
        setBooleanField(term7733, term7733.getClass(), "selfClosing", false);
        setBooleanField(term7733, term7733.getClass(), "preserveWhitespace", true);
        term7923 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7923, term7923.getClass(), "tagName", "");
        setBooleanField(term7923, term7923.getClass(), "isBlock", false);
        setBooleanField(term7923, term7923.getClass(), "formatAsBlock", false);
        setBooleanField(term7923, term7923.getClass(), "canContainBlock", false);
        setBooleanField(term7923, term7923.getClass(), "canContainInline", false);
        setBooleanField(term7923, term7923.getClass(), "empty", false);
        setBooleanField(term7923, term7923.getClass(), "selfClosing", false);
        setBooleanField(term7923, term7923.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term7733, args);
        assertTrue(recursiveEquals(term7733, term7923));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


