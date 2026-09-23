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

public class Tag_isValidParent_42817428155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7850;
     Object term7896;
     Object term8019;
     Object term8020;

    public Tag_isValidParent_42817428155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7850 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7850, term7850.getClass(), "canContainBlock", true);
        Object term7971 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7971, term7971.getClass(), "canContainBlock", true);
        ArrayList term7948 = new ArrayList();
        ((ArrayList) term7948).add(term7971);
        term7896 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7896, term7896.getClass(), "ancestors", term7948);
        term8019 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8019, term8019.getClass(), "tagName", null);
        setBooleanField(term8019, term8019.getClass(), "isBlock", false);
        setBooleanField(term8019, term8019.getClass(), "canContainBlock", true);
        setBooleanField(term8019, term8019.getClass(), "canContainInline", false);
        setBooleanField(term8019, term8019.getClass(), "optionalClosing", false);
        setBooleanField(term8019, term8019.getClass(), "empty", false);
        setBooleanField(term8019, term8019.getClass(), "preserveWhitespace", false);
        setField(term8019, term8019.getClass(), "ancestors", null);
        Object term8023 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8023, term8023.getClass(), "tagName", null);
        setBooleanField(term8023, term8023.getClass(), "isBlock", false);
        setBooleanField(term8023, term8023.getClass(), "canContainBlock", true);
        setBooleanField(term8023, term8023.getClass(), "canContainInline", false);
        setBooleanField(term8023, term8023.getClass(), "optionalClosing", false);
        setBooleanField(term8023, term8023.getClass(), "empty", false);
        setBooleanField(term8023, term8023.getClass(), "preserveWhitespace", false);
        setField(term8023, term8023.getClass(), "ancestors", null);
        ArrayList term8021 = new ArrayList();
        ((ArrayList) term8021).add(term8023);
        term8020 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8020, term8020.getClass(), "tagName", null);
        setBooleanField(term8020, term8020.getClass(), "isBlock", false);
        setBooleanField(term8020, term8020.getClass(), "canContainBlock", false);
        setBooleanField(term8020, term8020.getClass(), "canContainInline", false);
        setBooleanField(term8020, term8020.getClass(), "optionalClosing", false);
        setBooleanField(term8020, term8020.getClass(), "empty", false);
        setBooleanField(term8020, term8020.getClass(), "preserveWhitespace", false);
        setField(term8020, term8020.getClass(), "ancestors", term8021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term7896;
        Object retValue = callMethod(klass, "isValidParent", argTypes, term7850, args);
        assertTrue(recursiveEquals(term7850, term8019));
        assertTrue(recursiveEquals(term7896, term8020));
        assertTrue(recursiveEquals(retValue, true));
    }

};


