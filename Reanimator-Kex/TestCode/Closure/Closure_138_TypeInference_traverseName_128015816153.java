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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_traverseName_128015816153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4911;
     Object term4997;

    public TypeInference_traverseName_128015816153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4914 = new HashMap();
        HashMap term4923 = new HashMap();
        Set<Object> term27799 =  ((Map) term4923).keySet();
        HashSet term4922 = new HashSet((Collection<? extends Object>) term27799);
        HashMap term4930 = new HashMap();
        Set<Object> term27800 =  ((Map) term4930).keySet();
        HashSet term4929 = new HashSet((Collection<? extends Object>) term27800);
        HashMap term4937 = new HashMap();
        Set<Object> term27801 =  ((Map) term4937).keySet();
        HashSet term4936 = new HashSet((Collection<? extends Object>) term27801);
        HashMap term4943 = new HashMap();
        HashMap term4948 = new HashMap();
        Class<? extends Object> term27823 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term27822 = ((Class) term27823).getDeclaredField((String) "PRIVATE");
        ((Field) term27822).setAccessible(true);
        Object enum62 = ((Field) term27822).get((Object) null);
        term4911 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4913 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term4969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term4983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term4984 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term4985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term4990 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4991 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term4995 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4911, term4911.getClass(), "compiler", null);
        setField(term4912, term4912.getClass(), "reporter", null);
        setField(term4912, term4912.getClass(), "nativeTypes", term4913);
        setField(term4912, term4912.getClass(), "namesToTypes", term4914);
        setField(term4912, term4912.getClass(), "namespaces", term4922);
        setField(term4912, term4912.getClass(), "enumTypeNames", term4929);
        setField(term4912, term4912.getClass(), "forwardDeclaredTypes", term4936);
        setField(term4912, term4912.getClass(), "typesIndexedByProperty", term4943);
        setField(term4912, term4912.getClass(), "greatestSubtypeByProperty", term4948);
        setField(term4912, term4912.getClass(), "interfaceToImplementors", null);
        setField(term4912, term4912.getClass(), "unresolvedNamedTypes", null);
        setField(term4912, term4912.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4912, term4912.getClass(), "lastGeneration", false);
        setField(term4912, term4912.getClass(), "templateTypeName", "tlQSNgTkQX");
        setField(term4969, term4969.getClass(), "name", "PCipZnmBOF");
        setField(term4969, term4969.getClass(), "referencedType", null);
        setBooleanField(term4969, term4969.getClass(), "visited", false);
        setField(term4984, term4984.getClass(), "baseType", null);
        setField(term4984, term4984.getClass(), "implementedInterfaces", null);
        setField(term4984, term4984.getClass(), "parameters", null);
        setField(term4984, term4984.getClass(), "thrownTypes", null);
        setField(term4984, term4984.getClass(), "templateTypeName", null);
        setField(term4984, term4984.getClass(), "description", null);
        setField(term4984, term4984.getClass(), "deprecated", null);
        setField(term4984, term4984.getClass(), "license", null);
        setField(term4984, term4984.getClass(), "suppressions", null);
        setField(term4983, term4983.getClass(), "info", term4984);
        setField(term4985, term4985.getClass(), "markers", null);
        setField(term4985, term4985.getClass(), "parameters", null);
        setField(term4985, term4985.getClass(), "throwsDescriptions", null);
        setField(term4985, term4985.getClass(), "blockDescription", null);
        setField(term4985, term4985.getClass(), "fileOverview", null);
        setField(term4985, term4985.getClass(), "returnDescription", null);
        setField(term4985, term4985.getClass(), "version", null);
        setField(term4985, term4985.getClass(), "authors", null);
        setField(term4985, term4985.getClass(), "sees", null);
        setField(term4983, term4983.getClass(), "documentation", term4985);
        setField(term4983, term4983.getClass(), "sourceName", "");
        setField(term4983, term4983.getClass(), "visibility", enum62);
        setIntField(term4983, term4983.getClass(), "bitset", 197109649);
        setField(term4990, term4990.getClass(), "root", null);
        setField(term4990, term4990.getClass(), "sourceName", null);
        setField(term4990, term4990.getClass(), "registry", null);
        setField(term4983, term4983.getClass(), "type", term4990);
        setField(term4991, term4991.getClass(), "root", null);
        setField(term4991, term4991.getClass(), "sourceName", null);
        setField(term4991, term4991.getClass(), "registry", null);
        setField(term4983, term4983.getClass(), "thisType", term4991);
        setBooleanField(term4983, term4983.getClass(), "includeDocumentation", true);
        setField(term4969, term4969.getClass(), "docInfo", term4983);
        setBooleanField(term4969, term4969.getClass(), "unknown", true);
        setBooleanField(term4969, term4969.getClass(), "resolved", false);
        setField(term4969, term4969.getClass(), "resolveResult", null);
        setField(term4969, term4969.getClass(), "registry", null);
        setField(term4912, term4912.getClass(), "templateType", term4969);
        setField(term4911, term4911.getClass(), "registry", term4912);
        setField(term4911, term4911.getClass(), "reverseInterpreter", null);
        setField(term4995, term4995.getClass(), "vars", null);
        setField(term4995, term4995.getClass(), "parent", null);
        setField(term4995, term4995.getClass(), "rootNode", null);
        setField(term4995, term4995.getClass(), "thisType", null);
        setBooleanField(term4995, term4995.getClass(), "isBottom", false);
        setField(term4911, term4911.getClass(), "syntacticScope", term4995);
        setField(term4911, term4911.getClass(), "functionScope", null);
        setField(term4911, term4911.getClass(), "bottomScope", null);
        setField(term4911, term4911.getClass(), "assignedOuterLocalVars", null);
        setField(term4911, term4911.getClass(), "unflowableVarNames", null);
        setField(term4911, term4911.getClass(), "cfg", null);
        setField(term4911, term4911.getClass(), "joinOp", null);
        setField(term4911, term4911.getClass(), "orderedWorkSet", null);
        term4997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5010 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5020 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4997, term4997.getClass(), "type", 991356662);
        setIntField(term4999, term4999.getClass(), "type", -1896376975);
        setIntField(term5001, term5001.getClass(), "type", 0);
        setField(term5001, term5001.getClass(), "next", null);
        setField(term5001, term5001.getClass(), "first", null);
        setField(term5001, term5001.getClass(), "last", null);
        setField(term5001, term5001.getClass(), "propListHead", null);
        setIntField(term5001, term5001.getClass(), "sourcePosition", 0);
        setField(term5001, term5001.getClass(), "jsType", null);
        setField(term5001, term5001.getClass(), "parent", null);
        setField(term4999, term4999.getClass(), "next", term5001);
        setIntField(term5004, term5004.getClass(), "type", 0);
        setField(term5004, term5004.getClass(), "next", null);
        setField(term5004, term5004.getClass(), "first", null);
        setField(term5004, term5004.getClass(), "last", null);
        setField(term5004, term5004.getClass(), "propListHead", null);
        setIntField(term5004, term5004.getClass(), "sourcePosition", 0);
        setField(term5004, term5004.getClass(), "jsType", null);
        setField(term5004, term5004.getClass(), "parent", null);
        setField(term4999, term4999.getClass(), "first", term5004);
        setIntField(term5007, term5007.getClass(), "type", 0);
        setField(term5007, term5007.getClass(), "next", null);
        setField(term5007, term5007.getClass(), "first", null);
        setField(term5007, term5007.getClass(), "last", null);
        setField(term5007, term5007.getClass(), "propListHead", null);
        setIntField(term5007, term5007.getClass(), "sourcePosition", 0);
        setField(term5007, term5007.getClass(), "jsType", null);
        setField(term5007, term5007.getClass(), "parent", null);
        setField(term4999, term4999.getClass(), "last", term5007);
        setField(term5010, term5010.getClass(), "next", null);
        setIntField(term5010, term5010.getClass(), "type", 0);
        setIntField(term5010, term5010.getClass(), "intValue", 0);
        setField(term5010, term5010.getClass(), "objectValue", null);
        setField(term4999, term4999.getClass(), "propListHead", term5010);
        setIntField(term4999, term4999.getClass(), "sourcePosition", 1687361082);
        setField(term4999, term4999.getClass(), "jsType", null);
        setField(term4999, term4999.getClass(), "parent", null);
        setField(term4997, term4997.getClass(), "next", term4999);
        setIntField(term5014, term5014.getClass(), "type", 0);
        setField(term5014, term5014.getClass(), "next", null);
        setField(term5014, term5014.getClass(), "first", null);
        setField(term5014, term5014.getClass(), "last", null);
        setField(term5014, term5014.getClass(), "propListHead", null);
        setIntField(term5014, term5014.getClass(), "sourcePosition", 0);
        setField(term5014, term5014.getClass(), "jsType", null);
        setField(term5014, term5014.getClass(), "parent", null);
        setField(term4997, term4997.getClass(), "first", term5014);
        setIntField(term5017, term5017.getClass(), "type", 0);
        setField(term5017, term5017.getClass(), "next", null);
        setField(term5017, term5017.getClass(), "first", null);
        setField(term5017, term5017.getClass(), "last", null);
        setField(term5017, term5017.getClass(), "propListHead", null);
        setIntField(term5017, term5017.getClass(), "sourcePosition", 0);
        setField(term5017, term5017.getClass(), "jsType", null);
        setField(term5017, term5017.getClass(), "parent", null);
        setField(term4997, term4997.getClass(), "last", term5017);
        setField(term5020, term5020.getClass(), "next", null);
        setIntField(term5020, term5020.getClass(), "type", 0);
        setIntField(term5020, term5020.getClass(), "intValue", 0);
        setField(term5020, term5020.getClass(), "objectValue", null);
        setField(term4997, term4997.getClass(), "propListHead", term5020);
        setIntField(term4997, term4997.getClass(), "sourcePosition", 584893196);
        setField(term4997, term4997.getClass(), "jsType", null);
        setField(term4997, term4997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term4997;
        args[1] = null;
        try {
            callMethod(klass, "traverseName", argTypes, term4911, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


