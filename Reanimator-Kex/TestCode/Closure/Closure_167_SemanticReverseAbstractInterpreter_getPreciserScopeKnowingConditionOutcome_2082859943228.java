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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54514;
     Object term54606;
     Object term55287;
     Object term55288;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54514 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term54606 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term54606, term54606.getClass(), "type", 12);
        setField(term54606, term54606.getClass(), "first", term54698);
        setField(term54606, term54606.getClass(), "last", term54790);
        term55287 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term55287, term55287.getClass(), "INEQ", null);
        setField(term55287, term55287.getClass(), "convention", null);
        setField(term55287, term55287.getClass(), "typeRegistry", null);
        setField(term55287, term55287.getClass(), "firstLink", null);
        setField(term55287, term55287.getClass(), "nextLink", null);
        setField(term55287, term55287.getClass(), "restrictUndefinedVisitor", null);
        setField(term55287, term55287.getClass(), "restrictNullVisitor", null);
        term55288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55289 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55288, term55288.getClass(), "str", null);
        setIntField(term55288, term55288.getClass(), "type", 12);
        setField(term55288, term55288.getClass(), "next", null);
        setField(term55289, term55289.getClass(), "str", null);
        setIntField(term55289, term55289.getClass(), "type", 0);
        setField(term55289, term55289.getClass(), "next", null);
        setField(term55289, term55289.getClass(), "first", null);
        setField(term55289, term55289.getClass(), "last", null);
        setField(term55289, term55289.getClass(), "propListHead", null);
        setIntField(term55289, term55289.getClass(), "sourcePosition", 0);
        setField(term55289, term55289.getClass(), "jsType", null);
        setField(term55289, term55289.getClass(), "parent", null);
        setField(term55288, term55288.getClass(), "first", term55289);
        setField(term55290, term55290.getClass(), "str", null);
        setIntField(term55290, term55290.getClass(), "type", 0);
        setField(term55290, term55290.getClass(), "next", null);
        setField(term55290, term55290.getClass(), "first", null);
        setField(term55290, term55290.getClass(), "last", null);
        setField(term55290, term55290.getClass(), "propListHead", null);
        setIntField(term55290, term55290.getClass(), "sourcePosition", 0);
        setField(term55290, term55290.getClass(), "jsType", null);
        setField(term55290, term55290.getClass(), "parent", null);
        setField(term55288, term55288.getClass(), "last", term55290);
        setField(term55288, term55288.getClass(), "propListHead", null);
        setIntField(term55288, term55288.getClass(), "sourcePosition", 0);
        setField(term55288, term55288.getClass(), "jsType", null);
        setField(term55288, term55288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term54606;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term54514, args);
        assertTrue(recursiveEquals(term54514, term55287));
        assertTrue(recursiveEquals(term54606, term55288));
        assertTrue(recursiveEquals(retValue, null));
    }

};


