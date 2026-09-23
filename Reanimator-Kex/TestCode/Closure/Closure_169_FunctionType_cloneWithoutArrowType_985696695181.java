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

public class FunctionType_cloneWithoutArrowType_985696695181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47964;

    public FunctionType_cloneWithoutArrowType_985696695181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213161 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213160 = ((Class) term213161).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213160).setAccessible(true);
        Object enum399 = ((Field) term213160).get((Object) null);
        Class<? extends Object> term213461 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term213460 = ((Class) term213461).getDeclaredField((String) "STRUCT");
        ((Field) term213460).setAccessible(true);
        Object enum400 = ((Field) term213460).get((Object) null);
        term47964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term47965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term47966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term47966, term47966.getClass(), "type", -110837188);
        setIntField(term47968, term47968.getClass(), "type", -271094506);
        setIntField(term47970, term47970.getClass(), "type", 455632030);
        setField(term47970, term47970.getClass(), "next", null);
        setField(term47970, term47970.getClass(), "first", null);
        setField(term47970, term47970.getClass(), "last", null);
        setField(term47970, term47970.getClass(), "propListHead", null);
        setIntField(term47970, term47970.getClass(), "sourcePosition", 0);
        setField(term47970, term47970.getClass(), "jsType", null);
        setField(term47970, term47970.getClass(), "parent", null);
        setField(term47968, term47968.getClass(), "next", term47970);
        setIntField(term47973, term47973.getClass(), "type", 0);
        setField(term47973, term47973.getClass(), "next", null);
        setField(term47973, term47973.getClass(), "first", null);
        setField(term47973, term47973.getClass(), "last", null);
        setField(term47973, term47973.getClass(), "propListHead", null);
        setIntField(term47973, term47973.getClass(), "sourcePosition", 0);
        setField(term47973, term47973.getClass(), "jsType", null);
        setField(term47973, term47973.getClass(), "parent", null);
        setField(term47968, term47968.getClass(), "first", term47973);
        setIntField(term47976, term47976.getClass(), "type", -1511130237);
        setField(term47976, term47976.getClass(), "next", null);
        setField(term47976, term47976.getClass(), "first", term47973);
        setField(term47976, term47976.getClass(), "last", term47976);
        setField(term47976, term47976.getClass(), "propListHead", null);
        setIntField(term47976, term47976.getClass(), "sourcePosition", 0);
        setField(term47976, term47976.getClass(), "jsType", null);
        setField(term47976, term47976.getClass(), "parent", null);
        setField(term47968, term47968.getClass(), "last", term47976);
        setField(term47968, term47968.getClass(), "propListHead", null);
        setIntField(term47968, term47968.getClass(), "sourcePosition", 0);
        setField(term47968, term47968.getClass(), "jsType", null);
        setField(term47968, term47968.getClass(), "parent", null);
        setField(term47966, term47966.getClass(), "next", term47968);
        setIntField(term47980, term47980.getClass(), "type", -763576148);
        setIntField(term47982, term47982.getClass(), "type", 1568948514);
        setField(term47982, term47982.getClass(), "next", term47976);
        setField(term47982, term47982.getClass(), "first", null);
        setField(term47982, term47982.getClass(), "last", term47966);
        setField(term47982, term47982.getClass(), "propListHead", null);
        setIntField(term47982, term47982.getClass(), "sourcePosition", 0);
        setField(term47982, term47982.getClass(), "jsType", null);
        setField(term47982, term47982.getClass(), "parent", null);
        setField(term47980, term47980.getClass(), "next", term47982);
        setField(term47980, term47980.getClass(), "first", term47980);
        setIntField(term47985, term47985.getClass(), "type", -1632929393);
        setField(term47985, term47985.getClass(), "next", null);
        setField(term47985, term47985.getClass(), "first", term47973);
        setField(term47985, term47985.getClass(), "last", term47976);
        setField(term47985, term47985.getClass(), "propListHead", null);
        setIntField(term47985, term47985.getClass(), "sourcePosition", 0);
        setField(term47985, term47985.getClass(), "jsType", null);
        setField(term47985, term47985.getClass(), "parent", null);
        setField(term47980, term47980.getClass(), "last", term47985);
        setField(term47980, term47980.getClass(), "propListHead", null);
        setIntField(term47980, term47980.getClass(), "sourcePosition", 0);
        setField(term47980, term47980.getClass(), "jsType", null);
        setField(term47980, term47980.getClass(), "parent", null);
        setField(term47966, term47966.getClass(), "first", term47980);
        setField(term47966, term47966.getClass(), "last", term47970);
        setField(term47966, term47966.getClass(), "propListHead", null);
        setIntField(term47966, term47966.getClass(), "sourcePosition", 0);
        setField(term47966, term47966.getClass(), "jsType", null);
        setField(term47966, term47966.getClass(), "parent", null);
        setField(term47965, term47965.getClass(), "parameters", term47966);
        setField(term47965, term47965.getClass(), "returnType", null);
        setBooleanField(term47965, term47965.getClass(), "returnTypeInferred", false);
        setBooleanField(term47965, term47965.getClass(), "resolved", false);
        setField(term47965, term47965.getClass(), "resolveResult", null);
        setBooleanField(term47965, term47965.getClass(), "inTemplatedCheckVisit", false);
        setField(term47965, term47965.getClass(), "registry", null);
        setField(term47964, term47964.getClass(), "call", term47965);
        setField(term47993, term47993.getClass(), "name", null);
        setField(term47993, term47993.getClass(), "type", null);
        setBooleanField(term47993, term47993.getClass(), "inferred", false);
        setField(term47993, term47993.getClass(), "propertyNode", null);
        setField(term47993, term47993.getClass(), "docInfo", null);
        setField(term47964, term47964.getClass(), "prototypeSlot", term47993);
        setField(term47964, term47964.getClass(), "kind", enum399);
        setField(term47964, term47964.getClass(), "propAccess", enum400);
        setField(term47964, term47964.getClass(), "typeOfThis", null);
        setField(term47964, term47964.getClass(), "source", null);
        setField(term47964, term47964.getClass(), "implementedInterfaces", null);
        setField(term47964, term47964.getClass(), "extendedInterfaces", null);
        setField(term47964, term47964.getClass(), "subTypes", null);
        setField(term47964, term47964.getClass(), "templateTypeNames", null);
        setField(term47964, term47964.getClass(), "className", null);
        setField(term47964, term47964.getClass(), "properties", null);
        setBooleanField(term47964, term47964.getClass(), "nativeType", false);
        setField(term47964, term47964.getClass(), "implicitPrototypeFallback", null);
        setField(term47964, term47964.getClass(), "ownerFunction", null);
        setBooleanField(term47964, term47964.getClass(), "prettyPrint", false);
        setBooleanField(term47964, term47964.getClass(), "visited", false);
        setField(term47964, term47964.getClass(), "docInfo", null);
        setBooleanField(term47964, term47964.getClass(), "unknown", false);
        setBooleanField(term47964, term47964.getClass(), "resolved", false);
        setField(term47964, term47964.getClass(), "resolveResult", null);
        setBooleanField(term47964, term47964.getClass(), "inTemplatedCheckVisit", false);
        setField(term47964, term47964.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "cloneWithoutArrowType", argTypes, term47964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


