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

public class Tag_hashCode_901271351283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24803;
     Object term24885;

    public Tag_hashCode_901271351283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24803 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24803, term24803.getClass(), "tagName", "");
        setBooleanField(term24803, term24803.getClass(), "isBlock", false);
        setBooleanField(term24803, term24803.getClass(), "formatAsBlock", true);
        setBooleanField(term24803, term24803.getClass(), "canContainInline", true);
        setBooleanField(term24803, term24803.getClass(), "empty", false);
        setBooleanField(term24803, term24803.getClass(), "selfClosing", false);
        setBooleanField(term24803, term24803.getClass(), "preserveWhitespace", true);
        term24885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term24885, term24885.getClass(), "tagName", "");
        setBooleanField(term24885, term24885.getClass(), "isBlock", false);
        setBooleanField(term24885, term24885.getClass(), "formatAsBlock", true);
        setBooleanField(term24885, term24885.getClass(), "canContainInline", true);
        setBooleanField(term24885, term24885.getClass(), "empty", false);
        setBooleanField(term24885, term24885.getClass(), "selfClosing", false);
        setBooleanField(term24885, term24885.getClass(), "preserveWhitespace", true);
        setBooleanField(term24885, term24885.getClass(), "formList", false);
        setBooleanField(term24885, term24885.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term24803, args);
        assertTrue(recursiveEquals(term24803, term24885));
        assertTrue(recursiveEquals(retValue, 916133793));
    }

};


