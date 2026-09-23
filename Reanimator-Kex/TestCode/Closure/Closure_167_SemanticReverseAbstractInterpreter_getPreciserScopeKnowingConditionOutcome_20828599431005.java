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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407880;
     Object term407972;
     Object term408472;
     Object term408473;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407880 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term407972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term408064 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term408188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term408280 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term407972, term407972.getClass(), "type", 46);
        setIntField(term408064, term408064.getClass(), "type", 1401358867);
        setField(term408064, term408064.getClass(), "jsType", term408188);
        setField(term407972, term407972.getClass(), "first", term408064);
        setIntField(term408280, term408280.getClass(), "type", -1401400116);
        setField(term408280, term408280.getClass(), "jsType", term408188);
        setField(term407972, term407972.getClass(), "last", term408280);
        term408472 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term408472, term408472.getClass(), "INEQ", null);
        setField(term408472, term408472.getClass(), "convention", null);
        setField(term408472, term408472.getClass(), "typeRegistry", null);
        setField(term408472, term408472.getClass(), "firstLink", null);
        setField(term408472, term408472.getClass(), "nextLink", null);
        setField(term408472, term408472.getClass(), "restrictUndefinedVisitor", null);
        setField(term408472, term408472.getClass(), "restrictNullVisitor", null);
        term408473 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term408474 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term408475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term408476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term408473, term408473.getClass(), "str", null);
        setIntField(term408473, term408473.getClass(), "type", 46);
        setField(term408473, term408473.getClass(), "next", null);
        setDoubleField(term408474, term408474.getClass(), "number", 0.0);
        setIntField(term408474, term408474.getClass(), "type", 1401358867);
        setField(term408474, term408474.getClass(), "next", null);
        setField(term408474, term408474.getClass(), "first", null);
        setField(term408474, term408474.getClass(), "last", null);
        setField(term408474, term408474.getClass(), "propListHead", null);
        setIntField(term408474, term408474.getClass(), "sourcePosition", 0);
        setField(term408475, term408475.getClass(), "typeExpr", null);
        setField(term408475, term408475.getClass(), "sourceName", null);
        setBooleanField(term408475, term408475.getClass(), "isChecked", false);
        setBooleanField(term408475, term408475.getClass(), "visited", false);
        setField(term408475, term408475.getClass(), "docInfo", null);
        setBooleanField(term408475, term408475.getClass(), "unknown", false);
        setBooleanField(term408475, term408475.getClass(), "resolved", false);
        setField(term408475, term408475.getClass(), "resolveResult", null);
        setBooleanField(term408475, term408475.getClass(), "inTemplatedCheckVisit", false);
        setField(term408475, term408475.getClass(), "registry", null);
        setField(term408474, term408474.getClass(), "jsType", term408475);
        setField(term408474, term408474.getClass(), "parent", null);
        setField(term408473, term408473.getClass(), "first", term408474);
        setDoubleField(term408476, term408476.getClass(), "number", 0.0);
        setIntField(term408476, term408476.getClass(), "type", -1401400116);
        setField(term408476, term408476.getClass(), "next", null);
        setField(term408476, term408476.getClass(), "first", null);
        setField(term408476, term408476.getClass(), "last", null);
        setField(term408476, term408476.getClass(), "propListHead", null);
        setIntField(term408476, term408476.getClass(), "sourcePosition", 0);
        setField(term408476, term408476.getClass(), "jsType", term408475);
        setField(term408476, term408476.getClass(), "parent", null);
        setField(term408473, term408473.getClass(), "last", term408476);
        setField(term408473, term408473.getClass(), "propListHead", null);
        setIntField(term408473, term408473.getClass(), "sourcePosition", 0);
        setField(term408473, term408473.getClass(), "jsType", null);
        setField(term408473, term408473.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term407972;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term407880, args);
        assertTrue(recursiveEquals(term407880, term408472));
        assertTrue(recursiveEquals(term407972, term408473));
        assertTrue(recursiveEquals(retValue, null));
    }

};


