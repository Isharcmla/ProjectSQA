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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Compiler_getReverseAbstractInterpreter_1413940190318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1852731;

    public Compiler_getReverseAbstractInterpreter_1413940190318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1852731 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1852825 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1852929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1852731, term1852731.getClass(), "abstractInterpreter", null);
        setField(term1852825, term1852825.getClass(), "codingConvention", null);
        setField(term1852731, term1852731.getClass(), "options", term1852825);
        setField(term1852731, term1852731.getClass(), "defaultCodingConvention", null);
        setField(term1852731, term1852731.getClass(), "typeRegistry", term1852929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getReverseAbstractInterpreter", argTypes, term1852731, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


