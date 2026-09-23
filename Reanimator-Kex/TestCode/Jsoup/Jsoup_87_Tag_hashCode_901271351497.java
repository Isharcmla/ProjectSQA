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

public class Tag_hashCode_901271351497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42868;
     Object term42950;

    public Tag_hashCode_901271351497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42868 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42868, term42868.getClass(), "tagName", "");
        setBooleanField(term42868, term42868.getClass(), "isBlock", false);
        setBooleanField(term42868, term42868.getClass(), "formatAsBlock", false);
        setBooleanField(term42868, term42868.getClass(), "canContainInline", false);
        setBooleanField(term42868, term42868.getClass(), "empty", true);
        setBooleanField(term42868, term42868.getClass(), "selfClosing", true);
        setBooleanField(term42868, term42868.getClass(), "preserveWhitespace", true);
        setBooleanField(term42868, term42868.getClass(), "formList", false);
        setBooleanField(term42868, term42868.getClass(), "formSubmit", true);
        term42950 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42950, term42950.getClass(), "tagName", "");
        setBooleanField(term42950, term42950.getClass(), "isBlock", false);
        setBooleanField(term42950, term42950.getClass(), "formatAsBlock", false);
        setBooleanField(term42950, term42950.getClass(), "canContainInline", false);
        setBooleanField(term42950, term42950.getClass(), "empty", true);
        setBooleanField(term42950, term42950.getClass(), "selfClosing", true);
        setBooleanField(term42950, term42950.getClass(), "preserveWhitespace", true);
        setBooleanField(term42950, term42950.getClass(), "formList", false);
        setBooleanField(term42950, term42950.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term42868, args);
        assertTrue(recursiveEquals(term42868, term42950));
        assertTrue(recursiveEquals(retValue, 954274));
    }

};


