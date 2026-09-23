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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_traverseAdd_188658688356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6123;
     Object term6209;

    public TypeInference_traverseAdd_188658688356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6126 = new HashMap();
        HashMap term6135 = new HashMap();
        Set<Object> term30031 =  ((Map) term6135).keySet();
        HashSet term6134 = new HashSet((Collection<? extends Object>) term30031);
        HashMap term6142 = new HashMap();
        Set<Object> term30032 =  ((Map) term6142).keySet();
        HashSet term6141 = new HashSet((Collection<? extends Object>) term30032);
        HashMap term6149 = new HashMap();
        Set<Object> term30033 =  ((Map) term6149).keySet();
        HashSet term6148 = new HashSet((Collection<? extends Object>) term30033);
        HashMap term6155 = new HashMap();
        HashMap term6160 = new HashMap();
        Class<? extends Object> term30055 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term30054 = ((Class) term30055).getDeclaredField((String) "PROTECTED");
        ((Field) term30054).setAccessible(true);
        Object enum66 = ((Field) term30054).get((Object) null);
        term6123 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term6124 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6125 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term6181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6195 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6196 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term6197 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term6202 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6203 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term6207 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term6123, term6123.getClass(), "compiler", null);
        setField(term6124, term6124.getClass(), "reporter", null);
        setField(term6124, term6124.getClass(), "nativeTypes", term6125);
        setField(term6124, term6124.getClass(), "namesToTypes", term6126);
        setField(term6124, term6124.getClass(), "namespaces", term6134);
        setField(term6124, term6124.getClass(), "enumTypeNames", term6141);
        setField(term6124, term6124.getClass(), "forwardDeclaredTypes", term6148);
        setField(term6124, term6124.getClass(), "typesIndexedByProperty", term6155);
        setField(term6124, term6124.getClass(), "greatestSubtypeByProperty", term6160);
        setField(term6124, term6124.getClass(), "interfaceToImplementors", null);
        setField(term6124, term6124.getClass(), "unresolvedNamedTypes", null);
        setField(term6124, term6124.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6124, term6124.getClass(), "lastGeneration", false);
        setField(term6124, term6124.getClass(), "templateTypeName", "FjOiNAfBOc");
        setField(term6181, term6181.getClass(), "name", "iCCsaLHohG");
        setField(term6181, term6181.getClass(), "referencedType", null);
        setBooleanField(term6181, term6181.getClass(), "visited", true);
        setField(term6196, term6196.getClass(), "baseType", null);
        setField(term6196, term6196.getClass(), "implementedInterfaces", null);
        setField(term6196, term6196.getClass(), "parameters", null);
        setField(term6196, term6196.getClass(), "thrownTypes", null);
        setField(term6196, term6196.getClass(), "templateTypeName", null);
        setField(term6196, term6196.getClass(), "description", null);
        setField(term6196, term6196.getClass(), "deprecated", null);
        setField(term6196, term6196.getClass(), "license", null);
        setField(term6196, term6196.getClass(), "suppressions", null);
        setField(term6195, term6195.getClass(), "info", term6196);
        setField(term6197, term6197.getClass(), "markers", null);
        setField(term6197, term6197.getClass(), "parameters", null);
        setField(term6197, term6197.getClass(), "throwsDescriptions", null);
        setField(term6197, term6197.getClass(), "blockDescription", null);
        setField(term6197, term6197.getClass(), "fileOverview", null);
        setField(term6197, term6197.getClass(), "returnDescription", null);
        setField(term6197, term6197.getClass(), "version", null);
        setField(term6197, term6197.getClass(), "authors", null);
        setField(term6197, term6197.getClass(), "sees", null);
        setField(term6195, term6195.getClass(), "documentation", term6197);
        setField(term6195, term6195.getClass(), "sourceName", "");
        setField(term6195, term6195.getClass(), "visibility", enum66);
        setIntField(term6195, term6195.getClass(), "bitset", 371943306);
        setField(term6202, term6202.getClass(), "root", null);
        setField(term6202, term6202.getClass(), "sourceName", null);
        setField(term6202, term6202.getClass(), "registry", null);
        setField(term6195, term6195.getClass(), "type", term6202);
        setField(term6203, term6203.getClass(), "root", null);
        setField(term6203, term6203.getClass(), "sourceName", null);
        setField(term6203, term6203.getClass(), "registry", null);
        setField(term6195, term6195.getClass(), "thisType", term6203);
        setBooleanField(term6195, term6195.getClass(), "includeDocumentation", false);
        setField(term6181, term6181.getClass(), "docInfo", term6195);
        setBooleanField(term6181, term6181.getClass(), "unknown", false);
        setBooleanField(term6181, term6181.getClass(), "resolved", true);
        setField(term6181, term6181.getClass(), "resolveResult", null);
        setField(term6181, term6181.getClass(), "registry", null);
        setField(term6124, term6124.getClass(), "templateType", term6181);
        setField(term6123, term6123.getClass(), "registry", term6124);
        setField(term6123, term6123.getClass(), "reverseInterpreter", null);
        setField(term6207, term6207.getClass(), "vars", null);
        setField(term6207, term6207.getClass(), "parent", null);
        setField(term6207, term6207.getClass(), "rootNode", null);
        setField(term6207, term6207.getClass(), "thisType", null);
        setBooleanField(term6207, term6207.getClass(), "isBottom", false);
        setField(term6123, term6123.getClass(), "syntacticScope", term6207);
        setField(term6123, term6123.getClass(), "functionScope", null);
        setField(term6123, term6123.getClass(), "bottomScope", null);
        setField(term6123, term6123.getClass(), "assignedOuterLocalVars", null);
        setField(term6123, term6123.getClass(), "unflowableVarNames", null);
        setField(term6123, term6123.getClass(), "cfg", null);
        setField(term6123, term6123.getClass(), "joinOp", null);
        setField(term6123, term6123.getClass(), "orderedWorkSet", null);
        term6209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6222 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6232 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6209, term6209.getClass(), "type", -1747406163);
        setIntField(term6211, term6211.getClass(), "type", 1270666529);
        setIntField(term6213, term6213.getClass(), "type", 0);
        setField(term6213, term6213.getClass(), "next", null);
        setField(term6213, term6213.getClass(), "first", null);
        setField(term6213, term6213.getClass(), "last", null);
        setField(term6213, term6213.getClass(), "propListHead", null);
        setIntField(term6213, term6213.getClass(), "sourcePosition", 0);
        setField(term6213, term6213.getClass(), "jsType", null);
        setField(term6213, term6213.getClass(), "parent", null);
        setField(term6211, term6211.getClass(), "next", term6213);
        setIntField(term6216, term6216.getClass(), "type", 0);
        setField(term6216, term6216.getClass(), "next", null);
        setField(term6216, term6216.getClass(), "first", null);
        setField(term6216, term6216.getClass(), "last", null);
        setField(term6216, term6216.getClass(), "propListHead", null);
        setIntField(term6216, term6216.getClass(), "sourcePosition", 0);
        setField(term6216, term6216.getClass(), "jsType", null);
        setField(term6216, term6216.getClass(), "parent", null);
        setField(term6211, term6211.getClass(), "first", term6216);
        setIntField(term6219, term6219.getClass(), "type", 0);
        setField(term6219, term6219.getClass(), "next", null);
        setField(term6219, term6219.getClass(), "first", null);
        setField(term6219, term6219.getClass(), "last", null);
        setField(term6219, term6219.getClass(), "propListHead", null);
        setIntField(term6219, term6219.getClass(), "sourcePosition", 0);
        setField(term6219, term6219.getClass(), "jsType", null);
        setField(term6219, term6219.getClass(), "parent", null);
        setField(term6211, term6211.getClass(), "last", term6219);
        setField(term6222, term6222.getClass(), "next", null);
        setIntField(term6222, term6222.getClass(), "type", 0);
        setIntField(term6222, term6222.getClass(), "intValue", 0);
        setField(term6222, term6222.getClass(), "objectValue", null);
        setField(term6211, term6211.getClass(), "propListHead", term6222);
        setIntField(term6211, term6211.getClass(), "sourcePosition", -1022990421);
        setField(term6211, term6211.getClass(), "jsType", null);
        setField(term6211, term6211.getClass(), "parent", null);
        setField(term6209, term6209.getClass(), "next", term6211);
        setIntField(term6226, term6226.getClass(), "type", 0);
        setField(term6226, term6226.getClass(), "next", null);
        setField(term6226, term6226.getClass(), "first", null);
        setField(term6226, term6226.getClass(), "last", null);
        setField(term6226, term6226.getClass(), "propListHead", null);
        setIntField(term6226, term6226.getClass(), "sourcePosition", 0);
        setField(term6226, term6226.getClass(), "jsType", null);
        setField(term6226, term6226.getClass(), "parent", null);
        setField(term6209, term6209.getClass(), "first", term6226);
        setIntField(term6229, term6229.getClass(), "type", 0);
        setField(term6229, term6229.getClass(), "next", null);
        setField(term6229, term6229.getClass(), "first", null);
        setField(term6229, term6229.getClass(), "last", null);
        setField(term6229, term6229.getClass(), "propListHead", null);
        setIntField(term6229, term6229.getClass(), "sourcePosition", 0);
        setField(term6229, term6229.getClass(), "jsType", null);
        setField(term6229, term6229.getClass(), "parent", null);
        setField(term6209, term6209.getClass(), "last", term6229);
        setField(term6232, term6232.getClass(), "next", null);
        setIntField(term6232, term6232.getClass(), "type", 0);
        setIntField(term6232, term6232.getClass(), "intValue", 0);
        setField(term6232, term6232.getClass(), "objectValue", null);
        setField(term6209, term6209.getClass(), "propListHead", term6232);
        setIntField(term6209, term6209.getClass(), "sourcePosition", 1045547089);
        setField(term6209, term6209.getClass(), "jsType", null);
        setField(term6209, term6209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term6209;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term6123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


