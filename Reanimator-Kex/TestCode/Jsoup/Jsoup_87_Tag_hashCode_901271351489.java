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

public class Tag_hashCode_901271351489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42332;
     Object term42414;

    public Tag_hashCode_901271351489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42332 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42332, term42332.getClass(), "tagName", "");
        setBooleanField(term42332, term42332.getClass(), "isBlock", true);
        setBooleanField(term42332, term42332.getClass(), "formatAsBlock", true);
        setBooleanField(term42332, term42332.getClass(), "canContainInline", false);
        setBooleanField(term42332, term42332.getClass(), "empty", true);
        setBooleanField(term42332, term42332.getClass(), "selfClosing", true);
        setBooleanField(term42332, term42332.getClass(), "preserveWhitespace", true);
        setBooleanField(term42332, term42332.getClass(), "formList", true);
        term42414 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42414, term42414.getClass(), "tagName", "");
        setBooleanField(term42414, term42414.getClass(), "isBlock", true);
        setBooleanField(term42414, term42414.getClass(), "formatAsBlock", true);
        setBooleanField(term42414, term42414.getClass(), "canContainInline", false);
        setBooleanField(term42414, term42414.getClass(), "empty", true);
        setBooleanField(term42414, term42414.getClass(), "selfClosing", true);
        setBooleanField(term42414, term42414.getClass(), "preserveWhitespace", true);
        setBooleanField(term42414, term42414.getClass(), "formList", true);
        setBooleanField(term42414, term42414.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term42332, args);
        assertTrue(recursiveEquals(term42332, term42414));
        assertTrue(recursiveEquals(retValue, -1663698976));
    }

};


