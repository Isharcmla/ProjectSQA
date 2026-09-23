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

public class Tag_canContain_237447391127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26659;
     Object term26682;
     Object term26711;
     Object term26712;

    public Tag_canContain_237447391127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26659 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term26659, term26659.getClass(), "canContainInline", true);
        setBooleanField(term26659, term26659.getClass(), "optionalClosing", true);
        setBooleanField(term26659, term26659.getClass(), "canContainBlock", true);
        setBooleanField(term26659, term26659.getClass(), "empty", true);
        term26682 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term26682, term26682.getClass(), "isBlock", false);
        setBooleanField(term26682, term26682.getClass(), "canContainBlock", true);
        setBooleanField(term26682, term26682.getClass(), "canContainInline", false);
        term26711 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26711, term26711.getClass(), "tagName", null);
        setBooleanField(term26711, term26711.getClass(), "isBlock", false);
        setBooleanField(term26711, term26711.getClass(), "canContainBlock", true);
        setBooleanField(term26711, term26711.getClass(), "canContainInline", true);
        setBooleanField(term26711, term26711.getClass(), "optionalClosing", true);
        setBooleanField(term26711, term26711.getClass(), "empty", true);
        setBooleanField(term26711, term26711.getClass(), "preserveWhitespace", false);
        setField(term26711, term26711.getClass(), "ancestors", null);
        term26712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term26712, term26712.getClass(), "tagName", null);
        setBooleanField(term26712, term26712.getClass(), "isBlock", false);
        setBooleanField(term26712, term26712.getClass(), "canContainBlock", true);
        setBooleanField(term26712, term26712.getClass(), "canContainInline", false);
        setBooleanField(term26712, term26712.getClass(), "optionalClosing", false);
        setBooleanField(term26712, term26712.getClass(), "empty", false);
        setBooleanField(term26712, term26712.getClass(), "preserveWhitespace", false);
        setField(term26712, term26712.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term26682;
        Object retValue = callMethod(klass, "canContain", argTypes, term26659, args);
        assertTrue(recursiveEquals(term26659, term26711));
        assertTrue(recursiveEquals(term26682, term26712));
        assertTrue(recursiveEquals(retValue, false));
    }

};


