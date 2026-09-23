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

public class FunctionType_setPrototype_1144423633419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381822;
     Object term382196;
     Object term382752;
     Object term382763;

    public FunctionType_setPrototype_1144423633419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term382776 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term382775 = ((Class) term382776).getDeclaredField((String) "INTERFACE");
        ((Field) term382775).setAccessible(true);
        Object enum642 = ((Field) term382775).get((Object) null);
        ArrayList term382092 = new ArrayList();
        term381822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term382040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term381822, term381822.getClass(), "kind", enum642);
        setField(term381822, term381822.getClass(), "prototypeSlot", null);
        setField(term381822, term381822.getClass(), "source", term382040);
        setField(term381822, term381822.getClass(), "extendedInterfaces", term382092);
        term382196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term382196, term382196.getClass(), "ownerFunction", null);
        Class<? extends Object> term383079 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383078 = ((Class) term383079).getDeclaredField((String) "INTERFACE");
        ((Field) term383078).setAccessible(true);
        Object enum643 = ((Field) term383078).get((Object) null);
        ArrayList term382761 = new ArrayList();
        term382752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term382753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term382756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term382757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term382752, term382752.getClass(), "call", null);
        setField(term382753, term382753.getClass(), "name", "prototype");
        setField(term382756, term382756.getClass(), "call", null);
        setField(term382756, term382756.getClass(), "prototypeSlot", null);
        setField(term382756, term382756.getClass(), "kind", null);
        setField(term382756, term382756.getClass(), "propAccess", null);
        setField(term382756, term382756.getClass(), "typeOfThis", null);
        setField(term382756, term382756.getClass(), "source", null);
        setField(term382756, term382756.getClass(), "implementedInterfaces", null);
        setField(term382756, term382756.getClass(), "extendedInterfaces", null);
        setField(term382756, term382756.getClass(), "subTypes", null);
        setField(term382756, term382756.getClass(), "templateTypeNames", null);
        setField(term382756, term382756.getClass(), "className", null);
        setField(term382756, term382756.getClass(), "properties", null);
        setBooleanField(term382756, term382756.getClass(), "nativeType", false);
        setField(term382756, term382756.getClass(), "implicitPrototypeFallback", null);
        setField(term382756, term382756.getClass(), "ownerFunction", term382752);
        setBooleanField(term382756, term382756.getClass(), "prettyPrint", false);
        setBooleanField(term382756, term382756.getClass(), "visited", false);
        setField(term382756, term382756.getClass(), "docInfo", null);
        setBooleanField(term382756, term382756.getClass(), "unknown", false);
        setBooleanField(term382756, term382756.getClass(), "resolved", false);
        setField(term382756, term382756.getClass(), "resolveResult", null);
        setBooleanField(term382756, term382756.getClass(), "inTemplatedCheckVisit", false);
        setField(term382756, term382756.getClass(), "registry", null);
        setField(term382753, term382753.getClass(), "type", term382756);
        setBooleanField(term382753, term382753.getClass(), "inferred", true);
        setIntField(term382757, term382757.getClass(), "type", 0);
        setField(term382757, term382757.getClass(), "next", null);
        setField(term382757, term382757.getClass(), "first", null);
        setField(term382757, term382757.getClass(), "last", null);
        setField(term382757, term382757.getClass(), "propListHead", null);
        setIntField(term382757, term382757.getClass(), "sourcePosition", 0);
        setField(term382757, term382757.getClass(), "jsType", null);
        setField(term382757, term382757.getClass(), "parent", null);
        setField(term382753, term382753.getClass(), "propertyNode", term382757);
        setField(term382753, term382753.getClass(), "docInfo", null);
        setField(term382752, term382752.getClass(), "prototypeSlot", term382753);
        setField(term382752, term382752.getClass(), "kind", enum643);
        setField(term382752, term382752.getClass(), "propAccess", null);
        setField(term382752, term382752.getClass(), "typeOfThis", null);
        setField(term382752, term382752.getClass(), "source", term382757);
        setField(term382752, term382752.getClass(), "implementedInterfaces", null);
        setField(term382752, term382752.getClass(), "extendedInterfaces", term382761);
        setField(term382752, term382752.getClass(), "subTypes", null);
        setField(term382752, term382752.getClass(), "templateTypeNames", null);
        setField(term382752, term382752.getClass(), "className", null);
        setField(term382752, term382752.getClass(), "properties", null);
        setBooleanField(term382752, term382752.getClass(), "nativeType", false);
        setField(term382752, term382752.getClass(), "implicitPrototypeFallback", null);
        setField(term382752, term382752.getClass(), "ownerFunction", null);
        setBooleanField(term382752, term382752.getClass(), "prettyPrint", false);
        setBooleanField(term382752, term382752.getClass(), "visited", false);
        setField(term382752, term382752.getClass(), "docInfo", null);
        setBooleanField(term382752, term382752.getClass(), "unknown", false);
        setBooleanField(term382752, term382752.getClass(), "resolved", false);
        setField(term382752, term382752.getClass(), "resolveResult", null);
        setBooleanField(term382752, term382752.getClass(), "inTemplatedCheckVisit", false);
        setField(term382752, term382752.getClass(), "registry", null);
        Class<? extends Object> term383382 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term383381 = ((Class) term383382).getDeclaredField((String) "INTERFACE");
        ((Field) term383381).setAccessible(true);
        Object enum644 = ((Field) term383381).get((Object) null);
        ArrayList term382772 = new ArrayList();
        term382763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term382764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term382765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term382768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term382763, term382763.getClass(), "call", null);
        setField(term382763, term382763.getClass(), "prototypeSlot", null);
        setField(term382763, term382763.getClass(), "kind", null);
        setField(term382763, term382763.getClass(), "propAccess", null);
        setField(term382763, term382763.getClass(), "typeOfThis", null);
        setField(term382763, term382763.getClass(), "source", null);
        setField(term382763, term382763.getClass(), "implementedInterfaces", null);
        setField(term382763, term382763.getClass(), "extendedInterfaces", null);
        setField(term382763, term382763.getClass(), "subTypes", null);
        setField(term382763, term382763.getClass(), "templateTypeNames", null);
        setField(term382763, term382763.getClass(), "className", null);
        setField(term382763, term382763.getClass(), "properties", null);
        setBooleanField(term382763, term382763.getClass(), "nativeType", false);
        setField(term382763, term382763.getClass(), "implicitPrototypeFallback", null);
        setField(term382764, term382764.getClass(), "call", null);
        setField(term382765, term382765.getClass(), "name", "prototype");
        setField(term382765, term382765.getClass(), "type", term382763);
        setBooleanField(term382765, term382765.getClass(), "inferred", true);
        setIntField(term382768, term382768.getClass(), "type", 0);
        setField(term382768, term382768.getClass(), "next", null);
        setField(term382768, term382768.getClass(), "first", null);
        setField(term382768, term382768.getClass(), "last", null);
        setField(term382768, term382768.getClass(), "propListHead", null);
        setIntField(term382768, term382768.getClass(), "sourcePosition", 0);
        setField(term382768, term382768.getClass(), "jsType", null);
        setField(term382768, term382768.getClass(), "parent", null);
        setField(term382765, term382765.getClass(), "propertyNode", term382768);
        setField(term382765, term382765.getClass(), "docInfo", null);
        setField(term382764, term382764.getClass(), "prototypeSlot", term382765);
        setField(term382764, term382764.getClass(), "kind", enum644);
        setField(term382764, term382764.getClass(), "propAccess", null);
        setField(term382764, term382764.getClass(), "typeOfThis", null);
        setField(term382764, term382764.getClass(), "source", term382768);
        setField(term382764, term382764.getClass(), "implementedInterfaces", null);
        setField(term382764, term382764.getClass(), "extendedInterfaces", term382772);
        setField(term382764, term382764.getClass(), "subTypes", null);
        setField(term382764, term382764.getClass(), "templateTypeNames", null);
        setField(term382764, term382764.getClass(), "className", null);
        setField(term382764, term382764.getClass(), "properties", null);
        setBooleanField(term382764, term382764.getClass(), "nativeType", false);
        setField(term382764, term382764.getClass(), "implicitPrototypeFallback", null);
        setField(term382764, term382764.getClass(), "ownerFunction", null);
        setBooleanField(term382764, term382764.getClass(), "prettyPrint", false);
        setBooleanField(term382764, term382764.getClass(), "visited", false);
        setField(term382764, term382764.getClass(), "docInfo", null);
        setBooleanField(term382764, term382764.getClass(), "unknown", false);
        setBooleanField(term382764, term382764.getClass(), "resolved", false);
        setField(term382764, term382764.getClass(), "resolveResult", null);
        setBooleanField(term382764, term382764.getClass(), "inTemplatedCheckVisit", false);
        setField(term382764, term382764.getClass(), "registry", null);
        setField(term382763, term382763.getClass(), "ownerFunction", term382764);
        setBooleanField(term382763, term382763.getClass(), "prettyPrint", false);
        setBooleanField(term382763, term382763.getClass(), "visited", false);
        setField(term382763, term382763.getClass(), "docInfo", null);
        setBooleanField(term382763, term382763.getClass(), "unknown", false);
        setBooleanField(term382763, term382763.getClass(), "resolved", false);
        setField(term382763, term382763.getClass(), "resolveResult", null);
        setBooleanField(term382763, term382763.getClass(), "inTemplatedCheckVisit", false);
        setField(term382763, term382763.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term382196;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term381822, args);
        assertTrue(recursiveEquals(term381822, term382752));
        assertTrue(recursiveEquals(term382196, term382763));
        assertTrue(recursiveEquals(retValue, true));
    }

};


