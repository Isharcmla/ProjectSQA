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

public class Tag_hashCode_901271351238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18541;
     Object term18763;

    public Tag_hashCode_901271351238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18541 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18541, term18541.getClass(), "tagName", "");
        setBooleanField(term18541, term18541.getClass(), "isBlock", true);
        setBooleanField(term18541, term18541.getClass(), "formatAsBlock", false);
        setBooleanField(term18541, term18541.getClass(), "canContainBlock", true);
        setBooleanField(term18541, term18541.getClass(), "canContainInline", false);
        setBooleanField(term18541, term18541.getClass(), "empty", true);
        setBooleanField(term18541, term18541.getClass(), "selfClosing", true);
        setBooleanField(term18541, term18541.getClass(), "preserveWhitespace", true);
        term18763 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18763, term18763.getClass(), "tagName", "");
        setBooleanField(term18763, term18763.getClass(), "isBlock", true);
        setBooleanField(term18763, term18763.getClass(), "formatAsBlock", false);
        setBooleanField(term18763, term18763.getClass(), "canContainBlock", true);
        setBooleanField(term18763, term18763.getClass(), "canContainInline", false);
        setBooleanField(term18763, term18763.getClass(), "empty", true);
        setBooleanField(term18763, term18763.getClass(), "selfClosing", true);
        setBooleanField(term18763, term18763.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18541, args);
        assertTrue(recursiveEquals(term18541, term18763));
        assertTrue(recursiveEquals(retValue, 888428195));
    }

};


