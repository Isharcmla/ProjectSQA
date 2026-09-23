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
import java.util.ArrayList;

public class FunctionType_setPrototypeBasedOn_1740539051605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578973;
     Object term579277;
     Object term581045;
     Object term581055;

    public FunctionType_setPrototypeBasedOn_1740539051605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term581066 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term581065 = ((Class) term581066).getDeclaredField((String) "INTERFACE");
        ((Field) term581065).setAccessible(true);
        Object enum946 = ((Field) term581065).get((Object) null);
        ArrayList term579173 = new ArrayList();
        term578973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term578973, term578973.getClass(), "nativeType", false);
        setField(term578973, term578973.getClass(), "kind", enum946);
        setField(term578973, term578973.getClass(), "prototypeSlot", null);
        setField(term578973, term578973.getClass(), "source", null);
        setField(term578973, term578973.getClass(), "extendedInterfaces", term579173);
        term579277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term579277, term579277.getClass(), "className", null);
        setField(term579277, term579277.getClass(), "ownerFunction", null);
        Class<? extends Object> term581369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term581368 = ((Class) term581369).getDeclaredField((String) "INTERFACE");
        ((Field) term581368).setAccessible(true);
        Object enum947 = ((Field) term581368).get((Object) null);
        ArrayList term581053 = new ArrayList();
        term581045 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term581046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term581049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term581045, term581045.getClass(), "call", null);
        setField(term581046, term581046.getClass(), "name", "prototype");
        setField(term581049, term581049.getClass(), "call", null);
        setField(term581049, term581049.getClass(), "prototypeSlot", null);
        setField(term581049, term581049.getClass(), "kind", null);
        setField(term581049, term581049.getClass(), "propAccess", null);
        setField(term581049, term581049.getClass(), "typeOfThis", null);
        setField(term581049, term581049.getClass(), "source", null);
        setField(term581049, term581049.getClass(), "implementedInterfaces", null);
        setField(term581049, term581049.getClass(), "extendedInterfaces", null);
        setField(term581049, term581049.getClass(), "subTypes", null);
        setField(term581049, term581049.getClass(), "templateTypeNames", null);
        setField(term581049, term581049.getClass(), "className", null);
        setField(term581049, term581049.getClass(), "properties", null);
        setBooleanField(term581049, term581049.getClass(), "nativeType", false);
        setField(term581049, term581049.getClass(), "implicitPrototypeFallback", null);
        setField(term581049, term581049.getClass(), "ownerFunction", term581045);
        setBooleanField(term581049, term581049.getClass(), "prettyPrint", false);
        setBooleanField(term581049, term581049.getClass(), "visited", false);
        setField(term581049, term581049.getClass(), "docInfo", null);
        setBooleanField(term581049, term581049.getClass(), "unknown", false);
        setBooleanField(term581049, term581049.getClass(), "resolved", false);
        setField(term581049, term581049.getClass(), "resolveResult", null);
        setBooleanField(term581049, term581049.getClass(), "inTemplatedCheckVisit", false);
        setField(term581049, term581049.getClass(), "registry", null);
        setField(term581046, term581046.getClass(), "type", term581049);
        setBooleanField(term581046, term581046.getClass(), "inferred", true);
        setField(term581046, term581046.getClass(), "propertyNode", null);
        setField(term581046, term581046.getClass(), "docInfo", null);
        setField(term581045, term581045.getClass(), "prototypeSlot", term581046);
        setField(term581045, term581045.getClass(), "kind", enum947);
        setField(term581045, term581045.getClass(), "propAccess", null);
        setField(term581045, term581045.getClass(), "typeOfThis", null);
        setField(term581045, term581045.getClass(), "source", null);
        setField(term581045, term581045.getClass(), "implementedInterfaces", null);
        setField(term581045, term581045.getClass(), "extendedInterfaces", term581053);
        setField(term581045, term581045.getClass(), "subTypes", null);
        setField(term581045, term581045.getClass(), "templateTypeNames", null);
        setField(term581045, term581045.getClass(), "className", null);
        setField(term581045, term581045.getClass(), "properties", null);
        setBooleanField(term581045, term581045.getClass(), "nativeType", false);
        setField(term581045, term581045.getClass(), "implicitPrototypeFallback", null);
        setField(term581045, term581045.getClass(), "ownerFunction", null);
        setBooleanField(term581045, term581045.getClass(), "prettyPrint", false);
        setBooleanField(term581045, term581045.getClass(), "visited", false);
        setField(term581045, term581045.getClass(), "docInfo", null);
        setBooleanField(term581045, term581045.getClass(), "unknown", false);
        setBooleanField(term581045, term581045.getClass(), "resolved", false);
        setField(term581045, term581045.getClass(), "resolveResult", null);
        setBooleanField(term581045, term581045.getClass(), "inTemplatedCheckVisit", false);
        setField(term581045, term581045.getClass(), "registry", null);
        Class<? extends Object> term581672 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term581671 = ((Class) term581672).getDeclaredField((String) "INTERFACE");
        ((Field) term581671).setAccessible(true);
        Object enum948 = ((Field) term581671).get((Object) null);
        ArrayList term581063 = new ArrayList();
        term581055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term581056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term581057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term581055, term581055.getClass(), "call", null);
        setField(term581055, term581055.getClass(), "prototypeSlot", null);
        setField(term581055, term581055.getClass(), "kind", null);
        setField(term581055, term581055.getClass(), "propAccess", null);
        setField(term581055, term581055.getClass(), "typeOfThis", null);
        setField(term581055, term581055.getClass(), "source", null);
        setField(term581055, term581055.getClass(), "implementedInterfaces", null);
        setField(term581055, term581055.getClass(), "extendedInterfaces", null);
        setField(term581055, term581055.getClass(), "subTypes", null);
        setField(term581055, term581055.getClass(), "templateTypeNames", null);
        setField(term581055, term581055.getClass(), "className", null);
        setField(term581055, term581055.getClass(), "properties", null);
        setBooleanField(term581055, term581055.getClass(), "nativeType", false);
        setField(term581055, term581055.getClass(), "implicitPrototypeFallback", null);
        setField(term581056, term581056.getClass(), "call", null);
        setField(term581057, term581057.getClass(), "name", "prototype");
        setField(term581057, term581057.getClass(), "type", term581055);
        setBooleanField(term581057, term581057.getClass(), "inferred", true);
        setField(term581057, term581057.getClass(), "propertyNode", null);
        setField(term581057, term581057.getClass(), "docInfo", null);
        setField(term581056, term581056.getClass(), "prototypeSlot", term581057);
        setField(term581056, term581056.getClass(), "kind", enum948);
        setField(term581056, term581056.getClass(), "propAccess", null);
        setField(term581056, term581056.getClass(), "typeOfThis", null);
        setField(term581056, term581056.getClass(), "source", null);
        setField(term581056, term581056.getClass(), "implementedInterfaces", null);
        setField(term581056, term581056.getClass(), "extendedInterfaces", term581063);
        setField(term581056, term581056.getClass(), "subTypes", null);
        setField(term581056, term581056.getClass(), "templateTypeNames", null);
        setField(term581056, term581056.getClass(), "className", null);
        setField(term581056, term581056.getClass(), "properties", null);
        setBooleanField(term581056, term581056.getClass(), "nativeType", false);
        setField(term581056, term581056.getClass(), "implicitPrototypeFallback", null);
        setField(term581056, term581056.getClass(), "ownerFunction", null);
        setBooleanField(term581056, term581056.getClass(), "prettyPrint", false);
        setBooleanField(term581056, term581056.getClass(), "visited", false);
        setField(term581056, term581056.getClass(), "docInfo", null);
        setBooleanField(term581056, term581056.getClass(), "unknown", false);
        setBooleanField(term581056, term581056.getClass(), "resolved", false);
        setField(term581056, term581056.getClass(), "resolveResult", null);
        setBooleanField(term581056, term581056.getClass(), "inTemplatedCheckVisit", false);
        setField(term581056, term581056.getClass(), "registry", null);
        setField(term581055, term581055.getClass(), "ownerFunction", term581056);
        setBooleanField(term581055, term581055.getClass(), "prettyPrint", false);
        setBooleanField(term581055, term581055.getClass(), "visited", false);
        setField(term581055, term581055.getClass(), "docInfo", null);
        setBooleanField(term581055, term581055.getClass(), "unknown", false);
        setBooleanField(term581055, term581055.getClass(), "resolved", false);
        setField(term581055, term581055.getClass(), "resolveResult", null);
        setBooleanField(term581055, term581055.getClass(), "inTemplatedCheckVisit", false);
        setField(term581055, term581055.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term579277;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term578973, args);
        assertTrue(recursiveEquals(term578973, term581045));
        assertTrue(recursiveEquals(term579277, term581055));
    }

};


