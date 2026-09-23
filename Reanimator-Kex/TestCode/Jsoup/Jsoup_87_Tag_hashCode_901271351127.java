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

public class Tag_hashCode_901271351127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11782;
     Object term11841;

    public Tag_hashCode_901271351127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11782 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11782, term11782.getClass(), "tagName", "");
        setBooleanField(term11782, term11782.getClass(), "isBlock", false);
        setBooleanField(term11782, term11782.getClass(), "formatAsBlock", false);
        setBooleanField(term11782, term11782.getClass(), "canContainInline", false);
        setBooleanField(term11782, term11782.getClass(), "empty", true);
        term11841 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11841, term11841.getClass(), "tagName", "");
        setBooleanField(term11841, term11841.getClass(), "isBlock", false);
        setBooleanField(term11841, term11841.getClass(), "formatAsBlock", false);
        setBooleanField(term11841, term11841.getClass(), "canContainInline", false);
        setBooleanField(term11841, term11841.getClass(), "empty", true);
        setBooleanField(term11841, term11841.getClass(), "selfClosing", false);
        setBooleanField(term11841, term11841.getClass(), "preserveWhitespace", false);
        setBooleanField(term11841, term11841.getClass(), "formList", false);
        setBooleanField(term11841, term11841.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11782, args);
        assertTrue(recursiveEquals(term11782, term11841));
        assertTrue(recursiveEquals(retValue, 923521));
    }

};


