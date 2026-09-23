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

public class Tag_hashCode_901271351208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18357;
     Object term18472;

    public Tag_hashCode_901271351208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18357 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18357, term18357.getClass(), "tagName", "");
        setBooleanField(term18357, term18357.getClass(), "isBlock", false);
        setBooleanField(term18357, term18357.getClass(), "formatAsBlock", false);
        setBooleanField(term18357, term18357.getClass(), "canContainInline", false);
        setBooleanField(term18357, term18357.getClass(), "empty", true);
        setBooleanField(term18357, term18357.getClass(), "selfClosing", false);
        setBooleanField(term18357, term18357.getClass(), "preserveWhitespace", false);
        setBooleanField(term18357, term18357.getClass(), "formList", false);
        setBooleanField(term18357, term18357.getClass(), "formSubmit", true);
        term18472 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18472, term18472.getClass(), "tagName", "");
        setBooleanField(term18472, term18472.getClass(), "isBlock", false);
        setBooleanField(term18472, term18472.getClass(), "formatAsBlock", false);
        setBooleanField(term18472, term18472.getClass(), "canContainInline", false);
        setBooleanField(term18472, term18472.getClass(), "empty", true);
        setBooleanField(term18472, term18472.getClass(), "selfClosing", false);
        setBooleanField(term18472, term18472.getClass(), "preserveWhitespace", false);
        setBooleanField(term18472, term18472.getClass(), "formList", false);
        setBooleanField(term18472, term18472.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18357, args);
        assertTrue(recursiveEquals(term18357, term18472));
        assertTrue(recursiveEquals(retValue, 923522));
    }

};


