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

public class FunctionType_tryMergeFunctionPiecewise_2003411845339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229836;
     Object term230100;
     Object term230391;
     Object term230394;

    public FunctionType_tryMergeFunctionPiecewise_2003411845339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term229930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term230000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term230000, term230000.getClass(), "first", null);
        setField(term229930, term229930.getClass(), "parameters", term230000);
        setField(term229836, term229836.getClass(), "call", term229930);
        term230100 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term230264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term230334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term230264, term230264.getClass(), "first", term230334);
        setField(term230194, term230194.getClass(), "parameters", term230264);
        setField(term230100, term230100.getClass(), "call", term230194);
        term230391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term230393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term230393, term230393.getClass(), "type", 0);
        setField(term230393, term230393.getClass(), "next", null);
        setField(term230393, term230393.getClass(), "first", null);
        setField(term230393, term230393.getClass(), "last", null);
        setField(term230393, term230393.getClass(), "propListHead", null);
        setIntField(term230393, term230393.getClass(), "sourcePosition", 0);
        setField(term230393, term230393.getClass(), "jsType", null);
        setField(term230393, term230393.getClass(), "parent", null);
        setField(term230392, term230392.getClass(), "parameters", term230393);
        setField(term230392, term230392.getClass(), "returnType", null);
        setBooleanField(term230392, term230392.getClass(), "returnTypeInferred", false);
        setBooleanField(term230392, term230392.getClass(), "resolved", false);
        setField(term230392, term230392.getClass(), "resolveResult", null);
        setField(term230392, term230392.getClass(), "registry", null);
        setField(term230391, term230391.getClass(), "call", term230392);
        setField(term230391, term230391.getClass(), "prototype", null);
        setField(term230391, term230391.getClass(), "kind", null);
        setField(term230391, term230391.getClass(), "typeOfThis", null);
        setField(term230391, term230391.getClass(), "source", null);
        setField(term230391, term230391.getClass(), "implementedInterfaces", null);
        setField(term230391, term230391.getClass(), "subTypes", null);
        setField(term230391, term230391.getClass(), "templateTypeName", null);
        setField(term230391, term230391.getClass(), "className", null);
        setField(term230391, term230391.getClass(), "properties", null);
        setBooleanField(term230391, term230391.getClass(), "nativeType", false);
        setField(term230391, term230391.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term230391, term230391.getClass(), "prettyPrint", false);
        setBooleanField(term230391, term230391.getClass(), "visited", false);
        setField(term230391, term230391.getClass(), "docInfo", null);
        setBooleanField(term230391, term230391.getClass(), "unknown", false);
        setBooleanField(term230391, term230391.getClass(), "resolved", false);
        setField(term230391, term230391.getClass(), "resolveResult", null);
        setField(term230391, term230391.getClass(), "registry", null);
        term230394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term230395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term230396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term230397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term230396, term230396.getClass(), "type", 0);
        setField(term230396, term230396.getClass(), "next", null);
        setIntField(term230397, term230397.getClass(), "type", 0);
        setField(term230397, term230397.getClass(), "next", null);
        setField(term230397, term230397.getClass(), "first", null);
        setField(term230397, term230397.getClass(), "last", null);
        setField(term230397, term230397.getClass(), "propListHead", null);
        setIntField(term230397, term230397.getClass(), "sourcePosition", 0);
        setField(term230397, term230397.getClass(), "jsType", null);
        setField(term230397, term230397.getClass(), "parent", null);
        setField(term230396, term230396.getClass(), "first", term230397);
        setField(term230396, term230396.getClass(), "last", null);
        setField(term230396, term230396.getClass(), "propListHead", null);
        setIntField(term230396, term230396.getClass(), "sourcePosition", 0);
        setField(term230396, term230396.getClass(), "jsType", null);
        setField(term230396, term230396.getClass(), "parent", null);
        setField(term230395, term230395.getClass(), "parameters", term230396);
        setField(term230395, term230395.getClass(), "returnType", null);
        setBooleanField(term230395, term230395.getClass(), "returnTypeInferred", false);
        setBooleanField(term230395, term230395.getClass(), "resolved", false);
        setField(term230395, term230395.getClass(), "resolveResult", null);
        setField(term230395, term230395.getClass(), "registry", null);
        setField(term230394, term230394.getClass(), "call", term230395);
        setField(term230394, term230394.getClass(), "prototype", null);
        setField(term230394, term230394.getClass(), "kind", null);
        setField(term230394, term230394.getClass(), "typeOfThis", null);
        setField(term230394, term230394.getClass(), "source", null);
        setField(term230394, term230394.getClass(), "implementedInterfaces", null);
        setField(term230394, term230394.getClass(), "subTypes", null);
        setField(term230394, term230394.getClass(), "templateTypeName", null);
        setField(term230394, term230394.getClass(), "className", null);
        setField(term230394, term230394.getClass(), "properties", null);
        setBooleanField(term230394, term230394.getClass(), "nativeType", false);
        setField(term230394, term230394.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term230394, term230394.getClass(), "prettyPrint", false);
        setBooleanField(term230394, term230394.getClass(), "visited", false);
        setField(term230394, term230394.getClass(), "docInfo", null);
        setBooleanField(term230394, term230394.getClass(), "unknown", false);
        setBooleanField(term230394, term230394.getClass(), "resolved", false);
        setField(term230394, term230394.getClass(), "resolveResult", null);
        setField(term230394, term230394.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term230100;
        args[1] = false;
        Object retValue = callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term229836, args);
        assertTrue(recursiveEquals(term229836, term230391));
        assertTrue(recursiveEquals(term230100, term230394));
        assertTrue(recursiveEquals(retValue, null));
    }

};


