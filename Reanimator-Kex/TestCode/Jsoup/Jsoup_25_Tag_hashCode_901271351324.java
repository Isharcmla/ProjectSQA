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

public class Tag_hashCode_901271351324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25773;
     Object term25966;

    public Tag_hashCode_901271351324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25773 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25773, term25773.getClass(), "tagName", "");
        setBooleanField(term25773, term25773.getClass(), "isBlock", false);
        setBooleanField(term25773, term25773.getClass(), "formatAsBlock", true);
        setBooleanField(term25773, term25773.getClass(), "canContainBlock", false);
        setBooleanField(term25773, term25773.getClass(), "canContainInline", true);
        setBooleanField(term25773, term25773.getClass(), "empty", false);
        setBooleanField(term25773, term25773.getClass(), "selfClosing", true);
        term25966 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25966, term25966.getClass(), "tagName", "");
        setBooleanField(term25966, term25966.getClass(), "isBlock", false);
        setBooleanField(term25966, term25966.getClass(), "formatAsBlock", true);
        setBooleanField(term25966, term25966.getClass(), "canContainBlock", false);
        setBooleanField(term25966, term25966.getClass(), "canContainInline", true);
        setBooleanField(term25966, term25966.getClass(), "empty", false);
        setBooleanField(term25966, term25966.getClass(), "selfClosing", true);
        setBooleanField(term25966, term25966.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25773, args);
        assertTrue(recursiveEquals(term25773, term25966));
        assertTrue(recursiveEquals(retValue, 28658973));
    }

};


