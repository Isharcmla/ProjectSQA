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

public class PrototypeObjectType_isPropertyTypeInferred_1167677196184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31002;
     Object term61549;

    public PrototypeObjectType_isPropertyTypeInferred_1167677196184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31050 = new HashMap();
        term31002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term31264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term31002, term31002.getClass(), "properties", term31050);
        setField(term31002, term31002.getClass(), "implicitPrototypeFallback", term31264);
        HashMap term61550 = new HashMap();
        term61549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term61551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term61549, term61549.getClass(), "className", null);
        setField(term61549, term61549.getClass(), "properties", term61550);
        setBooleanField(term61549, term61549.getClass(), "nativeType", false);
        setField(term61551, term61551.getClass(), "parameterType", null);
        setField(term61551, term61551.getClass(), "referencedType", null);
        setField(term61551, term61551.getClass(), "referencedObjType", null);
        setBooleanField(term61551, term61551.getClass(), "visited", false);
        setField(term61551, term61551.getClass(), "docInfo", null);
        setBooleanField(term61551, term61551.getClass(), "unknown", false);
        setBooleanField(term61551, term61551.getClass(), "resolved", false);
        setField(term61551, term61551.getClass(), "resolveResult", null);
        setBooleanField(term61551, term61551.getClass(), "inTemplatedCheckVisit", false);
        setField(term61551, term61551.getClass(), "registry", null);
        setField(term61549, term61549.getClass(), "implicitPrototypeFallback", term61551);
        setField(term61549, term61549.getClass(), "ownerFunction", null);
        setBooleanField(term61549, term61549.getClass(), "prettyPrint", false);
        setBooleanField(term61549, term61549.getClass(), "visited", false);
        setField(term61549, term61549.getClass(), "docInfo", null);
        setBooleanField(term61549, term61549.getClass(), "unknown", false);
        setBooleanField(term61549, term61549.getClass(), "resolved", false);
        setField(term61549, term61549.getClass(), "resolveResult", null);
        setBooleanField(term61549, term61549.getClass(), "inTemplatedCheckVisit", false);
        setField(term61549, term61549.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term31002, args);
        assertTrue(recursiveEquals(term31002, term61549));
        assertTrue(recursiveEquals(retValue, false));
    }

};


