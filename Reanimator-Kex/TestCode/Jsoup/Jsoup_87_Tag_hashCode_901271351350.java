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

public class Tag_hashCode_901271351350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30265;
     Object term30499;

    public Tag_hashCode_901271351350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30265 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30265, term30265.getClass(), "tagName", "");
        setBooleanField(term30265, term30265.getClass(), "isBlock", false);
        setBooleanField(term30265, term30265.getClass(), "formatAsBlock", false);
        setBooleanField(term30265, term30265.getClass(), "canContainInline", false);
        setBooleanField(term30265, term30265.getClass(), "empty", true);
        setBooleanField(term30265, term30265.getClass(), "selfClosing", true);
        setBooleanField(term30265, term30265.getClass(), "preserveWhitespace", true);
        setBooleanField(term30265, term30265.getClass(), "formList", true);
        term30499 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30499, term30499.getClass(), "tagName", "");
        setBooleanField(term30499, term30499.getClass(), "isBlock", false);
        setBooleanField(term30499, term30499.getClass(), "formatAsBlock", false);
        setBooleanField(term30499, term30499.getClass(), "canContainInline", false);
        setBooleanField(term30499, term30499.getClass(), "empty", true);
        setBooleanField(term30499, term30499.getClass(), "selfClosing", true);
        setBooleanField(term30499, term30499.getClass(), "preserveWhitespace", true);
        setBooleanField(term30499, term30499.getClass(), "formList", true);
        setBooleanField(term30499, term30499.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30265, args);
        assertTrue(recursiveEquals(term30265, term30499));
        assertTrue(recursiveEquals(retValue, 954304));
    }

};


