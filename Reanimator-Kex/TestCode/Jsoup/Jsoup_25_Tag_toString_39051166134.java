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

public class Tag_toString_39051166134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458;
     Object term1374;

    public Tag_toString_39051166134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term458, term458.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term458, term458.getClass(), "isBlock", true);
        setBooleanField(term458, term458.getClass(), "formatAsBlock", true);
        setBooleanField(term458, term458.getClass(), "canContainBlock", true);
        setBooleanField(term458, term458.getClass(), "canContainInline", false);
        setBooleanField(term458, term458.getClass(), "empty", false);
        setBooleanField(term458, term458.getClass(), "selfClosing", true);
        setBooleanField(term458, term458.getClass(), "preserveWhitespace", true);
        term1374 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1374, term1374.getClass(), "tagName", "ZiaGIbnzTs");
        setBooleanField(term1374, term1374.getClass(), "isBlock", true);
        setBooleanField(term1374, term1374.getClass(), "formatAsBlock", true);
        setBooleanField(term1374, term1374.getClass(), "canContainBlock", true);
        setBooleanField(term1374, term1374.getClass(), "canContainInline", false);
        setBooleanField(term1374, term1374.getClass(), "empty", false);
        setBooleanField(term1374, term1374.getClass(), "selfClosing", true);
        setBooleanField(term1374, term1374.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term458, args);
        assertTrue(recursiveEquals(term458, term1374));
        assertTrue(recursiveEquals(retValue, "ZiaGIbnzTs"));
    }

};


