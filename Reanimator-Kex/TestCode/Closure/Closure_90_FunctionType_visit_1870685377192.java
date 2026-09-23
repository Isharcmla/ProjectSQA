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

public class FunctionType_visit_1870685377192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100861;
     Object term100999;
     Object term101224;
     Object term101225;
     Object term101211;

    public FunctionType_visit_1870685377192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100999 = newInstance(Class.forName("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        term101224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101224, term101224.getClass(), "call", null);
        setField(term101224, term101224.getClass(), "prototype", null);
        setField(term101224, term101224.getClass(), "kind", null);
        setField(term101224, term101224.getClass(), "typeOfThis", null);
        setField(term101224, term101224.getClass(), "source", null);
        setField(term101224, term101224.getClass(), "implementedInterfaces", null);
        setField(term101224, term101224.getClass(), "subTypes", null);
        setField(term101224, term101224.getClass(), "templateTypeName", null);
        setField(term101224, term101224.getClass(), "className", null);
        setField(term101224, term101224.getClass(), "properties", null);
        setBooleanField(term101224, term101224.getClass(), "nativeType", false);
        setField(term101224, term101224.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term101224, term101224.getClass(), "prettyPrint", false);
        setBooleanField(term101224, term101224.getClass(), "visited", false);
        setField(term101224, term101224.getClass(), "docInfo", null);
        setBooleanField(term101224, term101224.getClass(), "unknown", false);
        setBooleanField(term101224, term101224.getClass(), "resolved", false);
        setField(term101224, term101224.getClass(), "resolveResult", null);
        setField(term101224, term101224.getClass(), "registry", null);
        term101225 = newInstance(Class.forName("com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2"));
        setField(term101225, term101225.getClass(), "this$0", null);
        term101211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term101211, term101211.getClass(), "call", null);
        setField(term101211, term101211.getClass(), "prototype", null);
        setField(term101211, term101211.getClass(), "kind", null);
        setField(term101211, term101211.getClass(), "typeOfThis", null);
        setField(term101211, term101211.getClass(), "source", null);
        setField(term101211, term101211.getClass(), "implementedInterfaces", null);
        setField(term101211, term101211.getClass(), "subTypes", null);
        setField(term101211, term101211.getClass(), "templateTypeName", null);
        setField(term101211, term101211.getClass(), "className", null);
        setField(term101211, term101211.getClass(), "properties", null);
        setBooleanField(term101211, term101211.getClass(), "nativeType", false);
        setField(term101211, term101211.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term101211, term101211.getClass(), "prettyPrint", false);
        setBooleanField(term101211, term101211.getClass(), "visited", false);
        setField(term101211, term101211.getClass(), "docInfo", null);
        setBooleanField(term101211, term101211.getClass(), "unknown", false);
        setBooleanField(term101211, term101211.getClass(), "resolved", false);
        setField(term101211, term101211.getClass(), "resolveResult", null);
        setField(term101211, term101211.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term100999;
        Object retValue = callMethod(klass, "visit", argTypes, term100861, args);
        assertTrue(recursiveEquals(term100861, term101224));
        assertTrue(recursiveEquals(term100999, term101225));
        assertTrue(recursiveEquals(retValue, term101211));
    }

};


