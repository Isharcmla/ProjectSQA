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

public class Tag_formatAsBlock_81579628826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132;
     Object term1106;

    public Tag_formatAsBlock_81579628826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term132, term132.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term132, term132.getClass(), "isBlock", false);
        setBooleanField(term132, term132.getClass(), "formatAsBlock", false);
        setBooleanField(term132, term132.getClass(), "canContainInline", true);
        setBooleanField(term132, term132.getClass(), "empty", true);
        setBooleanField(term132, term132.getClass(), "selfClosing", true);
        setBooleanField(term132, term132.getClass(), "preserveWhitespace", true);
        setBooleanField(term132, term132.getClass(), "formList", true);
        setBooleanField(term132, term132.getClass(), "formSubmit", false);
        term1106 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1106, term1106.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term1106, term1106.getClass(), "isBlock", false);
        setBooleanField(term1106, term1106.getClass(), "formatAsBlock", false);
        setBooleanField(term1106, term1106.getClass(), "canContainInline", true);
        setBooleanField(term1106, term1106.getClass(), "empty", true);
        setBooleanField(term1106, term1106.getClass(), "selfClosing", true);
        setBooleanField(term1106, term1106.getClass(), "preserveWhitespace", true);
        setBooleanField(term1106, term1106.getClass(), "formList", true);
        setBooleanField(term1106, term1106.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "formatAsBlock", argTypes, term132, args);
        assertTrue(recursiveEquals(term132, term1106));
    }

};


