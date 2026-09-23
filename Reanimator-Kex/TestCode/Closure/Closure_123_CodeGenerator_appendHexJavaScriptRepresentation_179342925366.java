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
import java.lang.StringIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class CodeGenerator_appendHexJavaScriptRepresentation_179342925366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17029;
     Object term17049;

    public CodeGenerator_appendHexJavaScriptRepresentation_179342925366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17029 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term17030 = (byte[]) newByteArray(16);
        setField(term17029, term17029.getClass(), "value", term17030);
        setByteField(term17029, term17029.getClass(), "coder", (byte) 47);
        setIntField(term17029, term17029.getClass(), "count", -243422082);
        term17049 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term17029;
        args[1] = term17049;
        try {
            callMethod(klass, "appendHexJavaScriptRepresentation", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


