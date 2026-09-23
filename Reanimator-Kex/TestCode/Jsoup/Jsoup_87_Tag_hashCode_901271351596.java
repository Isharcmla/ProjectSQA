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

public class Tag_hashCode_901271351596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51424;
     Object term51634;

    public Tag_hashCode_901271351596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51424 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51424, term51424.getClass(), "tagName", "");
        setBooleanField(term51424, term51424.getClass(), "isBlock", true);
        setBooleanField(term51424, term51424.getClass(), "formatAsBlock", false);
        setBooleanField(term51424, term51424.getClass(), "canContainInline", true);
        setBooleanField(term51424, term51424.getClass(), "empty", true);
        setBooleanField(term51424, term51424.getClass(), "selfClosing", true);
        setBooleanField(term51424, term51424.getClass(), "preserveWhitespace", true);
        setBooleanField(term51424, term51424.getClass(), "formList", true);
        setBooleanField(term51424, term51424.getClass(), "formSubmit", true);
        term51634 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51634, term51634.getClass(), "tagName", "");
        setBooleanField(term51634, term51634.getClass(), "isBlock", true);
        setBooleanField(term51634, term51634.getClass(), "formatAsBlock", false);
        setBooleanField(term51634, term51634.getClass(), "canContainInline", true);
        setBooleanField(term51634, term51634.getClass(), "empty", true);
        setBooleanField(term51634, term51634.getClass(), "selfClosing", true);
        setBooleanField(term51634, term51634.getClass(), "preserveWhitespace", true);
        setBooleanField(term51634, term51634.getClass(), "formList", true);
        setBooleanField(term51634, term51634.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term51424, args);
        assertTrue(recursiveEquals(term51424, term51634));
        assertTrue(recursiveEquals(retValue, 1772393791));
    }

};


