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
import java.lang.Object;
import java.util.HashMap;

public class FunctionTypeBuilder_isFunctionTypeDeclaration_141263269349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42170;
     Object term42703;

    public FunctionTypeBuilder_isFunctionTypeDeclaration_141263269349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42342 = new HashMap();
        term42170 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term42294 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term42294, term42294.getClass(), "parameters", term42342);
        setField(term42170, term42170.getClass(), "info", term42294);
        setIntField(term42170, term42170.getClass(), "bitset", -1610612736);
        HashMap term42705 = new HashMap();
        term42703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term42704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term42704, term42704.getClass(), "baseType", null);
        setField(term42704, term42704.getClass(), "implementedInterfaces", null);
        setField(term42704, term42704.getClass(), "parameters", term42705);
        setField(term42704, term42704.getClass(), "thrownTypes", null);
        setField(term42704, term42704.getClass(), "templateTypeName", null);
        setField(term42704, term42704.getClass(), "description", null);
        setField(term42704, term42704.getClass(), "deprecated", null);
        setField(term42704, term42704.getClass(), "license", null);
        setField(term42704, term42704.getClass(), "suppressions", null);
        setField(term42703, term42703.getClass(), "info", term42704);
        setField(term42703, term42703.getClass(), "documentation", null);
        setField(term42703, term42703.getClass(), "sourceName", null);
        setField(term42703, term42703.getClass(), "visibility", null);
        setIntField(term42703, term42703.getClass(), "bitset", -1610612736);
        setField(term42703, term42703.getClass(), "type", null);
        setField(term42703, term42703.getClass(), "thisType", null);
        setBooleanField(term42703, term42703.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term42170;
        Object retValue = callMethod(klass, "isFunctionTypeDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term42170, term42703));
        assertTrue(recursiveEquals(retValue, false));
    }

};


