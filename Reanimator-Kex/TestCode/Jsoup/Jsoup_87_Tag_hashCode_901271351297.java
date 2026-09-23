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

public class Tag_hashCode_901271351297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25990;
     Object term26049;

    public Tag_hashCode_901271351297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25990 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term25990, term25990.getClass(), "tagName", "");
        setBooleanField(term25990, term25990.getClass(), "isBlock", false);
        setBooleanField(term25990, term25990.getClass(), "formatAsBlock", true);
        setBooleanField(term25990, term25990.getClass(), "canContainInline", false);
        setBooleanField(term25990, term25990.getClass(), "empty", false);
        setBooleanField(term25990, term25990.getClass(), "selfClosing", false);
        setBooleanField(term25990, term25990.getClass(), "preserveWhitespace", true);
        setBooleanField(term25990, term25990.getClass(), "formList", false);
        setBooleanField(term25990, term25990.getClass(), "formSubmit", true);
        term26049 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26049, term26049.getClass(), "tagName", "");
        setBooleanField(term26049, term26049.getClass(), "isBlock", false);
        setBooleanField(term26049, term26049.getClass(), "formatAsBlock", true);
        setBooleanField(term26049, term26049.getClass(), "canContainInline", false);
        setBooleanField(term26049, term26049.getClass(), "empty", false);
        setBooleanField(term26049, term26049.getClass(), "selfClosing", false);
        setBooleanField(term26049, term26049.getClass(), "preserveWhitespace", true);
        setBooleanField(term26049, term26049.getClass(), "formList", false);
        setBooleanField(term26049, term26049.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term25990, args);
        assertTrue(recursiveEquals(term25990, term26049));
        assertTrue(recursiveEquals(retValue, 887504643));
    }

};


