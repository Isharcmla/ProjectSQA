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
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67793;
     Object term67964;
     Object term71400;
     Object term71401;
     Object term71395;

    public JSType_getGreatestSubtype_1951394506334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        term67964 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term67793, term67793.getClass(), "referencedType", term67964);
        term71400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term71400, term71400.getClass(), "className", null);
        setField(term71400, term71400.getClass(), "properties", null);
        setBooleanField(term71400, term71400.getClass(), "nativeType", false);
        setField(term71400, term71400.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71400, term71400.getClass(), "prettyPrint", false);
        setBooleanField(term71400, term71400.getClass(), "visited", false);
        setField(term71400, term71400.getClass(), "docInfo", null);
        setBooleanField(term71400, term71400.getClass(), "unknown", false);
        setBooleanField(term71400, term71400.getClass(), "resolved", false);
        setField(term71400, term71400.getClass(), "resolveResult", null);
        setField(term71400, term71400.getClass(), "registry", null);
        term71401 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term71402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term71401, term71401.getClass(), "parameterType", null);
        setField(term71402, term71402.getClass(), "className", null);
        setField(term71402, term71402.getClass(), "properties", null);
        setBooleanField(term71402, term71402.getClass(), "nativeType", false);
        setField(term71402, term71402.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71402, term71402.getClass(), "prettyPrint", false);
        setBooleanField(term71402, term71402.getClass(), "visited", false);
        setField(term71402, term71402.getClass(), "docInfo", null);
        setBooleanField(term71402, term71402.getClass(), "unknown", false);
        setBooleanField(term71402, term71402.getClass(), "resolved", false);
        setField(term71402, term71402.getClass(), "resolveResult", null);
        setField(term71402, term71402.getClass(), "registry", null);
        setField(term71401, term71401.getClass(), "referencedType", term71402);
        setField(term71401, term71401.getClass(), "referencedObjType", null);
        setBooleanField(term71401, term71401.getClass(), "visited", false);
        setField(term71401, term71401.getClass(), "docInfo", null);
        setBooleanField(term71401, term71401.getClass(), "unknown", false);
        setBooleanField(term71401, term71401.getClass(), "resolved", false);
        setField(term71401, term71401.getClass(), "resolveResult", null);
        setField(term71401, term71401.getClass(), "registry", null);
        term71395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term71388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term71395, term71395.getClass(), "parameterType", null);
        setField(term71388, term71388.getClass(), "className", null);
        setField(term71388, term71388.getClass(), "properties", null);
        setBooleanField(term71388, term71388.getClass(), "nativeType", false);
        setField(term71388, term71388.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term71388, term71388.getClass(), "prettyPrint", false);
        setBooleanField(term71388, term71388.getClass(), "visited", false);
        setField(term71388, term71388.getClass(), "docInfo", null);
        setBooleanField(term71388, term71388.getClass(), "unknown", false);
        setBooleanField(term71388, term71388.getClass(), "resolved", false);
        setField(term71388, term71388.getClass(), "resolveResult", null);
        setField(term71388, term71388.getClass(), "registry", null);
        setField(term71395, term71395.getClass(), "referencedType", term71388);
        setField(term71395, term71395.getClass(), "referencedObjType", null);
        setBooleanField(term71395, term71395.getClass(), "visited", false);
        setField(term71395, term71395.getClass(), "docInfo", null);
        setBooleanField(term71395, term71395.getClass(), "unknown", false);
        setBooleanField(term71395, term71395.getClass(), "resolved", false);
        setField(term71395, term71395.getClass(), "resolveResult", null);
        setField(term71395, term71395.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term67793;
        args[1] = term67964;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term67793, term71400));
        assertTrue(recursiveEquals(term67964, term71401));
        assertTrue(recursiveEquals(retValue, term71395));
    }

};


