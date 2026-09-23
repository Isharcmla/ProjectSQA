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

public class Tag_equals_1349958026109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9971;
     Object term10055;
     Object term10103;
     Object term10106;

    public Tag_equals_1349958026109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9971 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9971, term9971.getClass(), "tagName", "");
        setBooleanField(term9971, term9971.getClass(), "canContainInline", true);
        setBooleanField(term9971, term9971.getClass(), "empty", true);
        term10055 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10055, term10055.getClass(), "tagName", "");
        setBooleanField(term10055, term10055.getClass(), "canContainInline", true);
        setBooleanField(term10055, term10055.getClass(), "empty", false);
        term10103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10103, term10103.getClass(), "tagName", "");
        setBooleanField(term10103, term10103.getClass(), "isBlock", false);
        setBooleanField(term10103, term10103.getClass(), "formatAsBlock", false);
        setBooleanField(term10103, term10103.getClass(), "canContainInline", true);
        setBooleanField(term10103, term10103.getClass(), "empty", true);
        setBooleanField(term10103, term10103.getClass(), "selfClosing", false);
        setBooleanField(term10103, term10103.getClass(), "preserveWhitespace", false);
        setBooleanField(term10103, term10103.getClass(), "formList", false);
        setBooleanField(term10103, term10103.getClass(), "formSubmit", false);
        term10106 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10106, term10106.getClass(), "tagName", "");
        setBooleanField(term10106, term10106.getClass(), "isBlock", false);
        setBooleanField(term10106, term10106.getClass(), "formatAsBlock", false);
        setBooleanField(term10106, term10106.getClass(), "canContainInline", true);
        setBooleanField(term10106, term10106.getClass(), "empty", false);
        setBooleanField(term10106, term10106.getClass(), "selfClosing", false);
        setBooleanField(term10106, term10106.getClass(), "preserveWhitespace", false);
        setBooleanField(term10106, term10106.getClass(), "formList", false);
        setBooleanField(term10106, term10106.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10055;
        Object retValue = callMethod(klass, "equals", argTypes, term9971, args);
        assertTrue(recursiveEquals(term9971, term10103));
        assertTrue(recursiveEquals(term10055, term10106));
        assertTrue(recursiveEquals(retValue, false));
    }

};


