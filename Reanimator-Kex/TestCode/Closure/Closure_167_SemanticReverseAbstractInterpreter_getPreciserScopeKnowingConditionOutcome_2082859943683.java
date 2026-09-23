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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197873;
     Object term197965;
     Object term198292;
     Object term198293;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197873 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term197965 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198057 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setIntField(term197965, term197965.getClass(), "type", 46);
        setField(term197965, term197965.getClass(), "first", term197965);
        setIntField(term198057, term198057.getClass(), "type", -33554991);
        setField(term198057, term198057.getClass(), "jsType", null);
        setField(term197965, term197965.getClass(), "last", term198057);
        setField(term197965, term197965.getClass(), "jsType", term198165);
        term198292 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term198292, term198292.getClass(), "INEQ", null);
        setField(term198292, term198292.getClass(), "convention", null);
        setField(term198292, term198292.getClass(), "typeRegistry", null);
        setField(term198292, term198292.getClass(), "firstLink", null);
        setField(term198292, term198292.getClass(), "nextLink", null);
        setField(term198292, term198292.getClass(), "restrictUndefinedVisitor", null);
        setField(term198292, term198292.getClass(), "restrictNullVisitor", null);
        term198293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term198295 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term198293, term198293.getClass(), "str", null);
        setIntField(term198293, term198293.getClass(), "type", 46);
        setField(term198293, term198293.getClass(), "next", null);
        setField(term198293, term198293.getClass(), "first", term198293);
        setField(term198294, term198294.getClass(), "str", null);
        setIntField(term198294, term198294.getClass(), "type", -33554991);
        setField(term198294, term198294.getClass(), "next", null);
        setField(term198294, term198294.getClass(), "first", null);
        setField(term198294, term198294.getClass(), "last", null);
        setField(term198294, term198294.getClass(), "propListHead", null);
        setIntField(term198294, term198294.getClass(), "sourcePosition", 0);
        setField(term198294, term198294.getClass(), "jsType", null);
        setField(term198294, term198294.getClass(), "parent", null);
        setField(term198293, term198293.getClass(), "last", term198294);
        setField(term198293, term198293.getClass(), "propListHead", null);
        setIntField(term198293, term198293.getClass(), "sourcePosition", 0);
        setField(term198295, term198295.getClass(), "this$0", null);
        setField(term198295, term198295.getClass(), "call", null);
        setField(term198295, term198295.getClass(), "prototypeSlot", null);
        setField(term198295, term198295.getClass(), "kind", null);
        setField(term198295, term198295.getClass(), "typeOfThis", null);
        setField(term198295, term198295.getClass(), "source", null);
        setField(term198295, term198295.getClass(), "implementedInterfaces", null);
        setField(term198295, term198295.getClass(), "extendedInterfaces", null);
        setField(term198295, term198295.getClass(), "subTypes", null);
        setField(term198295, term198295.getClass(), "templateTypeNames", null);
        setField(term198295, term198295.getClass(), "className", null);
        setField(term198295, term198295.getClass(), "properties", null);
        setBooleanField(term198295, term198295.getClass(), "nativeType", false);
        setField(term198295, term198295.getClass(), "implicitPrototypeFallback", null);
        setField(term198295, term198295.getClass(), "ownerFunction", null);
        setBooleanField(term198295, term198295.getClass(), "prettyPrint", false);
        setBooleanField(term198295, term198295.getClass(), "visited", false);
        setField(term198295, term198295.getClass(), "docInfo", null);
        setBooleanField(term198295, term198295.getClass(), "unknown", false);
        setBooleanField(term198295, term198295.getClass(), "resolved", false);
        setField(term198295, term198295.getClass(), "resolveResult", null);
        setBooleanField(term198295, term198295.getClass(), "inTemplatedCheckVisit", false);
        setField(term198295, term198295.getClass(), "registry", null);
        setField(term198293, term198293.getClass(), "jsType", term198295);
        setField(term198293, term198293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term197965;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term197873, args);
        assertTrue(recursiveEquals(term197873, term198292));
        assertTrue(recursiveEquals(term197965, term198293));
        assertTrue(recursiveEquals(retValue, null));
    }

};


