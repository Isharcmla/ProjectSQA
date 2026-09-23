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

public class PrototypeObjectType_setPropertyJSDocInfo_57542139058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823;
     Object term6930;

    public PrototypeObjectType_setPropertyJSDocInfo_57542139058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term1823, term1823.getClass(), "className", null);
        setField(term1823, term1823.getClass(), "properties", null);
        setBooleanField(term1823, term1823.getClass(), "nativeType", false);
        setField(term1823, term1823.getClass(), "implicitPrototypeFallback", null);
        setField(term1823, term1823.getClass(), "ownerFunction", null);
        setBooleanField(term1823, term1823.getClass(), "prettyPrint", false);
        setBooleanField(term1823, term1823.getClass(), "visited", false);
        setField(term1823, term1823.getClass(), "docInfo", null);
        setBooleanField(term1823, term1823.getClass(), "unknown", false);
        setBooleanField(term1823, term1823.getClass(), "resolved", false);
        setField(term1823, term1823.getClass(), "resolveResult", null);
        setField(term1823, term1823.getClass(), "registry", null);
        term6930 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term6930, term6930.getClass(), "className", null);
        setField(term6930, term6930.getClass(), "properties", null);
        setBooleanField(term6930, term6930.getClass(), "nativeType", false);
        setField(term6930, term6930.getClass(), "implicitPrototypeFallback", null);
        setField(term6930, term6930.getClass(), "ownerFunction", null);
        setBooleanField(term6930, term6930.getClass(), "prettyPrint", false);
        setBooleanField(term6930, term6930.getClass(), "visited", false);
        setField(term6930, term6930.getClass(), "docInfo", null);
        setBooleanField(term6930, term6930.getClass(), "unknown", false);
        setBooleanField(term6930, term6930.getClass(), "resolved", false);
        setField(term6930, term6930.getClass(), "resolveResult", null);
        setField(term6930, term6930.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setPropertyJSDocInfo", argTypes, term1823, args);
        assertTrue(recursiveEquals(term1823, term6930));
    }

};


