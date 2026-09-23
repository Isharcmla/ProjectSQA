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

public class Tag_hashCode_901271351259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20321;
     Object term20399;

    public Tag_hashCode_901271351259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20321, term20321.getClass(), "tagName", "");
        setBooleanField(term20321, term20321.getClass(), "isBlock", true);
        setBooleanField(term20321, term20321.getClass(), "formatAsBlock", false);
        setBooleanField(term20321, term20321.getClass(), "canContainBlock", true);
        setBooleanField(term20321, term20321.getClass(), "canContainInline", true);
        setBooleanField(term20321, term20321.getClass(), "empty", false);
        setBooleanField(term20321, term20321.getClass(), "selfClosing", true);
        setBooleanField(term20321, term20321.getClass(), "preserveWhitespace", true);
        term20399 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20399, term20399.getClass(), "tagName", "");
        setBooleanField(term20399, term20399.getClass(), "isBlock", true);
        setBooleanField(term20399, term20399.getClass(), "formatAsBlock", false);
        setBooleanField(term20399, term20399.getClass(), "canContainBlock", true);
        setBooleanField(term20399, term20399.getClass(), "canContainInline", true);
        setBooleanField(term20399, term20399.getClass(), "empty", false);
        setBooleanField(term20399, term20399.getClass(), "selfClosing", true);
        setBooleanField(term20399, term20399.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20321, args);
        assertTrue(recursiveEquals(term20321, term20399));
        assertTrue(recursiveEquals(retValue, 888457025));
    }

};


