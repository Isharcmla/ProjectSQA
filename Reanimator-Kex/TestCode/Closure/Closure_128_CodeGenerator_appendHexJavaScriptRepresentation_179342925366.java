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
     Object term8306;
     Object term8326;

    public CodeGenerator_appendHexJavaScriptRepresentation_179342925366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8306 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8307 = (byte[]) newByteArray(16);
        setField(term8306, term8306.getClass(), "value", term8307);
        setByteField(term8306, term8306.getClass(), "coder", (byte) 47);
        setIntField(term8306, term8306.getClass(), "count", -243422082);
        term8326 = new Character('A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term8306;
        args[1] = term8326;
        try {
            callMethod(klass, "appendHexJavaScriptRepresentation", argTypes, null, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


