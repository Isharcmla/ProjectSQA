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

public class Tag_hashCode_901271351271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23823;
     Object term23882;

    public Tag_hashCode_901271351271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23823, term23823.getClass(), "tagName", "");
        setBooleanField(term23823, term23823.getClass(), "isBlock", true);
        setBooleanField(term23823, term23823.getClass(), "formatAsBlock", true);
        setBooleanField(term23823, term23823.getClass(), "canContainInline", false);
        setBooleanField(term23823, term23823.getClass(), "empty", false);
        setBooleanField(term23823, term23823.getClass(), "selfClosing", false);
        setBooleanField(term23823, term23823.getClass(), "preserveWhitespace", true);
        setBooleanField(term23823, term23823.getClass(), "formList", true);
        term23882 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23882, term23882.getClass(), "tagName", "");
        setBooleanField(term23882, term23882.getClass(), "isBlock", true);
        setBooleanField(term23882, term23882.getClass(), "formatAsBlock", true);
        setBooleanField(term23882, term23882.getClass(), "canContainInline", false);
        setBooleanField(term23882, term23882.getClass(), "empty", false);
        setBooleanField(term23882, term23882.getClass(), "selfClosing", false);
        setBooleanField(term23882, term23882.getClass(), "preserveWhitespace", true);
        setBooleanField(term23882, term23882.getClass(), "formList", true);
        setBooleanField(term23882, term23882.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23823, args);
        assertTrue(recursiveEquals(term23823, term23882));
        assertTrue(recursiveEquals(retValue, -1664652288));
    }

};


