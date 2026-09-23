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

public class RemoveUnusedVars_isRemovableVar_206319811844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9128;

    public RemoveUnusedVars_isRemovableVar_206319811844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9128 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term9128, term9128.getClass(), "removeGlobals", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isRemovableVar", argTypes, term9128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


