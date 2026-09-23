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

public class UnionType_meet_864061386204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42433;
     Object term42589;
     Object term43032;
     Object term43035;
     Object term42916;

    public UnionType_meet_864061386204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term42485 = new ArrayList();
        term42433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term42433, term42433.getClass(), "registry", null);
        setField(term42433, term42433.getClass(), "alternates", term42485);
        term42589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        ArrayList term43033 = new ArrayList();
        term43032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term43032, term43032.getClass(), "alternates", term43033);
        setIntField(term43032, term43032.getClass(), "hashcode", 0);
        setBooleanField(term43032, term43032.getClass(), "resolved", false);
        setField(term43032, term43032.getClass(), "resolveResult", null);
        setBooleanField(term43032, term43032.getClass(), "inTemplatedCheckVisit", false);
        setField(term43032, term43032.getClass(), "registry", null);
        term43035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term43035, term43035.getClass(), "call", null);
        setField(term43035, term43035.getClass(), "prototypeSlot", null);
        setField(term43035, term43035.getClass(), "kind", null);
        setField(term43035, term43035.getClass(), "propAccess", null);
        setField(term43035, term43035.getClass(), "typeOfThis", null);
        setField(term43035, term43035.getClass(), "source", null);
        setField(term43035, term43035.getClass(), "implementedInterfaces", null);
        setField(term43035, term43035.getClass(), "extendedInterfaces", null);
        setField(term43035, term43035.getClass(), "subTypes", null);
        setField(term43035, term43035.getClass(), "templateTypeNames", null);
        setField(term43035, term43035.getClass(), "className", null);
        setField(term43035, term43035.getClass(), "properties", null);
        setBooleanField(term43035, term43035.getClass(), "nativeType", false);
        setField(term43035, term43035.getClass(), "implicitPrototypeFallback", null);
        setField(term43035, term43035.getClass(), "ownerFunction", null);
        setBooleanField(term43035, term43035.getClass(), "prettyPrint", false);
        setBooleanField(term43035, term43035.getClass(), "visited", false);
        setField(term43035, term43035.getClass(), "docInfo", null);
        setBooleanField(term43035, term43035.getClass(), "unknown", false);
        setBooleanField(term43035, term43035.getClass(), "resolved", false);
        setField(term43035, term43035.getClass(), "resolveResult", null);
        setBooleanField(term43035, term43035.getClass(), "inTemplatedCheckVisit", false);
        setField(term43035, term43035.getClass(), "registry", null);
        term42916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term42916, term42916.getClass(), "call", null);
        setField(term42916, term42916.getClass(), "prototypeSlot", null);
        setField(term42916, term42916.getClass(), "kind", null);
        setField(term42916, term42916.getClass(), "propAccess", null);
        setField(term42916, term42916.getClass(), "typeOfThis", null);
        setField(term42916, term42916.getClass(), "source", null);
        setField(term42916, term42916.getClass(), "implementedInterfaces", null);
        setField(term42916, term42916.getClass(), "extendedInterfaces", null);
        setField(term42916, term42916.getClass(), "subTypes", null);
        setField(term42916, term42916.getClass(), "templateTypeNames", null);
        setField(term42916, term42916.getClass(), "className", null);
        setField(term42916, term42916.getClass(), "properties", null);
        setBooleanField(term42916, term42916.getClass(), "nativeType", false);
        setField(term42916, term42916.getClass(), "implicitPrototypeFallback", null);
        setField(term42916, term42916.getClass(), "ownerFunction", null);
        setBooleanField(term42916, term42916.getClass(), "prettyPrint", false);
        setBooleanField(term42916, term42916.getClass(), "visited", false);
        setField(term42916, term42916.getClass(), "docInfo", null);
        setBooleanField(term42916, term42916.getClass(), "unknown", false);
        setBooleanField(term42916, term42916.getClass(), "resolved", false);
        setField(term42916, term42916.getClass(), "resolveResult", null);
        setBooleanField(term42916, term42916.getClass(), "inTemplatedCheckVisit", false);
        setField(term42916, term42916.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term42589;
        Object retValue = callMethod(klass, "meet", argTypes, term42433, args);
        assertTrue(recursiveEquals(term42433, term43032));
        assertTrue(recursiveEquals(term42589, term43035));
        assertTrue(recursiveEquals(retValue, term42916));
    }

};


