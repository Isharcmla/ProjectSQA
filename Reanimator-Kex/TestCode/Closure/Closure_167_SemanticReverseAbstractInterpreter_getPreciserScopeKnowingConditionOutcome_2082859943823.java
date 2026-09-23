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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252562;
     Object term252654;
     Object term252973;
     Object term252974;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252562 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term252654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252746 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term252654, term252654.getClass(), "type", 45);
        setField(term252654, term252654.getClass(), "first", term252654);
        setIntField(term252746, term252746.getClass(), "type", -33554990);
        setField(term252746, term252746.getClass(), "jsType", null);
        setField(term252654, term252654.getClass(), "last", term252746);
        setField(term252654, term252654.getClass(), "jsType", term252846);
        term252973 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term252973, term252973.getClass(), "INEQ", null);
        setField(term252973, term252973.getClass(), "convention", null);
        setField(term252973, term252973.getClass(), "typeRegistry", null);
        setField(term252973, term252973.getClass(), "firstLink", null);
        setField(term252973, term252973.getClass(), "nextLink", null);
        setField(term252973, term252973.getClass(), "restrictUndefinedVisitor", null);
        setField(term252973, term252973.getClass(), "restrictNullVisitor", null);
        term252974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252975 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term252976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term252974, term252974.getClass(), "str", null);
        setIntField(term252974, term252974.getClass(), "type", 45);
        setField(term252974, term252974.getClass(), "next", null);
        setField(term252974, term252974.getClass(), "first", term252974);
        setField(term252975, term252975.getClass(), "str", null);
        setIntField(term252975, term252975.getClass(), "type", -33554990);
        setField(term252975, term252975.getClass(), "next", null);
        setField(term252975, term252975.getClass(), "first", null);
        setField(term252975, term252975.getClass(), "last", null);
        setField(term252975, term252975.getClass(), "propListHead", null);
        setIntField(term252975, term252975.getClass(), "sourcePosition", 0);
        setField(term252975, term252975.getClass(), "jsType", null);
        setField(term252975, term252975.getClass(), "parent", null);
        setField(term252974, term252974.getClass(), "last", term252975);
        setField(term252974, term252974.getClass(), "propListHead", null);
        setIntField(term252974, term252974.getClass(), "sourcePosition", 0);
        setField(term252976, term252976.getClass(), "call", null);
        setField(term252976, term252976.getClass(), "prototypeSlot", null);
        setField(term252976, term252976.getClass(), "kind", null);
        setField(term252976, term252976.getClass(), "typeOfThis", null);
        setField(term252976, term252976.getClass(), "source", null);
        setField(term252976, term252976.getClass(), "implementedInterfaces", null);
        setField(term252976, term252976.getClass(), "extendedInterfaces", null);
        setField(term252976, term252976.getClass(), "subTypes", null);
        setField(term252976, term252976.getClass(), "templateTypeNames", null);
        setField(term252976, term252976.getClass(), "className", null);
        setField(term252976, term252976.getClass(), "properties", null);
        setBooleanField(term252976, term252976.getClass(), "nativeType", false);
        setField(term252976, term252976.getClass(), "implicitPrototypeFallback", null);
        setField(term252976, term252976.getClass(), "ownerFunction", null);
        setBooleanField(term252976, term252976.getClass(), "prettyPrint", false);
        setBooleanField(term252976, term252976.getClass(), "visited", false);
        setField(term252976, term252976.getClass(), "docInfo", null);
        setBooleanField(term252976, term252976.getClass(), "unknown", false);
        setBooleanField(term252976, term252976.getClass(), "resolved", false);
        setField(term252976, term252976.getClass(), "resolveResult", null);
        setBooleanField(term252976, term252976.getClass(), "inTemplatedCheckVisit", false);
        setField(term252976, term252976.getClass(), "registry", null);
        setField(term252974, term252974.getClass(), "jsType", term252976);
        setField(term252974, term252974.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term252654;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term252562, args);
        assertTrue(recursiveEquals(term252562, term252973));
        assertTrue(recursiveEquals(term252654, term252974));
        assertTrue(recursiveEquals(retValue, null));
    }

};


