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
import java.lang.String;

public class TypeInference_isUnflowable_16288904097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19969;
     Object term20011;

    public TypeInference_isUnflowable_16288904097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63130 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term63129 = ((Class) term63130).getDeclaredField((String) "INHERITED");
        ((Field) term63129).setAccessible(true);
        Object enum156 = ((Field) term63129).get((Object) null);
        term19969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term19970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term19971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term19985 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19986 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19989 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19996 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19997 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term20004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term19969, term19969.getClass(), "compiler", null);
        setField(term19971, term19971.getClass(), "name", "CiPMRxGoHO");
        setField(term19971, term19971.getClass(), "referencedType", null);
        setField(term19971, term19971.getClass(), "referencedObjType", null);
        setBooleanField(term19971, term19971.getClass(), "visited", false);
        setField(term19986, term19986.getClass(), "baseType", null);
        setField(term19986, term19986.getClass(), "extendedInterfaces", null);
        setField(term19986, term19986.getClass(), "implementedInterfaces", null);
        setField(term19986, term19986.getClass(), "parameters", null);
        setField(term19986, term19986.getClass(), "thrownTypes", null);
        setField(term19986, term19986.getClass(), "templateTypeNames", null);
        setField(term19986, term19986.getClass(), "description", null);
        setField(term19986, term19986.getClass(), "meaning", null);
        setField(term19986, term19986.getClass(), "deprecated", null);
        setField(term19986, term19986.getClass(), "license", null);
        setField(term19986, term19986.getClass(), "suppressions", null);
        setField(term19986, term19986.getClass(), "modifies", null);
        setField(term19986, term19986.getClass(), "lendsName", null);
        setBooleanField(term19986, term19986.getClass(), "ngInject", false);
        setBooleanField(term19986, term19986.getClass(), "wizaction", true);
        setField(term19985, term19985.getClass(), "info", term19986);
        setField(term19989, term19989.getClass(), "sourceComment", null);
        setField(term19989, term19989.getClass(), "markers", null);
        setField(term19989, term19989.getClass(), "parameters", null);
        setField(term19989, term19989.getClass(), "throwsDescriptions", null);
        setField(term19989, term19989.getClass(), "blockDescription", null);
        setField(term19989, term19989.getClass(), "fileOverview", null);
        setField(term19989, term19989.getClass(), "returnDescription", null);
        setField(term19989, term19989.getClass(), "version", null);
        setField(term19989, term19989.getClass(), "authors", null);
        setField(term19989, term19989.getClass(), "sees", null);
        setField(term19985, term19985.getClass(), "documentation", term19989);
        setIntField(term19990, term19990.getClass(), "type", 0);
        setField(term19990, term19990.getClass(), "next", null);
        setField(term19990, term19990.getClass(), "first", null);
        setField(term19990, term19990.getClass(), "last", null);
        setField(term19990, term19990.getClass(), "propListHead", null);
        setIntField(term19990, term19990.getClass(), "sourcePosition", 0);
        setField(term19990, term19990.getClass(), "jsType", null);
        setField(term19990, term19990.getClass(), "parent", null);
        setField(term19985, term19985.getClass(), "associatedNode", term19990);
        setField(term19985, term19985.getClass(), "visibility", enum156);
        setIntField(term19985, term19985.getClass(), "bitset", 2109912812);
        setField(term19996, term19996.getClass(), "root", null);
        setField(term19996, term19996.getClass(), "sourceName", null);
        setField(term19985, term19985.getClass(), "type", term19996);
        setField(term19997, term19997.getClass(), "root", null);
        setField(term19997, term19997.getClass(), "sourceName", null);
        setField(term19985, term19985.getClass(), "thisType", term19997);
        setBooleanField(term19985, term19985.getClass(), "includeDocumentation", false);
        setIntField(term19985, term19985.getClass(), "originalCommentPosition", 1841286431);
        setField(term19971, term19971.getClass(), "docInfo", term19985);
        setBooleanField(term19971, term19971.getClass(), "unknown", true);
        setBooleanField(term19971, term19971.getClass(), "resolved", false);
        setField(term19971, term19971.getClass(), "resolveResult", null);
        setField(term20002, term20002.getClass(), "templateKeys", null);
        setField(term20002, term20002.getClass(), "templateValues", null);
        setField(term20002, term20002.getClass(), "resolvedTemplateValues", null);
        setField(term20002, term20002.getClass(), "registry", null);
        setField(term19971, term19971.getClass(), "templateTypeMap", term20002);
        setBooleanField(term19971, term19971.getClass(), "inTemplatedCheckVisit", false);
        setField(term19971, term19971.getClass(), "registry", null);
        setField(term19970, term19970.getClass(), "objectIndexTemplateKey", term19971);
        setField(term20004, term20004.getClass(), "name", null);
        setField(term20004, term20004.getClass(), "referencedType", null);
        setField(term20004, term20004.getClass(), "referencedObjType", null);
        setBooleanField(term20004, term20004.getClass(), "visited", false);
        setField(term20004, term20004.getClass(), "docInfo", null);
        setBooleanField(term20004, term20004.getClass(), "unknown", false);
        setBooleanField(term20004, term20004.getClass(), "resolved", false);
        setField(term20004, term20004.getClass(), "resolveResult", null);
        setField(term20004, term20004.getClass(), "templateTypeMap", null);
        setBooleanField(term20004, term20004.getClass(), "inTemplatedCheckVisit", false);
        setField(term20004, term20004.getClass(), "registry", null);
        setField(term19970, term19970.getClass(), "objectElementTemplateKey", term20004);
        setField(term19970, term19970.getClass(), "reporter", null);
        setField(term19970, term19970.getClass(), "nativeTypes", null);
        setField(term19970, term19970.getClass(), "namesToTypes", null);
        setField(term19970, term19970.getClass(), "namespaces", null);
        setField(term19970, term19970.getClass(), "nonNullableTypeNames", null);
        setField(term19970, term19970.getClass(), "forwardDeclaredTypes", null);
        setField(term19970, term19970.getClass(), "typesIndexedByProperty", null);
        setField(term19970, term19970.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term19970, term19970.getClass(), "greatestSubtypeByProperty", null);
        setField(term19970, term19970.getClass(), "interfaceToImplementors", null);
        setField(term19970, term19970.getClass(), "unresolvedNamedTypes", null);
        setField(term19970, term19970.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19970, term19970.getClass(), "lastGeneration", false);
        setField(term19970, term19970.getClass(), "templateTypes", null);
        setField(term19970, term19970.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term19970, term19970.getClass(), "tolerateUndefinedValues", false);
        setField(term19970, term19970.getClass(), "resolveMode", null);
        setField(term19969, term19969.getClass(), "registry", term19970);
        setField(term19969, term19969.getClass(), "reverseInterpreter", null);
        setField(term19969, term19969.getClass(), "syntacticScope", null);
        setField(term19969, term19969.getClass(), "functionScope", null);
        setField(term19969, term19969.getClass(), "bottomScope", null);
        setField(term19969, term19969.getClass(), "assertionFunctionsMap", null);
        setField(term19969, term19969.getClass(), "unknownType", null);
        setField(term19969, term19969.getClass(), "cfg", null);
        setField(term19969, term19969.getClass(), "joinOp", null);
        setField(term19969, term19969.getClass(), "orderedWorkSet", null);
        term20011 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term20024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20011, term20011.getClass(), "name", "yfHcOCDrGy");
        setIntField(term20024, term20024.getClass(), "type", -675283917);
        setIntField(term20026, term20026.getClass(), "type", -2093862988);
        setIntField(term20028, term20028.getClass(), "type", 1337828646);
        setIntField(term20030, term20030.getClass(), "type", 532666604);
        setField(term20030, term20030.getClass(), "next", null);
        setField(term20030, term20030.getClass(), "first", null);
        setField(term20030, term20030.getClass(), "last", null);
        setField(term20030, term20030.getClass(), "propListHead", null);
        setIntField(term20030, term20030.getClass(), "sourcePosition", 0);
        setField(term20030, term20030.getClass(), "jsType", null);
        setField(term20030, term20030.getClass(), "parent", null);
        setField(term20028, term20028.getClass(), "next", term20030);
        setIntField(term20033, term20033.getClass(), "type", 1478914037);
        setField(term20033, term20033.getClass(), "next", null);
        setField(term20033, term20033.getClass(), "first", term20024);
        setField(term20033, term20033.getClass(), "last", null);
        setField(term20033, term20033.getClass(), "propListHead", null);
        setIntField(term20033, term20033.getClass(), "sourcePosition", 0);
        setField(term20033, term20033.getClass(), "jsType", null);
        setField(term20033, term20033.getClass(), "parent", null);
        setField(term20028, term20028.getClass(), "first", term20033);
        setIntField(term20036, term20036.getClass(), "type", -1695750603);
        setField(term20036, term20036.getClass(), "next", null);
        setField(term20036, term20036.getClass(), "first", term20026);
        setField(term20036, term20036.getClass(), "last", null);
        setField(term20036, term20036.getClass(), "propListHead", null);
        setIntField(term20036, term20036.getClass(), "sourcePosition", 0);
        setField(term20036, term20036.getClass(), "jsType", null);
        setField(term20036, term20036.getClass(), "parent", null);
        setField(term20028, term20028.getClass(), "last", term20036);
        setField(term20028, term20028.getClass(), "propListHead", null);
        setIntField(term20028, term20028.getClass(), "sourcePosition", 0);
        setField(term20028, term20028.getClass(), "jsType", null);
        setField(term20028, term20028.getClass(), "parent", null);
        setField(term20026, term20026.getClass(), "next", term20028);
        setField(term20026, term20026.getClass(), "first", term20028);
        setIntField(term20040, term20040.getClass(), "type", -13725716);
        setField(term20040, term20040.getClass(), "next", term20036);
        setField(term20040, term20040.getClass(), "first", term20033);
        setField(term20040, term20040.getClass(), "last", term20033);
        setField(term20040, term20040.getClass(), "propListHead", null);
        setIntField(term20040, term20040.getClass(), "sourcePosition", 0);
        setField(term20040, term20040.getClass(), "jsType", null);
        setField(term20040, term20040.getClass(), "parent", null);
        setField(term20026, term20026.getClass(), "last", term20040);
        setField(term20026, term20026.getClass(), "propListHead", null);
        setIntField(term20026, term20026.getClass(), "sourcePosition", 0);
        setField(term20026, term20026.getClass(), "jsType", null);
        setField(term20026, term20026.getClass(), "parent", null);
        setField(term20024, term20024.getClass(), "next", term20026);
        setField(term20024, term20024.getClass(), "first", term20033);
        setIntField(term20044, term20044.getClass(), "type", 0);
        setField(term20044, term20044.getClass(), "next", null);
        setField(term20044, term20044.getClass(), "first", null);
        setField(term20044, term20044.getClass(), "last", null);
        setField(term20044, term20044.getClass(), "propListHead", null);
        setIntField(term20044, term20044.getClass(), "sourcePosition", 0);
        setField(term20044, term20044.getClass(), "jsType", null);
        setField(term20044, term20044.getClass(), "parent", null);
        setField(term20024, term20024.getClass(), "last", term20044);
        setField(term20024, term20024.getClass(), "propListHead", null);
        setIntField(term20024, term20024.getClass(), "sourcePosition", 0);
        setField(term20024, term20024.getClass(), "jsType", null);
        setField(term20024, term20024.getClass(), "parent", null);
        setField(term20011, term20011.getClass(), "nameNode", term20024);
        setField(term20011, term20011.getClass(), "type", null);
        setBooleanField(term20011, term20011.getClass(), "typeInferred", false);
        setField(term20011, term20011.getClass(), "input", null);
        setIntField(term20011, term20011.getClass(), "index", 0);
        setField(term20011, term20011.getClass(), "scope", null);
        setBooleanField(term20011, term20011.getClass(), "markedEscaped", false);
        setBooleanField(term20011, term20011.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term20011;
        try {
            callMethod(klass, "isUnflowable", argTypes, term19969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


