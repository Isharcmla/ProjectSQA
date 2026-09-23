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

public class Tag_equals_1349958026107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9744;
     Object term9828;
     Object term9880;
     Object term9883;

    public Tag_equals_1349958026107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9744 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9744, term9744.getClass(), "tagName", "");
        setBooleanField(term9744, term9744.getClass(), "canContainInline", true);
        setBooleanField(term9744, term9744.getClass(), "empty", true);
        setBooleanField(term9744, term9744.getClass(), "formatAsBlock", true);
        setBooleanField(term9744, term9744.getClass(), "isBlock", true);
        setBooleanField(term9744, term9744.getClass(), "preserveWhitespace", true);
        setBooleanField(term9744, term9744.getClass(), "selfClosing", true);
        term9828 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9828, term9828.getClass(), "tagName", "");
        setBooleanField(term9828, term9828.getClass(), "canContainInline", true);
        setBooleanField(term9828, term9828.getClass(), "empty", true);
        setBooleanField(term9828, term9828.getClass(), "formatAsBlock", true);
        setBooleanField(term9828, term9828.getClass(), "isBlock", true);
        setBooleanField(term9828, term9828.getClass(), "preserveWhitespace", true);
        setBooleanField(term9828, term9828.getClass(), "selfClosing", false);
        term9880 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9880, term9880.getClass(), "tagName", "");
        setBooleanField(term9880, term9880.getClass(), "isBlock", true);
        setBooleanField(term9880, term9880.getClass(), "formatAsBlock", true);
        setBooleanField(term9880, term9880.getClass(), "canContainInline", true);
        setBooleanField(term9880, term9880.getClass(), "empty", true);
        setBooleanField(term9880, term9880.getClass(), "selfClosing", true);
        setBooleanField(term9880, term9880.getClass(), "preserveWhitespace", true);
        setBooleanField(term9880, term9880.getClass(), "formList", false);
        setBooleanField(term9880, term9880.getClass(), "formSubmit", false);
        term9883 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9883, term9883.getClass(), "tagName", "");
        setBooleanField(term9883, term9883.getClass(), "isBlock", true);
        setBooleanField(term9883, term9883.getClass(), "formatAsBlock", true);
        setBooleanField(term9883, term9883.getClass(), "canContainInline", true);
        setBooleanField(term9883, term9883.getClass(), "empty", true);
        setBooleanField(term9883, term9883.getClass(), "selfClosing", false);
        setBooleanField(term9883, term9883.getClass(), "preserveWhitespace", true);
        setBooleanField(term9883, term9883.getClass(), "formList", false);
        setBooleanField(term9883, term9883.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9828;
        Object retValue = callMethod(klass, "equals", argTypes, term9744, args);
        assertTrue(recursiveEquals(term9744, term9880));
        assertTrue(recursiveEquals(term9828, term9883));
        assertTrue(recursiveEquals(retValue, false));
    }

};


