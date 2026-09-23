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

public class Tag_hashCode_901271351269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23633;
     Object term23715;

    public Tag_hashCode_901271351269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23633 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23633, term23633.getClass(), "tagName", "");
        setBooleanField(term23633, term23633.getClass(), "isBlock", false);
        setBooleanField(term23633, term23633.getClass(), "formatAsBlock", false);
        setBooleanField(term23633, term23633.getClass(), "canContainInline", false);
        setBooleanField(term23633, term23633.getClass(), "empty", true);
        setBooleanField(term23633, term23633.getClass(), "selfClosing", false);
        setBooleanField(term23633, term23633.getClass(), "preserveWhitespace", true);
        term23715 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23715, term23715.getClass(), "tagName", "");
        setBooleanField(term23715, term23715.getClass(), "isBlock", false);
        setBooleanField(term23715, term23715.getClass(), "formatAsBlock", false);
        setBooleanField(term23715, term23715.getClass(), "canContainInline", false);
        setBooleanField(term23715, term23715.getClass(), "empty", true);
        setBooleanField(term23715, term23715.getClass(), "selfClosing", false);
        setBooleanField(term23715, term23715.getClass(), "preserveWhitespace", true);
        setBooleanField(term23715, term23715.getClass(), "formList", false);
        setBooleanField(term23715, term23715.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term23633, args);
        assertTrue(recursiveEquals(term23633, term23715));
        assertTrue(recursiveEquals(retValue, 924482));
    }

};


