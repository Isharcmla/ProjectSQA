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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class PrototypeObjectType_isPropertyTypeInferred_1167677196126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16723;
     Object term41135;

    public PrototypeObjectType_isPropertyTypeInferred_1167677196126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16861 = newInstance(Class.forName("java.lang.Object"));
        HashMap term16771 = new HashMap();
        ((HashMap) term16771).put(term16861, term16861);
        ArrayList term17065 = new ArrayList();
        term16723 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term17013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term16723, term16723.getClass(), "properties", term16771);
        setField(term16723, term16723.getClass(), "implicitPrototypeFallback", null);
        setField(term17013, term17013.getClass(), "extendedInterfaces", term17065);
        setField(term16723, term16723.getClass(), "ownerFunction", term17013);
        HashMap term41136 = new HashMap();
        ArrayList term41141 = new ArrayList();
        term41135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term41140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term41135, term41135.getClass(), "className", null);
        setField(term41135, term41135.getClass(), "properties", term41136);
        setBooleanField(term41135, term41135.getClass(), "nativeType", false);
        setField(term41135, term41135.getClass(), "implicitPrototypeFallback", null);
        setField(term41140, term41140.getClass(), "call", null);
        setField(term41140, term41140.getClass(), "prototypeSlot", null);
        setField(term41140, term41140.getClass(), "kind", null);
        setField(term41140, term41140.getClass(), "typeOfThis", null);
        setField(term41140, term41140.getClass(), "source", null);
        setField(term41140, term41140.getClass(), "implementedInterfaces", null);
        setField(term41140, term41140.getClass(), "extendedInterfaces", term41141);
        setField(term41140, term41140.getClass(), "subTypes", null);
        setField(term41140, term41140.getClass(), "templateTypeName", null);
        setField(term41140, term41140.getClass(), "className", null);
        setField(term41140, term41140.getClass(), "properties", null);
        setBooleanField(term41140, term41140.getClass(), "nativeType", false);
        setField(term41140, term41140.getClass(), "implicitPrototypeFallback", null);
        setField(term41140, term41140.getClass(), "ownerFunction", null);
        setBooleanField(term41140, term41140.getClass(), "prettyPrint", false);
        setBooleanField(term41140, term41140.getClass(), "visited", false);
        setField(term41140, term41140.getClass(), "docInfo", null);
        setBooleanField(term41140, term41140.getClass(), "unknown", false);
        setBooleanField(term41140, term41140.getClass(), "resolved", false);
        setField(term41140, term41140.getClass(), "resolveResult", null);
        setField(term41140, term41140.getClass(), "registry", null);
        setField(term41135, term41135.getClass(), "ownerFunction", term41140);
        setBooleanField(term41135, term41135.getClass(), "prettyPrint", false);
        setBooleanField(term41135, term41135.getClass(), "visited", false);
        setField(term41135, term41135.getClass(), "docInfo", null);
        setBooleanField(term41135, term41135.getClass(), "unknown", false);
        setBooleanField(term41135, term41135.getClass(), "resolved", false);
        setField(term41135, term41135.getClass(), "resolveResult", null);
        setField(term41135, term41135.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term16723, args);
        assertTrue(recursiveEquals(term16723, term41135));
        assertTrue(recursiveEquals(retValue, false));
    }

};


