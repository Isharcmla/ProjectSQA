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

public class Tag_hashCode_901271351277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21693;
     Object term22106;

    public Tag_hashCode_901271351277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21693 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21693, term21693.getClass(), "tagName", "");
        setBooleanField(term21693, term21693.getClass(), "isBlock", true);
        setBooleanField(term21693, term21693.getClass(), "formatAsBlock", true);
        setBooleanField(term21693, term21693.getClass(), "canContainBlock", false);
        setBooleanField(term21693, term21693.getClass(), "canContainInline", false);
        setBooleanField(term21693, term21693.getClass(), "empty", true);
        setBooleanField(term21693, term21693.getClass(), "selfClosing", true);
        term22106 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22106, term22106.getClass(), "tagName", "");
        setBooleanField(term22106, term22106.getClass(), "isBlock", true);
        setBooleanField(term22106, term22106.getClass(), "formatAsBlock", true);
        setBooleanField(term22106, term22106.getClass(), "canContainBlock", false);
        setBooleanField(term22106, term22106.getClass(), "canContainInline", false);
        setBooleanField(term22106, term22106.getClass(), "empty", true);
        setBooleanField(term22106, term22106.getClass(), "selfClosing", true);
        setBooleanField(term22106, term22106.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21693, args);
        assertTrue(recursiveEquals(term21693, term22106));
        assertTrue(recursiveEquals(retValue, 916133824));
    }

};


