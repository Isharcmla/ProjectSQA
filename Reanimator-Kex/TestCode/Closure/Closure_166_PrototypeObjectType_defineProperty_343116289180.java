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

public class PrototypeObjectType_defineProperty_343116289180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29235;
     Object term60883;

    public PrototypeObjectType_defineProperty_343116289180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term29283 = new HashMap();
        term29235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term29235, term29235.getClass(), "properties", term29283);
        HashMap term60884 = new HashMap();
        term60883 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term60883, term60883.getClass(), "source", null);
        setField(term60883, term60883.getClass(), "elementsType", null);
        setField(term60883, term60883.getClass(), "elements", null);
        setField(term60883, term60883.getClass(), "className", null);
        setField(term60883, term60883.getClass(), "properties", term60884);
        setBooleanField(term60883, term60883.getClass(), "nativeType", false);
        setField(term60883, term60883.getClass(), "implicitPrototypeFallback", null);
        setField(term60883, term60883.getClass(), "ownerFunction", null);
        setBooleanField(term60883, term60883.getClass(), "prettyPrint", false);
        setBooleanField(term60883, term60883.getClass(), "visited", false);
        setField(term60883, term60883.getClass(), "docInfo", null);
        setBooleanField(term60883, term60883.getClass(), "unknown", false);
        setBooleanField(term60883, term60883.getClass(), "resolved", false);
        setField(term60883, term60883.getClass(), "resolveResult", null);
        setBooleanField(term60883, term60883.getClass(), "inTemplatedCheckVisit", false);
        setField(term60883, term60883.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object retValue = callMethod(klass, "defineProperty", argTypes, term29235, args);
        assertTrue(recursiveEquals(term29235, term60883));
        assertTrue(recursiveEquals(retValue, true));
    }

};


