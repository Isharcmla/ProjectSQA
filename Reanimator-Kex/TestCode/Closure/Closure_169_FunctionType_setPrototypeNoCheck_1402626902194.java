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

public class FunctionType_setPrototypeNoCheck_1402626902194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100000;
     Object term100214;
     Object term100284;
     Object term220778;
     Object term220784;
     Object term220790;

    public FunctionType_setPrototypeNoCheck_1402626902194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100000 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term100114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term100114, term100114.getClass(), "type", null);
        setField(term100000, term100000.getClass(), "prototypeSlot", term100114);
        term100214 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term220778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term220779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term220782 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term220783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term220778, term220778.getClass(), "call", null);
        setField(term220779, term220779.getClass(), "name", "prototype");
        setField(term220782, term220782.getClass(), "call", null);
        setField(term220782, term220782.getClass(), "prototypeSlot", null);
        setField(term220782, term220782.getClass(), "kind", null);
        setField(term220782, term220782.getClass(), "propAccess", null);
        setField(term220782, term220782.getClass(), "typeOfThis", null);
        setField(term220782, term220782.getClass(), "source", null);
        setField(term220782, term220782.getClass(), "implementedInterfaces", null);
        setField(term220782, term220782.getClass(), "extendedInterfaces", null);
        setField(term220782, term220782.getClass(), "subTypes", null);
        setField(term220782, term220782.getClass(), "templateTypeNames", null);
        setField(term220782, term220782.getClass(), "className", null);
        setField(term220782, term220782.getClass(), "properties", null);
        setBooleanField(term220782, term220782.getClass(), "nativeType", false);
        setField(term220782, term220782.getClass(), "implicitPrototypeFallback", null);
        setField(term220782, term220782.getClass(), "ownerFunction", term220778);
        setBooleanField(term220782, term220782.getClass(), "prettyPrint", false);
        setBooleanField(term220782, term220782.getClass(), "visited", false);
        setField(term220782, term220782.getClass(), "docInfo", null);
        setBooleanField(term220782, term220782.getClass(), "unknown", false);
        setBooleanField(term220782, term220782.getClass(), "resolved", false);
        setField(term220782, term220782.getClass(), "resolveResult", null);
        setBooleanField(term220782, term220782.getClass(), "inTemplatedCheckVisit", false);
        setField(term220782, term220782.getClass(), "registry", null);
        setField(term220779, term220779.getClass(), "type", term220782);
        setBooleanField(term220779, term220779.getClass(), "inferred", true);
        setIntField(term220783, term220783.getClass(), "type", 0);
        setField(term220783, term220783.getClass(), "next", null);
        setField(term220783, term220783.getClass(), "first", null);
        setField(term220783, term220783.getClass(), "last", null);
        setField(term220783, term220783.getClass(), "propListHead", null);
        setIntField(term220783, term220783.getClass(), "sourcePosition", 0);
        setField(term220783, term220783.getClass(), "jsType", null);
        setField(term220783, term220783.getClass(), "parent", null);
        setField(term220779, term220779.getClass(), "propertyNode", term220783);
        setField(term220779, term220779.getClass(), "docInfo", null);
        setField(term220778, term220778.getClass(), "prototypeSlot", term220779);
        setField(term220778, term220778.getClass(), "kind", null);
        setField(term220778, term220778.getClass(), "propAccess", null);
        setField(term220778, term220778.getClass(), "typeOfThis", null);
        setField(term220778, term220778.getClass(), "source", null);
        setField(term220778, term220778.getClass(), "implementedInterfaces", null);
        setField(term220778, term220778.getClass(), "extendedInterfaces", null);
        setField(term220778, term220778.getClass(), "subTypes", null);
        setField(term220778, term220778.getClass(), "templateTypeNames", null);
        setField(term220778, term220778.getClass(), "className", null);
        setField(term220778, term220778.getClass(), "properties", null);
        setBooleanField(term220778, term220778.getClass(), "nativeType", false);
        setField(term220778, term220778.getClass(), "implicitPrototypeFallback", null);
        setField(term220778, term220778.getClass(), "ownerFunction", null);
        setBooleanField(term220778, term220778.getClass(), "prettyPrint", false);
        setBooleanField(term220778, term220778.getClass(), "visited", false);
        setField(term220778, term220778.getClass(), "docInfo", null);
        setBooleanField(term220778, term220778.getClass(), "unknown", false);
        setBooleanField(term220778, term220778.getClass(), "resolved", false);
        setField(term220778, term220778.getClass(), "resolveResult", null);
        setBooleanField(term220778, term220778.getClass(), "inTemplatedCheckVisit", false);
        setField(term220778, term220778.getClass(), "registry", null);
        term220784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term220785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term220786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term220789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term220784, term220784.getClass(), "call", null);
        setField(term220784, term220784.getClass(), "prototypeSlot", null);
        setField(term220784, term220784.getClass(), "kind", null);
        setField(term220784, term220784.getClass(), "propAccess", null);
        setField(term220784, term220784.getClass(), "typeOfThis", null);
        setField(term220784, term220784.getClass(), "source", null);
        setField(term220784, term220784.getClass(), "implementedInterfaces", null);
        setField(term220784, term220784.getClass(), "extendedInterfaces", null);
        setField(term220784, term220784.getClass(), "subTypes", null);
        setField(term220784, term220784.getClass(), "templateTypeNames", null);
        setField(term220784, term220784.getClass(), "className", null);
        setField(term220784, term220784.getClass(), "properties", null);
        setBooleanField(term220784, term220784.getClass(), "nativeType", false);
        setField(term220784, term220784.getClass(), "implicitPrototypeFallback", null);
        setField(term220785, term220785.getClass(), "call", null);
        setField(term220786, term220786.getClass(), "name", "prototype");
        setField(term220786, term220786.getClass(), "type", term220784);
        setBooleanField(term220786, term220786.getClass(), "inferred", true);
        setIntField(term220789, term220789.getClass(), "type", 0);
        setField(term220789, term220789.getClass(), "next", null);
        setField(term220789, term220789.getClass(), "first", null);
        setField(term220789, term220789.getClass(), "last", null);
        setField(term220789, term220789.getClass(), "propListHead", null);
        setIntField(term220789, term220789.getClass(), "sourcePosition", 0);
        setField(term220789, term220789.getClass(), "jsType", null);
        setField(term220789, term220789.getClass(), "parent", null);
        setField(term220786, term220786.getClass(), "propertyNode", term220789);
        setField(term220786, term220786.getClass(), "docInfo", null);
        setField(term220785, term220785.getClass(), "prototypeSlot", term220786);
        setField(term220785, term220785.getClass(), "kind", null);
        setField(term220785, term220785.getClass(), "propAccess", null);
        setField(term220785, term220785.getClass(), "typeOfThis", null);
        setField(term220785, term220785.getClass(), "source", null);
        setField(term220785, term220785.getClass(), "implementedInterfaces", null);
        setField(term220785, term220785.getClass(), "extendedInterfaces", null);
        setField(term220785, term220785.getClass(), "subTypes", null);
        setField(term220785, term220785.getClass(), "templateTypeNames", null);
        setField(term220785, term220785.getClass(), "className", null);
        setField(term220785, term220785.getClass(), "properties", null);
        setBooleanField(term220785, term220785.getClass(), "nativeType", false);
        setField(term220785, term220785.getClass(), "implicitPrototypeFallback", null);
        setField(term220785, term220785.getClass(), "ownerFunction", null);
        setBooleanField(term220785, term220785.getClass(), "prettyPrint", false);
        setBooleanField(term220785, term220785.getClass(), "visited", false);
        setField(term220785, term220785.getClass(), "docInfo", null);
        setBooleanField(term220785, term220785.getClass(), "unknown", false);
        setBooleanField(term220785, term220785.getClass(), "resolved", false);
        setField(term220785, term220785.getClass(), "resolveResult", null);
        setBooleanField(term220785, term220785.getClass(), "inTemplatedCheckVisit", false);
        setField(term220785, term220785.getClass(), "registry", null);
        setField(term220784, term220784.getClass(), "ownerFunction", term220785);
        setBooleanField(term220784, term220784.getClass(), "prettyPrint", false);
        setBooleanField(term220784, term220784.getClass(), "visited", false);
        setField(term220784, term220784.getClass(), "docInfo", null);
        setBooleanField(term220784, term220784.getClass(), "unknown", false);
        setBooleanField(term220784, term220784.getClass(), "resolved", false);
        setField(term220784, term220784.getClass(), "resolveResult", null);
        setBooleanField(term220784, term220784.getClass(), "inTemplatedCheckVisit", false);
        setField(term220784, term220784.getClass(), "registry", null);
        term220790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term220790, term220790.getClass(), "type", 0);
        setField(term220790, term220790.getClass(), "next", null);
        setField(term220790, term220790.getClass(), "first", null);
        setField(term220790, term220790.getClass(), "last", null);
        setField(term220790, term220790.getClass(), "propListHead", null);
        setIntField(term220790, term220790.getClass(), "sourcePosition", 0);
        setField(term220790, term220790.getClass(), "jsType", null);
        setField(term220790, term220790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term100214;
        args[1] = term100284;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term100000, args);
        assertTrue(recursiveEquals(term100000, term220778));
        assertTrue(recursiveEquals(term100214, term220784));
        assertTrue(recursiveEquals(term100284, term220790));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


