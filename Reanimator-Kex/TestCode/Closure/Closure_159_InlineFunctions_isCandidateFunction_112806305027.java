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

public class InlineFunctions_isCandidateFunction_112806305027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;

    public InlineFunctions_isCandidateFunction_112806305027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term444 = new HashMap();
        HashMap term459 = new HashMap();
        term443 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term443, term443.getClass(), "fns", term444);
        setField(term443, term443.getClass(), "anonFns", term459);
        setField(term443, term443.getClass(), "compiler", null);
        setField(term443, term443.getClass(), "injector", null);
        setBooleanField(term443, term443.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term443, term443.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term443, term443.getClass(), "inlineLocalFunctions", false);
        setField(term443, term443.getClass(), "specializationState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$Function");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isCandidateFunction", argTypes, term443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


