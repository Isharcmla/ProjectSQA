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

public class Tag_hashCode_901271351237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18396;
     Object term18742;

    public Tag_hashCode_901271351237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18396 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18396, term18396.getClass(), "tagName", "");
        setBooleanField(term18396, term18396.getClass(), "isBlock", false);
        setBooleanField(term18396, term18396.getClass(), "formatAsBlock", true);
        setBooleanField(term18396, term18396.getClass(), "canContainBlock", true);
        setBooleanField(term18396, term18396.getClass(), "canContainInline", false);
        setBooleanField(term18396, term18396.getClass(), "empty", false);
        setBooleanField(term18396, term18396.getClass(), "selfClosing", false);
        setBooleanField(term18396, term18396.getClass(), "preserveWhitespace", true);
        term18742 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18742, term18742.getClass(), "tagName", "");
        setBooleanField(term18742, term18742.getClass(), "isBlock", false);
        setBooleanField(term18742, term18742.getClass(), "formatAsBlock", true);
        setBooleanField(term18742, term18742.getClass(), "canContainBlock", true);
        setBooleanField(term18742, term18742.getClass(), "canContainInline", false);
        setBooleanField(term18742, term18742.getClass(), "empty", false);
        setBooleanField(term18742, term18742.getClass(), "selfClosing", false);
        setBooleanField(term18742, term18742.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18396, args);
        assertTrue(recursiveEquals(term18396, term18742));
        assertTrue(recursiveEquals(retValue, 29552673));
    }

};


