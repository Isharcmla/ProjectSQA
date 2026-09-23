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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80220;
     Object term80290;
     Object term80501;
     Object term80502;
     Object term80492;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80220 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term80290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80290, term80290.getClass(), "type", 133);
        term80501 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term80501, term80501.getClass(), "compiler", null);
        setField(term80501, term80501.getClass(), "registry", null);
        setField(term80501, term80501.getClass(), "reverseInterpreter", null);
        setField(term80501, term80501.getClass(), "syntacticScope", null);
        setField(term80501, term80501.getClass(), "functionScope", null);
        setField(term80501, term80501.getClass(), "bottomScope", null);
        setField(term80501, term80501.getClass(), "assertionFunctionsMap", null);
        setField(term80501, term80501.getClass(), "unknownType", null);
        setField(term80501, term80501.getClass(), "cfg", null);
        setField(term80501, term80501.getClass(), "joinOp", null);
        setField(term80501, term80501.getClass(), "orderedWorkSet", null);
        term80502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80502, term80502.getClass(), "type", 133);
        setField(term80502, term80502.getClass(), "next", null);
        setField(term80502, term80502.getClass(), "first", null);
        setField(term80502, term80502.getClass(), "last", null);
        setField(term80502, term80502.getClass(), "propListHead", null);
        setIntField(term80502, term80502.getClass(), "sourcePosition", 0);
        setField(term80502, term80502.getClass(), "jsType", null);
        setField(term80502, term80502.getClass(), "parent", null);
        Class<? extends Object> term80504 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term80503 = ((Class) term80504).getDeclaredField((String) "BOTH");
        ((Field) term80503).setAccessible(true);
        Object enum158 = ((Field) term80503).get((Object) null);
        term80492 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term80470 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term80492, term80492.getClass(), "toBooleanOutcomes", enum158);
        setField(term80492, term80492.getClass(), "booleanValues", enum158);
        setField(term80492, term80492.getClass(), "leftScope", null);
        setField(term80492, term80492.getClass(), "rightScope", null);
        setField(term80492, term80492.getClass(), "joinedScope", null);
        setField(term80470, term80470.getClass(), "compiler", null);
        setField(term80470, term80470.getClass(), "registry", null);
        setField(term80470, term80470.getClass(), "reverseInterpreter", null);
        setField(term80470, term80470.getClass(), "syntacticScope", null);
        setField(term80470, term80470.getClass(), "functionScope", null);
        setField(term80470, term80470.getClass(), "bottomScope", null);
        setField(term80470, term80470.getClass(), "assertionFunctionsMap", null);
        setField(term80470, term80470.getClass(), "unknownType", null);
        setField(term80470, term80470.getClass(), "cfg", null);
        setField(term80470, term80470.getClass(), "joinOp", null);
        setField(term80470, term80470.getClass(), "orderedWorkSet", null);
        setField(term80492, term80492.getClass(), "this$0", term80470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term80290;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term80220, args);
        assertTrue(recursiveEquals(term80220, term80501));
        assertTrue(recursiveEquals(term80290, term80502));
        assertTrue(recursiveEquals(retValue, term80492));
    }

};


