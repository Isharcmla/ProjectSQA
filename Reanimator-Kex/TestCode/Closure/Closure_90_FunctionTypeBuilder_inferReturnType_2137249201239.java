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

public class FunctionTypeBuilder_inferReturnType_2137249201239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91454;
     Object term91664;
     Object term91702;
     Object term91706;
     Object term91690;

    public FunctionTypeBuilder_inferReturnType_2137249201239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91454 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term91584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term91454, term91454.getClass(), "templateTypeName", "");
        setField(term91454, term91454.getClass(), "returnType", term91584);
        term91664 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term91664, term91664.getClass(), "bitset", -1610612736);
        term91702 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term91703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term91702, term91702.getClass(), "fnName", null);
        setField(term91702, term91702.getClass(), "compiler", null);
        setField(term91702, term91702.getClass(), "codingConvention", null);
        setField(term91702, term91702.getClass(), "typeRegistry", null);
        setField(term91702, term91702.getClass(), "errorRoot", null);
        setField(term91702, term91702.getClass(), "sourceName", null);
        setField(term91702, term91702.getClass(), "scope", null);
        setField(term91703, term91703.getClass(), "elementsType", null);
        setField(term91703, term91703.getClass(), "elements", null);
        setField(term91703, term91703.getClass(), "className", null);
        setField(term91703, term91703.getClass(), "properties", null);
        setBooleanField(term91703, term91703.getClass(), "nativeType", false);
        setField(term91703, term91703.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term91703, term91703.getClass(), "prettyPrint", false);
        setBooleanField(term91703, term91703.getClass(), "visited", false);
        setField(term91703, term91703.getClass(), "docInfo", null);
        setBooleanField(term91703, term91703.getClass(), "unknown", false);
        setBooleanField(term91703, term91703.getClass(), "resolved", false);
        setField(term91703, term91703.getClass(), "resolveResult", null);
        setField(term91703, term91703.getClass(), "registry", null);
        setField(term91702, term91702.getClass(), "returnType", term91703);
        setBooleanField(term91702, term91702.getClass(), "returnTypeInferred", false);
        setField(term91702, term91702.getClass(), "implementedInterfaces", null);
        setField(term91702, term91702.getClass(), "baseType", null);
        setField(term91702, term91702.getClass(), "thisType", null);
        setBooleanField(term91702, term91702.getClass(), "isConstructor", false);
        setBooleanField(term91702, term91702.getClass(), "isInterface", false);
        setField(term91702, term91702.getClass(), "parametersNode", null);
        setField(term91702, term91702.getClass(), "sourceNode", null);
        setField(term91702, term91702.getClass(), "templateTypeName", "");
        term91706 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term91706, term91706.getClass(), "info", null);
        setField(term91706, term91706.getClass(), "documentation", null);
        setField(term91706, term91706.getClass(), "sourceName", null);
        setField(term91706, term91706.getClass(), "visibility", null);
        setIntField(term91706, term91706.getClass(), "bitset", -1610612736);
        setField(term91706, term91706.getClass(), "type", null);
        setField(term91706, term91706.getClass(), "thisType", null);
        setBooleanField(term91706, term91706.getClass(), "includeDocumentation", false);
        term91690 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term91691 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term91690, term91690.getClass(), "fnName", null);
        setField(term91690, term91690.getClass(), "compiler", null);
        setField(term91690, term91690.getClass(), "codingConvention", null);
        setField(term91690, term91690.getClass(), "typeRegistry", null);
        setField(term91690, term91690.getClass(), "errorRoot", null);
        setField(term91690, term91690.getClass(), "sourceName", null);
        setField(term91690, term91690.getClass(), "scope", null);
        setField(term91691, term91691.getClass(), "elementsType", null);
        setField(term91691, term91691.getClass(), "elements", null);
        setField(term91691, term91691.getClass(), "className", null);
        setField(term91691, term91691.getClass(), "properties", null);
        setBooleanField(term91691, term91691.getClass(), "nativeType", false);
        setField(term91691, term91691.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term91691, term91691.getClass(), "prettyPrint", false);
        setBooleanField(term91691, term91691.getClass(), "visited", false);
        setField(term91691, term91691.getClass(), "docInfo", null);
        setBooleanField(term91691, term91691.getClass(), "unknown", false);
        setBooleanField(term91691, term91691.getClass(), "resolved", false);
        setField(term91691, term91691.getClass(), "resolveResult", null);
        setField(term91691, term91691.getClass(), "registry", null);
        setField(term91690, term91690.getClass(), "returnType", term91691);
        setBooleanField(term91690, term91690.getClass(), "returnTypeInferred", false);
        setField(term91690, term91690.getClass(), "implementedInterfaces", null);
        setField(term91690, term91690.getClass(), "baseType", null);
        setField(term91690, term91690.getClass(), "thisType", null);
        setBooleanField(term91690, term91690.getClass(), "isConstructor", false);
        setBooleanField(term91690, term91690.getClass(), "isInterface", false);
        setField(term91690, term91690.getClass(), "parametersNode", null);
        setField(term91690, term91690.getClass(), "sourceNode", null);
        setField(term91690, term91690.getClass(), "templateTypeName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = term91664;
        Object retValue = callMethod(klass, "inferReturnType", argTypes, term91454, args);
        assertTrue(recursiveEquals(term91454, term91702));
        assertTrue(recursiveEquals(term91664, term91706));
        assertTrue(recursiveEquals(retValue, term91690));
    }

};


