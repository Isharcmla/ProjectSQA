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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;

public class InlineFunctions_removeInlinedFunctions_9886589038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050;
     Object term4551;

    public InlineFunctions_removeInlinedFunctions_9886589038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1051 = new HashMap();
        HashMap term1066 = new HashMap();
        term1050 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term1050, term1050.getClass(), "fns", term1051);
        setField(term1050, term1050.getClass(), "anonFns", term1066);
        setField(term1050, term1050.getClass(), "compiler", null);
        setField(term1050, term1050.getClass(), "injector", null);
        setBooleanField(term1050, term1050.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term1050, term1050.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term1050, term1050.getClass(), "inlineLocalFunctions", false);
        setField(term1050, term1050.getClass(), "specializationState", null);
        HashMap term4552 = new HashMap();
        HashMap term4554 = new HashMap();
        term4551 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term4551, term4551.getClass(), "fns", term4552);
        setField(term4551, term4551.getClass(), "anonFns", term4554);
        setField(term4551, term4551.getClass(), "compiler", null);
        setField(term4551, term4551.getClass(), "injector", null);
        setBooleanField(term4551, term4551.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term4551, term4551.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term4551, term4551.getClass(), "inlineLocalFunctions", false);
        setField(term4551, term4551.getClass(), "specializationState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeInlinedFunctions", argTypes, term1050, args);
        assertTrue(recursiveEquals(term1050, term4551));
    }

};


