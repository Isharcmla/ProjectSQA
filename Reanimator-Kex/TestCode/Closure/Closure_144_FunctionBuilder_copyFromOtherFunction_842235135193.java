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

public class FunctionBuilder_copyFromOtherFunction_842235135193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132814;
     Object term132922;
     Object term133189;
     Object term133193;
     Object term133183;

    public FunctionBuilder_copyFromOtherFunction_842235135193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132814 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        setField(term132814, term132814.getClass(), "name", null);
        setField(term132814, term132814.getClass(), "sourceNode", null);
        setField(term132814, term132814.getClass(), "parametersNode", null);
        setField(term132814, term132814.getClass(), "returnType", null);
        term132922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term133054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term133142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term132922, term132922.getClass(), "className", "");
        setField(term132922, term132922.getClass(), "source", null);
        setField(term133054, term133054.getClass(), "parameters", null);
        setField(term133054, term133054.getClass(), "returnType", null);
        setField(term132922, term132922.getClass(), "call", term133054);
        setField(term132922, term132922.getClass(), "typeOfThis", term133142);
        term133189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term133192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term133189, term133189.getClass(), "registry", null);
        setField(term133189, term133189.getClass(), "name", "");
        setField(term133189, term133189.getClass(), "sourceNode", null);
        setField(term133189, term133189.getClass(), "parametersNode", null);
        setField(term133189, term133189.getClass(), "returnType", null);
        setField(term133192, term133192.getClass(), "leastSupertypeVisitor", null);
        setField(term133192, term133192.getClass(), "greatestSubtypeVisitor", null);
        setField(term133192, term133192.getClass(), "call", null);
        setField(term133192, term133192.getClass(), "prototype", null);
        setField(term133192, term133192.getClass(), "kind", null);
        setField(term133192, term133192.getClass(), "typeOfThis", null);
        setField(term133192, term133192.getClass(), "source", null);
        setField(term133192, term133192.getClass(), "implementedInterfaces", null);
        setField(term133192, term133192.getClass(), "subTypes", null);
        setField(term133192, term133192.getClass(), "templateTypeName", null);
        setField(term133192, term133192.getClass(), "className", null);
        setField(term133192, term133192.getClass(), "properties", null);
        setField(term133192, term133192.getClass(), "implicitPrototype", null);
        setBooleanField(term133192, term133192.getClass(), "nativeType", false);
        setBooleanField(term133192, term133192.getClass(), "prettyPrint", false);
        setBooleanField(term133192, term133192.getClass(), "visited", false);
        setField(term133192, term133192.getClass(), "docInfo", null);
        setBooleanField(term133192, term133192.getClass(), "unknown", false);
        setBooleanField(term133192, term133192.getClass(), "resolved", false);
        setField(term133192, term133192.getClass(), "resolveResult", null);
        setField(term133192, term133192.getClass(), "registry", null);
        setField(term133189, term133189.getClass(), "typeOfThis", term133192);
        setField(term133189, term133189.getClass(), "templateTypeName", null);
        setBooleanField(term133189, term133189.getClass(), "inferredReturnType", false);
        setBooleanField(term133189, term133189.getClass(), "isConstructor", false);
        setBooleanField(term133189, term133189.getClass(), "isNativeType", false);
        term133193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term133194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term133195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term133193, term133193.getClass(), "this$0", null);
        setField(term133194, term133194.getClass(), "parameters", null);
        setField(term133194, term133194.getClass(), "returnType", null);
        setBooleanField(term133194, term133194.getClass(), "returnTypeInferred", false);
        setBooleanField(term133194, term133194.getClass(), "resolved", false);
        setField(term133194, term133194.getClass(), "resolveResult", null);
        setField(term133194, term133194.getClass(), "registry", null);
        setField(term133193, term133193.getClass(), "call", term133194);
        setField(term133193, term133193.getClass(), "prototype", null);
        setField(term133193, term133193.getClass(), "kind", null);
        setField(term133195, term133195.getClass(), "leastSupertypeVisitor", null);
        setField(term133195, term133195.getClass(), "greatestSubtypeVisitor", null);
        setField(term133195, term133195.getClass(), "call", null);
        setField(term133195, term133195.getClass(), "prototype", null);
        setField(term133195, term133195.getClass(), "kind", null);
        setField(term133195, term133195.getClass(), "typeOfThis", null);
        setField(term133195, term133195.getClass(), "source", null);
        setField(term133195, term133195.getClass(), "implementedInterfaces", null);
        setField(term133195, term133195.getClass(), "subTypes", null);
        setField(term133195, term133195.getClass(), "templateTypeName", null);
        setField(term133195, term133195.getClass(), "className", null);
        setField(term133195, term133195.getClass(), "properties", null);
        setField(term133195, term133195.getClass(), "implicitPrototype", null);
        setBooleanField(term133195, term133195.getClass(), "nativeType", false);
        setBooleanField(term133195, term133195.getClass(), "prettyPrint", false);
        setBooleanField(term133195, term133195.getClass(), "visited", false);
        setField(term133195, term133195.getClass(), "docInfo", null);
        setBooleanField(term133195, term133195.getClass(), "unknown", false);
        setBooleanField(term133195, term133195.getClass(), "resolved", false);
        setField(term133195, term133195.getClass(), "resolveResult", null);
        setField(term133195, term133195.getClass(), "registry", null);
        setField(term133193, term133193.getClass(), "typeOfThis", term133195);
        setField(term133193, term133193.getClass(), "source", null);
        setField(term133193, term133193.getClass(), "implementedInterfaces", null);
        setField(term133193, term133193.getClass(), "subTypes", null);
        setField(term133193, term133193.getClass(), "templateTypeName", null);
        setField(term133193, term133193.getClass(), "className", "");
        setField(term133193, term133193.getClass(), "properties", null);
        setField(term133193, term133193.getClass(), "implicitPrototype", null);
        setBooleanField(term133193, term133193.getClass(), "nativeType", false);
        setBooleanField(term133193, term133193.getClass(), "prettyPrint", false);
        setBooleanField(term133193, term133193.getClass(), "visited", false);
        setField(term133193, term133193.getClass(), "docInfo", null);
        setBooleanField(term133193, term133193.getClass(), "unknown", false);
        setBooleanField(term133193, term133193.getClass(), "resolved", false);
        setField(term133193, term133193.getClass(), "resolveResult", null);
        setField(term133193, term133193.getClass(), "registry", null);
        term133183 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term133150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term133183, term133183.getClass(), "registry", null);
        setField(term133183, term133183.getClass(), "name", "");
        setField(term133183, term133183.getClass(), "sourceNode", null);
        setField(term133183, term133183.getClass(), "parametersNode", null);
        setField(term133183, term133183.getClass(), "returnType", null);
        setField(term133150, term133150.getClass(), "leastSupertypeVisitor", null);
        setField(term133150, term133150.getClass(), "greatestSubtypeVisitor", null);
        setField(term133150, term133150.getClass(), "call", null);
        setField(term133150, term133150.getClass(), "prototype", null);
        setField(term133150, term133150.getClass(), "kind", null);
        setField(term133150, term133150.getClass(), "typeOfThis", null);
        setField(term133150, term133150.getClass(), "source", null);
        setField(term133150, term133150.getClass(), "implementedInterfaces", null);
        setField(term133150, term133150.getClass(), "subTypes", null);
        setField(term133150, term133150.getClass(), "templateTypeName", null);
        setField(term133150, term133150.getClass(), "className", null);
        setField(term133150, term133150.getClass(), "properties", null);
        setField(term133150, term133150.getClass(), "implicitPrototype", null);
        setBooleanField(term133150, term133150.getClass(), "nativeType", false);
        setBooleanField(term133150, term133150.getClass(), "prettyPrint", false);
        setBooleanField(term133150, term133150.getClass(), "visited", false);
        setField(term133150, term133150.getClass(), "docInfo", null);
        setBooleanField(term133150, term133150.getClass(), "unknown", false);
        setBooleanField(term133150, term133150.getClass(), "resolved", false);
        setField(term133150, term133150.getClass(), "resolveResult", null);
        setField(term133150, term133150.getClass(), "registry", null);
        setField(term133183, term133183.getClass(), "typeOfThis", term133150);
        setField(term133183, term133183.getClass(), "templateTypeName", null);
        setBooleanField(term133183, term133183.getClass(), "inferredReturnType", false);
        setBooleanField(term133183, term133183.getClass(), "isConstructor", false);
        setBooleanField(term133183, term133183.getClass(), "isNativeType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term132922;
        Object retValue = callMethod(klass, "copyFromOtherFunction", argTypes, term132814, args);
        assertTrue(recursiveEquals(term132814, term133189));
        assertTrue(recursiveEquals(term132922, term133193));
        assertTrue(recursiveEquals(retValue, term133183));
    }

};


