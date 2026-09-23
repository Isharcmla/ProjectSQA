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

public class FunctionType_visit_1870685377197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99908;
     Object term100052;
     Object term100072;
     Object term100073;
     Object term100059;

    public FunctionType_visit_1870685377197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term100052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor"));
        term100072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100072, term100072.getClass(), "call", null);
        setField(term100072, term100072.getClass(), "prototype", null);
        setField(term100072, term100072.getClass(), "kind", null);
        setField(term100072, term100072.getClass(), "typeOfThis", null);
        setField(term100072, term100072.getClass(), "source", null);
        setField(term100072, term100072.getClass(), "implementedInterfaces", null);
        setField(term100072, term100072.getClass(), "subTypes", null);
        setField(term100072, term100072.getClass(), "templateTypeName", null);
        setField(term100072, term100072.getClass(), "className", null);
        setField(term100072, term100072.getClass(), "properties", null);
        setField(term100072, term100072.getClass(), "implicitPrototype", null);
        setBooleanField(term100072, term100072.getClass(), "nativeType", false);
        setBooleanField(term100072, term100072.getClass(), "prettyPrint", false);
        setBooleanField(term100072, term100072.getClass(), "visited", false);
        setField(term100072, term100072.getClass(), "docInfo", null);
        setBooleanField(term100072, term100072.getClass(), "unknown", false);
        setBooleanField(term100072, term100072.getClass(), "resolved", false);
        setField(term100072, term100072.getClass(), "resolveResult", null);
        setField(term100072, term100072.getClass(), "registry", null);
        term100073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType$LeastSupertypeVisitor"));
        setField(term100073, term100073.getClass(), "this$0", null);
        term100059 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term100059, term100059.getClass(), "call", null);
        setField(term100059, term100059.getClass(), "prototype", null);
        setField(term100059, term100059.getClass(), "kind", null);
        setField(term100059, term100059.getClass(), "typeOfThis", null);
        setField(term100059, term100059.getClass(), "source", null);
        setField(term100059, term100059.getClass(), "implementedInterfaces", null);
        setField(term100059, term100059.getClass(), "subTypes", null);
        setField(term100059, term100059.getClass(), "templateTypeName", null);
        setField(term100059, term100059.getClass(), "className", null);
        setField(term100059, term100059.getClass(), "properties", null);
        setField(term100059, term100059.getClass(), "implicitPrototype", null);
        setBooleanField(term100059, term100059.getClass(), "nativeType", false);
        setBooleanField(term100059, term100059.getClass(), "prettyPrint", false);
        setBooleanField(term100059, term100059.getClass(), "visited", false);
        setField(term100059, term100059.getClass(), "docInfo", null);
        setBooleanField(term100059, term100059.getClass(), "unknown", false);
        setBooleanField(term100059, term100059.getClass(), "resolved", false);
        setField(term100059, term100059.getClass(), "resolveResult", null);
        setField(term100059, term100059.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.Visitor");
        Object[] args = new Object[1];
        args[0] = term100052;
        Object retValue = callMethod(klass, "visit", argTypes, term99908, args);
        assertTrue(recursiveEquals(term99908, term100072));
        assertTrue(recursiveEquals(term100052, term100073));
        assertTrue(recursiveEquals(retValue, term100059));
    }

};


