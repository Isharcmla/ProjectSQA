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

public class ControlFlowAnalysis_mayThrowException_128763591887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28761;
     Object term28767;

    public ControlFlowAnalysis_mayThrowException_128763591887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28761, term28761.getClass(), "type", 102);
        term28767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28767, term28767.getClass(), "type", 102);
        setField(term28767, term28767.getClass(), "next", null);
        setField(term28767, term28767.getClass(), "first", null);
        setField(term28767, term28767.getClass(), "last", null);
        setField(term28767, term28767.getClass(), "propListHead", null);
        setIntField(term28767, term28767.getClass(), "sourcePosition", 0);
        setField(term28767, term28767.getClass(), "jsType", null);
        setField(term28767, term28767.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28761;
        Object retValue = callMethod(klass, "mayThrowException", argTypes, null, args);
        assertTrue(recursiveEquals(term28761, term28767));
        assertTrue(recursiveEquals(retValue, true));
    }

};


