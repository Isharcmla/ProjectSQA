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
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class ClosureCodingConvention_isPropertyTestFunction_159189447079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46758;
     Object term46876;
     Object term46901;
     Object term46904;

    public ClosureCodingConvention_isPropertyTestFunction_159189447079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term46806 = new HashSet();
        term46758 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term46758, term46758.getClass(), "propertyTestFunctions", term46806);
        term46876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46876, term46876.getClass(), "type", 37);
        setField(term46876, term46876.getClass(), "first", term46876);
        HashMap term46903 = new HashMap();
        Set<Object> term46905 =  ((Map) term46903).keySet();
        HashSet term46902 = new HashSet((Collection<? extends Object>) term46905);
        term46901 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term46901, term46901.getClass(), "propertyTestFunctions", term46902);
        term46904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46904, term46904.getClass(), "type", 37);
        setField(term46904, term46904.getClass(), "next", null);
        setField(term46904, term46904.getClass(), "first", term46904);
        setField(term46904, term46904.getClass(), "last", null);
        setField(term46904, term46904.getClass(), "propListHead", null);
        setIntField(term46904, term46904.getClass(), "sourcePosition", 0);
        setField(term46904, term46904.getClass(), "jsType", null);
        setField(term46904, term46904.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46876;
        callMethod(klass, "isPropertyTestFunction", argTypes, term46758, args);
        assertTrue(recursiveEquals(term46758, term46901));
        assertTrue(recursiveEquals(term46876, term46904));
    }

};


