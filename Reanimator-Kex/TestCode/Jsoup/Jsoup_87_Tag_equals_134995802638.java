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

public class Tag_equals_134995802638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term516;
     Object term1657;
     Object term1660;

    public Tag_equals_134995802638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term495, term495.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term495, term495.getClass(), "isBlock", true);
        setBooleanField(term495, term495.getClass(), "formatAsBlock", false);
        setBooleanField(term495, term495.getClass(), "canContainInline", true);
        setBooleanField(term495, term495.getClass(), "empty", true);
        setBooleanField(term495, term495.getClass(), "selfClosing", true);
        setBooleanField(term495, term495.getClass(), "preserveWhitespace", false);
        setBooleanField(term495, term495.getClass(), "formList", true);
        setBooleanField(term495, term495.getClass(), "formSubmit", false);
        term516 = newInstance(Class.forName("java.lang.Object"));
        term1657 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1657, term1657.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term1657, term1657.getClass(), "isBlock", true);
        setBooleanField(term1657, term1657.getClass(), "formatAsBlock", false);
        setBooleanField(term1657, term1657.getClass(), "canContainInline", true);
        setBooleanField(term1657, term1657.getClass(), "empty", true);
        setBooleanField(term1657, term1657.getClass(), "selfClosing", true);
        setBooleanField(term1657, term1657.getClass(), "preserveWhitespace", false);
        setBooleanField(term1657, term1657.getClass(), "formList", true);
        setBooleanField(term1657, term1657.getClass(), "formSubmit", false);
        term1660 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term516;
        Object retValue = callMethod(klass, "equals", argTypes, term495, args);
        assertTrue(recursiveEquals(term495, term1657));
        assertTrue(recursiveEquals(term516, term1660));
        assertTrue(recursiveEquals(retValue, false));
    }

};


