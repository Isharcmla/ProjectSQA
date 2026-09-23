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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74815;
     Object term74907;
     Object term75223;
     Object term75224;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74815 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term74907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74999 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setIntField(term74907, term74907.getClass(), "type", 12);
        setField(term74907, term74907.getClass(), "first", term74907);
        setIntField(term74999, term74999.getClass(), "type", -33554957);
        setField(term74999, term74999.getClass(), "jsType", null);
        setField(term74907, term74907.getClass(), "last", term74999);
        setField(term74907, term74907.getClass(), "jsType", term75091);
        term75223 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term75223, term75223.getClass(), "INEQ", null);
        setField(term75223, term75223.getClass(), "convention", null);
        setField(term75223, term75223.getClass(), "typeRegistry", null);
        setField(term75223, term75223.getClass(), "firstLink", null);
        setField(term75223, term75223.getClass(), "nextLink", null);
        setField(term75223, term75223.getClass(), "restrictUndefinedVisitor", null);
        setField(term75223, term75223.getClass(), "restrictNullVisitor", null);
        term75224 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term75226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setDoubleField(term75224, term75224.getClass(), "number", 0.0);
        setIntField(term75224, term75224.getClass(), "type", 12);
        setField(term75224, term75224.getClass(), "next", null);
        setField(term75224, term75224.getClass(), "first", term75224);
        setDoubleField(term75225, term75225.getClass(), "number", 0.0);
        setIntField(term75225, term75225.getClass(), "type", -33554957);
        setField(term75225, term75225.getClass(), "next", null);
        setField(term75225, term75225.getClass(), "first", null);
        setField(term75225, term75225.getClass(), "last", null);
        setField(term75225, term75225.getClass(), "propListHead", null);
        setIntField(term75225, term75225.getClass(), "sourcePosition", 0);
        setField(term75225, term75225.getClass(), "jsType", null);
        setField(term75225, term75225.getClass(), "parent", null);
        setField(term75224, term75224.getClass(), "last", term75225);
        setField(term75224, term75224.getClass(), "propListHead", null);
        setIntField(term75224, term75224.getClass(), "sourcePosition", 0);
        setBooleanField(term75226, term75226.getClass(), "resolved", false);
        setField(term75226, term75226.getClass(), "resolveResult", null);
        setBooleanField(term75226, term75226.getClass(), "inTemplatedCheckVisit", false);
        setField(term75226, term75226.getClass(), "registry", null);
        setField(term75224, term75224.getClass(), "jsType", term75226);
        setField(term75224, term75224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term74907;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term74815, args);
        assertTrue(recursiveEquals(term74815, term75223));
        assertTrue(recursiveEquals(term74907, term75224));
        assertTrue(recursiveEquals(retValue, null));
    }

};


