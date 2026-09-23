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

public class Tag_toString_39051166140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;
     Object term1768;

    public Tag_toString_39051166140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term558, term558.getClass(), "tagName", "pCTimMblYc");
        setBooleanField(term558, term558.getClass(), "isBlock", false);
        setBooleanField(term558, term558.getClass(), "formatAsBlock", false);
        setBooleanField(term558, term558.getClass(), "canContainInline", false);
        setBooleanField(term558, term558.getClass(), "empty", false);
        setBooleanField(term558, term558.getClass(), "selfClosing", true);
        setBooleanField(term558, term558.getClass(), "preserveWhitespace", false);
        setBooleanField(term558, term558.getClass(), "formList", false);
        setBooleanField(term558, term558.getClass(), "formSubmit", true);
        term1768 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1768, term1768.getClass(), "tagName", "pCTimMblYc");
        setBooleanField(term1768, term1768.getClass(), "isBlock", false);
        setBooleanField(term1768, term1768.getClass(), "formatAsBlock", false);
        setBooleanField(term1768, term1768.getClass(), "canContainInline", false);
        setBooleanField(term1768, term1768.getClass(), "empty", false);
        setBooleanField(term1768, term1768.getClass(), "selfClosing", true);
        setBooleanField(term1768, term1768.getClass(), "preserveWhitespace", false);
        setBooleanField(term1768, term1768.getClass(), "formList", false);
        setBooleanField(term1768, term1768.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term558, args);
        assertTrue(recursiveEquals(term558, term1768));
        assertTrue(recursiveEquals(retValue, "pCTimMblYc"));
    }

};


