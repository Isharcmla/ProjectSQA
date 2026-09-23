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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85939;
     Object term86009;
     Object term86654;
     Object term86655;
     Object term86645;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85939 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term86009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86009, term86009.getClass(), "type", 39);
        term86654 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term86654, term86654.getClass(), "compiler", null);
        setField(term86654, term86654.getClass(), "registry", null);
        setField(term86654, term86654.getClass(), "reverseInterpreter", null);
        setField(term86654, term86654.getClass(), "syntacticScope", null);
        setField(term86654, term86654.getClass(), "functionScope", null);
        setField(term86654, term86654.getClass(), "bottomScope", null);
        setField(term86654, term86654.getClass(), "assertionFunctionsMap", null);
        setField(term86654, term86654.getClass(), "unknownType", null);
        setField(term86654, term86654.getClass(), "cfg", null);
        setField(term86654, term86654.getClass(), "joinOp", null);
        setField(term86654, term86654.getClass(), "orderedWorkSet", null);
        term86655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86655, term86655.getClass(), "type", 39);
        setField(term86655, term86655.getClass(), "next", null);
        setField(term86655, term86655.getClass(), "first", null);
        setField(term86655, term86655.getClass(), "last", null);
        setField(term86655, term86655.getClass(), "propListHead", null);
        setIntField(term86655, term86655.getClass(), "sourcePosition", 0);
        setField(term86655, term86655.getClass(), "jsType", null);
        setField(term86655, term86655.getClass(), "parent", null);
        Class<? extends Object> term86657 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term86656 = ((Class) term86657).getDeclaredField((String) "BOTH");
        ((Field) term86656).setAccessible(true);
        Object enum159 = ((Field) term86656).get((Object) null);
        term86645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term86623 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term86645, term86645.getClass(), "toBooleanOutcomes", enum159);
        setField(term86645, term86645.getClass(), "booleanValues", enum159);
        setField(term86645, term86645.getClass(), "leftScope", null);
        setField(term86645, term86645.getClass(), "rightScope", null);
        setField(term86645, term86645.getClass(), "joinedScope", null);
        setField(term86623, term86623.getClass(), "compiler", null);
        setField(term86623, term86623.getClass(), "registry", null);
        setField(term86623, term86623.getClass(), "reverseInterpreter", null);
        setField(term86623, term86623.getClass(), "syntacticScope", null);
        setField(term86623, term86623.getClass(), "functionScope", null);
        setField(term86623, term86623.getClass(), "bottomScope", null);
        setField(term86623, term86623.getClass(), "assertionFunctionsMap", null);
        setField(term86623, term86623.getClass(), "unknownType", null);
        setField(term86623, term86623.getClass(), "cfg", null);
        setField(term86623, term86623.getClass(), "joinOp", null);
        setField(term86623, term86623.getClass(), "orderedWorkSet", null);
        setField(term86645, term86645.getClass(), "this$0", term86623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term86009;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term85939, args);
        assertTrue(recursiveEquals(term85939, term86654));
        assertTrue(recursiveEquals(term86009, term86655));
        assertTrue(recursiveEquals(retValue, term86645));
    }

};


