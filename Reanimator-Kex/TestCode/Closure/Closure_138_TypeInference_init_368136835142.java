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
import java.lang.Object;
import java.util.LinkedHashSet;

public class TypeInference_init_368136835142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77545;
     Object term77641;

    public TypeInference_init_368136835142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashSet term77385 = new LinkedHashSet();
        Object term77229 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term77325 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        Object term77465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term77229, term77229.getClass(), "cfg", term77325);
        setField(term77229, term77229.getClass(), "joinOp", null);
        setField(term77229, term77229.getClass(), "orderedWorkSet", term77385);
        setField(term77229, term77229.getClass(), "assignedOuterLocalVars", null);
        setField(term77229, term77229.getClass(), "unflowableVarNames", null);
        setField(term77229, term77229.getClass(), "compiler", term77465);
        term77545 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        term77641 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[4];
        args[0] = term77545;
        args[1] = term77641;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


