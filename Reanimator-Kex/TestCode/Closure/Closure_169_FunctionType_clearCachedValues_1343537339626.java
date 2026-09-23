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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_clearCachedValues_1343537339626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600804;
     Object term601694;

    public FunctionType_clearCachedValues_1343537339626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term600856 = new ArrayList();
        Class<? extends Object> term601703 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term601702 = ((Class) term601703).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term601702).setAccessible(true);
        Object enum977 = ((Field) term601702).get((Object) null);
        term600804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term601112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term601220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term600804, term600804.getClass(), "unknown", false);
        setField(term600804, term600804.getClass(), "subTypes", term600856);
        setBooleanField(term600804, term600804.getClass(), "nativeType", false);
        setField(term600804, term600804.getClass(), "kind", enum977);
        setBooleanField(term601112, term601112.getClass(), "unknown", false);
        setField(term601112, term601112.getClass(), "subTypes", null);
        setBooleanField(term601112, term601112.getClass(), "nativeType", false);
        setField(term601112, term601112.getClass(), "kind", enum977);
        setField(term601112, term601112.getClass(), "typeOfThis", term601220);
        setField(term600804, term600804.getClass(), "typeOfThis", term601112);
        Class<? extends Object> term602003 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term602002 = ((Class) term602003).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term602002).setAccessible(true);
        Object enum978 = ((Field) term602002).get((Object) null);
        ArrayList term601700 = new ArrayList();
        term601694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term601698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term601699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term601694, term601694.getClass(), "this$0", null);
        setField(term601694, term601694.getClass(), "call", null);
        setField(term601694, term601694.getClass(), "prototypeSlot", null);
        setField(term601694, term601694.getClass(), "kind", enum978);
        setField(term601694, term601694.getClass(), "propAccess", null);
        setField(term601698, term601698.getClass(), "this$0", null);
        setField(term601698, term601698.getClass(), "call", null);
        setField(term601698, term601698.getClass(), "prototypeSlot", null);
        setField(term601698, term601698.getClass(), "kind", enum978);
        setField(term601698, term601698.getClass(), "propAccess", null);
        setField(term601699, term601699.getClass(), "this$0", null);
        setField(term601699, term601699.getClass(), "call", null);
        setField(term601699, term601699.getClass(), "prototypeSlot", null);
        setField(term601699, term601699.getClass(), "kind", null);
        setField(term601699, term601699.getClass(), "propAccess", null);
        setField(term601699, term601699.getClass(), "typeOfThis", null);
        setField(term601699, term601699.getClass(), "source", null);
        setField(term601699, term601699.getClass(), "implementedInterfaces", null);
        setField(term601699, term601699.getClass(), "extendedInterfaces", null);
        setField(term601699, term601699.getClass(), "subTypes", null);
        setField(term601699, term601699.getClass(), "templateTypeNames", null);
        setField(term601699, term601699.getClass(), "className", null);
        setField(term601699, term601699.getClass(), "properties", null);
        setBooleanField(term601699, term601699.getClass(), "nativeType", false);
        setField(term601699, term601699.getClass(), "implicitPrototypeFallback", null);
        setField(term601699, term601699.getClass(), "ownerFunction", null);
        setBooleanField(term601699, term601699.getClass(), "prettyPrint", false);
        setBooleanField(term601699, term601699.getClass(), "visited", false);
        setField(term601699, term601699.getClass(), "docInfo", null);
        setBooleanField(term601699, term601699.getClass(), "unknown", true);
        setBooleanField(term601699, term601699.getClass(), "resolved", false);
        setField(term601699, term601699.getClass(), "resolveResult", null);
        setBooleanField(term601699, term601699.getClass(), "inTemplatedCheckVisit", false);
        setField(term601699, term601699.getClass(), "registry", null);
        setField(term601698, term601698.getClass(), "typeOfThis", term601699);
        setField(term601698, term601698.getClass(), "source", null);
        setField(term601698, term601698.getClass(), "implementedInterfaces", null);
        setField(term601698, term601698.getClass(), "extendedInterfaces", null);
        setField(term601698, term601698.getClass(), "subTypes", null);
        setField(term601698, term601698.getClass(), "templateTypeNames", null);
        setField(term601698, term601698.getClass(), "className", null);
        setField(term601698, term601698.getClass(), "properties", null);
        setBooleanField(term601698, term601698.getClass(), "nativeType", false);
        setField(term601698, term601698.getClass(), "implicitPrototypeFallback", null);
        setField(term601698, term601698.getClass(), "ownerFunction", null);
        setBooleanField(term601698, term601698.getClass(), "prettyPrint", false);
        setBooleanField(term601698, term601698.getClass(), "visited", false);
        setField(term601698, term601698.getClass(), "docInfo", null);
        setBooleanField(term601698, term601698.getClass(), "unknown", true);
        setBooleanField(term601698, term601698.getClass(), "resolved", false);
        setField(term601698, term601698.getClass(), "resolveResult", null);
        setBooleanField(term601698, term601698.getClass(), "inTemplatedCheckVisit", false);
        setField(term601698, term601698.getClass(), "registry", null);
        setField(term601694, term601694.getClass(), "typeOfThis", term601698);
        setField(term601694, term601694.getClass(), "source", null);
        setField(term601694, term601694.getClass(), "implementedInterfaces", null);
        setField(term601694, term601694.getClass(), "extendedInterfaces", null);
        setField(term601694, term601694.getClass(), "subTypes", term601700);
        setField(term601694, term601694.getClass(), "templateTypeNames", null);
        setField(term601694, term601694.getClass(), "className", null);
        setField(term601694, term601694.getClass(), "properties", null);
        setBooleanField(term601694, term601694.getClass(), "nativeType", false);
        setField(term601694, term601694.getClass(), "implicitPrototypeFallback", null);
        setField(term601694, term601694.getClass(), "ownerFunction", null);
        setBooleanField(term601694, term601694.getClass(), "prettyPrint", false);
        setBooleanField(term601694, term601694.getClass(), "visited", false);
        setField(term601694, term601694.getClass(), "docInfo", null);
        setBooleanField(term601694, term601694.getClass(), "unknown", true);
        setBooleanField(term601694, term601694.getClass(), "resolved", false);
        setField(term601694, term601694.getClass(), "resolveResult", null);
        setBooleanField(term601694, term601694.getClass(), "inTemplatedCheckVisit", false);
        setField(term601694, term601694.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term600804, args);
        assertTrue(recursiveEquals(term600804, term601694));
    }

};


