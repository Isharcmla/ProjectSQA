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

public class InlineFunctions_trimCanidatesUsingOnCost_149856593230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532;
     Object term3175;

    public InlineFunctions_trimCanidatesUsingOnCost_149856593230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term533 = new HashMap();
        HashMap term548 = new HashMap();
        term532 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term532, term532.getClass(), "fns", term533);
        setField(term532, term532.getClass(), "anonFns", term548);
        setField(term532, term532.getClass(), "compiler", null);
        setField(term532, term532.getClass(), "injector", null);
        setBooleanField(term532, term532.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term532, term532.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term532, term532.getClass(), "inlineLocalFunctions", false);
        setField(term532, term532.getClass(), "specializationState", null);
        HashMap term3176 = new HashMap();
        HashMap term3178 = new HashMap();
        term3175 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term3175, term3175.getClass(), "fns", term3176);
        setField(term3175, term3175.getClass(), "anonFns", term3178);
        setField(term3175, term3175.getClass(), "compiler", null);
        setField(term3175, term3175.getClass(), "injector", null);
        setBooleanField(term3175, term3175.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term3175, term3175.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term3175, term3175.getClass(), "inlineLocalFunctions", false);
        setField(term3175, term3175.getClass(), "specializationState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "trimCanidatesUsingOnCost", argTypes, term532, args);
        assertTrue(recursiveEquals(term532, term3175));
    }

};


