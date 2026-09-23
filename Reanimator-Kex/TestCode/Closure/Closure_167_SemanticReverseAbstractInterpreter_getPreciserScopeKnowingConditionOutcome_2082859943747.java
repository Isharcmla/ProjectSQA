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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222089;
     Object term222181;
     Object term222585;
     Object term222586;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222089 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term222181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term222459 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term222181, term222181.getClass(), "type", 46);
        setIntField(term222273, term222273.getClass(), "type", 46);
        setField(term222273, term222273.getClass(), "jsType", term222367);
        setField(term222181, term222181.getClass(), "first", term222273);
        setIntField(term222459, term222459.getClass(), "type", 0);
        setField(term222459, term222459.getClass(), "jsType", null);
        setField(term222181, term222181.getClass(), "last", term222459);
        term222585 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term222585, term222585.getClass(), "INEQ", null);
        setField(term222585, term222585.getClass(), "convention", null);
        setField(term222585, term222585.getClass(), "typeRegistry", null);
        setField(term222585, term222585.getClass(), "firstLink", null);
        setField(term222585, term222585.getClass(), "nextLink", null);
        setField(term222585, term222585.getClass(), "restrictUndefinedVisitor", null);
        setField(term222585, term222585.getClass(), "restrictNullVisitor", null);
        term222586 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222587 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term222588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term222589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term222586, term222586.getClass(), "str", null);
        setIntField(term222586, term222586.getClass(), "type", 46);
        setField(term222586, term222586.getClass(), "next", null);
        setField(term222587, term222587.getClass(), "str", null);
        setIntField(term222587, term222587.getClass(), "type", 46);
        setField(term222587, term222587.getClass(), "next", null);
        setField(term222587, term222587.getClass(), "first", null);
        setField(term222587, term222587.getClass(), "last", null);
        setField(term222587, term222587.getClass(), "propListHead", null);
        setIntField(term222587, term222587.getClass(), "sourcePosition", 0);
        setField(term222588, term222588.getClass(), "reference", null);
        setField(term222588, term222588.getClass(), "sourceName", null);
        setIntField(term222588, term222588.getClass(), "lineno", 0);
        setIntField(term222588, term222588.getClass(), "charno", 0);
        setField(term222588, term222588.getClass(), "validator", null);
        setField(term222588, term222588.getClass(), "propertyContinuations", null);
        setField(term222588, term222588.getClass(), "referencedType", null);
        setField(term222588, term222588.getClass(), "referencedObjType", null);
        setBooleanField(term222588, term222588.getClass(), "visited", false);
        setField(term222588, term222588.getClass(), "docInfo", null);
        setBooleanField(term222588, term222588.getClass(), "unknown", false);
        setBooleanField(term222588, term222588.getClass(), "resolved", false);
        setField(term222588, term222588.getClass(), "resolveResult", null);
        setBooleanField(term222588, term222588.getClass(), "inTemplatedCheckVisit", false);
        setField(term222588, term222588.getClass(), "registry", null);
        setField(term222587, term222587.getClass(), "jsType", term222588);
        setField(term222587, term222587.getClass(), "parent", null);
        setField(term222586, term222586.getClass(), "first", term222587);
        setDoubleField(term222589, term222589.getClass(), "number", 0.0);
        setIntField(term222589, term222589.getClass(), "type", 0);
        setField(term222589, term222589.getClass(), "next", null);
        setField(term222589, term222589.getClass(), "first", null);
        setField(term222589, term222589.getClass(), "last", null);
        setField(term222589, term222589.getClass(), "propListHead", null);
        setIntField(term222589, term222589.getClass(), "sourcePosition", 0);
        setField(term222589, term222589.getClass(), "jsType", null);
        setField(term222589, term222589.getClass(), "parent", null);
        setField(term222586, term222586.getClass(), "last", term222589);
        setField(term222586, term222586.getClass(), "propListHead", null);
        setIntField(term222586, term222586.getClass(), "sourcePosition", 0);
        setField(term222586, term222586.getClass(), "jsType", null);
        setField(term222586, term222586.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term222181;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term222089, args);
        assertTrue(recursiveEquals(term222089, term222585));
        assertTrue(recursiveEquals(term222181, term222586));
        assertTrue(recursiveEquals(retValue, null));
    }

};


