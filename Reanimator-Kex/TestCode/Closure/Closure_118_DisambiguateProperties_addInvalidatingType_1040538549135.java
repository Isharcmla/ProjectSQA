package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashSet;

public class DisambiguateProperties_addInvalidatingType_1040538549135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46186;
     Object term46472;
     Object term47537;
     Object term47538;

    public DisambiguateProperties_addInvalidatingType_1040538549135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term46368 = new HashSet();
        term46186 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term46320 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term46320, term46320.getClass(), "invalidatingTypes", term46368);
        setField(term46186, term46186.getClass(), "typeSystem", term46320);
        term46472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term47537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term47537, term47537.getClass(), "call", null);
        setField(term47537, term47537.getClass(), "prototypeSlot", null);
        setField(term47537, term47537.getClass(), "kind", null);
        setField(term47537, term47537.getClass(), "propAccess", null);
        setField(term47537, term47537.getClass(), "typeOfThis", null);
        setField(term47537, term47537.getClass(), "source", null);
        setField(term47537, term47537.getClass(), "implementedInterfaces", null);
        setField(term47537, term47537.getClass(), "extendedInterfaces", null);
        setField(term47537, term47537.getClass(), "subTypes", null);
        setField(term47537, term47537.getClass(), "className", null);
        setField(term47537, term47537.getClass(), "properties", null);
        setBooleanField(term47537, term47537.getClass(), "nativeType", false);
        setField(term47537, term47537.getClass(), "implicitPrototypeFallback", null);
        setField(term47537, term47537.getClass(), "ownerFunction", null);
        setBooleanField(term47537, term47537.getClass(), "prettyPrint", false);
        setBooleanField(term47537, term47537.getClass(), "visited", false);
        setField(term47537, term47537.getClass(), "docInfo", null);
        setBooleanField(term47537, term47537.getClass(), "unknown", false);
        setBooleanField(term47537, term47537.getClass(), "resolved", false);
        setField(term47537, term47537.getClass(), "resolveResult", null);
        setField(term47537, term47537.getClass(), "templateTypeMap", null);
        setBooleanField(term47537, term47537.getClass(), "inTemplatedCheckVisit", false);
        setField(term47537, term47537.getClass(), "registry", null);
        term47538 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term47538, term47538.getClass(), "call", null);
        setField(term47538, term47538.getClass(), "prototypeSlot", null);
        setField(term47538, term47538.getClass(), "kind", null);
        setField(term47538, term47538.getClass(), "propAccess", null);
        setField(term47538, term47538.getClass(), "typeOfThis", null);
        setField(term47538, term47538.getClass(), "source", null);
        setField(term47538, term47538.getClass(), "implementedInterfaces", null);
        setField(term47538, term47538.getClass(), "extendedInterfaces", null);
        setField(term47538, term47538.getClass(), "subTypes", null);
        setField(term47538, term47538.getClass(), "className", null);
        setField(term47538, term47538.getClass(), "properties", null);
        setBooleanField(term47538, term47538.getClass(), "nativeType", false);
        setField(term47538, term47538.getClass(), "implicitPrototypeFallback", null);
        setField(term47538, term47538.getClass(), "ownerFunction", null);
        setBooleanField(term47538, term47538.getClass(), "prettyPrint", false);
        setBooleanField(term47538, term47538.getClass(), "visited", false);
        setField(term47538, term47538.getClass(), "docInfo", null);
        setBooleanField(term47538, term47538.getClass(), "unknown", false);
        setBooleanField(term47538, term47538.getClass(), "resolved", false);
        setField(term47538, term47538.getClass(), "resolveResult", null);
        setField(term47538, term47538.getClass(), "templateTypeMap", null);
        setBooleanField(term47538, term47538.getClass(), "inTemplatedCheckVisit", false);
        setField(term47538, term47538.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term46472;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term46186, args);
        assertTrue(recursiveEquals(term46186, term47537));
        assertTrue(recursiveEquals(term46472, term47538));
    }

};


