package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class TypeInference_traverseWithinShortCircuitingBinOp_342908577110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61029;
     Object term61099;
     Object term61474;
     Object term61475;
     Object term61465;

    public TypeInference_traverseWithinShortCircuitingBinOp_342908577110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61029 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term61099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61099, term61099.getClass(), "type", 113);
        term61474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term61474, term61474.getClass(), "compiler", null);
        setField(term61474, term61474.getClass(), "registry", null);
        setField(term61474, term61474.getClass(), "reverseInterpreter", null);
        setField(term61474, term61474.getClass(), "syntacticScope", null);
        setField(term61474, term61474.getClass(), "functionScope", null);
        setField(term61474, term61474.getClass(), "bottomScope", null);
        setField(term61474, term61474.getClass(), "assignedOuterLocalVars", null);
        setField(term61474, term61474.getClass(), "unflowableVarNames", null);
        setField(term61474, term61474.getClass(), "cfg", null);
        setField(term61474, term61474.getClass(), "joinOp", null);
        setField(term61474, term61474.getClass(), "orderedWorkSet", null);
        term61475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61475, term61475.getClass(), "type", 113);
        setField(term61475, term61475.getClass(), "next", null);
        setField(term61475, term61475.getClass(), "first", null);
        setField(term61475, term61475.getClass(), "last", null);
        setField(term61475, term61475.getClass(), "propListHead", null);
        setIntField(term61475, term61475.getClass(), "sourcePosition", 0);
        setField(term61475, term61475.getClass(), "jsType", null);
        setField(term61475, term61475.getClass(), "parent", null);
        Class<? extends Object> term61477 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term61476 = ((Class) term61477).getDeclaredField((String) "BOTH");
        ((Field) term61476).setAccessible(true);
        Object enum117 = ((Field) term61476).get((Object) null);
        term61465 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term61443 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term61465, term61465.getClass(), "toBooleanOutcomes", enum117);
        setField(term61465, term61465.getClass(), "booleanValues", enum117);
        setField(term61465, term61465.getClass(), "leftScope", null);
        setField(term61465, term61465.getClass(), "rightScope", null);
        setField(term61465, term61465.getClass(), "joinedScope", null);
        setField(term61443, term61443.getClass(), "compiler", null);
        setField(term61443, term61443.getClass(), "registry", null);
        setField(term61443, term61443.getClass(), "reverseInterpreter", null);
        setField(term61443, term61443.getClass(), "syntacticScope", null);
        setField(term61443, term61443.getClass(), "functionScope", null);
        setField(term61443, term61443.getClass(), "bottomScope", null);
        setField(term61443, term61443.getClass(), "assignedOuterLocalVars", null);
        setField(term61443, term61443.getClass(), "unflowableVarNames", null);
        setField(term61443, term61443.getClass(), "cfg", null);
        setField(term61443, term61443.getClass(), "joinOp", null);
        setField(term61443, term61443.getClass(), "orderedWorkSet", null);
        setField(term61465, term61465.getClass(), "this$0", term61443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term61099;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term61029, args);
        assertTrue(recursiveEquals(term61029, term61474));
        assertTrue(recursiveEquals(term61099, term61475));
        assertTrue(recursiveEquals(retValue, term61465));
    }

};


