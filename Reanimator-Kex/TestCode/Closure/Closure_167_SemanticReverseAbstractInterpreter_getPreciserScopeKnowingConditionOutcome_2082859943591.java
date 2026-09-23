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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165687;
     Object term165779;
     Object term166444;
     Object term166445;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165687 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term165779 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term165871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term165995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term166087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term165779, term165779.getClass(), "type", 46);
        setIntField(term165871, term165871.getClass(), "type", 0);
        setField(term165871, term165871.getClass(), "jsType", term165995);
        setField(term165779, term165779.getClass(), "first", term165871);
        setIntField(term166087, term166087.getClass(), "type", 0);
        setField(term166087, term166087.getClass(), "jsType", term166211);
        setField(term165779, term165779.getClass(), "last", term166087);
        term166444 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term166444, term166444.getClass(), "INEQ", null);
        setField(term166444, term166444.getClass(), "convention", null);
        setField(term166444, term166444.getClass(), "typeRegistry", null);
        setField(term166444, term166444.getClass(), "firstLink", null);
        setField(term166444, term166444.getClass(), "nextLink", null);
        setField(term166444, term166444.getClass(), "restrictUndefinedVisitor", null);
        setField(term166444, term166444.getClass(), "restrictNullVisitor", null);
        term166445 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term166446 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term166447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term166448 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term166449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term166445, term166445.getClass(), "str", null);
        setIntField(term166445, term166445.getClass(), "type", 46);
        setField(term166445, term166445.getClass(), "next", null);
        setField(term166446, term166446.getClass(), "str", null);
        setIntField(term166446, term166446.getClass(), "type", 0);
        setField(term166446, term166446.getClass(), "next", null);
        setField(term166446, term166446.getClass(), "first", null);
        setField(term166446, term166446.getClass(), "last", null);
        setField(term166446, term166446.getClass(), "propListHead", null);
        setIntField(term166446, term166446.getClass(), "sourcePosition", 0);
        setField(term166447, term166447.getClass(), "typeExpr", null);
        setField(term166447, term166447.getClass(), "sourceName", null);
        setBooleanField(term166447, term166447.getClass(), "isChecked", false);
        setBooleanField(term166447, term166447.getClass(), "visited", false);
        setField(term166447, term166447.getClass(), "docInfo", null);
        setBooleanField(term166447, term166447.getClass(), "unknown", false);
        setBooleanField(term166447, term166447.getClass(), "resolved", false);
        setField(term166447, term166447.getClass(), "resolveResult", null);
        setBooleanField(term166447, term166447.getClass(), "inTemplatedCheckVisit", false);
        setField(term166447, term166447.getClass(), "registry", null);
        setField(term166446, term166446.getClass(), "jsType", term166447);
        setField(term166446, term166446.getClass(), "parent", null);
        setField(term166445, term166445.getClass(), "first", term166446);
        setDoubleField(term166448, term166448.getClass(), "number", 0.0);
        setIntField(term166448, term166448.getClass(), "type", 0);
        setField(term166448, term166448.getClass(), "next", null);
        setField(term166448, term166448.getClass(), "first", null);
        setField(term166448, term166448.getClass(), "last", null);
        setField(term166448, term166448.getClass(), "propListHead", null);
        setIntField(term166448, term166448.getClass(), "sourcePosition", 0);
        setField(term166449, term166449.getClass(), "typeExpr", null);
        setField(term166449, term166449.getClass(), "sourceName", null);
        setBooleanField(term166449, term166449.getClass(), "isChecked", false);
        setBooleanField(term166449, term166449.getClass(), "visited", false);
        setField(term166449, term166449.getClass(), "docInfo", null);
        setBooleanField(term166449, term166449.getClass(), "unknown", false);
        setBooleanField(term166449, term166449.getClass(), "resolved", false);
        setField(term166449, term166449.getClass(), "resolveResult", null);
        setBooleanField(term166449, term166449.getClass(), "inTemplatedCheckVisit", false);
        setField(term166449, term166449.getClass(), "registry", null);
        setField(term166448, term166448.getClass(), "jsType", term166449);
        setField(term166448, term166448.getClass(), "parent", null);
        setField(term166445, term166445.getClass(), "last", term166448);
        setField(term166445, term166445.getClass(), "propListHead", null);
        setIntField(term166445, term166445.getClass(), "sourcePosition", 0);
        setField(term166445, term166445.getClass(), "jsType", null);
        setField(term166445, term166445.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term165779;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term165687, args);
        assertTrue(recursiveEquals(term165687, term166444));
        assertTrue(recursiveEquals(term165779, term166445));
        assertTrue(recursiveEquals(retValue, null));
    }

};


