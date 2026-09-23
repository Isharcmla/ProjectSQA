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

public class PrototypeObjectType_isPropertyTypeInferred_116767719685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10962;
     Object term11472;

    public PrototypeObjectType_isPropertyTypeInferred_116767719685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11010 = new HashMap();
        term10962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term10962, term10962.getClass(), "properties", term11010);
        setField(term10962, term10962.getClass(), "implicitPrototypeFallback", term11238);
        HashMap term11473 = new HashMap();
        term11472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term11474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term11472, term11472.getClass(), "className", null);
        setField(term11472, term11472.getClass(), "properties", term11473);
        setBooleanField(term11472, term11472.getClass(), "nativeType", false);
        setField(term11474, term11474.getClass(), "typeExpr", null);
        setField(term11474, term11474.getClass(), "sourceName", null);
        setBooleanField(term11474, term11474.getClass(), "isChecked", false);
        setBooleanField(term11474, term11474.getClass(), "visited", false);
        setField(term11474, term11474.getClass(), "docInfo", null);
        setBooleanField(term11474, term11474.getClass(), "unknown", false);
        setBooleanField(term11474, term11474.getClass(), "resolved", false);
        setField(term11474, term11474.getClass(), "resolveResult", null);
        setField(term11474, term11474.getClass(), "registry", null);
        setField(term11472, term11472.getClass(), "implicitPrototypeFallback", term11474);
        setField(term11472, term11472.getClass(), "ownerFunction", null);
        setBooleanField(term11472, term11472.getClass(), "prettyPrint", false);
        setBooleanField(term11472, term11472.getClass(), "visited", false);
        setField(term11472, term11472.getClass(), "docInfo", null);
        setBooleanField(term11472, term11472.getClass(), "unknown", false);
        setBooleanField(term11472, term11472.getClass(), "resolved", false);
        setField(term11472, term11472.getClass(), "resolveResult", null);
        setField(term11472, term11472.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term10962, args);
        assertTrue(recursiveEquals(term10962, term11472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


