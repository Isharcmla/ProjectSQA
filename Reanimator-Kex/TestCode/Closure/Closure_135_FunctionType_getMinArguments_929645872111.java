package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionType_getMinArguments_929645872111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60595;
     Object term60702;

    public FunctionType_getMinArguments_929645872111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term60689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60689, term60689.getClass(), "parameters", null);
        setField(term60595, term60595.getClass(), "call", term60689);
        term60702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term60703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term60703, term60703.getClass(), "parameters", null);
        setField(term60703, term60703.getClass(), "returnType", null);
        setBooleanField(term60703, term60703.getClass(), "resolved", false);
        setField(term60703, term60703.getClass(), "resolveResult", null);
        setField(term60703, term60703.getClass(), "registry", null);
        setField(term60702, term60702.getClass(), "call", term60703);
        setField(term60702, term60702.getClass(), "prototype", null);
        setField(term60702, term60702.getClass(), "kind", null);
        setField(term60702, term60702.getClass(), "typeOfThis", null);
        setField(term60702, term60702.getClass(), "source", null);
        setField(term60702, term60702.getClass(), "implementedInterfaces", null);
        setField(term60702, term60702.getClass(), "subTypes", null);
        setField(term60702, term60702.getClass(), "templateTypeName", null);
        setField(term60702, term60702.getClass(), "className", null);
        setField(term60702, term60702.getClass(), "properties", null);
        setField(term60702, term60702.getClass(), "implicitPrototype", null);
        setBooleanField(term60702, term60702.getClass(), "nativeType", false);
        setBooleanField(term60702, term60702.getClass(), "visited", false);
        setField(term60702, term60702.getClass(), "docInfo", null);
        setBooleanField(term60702, term60702.getClass(), "unknown", false);
        setBooleanField(term60702, term60702.getClass(), "resolved", false);
        setField(term60702, term60702.getClass(), "resolveResult", null);
        setField(term60702, term60702.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinArguments", argTypes, term60595, args);
        assertTrue(recursiveEquals(term60595, term60702));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


