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

public class FunctionType_setPrototypeBasedOn_1740539051486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448003;
     Object term448307;
     Object term449776;
     Object term449781;

    public FunctionType_setPrototypeBasedOn_1740539051486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term449783 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term449782 = ((Class) term449783).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term449782).setAccessible(true);
        Object enum739 = ((Field) term449782).get((Object) null);
        term448003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term448307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term448003, term448003.getClass(), "nativeType", false);
        setField(term448003, term448003.getClass(), "kind", enum739);
        setField(term448307, term448307.getClass(), "className", null);
        setField(term448307, term448307.getClass(), "ownerFunction", null);
        setField(term448003, term448003.getClass(), "typeOfThis", term448307);
        Class<? extends Object> term450083 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term450082 = ((Class) term450083).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term450082).setAccessible(true);
        Object enum740 = ((Field) term450082).get((Object) null);
        term449776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term449780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term449776, term449776.getClass(), "call", null);
        setField(term449776, term449776.getClass(), "prototypeSlot", null);
        setField(term449776, term449776.getClass(), "kind", enum740);
        setField(term449776, term449776.getClass(), "propAccess", null);
        setField(term449780, term449780.getClass(), "call", null);
        setField(term449780, term449780.getClass(), "prototypeSlot", null);
        setField(term449780, term449780.getClass(), "kind", null);
        setField(term449780, term449780.getClass(), "propAccess", null);
        setField(term449780, term449780.getClass(), "typeOfThis", null);
        setField(term449780, term449780.getClass(), "source", null);
        setField(term449780, term449780.getClass(), "implementedInterfaces", null);
        setField(term449780, term449780.getClass(), "extendedInterfaces", null);
        setField(term449780, term449780.getClass(), "subTypes", null);
        setField(term449780, term449780.getClass(), "templateTypeNames", null);
        setField(term449780, term449780.getClass(), "className", null);
        setField(term449780, term449780.getClass(), "properties", null);
        setBooleanField(term449780, term449780.getClass(), "nativeType", false);
        setField(term449780, term449780.getClass(), "implicitPrototypeFallback", null);
        setField(term449780, term449780.getClass(), "ownerFunction", null);
        setBooleanField(term449780, term449780.getClass(), "prettyPrint", false);
        setBooleanField(term449780, term449780.getClass(), "visited", false);
        setField(term449780, term449780.getClass(), "docInfo", null);
        setBooleanField(term449780, term449780.getClass(), "unknown", false);
        setBooleanField(term449780, term449780.getClass(), "resolved", false);
        setField(term449780, term449780.getClass(), "resolveResult", null);
        setBooleanField(term449780, term449780.getClass(), "inTemplatedCheckVisit", false);
        setField(term449780, term449780.getClass(), "registry", null);
        setField(term449776, term449776.getClass(), "typeOfThis", term449780);
        setField(term449776, term449776.getClass(), "source", null);
        setField(term449776, term449776.getClass(), "implementedInterfaces", null);
        setField(term449776, term449776.getClass(), "extendedInterfaces", null);
        setField(term449776, term449776.getClass(), "subTypes", null);
        setField(term449776, term449776.getClass(), "templateTypeNames", null);
        setField(term449776, term449776.getClass(), "className", null);
        setField(term449776, term449776.getClass(), "properties", null);
        setBooleanField(term449776, term449776.getClass(), "nativeType", false);
        setField(term449776, term449776.getClass(), "implicitPrototypeFallback", null);
        setField(term449776, term449776.getClass(), "ownerFunction", null);
        setBooleanField(term449776, term449776.getClass(), "prettyPrint", false);
        setBooleanField(term449776, term449776.getClass(), "visited", false);
        setField(term449776, term449776.getClass(), "docInfo", null);
        setBooleanField(term449776, term449776.getClass(), "unknown", false);
        setBooleanField(term449776, term449776.getClass(), "resolved", false);
        setField(term449776, term449776.getClass(), "resolveResult", null);
        setBooleanField(term449776, term449776.getClass(), "inTemplatedCheckVisit", false);
        setField(term449776, term449776.getClass(), "registry", null);
        term449781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term449781, term449781.getClass(), "call", null);
        setField(term449781, term449781.getClass(), "prototypeSlot", null);
        setField(term449781, term449781.getClass(), "kind", null);
        setField(term449781, term449781.getClass(), "propAccess", null);
        setField(term449781, term449781.getClass(), "typeOfThis", null);
        setField(term449781, term449781.getClass(), "source", null);
        setField(term449781, term449781.getClass(), "implementedInterfaces", null);
        setField(term449781, term449781.getClass(), "extendedInterfaces", null);
        setField(term449781, term449781.getClass(), "subTypes", null);
        setField(term449781, term449781.getClass(), "templateTypeNames", null);
        setField(term449781, term449781.getClass(), "className", null);
        setField(term449781, term449781.getClass(), "properties", null);
        setBooleanField(term449781, term449781.getClass(), "nativeType", false);
        setField(term449781, term449781.getClass(), "implicitPrototypeFallback", null);
        setField(term449781, term449781.getClass(), "ownerFunction", null);
        setBooleanField(term449781, term449781.getClass(), "prettyPrint", false);
        setBooleanField(term449781, term449781.getClass(), "visited", false);
        setField(term449781, term449781.getClass(), "docInfo", null);
        setBooleanField(term449781, term449781.getClass(), "unknown", false);
        setBooleanField(term449781, term449781.getClass(), "resolved", false);
        setField(term449781, term449781.getClass(), "resolveResult", null);
        setBooleanField(term449781, term449781.getClass(), "inTemplatedCheckVisit", false);
        setField(term449781, term449781.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term448307;
        args[1] = null;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term448003, args);
        assertTrue(recursiveEquals(term448003, term449776));
        assertTrue(recursiveEquals(term448307, term449781));
    }

};


