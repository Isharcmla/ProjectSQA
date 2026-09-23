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

public class FunctionTypeBuilder_isFunctionTypeDeclaration_1412632693167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68057;
     Object term68875;

    public FunctionTypeBuilder_isFunctionTypeDeclaration_1412632693167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term68229 = new HashMap();
        term68057 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term68181 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term68181, term68181.getClass(), "parameters", term68229);
        setField(term68057, term68057.getClass(), "info", term68181);
        setIntField(term68057, term68057.getClass(), "bitset", -1610612736);
        setField(term68057, term68057.getClass(), "thisType", null);
        HashMap term68877 = new HashMap();
        term68875 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term68876 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term68876, term68876.getClass(), "baseType", null);
        setField(term68876, term68876.getClass(), "implementedInterfaces", null);
        setField(term68876, term68876.getClass(), "parameters", term68877);
        setField(term68876, term68876.getClass(), "thrownTypes", null);
        setField(term68876, term68876.getClass(), "templateTypeName", null);
        setField(term68876, term68876.getClass(), "description", null);
        setField(term68876, term68876.getClass(), "meaning", null);
        setField(term68876, term68876.getClass(), "deprecated", null);
        setField(term68876, term68876.getClass(), "license", null);
        setField(term68876, term68876.getClass(), "suppressions", null);
        setField(term68876, term68876.getClass(), "modifies", null);
        setField(term68876, term68876.getClass(), "lendsName", null);
        setField(term68875, term68875.getClass(), "info", term68876);
        setField(term68875, term68875.getClass(), "documentation", null);
        setField(term68875, term68875.getClass(), "sourceName", null);
        setField(term68875, term68875.getClass(), "visibility", null);
        setIntField(term68875, term68875.getClass(), "bitset", -1610612736);
        setField(term68875, term68875.getClass(), "type", null);
        setField(term68875, term68875.getClass(), "thisType", null);
        setBooleanField(term68875, term68875.getClass(), "includeDocumentation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term68057;
        Object retValue = callMethod(klass, "isFunctionTypeDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term68057, term68875));
        assertTrue(recursiveEquals(retValue, false));
    }

};


