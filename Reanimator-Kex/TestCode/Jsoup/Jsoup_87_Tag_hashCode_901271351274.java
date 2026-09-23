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

public class Tag_hashCode_901271351274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23988;
     Object term24198;

    public Tag_hashCode_901271351274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23988 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23988, term23988.getClass(), "tagName", "");
        setBooleanField(term23988, term23988.getClass(), "isBlock", false);
        setBooleanField(term23988, term23988.getClass(), "formatAsBlock", true);
        setBooleanField(term23988, term23988.getClass(), "canContainInline", false);
        setBooleanField(term23988, term23988.getClass(), "empty", false);
        setBooleanField(term23988, term23988.getClass(), "selfClosing", true);
        setBooleanField(term23988, term23988.getClass(), "preserveWhitespace", false);
        setBooleanField(term23988, term23988.getClass(), "formList", true);
        term24198 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24198, term24198.getClass(), "tagName", "");
        setBooleanField(term24198, term24198.getClass(), "isBlock", false);
        setBooleanField(term24198, term24198.getClass(), "formatAsBlock", true);
        setBooleanField(term24198, term24198.getClass(), "canContainInline", false);
        setBooleanField(term24198, term24198.getClass(), "empty", false);
        setBooleanField(term24198, term24198.getClass(), "selfClosing", true);
        setBooleanField(term24198, term24198.getClass(), "preserveWhitespace", false);
        setBooleanField(term24198, term24198.getClass(), "formList", true);
        setBooleanField(term24198, term24198.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23988, args);
        assertTrue(recursiveEquals(term23988, term24198));
        assertTrue(recursiveEquals(retValue, 887533503));
    }

};


