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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119807;
     Object term119899;
     Object term122723;
     Object term122724;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119807 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term119899 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119991 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term120197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term120289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term119899, term119899.getClass(), "type", 111);
        setIntField(term120083, term120083.getClass(), "type", 111);
        setField(term120083, term120083.getClass(), "jsType", term120197);
        setField(term119991, term119991.getClass(), "first", term120083);
        setField(term119899, term119899.getClass(), "parent", term119991);
        setIntField(term120289, term120289.getClass(), "type", 111);
        setField(term119899, term119899.getClass(), "first", term120289);
        term122723 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term122723, term122723.getClass(), "INEQ", null);
        setField(term122723, term122723.getClass(), "convention", null);
        setField(term122723, term122723.getClass(), "typeRegistry", null);
        setField(term122723, term122723.getClass(), "firstLink", null);
        setField(term122723, term122723.getClass(), "nextLink", null);
        setField(term122723, term122723.getClass(), "restrictUndefinedVisitor", null);
        setField(term122723, term122723.getClass(), "restrictNullVisitor", null);
        term122724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122725 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122727 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term122728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term122724, term122724.getClass(), "str", null);
        setIntField(term122724, term122724.getClass(), "type", 111);
        setField(term122724, term122724.getClass(), "next", null);
        setField(term122725, term122725.getClass(), "str", null);
        setIntField(term122725, term122725.getClass(), "type", 111);
        setField(term122725, term122725.getClass(), "next", null);
        setField(term122725, term122725.getClass(), "first", null);
        setField(term122725, term122725.getClass(), "last", null);
        setField(term122725, term122725.getClass(), "propListHead", null);
        setIntField(term122725, term122725.getClass(), "sourcePosition", 0);
        setField(term122725, term122725.getClass(), "jsType", null);
        setField(term122725, term122725.getClass(), "parent", null);
        setField(term122724, term122724.getClass(), "first", term122725);
        setField(term122724, term122724.getClass(), "last", null);
        setField(term122724, term122724.getClass(), "propListHead", null);
        setIntField(term122724, term122724.getClass(), "sourcePosition", 0);
        setField(term122724, term122724.getClass(), "jsType", null);
        setField(term122726, term122726.getClass(), "str", null);
        setIntField(term122726, term122726.getClass(), "type", 0);
        setField(term122726, term122726.getClass(), "next", null);
        setField(term122727, term122727.getClass(), "str", null);
        setIntField(term122727, term122727.getClass(), "type", 111);
        setField(term122727, term122727.getClass(), "next", null);
        setField(term122727, term122727.getClass(), "first", null);
        setField(term122727, term122727.getClass(), "last", null);
        setField(term122727, term122727.getClass(), "propListHead", null);
        setIntField(term122727, term122727.getClass(), "sourcePosition", 0);
        setField(term122728, term122728.getClass(), "className", null);
        setField(term122728, term122728.getClass(), "properties", null);
        setBooleanField(term122728, term122728.getClass(), "nativeType", false);
        setField(term122728, term122728.getClass(), "implicitPrototypeFallback", null);
        setField(term122728, term122728.getClass(), "ownerFunction", null);
        setBooleanField(term122728, term122728.getClass(), "prettyPrint", false);
        setBooleanField(term122728, term122728.getClass(), "visited", false);
        setField(term122728, term122728.getClass(), "docInfo", null);
        setBooleanField(term122728, term122728.getClass(), "unknown", false);
        setBooleanField(term122728, term122728.getClass(), "resolved", false);
        setField(term122728, term122728.getClass(), "resolveResult", null);
        setBooleanField(term122728, term122728.getClass(), "inTemplatedCheckVisit", false);
        setField(term122728, term122728.getClass(), "registry", null);
        setField(term122727, term122727.getClass(), "jsType", term122728);
        setField(term122727, term122727.getClass(), "parent", null);
        setField(term122726, term122726.getClass(), "first", term122727);
        setField(term122726, term122726.getClass(), "last", null);
        setField(term122726, term122726.getClass(), "propListHead", null);
        setIntField(term122726, term122726.getClass(), "sourcePosition", 0);
        setField(term122726, term122726.getClass(), "jsType", null);
        setField(term122726, term122726.getClass(), "parent", null);
        setField(term122724, term122724.getClass(), "parent", term122726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term119899;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term119807, args);
        assertTrue(recursiveEquals(term119807, term122723));
        assertTrue(recursiveEquals(term119899, term122724));
        assertTrue(recursiveEquals(retValue, null));
    }

};


