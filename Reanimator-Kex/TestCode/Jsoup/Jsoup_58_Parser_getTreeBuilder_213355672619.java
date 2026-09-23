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
import java.lang.Object;

public class Parser_getTreeBuilder_213355672619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term1093;

    public Parser_getTreeBuilder_213355672619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term56 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term60 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term54, term54.getClass(), "treeBuilder", null);
        setIntField(term54, term54.getClass(), "maxErrors", 391863371);
        setIntField(term56, term56.getClass(), "maxSize", 0);
        setField(term56, term56.getClass(), "elementData", null);
        setIntField(term56, term56.getClass(), "size", 0);
        setIntField(term56, term56.getClass(), "modCount", 0);
        setField(term54, term54.getClass(), "errors", term56);
        setBooleanField(term60, term60.getClass(), "preserveTagCase", false);
        setBooleanField(term60, term60.getClass(), "preserveAttributeCase", false);
        setField(term54, term54.getClass(), "settings", term60);
        term1093 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1094 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1095 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1093, term1093.getClass(), "treeBuilder", null);
        setIntField(term1093, term1093.getClass(), "maxErrors", 391863371);
        setIntField(term1094, term1094.getClass(), "maxSize", 0);
        setField(term1094, term1094.getClass(), "elementData", null);
        setIntField(term1094, term1094.getClass(), "size", 0);
        setIntField(term1094, term1094.getClass(), "modCount", 0);
        setField(term1093, term1093.getClass(), "errors", term1094);
        setBooleanField(term1095, term1095.getClass(), "preserveTagCase", false);
        setBooleanField(term1095, term1095.getClass(), "preserveAttributeCase", false);
        setField(term1093, term1093.getClass(), "settings", term1095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTreeBuilder", argTypes, term54, args);
        assertTrue(recursiveEquals(term54, term1093));
        assertTrue(recursiveEquals(retValue, null));
    }

};


