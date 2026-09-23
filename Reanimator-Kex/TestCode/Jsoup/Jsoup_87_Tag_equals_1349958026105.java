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

public class Tag_equals_1349958026105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8002;
     Object term8086;
     Object term9129;
     Object term9132;

    public Tag_equals_1349958026105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8002 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8002, term8002.getClass(), "tagName", "");
        term8086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8086, term8086.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term9129 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9129, term9129.getClass(), "tagName", "");
        setBooleanField(term9129, term9129.getClass(), "isBlock", false);
        setBooleanField(term9129, term9129.getClass(), "formatAsBlock", false);
        setBooleanField(term9129, term9129.getClass(), "canContainInline", false);
        setBooleanField(term9129, term9129.getClass(), "empty", false);
        setBooleanField(term9129, term9129.getClass(), "selfClosing", false);
        setBooleanField(term9129, term9129.getClass(), "preserveWhitespace", false);
        setBooleanField(term9129, term9129.getClass(), "formList", false);
        setBooleanField(term9129, term9129.getClass(), "formSubmit", false);
        term9132 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9132, term9132.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term9132, term9132.getClass(), "isBlock", false);
        setBooleanField(term9132, term9132.getClass(), "formatAsBlock", false);
        setBooleanField(term9132, term9132.getClass(), "canContainInline", false);
        setBooleanField(term9132, term9132.getClass(), "empty", false);
        setBooleanField(term9132, term9132.getClass(), "selfClosing", false);
        setBooleanField(term9132, term9132.getClass(), "preserveWhitespace", false);
        setBooleanField(term9132, term9132.getClass(), "formList", false);
        setBooleanField(term9132, term9132.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8086;
        Object retValue = callMethod(klass, "equals", argTypes, term8002, args);
        assertTrue(recursiveEquals(term8002, term9129));
        assertTrue(recursiveEquals(term8086, term9132));
        assertTrue(recursiveEquals(retValue, false));
    }

};


