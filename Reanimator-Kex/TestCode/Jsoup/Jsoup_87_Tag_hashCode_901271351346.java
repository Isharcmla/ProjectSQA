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

public class Tag_hashCode_901271351346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29929;
     Object term30160;

    public Tag_hashCode_901271351346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29929 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29929, term29929.getClass(), "tagName", "");
        setBooleanField(term29929, term29929.getClass(), "isBlock", false);
        setBooleanField(term29929, term29929.getClass(), "formatAsBlock", true);
        setBooleanField(term29929, term29929.getClass(), "canContainInline", false);
        setBooleanField(term29929, term29929.getClass(), "empty", true);
        setBooleanField(term29929, term29929.getClass(), "selfClosing", true);
        setBooleanField(term29929, term29929.getClass(), "preserveWhitespace", true);
        setBooleanField(term29929, term29929.getClass(), "formList", false);
        setBooleanField(term29929, term29929.getClass(), "formSubmit", true);
        term30160 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30160, term30160.getClass(), "tagName", "");
        setBooleanField(term30160, term30160.getClass(), "isBlock", false);
        setBooleanField(term30160, term30160.getClass(), "formatAsBlock", true);
        setBooleanField(term30160, term30160.getClass(), "canContainInline", false);
        setBooleanField(term30160, term30160.getClass(), "empty", true);
        setBooleanField(term30160, term30160.getClass(), "selfClosing", true);
        setBooleanField(term30160, term30160.getClass(), "preserveWhitespace", true);
        setBooleanField(term30160, term30160.getClass(), "formList", false);
        setBooleanField(term30160, term30160.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29929, args);
        assertTrue(recursiveEquals(term29929, term30160));
        assertTrue(recursiveEquals(retValue, 888457955));
    }

};


