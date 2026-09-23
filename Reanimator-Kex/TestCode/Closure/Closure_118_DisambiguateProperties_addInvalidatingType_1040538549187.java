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

public class DisambiguateProperties_addInvalidatingType_1040538549187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76266;
     Object term76574;
     Object term76650;
     Object term76651;

    public DisambiguateProperties_addInvalidatingType_1040538549187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term76460 = new HashSet();
        term76266 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term76412 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$ConcreteTypeSystem"));
        setField(term76412, term76412.getClass(), "invalidatingTypes", term76460);
        setField(term76266, term76266.getClass(), "typeSystem", term76412);
        term76574 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term76650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term76650, term76650.getClass(), "className", null);
        setField(term76650, term76650.getClass(), "properties", null);
        setBooleanField(term76650, term76650.getClass(), "nativeType", false);
        setField(term76650, term76650.getClass(), "implicitPrototypeFallback", null);
        setField(term76650, term76650.getClass(), "ownerFunction", null);
        setBooleanField(term76650, term76650.getClass(), "prettyPrint", false);
        setBooleanField(term76650, term76650.getClass(), "visited", false);
        setField(term76650, term76650.getClass(), "docInfo", null);
        setBooleanField(term76650, term76650.getClass(), "unknown", false);
        setBooleanField(term76650, term76650.getClass(), "resolved", false);
        setField(term76650, term76650.getClass(), "resolveResult", null);
        setField(term76650, term76650.getClass(), "templateTypeMap", null);
        setBooleanField(term76650, term76650.getClass(), "inTemplatedCheckVisit", false);
        setField(term76650, term76650.getClass(), "registry", null);
        term76651 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term76651, term76651.getClass(), "className", null);
        setField(term76651, term76651.getClass(), "properties", null);
        setBooleanField(term76651, term76651.getClass(), "nativeType", false);
        setField(term76651, term76651.getClass(), "implicitPrototypeFallback", null);
        setField(term76651, term76651.getClass(), "ownerFunction", null);
        setBooleanField(term76651, term76651.getClass(), "prettyPrint", false);
        setBooleanField(term76651, term76651.getClass(), "visited", false);
        setField(term76651, term76651.getClass(), "docInfo", null);
        setBooleanField(term76651, term76651.getClass(), "unknown", false);
        setBooleanField(term76651, term76651.getClass(), "resolved", false);
        setField(term76651, term76651.getClass(), "resolveResult", null);
        setField(term76651, term76651.getClass(), "templateTypeMap", null);
        setBooleanField(term76651, term76651.getClass(), "inTemplatedCheckVisit", false);
        setField(term76651, term76651.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term76574;
        args[1] = null;
        callMethod(klass, "addInvalidatingType", argTypes, term76266, args);
        assertTrue(recursiveEquals(term76266, term76650));
        assertTrue(recursiveEquals(term76574, term76651));
    }

};


