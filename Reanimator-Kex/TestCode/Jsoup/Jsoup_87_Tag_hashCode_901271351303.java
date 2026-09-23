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

public class Tag_hashCode_901271351303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26456;
     Object term26538;

    public Tag_hashCode_901271351303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26456 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26456, term26456.getClass(), "tagName", "");
        setBooleanField(term26456, term26456.getClass(), "isBlock", true);
        setBooleanField(term26456, term26456.getClass(), "formatAsBlock", true);
        setBooleanField(term26456, term26456.getClass(), "canContainInline", false);
        setBooleanField(term26456, term26456.getClass(), "empty", false);
        setBooleanField(term26456, term26456.getClass(), "selfClosing", false);
        setBooleanField(term26456, term26456.getClass(), "preserveWhitespace", true);
        setBooleanField(term26456, term26456.getClass(), "formList", false);
        setBooleanField(term26456, term26456.getClass(), "formSubmit", true);
        term26538 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26538, term26538.getClass(), "tagName", "");
        setBooleanField(term26538, term26538.getClass(), "isBlock", true);
        setBooleanField(term26538, term26538.getClass(), "formatAsBlock", true);
        setBooleanField(term26538, term26538.getClass(), "canContainInline", false);
        setBooleanField(term26538, term26538.getClass(), "empty", false);
        setBooleanField(term26538, term26538.getClass(), "selfClosing", false);
        setBooleanField(term26538, term26538.getClass(), "preserveWhitespace", true);
        setBooleanField(term26538, term26538.getClass(), "formList", false);
        setBooleanField(term26538, term26538.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26456, args);
        assertTrue(recursiveEquals(term26456, term26538));
        assertTrue(recursiveEquals(retValue, -1664652318));
    }

};


