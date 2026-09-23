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

public class Tag_equals_1349958026117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10942;
     Object term11026;
     Object term11079;
     Object term11082;

    public Tag_equals_1349958026117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10942, term10942.getClass(), "tagName", "");
        setBooleanField(term10942, term10942.getClass(), "canContainInline", true);
        setBooleanField(term10942, term10942.getClass(), "empty", true);
        setBooleanField(term10942, term10942.getClass(), "formatAsBlock", true);
        setBooleanField(term10942, term10942.getClass(), "isBlock", true);
        setBooleanField(term10942, term10942.getClass(), "preserveWhitespace", true);
        setBooleanField(term10942, term10942.getClass(), "selfClosing", true);
        setBooleanField(term10942, term10942.getClass(), "formList", true);
        term11026 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11026, term11026.getClass(), "tagName", "");
        setBooleanField(term11026, term11026.getClass(), "canContainInline", true);
        setBooleanField(term11026, term11026.getClass(), "empty", true);
        setBooleanField(term11026, term11026.getClass(), "formatAsBlock", true);
        setBooleanField(term11026, term11026.getClass(), "isBlock", true);
        setBooleanField(term11026, term11026.getClass(), "preserveWhitespace", true);
        setBooleanField(term11026, term11026.getClass(), "selfClosing", true);
        setBooleanField(term11026, term11026.getClass(), "formList", false);
        term11079 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11079, term11079.getClass(), "tagName", "");
        setBooleanField(term11079, term11079.getClass(), "isBlock", true);
        setBooleanField(term11079, term11079.getClass(), "formatAsBlock", true);
        setBooleanField(term11079, term11079.getClass(), "canContainInline", true);
        setBooleanField(term11079, term11079.getClass(), "empty", true);
        setBooleanField(term11079, term11079.getClass(), "selfClosing", true);
        setBooleanField(term11079, term11079.getClass(), "preserveWhitespace", true);
        setBooleanField(term11079, term11079.getClass(), "formList", true);
        setBooleanField(term11079, term11079.getClass(), "formSubmit", false);
        term11082 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11082, term11082.getClass(), "tagName", "");
        setBooleanField(term11082, term11082.getClass(), "isBlock", true);
        setBooleanField(term11082, term11082.getClass(), "formatAsBlock", true);
        setBooleanField(term11082, term11082.getClass(), "canContainInline", true);
        setBooleanField(term11082, term11082.getClass(), "empty", true);
        setBooleanField(term11082, term11082.getClass(), "selfClosing", true);
        setBooleanField(term11082, term11082.getClass(), "preserveWhitespace", true);
        setBooleanField(term11082, term11082.getClass(), "formList", false);
        setBooleanField(term11082, term11082.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11026;
        Object retValue = callMethod(klass, "equals", argTypes, term10942, args);
        assertTrue(recursiveEquals(term10942, term11079));
        assertTrue(recursiveEquals(term11026, term11082));
        assertTrue(recursiveEquals(retValue, false));
    }

};


