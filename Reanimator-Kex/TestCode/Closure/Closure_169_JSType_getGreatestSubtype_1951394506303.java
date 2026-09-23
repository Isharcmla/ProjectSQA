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

public class JSType_getGreatestSubtype_1951394506303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40689;
     Object term40705;
     Object term40706;
     Object term40690;

    public JSType_getGreatestSubtype_1951394506303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40689 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term40705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term40705, term40705.getClass(), "call", null);
        setField(term40705, term40705.getClass(), "prototypeSlot", null);
        setField(term40705, term40705.getClass(), "kind", null);
        setField(term40705, term40705.getClass(), "propAccess", null);
        setField(term40705, term40705.getClass(), "typeOfThis", null);
        setField(term40705, term40705.getClass(), "source", null);
        setField(term40705, term40705.getClass(), "implementedInterfaces", null);
        setField(term40705, term40705.getClass(), "extendedInterfaces", null);
        setField(term40705, term40705.getClass(), "subTypes", null);
        setField(term40705, term40705.getClass(), "templateTypeNames", null);
        setField(term40705, term40705.getClass(), "className", null);
        setField(term40705, term40705.getClass(), "properties", null);
        setBooleanField(term40705, term40705.getClass(), "nativeType", false);
        setField(term40705, term40705.getClass(), "implicitPrototypeFallback", null);
        setField(term40705, term40705.getClass(), "ownerFunction", null);
        setBooleanField(term40705, term40705.getClass(), "prettyPrint", false);
        setBooleanField(term40705, term40705.getClass(), "visited", false);
        setField(term40705, term40705.getClass(), "docInfo", null);
        setBooleanField(term40705, term40705.getClass(), "unknown", false);
        setBooleanField(term40705, term40705.getClass(), "resolved", false);
        setField(term40705, term40705.getClass(), "resolveResult", null);
        setBooleanField(term40705, term40705.getClass(), "inTemplatedCheckVisit", false);
        setField(term40705, term40705.getClass(), "registry", null);
        term40706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term40706, term40706.getClass(), "call", null);
        setField(term40706, term40706.getClass(), "prototypeSlot", null);
        setField(term40706, term40706.getClass(), "kind", null);
        setField(term40706, term40706.getClass(), "propAccess", null);
        setField(term40706, term40706.getClass(), "typeOfThis", null);
        setField(term40706, term40706.getClass(), "source", null);
        setField(term40706, term40706.getClass(), "implementedInterfaces", null);
        setField(term40706, term40706.getClass(), "extendedInterfaces", null);
        setField(term40706, term40706.getClass(), "subTypes", null);
        setField(term40706, term40706.getClass(), "templateTypeNames", null);
        setField(term40706, term40706.getClass(), "className", null);
        setField(term40706, term40706.getClass(), "properties", null);
        setBooleanField(term40706, term40706.getClass(), "nativeType", false);
        setField(term40706, term40706.getClass(), "implicitPrototypeFallback", null);
        setField(term40706, term40706.getClass(), "ownerFunction", null);
        setBooleanField(term40706, term40706.getClass(), "prettyPrint", false);
        setBooleanField(term40706, term40706.getClass(), "visited", false);
        setField(term40706, term40706.getClass(), "docInfo", null);
        setBooleanField(term40706, term40706.getClass(), "unknown", false);
        setBooleanField(term40706, term40706.getClass(), "resolved", false);
        setField(term40706, term40706.getClass(), "resolveResult", null);
        setBooleanField(term40706, term40706.getClass(), "inTemplatedCheckVisit", false);
        setField(term40706, term40706.getClass(), "registry", null);
        term40690 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term40690, term40690.getClass(), "call", null);
        setField(term40690, term40690.getClass(), "prototypeSlot", null);
        setField(term40690, term40690.getClass(), "kind", null);
        setField(term40690, term40690.getClass(), "propAccess", null);
        setField(term40690, term40690.getClass(), "typeOfThis", null);
        setField(term40690, term40690.getClass(), "source", null);
        setField(term40690, term40690.getClass(), "implementedInterfaces", null);
        setField(term40690, term40690.getClass(), "extendedInterfaces", null);
        setField(term40690, term40690.getClass(), "subTypes", null);
        setField(term40690, term40690.getClass(), "templateTypeNames", null);
        setField(term40690, term40690.getClass(), "className", null);
        setField(term40690, term40690.getClass(), "properties", null);
        setBooleanField(term40690, term40690.getClass(), "nativeType", false);
        setField(term40690, term40690.getClass(), "implicitPrototypeFallback", null);
        setField(term40690, term40690.getClass(), "ownerFunction", null);
        setBooleanField(term40690, term40690.getClass(), "prettyPrint", false);
        setBooleanField(term40690, term40690.getClass(), "visited", false);
        setField(term40690, term40690.getClass(), "docInfo", null);
        setBooleanField(term40690, term40690.getClass(), "unknown", false);
        setBooleanField(term40690, term40690.getClass(), "resolved", false);
        setField(term40690, term40690.getClass(), "resolveResult", null);
        setBooleanField(term40690, term40690.getClass(), "inTemplatedCheckVisit", false);
        setField(term40690, term40690.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term40689;
        args[1] = term40689;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term40689, term40705));
        assertTrue(recursiveEquals(term40689, term40706));
        assertTrue(recursiveEquals(retValue, term40690));
    }

};


