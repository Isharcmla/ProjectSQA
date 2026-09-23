package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_replaceAll_1949998028356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134829;
     Object term150745;
     Object term150731;

    public StrBuilder_replaceAll_1949998028356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134829 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term134829, term134829.getClass(), "size", 2);
        term150745 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150745, term150745.getClass(), "buffer", null);
        setIntField(term150745, term150745.getClass(), "size", 2);
        setField(term150745, term150745.getClass(), "newLine", null);
        setField(term150745, term150745.getClass(), "nullText", null);
        term150731 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150731, term150731.getClass(), "buffer", null);
        setIntField(term150731, term150731.getClass(), "size", 2);
        setField(term150731, term150731.getClass(), "newLine", null);
        setField(term150731, term150731.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "   ";
        args[1] = "   ";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term134829, args);
        assertTrue(recursiveEquals(term134829, term150745));
        assertTrue(recursiveEquals(retValue, term150731));
    }

};


