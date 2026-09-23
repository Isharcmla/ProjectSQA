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

public class VarCheck_getSynthesizedExternsInput_208763906237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11043;

    public VarCheck_getSynthesizedExternsInput_208763906237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11043 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term11123 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11043, term11043.getClass(), "synthesizedExternsInput", null);
        setField(term11043, term11043.getClass(), "compiler", term11123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSynthesizedExternsInput", argTypes, term11043, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


