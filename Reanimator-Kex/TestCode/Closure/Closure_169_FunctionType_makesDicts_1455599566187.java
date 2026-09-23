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

public class FunctionType_makesDicts_1455599566187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96973;
     Object term217890;

    public FunctionType_makesDicts_1455599566187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term217900 = ((Class) term217901).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term217900).setAccessible(true);
        Object enum413 = ((Field) term217900).get((Object) null);
        Class<? extends Object> term218201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term218200 = ((Class) term218201).getDeclaredField((String) "STRUCT");
        ((Field) term218200).setAccessible(true);
        Object enum414 = ((Field) term218200).get((Object) null);
        term96973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term97395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term97495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96973, term96973.getClass(), "kind", enum413);
        setField(term96973, term96973.getClass(), "propAccess", enum414);
        setField(term97395, term97395.getClass(), "type", term97495);
        setField(term96973, term96973.getClass(), "prototypeSlot", term97395);
        Class<? extends Object> term218516 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term218515 = ((Class) term218516).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term218515).setAccessible(true);
        Object enum415 = ((Field) term218515).get((Object) null);
        Class<? extends Object> term218816 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term218815 = ((Class) term218816).getDeclaredField((String) "STRUCT");
        ((Field) term218815).setAccessible(true);
        Object enum416 = ((Field) term218815).get((Object) null);
        term217890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term217891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term217892 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term217890, term217890.getClass(), "call", null);
        setField(term217891, term217891.getClass(), "name", null);
        setField(term217892, term217892.getClass(), "call", null);
        setField(term217892, term217892.getClass(), "prototypeSlot", null);
        setField(term217892, term217892.getClass(), "kind", null);
        setField(term217892, term217892.getClass(), "propAccess", null);
        setField(term217892, term217892.getClass(), "typeOfThis", null);
        setField(term217892, term217892.getClass(), "source", null);
        setField(term217892, term217892.getClass(), "implementedInterfaces", null);
        setField(term217892, term217892.getClass(), "extendedInterfaces", null);
        setField(term217892, term217892.getClass(), "subTypes", null);
        setField(term217892, term217892.getClass(), "templateTypeNames", null);
        setField(term217892, term217892.getClass(), "className", null);
        setField(term217892, term217892.getClass(), "properties", null);
        setBooleanField(term217892, term217892.getClass(), "nativeType", false);
        setField(term217892, term217892.getClass(), "implicitPrototypeFallback", null);
        setField(term217892, term217892.getClass(), "ownerFunction", null);
        setBooleanField(term217892, term217892.getClass(), "prettyPrint", false);
        setBooleanField(term217892, term217892.getClass(), "visited", false);
        setField(term217892, term217892.getClass(), "docInfo", null);
        setBooleanField(term217892, term217892.getClass(), "unknown", false);
        setBooleanField(term217892, term217892.getClass(), "resolved", false);
        setField(term217892, term217892.getClass(), "resolveResult", null);
        setBooleanField(term217892, term217892.getClass(), "inTemplatedCheckVisit", false);
        setField(term217892, term217892.getClass(), "registry", null);
        setField(term217891, term217891.getClass(), "type", term217892);
        setBooleanField(term217891, term217891.getClass(), "inferred", false);
        setField(term217891, term217891.getClass(), "propertyNode", null);
        setField(term217891, term217891.getClass(), "docInfo", null);
        setField(term217890, term217890.getClass(), "prototypeSlot", term217891);
        setField(term217890, term217890.getClass(), "kind", enum415);
        setField(term217890, term217890.getClass(), "propAccess", enum416);
        setField(term217890, term217890.getClass(), "typeOfThis", null);
        setField(term217890, term217890.getClass(), "source", null);
        setField(term217890, term217890.getClass(), "implementedInterfaces", null);
        setField(term217890, term217890.getClass(), "extendedInterfaces", null);
        setField(term217890, term217890.getClass(), "subTypes", null);
        setField(term217890, term217890.getClass(), "templateTypeNames", null);
        setField(term217890, term217890.getClass(), "className", null);
        setField(term217890, term217890.getClass(), "properties", null);
        setBooleanField(term217890, term217890.getClass(), "nativeType", false);
        setField(term217890, term217890.getClass(), "implicitPrototypeFallback", null);
        setField(term217890, term217890.getClass(), "ownerFunction", null);
        setBooleanField(term217890, term217890.getClass(), "prettyPrint", false);
        setBooleanField(term217890, term217890.getClass(), "visited", false);
        setField(term217890, term217890.getClass(), "docInfo", null);
        setBooleanField(term217890, term217890.getClass(), "unknown", false);
        setBooleanField(term217890, term217890.getClass(), "resolved", false);
        setField(term217890, term217890.getClass(), "resolveResult", null);
        setBooleanField(term217890, term217890.getClass(), "inTemplatedCheckVisit", false);
        setField(term217890, term217890.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesDicts", argTypes, term96973, args);
        assertTrue(recursiveEquals(term96973, term217890));
        assertTrue(recursiveEquals(retValue, false));
    }

};


