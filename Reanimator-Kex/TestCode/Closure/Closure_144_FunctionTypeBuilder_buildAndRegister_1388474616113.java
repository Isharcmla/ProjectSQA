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

public class FunctionTypeBuilder_buildAndRegister_1388474616113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60713;

    public FunctionTypeBuilder_buildAndRegister_1388474616113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60713 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term60831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term60901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60713, term60713.getClass(), "returnType", term60831);
        setField(term60713, term60713.getClass(), "parametersNode", term60901);
        setBooleanField(term60713, term60713.getClass(), "isConstructor", false);
        setBooleanField(term60713, term60713.getClass(), "isInterface", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term60713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


