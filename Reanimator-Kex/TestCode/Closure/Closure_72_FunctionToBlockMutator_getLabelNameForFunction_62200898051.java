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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionToBlockMutator_getLabelNameForFunction_62200898051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6965;

    public FunctionToBlockMutator_getLabelNameForFunction_62200898051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6965 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        Object term7063 = newInstance(Class.forName("com.google.javascript.jscomp.AstParallelizer$5"));
        setField(term6965, term6965.getClass(), "safeNameIdSupplier", term7063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "_                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ";
        try {
            callMethod(klass, "getLabelNameForFunction", argTypes, term6965, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


