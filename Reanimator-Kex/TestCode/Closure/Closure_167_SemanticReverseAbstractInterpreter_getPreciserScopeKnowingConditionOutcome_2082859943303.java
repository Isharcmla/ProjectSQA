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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76849;
     Object term76941;
     Object term77333;
     Object term77334;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76849 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term76941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term77033 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term77133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term77225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term76941, term76941.getClass(), "type", 13);
        setIntField(term77033, term77033.getClass(), "type", 13);
        setField(term77033, term77033.getClass(), "jsType", term77133);
        setField(term76941, term76941.getClass(), "first", term77033);
        setIntField(term77225, term77225.getClass(), "type", 0);
        setField(term77225, term77225.getClass(), "jsType", null);
        setField(term76941, term76941.getClass(), "last", term77225);
        term77333 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term77333, term77333.getClass(), "INEQ", null);
        setField(term77333, term77333.getClass(), "convention", null);
        setField(term77333, term77333.getClass(), "typeRegistry", null);
        setField(term77333, term77333.getClass(), "firstLink", null);
        setField(term77333, term77333.getClass(), "nextLink", null);
        setField(term77333, term77333.getClass(), "restrictUndefinedVisitor", null);
        setField(term77333, term77333.getClass(), "restrictNullVisitor", null);
        term77334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term77335 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term77336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term77337 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term77334, term77334.getClass(), "str", null);
        setIntField(term77334, term77334.getClass(), "type", 13);
        setField(term77334, term77334.getClass(), "next", null);
        setField(term77335, term77335.getClass(), "str", null);
        setIntField(term77335, term77335.getClass(), "type", 13);
        setField(term77335, term77335.getClass(), "next", null);
        setField(term77335, term77335.getClass(), "first", null);
        setField(term77335, term77335.getClass(), "last", null);
        setField(term77335, term77335.getClass(), "propListHead", null);
        setIntField(term77335, term77335.getClass(), "sourcePosition", 0);
        setField(term77336, term77336.getClass(), "name", null);
        setField(term77336, term77336.getClass(), "referencedType", null);
        setField(term77336, term77336.getClass(), "referencedObjType", null);
        setBooleanField(term77336, term77336.getClass(), "visited", false);
        setField(term77336, term77336.getClass(), "docInfo", null);
        setBooleanField(term77336, term77336.getClass(), "unknown", false);
        setBooleanField(term77336, term77336.getClass(), "resolved", false);
        setField(term77336, term77336.getClass(), "resolveResult", null);
        setBooleanField(term77336, term77336.getClass(), "inTemplatedCheckVisit", false);
        setField(term77336, term77336.getClass(), "registry", null);
        setField(term77335, term77335.getClass(), "jsType", term77336);
        setField(term77335, term77335.getClass(), "parent", null);
        setField(term77334, term77334.getClass(), "first", term77335);
        setDoubleField(term77337, term77337.getClass(), "number", 0.0);
        setIntField(term77337, term77337.getClass(), "type", 0);
        setField(term77337, term77337.getClass(), "next", null);
        setField(term77337, term77337.getClass(), "first", null);
        setField(term77337, term77337.getClass(), "last", null);
        setField(term77337, term77337.getClass(), "propListHead", null);
        setIntField(term77337, term77337.getClass(), "sourcePosition", 0);
        setField(term77337, term77337.getClass(), "jsType", null);
        setField(term77337, term77337.getClass(), "parent", null);
        setField(term77334, term77334.getClass(), "last", term77337);
        setField(term77334, term77334.getClass(), "propListHead", null);
        setIntField(term77334, term77334.getClass(), "sourcePosition", 0);
        setField(term77334, term77334.getClass(), "jsType", null);
        setField(term77334, term77334.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term76941;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term76849, args);
        assertTrue(recursiveEquals(term76849, term77333));
        assertTrue(recursiveEquals(term76941, term77334));
        assertTrue(recursiveEquals(retValue, null));
    }

};


