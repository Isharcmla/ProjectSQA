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
import java.lang.StringBuilder;

public class AbstractCommandLineRunner_writeOutput_1967611700105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104159;
     Object term104264;

    public AbstractCommandLineRunner_writeOutput_1967611700105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104159 = new StringBuilder();
        term104264 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term104265 = (byte[]) newByteArray(16);
        setByteElement(term104265, 0, (byte) 110);
        setByteElement(term104265, 1, (byte) 117);
        setByteElement(term104265, 2, (byte) 108);
        setByteElement(term104265, 3, (byte) 108);
        setByteElement(term104265, 4, (byte) 10);
        setField(term104264, term104264.getClass(), "value", term104265);
        setByteField(term104264, term104264.getClass(), "coder", (byte) 0);
        setIntField(term104264, term104264.getClass(), "count", 5);
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
        args[0] = term104159;
        args[1] = null;
        args[2] = null;
        args[3] = "";
        args[4] = "";
        callMethod(klass, "writeOutput", argTypes, null, args);
        assertTrue(recursiveEquals(term104159, term104264));
    }

};


