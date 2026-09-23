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

public class FunctionType_resolveInternal_5807426107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20968;

    public FunctionType_resolveInternal_5807426107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term59947 = ((Class) term59948).getDeclaredField((String) "INTERFACE");
        ((Field) term59947).setAccessible(true);
        Object enum154 = ((Field) term59947).get((Object) null);
        term20968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term20969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term20970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20983 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20993 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term20970, term20970.getClass(), "type", 752615112);
        setIntField(term20972, term20972.getClass(), "type", 299791142);
        setIntField(term20974, term20974.getClass(), "type", 0);
        setField(term20974, term20974.getClass(), "next", null);
        setField(term20974, term20974.getClass(), "first", null);
        setField(term20974, term20974.getClass(), "last", null);
        setField(term20974, term20974.getClass(), "propListHead", null);
        setIntField(term20974, term20974.getClass(), "sourcePosition", 0);
        setField(term20974, term20974.getClass(), "jsType", null);
        setField(term20974, term20974.getClass(), "parent", null);
        setField(term20972, term20972.getClass(), "next", term20974);
        setIntField(term20977, term20977.getClass(), "type", 0);
        setField(term20977, term20977.getClass(), "next", null);
        setField(term20977, term20977.getClass(), "first", null);
        setField(term20977, term20977.getClass(), "last", null);
        setField(term20977, term20977.getClass(), "propListHead", null);
        setIntField(term20977, term20977.getClass(), "sourcePosition", 0);
        setField(term20977, term20977.getClass(), "jsType", null);
        setField(term20977, term20977.getClass(), "parent", null);
        setField(term20972, term20972.getClass(), "first", term20977);
        setIntField(term20980, term20980.getClass(), "type", 0);
        setField(term20980, term20980.getClass(), "next", null);
        setField(term20980, term20980.getClass(), "first", null);
        setField(term20980, term20980.getClass(), "last", null);
        setField(term20980, term20980.getClass(), "propListHead", null);
        setIntField(term20980, term20980.getClass(), "sourcePosition", 0);
        setField(term20980, term20980.getClass(), "jsType", null);
        setField(term20980, term20980.getClass(), "parent", null);
        setField(term20972, term20972.getClass(), "last", term20980);
        setField(term20983, term20983.getClass(), "next", null);
        setIntField(term20983, term20983.getClass(), "type", 0);
        setIntField(term20983, term20983.getClass(), "intValue", 0);
        setField(term20983, term20983.getClass(), "objectValue", null);
        setField(term20972, term20972.getClass(), "propListHead", term20983);
        setIntField(term20972, term20972.getClass(), "sourcePosition", 1862191391);
        setField(term20972, term20972.getClass(), "jsType", null);
        setField(term20972, term20972.getClass(), "parent", null);
        setField(term20970, term20970.getClass(), "next", term20972);
        setIntField(term20987, term20987.getClass(), "type", 0);
        setField(term20987, term20987.getClass(), "next", null);
        setField(term20987, term20987.getClass(), "first", null);
        setField(term20987, term20987.getClass(), "last", null);
        setField(term20987, term20987.getClass(), "propListHead", null);
        setIntField(term20987, term20987.getClass(), "sourcePosition", 0);
        setField(term20987, term20987.getClass(), "jsType", null);
        setField(term20987, term20987.getClass(), "parent", null);
        setField(term20970, term20970.getClass(), "first", term20987);
        setIntField(term20990, term20990.getClass(), "type", 0);
        setField(term20990, term20990.getClass(), "next", null);
        setField(term20990, term20990.getClass(), "first", null);
        setField(term20990, term20990.getClass(), "last", null);
        setField(term20990, term20990.getClass(), "propListHead", null);
        setIntField(term20990, term20990.getClass(), "sourcePosition", 0);
        setField(term20990, term20990.getClass(), "jsType", null);
        setField(term20990, term20990.getClass(), "parent", null);
        setField(term20970, term20970.getClass(), "last", term20990);
        setField(term20993, term20993.getClass(), "next", null);
        setIntField(term20993, term20993.getClass(), "type", 0);
        setIntField(term20993, term20993.getClass(), "intValue", 0);
        setField(term20993, term20993.getClass(), "objectValue", null);
        setField(term20970, term20970.getClass(), "propListHead", term20993);
        setIntField(term20970, term20970.getClass(), "sourcePosition", 1131398807);
        setField(term20970, term20970.getClass(), "jsType", null);
        setField(term20970, term20970.getClass(), "parent", null);
        setField(term20969, term20969.getClass(), "parameters", term20970);
        setField(term20969, term20969.getClass(), "returnType", null);
        setBooleanField(term20969, term20969.getClass(), "returnTypeInferred", false);
        setBooleanField(term20969, term20969.getClass(), "resolved", false);
        setField(term20969, term20969.getClass(), "resolveResult", null);
        setField(term20969, term20969.getClass(), "registry", null);
        setField(term20968, term20968.getClass(), "call", term20969);
        setField(term20999, term20999.getClass(), "ownerFunction", null);
        setField(term20999, term20999.getClass(), "className", null);
        setField(term20999, term20999.getClass(), "properties", null);
        setField(term20999, term20999.getClass(), "implicitPrototype", null);
        setBooleanField(term20999, term20999.getClass(), "nativeType", false);
        setBooleanField(term20999, term20999.getClass(), "prettyPrint", false);
        setBooleanField(term20999, term20999.getClass(), "visited", false);
        setField(term20999, term20999.getClass(), "docInfo", null);
        setBooleanField(term20999, term20999.getClass(), "unknown", false);
        setBooleanField(term20999, term20999.getClass(), "resolved", false);
        setField(term20999, term20999.getClass(), "resolveResult", null);
        setField(term20999, term20999.getClass(), "registry", null);
        setField(term20968, term20968.getClass(), "prototype", term20999);
        setField(term20968, term20968.getClass(), "kind", enum154);
        setField(term20968, term20968.getClass(), "typeOfThis", null);
        setField(term20968, term20968.getClass(), "source", null);
        setField(term20968, term20968.getClass(), "implementedInterfaces", null);
        setField(term20968, term20968.getClass(), "subTypes", null);
        setField(term20968, term20968.getClass(), "templateTypeName", null);
        setField(term20968, term20968.getClass(), "className", null);
        setField(term20968, term20968.getClass(), "properties", null);
        setField(term20968, term20968.getClass(), "implicitPrototype", null);
        setBooleanField(term20968, term20968.getClass(), "nativeType", false);
        setBooleanField(term20968, term20968.getClass(), "prettyPrint", false);
        setBooleanField(term20968, term20968.getClass(), "visited", false);
        setField(term20968, term20968.getClass(), "docInfo", null);
        setBooleanField(term20968, term20968.getClass(), "unknown", false);
        setBooleanField(term20968, term20968.getClass(), "resolved", false);
        setField(term20968, term20968.getClass(), "resolveResult", null);
        setField(term20968, term20968.getClass(), "registry", null);
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
            callMethod(klass, "resolveInternal", argTypes, term20968, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


