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

public class FunctionType_resolveInternal_5807426178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45957;

    public FunctionType_resolveInternal_5807426178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term209911 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term209910 = ((Class) term209911).getDeclaredField((String) "ORDINARY");
        ((Field) term209910).setAccessible(true);
        Object enum391 = ((Field) term209910).get((Object) null);
        Class<? extends Object> term210202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term210201 = ((Class) term210202).getDeclaredField((String) "ANY");
        ((Field) term210201).setAccessible(true);
        Object enum392 = ((Field) term210201).get((Object) null);
        term45957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term45958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term45959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term45959, term45959.getClass(), "type", -1703625118);
        setIntField(term45961, term45961.getClass(), "type", 1104108112);
        setIntField(term45963, term45963.getClass(), "type", 1648665618);
        setField(term45963, term45963.getClass(), "next", null);
        setField(term45963, term45963.getClass(), "first", null);
        setField(term45963, term45963.getClass(), "last", null);
        setField(term45963, term45963.getClass(), "propListHead", null);
        setIntField(term45963, term45963.getClass(), "sourcePosition", 0);
        setField(term45963, term45963.getClass(), "jsType", null);
        setField(term45963, term45963.getClass(), "parent", null);
        setField(term45961, term45961.getClass(), "next", term45963);
        setIntField(term45966, term45966.getClass(), "type", 0);
        setField(term45966, term45966.getClass(), "next", null);
        setField(term45966, term45966.getClass(), "first", null);
        setField(term45966, term45966.getClass(), "last", null);
        setField(term45966, term45966.getClass(), "propListHead", null);
        setIntField(term45966, term45966.getClass(), "sourcePosition", 0);
        setField(term45966, term45966.getClass(), "jsType", null);
        setField(term45966, term45966.getClass(), "parent", null);
        setField(term45961, term45961.getClass(), "first", term45966);
        setIntField(term45969, term45969.getClass(), "type", 34167717);
        setField(term45969, term45969.getClass(), "next", null);
        setField(term45969, term45969.getClass(), "first", term45966);
        setField(term45969, term45969.getClass(), "last", term45969);
        setField(term45969, term45969.getClass(), "propListHead", null);
        setIntField(term45969, term45969.getClass(), "sourcePosition", 0);
        setField(term45969, term45969.getClass(), "jsType", null);
        setField(term45969, term45969.getClass(), "parent", null);
        setField(term45961, term45961.getClass(), "last", term45969);
        setField(term45961, term45961.getClass(), "propListHead", null);
        setIntField(term45961, term45961.getClass(), "sourcePosition", 0);
        setField(term45961, term45961.getClass(), "jsType", null);
        setField(term45961, term45961.getClass(), "parent", null);
        setField(term45959, term45959.getClass(), "next", term45961);
        setIntField(term45973, term45973.getClass(), "type", 1545119095);
        setIntField(term45975, term45975.getClass(), "type", 1671229683);
        setField(term45975, term45975.getClass(), "next", term45969);
        setField(term45975, term45975.getClass(), "first", null);
        setField(term45975, term45975.getClass(), "last", term45959);
        setField(term45975, term45975.getClass(), "propListHead", null);
        setIntField(term45975, term45975.getClass(), "sourcePosition", 0);
        setField(term45975, term45975.getClass(), "jsType", null);
        setField(term45975, term45975.getClass(), "parent", null);
        setField(term45973, term45973.getClass(), "next", term45975);
        setField(term45973, term45973.getClass(), "first", term45973);
        setIntField(term45978, term45978.getClass(), "type", 633765954);
        setField(term45978, term45978.getClass(), "next", null);
        setField(term45978, term45978.getClass(), "first", term45966);
        setField(term45978, term45978.getClass(), "last", term45969);
        setField(term45978, term45978.getClass(), "propListHead", null);
        setIntField(term45978, term45978.getClass(), "sourcePosition", 0);
        setField(term45978, term45978.getClass(), "jsType", null);
        setField(term45978, term45978.getClass(), "parent", null);
        setField(term45973, term45973.getClass(), "last", term45978);
        setField(term45973, term45973.getClass(), "propListHead", null);
        setIntField(term45973, term45973.getClass(), "sourcePosition", 0);
        setField(term45973, term45973.getClass(), "jsType", null);
        setField(term45973, term45973.getClass(), "parent", null);
        setField(term45959, term45959.getClass(), "first", term45973);
        setField(term45959, term45959.getClass(), "last", term45963);
        setField(term45959, term45959.getClass(), "propListHead", null);
        setIntField(term45959, term45959.getClass(), "sourcePosition", 0);
        setField(term45959, term45959.getClass(), "jsType", null);
        setField(term45959, term45959.getClass(), "parent", null);
        setField(term45958, term45958.getClass(), "parameters", term45959);
        setField(term45958, term45958.getClass(), "returnType", null);
        setBooleanField(term45958, term45958.getClass(), "returnTypeInferred", false);
        setBooleanField(term45958, term45958.getClass(), "resolved", false);
        setField(term45958, term45958.getClass(), "resolveResult", null);
        setBooleanField(term45958, term45958.getClass(), "inTemplatedCheckVisit", false);
        setField(term45958, term45958.getClass(), "registry", null);
        setField(term45957, term45957.getClass(), "call", term45958);
        setField(term45986, term45986.getClass(), "name", null);
        setField(term45986, term45986.getClass(), "type", null);
        setBooleanField(term45986, term45986.getClass(), "inferred", false);
        setField(term45986, term45986.getClass(), "propertyNode", null);
        setField(term45986, term45986.getClass(), "docInfo", null);
        setField(term45957, term45957.getClass(), "prototypeSlot", term45986);
        setField(term45957, term45957.getClass(), "kind", enum391);
        setField(term45957, term45957.getClass(), "propAccess", enum392);
        setField(term45957, term45957.getClass(), "typeOfThis", null);
        setField(term45957, term45957.getClass(), "source", null);
        setField(term45957, term45957.getClass(), "implementedInterfaces", null);
        setField(term45957, term45957.getClass(), "extendedInterfaces", null);
        setField(term45957, term45957.getClass(), "subTypes", null);
        setField(term45957, term45957.getClass(), "templateTypeNames", null);
        setField(term45957, term45957.getClass(), "className", null);
        setField(term45957, term45957.getClass(), "properties", null);
        setBooleanField(term45957, term45957.getClass(), "nativeType", false);
        setField(term45957, term45957.getClass(), "implicitPrototypeFallback", null);
        setField(term45957, term45957.getClass(), "ownerFunction", null);
        setBooleanField(term45957, term45957.getClass(), "prettyPrint", false);
        setBooleanField(term45957, term45957.getClass(), "visited", false);
        setField(term45957, term45957.getClass(), "docInfo", null);
        setBooleanField(term45957, term45957.getClass(), "unknown", false);
        setBooleanField(term45957, term45957.getClass(), "resolved", false);
        setField(term45957, term45957.getClass(), "resolveResult", null);
        setBooleanField(term45957, term45957.getClass(), "inTemplatedCheckVisit", false);
        setField(term45957, term45957.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term45957, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


