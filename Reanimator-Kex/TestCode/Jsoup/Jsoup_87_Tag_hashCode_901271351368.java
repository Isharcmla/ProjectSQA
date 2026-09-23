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

public class Tag_hashCode_901271351368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31794;
     Object term32021;

    public Tag_hashCode_901271351368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31794 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31794, term31794.getClass(), "tagName", "");
        setBooleanField(term31794, term31794.getClass(), "isBlock", false);
        setBooleanField(term31794, term31794.getClass(), "formatAsBlock", true);
        setBooleanField(term31794, term31794.getClass(), "canContainInline", true);
        setBooleanField(term31794, term31794.getClass(), "empty", true);
        setBooleanField(term31794, term31794.getClass(), "selfClosing", true);
        term32021 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32021, term32021.getClass(), "tagName", "");
        setBooleanField(term32021, term32021.getClass(), "isBlock", false);
        setBooleanField(term32021, term32021.getClass(), "formatAsBlock", true);
        setBooleanField(term32021, term32021.getClass(), "canContainInline", true);
        setBooleanField(term32021, term32021.getClass(), "empty", true);
        setBooleanField(term32021, term32021.getClass(), "selfClosing", true);
        setBooleanField(term32021, term32021.getClass(), "preserveWhitespace", false);
        setBooleanField(term32021, term32021.getClass(), "formList", false);
        setBooleanField(term32021, term32021.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term31794, args);
        assertTrue(recursiveEquals(term31794, term32021));
        assertTrue(recursiveEquals(retValue, 917086144));
    }

};


