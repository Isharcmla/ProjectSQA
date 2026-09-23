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

public class FunctionType_setPrototypeBasedOn_1740539051554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530358;
     Object term530658;
     Object term531477;
     Object term531491;

    public FunctionType_setPrototypeBasedOn_1740539051554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term531493 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term531492 = ((Class) term531493).getDeclaredField((String) "INTERFACE");
        ((Field) term531492).setAccessible(true);
        Object enum870 = ((Field) term531492).get((Object) null);
        ArrayList term530558 = new ArrayList();
        term530358 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term530358, term530358.getClass(), "nativeType", true);
        setField(term530358, term530358.getClass(), "registry", null);
        setField(term530358, term530358.getClass(), "className", null);
        setField(term530358, term530358.getClass(), "ownerFunction", null);
        setField(term530358, term530358.getClass(), "kind", enum870);
        setField(term530358, term530358.getClass(), "prototypeSlot", null);
        setField(term530358, term530358.getClass(), "source", null);
        setField(term530358, term530358.getClass(), "extendedInterfaces", term530558);
        term530658 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term530658, term530658.getClass(), "className", null);
        setField(term530658, term530658.getClass(), "ownerFunction", null);
        Class<? extends Object> term531810 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term531809 = ((Class) term531810).getDeclaredField((String) "INTERFACE");
        ((Field) term531809).setAccessible(true);
        Object enum871 = ((Field) term531809).get((Object) null);
        ArrayList term531489 = new ArrayList();
        term531477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term531478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term531481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term531484 = newInstance(Class.forName("java.util.TreeMap"));
        Object term531485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term531477, term531477.getClass(), "call", null);
        setField(term531478, term531478.getClass(), "name", "prototype");
        setField(term531481, term531481.getClass(), "className", "null.prototype");
        setField(term531484, term531484.getClass(), "comparator", null);
        setField(term531484, term531484.getClass(), "root", null);
        setIntField(term531484, term531484.getClass(), "size", 0);
        setIntField(term531484, term531484.getClass(), "modCount", 0);
        setField(term531484, term531484.getClass(), "entrySet", null);
        setField(term531484, term531484.getClass(), "navigableKeySet", null);
        setField(term531484, term531484.getClass(), "descendingMap", null);
        setField(term531484, term531484.getClass(), "keySet", null);
        setField(term531484, term531484.getClass(), "values", null);
        setField(term531481, term531481.getClass(), "properties", term531484);
        setBooleanField(term531481, term531481.getClass(), "nativeType", false);
        setField(term531485, term531485.getClass(), "call", null);
        setField(term531485, term531485.getClass(), "prototypeSlot", null);
        setField(term531485, term531485.getClass(), "kind", null);
        setField(term531485, term531485.getClass(), "propAccess", null);
        setField(term531485, term531485.getClass(), "typeOfThis", null);
        setField(term531485, term531485.getClass(), "source", null);
        setField(term531485, term531485.getClass(), "implementedInterfaces", null);
        setField(term531485, term531485.getClass(), "extendedInterfaces", null);
        setField(term531485, term531485.getClass(), "subTypes", null);
        setField(term531485, term531485.getClass(), "templateTypeNames", null);
        setField(term531485, term531485.getClass(), "className", null);
        setField(term531485, term531485.getClass(), "properties", null);
        setBooleanField(term531485, term531485.getClass(), "nativeType", false);
        setField(term531485, term531485.getClass(), "implicitPrototypeFallback", null);
        setField(term531485, term531485.getClass(), "ownerFunction", null);
        setBooleanField(term531485, term531485.getClass(), "prettyPrint", false);
        setBooleanField(term531485, term531485.getClass(), "visited", false);
        setField(term531485, term531485.getClass(), "docInfo", null);
        setBooleanField(term531485, term531485.getClass(), "unknown", false);
        setBooleanField(term531485, term531485.getClass(), "resolved", false);
        setField(term531485, term531485.getClass(), "resolveResult", null);
        setBooleanField(term531485, term531485.getClass(), "inTemplatedCheckVisit", false);
        setField(term531485, term531485.getClass(), "registry", null);
        setField(term531481, term531481.getClass(), "implicitPrototypeFallback", term531485);
        setField(term531481, term531481.getClass(), "ownerFunction", term531477);
        setBooleanField(term531481, term531481.getClass(), "prettyPrint", false);
        setBooleanField(term531481, term531481.getClass(), "visited", false);
        setField(term531481, term531481.getClass(), "docInfo", null);
        setBooleanField(term531481, term531481.getClass(), "unknown", true);
        setBooleanField(term531481, term531481.getClass(), "resolved", false);
        setField(term531481, term531481.getClass(), "resolveResult", null);
        setBooleanField(term531481, term531481.getClass(), "inTemplatedCheckVisit", false);
        setField(term531481, term531481.getClass(), "registry", null);
        setField(term531478, term531478.getClass(), "type", term531481);
        setBooleanField(term531478, term531478.getClass(), "inferred", true);
        setField(term531478, term531478.getClass(), "propertyNode", null);
        setField(term531478, term531478.getClass(), "docInfo", null);
        setField(term531477, term531477.getClass(), "prototypeSlot", term531478);
        setField(term531477, term531477.getClass(), "kind", enum871);
        setField(term531477, term531477.getClass(), "propAccess", null);
        setField(term531477, term531477.getClass(), "typeOfThis", null);
        setField(term531477, term531477.getClass(), "source", null);
        setField(term531477, term531477.getClass(), "implementedInterfaces", null);
        setField(term531477, term531477.getClass(), "extendedInterfaces", term531489);
        setField(term531477, term531477.getClass(), "subTypes", null);
        setField(term531477, term531477.getClass(), "templateTypeNames", null);
        setField(term531477, term531477.getClass(), "className", null);
        setField(term531477, term531477.getClass(), "properties", null);
        setBooleanField(term531477, term531477.getClass(), "nativeType", true);
        setField(term531477, term531477.getClass(), "implicitPrototypeFallback", null);
        setField(term531477, term531477.getClass(), "ownerFunction", null);
        setBooleanField(term531477, term531477.getClass(), "prettyPrint", false);
        setBooleanField(term531477, term531477.getClass(), "visited", false);
        setField(term531477, term531477.getClass(), "docInfo", null);
        setBooleanField(term531477, term531477.getClass(), "unknown", false);
        setBooleanField(term531477, term531477.getClass(), "resolved", false);
        setField(term531477, term531477.getClass(), "resolveResult", null);
        setBooleanField(term531477, term531477.getClass(), "inTemplatedCheckVisit", false);
        setField(term531477, term531477.getClass(), "registry", null);
        term531491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term531491, term531491.getClass(), "call", null);
        setField(term531491, term531491.getClass(), "prototypeSlot", null);
        setField(term531491, term531491.getClass(), "kind", null);
        setField(term531491, term531491.getClass(), "propAccess", null);
        setField(term531491, term531491.getClass(), "typeOfThis", null);
        setField(term531491, term531491.getClass(), "source", null);
        setField(term531491, term531491.getClass(), "implementedInterfaces", null);
        setField(term531491, term531491.getClass(), "extendedInterfaces", null);
        setField(term531491, term531491.getClass(), "subTypes", null);
        setField(term531491, term531491.getClass(), "templateTypeNames", null);
        setField(term531491, term531491.getClass(), "className", null);
        setField(term531491, term531491.getClass(), "properties", null);
        setBooleanField(term531491, term531491.getClass(), "nativeType", false);
        setField(term531491, term531491.getClass(), "implicitPrototypeFallback", null);
        setField(term531491, term531491.getClass(), "ownerFunction", null);
        setBooleanField(term531491, term531491.getClass(), "prettyPrint", false);
        setBooleanField(term531491, term531491.getClass(), "visited", false);
        setField(term531491, term531491.getClass(), "docInfo", null);
        setBooleanField(term531491, term531491.getClass(), "unknown", false);
        setBooleanField(term531491, term531491.getClass(), "resolved", false);
        setField(term531491, term531491.getClass(), "resolveResult", null);
        setBooleanField(term531491, term531491.getClass(), "inTemplatedCheckVisit", false);
        setField(term531491, term531491.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term530658;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term530358, args);
        assertTrue(recursiveEquals(term530358, term531477));
        assertTrue(recursiveEquals(term530658, term531491));
    }

};


