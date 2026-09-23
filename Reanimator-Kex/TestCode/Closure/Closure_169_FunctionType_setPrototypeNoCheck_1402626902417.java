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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379514;
     Object term380132;
     Object term380653;
     Object term380663;

    public FunctionType_setPrototypeNoCheck_1402626902417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term380675 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term380674 = ((Class) term380675).getDeclaredField((String) "ORDINARY");
        ((Field) term380674).setAccessible(true);
        Object enum638 = ((Field) term380674).get((Object) null);
        ArrayList term380028 = new ArrayList();
        term379514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term379628 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term379728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term379828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term379728, term379728.getClass(), "ownerFunction", term379828);
        setField(term379628, term379628.getClass(), "type", term379728);
        setField(term379514, term379514.getClass(), "prototypeSlot", term379628);
        setField(term379514, term379514.getClass(), "source", null);
        setField(term379514, term379514.getClass(), "kind", enum638);
        setBooleanField(term379514, term379514.getClass(), "unknown", false);
        setField(term379514, term379514.getClass(), "subTypes", term380028);
        term380132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term380132, term380132.getClass(), "ownerFunction", null);
        Class<? extends Object> term380975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term380974 = ((Class) term380975).getDeclaredField((String) "ORDINARY");
        ((Field) term380974).setAccessible(true);
        Object enum639 = ((Field) term380974).get((Object) null);
        ArrayList term380661 = new ArrayList();
        term380653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term380654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term380657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term380653, term380653.getClass(), "call", null);
        setField(term380654, term380654.getClass(), "name", "prototype");
        setField(term380657, term380657.getClass(), "call", null);
        setField(term380657, term380657.getClass(), "prototypeSlot", null);
        setField(term380657, term380657.getClass(), "kind", null);
        setField(term380657, term380657.getClass(), "propAccess", null);
        setField(term380657, term380657.getClass(), "typeOfThis", null);
        setField(term380657, term380657.getClass(), "source", null);
        setField(term380657, term380657.getClass(), "implementedInterfaces", null);
        setField(term380657, term380657.getClass(), "extendedInterfaces", null);
        setField(term380657, term380657.getClass(), "subTypes", null);
        setField(term380657, term380657.getClass(), "templateTypeNames", null);
        setField(term380657, term380657.getClass(), "className", null);
        setField(term380657, term380657.getClass(), "properties", null);
        setBooleanField(term380657, term380657.getClass(), "nativeType", false);
        setField(term380657, term380657.getClass(), "implicitPrototypeFallback", null);
        setField(term380657, term380657.getClass(), "ownerFunction", term380653);
        setBooleanField(term380657, term380657.getClass(), "prettyPrint", false);
        setBooleanField(term380657, term380657.getClass(), "visited", false);
        setField(term380657, term380657.getClass(), "docInfo", null);
        setBooleanField(term380657, term380657.getClass(), "unknown", true);
        setBooleanField(term380657, term380657.getClass(), "resolved", false);
        setField(term380657, term380657.getClass(), "resolveResult", null);
        setBooleanField(term380657, term380657.getClass(), "inTemplatedCheckVisit", false);
        setField(term380657, term380657.getClass(), "registry", null);
        setField(term380654, term380654.getClass(), "type", term380657);
        setBooleanField(term380654, term380654.getClass(), "inferred", true);
        setField(term380654, term380654.getClass(), "propertyNode", null);
        setField(term380654, term380654.getClass(), "docInfo", null);
        setField(term380653, term380653.getClass(), "prototypeSlot", term380654);
        setField(term380653, term380653.getClass(), "kind", enum639);
        setField(term380653, term380653.getClass(), "propAccess", null);
        setField(term380653, term380653.getClass(), "typeOfThis", null);
        setField(term380653, term380653.getClass(), "source", null);
        setField(term380653, term380653.getClass(), "implementedInterfaces", null);
        setField(term380653, term380653.getClass(), "extendedInterfaces", null);
        setField(term380653, term380653.getClass(), "subTypes", term380661);
        setField(term380653, term380653.getClass(), "templateTypeNames", null);
        setField(term380653, term380653.getClass(), "className", null);
        setField(term380653, term380653.getClass(), "properties", null);
        setBooleanField(term380653, term380653.getClass(), "nativeType", false);
        setField(term380653, term380653.getClass(), "implicitPrototypeFallback", null);
        setField(term380653, term380653.getClass(), "ownerFunction", null);
        setBooleanField(term380653, term380653.getClass(), "prettyPrint", false);
        setBooleanField(term380653, term380653.getClass(), "visited", false);
        setField(term380653, term380653.getClass(), "docInfo", null);
        setBooleanField(term380653, term380653.getClass(), "unknown", true);
        setBooleanField(term380653, term380653.getClass(), "resolved", false);
        setField(term380653, term380653.getClass(), "resolveResult", null);
        setBooleanField(term380653, term380653.getClass(), "inTemplatedCheckVisit", false);
        setField(term380653, term380653.getClass(), "registry", null);
        Class<? extends Object> term381275 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term381274 = ((Class) term381275).getDeclaredField((String) "ORDINARY");
        ((Field) term381274).setAccessible(true);
        Object enum640 = ((Field) term381274).get((Object) null);
        ArrayList term380671 = new ArrayList();
        term380663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term380664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term380665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term380663, term380663.getClass(), "call", null);
        setField(term380663, term380663.getClass(), "prototypeSlot", null);
        setField(term380663, term380663.getClass(), "kind", null);
        setField(term380663, term380663.getClass(), "propAccess", null);
        setField(term380663, term380663.getClass(), "typeOfThis", null);
        setField(term380663, term380663.getClass(), "source", null);
        setField(term380663, term380663.getClass(), "implementedInterfaces", null);
        setField(term380663, term380663.getClass(), "extendedInterfaces", null);
        setField(term380663, term380663.getClass(), "subTypes", null);
        setField(term380663, term380663.getClass(), "templateTypeNames", null);
        setField(term380663, term380663.getClass(), "className", null);
        setField(term380663, term380663.getClass(), "properties", null);
        setBooleanField(term380663, term380663.getClass(), "nativeType", false);
        setField(term380663, term380663.getClass(), "implicitPrototypeFallback", null);
        setField(term380664, term380664.getClass(), "call", null);
        setField(term380665, term380665.getClass(), "name", "prototype");
        setField(term380665, term380665.getClass(), "type", term380663);
        setBooleanField(term380665, term380665.getClass(), "inferred", true);
        setField(term380665, term380665.getClass(), "propertyNode", null);
        setField(term380665, term380665.getClass(), "docInfo", null);
        setField(term380664, term380664.getClass(), "prototypeSlot", term380665);
        setField(term380664, term380664.getClass(), "kind", enum640);
        setField(term380664, term380664.getClass(), "propAccess", null);
        setField(term380664, term380664.getClass(), "typeOfThis", null);
        setField(term380664, term380664.getClass(), "source", null);
        setField(term380664, term380664.getClass(), "implementedInterfaces", null);
        setField(term380664, term380664.getClass(), "extendedInterfaces", null);
        setField(term380664, term380664.getClass(), "subTypes", term380671);
        setField(term380664, term380664.getClass(), "templateTypeNames", null);
        setField(term380664, term380664.getClass(), "className", null);
        setField(term380664, term380664.getClass(), "properties", null);
        setBooleanField(term380664, term380664.getClass(), "nativeType", false);
        setField(term380664, term380664.getClass(), "implicitPrototypeFallback", null);
        setField(term380664, term380664.getClass(), "ownerFunction", null);
        setBooleanField(term380664, term380664.getClass(), "prettyPrint", false);
        setBooleanField(term380664, term380664.getClass(), "visited", false);
        setField(term380664, term380664.getClass(), "docInfo", null);
        setBooleanField(term380664, term380664.getClass(), "unknown", true);
        setBooleanField(term380664, term380664.getClass(), "resolved", false);
        setField(term380664, term380664.getClass(), "resolveResult", null);
        setBooleanField(term380664, term380664.getClass(), "inTemplatedCheckVisit", false);
        setField(term380664, term380664.getClass(), "registry", null);
        setField(term380663, term380663.getClass(), "ownerFunction", term380664);
        setBooleanField(term380663, term380663.getClass(), "prettyPrint", false);
        setBooleanField(term380663, term380663.getClass(), "visited", false);
        setField(term380663, term380663.getClass(), "docInfo", null);
        setBooleanField(term380663, term380663.getClass(), "unknown", true);
        setBooleanField(term380663, term380663.getClass(), "resolved", false);
        setField(term380663, term380663.getClass(), "resolveResult", null);
        setBooleanField(term380663, term380663.getClass(), "inTemplatedCheckVisit", false);
        setField(term380663, term380663.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term380132;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term379514, args);
        assertTrue(recursiveEquals(term379514, term380653));
        assertTrue(recursiveEquals(term380132, term380663));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


