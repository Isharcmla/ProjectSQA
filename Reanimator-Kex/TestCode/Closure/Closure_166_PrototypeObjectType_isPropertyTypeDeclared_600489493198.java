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

public class PrototypeObjectType_isPropertyTypeDeclared_600489493198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37126;
     Object term65622;

    public PrototypeObjectType_isPropertyTypeDeclared_600489493198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term37174 = new HashMap();
        term37126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term37402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term37126, term37126.getClass(), "properties", term37174);
        setField(term37126, term37126.getClass(), "implicitPrototypeFallback", term37402);
        HashMap term65623 = new HashMap();
        term65622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term65624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term65622, term65622.getClass(), "className", null);
        setField(term65622, term65622.getClass(), "properties", term65623);
        setBooleanField(term65622, term65622.getClass(), "nativeType", false);
        setField(term65624, term65624.getClass(), "typeExpr", null);
        setField(term65624, term65624.getClass(), "sourceName", null);
        setBooleanField(term65624, term65624.getClass(), "isChecked", false);
        setBooleanField(term65624, term65624.getClass(), "visited", false);
        setField(term65624, term65624.getClass(), "docInfo", null);
        setBooleanField(term65624, term65624.getClass(), "unknown", false);
        setBooleanField(term65624, term65624.getClass(), "resolved", false);
        setField(term65624, term65624.getClass(), "resolveResult", null);
        setBooleanField(term65624, term65624.getClass(), "inTemplatedCheckVisit", false);
        setField(term65624, term65624.getClass(), "registry", null);
        setField(term65622, term65622.getClass(), "implicitPrototypeFallback", term65624);
        setField(term65622, term65622.getClass(), "ownerFunction", null);
        setBooleanField(term65622, term65622.getClass(), "prettyPrint", false);
        setBooleanField(term65622, term65622.getClass(), "visited", false);
        setField(term65622, term65622.getClass(), "docInfo", null);
        setBooleanField(term65622, term65622.getClass(), "unknown", false);
        setBooleanField(term65622, term65622.getClass(), "resolved", false);
        setField(term65622, term65622.getClass(), "resolveResult", null);
        setBooleanField(term65622, term65622.getClass(), "inTemplatedCheckVisit", false);
        setField(term65622, term65622.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeDeclared", argTypes, term37126, args);
        assertTrue(recursiveEquals(term37126, term65622));
        assertTrue(recursiveEquals(retValue, false));
    }

};


