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

public class Tag_hashCode_901271351205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18165;
     Object term18247;

    public Tag_hashCode_901271351205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18165 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18165, term18165.getClass(), "tagName", "");
        setBooleanField(term18165, term18165.getClass(), "isBlock", false);
        setBooleanField(term18165, term18165.getClass(), "formatAsBlock", false);
        setBooleanField(term18165, term18165.getClass(), "canContainInline", true);
        setBooleanField(term18165, term18165.getClass(), "empty", false);
        setBooleanField(term18165, term18165.getClass(), "selfClosing", true);
        setBooleanField(term18165, term18165.getClass(), "preserveWhitespace", false);
        setBooleanField(term18165, term18165.getClass(), "formList", false);
        setBooleanField(term18165, term18165.getClass(), "formSubmit", true);
        term18247 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18247, term18247.getClass(), "tagName", "");
        setBooleanField(term18247, term18247.getClass(), "isBlock", false);
        setBooleanField(term18247, term18247.getClass(), "formatAsBlock", false);
        setBooleanField(term18247, term18247.getClass(), "canContainInline", true);
        setBooleanField(term18247, term18247.getClass(), "empty", false);
        setBooleanField(term18247, term18247.getClass(), "selfClosing", true);
        setBooleanField(term18247, term18247.getClass(), "preserveWhitespace", false);
        setBooleanField(term18247, term18247.getClass(), "formList", false);
        setBooleanField(term18247, term18247.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term18165, args);
        assertTrue(recursiveEquals(term18165, term18247));
        assertTrue(recursiveEquals(retValue, 28658943));
    }

};


