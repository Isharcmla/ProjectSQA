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

public class DefaultPrettyPrinter_init_62648938527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public DefaultPrettyPrinter_init_62648938527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term274 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term275 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term276 = (char[]) newCharArray(32);
        Object term279 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term282 = newInstance(Class.forName("com.fasterxml.jackson.core.util.Separators"));
        setField(term273, term273.getClass(), "_arrayIndenter", term274);
        setCharElement(term276, 0, (char) 32);
        setCharElement(term276, 1, (char) 32);
        setCharElement(term276, 2, (char) 32);
        setCharElement(term276, 3, (char) 32);
        setCharElement(term276, 4, (char) 32);
        setCharElement(term276, 5, (char) 32);
        setCharElement(term276, 6, (char) 32);
        setCharElement(term276, 7, (char) 32);
        setCharElement(term276, 8, (char) 32);
        setCharElement(term276, 9, (char) 32);
        setCharElement(term276, 10, (char) 32);
        setCharElement(term276, 11, (char) 32);
        setCharElement(term276, 12, (char) 32);
        setCharElement(term276, 13, (char) 32);
        setCharElement(term276, 14, (char) 32);
        setCharElement(term276, 15, (char) 32);
        setCharElement(term276, 16, (char) 32);
        setCharElement(term276, 17, (char) 32);
        setCharElement(term276, 18, (char) 32);
        setCharElement(term276, 19, (char) 32);
        setCharElement(term276, 20, (char) 32);
        setCharElement(term276, 21, (char) 32);
        setCharElement(term276, 22, (char) 32);
        setCharElement(term276, 23, (char) 32);
        setCharElement(term276, 24, (char) 32);
        setCharElement(term276, 25, (char) 32);
        setCharElement(term276, 26, (char) 32);
        setCharElement(term276, 27, (char) 32);
        setCharElement(term276, 28, (char) 32);
        setCharElement(term276, 29, (char) 32);
        setCharElement(term276, 30, (char) 32);
        setCharElement(term276, 31, (char) 32);
        setField(term275, term275.getClass(), "indents", term276);
        setIntField(term275, term275.getClass(), "charsPerLevel", 2);
        setField(term275, term275.getClass(), "eol", "\n");
        setField(term273, term273.getClass(), "_objectIndenter", term275);
        setField(term279, term279.getClass(), "_value", "PAEBtnZtTD");
        setField(term279, term279.getClass(), "_quotedUTF8Ref", null);
        setField(term279, term279.getClass(), "_unquotedUTF8Ref", null);
        setField(term279, term279.getClass(), "_quotedChars", null);
        setField(term279, term279.getClass(), "_jdkSerializeValue", null);
        setField(term273, term273.getClass(), "_rootSeparator", term279);
        setBooleanField(term273, term273.getClass(), "_spacesInObjectEntries", true);
        setIntField(term273, term273.getClass(), "_nesting", 0);
        setCharField(term282, term282.getClass(), "objectFieldValueSeparator", (char) 58);
        setCharField(term282, term282.getClass(), "objectEntrySeparator", (char) 44);
        setCharField(term282, term282.getClass(), "arrayValueSeparator", (char) 44);
        setField(term273, term273.getClass(), "_separators", term282);
        setField(term273, term273.getClass(), "_objectFieldValueSeparatorWithSpaces", " : ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term273));
    }

};


