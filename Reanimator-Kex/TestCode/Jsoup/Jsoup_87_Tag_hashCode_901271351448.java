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

public class Tag_hashCode_901271351448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38695;
     Object term38807;

    public Tag_hashCode_901271351448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38695 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38695, term38695.getClass(), "tagName", "");
        setBooleanField(term38695, term38695.getClass(), "isBlock", true);
        setBooleanField(term38695, term38695.getClass(), "formatAsBlock", false);
        setBooleanField(term38695, term38695.getClass(), "canContainInline", false);
        setBooleanField(term38695, term38695.getClass(), "empty", true);
        setBooleanField(term38695, term38695.getClass(), "selfClosing", true);
        setBooleanField(term38695, term38695.getClass(), "preserveWhitespace", true);
        term38807 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38807, term38807.getClass(), "tagName", "");
        setBooleanField(term38807, term38807.getClass(), "isBlock", true);
        setBooleanField(term38807, term38807.getClass(), "formatAsBlock", false);
        setBooleanField(term38807, term38807.getClass(), "canContainInline", false);
        setBooleanField(term38807, term38807.getClass(), "empty", true);
        setBooleanField(term38807, term38807.getClass(), "selfClosing", true);
        setBooleanField(term38807, term38807.getClass(), "preserveWhitespace", true);
        setBooleanField(term38807, term38807.getClass(), "formList", false);
        setBooleanField(term38807, term38807.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38695, args);
        assertTrue(recursiveEquals(term38695, term38807));
        assertTrue(recursiveEquals(retValue, 1743764608));
    }

};


