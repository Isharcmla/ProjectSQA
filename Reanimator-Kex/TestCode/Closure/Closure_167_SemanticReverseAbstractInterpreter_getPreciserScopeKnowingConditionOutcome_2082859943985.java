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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387725;
     Object term387817;
     Object term388432;
     Object term388433;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term387725 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term387817 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term387909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term388007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term388099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term388187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term387817, term387817.getClass(), "type", 45);
        setIntField(term387909, term387909.getClass(), "type", -923815092);
        setField(term387909, term387909.getClass(), "jsType", term388007);
        setField(term387817, term387817.getClass(), "first", term387909);
        setIntField(term388099, term388099.getClass(), "type", 1);
        setField(term388099, term388099.getClass(), "jsType", term388187);
        setField(term387817, term387817.getClass(), "last", term388099);
        term388432 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term388432, term388432.getClass(), "INEQ", null);
        setField(term388432, term388432.getClass(), "convention", null);
        setField(term388432, term388432.getClass(), "typeRegistry", null);
        setField(term388432, term388432.getClass(), "firstLink", null);
        setField(term388432, term388432.getClass(), "nextLink", null);
        setField(term388432, term388432.getClass(), "restrictUndefinedVisitor", null);
        setField(term388432, term388432.getClass(), "restrictNullVisitor", null);
        term388433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term388434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term388435 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term388436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term388437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term388433, term388433.getClass(), "str", null);
        setIntField(term388433, term388433.getClass(), "type", 45);
        setField(term388433, term388433.getClass(), "next", null);
        setDoubleField(term388434, term388434.getClass(), "number", 0.0);
        setIntField(term388434, term388434.getClass(), "type", -923815092);
        setField(term388434, term388434.getClass(), "next", null);
        setField(term388434, term388434.getClass(), "first", null);
        setField(term388434, term388434.getClass(), "last", null);
        setField(term388434, term388434.getClass(), "propListHead", null);
        setIntField(term388434, term388434.getClass(), "sourcePosition", 0);
        setBooleanField(term388435, term388435.getClass(), "resolved", false);
        setField(term388435, term388435.getClass(), "resolveResult", null);
        setBooleanField(term388435, term388435.getClass(), "inTemplatedCheckVisit", false);
        setField(term388435, term388435.getClass(), "registry", null);
        setField(term388434, term388434.getClass(), "jsType", term388435);
        setField(term388434, term388434.getClass(), "parent", null);
        setField(term388433, term388433.getClass(), "first", term388434);
        setDoubleField(term388436, term388436.getClass(), "number", 0.0);
        setIntField(term388436, term388436.getClass(), "type", 1);
        setField(term388436, term388436.getClass(), "next", null);
        setField(term388436, term388436.getClass(), "first", null);
        setField(term388436, term388436.getClass(), "last", null);
        setField(term388436, term388436.getClass(), "propListHead", null);
        setIntField(term388436, term388436.getClass(), "sourcePosition", 0);
        setField(term388437, term388437.getClass(), "call", null);
        setField(term388437, term388437.getClass(), "prototypeSlot", null);
        setField(term388437, term388437.getClass(), "kind", null);
        setField(term388437, term388437.getClass(), "typeOfThis", null);
        setField(term388437, term388437.getClass(), "source", null);
        setField(term388437, term388437.getClass(), "implementedInterfaces", null);
        setField(term388437, term388437.getClass(), "extendedInterfaces", null);
        setField(term388437, term388437.getClass(), "subTypes", null);
        setField(term388437, term388437.getClass(), "templateTypeNames", null);
        setField(term388437, term388437.getClass(), "className", null);
        setField(term388437, term388437.getClass(), "properties", null);
        setBooleanField(term388437, term388437.getClass(), "nativeType", false);
        setField(term388437, term388437.getClass(), "implicitPrototypeFallback", null);
        setField(term388437, term388437.getClass(), "ownerFunction", null);
        setBooleanField(term388437, term388437.getClass(), "prettyPrint", false);
        setBooleanField(term388437, term388437.getClass(), "visited", false);
        setField(term388437, term388437.getClass(), "docInfo", null);
        setBooleanField(term388437, term388437.getClass(), "unknown", false);
        setBooleanField(term388437, term388437.getClass(), "resolved", false);
        setField(term388437, term388437.getClass(), "resolveResult", null);
        setBooleanField(term388437, term388437.getClass(), "inTemplatedCheckVisit", false);
        setField(term388437, term388437.getClass(), "registry", null);
        setField(term388436, term388436.getClass(), "jsType", term388437);
        setField(term388436, term388436.getClass(), "parent", null);
        setField(term388433, term388433.getClass(), "last", term388436);
        setField(term388433, term388433.getClass(), "propListHead", null);
        setIntField(term388433, term388433.getClass(), "sourcePosition", 0);
        setField(term388433, term388433.getClass(), "jsType", null);
        setField(term388433, term388433.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term387817;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term387725, args);
        assertTrue(recursiveEquals(term387725, term388432));
        assertTrue(recursiveEquals(term387817, term388433));
        assertTrue(recursiveEquals(retValue, null));
    }

};


