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

public class Tag_equals_134995802675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4677;
     Object term4761;
     Object term4815;
     Object term4818;

    public Tag_equals_134995802675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4677 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4677, term4677.getClass(), "tagName", "");
        term4761 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4761, term4761.getClass(), "tagName", "");
        term4815 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4815, term4815.getClass(), "tagName", "");
        setBooleanField(term4815, term4815.getClass(), "isBlock", false);
        setBooleanField(term4815, term4815.getClass(), "formatAsBlock", false);
        setBooleanField(term4815, term4815.getClass(), "canContainInline", false);
        setBooleanField(term4815, term4815.getClass(), "empty", false);
        setBooleanField(term4815, term4815.getClass(), "selfClosing", false);
        setBooleanField(term4815, term4815.getClass(), "preserveWhitespace", false);
        setBooleanField(term4815, term4815.getClass(), "formList", false);
        setBooleanField(term4815, term4815.getClass(), "formSubmit", false);
        term4818 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term4818, term4818.getClass(), "tagName", "");
        setBooleanField(term4818, term4818.getClass(), "isBlock", false);
        setBooleanField(term4818, term4818.getClass(), "formatAsBlock", false);
        setBooleanField(term4818, term4818.getClass(), "canContainInline", false);
        setBooleanField(term4818, term4818.getClass(), "empty", false);
        setBooleanField(term4818, term4818.getClass(), "selfClosing", false);
        setBooleanField(term4818, term4818.getClass(), "preserveWhitespace", false);
        setBooleanField(term4818, term4818.getClass(), "formList", false);
        setBooleanField(term4818, term4818.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4761;
        Object retValue = callMethod(klass, "equals", argTypes, term4677, args);
        assertTrue(recursiveEquals(term4677, term4815));
        assertTrue(recursiveEquals(term4761, term4818));
        assertTrue(recursiveEquals(retValue, true));
    }

};


