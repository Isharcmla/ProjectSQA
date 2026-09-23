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

public class Tag_equals_1349958026103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7290;
     Object term7374;
     Object term7425;
     Object term7428;

    public Tag_equals_1349958026103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7290 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7290, term7290.getClass(), "tagName", "");
        setBooleanField(term7290, term7290.getClass(), "canContainInline", true);
        setBooleanField(term7290, term7290.getClass(), "empty", true);
        setBooleanField(term7290, term7290.getClass(), "formatAsBlock", true);
        setBooleanField(term7290, term7290.getClass(), "isBlock", true);
        setBooleanField(term7290, term7290.getClass(), "preserveWhitespace", true);
        term7374 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7374, term7374.getClass(), "tagName", "");
        setBooleanField(term7374, term7374.getClass(), "canContainInline", true);
        setBooleanField(term7374, term7374.getClass(), "empty", true);
        setBooleanField(term7374, term7374.getClass(), "formatAsBlock", true);
        setBooleanField(term7374, term7374.getClass(), "isBlock", true);
        setBooleanField(term7374, term7374.getClass(), "preserveWhitespace", false);
        term7425 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7425, term7425.getClass(), "tagName", "");
        setBooleanField(term7425, term7425.getClass(), "isBlock", true);
        setBooleanField(term7425, term7425.getClass(), "formatAsBlock", true);
        setBooleanField(term7425, term7425.getClass(), "canContainInline", true);
        setBooleanField(term7425, term7425.getClass(), "empty", true);
        setBooleanField(term7425, term7425.getClass(), "selfClosing", false);
        setBooleanField(term7425, term7425.getClass(), "preserveWhitespace", true);
        setBooleanField(term7425, term7425.getClass(), "formList", false);
        setBooleanField(term7425, term7425.getClass(), "formSubmit", false);
        term7428 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7428, term7428.getClass(), "tagName", "");
        setBooleanField(term7428, term7428.getClass(), "isBlock", true);
        setBooleanField(term7428, term7428.getClass(), "formatAsBlock", true);
        setBooleanField(term7428, term7428.getClass(), "canContainInline", true);
        setBooleanField(term7428, term7428.getClass(), "empty", true);
        setBooleanField(term7428, term7428.getClass(), "selfClosing", false);
        setBooleanField(term7428, term7428.getClass(), "preserveWhitespace", false);
        setBooleanField(term7428, term7428.getClass(), "formList", false);
        setBooleanField(term7428, term7428.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7374;
        Object retValue = callMethod(klass, "equals", argTypes, term7290, args);
        assertTrue(recursiveEquals(term7290, term7425));
        assertTrue(recursiveEquals(term7374, term7428));
        assertTrue(recursiveEquals(retValue, false));
    }

};


