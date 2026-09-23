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
import java.util.HashMap;

public class AmbiguateProperties_init_70096112436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6358;

    public AmbiguateProperties_init_70096112436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6082 = new HashMap();
        HashMap term6130 = new HashMap();
        HashMap term6278 = new HashMap();
        Object term6034 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        Object term6230 = newInstance(Class.forName("com.google.common.collect.RegularImmutableBiMap"));
        setField(term6034, term6034.getClass(), "stringNodesToRename", null);
        setField(term6034, term6034.getClass(), "propertyMap", term6082);
        setField(term6034, term6034.getClass(), "externedNames", null);
        setField(term6034, term6034.getClass(), "quotedNames", null);
        setField(term6034, term6034.getClass(), "renamingMap", term6130);
        setField(term6034, term6034.getClass(), "colorMap", null);
        setField(term6034, term6034.getClass(), "intForType", term6230);
        setField(term6034, term6034.getClass(), "relatedBitsets", term6278);
        setField(term6034, term6034.getClass(), "compiler", null);
        setField(term6034, term6034.getClass(), "reservedCharacters", null);
        term6358 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term6358;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


