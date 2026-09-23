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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87101;
     Object term87171;
     Object term87483;
     Object term87484;
     Object term87474;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87101 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term87171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87171, term87171.getClass(), "type", 122);
        term87483 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term87483, term87483.getClass(), "compiler", null);
        setField(term87483, term87483.getClass(), "registry", null);
        setField(term87483, term87483.getClass(), "reverseInterpreter", null);
        setField(term87483, term87483.getClass(), "syntacticScope", null);
        setField(term87483, term87483.getClass(), "functionScope", null);
        setField(term87483, term87483.getClass(), "bottomScope", null);
        setField(term87483, term87483.getClass(), "assertionFunctionsMap", null);
        setField(term87483, term87483.getClass(), "unknownType", null);
        setField(term87483, term87483.getClass(), "cfg", null);
        setField(term87483, term87483.getClass(), "joinOp", null);
        setField(term87483, term87483.getClass(), "orderedWorkSet", null);
        term87484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87484, term87484.getClass(), "type", 122);
        setField(term87484, term87484.getClass(), "next", null);
        setField(term87484, term87484.getClass(), "first", null);
        setField(term87484, term87484.getClass(), "last", null);
        setField(term87484, term87484.getClass(), "propListHead", null);
        setIntField(term87484, term87484.getClass(), "sourcePosition", 0);
        setField(term87484, term87484.getClass(), "jsType", null);
        setField(term87484, term87484.getClass(), "parent", null);
        Class<? extends Object> term87486 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term87485 = ((Class) term87486).getDeclaredField((String) "BOTH");
        ((Field) term87485).setAccessible(true);
        Object enum161 = ((Field) term87485).get((Object) null);
        term87474 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term87452 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term87474, term87474.getClass(), "toBooleanOutcomes", enum161);
        setField(term87474, term87474.getClass(), "booleanValues", enum161);
        setField(term87474, term87474.getClass(), "leftScope", null);
        setField(term87474, term87474.getClass(), "rightScope", null);
        setField(term87474, term87474.getClass(), "joinedScope", null);
        setField(term87452, term87452.getClass(), "compiler", null);
        setField(term87452, term87452.getClass(), "registry", null);
        setField(term87452, term87452.getClass(), "reverseInterpreter", null);
        setField(term87452, term87452.getClass(), "syntacticScope", null);
        setField(term87452, term87452.getClass(), "functionScope", null);
        setField(term87452, term87452.getClass(), "bottomScope", null);
        setField(term87452, term87452.getClass(), "assertionFunctionsMap", null);
        setField(term87452, term87452.getClass(), "unknownType", null);
        setField(term87452, term87452.getClass(), "cfg", null);
        setField(term87452, term87452.getClass(), "joinOp", null);
        setField(term87452, term87452.getClass(), "orderedWorkSet", null);
        setField(term87474, term87474.getClass(), "this$0", term87452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term87171;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term87101, args);
        assertTrue(recursiveEquals(term87101, term87483));
        assertTrue(recursiveEquals(term87171, term87484));
        assertTrue(recursiveEquals(retValue, term87474));
    }

};


