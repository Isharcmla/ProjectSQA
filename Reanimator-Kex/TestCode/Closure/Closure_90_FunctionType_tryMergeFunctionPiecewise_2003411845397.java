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

public class FunctionType_tryMergeFunctionPiecewise_2003411845397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300718;
     Object term301122;
     Object term301580;
     Object term301585;

    public FunctionType_tryMergeFunctionPiecewise_2003411845397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term300812 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term300882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term300952, term300952.getClass(), "jsType", null);
        setField(term301461, term301461.getClass(), "jsType", null);
        setField(term301461, term301461.getClass(), "next", null);
        setField(term300952, term300952.getClass(), "next", term301461);
        setField(term300882, term300882.getClass(), "first", term300952);
        setField(term300812, term300812.getClass(), "parameters", term300882);
        setField(term300718, term300718.getClass(), "call", term300812);
        term301122 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term301286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term301356, term301356.getClass(), "jsType", null);
        setField(term301426, term301426.getClass(), "jsType", null);
        setField(term301426, term301426.getClass(), "next", term301461);
        setField(term301356, term301356.getClass(), "next", term301426);
        setField(term301286, term301286.getClass(), "first", term301356);
        setField(term301216, term301216.getClass(), "parameters", term301286);
        setField(term301122, term301122.getClass(), "call", term301216);
        term301580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term301582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301582, term301582.getClass(), "type", 0);
        setField(term301582, term301582.getClass(), "next", null);
        setIntField(term301583, term301583.getClass(), "type", 0);
        setIntField(term301584, term301584.getClass(), "type", 0);
        setField(term301584, term301584.getClass(), "next", null);
        setField(term301584, term301584.getClass(), "first", null);
        setField(term301584, term301584.getClass(), "last", null);
        setField(term301584, term301584.getClass(), "propListHead", null);
        setIntField(term301584, term301584.getClass(), "sourcePosition", 0);
        setField(term301584, term301584.getClass(), "jsType", null);
        setField(term301584, term301584.getClass(), "parent", null);
        setField(term301583, term301583.getClass(), "next", term301584);
        setField(term301583, term301583.getClass(), "first", null);
        setField(term301583, term301583.getClass(), "last", null);
        setField(term301583, term301583.getClass(), "propListHead", null);
        setIntField(term301583, term301583.getClass(), "sourcePosition", 0);
        setField(term301583, term301583.getClass(), "jsType", null);
        setField(term301583, term301583.getClass(), "parent", null);
        setField(term301582, term301582.getClass(), "first", term301583);
        setField(term301582, term301582.getClass(), "last", null);
        setField(term301582, term301582.getClass(), "propListHead", null);
        setIntField(term301582, term301582.getClass(), "sourcePosition", 0);
        setField(term301582, term301582.getClass(), "jsType", null);
        setField(term301582, term301582.getClass(), "parent", null);
        setField(term301581, term301581.getClass(), "parameters", term301582);
        setField(term301581, term301581.getClass(), "returnType", null);
        setBooleanField(term301581, term301581.getClass(), "returnTypeInferred", false);
        setBooleanField(term301581, term301581.getClass(), "resolved", false);
        setField(term301581, term301581.getClass(), "resolveResult", null);
        setField(term301581, term301581.getClass(), "registry", null);
        setField(term301580, term301580.getClass(), "call", term301581);
        setField(term301580, term301580.getClass(), "prototype", null);
        setField(term301580, term301580.getClass(), "kind", null);
        setField(term301580, term301580.getClass(), "typeOfThis", null);
        setField(term301580, term301580.getClass(), "source", null);
        setField(term301580, term301580.getClass(), "implementedInterfaces", null);
        setField(term301580, term301580.getClass(), "subTypes", null);
        setField(term301580, term301580.getClass(), "templateTypeName", null);
        setField(term301580, term301580.getClass(), "className", null);
        setField(term301580, term301580.getClass(), "properties", null);
        setBooleanField(term301580, term301580.getClass(), "nativeType", false);
        setField(term301580, term301580.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term301580, term301580.getClass(), "prettyPrint", false);
        setBooleanField(term301580, term301580.getClass(), "visited", false);
        setField(term301580, term301580.getClass(), "docInfo", null);
        setBooleanField(term301580, term301580.getClass(), "unknown", false);
        setBooleanField(term301580, term301580.getClass(), "resolved", false);
        setField(term301580, term301580.getClass(), "resolveResult", null);
        setField(term301580, term301580.getClass(), "registry", null);
        term301585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term301586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term301587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301587, term301587.getClass(), "type", 0);
        setField(term301587, term301587.getClass(), "next", null);
        setIntField(term301588, term301588.getClass(), "type", 0);
        setIntField(term301589, term301589.getClass(), "type", 0);
        setIntField(term301590, term301590.getClass(), "type", 0);
        setField(term301590, term301590.getClass(), "next", null);
        setField(term301590, term301590.getClass(), "first", null);
        setField(term301590, term301590.getClass(), "last", null);
        setField(term301590, term301590.getClass(), "propListHead", null);
        setIntField(term301590, term301590.getClass(), "sourcePosition", 0);
        setField(term301590, term301590.getClass(), "jsType", null);
        setField(term301590, term301590.getClass(), "parent", null);
        setField(term301589, term301589.getClass(), "next", term301590);
        setField(term301589, term301589.getClass(), "first", null);
        setField(term301589, term301589.getClass(), "last", null);
        setField(term301589, term301589.getClass(), "propListHead", null);
        setIntField(term301589, term301589.getClass(), "sourcePosition", 0);
        setField(term301589, term301589.getClass(), "jsType", null);
        setField(term301589, term301589.getClass(), "parent", null);
        setField(term301588, term301588.getClass(), "next", term301589);
        setField(term301588, term301588.getClass(), "first", null);
        setField(term301588, term301588.getClass(), "last", null);
        setField(term301588, term301588.getClass(), "propListHead", null);
        setIntField(term301588, term301588.getClass(), "sourcePosition", 0);
        setField(term301588, term301588.getClass(), "jsType", null);
        setField(term301588, term301588.getClass(), "parent", null);
        setField(term301587, term301587.getClass(), "first", term301588);
        setField(term301587, term301587.getClass(), "last", null);
        setField(term301587, term301587.getClass(), "propListHead", null);
        setIntField(term301587, term301587.getClass(), "sourcePosition", 0);
        setField(term301587, term301587.getClass(), "jsType", null);
        setField(term301587, term301587.getClass(), "parent", null);
        setField(term301586, term301586.getClass(), "parameters", term301587);
        setField(term301586, term301586.getClass(), "returnType", null);
        setBooleanField(term301586, term301586.getClass(), "returnTypeInferred", false);
        setBooleanField(term301586, term301586.getClass(), "resolved", false);
        setField(term301586, term301586.getClass(), "resolveResult", null);
        setField(term301586, term301586.getClass(), "registry", null);
        setField(term301585, term301585.getClass(), "call", term301586);
        setField(term301585, term301585.getClass(), "prototype", null);
        setField(term301585, term301585.getClass(), "kind", null);
        setField(term301585, term301585.getClass(), "typeOfThis", null);
        setField(term301585, term301585.getClass(), "source", null);
        setField(term301585, term301585.getClass(), "implementedInterfaces", null);
        setField(term301585, term301585.getClass(), "subTypes", null);
        setField(term301585, term301585.getClass(), "templateTypeName", null);
        setField(term301585, term301585.getClass(), "className", null);
        setField(term301585, term301585.getClass(), "properties", null);
        setBooleanField(term301585, term301585.getClass(), "nativeType", false);
        setField(term301585, term301585.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term301585, term301585.getClass(), "prettyPrint", false);
        setBooleanField(term301585, term301585.getClass(), "visited", false);
        setField(term301585, term301585.getClass(), "docInfo", null);
        setBooleanField(term301585, term301585.getClass(), "unknown", false);
        setBooleanField(term301585, term301585.getClass(), "resolved", false);
        setField(term301585, term301585.getClass(), "resolveResult", null);
        setField(term301585, term301585.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term301122;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term300718, args);
        assertTrue(recursiveEquals(term300718, term301580));
        assertTrue(recursiveEquals(term301122, term301585));
        assertTrue(recursiveEquals(retValue, null));
    }

};


