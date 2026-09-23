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

public class Tag_hashCode_901271351430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37257;
     Object term37461;

    public Tag_hashCode_901271351430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37257 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37257, term37257.getClass(), "tagName", "");
        setBooleanField(term37257, term37257.getClass(), "isBlock", false);
        setBooleanField(term37257, term37257.getClass(), "formatAsBlock", true);
        setBooleanField(term37257, term37257.getClass(), "canContainInline", true);
        setBooleanField(term37257, term37257.getClass(), "empty", true);
        setBooleanField(term37257, term37257.getClass(), "selfClosing", true);
        setBooleanField(term37257, term37257.getClass(), "preserveWhitespace", false);
        setBooleanField(term37257, term37257.getClass(), "formList", true);
        setBooleanField(term37257, term37257.getClass(), "formSubmit", true);
        term37461 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37461, term37461.getClass(), "tagName", "");
        setBooleanField(term37461, term37461.getClass(), "isBlock", false);
        setBooleanField(term37461, term37461.getClass(), "formatAsBlock", true);
        setBooleanField(term37461, term37461.getClass(), "canContainInline", true);
        setBooleanField(term37461, term37461.getClass(), "empty", true);
        setBooleanField(term37461, term37461.getClass(), "selfClosing", true);
        setBooleanField(term37461, term37461.getClass(), "preserveWhitespace", false);
        setBooleanField(term37461, term37461.getClass(), "formList", true);
        setBooleanField(term37461, term37461.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term37257, args);
        assertTrue(recursiveEquals(term37257, term37461));
        assertTrue(recursiveEquals(retValue, 917086176));
    }

};


