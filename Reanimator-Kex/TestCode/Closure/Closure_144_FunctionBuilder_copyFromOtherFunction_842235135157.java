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
import java.lang.String;

public class FunctionBuilder_copyFromOtherFunction_842235135157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106774;
     Object term106938;
     Object term107706;
     Object term107709;
     Object term107702;

    public FunctionBuilder_copyFromOtherFunction_842235135157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term106774, term106774.getClass(), "name", "");
        setField(term106774, term106774.getClass(), "sourceNode", null);
        setField(term106774, term106774.getClass(), "parametersNode", null);
        setField(term106774, term106774.getClass(), "returnType", null);
        setField(term106774, term106774.getClass(), "typeOfThis", null);
        setField(term106774, term106774.getClass(), "templateTypeName", "");
        Class<? extends Object> term107717 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term107716 = ((Class) term107717).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term107716).setAccessible(true);
        Object enum153 = ((Field) term107716).get((Object) null);
        term106938 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term107008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term107196 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term106938, term106938.getClass(), "source", term107008);
        setField(term107102, term107102.getClass(), "parameters", null);
        setField(term107102, term107102.getClass(), "returnType", null);
        setField(term106938, term106938.getClass(), "call", term107102);
        setField(term106938, term106938.getClass(), "typeOfThis", term107196);
        setField(term106938, term106938.getClass(), "templateTypeName", null);
        setField(term106938, term106938.getClass(), "kind", enum153);
        term107706 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term107707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term107706, term107706.getClass(), "registry", null);
        setField(term107706, term107706.getClass(), "name", null);
        setIntField(term107707, term107707.getClass(), "type", 0);
        setField(term107707, term107707.getClass(), "next", null);
        setField(term107707, term107707.getClass(), "first", null);
        setField(term107707, term107707.getClass(), "last", null);
        setField(term107707, term107707.getClass(), "propListHead", null);
        setIntField(term107707, term107707.getClass(), "sourcePosition", 0);
        setField(term107707, term107707.getClass(), "jsType", null);
        setField(term107707, term107707.getClass(), "parent", null);
        setField(term107706, term107706.getClass(), "sourceNode", term107707);
        setField(term107706, term107706.getClass(), "parametersNode", null);
        setField(term107706, term107706.getClass(), "returnType", null);
        setField(term107708, term107708.getClass(), "reference", null);
        setField(term107708, term107708.getClass(), "sourceName", null);
        setIntField(term107708, term107708.getClass(), "lineno", 0);
        setIntField(term107708, term107708.getClass(), "charno", 0);
        setBooleanField(term107708, term107708.getClass(), "forgiving", false);
        setField(term107708, term107708.getClass(), "referencedType", null);
        setBooleanField(term107708, term107708.getClass(), "visited", false);
        setField(term107708, term107708.getClass(), "docInfo", null);
        setBooleanField(term107708, term107708.getClass(), "unknown", false);
        setBooleanField(term107708, term107708.getClass(), "resolved", false);
        setField(term107708, term107708.getClass(), "resolveResult", null);
        setField(term107708, term107708.getClass(), "registry", null);
        setField(term107706, term107706.getClass(), "typeOfThis", term107708);
        setField(term107706, term107706.getClass(), "templateTypeName", null);
        setBooleanField(term107706, term107706.getClass(), "inferredReturnType", false);
        setBooleanField(term107706, term107706.getClass(), "isConstructor", true);
        setBooleanField(term107706, term107706.getClass(), "isNativeType", false);
        Class<? extends Object> term108017 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term108016 = ((Class) term108017).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term108016).setAccessible(true);
        Object enum154 = ((Field) term108016).get((Object) null);
        term107709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term107710 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term107714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term107715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term107709, term107709.getClass(), "leastSupertypeVisitor", null);
        setField(term107709, term107709.getClass(), "greatestSubtypeVisitor", null);
        setField(term107710, term107710.getClass(), "parameters", null);
        setField(term107710, term107710.getClass(), "returnType", null);
        setBooleanField(term107710, term107710.getClass(), "returnTypeInferred", false);
        setBooleanField(term107710, term107710.getClass(), "resolved", false);
        setField(term107710, term107710.getClass(), "resolveResult", null);
        setField(term107710, term107710.getClass(), "registry", null);
        setField(term107709, term107709.getClass(), "call", term107710);
        setField(term107709, term107709.getClass(), "prototype", null);
        setField(term107709, term107709.getClass(), "kind", enum154);
        setField(term107714, term107714.getClass(), "reference", null);
        setField(term107714, term107714.getClass(), "sourceName", null);
        setIntField(term107714, term107714.getClass(), "lineno", 0);
        setIntField(term107714, term107714.getClass(), "charno", 0);
        setBooleanField(term107714, term107714.getClass(), "forgiving", false);
        setField(term107714, term107714.getClass(), "referencedType", null);
        setBooleanField(term107714, term107714.getClass(), "visited", false);
        setField(term107714, term107714.getClass(), "docInfo", null);
        setBooleanField(term107714, term107714.getClass(), "unknown", false);
        setBooleanField(term107714, term107714.getClass(), "resolved", false);
        setField(term107714, term107714.getClass(), "resolveResult", null);
        setField(term107714, term107714.getClass(), "registry", null);
        setField(term107709, term107709.getClass(), "typeOfThis", term107714);
        setIntField(term107715, term107715.getClass(), "type", 0);
        setField(term107715, term107715.getClass(), "next", null);
        setField(term107715, term107715.getClass(), "first", null);
        setField(term107715, term107715.getClass(), "last", null);
        setField(term107715, term107715.getClass(), "propListHead", null);
        setIntField(term107715, term107715.getClass(), "sourcePosition", 0);
        setField(term107715, term107715.getClass(), "jsType", null);
        setField(term107715, term107715.getClass(), "parent", null);
        setField(term107709, term107709.getClass(), "source", term107715);
        setField(term107709, term107709.getClass(), "implementedInterfaces", null);
        setField(term107709, term107709.getClass(), "subTypes", null);
        setField(term107709, term107709.getClass(), "templateTypeName", null);
        setField(term107709, term107709.getClass(), "className", null);
        setField(term107709, term107709.getClass(), "properties", null);
        setField(term107709, term107709.getClass(), "implicitPrototype", null);
        setBooleanField(term107709, term107709.getClass(), "nativeType", false);
        setBooleanField(term107709, term107709.getClass(), "prettyPrint", false);
        setBooleanField(term107709, term107709.getClass(), "visited", false);
        setField(term107709, term107709.getClass(), "docInfo", null);
        setBooleanField(term107709, term107709.getClass(), "unknown", false);
        setBooleanField(term107709, term107709.getClass(), "resolved", false);
        setField(term107709, term107709.getClass(), "resolveResult", null);
        setField(term107709, term107709.getClass(), "registry", null);
        term107702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term107671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term107702, term107702.getClass(), "registry", null);
        setField(term107702, term107702.getClass(), "name", null);
        setIntField(term107671, term107671.getClass(), "type", 0);
        setField(term107671, term107671.getClass(), "next", null);
        setField(term107671, term107671.getClass(), "first", null);
        setField(term107671, term107671.getClass(), "last", null);
        setField(term107671, term107671.getClass(), "propListHead", null);
        setIntField(term107671, term107671.getClass(), "sourcePosition", 0);
        setField(term107671, term107671.getClass(), "jsType", null);
        setField(term107671, term107671.getClass(), "parent", null);
        setField(term107702, term107702.getClass(), "sourceNode", term107671);
        setField(term107702, term107702.getClass(), "parametersNode", null);
        setField(term107702, term107702.getClass(), "returnType", null);
        setField(term107664, term107664.getClass(), "reference", null);
        setField(term107664, term107664.getClass(), "sourceName", null);
        setIntField(term107664, term107664.getClass(), "lineno", 0);
        setIntField(term107664, term107664.getClass(), "charno", 0);
        setBooleanField(term107664, term107664.getClass(), "forgiving", false);
        setField(term107664, term107664.getClass(), "referencedType", null);
        setBooleanField(term107664, term107664.getClass(), "visited", false);
        setField(term107664, term107664.getClass(), "docInfo", null);
        setBooleanField(term107664, term107664.getClass(), "unknown", false);
        setBooleanField(term107664, term107664.getClass(), "resolved", false);
        setField(term107664, term107664.getClass(), "resolveResult", null);
        setField(term107664, term107664.getClass(), "registry", null);
        setField(term107702, term107702.getClass(), "typeOfThis", term107664);
        setField(term107702, term107702.getClass(), "templateTypeName", null);
        setBooleanField(term107702, term107702.getClass(), "inferredReturnType", false);
        setBooleanField(term107702, term107702.getClass(), "isConstructor", true);
        setBooleanField(term107702, term107702.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term106938;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term106774, args);
        assertTrue(recursiveEquals(term106774, term107706));
        assertTrue(recursiveEquals(term106938, term107709));
        assertTrue(recursiveEquals(retValue, term107702));
    }

};


