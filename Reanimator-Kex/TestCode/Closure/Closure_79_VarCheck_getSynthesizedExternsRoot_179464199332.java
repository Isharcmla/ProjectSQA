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

public class VarCheck_getSynthesizedExternsRoot_179464199332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8117;

    public VarCheck_getSynthesizedExternsRoot_179464199332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8117 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term8207 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        setField(term8117, term8117.getClass(), "synthesizedExternsRoot", null);
        setField(term8117, term8117.getClass(), "synthesizedExternsInput", term8207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSynthesizedExternsRoot", argTypes, term8117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


