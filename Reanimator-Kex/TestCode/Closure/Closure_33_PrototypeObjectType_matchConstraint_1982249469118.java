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

public class PrototypeObjectType_matchConstraint_1982249469118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14467;
     Object term14581;
     Object term39893;
     Object term39894;

    public PrototypeObjectType_matchConstraint_1982249469118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term14581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term39893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term39893, term39893.getClass(), "className", null);
        setField(term39893, term39893.getClass(), "properties", null);
        setBooleanField(term39893, term39893.getClass(), "nativeType", false);
        setField(term39893, term39893.getClass(), "implicitPrototypeFallback", null);
        setField(term39893, term39893.getClass(), "ownerFunction", null);
        setBooleanField(term39893, term39893.getClass(), "prettyPrint", false);
        setBooleanField(term39893, term39893.getClass(), "visited", false);
        setField(term39893, term39893.getClass(), "docInfo", null);
        setBooleanField(term39893, term39893.getClass(), "unknown", false);
        setBooleanField(term39893, term39893.getClass(), "resolved", false);
        setField(term39893, term39893.getClass(), "resolveResult", null);
        setField(term39893, term39893.getClass(), "registry", null);
        term39894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term39894, term39894.getClass(), "className", null);
        setField(term39894, term39894.getClass(), "properties", null);
        setBooleanField(term39894, term39894.getClass(), "nativeType", false);
        setField(term39894, term39894.getClass(), "implicitPrototypeFallback", null);
        setField(term39894, term39894.getClass(), "ownerFunction", null);
        setBooleanField(term39894, term39894.getClass(), "prettyPrint", false);
        setBooleanField(term39894, term39894.getClass(), "visited", false);
        setField(term39894, term39894.getClass(), "docInfo", null);
        setBooleanField(term39894, term39894.getClass(), "unknown", false);
        setBooleanField(term39894, term39894.getClass(), "resolved", false);
        setField(term39894, term39894.getClass(), "resolveResult", null);
        setField(term39894, term39894.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term14581;
        callMethod(klass, "matchConstraint", argTypes, term14467, args);
        assertTrue(recursiveEquals(term14467, term39893));
        assertTrue(recursiveEquals(term14581, term39894));
    }

};


