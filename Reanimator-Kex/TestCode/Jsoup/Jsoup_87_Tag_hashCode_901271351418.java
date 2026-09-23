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

public class Tag_hashCode_901271351418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36204;
     Object term36430;

    public Tag_hashCode_901271351418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36204 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36204, term36204.getClass(), "tagName", "");
        setBooleanField(term36204, term36204.getClass(), "isBlock", false);
        setBooleanField(term36204, term36204.getClass(), "formatAsBlock", true);
        setBooleanField(term36204, term36204.getClass(), "canContainInline", true);
        setBooleanField(term36204, term36204.getClass(), "empty", false);
        setBooleanField(term36204, term36204.getClass(), "selfClosing", true);
        setBooleanField(term36204, term36204.getClass(), "preserveWhitespace", true);
        setBooleanField(term36204, term36204.getClass(), "formList", false);
        setBooleanField(term36204, term36204.getClass(), "formSubmit", true);
        term36430 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36430, term36430.getClass(), "tagName", "");
        setBooleanField(term36430, term36430.getClass(), "isBlock", false);
        setBooleanField(term36430, term36430.getClass(), "formatAsBlock", true);
        setBooleanField(term36430, term36430.getClass(), "canContainInline", true);
        setBooleanField(term36430, term36430.getClass(), "empty", false);
        setBooleanField(term36430, term36430.getClass(), "selfClosing", true);
        setBooleanField(term36430, term36430.getClass(), "preserveWhitespace", true);
        setBooleanField(term36430, term36430.getClass(), "formList", false);
        setBooleanField(term36430, term36430.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36204, args);
        assertTrue(recursiveEquals(term36204, term36430));
        assertTrue(recursiveEquals(retValue, 916163585));
    }

};


