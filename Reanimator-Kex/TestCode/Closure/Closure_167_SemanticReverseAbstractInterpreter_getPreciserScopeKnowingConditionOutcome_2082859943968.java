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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378306;
     Object term378398;
     Object term379682;
     Object term379683;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378306 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term378398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term378490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term378586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term378678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term378768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setIntField(term378398, term378398.getClass(), "type", 12);
        setIntField(term378490, term378490.getClass(), "type", 0);
        setField(term378490, term378490.getClass(), "jsType", term378586);
        setField(term378398, term378398.getClass(), "first", term378490);
        setIntField(term378678, term378678.getClass(), "type", 12);
        setField(term378678, term378678.getClass(), "jsType", term378768);
        setField(term378398, term378398.getClass(), "last", term378678);
        term379682 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term379682, term379682.getClass(), "INEQ", null);
        setField(term379682, term379682.getClass(), "convention", null);
        setField(term379682, term379682.getClass(), "typeRegistry", null);
        setField(term379682, term379682.getClass(), "firstLink", null);
        setField(term379682, term379682.getClass(), "nextLink", null);
        setField(term379682, term379682.getClass(), "restrictUndefinedVisitor", null);
        setField(term379682, term379682.getClass(), "restrictNullVisitor", null);
        term379683 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term379684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term379685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term379686 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term379687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setDoubleField(term379683, term379683.getClass(), "number", 0.0);
        setIntField(term379683, term379683.getClass(), "type", 12);
        setField(term379683, term379683.getClass(), "next", null);
        setField(term379684, term379684.getClass(), "str", null);
        setIntField(term379684, term379684.getClass(), "type", 0);
        setField(term379684, term379684.getClass(), "next", null);
        setField(term379684, term379684.getClass(), "first", null);
        setField(term379684, term379684.getClass(), "last", null);
        setField(term379684, term379684.getClass(), "propListHead", null);
        setIntField(term379684, term379684.getClass(), "sourcePosition", 0);
        setField(term379685, term379685.getClass(), "properties", null);
        setBooleanField(term379685, term379685.getClass(), "declared", false);
        setBooleanField(term379685, term379685.getClass(), "isFrozen", false);
        setField(term379685, term379685.getClass(), "className", null);
        setField(term379685, term379685.getClass(), "properties", null);
        setBooleanField(term379685, term379685.getClass(), "nativeType", false);
        setField(term379685, term379685.getClass(), "implicitPrototypeFallback", null);
        setField(term379685, term379685.getClass(), "ownerFunction", null);
        setBooleanField(term379685, term379685.getClass(), "prettyPrint", false);
        setBooleanField(term379685, term379685.getClass(), "visited", false);
        setField(term379685, term379685.getClass(), "docInfo", null);
        setBooleanField(term379685, term379685.getClass(), "unknown", false);
        setBooleanField(term379685, term379685.getClass(), "resolved", false);
        setField(term379685, term379685.getClass(), "resolveResult", null);
        setBooleanField(term379685, term379685.getClass(), "inTemplatedCheckVisit", false);
        setField(term379685, term379685.getClass(), "registry", null);
        setField(term379684, term379684.getClass(), "jsType", term379685);
        setField(term379684, term379684.getClass(), "parent", null);
        setField(term379683, term379683.getClass(), "first", term379684);
        setDoubleField(term379686, term379686.getClass(), "number", 0.0);
        setIntField(term379686, term379686.getClass(), "type", 12);
        setField(term379686, term379686.getClass(), "next", null);
        setField(term379686, term379686.getClass(), "first", null);
        setField(term379686, term379686.getClass(), "last", null);
        setField(term379686, term379686.getClass(), "propListHead", null);
        setIntField(term379686, term379686.getClass(), "sourcePosition", 0);
        setBooleanField(term379687, term379687.getClass(), "resolved", false);
        setField(term379687, term379687.getClass(), "resolveResult", null);
        setBooleanField(term379687, term379687.getClass(), "inTemplatedCheckVisit", false);
        setField(term379687, term379687.getClass(), "registry", null);
        setField(term379686, term379686.getClass(), "jsType", term379687);
        setField(term379686, term379686.getClass(), "parent", null);
        setField(term379683, term379683.getClass(), "last", term379686);
        setField(term379683, term379683.getClass(), "propListHead", null);
        setIntField(term379683, term379683.getClass(), "sourcePosition", 0);
        setField(term379683, term379683.getClass(), "jsType", null);
        setField(term379683, term379683.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term378398;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term378306, args);
        assertTrue(recursiveEquals(term378306, term379682));
        assertTrue(recursiveEquals(term378398, term379683));
        assertTrue(recursiveEquals(retValue, null));
    }

};


