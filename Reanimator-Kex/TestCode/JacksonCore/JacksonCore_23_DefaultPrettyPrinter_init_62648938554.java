package com.fasterxml.jackson.core.util;

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
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.util.EqualityUtils.*;
import java.lang.Object;

public class DefaultPrettyPrinter_init_62648938554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6766;

    public DefaultPrettyPrinter_init_62648938554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6537 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        term6766 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term6767 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term6768 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term6769 = (char[]) newCharArray(32);
        Object term6772 = newInstance(Class.forName("com.fasterxml.jackson.core.util.Separators"));
        setField(term6766, term6766.getClass(), "_arrayIndenter", term6767);
        setCharElement(term6769, 0, (char) 32);
        setCharElement(term6769, 1, (char) 32);
        setCharElement(term6769, 2, (char) 32);
        setCharElement(term6769, 3, (char) 32);
        setCharElement(term6769, 4, (char) 32);
        setCharElement(term6769, 5, (char) 32);
        setCharElement(term6769, 6, (char) 32);
        setCharElement(term6769, 7, (char) 32);
        setCharElement(term6769, 8, (char) 32);
        setCharElement(term6769, 9, (char) 32);
        setCharElement(term6769, 10, (char) 32);
        setCharElement(term6769, 11, (char) 32);
        setCharElement(term6769, 12, (char) 32);
        setCharElement(term6769, 13, (char) 32);
        setCharElement(term6769, 14, (char) 32);
        setCharElement(term6769, 15, (char) 32);
        setCharElement(term6769, 16, (char) 32);
        setCharElement(term6769, 17, (char) 32);
        setCharElement(term6769, 18, (char) 32);
        setCharElement(term6769, 19, (char) 32);
        setCharElement(term6769, 20, (char) 32);
        setCharElement(term6769, 21, (char) 32);
        setCharElement(term6769, 22, (char) 32);
        setCharElement(term6769, 23, (char) 32);
        setCharElement(term6769, 24, (char) 32);
        setCharElement(term6769, 25, (char) 32);
        setCharElement(term6769, 26, (char) 32);
        setCharElement(term6769, 27, (char) 32);
        setCharElement(term6769, 28, (char) 32);
        setCharElement(term6769, 29, (char) 32);
        setCharElement(term6769, 30, (char) 32);
        setCharElement(term6769, 31, (char) 32);
        setField(term6768, term6768.getClass(), "indents", term6769);
        setIntField(term6768, term6768.getClass(), "charsPerLevel", 2);
        setField(term6768, term6768.getClass(), "eol", "\n");
        setField(term6766, term6766.getClass(), "_objectIndenter", term6768);
        setField(term6766, term6766.getClass(), "_rootSeparator", null);
        setBooleanField(term6766, term6766.getClass(), "_spacesInObjectEntries", true);
        setIntField(term6766, term6766.getClass(), "_nesting", 0);
        setCharField(term6772, term6772.getClass(), "objectFieldValueSeparator", (char) 58);
        setCharField(term6772, term6772.getClass(), "objectEntrySeparator", (char) 44);
        setCharField(term6772, term6772.getClass(), "arrayValueSeparator", (char) 44);
        setField(term6766, term6766.getClass(), "_separators", term6772);
        setField(term6766, term6766.getClass(), "_objectFieldValueSeparatorWithSpaces", " : ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6766));
    }

};


