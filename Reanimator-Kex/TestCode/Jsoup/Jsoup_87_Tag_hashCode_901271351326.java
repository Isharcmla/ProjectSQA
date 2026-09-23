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

public class Tag_hashCode_901271351326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28249;
     Object term28480;

    public Tag_hashCode_901271351326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28249, term28249.getClass(), "tagName", "");
        setBooleanField(term28249, term28249.getClass(), "isBlock", false);
        setBooleanField(term28249, term28249.getClass(), "formatAsBlock", false);
        setBooleanField(term28249, term28249.getClass(), "canContainInline", false);
        setBooleanField(term28249, term28249.getClass(), "empty", false);
        setBooleanField(term28249, term28249.getClass(), "selfClosing", false);
        setBooleanField(term28249, term28249.getClass(), "preserveWhitespace", true);
        setBooleanField(term28249, term28249.getClass(), "formList", false);
        setBooleanField(term28249, term28249.getClass(), "formSubmit", true);
        term28480 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term28480, term28480.getClass(), "tagName", "");
        setBooleanField(term28480, term28480.getClass(), "isBlock", false);
        setBooleanField(term28480, term28480.getClass(), "formatAsBlock", false);
        setBooleanField(term28480, term28480.getClass(), "canContainInline", false);
        setBooleanField(term28480, term28480.getClass(), "empty", false);
        setBooleanField(term28480, term28480.getClass(), "selfClosing", false);
        setBooleanField(term28480, term28480.getClass(), "preserveWhitespace", true);
        setBooleanField(term28480, term28480.getClass(), "formList", false);
        setBooleanField(term28480, term28480.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term28249, args);
        assertTrue(recursiveEquals(term28249, term28480));
        assertTrue(recursiveEquals(retValue, 962));
    }

};


