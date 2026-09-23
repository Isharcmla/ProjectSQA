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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269774;
     Object term269866;
     Object term270238;
     Object term270239;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269774 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term269866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term269958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term270134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term269866, term269866.getClass(), "type", 45);
        setIntField(term269958, term269958.getClass(), "type", -458798);
        setField(term269958, term269958.getClass(), "jsType", term270064);
        setField(term269866, term269866.getClass(), "first", term269958);
        setIntField(term270134, term270134.getClass(), "type", 45);
        setField(term270134, term270134.getClass(), "jsType", null);
        setField(term269866, term269866.getClass(), "last", term270134);
        term270238 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term270238, term270238.getClass(), "INEQ", null);
        setField(term270238, term270238.getClass(), "convention", null);
        setField(term270238, term270238.getClass(), "typeRegistry", null);
        setField(term270238, term270238.getClass(), "firstLink", null);
        setField(term270238, term270238.getClass(), "nextLink", null);
        setField(term270238, term270238.getClass(), "restrictUndefinedVisitor", null);
        setField(term270238, term270238.getClass(), "restrictNullVisitor", null);
        term270239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term270240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270241 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term270242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term270239, term270239.getClass(), "number", 0.0);
        setIntField(term270239, term270239.getClass(), "type", 45);
        setField(term270239, term270239.getClass(), "next", null);
        setField(term270240, term270240.getClass(), "str", null);
        setIntField(term270240, term270240.getClass(), "type", -458798);
        setField(term270240, term270240.getClass(), "next", null);
        setField(term270240, term270240.getClass(), "first", null);
        setField(term270240, term270240.getClass(), "last", null);
        setField(term270240, term270240.getClass(), "propListHead", null);
        setIntField(term270240, term270240.getClass(), "sourcePosition", 0);
        setField(term270241, term270241.getClass(), "primitiveType", null);
        setField(term270241, term270241.getClass(), "primitiveObjectType", null);
        setField(term270241, term270241.getClass(), "name", null);
        setBooleanField(term270241, term270241.getClass(), "visited", false);
        setField(term270241, term270241.getClass(), "docInfo", null);
        setBooleanField(term270241, term270241.getClass(), "unknown", false);
        setBooleanField(term270241, term270241.getClass(), "resolved", false);
        setField(term270241, term270241.getClass(), "resolveResult", null);
        setBooleanField(term270241, term270241.getClass(), "inTemplatedCheckVisit", false);
        setField(term270241, term270241.getClass(), "registry", null);
        setField(term270240, term270240.getClass(), "jsType", term270241);
        setField(term270240, term270240.getClass(), "parent", null);
        setField(term270239, term270239.getClass(), "first", term270240);
        setIntField(term270242, term270242.getClass(), "type", 45);
        setField(term270242, term270242.getClass(), "next", null);
        setField(term270242, term270242.getClass(), "first", null);
        setField(term270242, term270242.getClass(), "last", null);
        setField(term270242, term270242.getClass(), "propListHead", null);
        setIntField(term270242, term270242.getClass(), "sourcePosition", 0);
        setField(term270242, term270242.getClass(), "jsType", null);
        setField(term270242, term270242.getClass(), "parent", null);
        setField(term270239, term270239.getClass(), "last", term270242);
        setField(term270239, term270239.getClass(), "propListHead", null);
        setIntField(term270239, term270239.getClass(), "sourcePosition", 0);
        setField(term270239, term270239.getClass(), "jsType", null);
        setField(term270239, term270239.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term269866;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term269774, args);
        assertTrue(recursiveEquals(term269774, term270238));
        assertTrue(recursiveEquals(term269866, term270239));
        assertTrue(recursiveEquals(retValue, null));
    }

};


