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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_caseEquality_49513328274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14123;
     Object term14193;
     Object term14559;

    public SemanticReverseAbstractInterpreter_caseEquality_49513328274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14123 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term14193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14363 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term14433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14263, term14263.getClass(), "type", 0);
        setField(term14263, term14263.getClass(), "jsType", term14363);
        setField(term14193, term14193.getClass(), "first", term14263);
        setIntField(term14433, term14433.getClass(), "type", 0);
        setField(term14433, term14433.getClass(), "jsType", null);
        setField(term14193, term14193.getClass(), "last", term14433);
        term14559 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$FlowScopeJoinOp"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = Class.forName("com.google.common.base.Function");
        Object[] args = new Object[3];
        args[0] = term14193;
        args[1] = null;
        args[2] = term14559;
        try {
            callMethod(klass, "caseEquality", argTypes, term14123, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


