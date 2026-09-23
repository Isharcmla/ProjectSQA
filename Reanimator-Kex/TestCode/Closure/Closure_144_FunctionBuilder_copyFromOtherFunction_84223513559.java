package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class FunctionBuilder_copyFromOtherFunction_84223513559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50226;
     Object term50460;
     Object term50793;
     Object term50796;
     Object term50789;

    public FunctionBuilder_copyFromOtherFunction_84223513559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term50360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term50226, term50226.getClass(), "name", "");
        setField(term50226, term50226.getClass(), "sourceNode", null);
        setField(term50226, term50226.getClass(), "parametersNode", null);
        setField(term50226, term50226.getClass(), "returnType", term50360);
        term50460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term50554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term50648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term50740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term50460, term50460.getClass(), "className", null);
        setField(term50460, term50460.getClass(), "source", null);
        setField(term50554, term50554.getClass(), "parameters", null);
        setField(term50554, term50554.getClass(), "returnType", term50648);
        setField(term50460, term50460.getClass(), "call", term50554);
        setField(term50460, term50460.getClass(), "typeOfThis", term50740);
        term50793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term50794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term50795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term50793, term50793.getClass(), "registry", null);
        setField(term50793, term50793.getClass(), "name", null);
        setField(term50793, term50793.getClass(), "sourceNode", null);
        setField(term50793, term50793.getClass(), "parametersNode", null);
        setField(term50794, term50794.getClass(), "reference", null);
        setField(term50794, term50794.getClass(), "sourceName", null);
        setIntField(term50794, term50794.getClass(), "lineno", 0);
        setIntField(term50794, term50794.getClass(), "charno", 0);
        setBooleanField(term50794, term50794.getClass(), "forgiving", false);
        setField(term50794, term50794.getClass(), "referencedType", null);
        setBooleanField(term50794, term50794.getClass(), "visited", false);
        setField(term50794, term50794.getClass(), "docInfo", null);
        setBooleanField(term50794, term50794.getClass(), "unknown", false);
        setBooleanField(term50794, term50794.getClass(), "resolved", false);
        setField(term50794, term50794.getClass(), "resolveResult", null);
        setField(term50794, term50794.getClass(), "registry", null);
        setField(term50793, term50793.getClass(), "returnType", term50794);
        setField(term50795, term50795.getClass(), "elementsType", null);
        setField(term50795, term50795.getClass(), "elements", null);
        setField(term50795, term50795.getClass(), "className", null);
        setField(term50795, term50795.getClass(), "properties", null);
        setField(term50795, term50795.getClass(), "implicitPrototype", null);
        setBooleanField(term50795, term50795.getClass(), "nativeType", false);
        setBooleanField(term50795, term50795.getClass(), "prettyPrint", false);
        setBooleanField(term50795, term50795.getClass(), "visited", false);
        setField(term50795, term50795.getClass(), "docInfo", null);
        setBooleanField(term50795, term50795.getClass(), "unknown", false);
        setBooleanField(term50795, term50795.getClass(), "resolved", false);
        setField(term50795, term50795.getClass(), "resolveResult", null);
        setField(term50795, term50795.getClass(), "registry", null);
        setField(term50793, term50793.getClass(), "typeOfThis", term50795);
        setField(term50793, term50793.getClass(), "templateTypeName", null);
        setBooleanField(term50793, term50793.getClass(), "inferredReturnType", false);
        setBooleanField(term50793, term50793.getClass(), "isConstructor", false);
        setBooleanField(term50793, term50793.getClass(), "isNativeType", false);
        term50796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term50797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term50798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term50799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term50797, term50797.getClass(), "parameters", null);
        setField(term50798, term50798.getClass(), "reference", null);
        setField(term50798, term50798.getClass(), "sourceName", null);
        setIntField(term50798, term50798.getClass(), "lineno", 0);
        setIntField(term50798, term50798.getClass(), "charno", 0);
        setBooleanField(term50798, term50798.getClass(), "forgiving", false);
        setField(term50798, term50798.getClass(), "referencedType", null);
        setBooleanField(term50798, term50798.getClass(), "visited", false);
        setField(term50798, term50798.getClass(), "docInfo", null);
        setBooleanField(term50798, term50798.getClass(), "unknown", false);
        setBooleanField(term50798, term50798.getClass(), "resolved", false);
        setField(term50798, term50798.getClass(), "resolveResult", null);
        setField(term50798, term50798.getClass(), "registry", null);
        setField(term50797, term50797.getClass(), "returnType", term50798);
        setBooleanField(term50797, term50797.getClass(), "returnTypeInferred", false);
        setBooleanField(term50797, term50797.getClass(), "resolved", false);
        setField(term50797, term50797.getClass(), "resolveResult", null);
        setField(term50797, term50797.getClass(), "registry", null);
        setField(term50796, term50796.getClass(), "call", term50797);
        setField(term50796, term50796.getClass(), "prototype", null);
        setField(term50796, term50796.getClass(), "kind", null);
        setField(term50799, term50799.getClass(), "elementsType", null);
        setField(term50799, term50799.getClass(), "elements", null);
        setField(term50799, term50799.getClass(), "className", null);
        setField(term50799, term50799.getClass(), "properties", null);
        setField(term50799, term50799.getClass(), "implicitPrototype", null);
        setBooleanField(term50799, term50799.getClass(), "nativeType", false);
        setBooleanField(term50799, term50799.getClass(), "prettyPrint", false);
        setBooleanField(term50799, term50799.getClass(), "visited", false);
        setField(term50799, term50799.getClass(), "docInfo", null);
        setBooleanField(term50799, term50799.getClass(), "unknown", false);
        setBooleanField(term50799, term50799.getClass(), "resolved", false);
        setField(term50799, term50799.getClass(), "resolveResult", null);
        setField(term50799, term50799.getClass(), "registry", null);
        setField(term50796, term50796.getClass(), "typeOfThis", term50799);
        setField(term50796, term50796.getClass(), "source", null);
        setField(term50796, term50796.getClass(), "implementedInterfaces", null);
        setField(term50796, term50796.getClass(), "subTypes", null);
        setField(term50796, term50796.getClass(), "templateTypeName", null);
        setField(term50796, term50796.getClass(), "className", null);
        setField(term50796, term50796.getClass(), "properties", null);
        setField(term50796, term50796.getClass(), "implicitPrototype", null);
        setBooleanField(term50796, term50796.getClass(), "nativeType", false);
        setBooleanField(term50796, term50796.getClass(), "prettyPrint", false);
        setBooleanField(term50796, term50796.getClass(), "visited", false);
        setField(term50796, term50796.getClass(), "docInfo", null);
        setBooleanField(term50796, term50796.getClass(), "unknown", false);
        setBooleanField(term50796, term50796.getClass(), "resolved", false);
        setField(term50796, term50796.getClass(), "resolveResult", null);
        setField(term50796, term50796.getClass(), "registry", null);
        term50789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term50744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term50753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term50789, term50789.getClass(), "registry", null);
        setField(term50789, term50789.getClass(), "name", null);
        setField(term50789, term50789.getClass(), "sourceNode", null);
        setField(term50789, term50789.getClass(), "parametersNode", null);
        setField(term50744, term50744.getClass(), "reference", null);
        setField(term50744, term50744.getClass(), "sourceName", null);
        setIntField(term50744, term50744.getClass(), "lineno", 0);
        setIntField(term50744, term50744.getClass(), "charno", 0);
        setBooleanField(term50744, term50744.getClass(), "forgiving", false);
        setField(term50744, term50744.getClass(), "referencedType", null);
        setBooleanField(term50744, term50744.getClass(), "visited", false);
        setField(term50744, term50744.getClass(), "docInfo", null);
        setBooleanField(term50744, term50744.getClass(), "unknown", false);
        setBooleanField(term50744, term50744.getClass(), "resolved", false);
        setField(term50744, term50744.getClass(), "resolveResult", null);
        setField(term50744, term50744.getClass(), "registry", null);
        setField(term50789, term50789.getClass(), "returnType", term50744);
        setField(term50753, term50753.getClass(), "elementsType", null);
        setField(term50753, term50753.getClass(), "elements", null);
        setField(term50753, term50753.getClass(), "className", null);
        setField(term50753, term50753.getClass(), "properties", null);
        setField(term50753, term50753.getClass(), "implicitPrototype", null);
        setBooleanField(term50753, term50753.getClass(), "nativeType", false);
        setBooleanField(term50753, term50753.getClass(), "prettyPrint", false);
        setBooleanField(term50753, term50753.getClass(), "visited", false);
        setField(term50753, term50753.getClass(), "docInfo", null);
        setBooleanField(term50753, term50753.getClass(), "unknown", false);
        setBooleanField(term50753, term50753.getClass(), "resolved", false);
        setField(term50753, term50753.getClass(), "resolveResult", null);
        setField(term50753, term50753.getClass(), "registry", null);
        setField(term50789, term50789.getClass(), "typeOfThis", term50753);
        setField(term50789, term50789.getClass(), "templateTypeName", null);
        setBooleanField(term50789, term50789.getClass(), "inferredReturnType", false);
        setBooleanField(term50789, term50789.getClass(), "isConstructor", false);
        setBooleanField(term50789, term50789.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term50460;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term50226, args);
        assertTrue(recursiveEquals(term50226, term50793));
        assertTrue(recursiveEquals(term50460, term50796));
        assertTrue(recursiveEquals(retValue, term50789));
    }

};


