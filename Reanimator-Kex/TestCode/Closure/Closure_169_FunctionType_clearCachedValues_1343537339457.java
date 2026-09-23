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

public class FunctionType_clearCachedValues_1343537339457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418474;
     Object term419152;

    public FunctionType_clearCachedValues_1343537339457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term418526 = new ArrayList();
        Class<? extends Object> term419160 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term419159 = ((Class) term419160).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term419159).setAccessible(true);
        Object enum690 = ((Field) term419159).get((Object) null);
        term418474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term418774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term418474, term418474.getClass(), "unknown", false);
        setField(term418474, term418474.getClass(), "subTypes", term418526);
        setBooleanField(term418474, term418474.getClass(), "nativeType", false);
        setField(term418474, term418474.getClass(), "kind", enum690);
        setField(term418474, term418474.getClass(), "typeOfThis", term418774);
        Class<? extends Object> term419460 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term419459 = ((Class) term419460).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term419459).setAccessible(true);
        Object enum691 = ((Field) term419459).get((Object) null);
        ArrayList term419157 = new ArrayList();
        term419152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term419156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term419152, term419152.getClass(), "call", null);
        setField(term419152, term419152.getClass(), "prototypeSlot", null);
        setField(term419152, term419152.getClass(), "kind", enum691);
        setField(term419152, term419152.getClass(), "propAccess", null);
        setField(term419156, term419156.getClass(), "call", null);
        setField(term419156, term419156.getClass(), "prototypeSlot", null);
        setField(term419156, term419156.getClass(), "kind", null);
        setField(term419156, term419156.getClass(), "propAccess", null);
        setField(term419156, term419156.getClass(), "typeOfThis", null);
        setField(term419156, term419156.getClass(), "source", null);
        setField(term419156, term419156.getClass(), "implementedInterfaces", null);
        setField(term419156, term419156.getClass(), "extendedInterfaces", null);
        setField(term419156, term419156.getClass(), "subTypes", null);
        setField(term419156, term419156.getClass(), "templateTypeNames", null);
        setField(term419156, term419156.getClass(), "className", null);
        setField(term419156, term419156.getClass(), "properties", null);
        setBooleanField(term419156, term419156.getClass(), "nativeType", false);
        setField(term419156, term419156.getClass(), "implicitPrototypeFallback", null);
        setField(term419156, term419156.getClass(), "ownerFunction", null);
        setBooleanField(term419156, term419156.getClass(), "prettyPrint", false);
        setBooleanField(term419156, term419156.getClass(), "visited", false);
        setField(term419156, term419156.getClass(), "docInfo", null);
        setBooleanField(term419156, term419156.getClass(), "unknown", true);
        setBooleanField(term419156, term419156.getClass(), "resolved", false);
        setField(term419156, term419156.getClass(), "resolveResult", null);
        setBooleanField(term419156, term419156.getClass(), "inTemplatedCheckVisit", false);
        setField(term419156, term419156.getClass(), "registry", null);
        setField(term419152, term419152.getClass(), "typeOfThis", term419156);
        setField(term419152, term419152.getClass(), "source", null);
        setField(term419152, term419152.getClass(), "implementedInterfaces", null);
        setField(term419152, term419152.getClass(), "extendedInterfaces", null);
        setField(term419152, term419152.getClass(), "subTypes", term419157);
        setField(term419152, term419152.getClass(), "templateTypeNames", null);
        setField(term419152, term419152.getClass(), "className", null);
        setField(term419152, term419152.getClass(), "properties", null);
        setBooleanField(term419152, term419152.getClass(), "nativeType", false);
        setField(term419152, term419152.getClass(), "implicitPrototypeFallback", null);
        setField(term419152, term419152.getClass(), "ownerFunction", null);
        setBooleanField(term419152, term419152.getClass(), "prettyPrint", false);
        setBooleanField(term419152, term419152.getClass(), "visited", false);
        setField(term419152, term419152.getClass(), "docInfo", null);
        setBooleanField(term419152, term419152.getClass(), "unknown", true);
        setBooleanField(term419152, term419152.getClass(), "resolved", false);
        setField(term419152, term419152.getClass(), "resolveResult", null);
        setBooleanField(term419152, term419152.getClass(), "inTemplatedCheckVisit", false);
        setField(term419152, term419152.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearCachedValues", argTypes, term418474, args);
        assertTrue(recursiveEquals(term418474, term419152));
    }

};


