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

public class Tag_hashCode_901271351337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29103;
     Object term29443;

    public Tag_hashCode_901271351337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29103, term29103.getClass(), "tagName", "");
        setBooleanField(term29103, term29103.getClass(), "isBlock", false);
        setBooleanField(term29103, term29103.getClass(), "formatAsBlock", true);
        setBooleanField(term29103, term29103.getClass(), "canContainInline", false);
        setBooleanField(term29103, term29103.getClass(), "empty", false);
        setBooleanField(term29103, term29103.getClass(), "selfClosing", false);
        setBooleanField(term29103, term29103.getClass(), "preserveWhitespace", false);
        setBooleanField(term29103, term29103.getClass(), "formList", true);
        setBooleanField(term29103, term29103.getClass(), "formSubmit", true);
        term29443 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29443, term29443.getClass(), "tagName", "");
        setBooleanField(term29443, term29443.getClass(), "isBlock", false);
        setBooleanField(term29443, term29443.getClass(), "formatAsBlock", true);
        setBooleanField(term29443, term29443.getClass(), "canContainInline", false);
        setBooleanField(term29443, term29443.getClass(), "empty", false);
        setBooleanField(term29443, term29443.getClass(), "selfClosing", false);
        setBooleanField(term29443, term29443.getClass(), "preserveWhitespace", false);
        setBooleanField(term29443, term29443.getClass(), "formList", true);
        setBooleanField(term29443, term29443.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29103, args);
        assertTrue(recursiveEquals(term29103, term29443));
        assertTrue(recursiveEquals(retValue, 887503713));
    }

};


