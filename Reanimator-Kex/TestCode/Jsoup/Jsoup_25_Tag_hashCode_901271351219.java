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

public class Tag_hashCode_901271351219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17076;
     Object term17175;

    public Tag_hashCode_901271351219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17076 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17076, term17076.getClass(), "tagName", "");
        setBooleanField(term17076, term17076.getClass(), "isBlock", false);
        setBooleanField(term17076, term17076.getClass(), "formatAsBlock", false);
        setBooleanField(term17076, term17076.getClass(), "canContainBlock", false);
        setBooleanField(term17076, term17076.getClass(), "canContainInline", true);
        setBooleanField(term17076, term17076.getClass(), "empty", false);
        setBooleanField(term17076, term17076.getClass(), "selfClosing", false);
        setBooleanField(term17076, term17076.getClass(), "preserveWhitespace", true);
        term17175 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17175, term17175.getClass(), "tagName", "");
        setBooleanField(term17175, term17175.getClass(), "isBlock", false);
        setBooleanField(term17175, term17175.getClass(), "formatAsBlock", false);
        setBooleanField(term17175, term17175.getClass(), "canContainBlock", false);
        setBooleanField(term17175, term17175.getClass(), "canContainInline", true);
        setBooleanField(term17175, term17175.getClass(), "empty", false);
        setBooleanField(term17175, term17175.getClass(), "selfClosing", false);
        setBooleanField(term17175, term17175.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17076, args);
        assertTrue(recursiveEquals(term17076, term17175));
        assertTrue(recursiveEquals(retValue, 29792));
    }

};


