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

public class Tag_hashCode_901271351549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47343;
     Object term47425;

    public Tag_hashCode_901271351549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47343 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47343, term47343.getClass(), "tagName", "");
        setBooleanField(term47343, term47343.getClass(), "isBlock", true);
        setBooleanField(term47343, term47343.getClass(), "formatAsBlock", false);
        setBooleanField(term47343, term47343.getClass(), "canContainInline", true);
        setBooleanField(term47343, term47343.getClass(), "empty", false);
        setBooleanField(term47343, term47343.getClass(), "selfClosing", true);
        setBooleanField(term47343, term47343.getClass(), "preserveWhitespace", false);
        setBooleanField(term47343, term47343.getClass(), "formList", true);
        term47425 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47425, term47425.getClass(), "tagName", "");
        setBooleanField(term47425, term47425.getClass(), "isBlock", true);
        setBooleanField(term47425, term47425.getClass(), "formatAsBlock", false);
        setBooleanField(term47425, term47425.getClass(), "canContainInline", true);
        setBooleanField(term47425, term47425.getClass(), "empty", false);
        setBooleanField(term47425, term47425.getClass(), "selfClosing", true);
        setBooleanField(term47425, term47425.getClass(), "preserveWhitespace", false);
        setBooleanField(term47425, term47425.getClass(), "formList", true);
        setBooleanField(term47425, term47425.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47343, args);
        assertTrue(recursiveEquals(term47343, term47425));
        assertTrue(recursiveEquals(retValue, 1771469308));
    }

};


