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

public class Tag_hashCode_901271351344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29755;
     Object term29988;

    public Tag_hashCode_901271351344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29755 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29755, term29755.getClass(), "tagName", "");
        setBooleanField(term29755, term29755.getClass(), "isBlock", false);
        setBooleanField(term29755, term29755.getClass(), "formatAsBlock", true);
        setBooleanField(term29755, term29755.getClass(), "canContainInline", true);
        setBooleanField(term29755, term29755.getClass(), "empty", false);
        setBooleanField(term29755, term29755.getClass(), "selfClosing", true);
        setBooleanField(term29755, term29755.getClass(), "preserveWhitespace", false);
        setBooleanField(term29755, term29755.getClass(), "formList", false);
        setBooleanField(term29755, term29755.getClass(), "formSubmit", true);
        term29988 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29988, term29988.getClass(), "tagName", "");
        setBooleanField(term29988, term29988.getClass(), "isBlock", false);
        setBooleanField(term29988, term29988.getClass(), "formatAsBlock", true);
        setBooleanField(term29988, term29988.getClass(), "canContainInline", true);
        setBooleanField(term29988, term29988.getClass(), "empty", false);
        setBooleanField(term29988, term29988.getClass(), "selfClosing", true);
        setBooleanField(term29988, term29988.getClass(), "preserveWhitespace", false);
        setBooleanField(term29988, term29988.getClass(), "formList", false);
        setBooleanField(term29988, term29988.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term29755, args);
        assertTrue(recursiveEquals(term29755, term29988));
        assertTrue(recursiveEquals(retValue, 916162624));
    }

};


