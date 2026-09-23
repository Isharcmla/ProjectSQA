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

public class Parser_getErrors_122121616823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term1145;
     Object term1136;

    public Parser_getErrors_122121616823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term94 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term98 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term92, term92.getClass(), "treeBuilder", null);
        setIntField(term92, term92.getClass(), "maxErrors", 1134449235);
        setIntField(term94, term94.getClass(), "maxSize", 0);
        setField(term94, term94.getClass(), "elementData", null);
        setIntField(term94, term94.getClass(), "size", 0);
        setIntField(term94, term94.getClass(), "modCount", 0);
        setField(term92, term92.getClass(), "errors", term94);
        setBooleanField(term98, term98.getClass(), "preserveTagCase", false);
        setBooleanField(term98, term98.getClass(), "preserveAttributeCase", true);
        setField(term92, term92.getClass(), "settings", term98);
        term1145 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1146 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1147 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1145, term1145.getClass(), "treeBuilder", null);
        setIntField(term1145, term1145.getClass(), "maxErrors", 1134449235);
        setIntField(term1146, term1146.getClass(), "maxSize", 0);
        setField(term1146, term1146.getClass(), "elementData", null);
        setIntField(term1146, term1146.getClass(), "size", 0);
        setIntField(term1146, term1146.getClass(), "modCount", 0);
        setField(term1145, term1145.getClass(), "errors", term1146);
        setBooleanField(term1147, term1147.getClass(), "preserveTagCase", false);
        setBooleanField(term1147, term1147.getClass(), "preserveAttributeCase", true);
        setField(term1145, term1145.getClass(), "settings", term1147);
        term1136 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setIntField(term1136, term1136.getClass(), "maxSize", 0);
        setField(term1136, term1136.getClass(), "elementData", null);
        setIntField(term1136, term1136.getClass(), "size", 0);
        setIntField(term1136, term1136.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getErrors", argTypes, term92, args);
        assertTrue(recursiveEquals(term92, term1145));
        assertTrue(recursiveEquals(retValue, term1136));
    }

};


