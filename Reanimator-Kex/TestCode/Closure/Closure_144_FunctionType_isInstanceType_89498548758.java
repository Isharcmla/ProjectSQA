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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_isInstanceType_89498548758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;

    public FunctionType_isInstanceType_89498548758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25308 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term25307 = ((Class) term25308).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term25307).setAccessible(true);
        Object enum66 = ((Field) term25307).get((Object) null);
        term2760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2775 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2791 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term2762, term2762.getClass(), "type", 458147407);
        setIntField(term2764, term2764.getClass(), "type", 1596070772);
        setIntField(term2766, term2766.getClass(), "type", 0);
        setField(term2766, term2766.getClass(), "next", null);
        setField(term2766, term2766.getClass(), "first", null);
        setField(term2766, term2766.getClass(), "last", null);
        setField(term2766, term2766.getClass(), "propListHead", null);
        setIntField(term2766, term2766.getClass(), "sourcePosition", 0);
        setField(term2766, term2766.getClass(), "jsType", null);
        setField(term2766, term2766.getClass(), "parent", null);
        setField(term2764, term2764.getClass(), "next", term2766);
        setIntField(term2769, term2769.getClass(), "type", 0);
        setField(term2769, term2769.getClass(), "next", null);
        setField(term2769, term2769.getClass(), "first", null);
        setField(term2769, term2769.getClass(), "last", null);
        setField(term2769, term2769.getClass(), "propListHead", null);
        setIntField(term2769, term2769.getClass(), "sourcePosition", 0);
        setField(term2769, term2769.getClass(), "jsType", null);
        setField(term2769, term2769.getClass(), "parent", null);
        setField(term2764, term2764.getClass(), "first", term2769);
        setIntField(term2772, term2772.getClass(), "type", 0);
        setField(term2772, term2772.getClass(), "next", null);
        setField(term2772, term2772.getClass(), "first", null);
        setField(term2772, term2772.getClass(), "last", null);
        setField(term2772, term2772.getClass(), "propListHead", null);
        setIntField(term2772, term2772.getClass(), "sourcePosition", 0);
        setField(term2772, term2772.getClass(), "jsType", null);
        setField(term2772, term2772.getClass(), "parent", null);
        setField(term2764, term2764.getClass(), "last", term2772);
        setField(term2775, term2775.getClass(), "next", null);
        setIntField(term2775, term2775.getClass(), "type", 0);
        setIntField(term2775, term2775.getClass(), "intValue", 0);
        setField(term2775, term2775.getClass(), "objectValue", null);
        setField(term2764, term2764.getClass(), "propListHead", term2775);
        setIntField(term2764, term2764.getClass(), "sourcePosition", 97029295);
        setField(term2764, term2764.getClass(), "jsType", null);
        setField(term2764, term2764.getClass(), "parent", null);
        setField(term2762, term2762.getClass(), "next", term2764);
        setIntField(term2779, term2779.getClass(), "type", 0);
        setField(term2779, term2779.getClass(), "next", null);
        setField(term2779, term2779.getClass(), "first", null);
        setField(term2779, term2779.getClass(), "last", null);
        setField(term2779, term2779.getClass(), "propListHead", null);
        setIntField(term2779, term2779.getClass(), "sourcePosition", 0);
        setField(term2779, term2779.getClass(), "jsType", null);
        setField(term2779, term2779.getClass(), "parent", null);
        setField(term2762, term2762.getClass(), "first", term2779);
        setIntField(term2782, term2782.getClass(), "type", 0);
        setField(term2782, term2782.getClass(), "next", null);
        setField(term2782, term2782.getClass(), "first", null);
        setField(term2782, term2782.getClass(), "last", null);
        setField(term2782, term2782.getClass(), "propListHead", null);
        setIntField(term2782, term2782.getClass(), "sourcePosition", 0);
        setField(term2782, term2782.getClass(), "jsType", null);
        setField(term2782, term2782.getClass(), "parent", null);
        setField(term2762, term2762.getClass(), "last", term2782);
        setField(term2785, term2785.getClass(), "next", null);
        setIntField(term2785, term2785.getClass(), "type", 0);
        setIntField(term2785, term2785.getClass(), "intValue", 0);
        setField(term2785, term2785.getClass(), "objectValue", null);
        setField(term2762, term2762.getClass(), "propListHead", term2785);
        setIntField(term2762, term2762.getClass(), "sourcePosition", -1371869594);
        setField(term2762, term2762.getClass(), "jsType", null);
        setField(term2762, term2762.getClass(), "parent", null);
        setField(term2761, term2761.getClass(), "parameters", term2762);
        setField(term2761, term2761.getClass(), "returnType", null);
        setBooleanField(term2761, term2761.getClass(), "returnTypeInferred", false);
        setBooleanField(term2761, term2761.getClass(), "resolved", false);
        setField(term2761, term2761.getClass(), "resolveResult", null);
        setField(term2761, term2761.getClass(), "registry", null);
        setField(term2760, term2760.getClass(), "call", term2761);
        setField(term2791, term2791.getClass(), "ownerFunction", null);
        setField(term2791, term2791.getClass(), "className", null);
        setField(term2791, term2791.getClass(), "properties", null);
        setField(term2791, term2791.getClass(), "implicitPrototype", null);
        setBooleanField(term2791, term2791.getClass(), "nativeType", false);
        setBooleanField(term2791, term2791.getClass(), "prettyPrint", false);
        setBooleanField(term2791, term2791.getClass(), "visited", false);
        setField(term2791, term2791.getClass(), "docInfo", null);
        setBooleanField(term2791, term2791.getClass(), "unknown", false);
        setBooleanField(term2791, term2791.getClass(), "resolved", false);
        setField(term2791, term2791.getClass(), "resolveResult", null);
        setField(term2791, term2791.getClass(), "registry", null);
        setField(term2760, term2760.getClass(), "prototype", term2791);
        setField(term2760, term2760.getClass(), "kind", enum66);
        setField(term2760, term2760.getClass(), "typeOfThis", null);
        setField(term2760, term2760.getClass(), "source", null);
        setField(term2760, term2760.getClass(), "implementedInterfaces", null);
        setField(term2760, term2760.getClass(), "subTypes", null);
        setField(term2760, term2760.getClass(), "templateTypeName", null);
        setField(term2760, term2760.getClass(), "className", null);
        setField(term2760, term2760.getClass(), "properties", null);
        setField(term2760, term2760.getClass(), "implicitPrototype", null);
        setBooleanField(term2760, term2760.getClass(), "nativeType", false);
        setBooleanField(term2760, term2760.getClass(), "prettyPrint", false);
        setBooleanField(term2760, term2760.getClass(), "visited", false);
        setField(term2760, term2760.getClass(), "docInfo", null);
        setBooleanField(term2760, term2760.getClass(), "unknown", false);
        setBooleanField(term2760, term2760.getClass(), "resolved", false);
        setField(term2760, term2760.getClass(), "resolveResult", null);
        setField(term2760, term2760.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInstanceType", argTypes, term2760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


