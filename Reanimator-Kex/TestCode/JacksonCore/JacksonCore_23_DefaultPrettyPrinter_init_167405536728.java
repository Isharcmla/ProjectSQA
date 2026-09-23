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

public class DefaultPrettyPrinter_init_167405536728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public DefaultPrettyPrinter_init_167405536728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term410 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term411 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term412 = (char[]) newCharArray(32);
        Object term415 = newInstance(Class.forName("com.fasterxml.jackson.core.util.Separators"));
        setField(term409, term409.getClass(), "_arrayIndenter", term410);
        setCharElement(term412, 0, (char) 32);
        setCharElement(term412, 1, (char) 32);
        setCharElement(term412, 2, (char) 32);
        setCharElement(term412, 3, (char) 32);
        setCharElement(term412, 4, (char) 32);
        setCharElement(term412, 5, (char) 32);
        setCharElement(term412, 6, (char) 32);
        setCharElement(term412, 7, (char) 32);
        setCharElement(term412, 8, (char) 32);
        setCharElement(term412, 9, (char) 32);
        setCharElement(term412, 10, (char) 32);
        setCharElement(term412, 11, (char) 32);
        setCharElement(term412, 12, (char) 32);
        setCharElement(term412, 13, (char) 32);
        setCharElement(term412, 14, (char) 32);
        setCharElement(term412, 15, (char) 32);
        setCharElement(term412, 16, (char) 32);
        setCharElement(term412, 17, (char) 32);
        setCharElement(term412, 18, (char) 32);
        setCharElement(term412, 19, (char) 32);
        setCharElement(term412, 20, (char) 32);
        setCharElement(term412, 21, (char) 32);
        setCharElement(term412, 22, (char) 32);
        setCharElement(term412, 23, (char) 32);
        setCharElement(term412, 24, (char) 32);
        setCharElement(term412, 25, (char) 32);
        setCharElement(term412, 26, (char) 32);
        setCharElement(term412, 27, (char) 32);
        setCharElement(term412, 28, (char) 32);
        setCharElement(term412, 29, (char) 32);
        setCharElement(term412, 30, (char) 32);
        setCharElement(term412, 31, (char) 32);
        setField(term411, term411.getClass(), "indents", term412);
        setIntField(term411, term411.getClass(), "charsPerLevel", 2);
        setField(term411, term411.getClass(), "eol", "\n");
        setField(term409, term409.getClass(), "_objectIndenter", term411);
        setField(term409, term409.getClass(), "_rootSeparator", null);
        setBooleanField(term409, term409.getClass(), "_spacesInObjectEntries", true);
        setIntField(term409, term409.getClass(), "_nesting", 0);
        setCharField(term415, term415.getClass(), "objectFieldValueSeparator", (char) 58);
        setCharField(term415, term415.getClass(), "objectEntrySeparator", (char) 44);
        setCharField(term415, term415.getClass(), "arrayValueSeparator", (char) 44);
        setField(term409, term409.getClass(), "_separators", term415);
        setField(term409, term409.getClass(), "_objectFieldValueSeparatorWithSpaces", " : ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.SerializableString");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term409));
    }

};


