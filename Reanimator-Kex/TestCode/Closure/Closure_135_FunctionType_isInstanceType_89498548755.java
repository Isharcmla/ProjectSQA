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

public class FunctionType_isInstanceType_89498548755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2817;

    public FunctionType_isInstanceType_89498548755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23261 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term23260 = ((Class) term23261).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term23260).setAccessible(true);
        Object enum57 = ((Field) term23260).get((Object) null);
        term2817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term2819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2832 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2842 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term2819, term2819.getClass(), "type", 1861318859);
        setIntField(term2821, term2821.getClass(), "type", -375014958);
        setIntField(term2823, term2823.getClass(), "type", 0);
        setField(term2823, term2823.getClass(), "next", null);
        setField(term2823, term2823.getClass(), "first", null);
        setField(term2823, term2823.getClass(), "last", null);
        setField(term2823, term2823.getClass(), "propListHead", null);
        setIntField(term2823, term2823.getClass(), "sourcePosition", 0);
        setField(term2823, term2823.getClass(), "jsType", null);
        setField(term2823, term2823.getClass(), "parent", null);
        setField(term2821, term2821.getClass(), "next", term2823);
        setIntField(term2826, term2826.getClass(), "type", 0);
        setField(term2826, term2826.getClass(), "next", null);
        setField(term2826, term2826.getClass(), "first", null);
        setField(term2826, term2826.getClass(), "last", null);
        setField(term2826, term2826.getClass(), "propListHead", null);
        setIntField(term2826, term2826.getClass(), "sourcePosition", 0);
        setField(term2826, term2826.getClass(), "jsType", null);
        setField(term2826, term2826.getClass(), "parent", null);
        setField(term2821, term2821.getClass(), "first", term2826);
        setIntField(term2829, term2829.getClass(), "type", 0);
        setField(term2829, term2829.getClass(), "next", null);
        setField(term2829, term2829.getClass(), "first", null);
        setField(term2829, term2829.getClass(), "last", null);
        setField(term2829, term2829.getClass(), "propListHead", null);
        setIntField(term2829, term2829.getClass(), "sourcePosition", 0);
        setField(term2829, term2829.getClass(), "jsType", null);
        setField(term2829, term2829.getClass(), "parent", null);
        setField(term2821, term2821.getClass(), "last", term2829);
        setField(term2832, term2832.getClass(), "next", null);
        setIntField(term2832, term2832.getClass(), "type", 0);
        setIntField(term2832, term2832.getClass(), "intValue", 0);
        setField(term2832, term2832.getClass(), "objectValue", null);
        setField(term2821, term2821.getClass(), "propListHead", term2832);
        setIntField(term2821, term2821.getClass(), "sourcePosition", 1107176718);
        setField(term2821, term2821.getClass(), "jsType", null);
        setField(term2821, term2821.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "next", term2821);
        setIntField(term2836, term2836.getClass(), "type", 0);
        setField(term2836, term2836.getClass(), "next", null);
        setField(term2836, term2836.getClass(), "first", null);
        setField(term2836, term2836.getClass(), "last", null);
        setField(term2836, term2836.getClass(), "propListHead", null);
        setIntField(term2836, term2836.getClass(), "sourcePosition", 0);
        setField(term2836, term2836.getClass(), "jsType", null);
        setField(term2836, term2836.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "first", term2836);
        setIntField(term2839, term2839.getClass(), "type", 0);
        setField(term2839, term2839.getClass(), "next", null);
        setField(term2839, term2839.getClass(), "first", null);
        setField(term2839, term2839.getClass(), "last", null);
        setField(term2839, term2839.getClass(), "propListHead", null);
        setIntField(term2839, term2839.getClass(), "sourcePosition", 0);
        setField(term2839, term2839.getClass(), "jsType", null);
        setField(term2839, term2839.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "last", term2839);
        setField(term2842, term2842.getClass(), "next", null);
        setIntField(term2842, term2842.getClass(), "type", 0);
        setIntField(term2842, term2842.getClass(), "intValue", 0);
        setField(term2842, term2842.getClass(), "objectValue", null);
        setField(term2819, term2819.getClass(), "propListHead", term2842);
        setIntField(term2819, term2819.getClass(), "sourcePosition", 480137250);
        setField(term2819, term2819.getClass(), "jsType", null);
        setField(term2819, term2819.getClass(), "parent", null);
        setField(term2818, term2818.getClass(), "parameters", term2819);
        setField(term2818, term2818.getClass(), "returnType", null);
        setBooleanField(term2818, term2818.getClass(), "resolved", false);
        setField(term2818, term2818.getClass(), "resolveResult", null);
        setField(term2818, term2818.getClass(), "registry", null);
        setField(term2817, term2817.getClass(), "call", term2818);
        setField(term2847, term2847.getClass(), "ownerFunction", null);
        setField(term2847, term2847.getClass(), "className", null);
        setField(term2847, term2847.getClass(), "properties", null);
        setField(term2847, term2847.getClass(), "implicitPrototype", null);
        setBooleanField(term2847, term2847.getClass(), "nativeType", false);
        setBooleanField(term2847, term2847.getClass(), "visited", false);
        setField(term2847, term2847.getClass(), "docInfo", null);
        setBooleanField(term2847, term2847.getClass(), "unknown", false);
        setBooleanField(term2847, term2847.getClass(), "resolved", false);
        setField(term2847, term2847.getClass(), "resolveResult", null);
        setField(term2847, term2847.getClass(), "registry", null);
        setField(term2817, term2817.getClass(), "prototype", term2847);
        setField(term2817, term2817.getClass(), "kind", enum57);
        setField(term2817, term2817.getClass(), "typeOfThis", null);
        setField(term2817, term2817.getClass(), "source", null);
        setField(term2817, term2817.getClass(), "implementedInterfaces", null);
        setField(term2817, term2817.getClass(), "subTypes", null);
        setField(term2817, term2817.getClass(), "templateTypeName", null);
        setField(term2817, term2817.getClass(), "className", null);
        setField(term2817, term2817.getClass(), "properties", null);
        setField(term2817, term2817.getClass(), "implicitPrototype", null);
        setBooleanField(term2817, term2817.getClass(), "nativeType", false);
        setBooleanField(term2817, term2817.getClass(), "visited", false);
        setField(term2817, term2817.getClass(), "docInfo", null);
        setBooleanField(term2817, term2817.getClass(), "unknown", false);
        setBooleanField(term2817, term2817.getClass(), "resolved", false);
        setField(term2817, term2817.getClass(), "resolveResult", null);
        setField(term2817, term2817.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isInstanceType", argTypes, term2817, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


