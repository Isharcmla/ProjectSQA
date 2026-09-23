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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175398;
     Object term175490;
     Object term176184;
     Object term176185;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175398 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term175490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175582 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175674 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term175766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        Object term175858 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term175948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term175490, term175490.getClass(), "type", 111);
        setIntField(term175674, term175674.getClass(), "type", 0);
        setField(term175674, term175674.getClass(), "jsType", term175766);
        setField(term175582, term175582.getClass(), "first", term175674);
        setField(term175490, term175490.getClass(), "parent", term175582);
        setIntField(term175858, term175858.getClass(), "type", -201326593);
        setField(term175858, term175858.getClass(), "jsType", term175948);
        setField(term175490, term175490.getClass(), "first", term175858);
        term176184 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term176184, term176184.getClass(), "INEQ", null);
        setField(term176184, term176184.getClass(), "convention", null);
        setField(term176184, term176184.getClass(), "typeRegistry", null);
        setField(term176184, term176184.getClass(), "firstLink", null);
        setField(term176184, term176184.getClass(), "nextLink", null);
        setField(term176184, term176184.getClass(), "restrictUndefinedVisitor", null);
        setField(term176184, term176184.getClass(), "restrictNullVisitor", null);
        term176185 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term176186 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term176187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        Object term176188 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term176189 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term176190 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term176185, term176185.getClass(), "str", null);
        setIntField(term176185, term176185.getClass(), "type", 111);
        setField(term176185, term176185.getClass(), "next", null);
        setField(term176186, term176186.getClass(), "str", null);
        setIntField(term176186, term176186.getClass(), "type", -201326593);
        setField(term176186, term176186.getClass(), "next", null);
        setField(term176186, term176186.getClass(), "first", null);
        setField(term176186, term176186.getClass(), "last", null);
        setField(term176186, term176186.getClass(), "propListHead", null);
        setIntField(term176186, term176186.getClass(), "sourcePosition", 0);
        setBooleanField(term176187, term176187.getClass(), "resolved", false);
        setField(term176187, term176187.getClass(), "resolveResult", null);
        setBooleanField(term176187, term176187.getClass(), "inTemplatedCheckVisit", false);
        setField(term176187, term176187.getClass(), "registry", null);
        setField(term176186, term176186.getClass(), "jsType", term176187);
        setField(term176186, term176186.getClass(), "parent", null);
        setField(term176185, term176185.getClass(), "first", term176186);
        setField(term176185, term176185.getClass(), "last", null);
        setField(term176185, term176185.getClass(), "propListHead", null);
        setIntField(term176185, term176185.getClass(), "sourcePosition", 0);
        setField(term176185, term176185.getClass(), "jsType", null);
        setField(term176188, term176188.getClass(), "str", null);
        setIntField(term176188, term176188.getClass(), "type", 0);
        setField(term176188, term176188.getClass(), "next", null);
        setDoubleField(term176189, term176189.getClass(), "number", 0.0);
        setIntField(term176189, term176189.getClass(), "type", 0);
        setField(term176189, term176189.getClass(), "next", null);
        setField(term176189, term176189.getClass(), "first", null);
        setField(term176189, term176189.getClass(), "last", null);
        setField(term176189, term176189.getClass(), "propListHead", null);
        setIntField(term176189, term176189.getClass(), "sourcePosition", 0);
        setField(term176190, term176190.getClass(), "source", null);
        setField(term176190, term176190.getClass(), "elementsType", null);
        setField(term176190, term176190.getClass(), "elements", null);
        setField(term176190, term176190.getClass(), "className", null);
        setField(term176190, term176190.getClass(), "properties", null);
        setBooleanField(term176190, term176190.getClass(), "nativeType", false);
        setField(term176190, term176190.getClass(), "implicitPrototypeFallback", null);
        setField(term176190, term176190.getClass(), "ownerFunction", null);
        setBooleanField(term176190, term176190.getClass(), "prettyPrint", false);
        setBooleanField(term176190, term176190.getClass(), "visited", false);
        setField(term176190, term176190.getClass(), "docInfo", null);
        setBooleanField(term176190, term176190.getClass(), "unknown", false);
        setBooleanField(term176190, term176190.getClass(), "resolved", false);
        setField(term176190, term176190.getClass(), "resolveResult", null);
        setBooleanField(term176190, term176190.getClass(), "inTemplatedCheckVisit", false);
        setField(term176190, term176190.getClass(), "registry", null);
        setField(term176189, term176189.getClass(), "jsType", term176190);
        setField(term176189, term176189.getClass(), "parent", null);
        setField(term176188, term176188.getClass(), "first", term176189);
        setField(term176188, term176188.getClass(), "last", null);
        setField(term176188, term176188.getClass(), "propListHead", null);
        setIntField(term176188, term176188.getClass(), "sourcePosition", 0);
        setField(term176188, term176188.getClass(), "jsType", null);
        setField(term176188, term176188.getClass(), "parent", null);
        setField(term176185, term176185.getClass(), "parent", term176188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term175490;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term175398, args);
        assertTrue(recursiveEquals(term175398, term176184));
        assertTrue(recursiveEquals(term175490, term176185));
        assertTrue(recursiveEquals(retValue, null));
    }

};


