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

public class Tag_hashCode_901271351406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35196;
     Object term35408;

    public Tag_hashCode_901271351406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35196 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35196, term35196.getClass(), "tagName", "");
        setBooleanField(term35196, term35196.getClass(), "isBlock", false);
        setBooleanField(term35196, term35196.getClass(), "formatAsBlock", true);
        setBooleanField(term35196, term35196.getClass(), "canContainInline", true);
        setBooleanField(term35196, term35196.getClass(), "empty", true);
        setBooleanField(term35196, term35196.getClass(), "selfClosing", true);
        setBooleanField(term35196, term35196.getClass(), "preserveWhitespace", false);
        setBooleanField(term35196, term35196.getClass(), "formList", false);
        setBooleanField(term35196, term35196.getClass(), "formSubmit", true);
        term35408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term35408, term35408.getClass(), "tagName", "");
        setBooleanField(term35408, term35408.getClass(), "isBlock", false);
        setBooleanField(term35408, term35408.getClass(), "formatAsBlock", true);
        setBooleanField(term35408, term35408.getClass(), "canContainInline", true);
        setBooleanField(term35408, term35408.getClass(), "empty", true);
        setBooleanField(term35408, term35408.getClass(), "selfClosing", true);
        setBooleanField(term35408, term35408.getClass(), "preserveWhitespace", false);
        setBooleanField(term35408, term35408.getClass(), "formList", false);
        setBooleanField(term35408, term35408.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term35196, args);
        assertTrue(recursiveEquals(term35196, term35408));
        assertTrue(recursiveEquals(retValue, 917086145));
    }

};


