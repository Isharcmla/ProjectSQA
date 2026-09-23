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

public class Tag_hashCode_901271351599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51773;
     Object term51832;

    public Tag_hashCode_901271351599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51773 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51773, term51773.getClass(), "tagName", "");
        setBooleanField(term51773, term51773.getClass(), "isBlock", false);
        setBooleanField(term51773, term51773.getClass(), "formatAsBlock", true);
        setBooleanField(term51773, term51773.getClass(), "canContainInline", true);
        setBooleanField(term51773, term51773.getClass(), "empty", true);
        setBooleanField(term51773, term51773.getClass(), "selfClosing", false);
        setBooleanField(term51773, term51773.getClass(), "preserveWhitespace", true);
        setBooleanField(term51773, term51773.getClass(), "formList", true);
        setBooleanField(term51773, term51773.getClass(), "formSubmit", true);
        term51832 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term51832, term51832.getClass(), "tagName", "");
        setBooleanField(term51832, term51832.getClass(), "isBlock", false);
        setBooleanField(term51832, term51832.getClass(), "formatAsBlock", true);
        setBooleanField(term51832, term51832.getClass(), "canContainInline", true);
        setBooleanField(term51832, term51832.getClass(), "empty", true);
        setBooleanField(term51832, term51832.getClass(), "selfClosing", false);
        setBooleanField(term51832, term51832.getClass(), "preserveWhitespace", true);
        setBooleanField(term51832, term51832.getClass(), "formList", true);
        setBooleanField(term51832, term51832.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term51773, args);
        assertTrue(recursiveEquals(term51773, term51832));
        assertTrue(recursiveEquals(retValue, 917057346));
    }

};


