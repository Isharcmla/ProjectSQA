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

public class Tag_hashCode_901271351356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30786;
     Object term31020;

    public Tag_hashCode_901271351356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30786 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30786, term30786.getClass(), "tagName", "");
        setBooleanField(term30786, term30786.getClass(), "isBlock", false);
        setBooleanField(term30786, term30786.getClass(), "formatAsBlock", true);
        setBooleanField(term30786, term30786.getClass(), "canContainInline", false);
        setBooleanField(term30786, term30786.getClass(), "empty", false);
        setBooleanField(term30786, term30786.getClass(), "selfClosing", true);
        setBooleanField(term30786, term30786.getClass(), "preserveWhitespace", true);
        setBooleanField(term30786, term30786.getClass(), "formList", false);
        setBooleanField(term30786, term30786.getClass(), "formSubmit", true);
        term31020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31020, term31020.getClass(), "tagName", "");
        setBooleanField(term31020, term31020.getClass(), "isBlock", false);
        setBooleanField(term31020, term31020.getClass(), "formatAsBlock", true);
        setBooleanField(term31020, term31020.getClass(), "canContainInline", false);
        setBooleanField(term31020, term31020.getClass(), "empty", false);
        setBooleanField(term31020, term31020.getClass(), "selfClosing", true);
        setBooleanField(term31020, term31020.getClass(), "preserveWhitespace", true);
        setBooleanField(term31020, term31020.getClass(), "formList", false);
        setBooleanField(term31020, term31020.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30786, args);
        assertTrue(recursiveEquals(term30786, term31020));
        assertTrue(recursiveEquals(retValue, 887534434));
    }

};


