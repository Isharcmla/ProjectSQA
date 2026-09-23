package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.StringBuffer;

public class AbstractCommandLineRunner_writeOutput_1967611700115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106344;
     Object term106475;

    public AbstractCommandLineRunner_writeOutput_1967611700115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106344 = new StringBuffer();
        term106475 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term106476 = (byte[]) newByteArray(16);
        setField(term106475, term106475.getClass(), "toStringCache", null);
        setByteElement(term106476, 0, (byte) 110);
        setByteElement(term106476, 1, (byte) 117);
        setByteElement(term106476, 2, (byte) 108);
        setByteElement(term106476, 3, (byte) 108);
        setByteElement(term106476, 4, (byte) 32);
        setByteElement(term106476, 5, (byte) 32);
        setByteElement(term106476, 6, (byte) 32);
        setByteElement(term106476, 7, (byte) 32);
        setByteElement(term106476, 8, (byte) 32);
        setByteElement(term106476, 9, (byte) 10);
        setField(term106475, term106475.getClass(), "value", term106476);
        setByteField(term106475, term106475.getClass(), "coder", (byte) 0);
        setIntField(term106475, term106475.getClass(), "count", 10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Compiler");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term106344;
        args[1] = null;
        args[2] = null;
        args[3] = "         ";
        args[4] = "    ";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term106344, term106475));
    }

};


