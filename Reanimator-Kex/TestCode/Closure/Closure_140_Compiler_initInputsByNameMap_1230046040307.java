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
import java.util.HashMap;
import java.lang.Object;

public class Compiler_initInputsByNameMap_1230046040307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303136;

    public Compiler_initInputsByNameMap_1230046040307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1303184 = new HashMap();
        term1303136 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object[] term1302958 = (Object[]) newArray("com.google.javascript.jscomp.CompilerInput", 1);
        Object term1303274 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term1303136, term1303136.getClass(), "inputsByName", term1303184);
        setField(term1303274, term1303274.getClass(), "name", "");
        setElement(term1302958, 0, term1303274);
        setField(term1303136, term1303136.getClass(), "externs", term1302958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initInputsByNameMap", argTypes, term1303136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


