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

public class Tag_hashCode_901271351327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26073;
     Object term26151;

    public Tag_hashCode_901271351327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26073 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26073, term26073.getClass(), "tagName", "");
        setBooleanField(term26073, term26073.getClass(), "isBlock", false);
        setBooleanField(term26073, term26073.getClass(), "formatAsBlock", true);
        setBooleanField(term26073, term26073.getClass(), "canContainBlock", true);
        setBooleanField(term26073, term26073.getClass(), "canContainInline", false);
        setBooleanField(term26073, term26073.getClass(), "empty", true);
        setBooleanField(term26073, term26073.getClass(), "selfClosing", false);
        setBooleanField(term26073, term26073.getClass(), "preserveWhitespace", true);
        term26151 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26151, term26151.getClass(), "tagName", "");
        setBooleanField(term26151, term26151.getClass(), "isBlock", false);
        setBooleanField(term26151, term26151.getClass(), "formatAsBlock", true);
        setBooleanField(term26151, term26151.getClass(), "canContainBlock", true);
        setBooleanField(term26151, term26151.getClass(), "canContainInline", false);
        setBooleanField(term26151, term26151.getClass(), "empty", true);
        setBooleanField(term26151, term26151.getClass(), "selfClosing", false);
        setBooleanField(term26151, term26151.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26073, args);
        assertTrue(recursiveEquals(term26073, term26151));
        assertTrue(recursiveEquals(retValue, 29553634));
    }

};


