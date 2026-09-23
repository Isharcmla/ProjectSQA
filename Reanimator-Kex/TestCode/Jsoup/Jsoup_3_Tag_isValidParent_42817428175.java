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
import java.util.ArrayList;
import java.lang.Object;

public class Tag_isValidParent_42817428175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14660;
     Object term14706;
     Object term14825;
     Object term14826;

    public Tag_isValidParent_42817428175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14660 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term14660, term14660.getClass(), "canContainBlock", true);
        setBooleanField(term14660, term14660.getClass(), "canContainInline", false);
        Object term14781 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term14781, term14781.getClass(), "canContainBlock", true);
        setBooleanField(term14781, term14781.getClass(), "canContainInline", true);
        ArrayList term14758 = new ArrayList();
        ((ArrayList) term14758).add(term14781);
        term14706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14706, term14706.getClass(), "ancestors", term14758);
        term14825 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14825, term14825.getClass(), "tagName", null);
        setBooleanField(term14825, term14825.getClass(), "isBlock", false);
        setBooleanField(term14825, term14825.getClass(), "canContainBlock", true);
        setBooleanField(term14825, term14825.getClass(), "canContainInline", false);
        setBooleanField(term14825, term14825.getClass(), "optionalClosing", false);
        setBooleanField(term14825, term14825.getClass(), "empty", false);
        setBooleanField(term14825, term14825.getClass(), "preserveWhitespace", false);
        setField(term14825, term14825.getClass(), "ancestors", null);
        Object term14829 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14829, term14829.getClass(), "tagName", null);
        setBooleanField(term14829, term14829.getClass(), "isBlock", false);
        setBooleanField(term14829, term14829.getClass(), "canContainBlock", true);
        setBooleanField(term14829, term14829.getClass(), "canContainInline", true);
        setBooleanField(term14829, term14829.getClass(), "optionalClosing", false);
        setBooleanField(term14829, term14829.getClass(), "empty", false);
        setBooleanField(term14829, term14829.getClass(), "preserveWhitespace", false);
        setField(term14829, term14829.getClass(), "ancestors", null);
        ArrayList term14827 = new ArrayList();
        ((ArrayList) term14827).add(term14829);
        term14826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14826, term14826.getClass(), "tagName", null);
        setBooleanField(term14826, term14826.getClass(), "isBlock", false);
        setBooleanField(term14826, term14826.getClass(), "canContainBlock", false);
        setBooleanField(term14826, term14826.getClass(), "canContainInline", false);
        setBooleanField(term14826, term14826.getClass(), "optionalClosing", false);
        setBooleanField(term14826, term14826.getClass(), "empty", false);
        setBooleanField(term14826, term14826.getClass(), "preserveWhitespace", false);
        setField(term14826, term14826.getClass(), "ancestors", term14827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term14706;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term14660, args);
        assertTrue(recursiveEquals(term14660, term14825));
        assertTrue(recursiveEquals(term14706, term14826));
        assertTrue(recursiveEquals(retValue, false));
    }

};


