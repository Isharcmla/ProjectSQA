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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90203;
     Object term90273;
     Object term96098;
     Object term96099;
     Object term96089;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90203 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term90273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90273, term90273.getClass(), "type", 34);
        term96098 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term96098, term96098.getClass(), "compiler", null);
        setField(term96098, term96098.getClass(), "registry", null);
        setField(term96098, term96098.getClass(), "reverseInterpreter", null);
        setField(term96098, term96098.getClass(), "syntacticScope", null);
        setField(term96098, term96098.getClass(), "functionScope", null);
        setField(term96098, term96098.getClass(), "bottomScope", null);
        setField(term96098, term96098.getClass(), "assertionFunctionsMap", null);
        setField(term96098, term96098.getClass(), "unknownType", null);
        setField(term96098, term96098.getClass(), "cfg", null);
        setField(term96098, term96098.getClass(), "joinOp", null);
        setField(term96098, term96098.getClass(), "orderedWorkSet", null);
        term96099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96099, term96099.getClass(), "type", 34);
        setField(term96099, term96099.getClass(), "next", null);
        setField(term96099, term96099.getClass(), "first", null);
        setField(term96099, term96099.getClass(), "last", null);
        setField(term96099, term96099.getClass(), "propListHead", null);
        setIntField(term96099, term96099.getClass(), "sourcePosition", 0);
        setField(term96099, term96099.getClass(), "jsType", null);
        setField(term96099, term96099.getClass(), "parent", null);
        Class<? extends Object> term96101 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term96100 = ((Class) term96101).getDeclaredField((String) "BOTH");
        ((Field) term96100).setAccessible(true);
        Object enum162 = ((Field) term96100).get((Object) null);
        term96089 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term96067 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term96089, term96089.getClass(), "toBooleanOutcomes", enum162);
        setField(term96089, term96089.getClass(), "booleanValues", enum162);
        setField(term96089, term96089.getClass(), "leftScope", null);
        setField(term96089, term96089.getClass(), "rightScope", null);
        setField(term96089, term96089.getClass(), "joinedScope", null);
        setField(term96067, term96067.getClass(), "compiler", null);
        setField(term96067, term96067.getClass(), "registry", null);
        setField(term96067, term96067.getClass(), "reverseInterpreter", null);
        setField(term96067, term96067.getClass(), "syntacticScope", null);
        setField(term96067, term96067.getClass(), "functionScope", null);
        setField(term96067, term96067.getClass(), "bottomScope", null);
        setField(term96067, term96067.getClass(), "assertionFunctionsMap", null);
        setField(term96067, term96067.getClass(), "unknownType", null);
        setField(term96067, term96067.getClass(), "cfg", null);
        setField(term96067, term96067.getClass(), "joinOp", null);
        setField(term96067, term96067.getClass(), "orderedWorkSet", null);
        setField(term96089, term96089.getClass(), "this$0", term96067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term90273;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term90203, args);
        assertTrue(recursiveEquals(term90203, term96098));
        assertTrue(recursiveEquals(term90273, term96099));
        assertTrue(recursiveEquals(retValue, term96089));
    }

};


