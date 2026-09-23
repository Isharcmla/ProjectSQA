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

public class TypeInference_updateBind_113747613074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8958;
     Object term9000;

    public TypeInference_updateBind_113747613074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39592 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term39591 = ((Class) term39592).getDeclaredField((String) "INHERITED");
        ((Field) term39591).setAccessible(true);
        Object enum97 = ((Field) term39591).get((Object) null);
        term8958 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term8959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term8960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term8974 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8975 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term8978 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term8979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8985 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8986 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term8991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term8993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term8958, term8958.getClass(), "compiler", null);
        setField(term8960, term8960.getClass(), "name", "ABPtcyCzkR");
        setField(term8960, term8960.getClass(), "referencedType", null);
        setField(term8960, term8960.getClass(), "referencedObjType", null);
        setBooleanField(term8960, term8960.getClass(), "visited", true);
        setField(term8975, term8975.getClass(), "baseType", null);
        setField(term8975, term8975.getClass(), "extendedInterfaces", null);
        setField(term8975, term8975.getClass(), "implementedInterfaces", null);
        setField(term8975, term8975.getClass(), "parameters", null);
        setField(term8975, term8975.getClass(), "thrownTypes", null);
        setField(term8975, term8975.getClass(), "templateTypeNames", null);
        setField(term8975, term8975.getClass(), "description", null);
        setField(term8975, term8975.getClass(), "meaning", null);
        setField(term8975, term8975.getClass(), "deprecated", null);
        setField(term8975, term8975.getClass(), "license", null);
        setField(term8975, term8975.getClass(), "suppressions", null);
        setField(term8975, term8975.getClass(), "modifies", null);
        setField(term8975, term8975.getClass(), "lendsName", null);
        setBooleanField(term8975, term8975.getClass(), "ngInject", false);
        setBooleanField(term8975, term8975.getClass(), "wizaction", true);
        setField(term8974, term8974.getClass(), "info", term8975);
        setField(term8978, term8978.getClass(), "sourceComment", null);
        setField(term8978, term8978.getClass(), "markers", null);
        setField(term8978, term8978.getClass(), "parameters", null);
        setField(term8978, term8978.getClass(), "throwsDescriptions", null);
        setField(term8978, term8978.getClass(), "blockDescription", null);
        setField(term8978, term8978.getClass(), "fileOverview", null);
        setField(term8978, term8978.getClass(), "returnDescription", null);
        setField(term8978, term8978.getClass(), "version", null);
        setField(term8978, term8978.getClass(), "authors", null);
        setField(term8978, term8978.getClass(), "sees", null);
        setField(term8974, term8974.getClass(), "documentation", term8978);
        setIntField(term8979, term8979.getClass(), "type", 0);
        setField(term8979, term8979.getClass(), "next", null);
        setField(term8979, term8979.getClass(), "first", null);
        setField(term8979, term8979.getClass(), "last", null);
        setField(term8979, term8979.getClass(), "propListHead", null);
        setIntField(term8979, term8979.getClass(), "sourcePosition", 0);
        setField(term8979, term8979.getClass(), "jsType", null);
        setField(term8979, term8979.getClass(), "parent", null);
        setField(term8974, term8974.getClass(), "associatedNode", term8979);
        setField(term8974, term8974.getClass(), "visibility", enum97);
        setIntField(term8974, term8974.getClass(), "bitset", 2007134147);
        setField(term8985, term8985.getClass(), "root", null);
        setField(term8985, term8985.getClass(), "sourceName", null);
        setField(term8974, term8974.getClass(), "type", term8985);
        setField(term8986, term8986.getClass(), "root", null);
        setField(term8986, term8986.getClass(), "sourceName", null);
        setField(term8974, term8974.getClass(), "thisType", term8986);
        setBooleanField(term8974, term8974.getClass(), "includeDocumentation", true);
        setIntField(term8974, term8974.getClass(), "originalCommentPosition", 993388358);
        setField(term8960, term8960.getClass(), "docInfo", term8974);
        setBooleanField(term8960, term8960.getClass(), "unknown", false);
        setBooleanField(term8960, term8960.getClass(), "resolved", false);
        setField(term8960, term8960.getClass(), "resolveResult", null);
        setField(term8991, term8991.getClass(), "templateKeys", null);
        setField(term8991, term8991.getClass(), "templateValues", null);
        setField(term8991, term8991.getClass(), "resolvedTemplateValues", null);
        setField(term8991, term8991.getClass(), "registry", null);
        setField(term8960, term8960.getClass(), "templateTypeMap", term8991);
        setBooleanField(term8960, term8960.getClass(), "inTemplatedCheckVisit", true);
        setField(term8960, term8960.getClass(), "registry", null);
        setField(term8959, term8959.getClass(), "objectIndexTemplateKey", term8960);
        setField(term8993, term8993.getClass(), "name", null);
        setField(term8993, term8993.getClass(), "referencedType", null);
        setField(term8993, term8993.getClass(), "referencedObjType", null);
        setBooleanField(term8993, term8993.getClass(), "visited", false);
        setField(term8993, term8993.getClass(), "docInfo", null);
        setBooleanField(term8993, term8993.getClass(), "unknown", false);
        setBooleanField(term8993, term8993.getClass(), "resolved", false);
        setField(term8993, term8993.getClass(), "resolveResult", null);
        setField(term8993, term8993.getClass(), "templateTypeMap", null);
        setBooleanField(term8993, term8993.getClass(), "inTemplatedCheckVisit", false);
        setField(term8993, term8993.getClass(), "registry", null);
        setField(term8959, term8959.getClass(), "objectElementTemplateKey", term8993);
        setField(term8959, term8959.getClass(), "reporter", null);
        setField(term8959, term8959.getClass(), "nativeTypes", null);
        setField(term8959, term8959.getClass(), "namesToTypes", null);
        setField(term8959, term8959.getClass(), "namespaces", null);
        setField(term8959, term8959.getClass(), "nonNullableTypeNames", null);
        setField(term8959, term8959.getClass(), "forwardDeclaredTypes", null);
        setField(term8959, term8959.getClass(), "typesIndexedByProperty", null);
        setField(term8959, term8959.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term8959, term8959.getClass(), "greatestSubtypeByProperty", null);
        setField(term8959, term8959.getClass(), "interfaceToImplementors", null);
        setField(term8959, term8959.getClass(), "unresolvedNamedTypes", null);
        setField(term8959, term8959.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8959, term8959.getClass(), "lastGeneration", false);
        setField(term8959, term8959.getClass(), "templateTypes", null);
        setField(term8959, term8959.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term8959, term8959.getClass(), "tolerateUndefinedValues", false);
        setField(term8959, term8959.getClass(), "resolveMode", null);
        setField(term8958, term8958.getClass(), "registry", term8959);
        setField(term8958, term8958.getClass(), "reverseInterpreter", null);
        setField(term8958, term8958.getClass(), "syntacticScope", null);
        setField(term8958, term8958.getClass(), "functionScope", null);
        setField(term8958, term8958.getClass(), "bottomScope", null);
        setField(term8958, term8958.getClass(), "assertionFunctionsMap", null);
        setField(term8958, term8958.getClass(), "unknownType", null);
        setField(term8958, term8958.getClass(), "cfg", null);
        setField(term8958, term8958.getClass(), "joinOp", null);
        setField(term8958, term8958.getClass(), "orderedWorkSet", null);
        term9000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9000, term9000.getClass(), "type", -1697741155);
        setIntField(term9002, term9002.getClass(), "type", 1295839803);
        setIntField(term9004, term9004.getClass(), "type", -1891015523);
        setIntField(term9006, term9006.getClass(), "type", -1560631747);
        setIntField(term9008, term9008.getClass(), "type", 1215150180);
        setField(term9008, term9008.getClass(), "next", null);
        setField(term9008, term9008.getClass(), "first", null);
        setField(term9008, term9008.getClass(), "last", null);
        setField(term9008, term9008.getClass(), "propListHead", null);
        setIntField(term9008, term9008.getClass(), "sourcePosition", 0);
        setField(term9008, term9008.getClass(), "jsType", null);
        setField(term9008, term9008.getClass(), "parent", null);
        setField(term9006, term9006.getClass(), "next", term9008);
        setIntField(term9011, term9011.getClass(), "type", -1422859977);
        setField(term9011, term9011.getClass(), "next", null);
        setField(term9011, term9011.getClass(), "first", null);
        setField(term9011, term9011.getClass(), "last", term9008);
        setField(term9011, term9011.getClass(), "propListHead", null);
        setIntField(term9011, term9011.getClass(), "sourcePosition", 0);
        setField(term9011, term9011.getClass(), "jsType", null);
        setField(term9011, term9011.getClass(), "parent", null);
        setField(term9006, term9006.getClass(), "first", term9011);
        setField(term9006, term9006.getClass(), "last", term9004);
        setField(term9006, term9006.getClass(), "propListHead", null);
        setIntField(term9006, term9006.getClass(), "sourcePosition", 0);
        setField(term9006, term9006.getClass(), "jsType", null);
        setField(term9006, term9006.getClass(), "parent", null);
        setField(term9004, term9004.getClass(), "next", term9006);
        setField(term9004, term9004.getClass(), "first", term9008);
        setIntField(term9015, term9015.getClass(), "type", 68922753);
        setIntField(term9017, term9017.getClass(), "type", -220791533);
        setField(term9017, term9017.getClass(), "next", null);
        setField(term9017, term9017.getClass(), "first", term9011);
        setField(term9017, term9017.getClass(), "last", term9006);
        setField(term9017, term9017.getClass(), "propListHead", null);
        setIntField(term9017, term9017.getClass(), "sourcePosition", 0);
        setField(term9017, term9017.getClass(), "jsType", null);
        setField(term9017, term9017.getClass(), "parent", null);
        setField(term9015, term9015.getClass(), "next", term9017);
        setField(term9015, term9015.getClass(), "first", term9002);
        setField(term9015, term9015.getClass(), "last", term9002);
        setField(term9015, term9015.getClass(), "propListHead", null);
        setIntField(term9015, term9015.getClass(), "sourcePosition", 0);
        setField(term9015, term9015.getClass(), "jsType", null);
        setField(term9015, term9015.getClass(), "parent", null);
        setField(term9004, term9004.getClass(), "last", term9015);
        setField(term9004, term9004.getClass(), "propListHead", null);
        setIntField(term9004, term9004.getClass(), "sourcePosition", 0);
        setField(term9004, term9004.getClass(), "jsType", null);
        setField(term9004, term9004.getClass(), "parent", null);
        setField(term9002, term9002.getClass(), "next", term9004);
        setIntField(term9022, term9022.getClass(), "type", 1741500243);
        setField(term9022, term9022.getClass(), "next", term9015);
        setField(term9022, term9022.getClass(), "first", term9017);
        setField(term9022, term9022.getClass(), "last", term9000);
        setField(term9022, term9022.getClass(), "propListHead", null);
        setIntField(term9022, term9022.getClass(), "sourcePosition", 0);
        setField(term9022, term9022.getClass(), "jsType", null);
        setField(term9022, term9022.getClass(), "parent", null);
        setField(term9002, term9002.getClass(), "first", term9022);
        setField(term9002, term9002.getClass(), "last", term9022);
        setField(term9002, term9002.getClass(), "propListHead", null);
        setIntField(term9002, term9002.getClass(), "sourcePosition", 0);
        setField(term9002, term9002.getClass(), "jsType", null);
        setField(term9002, term9002.getClass(), "parent", null);
        setField(term9000, term9000.getClass(), "next", term9002);
        setField(term9000, term9000.getClass(), "first", term9006);
        setField(term9000, term9000.getClass(), "last", term9008);
        setField(term9000, term9000.getClass(), "propListHead", null);
        setIntField(term9000, term9000.getClass(), "sourcePosition", 0);
        setField(term9000, term9000.getClass(), "jsType", null);
        setField(term9000, term9000.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term9000;
        try {
            callMethod(klass, "updateBind", argTypes, term8958, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


