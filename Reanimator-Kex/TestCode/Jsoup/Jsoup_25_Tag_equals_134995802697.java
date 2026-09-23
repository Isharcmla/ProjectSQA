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

public class Tag_equals_134995802697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7387;
     Object term7433;
     Object term7503;
     Object term7504;

    public Tag_equals_134995802697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7387 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7387, term7387.getClass(), "canContainBlock", false);
        setBooleanField(term7387, term7387.getClass(), "canContainInline", false);
        setBooleanField(term7387, term7387.getClass(), "empty", false);
        setBooleanField(term7387, term7387.getClass(), "formatAsBlock", true);
        term7433 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7433, term7433.getClass(), "canContainBlock", false);
        setBooleanField(term7433, term7433.getClass(), "canContainInline", false);
        setBooleanField(term7433, term7433.getClass(), "empty", false);
        setBooleanField(term7433, term7433.getClass(), "formatAsBlock", false);
        term7503 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7503, term7503.getClass(), "tagName", null);
        setBooleanField(term7503, term7503.getClass(), "isBlock", false);
        setBooleanField(term7503, term7503.getClass(), "formatAsBlock", true);
        setBooleanField(term7503, term7503.getClass(), "canContainBlock", false);
        setBooleanField(term7503, term7503.getClass(), "canContainInline", false);
        setBooleanField(term7503, term7503.getClass(), "empty", false);
        setBooleanField(term7503, term7503.getClass(), "selfClosing", false);
        setBooleanField(term7503, term7503.getClass(), "preserveWhitespace", false);
        term7504 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7504, term7504.getClass(), "tagName", null);
        setBooleanField(term7504, term7504.getClass(), "isBlock", false);
        setBooleanField(term7504, term7504.getClass(), "formatAsBlock", false);
        setBooleanField(term7504, term7504.getClass(), "canContainBlock", false);
        setBooleanField(term7504, term7504.getClass(), "canContainInline", false);
        setBooleanField(term7504, term7504.getClass(), "empty", false);
        setBooleanField(term7504, term7504.getClass(), "selfClosing", false);
        setBooleanField(term7504, term7504.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7433;
        Object retValue = callMethod(klass, "equals", argTypes, term7387, args);
        assertTrue(recursiveEquals(term7387, term7503));
        assertTrue(recursiveEquals(term7433, term7504));
        assertTrue(recursiveEquals(retValue, false));
    }

};


