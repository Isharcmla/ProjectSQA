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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163504;
     Object term163596;
     Object term164254;
     Object term164255;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163504 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term163596 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term163688 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term163758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term163596, term163596.getClass(), "type", 12);
        setIntField(term163688, term163688.getClass(), "type", -13);
        setField(term163596, term163596.getClass(), "first", term163688);
        setIntField(term163758, term163758.getClass(), "type", 12);
        setField(term163596, term163596.getClass(), "last", term163758);
        term164254 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term164254, term164254.getClass(), "INEQ", null);
        setField(term164254, term164254.getClass(), "convention", null);
        setField(term164254, term164254.getClass(), "typeRegistry", null);
        setField(term164254, term164254.getClass(), "firstLink", null);
        setField(term164254, term164254.getClass(), "nextLink", null);
        setField(term164254, term164254.getClass(), "restrictUndefinedVisitor", null);
        setField(term164254, term164254.getClass(), "restrictNullVisitor", null);
        term164255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164256 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term164257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term164255, term164255.getClass(), "number", 0.0);
        setIntField(term164255, term164255.getClass(), "type", 12);
        setField(term164255, term164255.getClass(), "next", null);
        setField(term164256, term164256.getClass(), "str", null);
        setIntField(term164256, term164256.getClass(), "type", -13);
        setField(term164256, term164256.getClass(), "next", null);
        setField(term164256, term164256.getClass(), "first", null);
        setField(term164256, term164256.getClass(), "last", null);
        setField(term164256, term164256.getClass(), "propListHead", null);
        setIntField(term164256, term164256.getClass(), "sourcePosition", 0);
        setField(term164256, term164256.getClass(), "jsType", null);
        setField(term164256, term164256.getClass(), "parent", null);
        setField(term164255, term164255.getClass(), "first", term164256);
        setIntField(term164257, term164257.getClass(), "type", 12);
        setField(term164257, term164257.getClass(), "next", null);
        setField(term164257, term164257.getClass(), "first", null);
        setField(term164257, term164257.getClass(), "last", null);
        setField(term164257, term164257.getClass(), "propListHead", null);
        setIntField(term164257, term164257.getClass(), "sourcePosition", 0);
        setField(term164257, term164257.getClass(), "jsType", null);
        setField(term164257, term164257.getClass(), "parent", null);
        setField(term164255, term164255.getClass(), "last", term164257);
        setField(term164255, term164255.getClass(), "propListHead", null);
        setIntField(term164255, term164255.getClass(), "sourcePosition", 0);
        setField(term164255, term164255.getClass(), "jsType", null);
        setField(term164255, term164255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term163596;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term163504, args);
        assertTrue(recursiveEquals(term163504, term164254));
        assertTrue(recursiveEquals(term163596, term164255));
        assertTrue(recursiveEquals(retValue, null));
    }

};


