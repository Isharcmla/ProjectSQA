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

public class DefaultPrettyPrinter_init_47423626226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;

    public DefaultPrettyPrinter_init_47423626226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        Object term116 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        Object term117 = newInstance(Class.forName("com.fasterxml.jackson.core.util.DefaultIndenter"));
        char[] term118 = (char[]) newCharArray(32);
        Object term121 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term124 = newInstance(Class.forName("com.fasterxml.jackson.core.util.Separators"));
        setField(term115, term115.getClass(), "_arrayIndenter", term116);
        setCharElement(term118, 0, (char) 32);
        setCharElement(term118, 1, (char) 32);
        setCharElement(term118, 2, (char) 32);
        setCharElement(term118, 3, (char) 32);
        setCharElement(term118, 4, (char) 32);
        setCharElement(term118, 5, (char) 32);
        setCharElement(term118, 6, (char) 32);
        setCharElement(term118, 7, (char) 32);
        setCharElement(term118, 8, (char) 32);
        setCharElement(term118, 9, (char) 32);
        setCharElement(term118, 10, (char) 32);
        setCharElement(term118, 11, (char) 32);
        setCharElement(term118, 12, (char) 32);
        setCharElement(term118, 13, (char) 32);
        setCharElement(term118, 14, (char) 32);
        setCharElement(term118, 15, (char) 32);
        setCharElement(term118, 16, (char) 32);
        setCharElement(term118, 17, (char) 32);
        setCharElement(term118, 18, (char) 32);
        setCharElement(term118, 19, (char) 32);
        setCharElement(term118, 20, (char) 32);
        setCharElement(term118, 21, (char) 32);
        setCharElement(term118, 22, (char) 32);
        setCharElement(term118, 23, (char) 32);
        setCharElement(term118, 24, (char) 32);
        setCharElement(term118, 25, (char) 32);
        setCharElement(term118, 26, (char) 32);
        setCharElement(term118, 27, (char) 32);
        setCharElement(term118, 28, (char) 32);
        setCharElement(term118, 29, (char) 32);
        setCharElement(term118, 30, (char) 32);
        setCharElement(term118, 31, (char) 32);
        setField(term117, term117.getClass(), "indents", term118);
        setIntField(term117, term117.getClass(), "charsPerLevel", 2);
        setField(term117, term117.getClass(), "eol", "\n");
        setField(term115, term115.getClass(), "_objectIndenter", term117);
        setField(term121, term121.getClass(), "_value", " ");
        setField(term121, term121.getClass(), "_quotedUTF8Ref", null);
        setField(term121, term121.getClass(), "_unquotedUTF8Ref", null);
        setField(term121, term121.getClass(), "_quotedChars", null);
        setField(term121, term121.getClass(), "_jdkSerializeValue", null);
        setField(term115, term115.getClass(), "_rootSeparator", term121);
        setBooleanField(term115, term115.getClass(), "_spacesInObjectEntries", true);
        setIntField(term115, term115.getClass(), "_nesting", 0);
        setCharField(term124, term124.getClass(), "objectFieldValueSeparator", (char) 58);
        setCharField(term124, term124.getClass(), "objectEntrySeparator", (char) 44);
        setCharField(term124, term124.getClass(), "arrayValueSeparator", (char) 44);
        setField(term115, term115.getClass(), "_separators", term124);
        setField(term115, term115.getClass(), "_objectFieldValueSeparatorWithSpaces", " : ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115));
    }

};


