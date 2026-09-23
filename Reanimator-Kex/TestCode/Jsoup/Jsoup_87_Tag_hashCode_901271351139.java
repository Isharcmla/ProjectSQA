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

public class Tag_hashCode_901271351139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12731;
     Object term12790;

    public Tag_hashCode_901271351139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12731 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12731, term12731.getClass(), "tagName", "");
        setBooleanField(term12731, term12731.getClass(), "isBlock", true);
        setBooleanField(term12731, term12731.getClass(), "formatAsBlock", true);
        setBooleanField(term12731, term12731.getClass(), "canContainInline", false);
        setBooleanField(term12731, term12731.getClass(), "empty", false);
        setBooleanField(term12731, term12731.getClass(), "selfClosing", true);
        term12790 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12790, term12790.getClass(), "tagName", "");
        setBooleanField(term12790, term12790.getClass(), "isBlock", true);
        setBooleanField(term12790, term12790.getClass(), "formatAsBlock", true);
        setBooleanField(term12790, term12790.getClass(), "canContainInline", false);
        setBooleanField(term12790, term12790.getClass(), "empty", false);
        setBooleanField(term12790, term12790.getClass(), "selfClosing", true);
        setBooleanField(term12790, term12790.getClass(), "preserveWhitespace", false);
        setBooleanField(term12790, term12790.getClass(), "formList", false);
        setBooleanField(term12790, term12790.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12731, args);
        assertTrue(recursiveEquals(term12731, term12790));
        assertTrue(recursiveEquals(retValue, -1664623489));
    }

};


