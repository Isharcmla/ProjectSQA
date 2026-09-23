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

public class InlineFunctions_resolveInlineConflicts_198815384633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term3819;

    public InlineFunctions_resolveInlineConflicts_198815384633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term750 = new HashMap();
        HashMap term765 = new HashMap();
        term749 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term749, term749.getClass(), "fns", term750);
        setField(term749, term749.getClass(), "anonFns", term765);
        setField(term749, term749.getClass(), "compiler", null);
        setField(term749, term749.getClass(), "injector", null);
        setBooleanField(term749, term749.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term749, term749.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term749, term749.getClass(), "inlineLocalFunctions", false);
        setField(term749, term749.getClass(), "specializationState", null);
        HashMap term3820 = new HashMap();
        HashMap term3822 = new HashMap();
        term3819 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term3819, term3819.getClass(), "fns", term3820);
        setField(term3819, term3819.getClass(), "anonFns", term3822);
        setField(term3819, term3819.getClass(), "compiler", null);
        setField(term3819, term3819.getClass(), "injector", null);
        setBooleanField(term3819, term3819.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term3819, term3819.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term3819, term3819.getClass(), "inlineLocalFunctions", false);
        setField(term3819, term3819.getClass(), "specializationState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resolveInlineConflicts", argTypes, term749, args);
        assertTrue(recursiveEquals(term749, term3819));
    }

};


