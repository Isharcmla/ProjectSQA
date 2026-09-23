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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionTypeBuilder_init_61033970145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41235;
     Object term41270;

    public FunctionTypeBuilder_init_61033970145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term40847 = new ArrayList();
        Object term40681 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term40795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term40971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term41270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40681, term40681.getClass(), "returnType", term40795);
        setField(term40681, term40681.getClass(), "implementedInterfaces", term40847);
        setField(term40681, term40681.getClass(), "baseType", term40971);
        setField(term40681, term40681.getClass(), "thisType", term40971);
        setBooleanField(term40681, term40681.getClass(), "isConstructor", false);
        setBooleanField(term40681, term40681.getClass(), "isInterface", false);
        setField(term40681, term40681.getClass(), "parametersNode", null);
        setField(term40681, term40681.getClass(), "sourceNode", term41270);
        setField(term40681, term40681.getClass(), "templateTypeName", "");
        setField(term40681, term40681.getClass(), "fnName", "");
        term41235 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[5];
        args[0] = "";
        args[1] = term41235;
        args[2] = term41270;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


