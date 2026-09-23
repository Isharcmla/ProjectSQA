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

public class Tag_canContain_237447391131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27044;
     Object term27067;
     Object term27100;
     Object term27101;

    public Tag_canContain_237447391131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27044 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27044, term27044.getClass(), "canContainInline", true);
        setBooleanField(term27044, term27044.getClass(), "optionalClosing", true);
        setBooleanField(term27044, term27044.getClass(), "canContainBlock", false);
        setBooleanField(term27044, term27044.getClass(), "empty", true);
        setBooleanField(term27044, term27044.getClass(), "isBlock", false);
        term27067 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term27067, term27067.getClass(), "isBlock", false);
        setBooleanField(term27067, term27067.getClass(), "canContainBlock", false);
        setBooleanField(term27067, term27067.getClass(), "canContainInline", true);
        setBooleanField(term27067, term27067.getClass(), "empty", true);
        setBooleanField(term27067, term27067.getClass(), "optionalClosing", true);
        term27100 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27100, term27100.getClass(), "tagName", null);
        setBooleanField(term27100, term27100.getClass(), "isBlock", false);
        setBooleanField(term27100, term27100.getClass(), "canContainBlock", false);
        setBooleanField(term27100, term27100.getClass(), "canContainInline", true);
        setBooleanField(term27100, term27100.getClass(), "optionalClosing", true);
        setBooleanField(term27100, term27100.getClass(), "empty", true);
        setBooleanField(term27100, term27100.getClass(), "preserveWhitespace", false);
        setField(term27100, term27100.getClass(), "ancestors", null);
        term27101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27101, term27101.getClass(), "tagName", null);
        setBooleanField(term27101, term27101.getClass(), "isBlock", false);
        setBooleanField(term27101, term27101.getClass(), "canContainBlock", false);
        setBooleanField(term27101, term27101.getClass(), "canContainInline", true);
        setBooleanField(term27101, term27101.getClass(), "optionalClosing", true);
        setBooleanField(term27101, term27101.getClass(), "empty", true);
        setBooleanField(term27101, term27101.getClass(), "preserveWhitespace", false);
        setField(term27101, term27101.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term27067;
        Object retValue = callMethod(klass, "canContain", argTypes, term27044, args);
        assertTrue(recursiveEquals(term27044, term27100));
        assertTrue(recursiveEquals(term27067, term27101));
        assertTrue(recursiveEquals(retValue, false));
    }

};


