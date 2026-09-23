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

public class PrototypeObjectType_setPropertyJSDocInfo_57542139059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1830;
     Object term7084;

    public PrototypeObjectType_setPropertyJSDocInfo_57542139059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term1830, term1830.getClass(), "className", null);
        setField(term1830, term1830.getClass(), "properties", null);
        setBooleanField(term1830, term1830.getClass(), "nativeType", false);
        setField(term1830, term1830.getClass(), "implicitPrototypeFallback", null);
        setField(term1830, term1830.getClass(), "ownerFunction", null);
        setBooleanField(term1830, term1830.getClass(), "prettyPrint", false);
        setBooleanField(term1830, term1830.getClass(), "visited", false);
        setField(term1830, term1830.getClass(), "docInfo", null);
        setBooleanField(term1830, term1830.getClass(), "unknown", false);
        setBooleanField(term1830, term1830.getClass(), "resolved", false);
        setField(term1830, term1830.getClass(), "resolveResult", null);
        setBooleanField(term1830, term1830.getClass(), "inTemplatedCheckVisit", false);
        setField(term1830, term1830.getClass(), "registry", null);
        term7084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term7084, term7084.getClass(), "className", null);
        setField(term7084, term7084.getClass(), "properties", null);
        setBooleanField(term7084, term7084.getClass(), "nativeType", false);
        setField(term7084, term7084.getClass(), "implicitPrototypeFallback", null);
        setField(term7084, term7084.getClass(), "ownerFunction", null);
        setBooleanField(term7084, term7084.getClass(), "prettyPrint", false);
        setBooleanField(term7084, term7084.getClass(), "visited", false);
        setField(term7084, term7084.getClass(), "docInfo", null);
        setBooleanField(term7084, term7084.getClass(), "unknown", false);
        setBooleanField(term7084, term7084.getClass(), "resolved", false);
        setField(term7084, term7084.getClass(), "resolveResult", null);
        setBooleanField(term7084, term7084.getClass(), "inTemplatedCheckVisit", false);
        setField(term7084, term7084.getClass(), "registry", null);
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
        callMethod(klass, "setPropertyJSDocInfo", argTypes, term1830, args);
        assertTrue(recursiveEquals(term1830, term7084));
    }

};


