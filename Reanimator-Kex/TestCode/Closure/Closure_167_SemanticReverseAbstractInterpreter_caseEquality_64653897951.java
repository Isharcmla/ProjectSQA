package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SemanticReverseAbstractInterpreter_caseEquality_64653897951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370460;
     Object term370530;
     Object term370724;
     Object enum1;
     Object term371178;
     Object term371179;
     Object term371181;
     Object enum2;

    public SemanticReverseAbstractInterpreter_caseEquality_64653897951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370460 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term370530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term370530, term370530.getClass(), "type", 2147482626);
        setField(term370530, term370530.getClass(), "jsType", term370654);
        term370724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term370724, term370724.getClass(), "type", -2147483615);
        setField(term370724, term370724.getClass(), "jsType", null);
        Class<? extends Object> term371186 = Class.forName((String) "com.google.common.base.Functions$IdentityFunction");
        Field term371185 = ((Class) term371186).getDeclaredField((String) "INSTANCE");
        ((Field) term371185).setAccessible(true);
        enum1 = ((Field) term371185).get((Object) null);
        term371178 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term371178, term371178.getClass(), "INEQ", null);
        setField(term371178, term371178.getClass(), "convention", null);
        setField(term371178, term371178.getClass(), "typeRegistry", null);
        setField(term371178, term371178.getClass(), "firstLink", null);
        setField(term371178, term371178.getClass(), "nextLink", null);
        setField(term371178, term371178.getClass(), "restrictUndefinedVisitor", null);
        setField(term371178, term371178.getClass(), "restrictNullVisitor", null);
        term371179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term371179, term371179.getClass(), "type", 2147482626);
        setField(term371179, term371179.getClass(), "next", null);
        setField(term371179, term371179.getClass(), "first", null);
        setField(term371179, term371179.getClass(), "last", null);
        setField(term371179, term371179.getClass(), "propListHead", null);
        setIntField(term371179, term371179.getClass(), "sourcePosition", 0);
        setField(term371180, term371180.getClass(), "typeExpr", null);
        setField(term371180, term371180.getClass(), "sourceName", null);
        setBooleanField(term371180, term371180.getClass(), "isChecked", false);
        setBooleanField(term371180, term371180.getClass(), "visited", false);
        setField(term371180, term371180.getClass(), "docInfo", null);
        setBooleanField(term371180, term371180.getClass(), "unknown", false);
        setBooleanField(term371180, term371180.getClass(), "resolved", false);
        setField(term371180, term371180.getClass(), "resolveResult", null);
        setBooleanField(term371180, term371180.getClass(), "inTemplatedCheckVisit", false);
        setField(term371180, term371180.getClass(), "registry", null);
        setField(term371179, term371179.getClass(), "jsType", term371180);
        setField(term371179, term371179.getClass(), "parent", null);
        term371181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term371181, term371181.getClass(), "type", -2147483615);
        setField(term371181, term371181.getClass(), "next", null);
        setField(term371181, term371181.getClass(), "first", null);
        setField(term371181, term371181.getClass(), "last", null);
        setField(term371181, term371181.getClass(), "propListHead", null);
        setIntField(term371181, term371181.getClass(), "sourcePosition", 0);
        setField(term371181, term371181.getClass(), "jsType", null);
        setField(term371181, term371181.getClass(), "parent", null);
        Class<? extends Object> term371462 = Class.forName((String) "com.google.common.base.Functions$IdentityFunction");
        Field term371461 = ((Class) term371462).getDeclaredField((String) "INSTANCE");
        ((Field) term371461).setAccessible(true);
        enum2 = ((Field) term371461).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[3] = Class.forName("com.google.common.base.Function");
        Object[] args = new Object[4];
        args[0] = term370530;
        args[1] = term370724;
        args[2] = null;
        args[3] = enum1;
        Object retValue = callMethod(klass, "caseEquality", argTypes, term370460, args);
        assertTrue(recursiveEquals(term370460, term371178));
        assertTrue(recursiveEquals(term370530, term371179));
        assertTrue(recursiveEquals(term370724, null));
        assertTrue(recursiveEquals(enum1, enum2));
        assertTrue(recursiveEquals(retValue, null));
    }

};


