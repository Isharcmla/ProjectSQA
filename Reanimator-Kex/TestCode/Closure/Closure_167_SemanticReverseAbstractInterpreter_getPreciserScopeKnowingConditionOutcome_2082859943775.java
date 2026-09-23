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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232561;
     Object term232653;
     Object term233296;
     Object term233297;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232561 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term232653 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term232869 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term232961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setIntField(term232653, term232653.getClass(), "type", 45);
        setIntField(term232745, term232745.getClass(), "type", 0);
        setField(term232745, term232745.getClass(), "jsType", term232869);
        setField(term232653, term232653.getClass(), "first", term232745);
        setIntField(term232961, term232961.getClass(), "type", 0);
        setField(term232961, term232961.getClass(), "jsType", term233061);
        setField(term232653, term232653.getClass(), "last", term232961);
        term233296 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term233296, term233296.getClass(), "INEQ", null);
        setField(term233296, term233296.getClass(), "convention", null);
        setField(term233296, term233296.getClass(), "typeRegistry", null);
        setField(term233296, term233296.getClass(), "firstLink", null);
        setField(term233296, term233296.getClass(), "nextLink", null);
        setField(term233296, term233296.getClass(), "restrictUndefinedVisitor", null);
        setField(term233296, term233296.getClass(), "restrictNullVisitor", null);
        term233297 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term233299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term233300 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term233301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term233297, term233297.getClass(), "str", null);
        setIntField(term233297, term233297.getClass(), "type", 45);
        setField(term233297, term233297.getClass(), "next", null);
        setField(term233298, term233298.getClass(), "str", null);
        setIntField(term233298, term233298.getClass(), "type", 0);
        setField(term233298, term233298.getClass(), "next", null);
        setField(term233298, term233298.getClass(), "first", null);
        setField(term233298, term233298.getClass(), "last", null);
        setField(term233298, term233298.getClass(), "propListHead", null);
        setIntField(term233298, term233298.getClass(), "sourcePosition", 0);
        setField(term233299, term233299.getClass(), "typeExpr", null);
        setField(term233299, term233299.getClass(), "sourceName", null);
        setBooleanField(term233299, term233299.getClass(), "isChecked", false);
        setBooleanField(term233299, term233299.getClass(), "visited", false);
        setField(term233299, term233299.getClass(), "docInfo", null);
        setBooleanField(term233299, term233299.getClass(), "unknown", false);
        setBooleanField(term233299, term233299.getClass(), "resolved", false);
        setField(term233299, term233299.getClass(), "resolveResult", null);
        setBooleanField(term233299, term233299.getClass(), "inTemplatedCheckVisit", false);
        setField(term233299, term233299.getClass(), "registry", null);
        setField(term233298, term233298.getClass(), "jsType", term233299);
        setField(term233298, term233298.getClass(), "parent", null);
        setField(term233297, term233297.getClass(), "first", term233298);
        setDoubleField(term233300, term233300.getClass(), "number", 0.0);
        setIntField(term233300, term233300.getClass(), "type", 0);
        setField(term233300, term233300.getClass(), "next", null);
        setField(term233300, term233300.getClass(), "first", null);
        setField(term233300, term233300.getClass(), "last", null);
        setField(term233300, term233300.getClass(), "propListHead", null);
        setIntField(term233300, term233300.getClass(), "sourcePosition", 0);
        setField(term233301, term233301.getClass(), "call", null);
        setField(term233301, term233301.getClass(), "prototypeSlot", null);
        setField(term233301, term233301.getClass(), "kind", null);
        setField(term233301, term233301.getClass(), "typeOfThis", null);
        setField(term233301, term233301.getClass(), "source", null);
        setField(term233301, term233301.getClass(), "implementedInterfaces", null);
        setField(term233301, term233301.getClass(), "extendedInterfaces", null);
        setField(term233301, term233301.getClass(), "subTypes", null);
        setField(term233301, term233301.getClass(), "templateTypeNames", null);
        setField(term233301, term233301.getClass(), "className", null);
        setField(term233301, term233301.getClass(), "properties", null);
        setBooleanField(term233301, term233301.getClass(), "nativeType", false);
        setField(term233301, term233301.getClass(), "implicitPrototypeFallback", null);
        setField(term233301, term233301.getClass(), "ownerFunction", null);
        setBooleanField(term233301, term233301.getClass(), "prettyPrint", false);
        setBooleanField(term233301, term233301.getClass(), "visited", false);
        setField(term233301, term233301.getClass(), "docInfo", null);
        setBooleanField(term233301, term233301.getClass(), "unknown", false);
        setBooleanField(term233301, term233301.getClass(), "resolved", false);
        setField(term233301, term233301.getClass(), "resolveResult", null);
        setBooleanField(term233301, term233301.getClass(), "inTemplatedCheckVisit", false);
        setField(term233301, term233301.getClass(), "registry", null);
        setField(term233300, term233300.getClass(), "jsType", term233301);
        setField(term233300, term233300.getClass(), "parent", null);
        setField(term233297, term233297.getClass(), "last", term233300);
        setField(term233297, term233297.getClass(), "propListHead", null);
        setIntField(term233297, term233297.getClass(), "sourcePosition", 0);
        setField(term233297, term233297.getClass(), "jsType", null);
        setField(term233297, term233297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term232653;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term232561, args);
        assertTrue(recursiveEquals(term232561, term233296));
        assertTrue(recursiveEquals(term232653, term233297));
        assertTrue(recursiveEquals(retValue, null));
    }

};


