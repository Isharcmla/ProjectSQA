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

public class FunctionType_getTopMostDefiningType_166749951989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13848;

    public FunctionType_getTopMostDefiningType_166749951989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term46856 = ((Class) term46857).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term46856).setAccessible(true);
        Object enum118 = ((Field) term46856).get((Object) null);
        term13848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term13849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term13850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13863 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13873 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term13850, term13850.getClass(), "type", 1390820006);
        setIntField(term13852, term13852.getClass(), "type", 1023209512);
        setIntField(term13854, term13854.getClass(), "type", 0);
        setField(term13854, term13854.getClass(), "next", null);
        setField(term13854, term13854.getClass(), "first", null);
        setField(term13854, term13854.getClass(), "last", null);
        setField(term13854, term13854.getClass(), "propListHead", null);
        setIntField(term13854, term13854.getClass(), "sourcePosition", 0);
        setField(term13854, term13854.getClass(), "jsType", null);
        setField(term13854, term13854.getClass(), "parent", null);
        setField(term13852, term13852.getClass(), "next", term13854);
        setIntField(term13857, term13857.getClass(), "type", 0);
        setField(term13857, term13857.getClass(), "next", null);
        setField(term13857, term13857.getClass(), "first", null);
        setField(term13857, term13857.getClass(), "last", null);
        setField(term13857, term13857.getClass(), "propListHead", null);
        setIntField(term13857, term13857.getClass(), "sourcePosition", 0);
        setField(term13857, term13857.getClass(), "jsType", null);
        setField(term13857, term13857.getClass(), "parent", null);
        setField(term13852, term13852.getClass(), "first", term13857);
        setIntField(term13860, term13860.getClass(), "type", 0);
        setField(term13860, term13860.getClass(), "next", null);
        setField(term13860, term13860.getClass(), "first", null);
        setField(term13860, term13860.getClass(), "last", null);
        setField(term13860, term13860.getClass(), "propListHead", null);
        setIntField(term13860, term13860.getClass(), "sourcePosition", 0);
        setField(term13860, term13860.getClass(), "jsType", null);
        setField(term13860, term13860.getClass(), "parent", null);
        setField(term13852, term13852.getClass(), "last", term13860);
        setField(term13863, term13863.getClass(), "next", null);
        setIntField(term13863, term13863.getClass(), "type", 0);
        setIntField(term13863, term13863.getClass(), "intValue", 0);
        setField(term13863, term13863.getClass(), "objectValue", null);
        setField(term13852, term13852.getClass(), "propListHead", term13863);
        setIntField(term13852, term13852.getClass(), "sourcePosition", 1084849225);
        setField(term13852, term13852.getClass(), "jsType", null);
        setField(term13852, term13852.getClass(), "parent", null);
        setField(term13850, term13850.getClass(), "next", term13852);
        setIntField(term13867, term13867.getClass(), "type", 0);
        setField(term13867, term13867.getClass(), "next", null);
        setField(term13867, term13867.getClass(), "first", null);
        setField(term13867, term13867.getClass(), "last", null);
        setField(term13867, term13867.getClass(), "propListHead", null);
        setIntField(term13867, term13867.getClass(), "sourcePosition", 0);
        setField(term13867, term13867.getClass(), "jsType", null);
        setField(term13867, term13867.getClass(), "parent", null);
        setField(term13850, term13850.getClass(), "first", term13867);
        setIntField(term13870, term13870.getClass(), "type", 0);
        setField(term13870, term13870.getClass(), "next", null);
        setField(term13870, term13870.getClass(), "first", null);
        setField(term13870, term13870.getClass(), "last", null);
        setField(term13870, term13870.getClass(), "propListHead", null);
        setIntField(term13870, term13870.getClass(), "sourcePosition", 0);
        setField(term13870, term13870.getClass(), "jsType", null);
        setField(term13870, term13870.getClass(), "parent", null);
        setField(term13850, term13850.getClass(), "last", term13870);
        setField(term13873, term13873.getClass(), "next", null);
        setIntField(term13873, term13873.getClass(), "type", 0);
        setIntField(term13873, term13873.getClass(), "intValue", 0);
        setField(term13873, term13873.getClass(), "objectValue", null);
        setField(term13850, term13850.getClass(), "propListHead", term13873);
        setIntField(term13850, term13850.getClass(), "sourcePosition", -1702055571);
        setField(term13850, term13850.getClass(), "jsType", null);
        setField(term13850, term13850.getClass(), "parent", null);
        setField(term13849, term13849.getClass(), "parameters", term13850);
        setField(term13849, term13849.getClass(), "returnType", null);
        setBooleanField(term13849, term13849.getClass(), "returnTypeInferred", false);
        setBooleanField(term13849, term13849.getClass(), "resolved", false);
        setField(term13849, term13849.getClass(), "resolveResult", null);
        setField(term13849, term13849.getClass(), "registry", null);
        setField(term13848, term13848.getClass(), "call", term13849);
        setField(term13879, term13879.getClass(), "ownerFunction", null);
        setField(term13879, term13879.getClass(), "className", null);
        setField(term13879, term13879.getClass(), "properties", null);
        setBooleanField(term13879, term13879.getClass(), "nativeType", false);
        setField(term13879, term13879.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term13879, term13879.getClass(), "prettyPrint", false);
        setBooleanField(term13879, term13879.getClass(), "visited", false);
        setField(term13879, term13879.getClass(), "docInfo", null);
        setBooleanField(term13879, term13879.getClass(), "unknown", false);
        setBooleanField(term13879, term13879.getClass(), "resolved", false);
        setField(term13879, term13879.getClass(), "resolveResult", null);
        setField(term13879, term13879.getClass(), "registry", null);
        setField(term13848, term13848.getClass(), "prototype", term13879);
        setField(term13848, term13848.getClass(), "kind", enum118);
        setField(term13848, term13848.getClass(), "typeOfThis", null);
        setField(term13848, term13848.getClass(), "source", null);
        setField(term13848, term13848.getClass(), "implementedInterfaces", null);
        setField(term13848, term13848.getClass(), "subTypes", null);
        setField(term13848, term13848.getClass(), "templateTypeName", null);
        setField(term13848, term13848.getClass(), "className", null);
        setField(term13848, term13848.getClass(), "properties", null);
        setBooleanField(term13848, term13848.getClass(), "nativeType", false);
        setField(term13848, term13848.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term13848, term13848.getClass(), "prettyPrint", false);
        setBooleanField(term13848, term13848.getClass(), "visited", false);
        setField(term13848, term13848.getClass(), "docInfo", null);
        setBooleanField(term13848, term13848.getClass(), "unknown", false);
        setBooleanField(term13848, term13848.getClass(), "resolved", false);
        setField(term13848, term13848.getClass(), "resolveResult", null);
        setField(term13848, term13848.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yGtHPyvYiQ";
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term13848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


