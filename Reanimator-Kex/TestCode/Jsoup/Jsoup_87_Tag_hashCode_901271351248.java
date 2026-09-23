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

public class Tag_hashCode_901271351248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21837;
     Object term22026;

    public Tag_hashCode_901271351248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21837 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21837, term21837.getClass(), "tagName", "");
        setBooleanField(term21837, term21837.getClass(), "isBlock", false);
        setBooleanField(term21837, term21837.getClass(), "formatAsBlock", true);
        setBooleanField(term21837, term21837.getClass(), "canContainInline", false);
        setBooleanField(term21837, term21837.getClass(), "empty", true);
        setBooleanField(term21837, term21837.getClass(), "selfClosing", true);
        setBooleanField(term21837, term21837.getClass(), "preserveWhitespace", false);
        setBooleanField(term21837, term21837.getClass(), "formList", true);
        term22026 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term22026, term22026.getClass(), "tagName", "");
        setBooleanField(term22026, term22026.getClass(), "isBlock", false);
        setBooleanField(term22026, term22026.getClass(), "formatAsBlock", true);
        setBooleanField(term22026, term22026.getClass(), "canContainInline", false);
        setBooleanField(term22026, term22026.getClass(), "empty", true);
        setBooleanField(term22026, term22026.getClass(), "selfClosing", true);
        setBooleanField(term22026, term22026.getClass(), "preserveWhitespace", false);
        setBooleanField(term22026, term22026.getClass(), "formList", true);
        setBooleanField(term22026, term22026.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21837, args);
        assertTrue(recursiveEquals(term21837, term22026));
        assertTrue(recursiveEquals(retValue, 888457024));
    }

};


