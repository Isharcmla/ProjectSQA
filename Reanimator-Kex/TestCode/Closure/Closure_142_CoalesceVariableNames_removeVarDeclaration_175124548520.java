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

public class CoalesceVariableNames_removeVarDeclaration_175124548520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3885;
     Object term3955;

    public CoalesceVariableNames_removeVarDeclaration_175124548520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3885 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        term3955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3955, term3955.getClass(), "parent", term3955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3955;
        try {
            callMethod(klass, "removeVarDeclaration", argTypes, term3885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


