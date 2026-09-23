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

public class VarCheck_getSynthesizedExternsRoot_179464199330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7945;

    public VarCheck_getSynthesizedExternsRoot_179464199330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7945 = newInstance(Class.forName("com.google.javascript.jscomp.VarCheck"));
        Object term8025 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term7945, term7945.getClass(), "synthesizedExternsRoot", null);
        setField(term7945, term7945.getClass(), "synthesizedExternsInput", null);
        setField(term7945, term7945.getClass(), "compiler", term8025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSynthesizedExternsRoot", argTypes, term7945, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


