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

public class Tag_hashCode_901271351354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30636;
     Object term30845;

    public Tag_hashCode_901271351354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30636 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30636, term30636.getClass(), "tagName", "");
        setBooleanField(term30636, term30636.getClass(), "isBlock", false);
        setBooleanField(term30636, term30636.getClass(), "formatAsBlock", true);
        setBooleanField(term30636, term30636.getClass(), "canContainInline", true);
        setBooleanField(term30636, term30636.getClass(), "empty", false);
        setBooleanField(term30636, term30636.getClass(), "selfClosing", false);
        setBooleanField(term30636, term30636.getClass(), "preserveWhitespace", true);
        setBooleanField(term30636, term30636.getClass(), "formList", false);
        setBooleanField(term30636, term30636.getClass(), "formSubmit", true);
        term30845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30845, term30845.getClass(), "tagName", "");
        setBooleanField(term30845, term30845.getClass(), "isBlock", false);
        setBooleanField(term30845, term30845.getClass(), "formatAsBlock", true);
        setBooleanField(term30845, term30845.getClass(), "canContainInline", true);
        setBooleanField(term30845, term30845.getClass(), "empty", false);
        setBooleanField(term30845, term30845.getClass(), "selfClosing", false);
        setBooleanField(term30845, term30845.getClass(), "preserveWhitespace", true);
        setBooleanField(term30845, term30845.getClass(), "formList", false);
        setBooleanField(term30845, term30845.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term30636, args);
        assertTrue(recursiveEquals(term30636, term30845));
        assertTrue(recursiveEquals(retValue, 916133794));
    }

};


