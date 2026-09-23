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

public class StrBuilder_replaceFirst_1815609019411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283811;
     Object term283941;
     Object term283905;

    public StrBuilder_replaceFirst_1815609019411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283811 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term282517 = (char[]) newCharArray(31);
        setIntField(term283811, term283811.getClass(), "size", 30);
        setField(term283811, term283811.getClass(), "buffer", term282517);
        term283941 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term283942 = (char[]) newCharArray(31);
        setField(term283941, term283941.getClass(), "buffer", term283942);
        setIntField(term283941, term283941.getClass(), "size", 30);
        setField(term283941, term283941.getClass(), "newLine", null);
        setField(term283941, term283941.getClass(), "nullText", null);
        term283905 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term283906 = (char[]) newCharArray(31);
        setField(term283905, term283905.getClass(), "buffer", term283906);
        setIntField(term283905, term283905.getClass(), "size", 30);
        setField(term283905, term283905.getClass(), "newLine", null);
        setField(term283905, term283905.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = (char) 65535;
        args[1] = (char) 0;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term283811, args);
        assertTrue(recursiveEquals(term283811, term283941));
        assertTrue(recursiveEquals(retValue, term283905));
    }

};


