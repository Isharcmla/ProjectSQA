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

public class Tag_equals_1349958026111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10224;
     Object term10308;
     Object term10362;
     Object term10365;

    public Tag_equals_1349958026111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10224 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10224, term10224.getClass(), "tagName", "");
        setBooleanField(term10224, term10224.getClass(), "canContainInline", true);
        setBooleanField(term10224, term10224.getClass(), "empty", true);
        setBooleanField(term10224, term10224.getClass(), "formatAsBlock", true);
        setBooleanField(term10224, term10224.getClass(), "isBlock", true);
        setBooleanField(term10224, term10224.getClass(), "preserveWhitespace", true);
        setBooleanField(term10224, term10224.getClass(), "selfClosing", true);
        setBooleanField(term10224, term10224.getClass(), "formList", true);
        setBooleanField(term10224, term10224.getClass(), "formSubmit", true);
        term10308 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10308, term10308.getClass(), "tagName", "");
        setBooleanField(term10308, term10308.getClass(), "canContainInline", true);
        setBooleanField(term10308, term10308.getClass(), "empty", true);
        setBooleanField(term10308, term10308.getClass(), "formatAsBlock", true);
        setBooleanField(term10308, term10308.getClass(), "isBlock", true);
        setBooleanField(term10308, term10308.getClass(), "preserveWhitespace", true);
        setBooleanField(term10308, term10308.getClass(), "selfClosing", true);
        setBooleanField(term10308, term10308.getClass(), "formList", true);
        setBooleanField(term10308, term10308.getClass(), "formSubmit", false);
        term10362 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10362, term10362.getClass(), "tagName", "");
        setBooleanField(term10362, term10362.getClass(), "isBlock", true);
        setBooleanField(term10362, term10362.getClass(), "formatAsBlock", true);
        setBooleanField(term10362, term10362.getClass(), "canContainInline", true);
        setBooleanField(term10362, term10362.getClass(), "empty", true);
        setBooleanField(term10362, term10362.getClass(), "selfClosing", true);
        setBooleanField(term10362, term10362.getClass(), "preserveWhitespace", true);
        setBooleanField(term10362, term10362.getClass(), "formList", true);
        setBooleanField(term10362, term10362.getClass(), "formSubmit", true);
        term10365 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10365, term10365.getClass(), "tagName", "");
        setBooleanField(term10365, term10365.getClass(), "isBlock", true);
        setBooleanField(term10365, term10365.getClass(), "formatAsBlock", true);
        setBooleanField(term10365, term10365.getClass(), "canContainInline", true);
        setBooleanField(term10365, term10365.getClass(), "empty", true);
        setBooleanField(term10365, term10365.getClass(), "selfClosing", true);
        setBooleanField(term10365, term10365.getClass(), "preserveWhitespace", true);
        setBooleanField(term10365, term10365.getClass(), "formList", true);
        setBooleanField(term10365, term10365.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10308;
        Object retValue = callMethod(klass, "equals", argTypes, term10224, args);
        assertTrue(recursiveEquals(term10224, term10362));
        assertTrue(recursiveEquals(term10308, term10365));
        assertTrue(recursiveEquals(retValue, false));
    }

};


