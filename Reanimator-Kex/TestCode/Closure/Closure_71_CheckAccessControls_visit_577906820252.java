package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class CheckAccessControls_visit_577906820252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74023;
     Object term74093;
     Object term74485;
     Object term74486;

    public CheckAccessControls_visit_577906820252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74023 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term74093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term74327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term74093, term74093.getClass(), "type", 30);
        setField(term74203, term74203.getClass(), "docInfo", null);
        setField(term74203, term74203.getClass(), "implicitPrototypeFallback", term74327);
        setField(term74093, term74093.getClass(), "jsType", term74203);
        term74485 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term74485, term74485.getClass(), "compiler", null);
        setField(term74485, term74485.getClass(), "validator", null);
        setIntField(term74485, term74485.getClass(), "deprecatedDepth", 0);
        setIntField(term74485, term74485.getClass(), "methodDepth", 0);
        setField(term74485, term74485.getClass(), "currentClass", null);
        setField(term74485, term74485.getClass(), "initializedConstantProperties", null);
        term74486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term74488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term74486, term74486.getClass(), "type", 30);
        setField(term74486, term74486.getClass(), "next", null);
        setField(term74486, term74486.getClass(), "first", null);
        setField(term74486, term74486.getClass(), "last", null);
        setField(term74486, term74486.getClass(), "propListHead", null);
        setIntField(term74486, term74486.getClass(), "sourcePosition", 0);
        setField(term74487, term74487.getClass(), "call", null);
        setField(term74487, term74487.getClass(), "prototype", null);
        setField(term74487, term74487.getClass(), "kind", null);
        setField(term74487, term74487.getClass(), "typeOfThis", null);
        setField(term74487, term74487.getClass(), "source", null);
        setField(term74487, term74487.getClass(), "implementedInterfaces", null);
        setField(term74487, term74487.getClass(), "subTypes", null);
        setField(term74487, term74487.getClass(), "templateTypeName", null);
        setField(term74487, term74487.getClass(), "className", null);
        setField(term74487, term74487.getClass(), "properties", null);
        setBooleanField(term74487, term74487.getClass(), "nativeType", false);
        setField(term74488, term74488.getClass(), "typeExpr", null);
        setField(term74488, term74488.getClass(), "sourceName", null);
        setBooleanField(term74488, term74488.getClass(), "isChecked", false);
        setBooleanField(term74488, term74488.getClass(), "visited", false);
        setField(term74488, term74488.getClass(), "docInfo", null);
        setBooleanField(term74488, term74488.getClass(), "unknown", false);
        setBooleanField(term74488, term74488.getClass(), "resolved", false);
        setField(term74488, term74488.getClass(), "resolveResult", null);
        setField(term74488, term74488.getClass(), "registry", null);
        setField(term74487, term74487.getClass(), "implicitPrototypeFallback", term74488);
        setBooleanField(term74487, term74487.getClass(), "prettyPrint", false);
        setBooleanField(term74487, term74487.getClass(), "visited", false);
        setField(term74487, term74487.getClass(), "docInfo", null);
        setBooleanField(term74487, term74487.getClass(), "unknown", false);
        setBooleanField(term74487, term74487.getClass(), "resolved", false);
        setField(term74487, term74487.getClass(), "resolveResult", null);
        setField(term74487, term74487.getClass(), "registry", null);
        setField(term74486, term74486.getClass(), "jsType", term74487);
        setField(term74486, term74486.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term74093;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term74023, args);
        assertTrue(recursiveEquals(term74023, term74485));
        assertTrue(recursiveEquals(term74093, null));
    }

};


