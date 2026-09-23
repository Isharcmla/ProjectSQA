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
import java.lang.Object;
import java.util.HashSet;

public class InlineFunctions_findCalledFunctions_175932642499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21450;
     Object term21536;
     Object term21756;

    public InlineFunctions_findCalledFunctions_175932642499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21450 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        term21536 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term21622 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term21708 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term21536, term21536.getClass(), "type", 0);
        setIntField(term21622, term21622.getClass(), "type", 0);
        setField(term21622, term21622.getClass(), "first", term21708);
        setField(term21536, term21536.getClass(), "first", term21622);
        term21756 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term21536;
        args[1] = term21756;
        callMethod(klass, "findCalledFunctions", argTypes, term21450, args);
    }

};


