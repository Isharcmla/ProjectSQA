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

public class Tag_hashCode_901271351358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30961;
     Object term31194;

    public Tag_hashCode_901271351358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30961 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30961, term30961.getClass(), "tagName", "");
        setBooleanField(term30961, term30961.getClass(), "isBlock", true);
        setBooleanField(term30961, term30961.getClass(), "formatAsBlock", true);
        setBooleanField(term30961, term30961.getClass(), "canContainInline", false);
        setBooleanField(term30961, term30961.getClass(), "empty", false);
        setBooleanField(term30961, term30961.getClass(), "selfClosing", false);
        setBooleanField(term30961, term30961.getClass(), "preserveWhitespace", true);
        setBooleanField(term30961, term30961.getClass(), "formList", true);
        setBooleanField(term30961, term30961.getClass(), "formSubmit", true);
        term31194 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term31194, term31194.getClass(), "tagName", "");
        setBooleanField(term31194, term31194.getClass(), "isBlock", true);
        setBooleanField(term31194, term31194.getClass(), "formatAsBlock", true);
        setBooleanField(term31194, term31194.getClass(), "canContainInline", false);
        setBooleanField(term31194, term31194.getClass(), "empty", false);
        setBooleanField(term31194, term31194.getClass(), "selfClosing", false);
        setBooleanField(term31194, term31194.getClass(), "preserveWhitespace", true);
        setBooleanField(term31194, term31194.getClass(), "formList", true);
        setBooleanField(term31194, term31194.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30961, args);
        assertTrue(recursiveEquals(term30961, term31194));
        assertTrue(recursiveEquals(retValue, -1664652287));
    }

};


