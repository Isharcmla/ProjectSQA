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

public class StrBuilder_replaceAll_1949998028237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8026;
     Object term73282;
     Object term73197;

    public StrBuilder_replaceAll_1949998028237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8026 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term8027 = (char[]) newCharArray(32);
        setField(term8026, term8026.getClass(), "buffer", term8027);
        setIntField(term8026, term8026.getClass(), "size", 1072005683);
        setField(term8026, term8026.getClass(), "newLine", "jwsfVjMoJT");
        setField(term8026, term8026.getClass(), "nullText", "ZfdXfCCFDf");
        term73282 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73283 = (char[]) newCharArray(32);
        setField(term73282, term73282.getClass(), "buffer", term73283);
        setIntField(term73282, term73282.getClass(), "size", 1072005683);
        setField(term73282, term73282.getClass(), "newLine", "jwsfVjMoJT");
        setField(term73282, term73282.getClass(), "nullText", "ZfdXfCCFDf");
        term73197 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term73198 = (char[]) newCharArray(32);
        setField(term73197, term73197.getClass(), "buffer", term73198);
        setIntField(term73197, term73197.getClass(), "size", 1072005683);
        setField(term73197, term73197.getClass(), "newLine", "jwsfVjMoJT");
        setField(term73197, term73197.getClass(), "nullText", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MwwjNtdOFT";
        args[1] = "VYkqXKVlAJ";
        Object retValue = callMethod(klass, "replaceAll", argTypes, term8026, args);
        assertTrue(recursiveEquals(term8026, term73282));
        assertTrue(recursiveEquals(retValue, term73197));
    }

};


