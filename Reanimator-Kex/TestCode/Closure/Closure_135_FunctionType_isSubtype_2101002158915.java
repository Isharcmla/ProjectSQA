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
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991393;
     Object term991743;
     Object term992774;
     Object term992779;

    public FunctionType_isSubtype_2101002158915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term992786 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term992785 = ((Class) term992786).getDeclaredField((String) "ORDINARY");
        ((Field) term992785).setAccessible(true);
        Object enum1852 = ((Field) term992785).get((Object) null);
        term991393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term991635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term991393, term991393.getClass(), "kind", enum1852);
        setField(term991393, term991393.getClass(), "typeOfThis", term991393);
        setField(term991393, term991393.getClass(), "call", term991635);
        Class<? extends Object> term993077 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term993076 = ((Class) term993077).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term993076).setAccessible(true);
        Object enum1853 = ((Field) term993076).get((Object) null);
        term991743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term992003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term991743, term991743.getClass(), "kind", enum1853);
        setField(term991743, term991743.getClass(), "typeOfThis", term992003);
        setField(term991743, term991743.getClass(), "call", null);
        Class<? extends Object> term993377 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term993376 = ((Class) term993377).getDeclaredField((String) "ORDINARY");
        ((Field) term993376).setAccessible(true);
        Object enum1854 = ((Field) term993376).get((Object) null);
        term992774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term992775 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term992774, term992774.getClass(), "this$0", null);
        setField(term992775, term992775.getClass(), "parameters", null);
        setField(term992775, term992775.getClass(), "returnType", null);
        setBooleanField(term992775, term992775.getClass(), "resolved", false);
        setField(term992775, term992775.getClass(), "resolveResult", null);
        setField(term992775, term992775.getClass(), "registry", null);
        setField(term992774, term992774.getClass(), "call", term992775);
        setField(term992774, term992774.getClass(), "prototype", null);
        setField(term992774, term992774.getClass(), "kind", enum1854);
        setField(term992774, term992774.getClass(), "typeOfThis", term992774);
        setField(term992774, term992774.getClass(), "source", null);
        setField(term992774, term992774.getClass(), "implementedInterfaces", null);
        setField(term992774, term992774.getClass(), "subTypes", null);
        setField(term992774, term992774.getClass(), "templateTypeName", null);
        setField(term992774, term992774.getClass(), "className", null);
        setField(term992774, term992774.getClass(), "properties", null);
        setField(term992774, term992774.getClass(), "implicitPrototype", null);
        setBooleanField(term992774, term992774.getClass(), "nativeType", false);
        setBooleanField(term992774, term992774.getClass(), "visited", false);
        setField(term992774, term992774.getClass(), "docInfo", null);
        setBooleanField(term992774, term992774.getClass(), "unknown", false);
        setBooleanField(term992774, term992774.getClass(), "resolved", false);
        setField(term992774, term992774.getClass(), "resolveResult", null);
        setField(term992774, term992774.getClass(), "registry", null);
        Class<? extends Object> term993668 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term993667 = ((Class) term993668).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term993667).setAccessible(true);
        Object enum1855 = ((Field) term993667).get((Object) null);
        term992779 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term992783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term992779, term992779.getClass(), "this$0", null);
        setField(term992779, term992779.getClass(), "call", null);
        setField(term992779, term992779.getClass(), "prototype", null);
        setField(term992779, term992779.getClass(), "kind", enum1855);
        setField(term992783, term992783.getClass(), "constructor", null);
        setField(term992783, term992783.getClass(), "className", null);
        setField(term992783, term992783.getClass(), "properties", null);
        setField(term992783, term992783.getClass(), "implicitPrototype", null);
        setBooleanField(term992783, term992783.getClass(), "nativeType", false);
        setBooleanField(term992783, term992783.getClass(), "visited", false);
        setField(term992783, term992783.getClass(), "docInfo", null);
        setBooleanField(term992783, term992783.getClass(), "unknown", false);
        setBooleanField(term992783, term992783.getClass(), "resolved", false);
        setField(term992783, term992783.getClass(), "resolveResult", null);
        setField(term992783, term992783.getClass(), "registry", null);
        setField(term992779, term992779.getClass(), "typeOfThis", term992783);
        setField(term992779, term992779.getClass(), "source", null);
        setField(term992779, term992779.getClass(), "implementedInterfaces", null);
        setField(term992779, term992779.getClass(), "subTypes", null);
        setField(term992779, term992779.getClass(), "templateTypeName", null);
        setField(term992779, term992779.getClass(), "className", null);
        setField(term992779, term992779.getClass(), "properties", null);
        setField(term992779, term992779.getClass(), "implicitPrototype", null);
        setBooleanField(term992779, term992779.getClass(), "nativeType", false);
        setBooleanField(term992779, term992779.getClass(), "visited", false);
        setField(term992779, term992779.getClass(), "docInfo", null);
        setBooleanField(term992779, term992779.getClass(), "unknown", false);
        setBooleanField(term992779, term992779.getClass(), "resolved", false);
        setField(term992779, term992779.getClass(), "resolveResult", null);
        setField(term992779, term992779.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term991743;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term991393, args);
        assertTrue(recursiveEquals(term991393, term992774));
        assertTrue(recursiveEquals(term991743, term992779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


