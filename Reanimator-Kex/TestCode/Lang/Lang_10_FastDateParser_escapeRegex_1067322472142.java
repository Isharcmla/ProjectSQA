package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.lang.StringBuilder;

public class FastDateParser_escapeRegex_1067322472142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31802;
     Object term46926;
     Object term46901;

    public FastDateParser_escapeRegex_1067322472142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31802 = new StringBuilder();
        term46926 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term46927 = (byte[]) newByteArray(16);
        setByteElement(term46927, 0, (byte) 92);
        setByteElement(term46927, 1, (byte) 115);
        setByteElement(term46927, 2, (byte) 42);
        setByteElement(term46927, 3, (byte) 43);
        setField(term46926, term46926.getClass(), "value", term46927);
        setByteField(term46926, term46926.getClass(), "coder", (byte) 0);
        setIntField(term46926, term46926.getClass(), "count", 4);
        term46901 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term46902 = (byte[]) newByteArray(16);
        setByteElement(term46902, 0, (byte) 92);
        setByteElement(term46902, 1, (byte) 115);
        setByteElement(term46902, 2, (byte) 42);
        setByteElement(term46902, 3, (byte) 43);
        setField(term46901, term46901.getClass(), "value", term46902);
        setByteField(term46901, term46901.getClass(), "coder", (byte) 0);
        setIntField(term46901, term46901.getClass(), "count", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term31802;
        args[1] = "\t\t";
        args[2] = false;
        Object retValue = callMethod(klass, "escapeRegex", argTypes, null, args);
        assertTrue(recursiveEquals(term31802, term46926));
        assertTrue(recursiveEquals(retValue, term46901));
    }

};


