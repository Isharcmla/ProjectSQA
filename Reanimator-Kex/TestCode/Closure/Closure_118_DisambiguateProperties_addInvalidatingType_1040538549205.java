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

public class DisambiguateProperties_addInvalidatingType_1040538549205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89868;
     Object term90164;
     Object term90238;
     Object term90239;

    public DisambiguateProperties_addInvalidatingType_1040538549205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term90050 = new HashSet();
        term89868 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term90002 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term90002, term90002.getClass(), "invalidatingTypes", term90050);
        setField(term89868, term89868.getClass(), "typeSystem", term90002);
        term90164 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term90238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term90238, term90238.getClass(), "className", null);
        setField(term90238, term90238.getClass(), "properties", null);
        setBooleanField(term90238, term90238.getClass(), "nativeType", false);
        setField(term90238, term90238.getClass(), "implicitPrototypeFallback", null);
        setField(term90238, term90238.getClass(), "ownerFunction", null);
        setBooleanField(term90238, term90238.getClass(), "prettyPrint", false);
        setBooleanField(term90238, term90238.getClass(), "visited", false);
        setField(term90238, term90238.getClass(), "docInfo", null);
        setBooleanField(term90238, term90238.getClass(), "unknown", false);
        setBooleanField(term90238, term90238.getClass(), "resolved", false);
        setField(term90238, term90238.getClass(), "resolveResult", null);
        setField(term90238, term90238.getClass(), "templateTypeMap", null);
        setBooleanField(term90238, term90238.getClass(), "inTemplatedCheckVisit", false);
        setField(term90238, term90238.getClass(), "registry", null);
        term90239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term90239, term90239.getClass(), "className", null);
        setField(term90239, term90239.getClass(), "properties", null);
        setBooleanField(term90239, term90239.getClass(), "nativeType", false);
        setField(term90239, term90239.getClass(), "implicitPrototypeFallback", null);
        setField(term90239, term90239.getClass(), "ownerFunction", null);
        setBooleanField(term90239, term90239.getClass(), "prettyPrint", false);
        setBooleanField(term90239, term90239.getClass(), "visited", false);
        setField(term90239, term90239.getClass(), "docInfo", null);
        setBooleanField(term90239, term90239.getClass(), "unknown", false);
        setBooleanField(term90239, term90239.getClass(), "resolved", false);
        setField(term90239, term90239.getClass(), "resolveResult", null);
        setField(term90239, term90239.getClass(), "templateTypeMap", null);
        setBooleanField(term90239, term90239.getClass(), "inTemplatedCheckVisit", false);
        setField(term90239, term90239.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term90164;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term89868, args);
        assertTrue(recursiveEquals(term89868, term90238));
        assertTrue(recursiveEquals(term90164, term90239));
    }

};


