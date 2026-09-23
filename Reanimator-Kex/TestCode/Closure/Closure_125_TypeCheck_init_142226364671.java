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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class TypeCheck_init_142226364671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750;
     Object enum21;

    public TypeCheck_init_142226364671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term768 = new ArrayList();
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ((ArrayList) term768).add((Object)null);
        ArrayList term771 = new ArrayList();
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        ((ArrayList) term771).add((Object)null);
        HashMap term774 = new HashMap();
        ArrayList term779 = new ArrayList();
        ((ArrayList) term779).add((Object)null);
        ((ArrayList) term779).add((Object)null);
        ((ArrayList) term779).add((Object)null);
        HashSet term786 = new HashSet();
        HashSet term787 = new HashSet();
        ArrayList term793 = new ArrayList();
        HashMap term796 = new HashMap();
        Class<? extends Object> term14107 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term14106 = ((Class) term14107).getDeclaredField((String) "PUBLIC");
        ((Field) term14106).setAccessible(true);
        Object enum20 = ((Field) term14106).get((Object) null);
        term750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term765 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term766 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term767 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term791 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term751, term751.getClass(), "name", "OWDIEULEFu");
        setField(term751, term751.getClass(), "referencedType", null);
        setField(term751, term751.getClass(), "referencedObjType", null);
        setBooleanField(term751, term751.getClass(), "visited", false);
        setField(term767, term767.getClass(), "root", null);
        setField(term767, term767.getClass(), "sourceName", null);
        setField(term766, term766.getClass(), "baseType", term767);
        setField(term766, term766.getClass(), "extendedInterfaces", term768);
        setField(term766, term766.getClass(), "implementedInterfaces", term771);
        setField(term766, term766.getClass(), "parameters", term774);
        setField(term766, term766.getClass(), "thrownTypes", term779);
        setField(term766, term766.getClass(), "templateTypeNames", null);
        setField(term766, term766.getClass(), "description", "");
        setField(term766, term766.getClass(), "meaning", "");
        setField(term766, term766.getClass(), "deprecated", "");
        setField(term766, term766.getClass(), "license", "");
        setField(term766, term766.getClass(), "suppressions", term786);
        setField(term766, term766.getClass(), "modifies", term787);
        setField(term766, term766.getClass(), "lendsName", "");
        setBooleanField(term766, term766.getClass(), "ngInject", true);
        setBooleanField(term766, term766.getClass(), "wizaction", false);
        setField(term765, term765.getClass(), "info", term766);
        setField(term791, term791.getClass(), "sourceComment", "");
        setField(term791, term791.getClass(), "markers", term793);
        setField(term791, term791.getClass(), "parameters", term796);
        setField(term791, term791.getClass(), "throwsDescriptions", null);
        setField(term791, term791.getClass(), "blockDescription", null);
        setField(term791, term791.getClass(), "fileOverview", null);
        setField(term791, term791.getClass(), "returnDescription", null);
        setField(term791, term791.getClass(), "version", null);
        setField(term791, term791.getClass(), "authors", null);
        setField(term791, term791.getClass(), "sees", null);
        setField(term765, term765.getClass(), "documentation", term791);
        setIntField(term801, term801.getClass(), "type", 0);
        setField(term801, term801.getClass(), "next", null);
        setField(term801, term801.getClass(), "first", null);
        setField(term801, term801.getClass(), "last", null);
        setField(term801, term801.getClass(), "propListHead", null);
        setIntField(term801, term801.getClass(), "sourcePosition", 0);
        setField(term801, term801.getClass(), "jsType", null);
        setField(term801, term801.getClass(), "parent", null);
        setField(term765, term765.getClass(), "associatedNode", term801);
        setField(term765, term765.getClass(), "visibility", enum20);
        setIntField(term765, term765.getClass(), "bitset", 865208305);
        setIntField(term809, term809.getClass(), "type", 1135664017);
        setField(term809, term809.getClass(), "next", null);
        setField(term809, term809.getClass(), "first", term801);
        setField(term809, term809.getClass(), "last", null);
        setField(term809, term809.getClass(), "propListHead", null);
        setIntField(term809, term809.getClass(), "sourcePosition", 0);
        setField(term809, term809.getClass(), "jsType", null);
        setField(term809, term809.getClass(), "parent", null);
        setField(term808, term808.getClass(), "root", term809);
        setField(term808, term808.getClass(), "sourceName", "");
        setField(term765, term765.getClass(), "type", term808);
        setIntField(term814, term814.getClass(), "type", 0);
        setField(term814, term814.getClass(), "next", null);
        setField(term814, term814.getClass(), "first", null);
        setField(term814, term814.getClass(), "last", null);
        setField(term814, term814.getClass(), "propListHead", null);
        setIntField(term814, term814.getClass(), "sourcePosition", 0);
        setField(term814, term814.getClass(), "jsType", null);
        setField(term814, term814.getClass(), "parent", null);
        setField(term813, term813.getClass(), "root", term814);
        setField(term813, term813.getClass(), "sourceName", "");
        setField(term765, term765.getClass(), "thisType", term813);
        setBooleanField(term765, term765.getClass(), "includeDocumentation", true);
        setIntField(term765, term765.getClass(), "originalCommentPosition", -1275173084);
        setField(term751, term751.getClass(), "docInfo", term765);
        setBooleanField(term751, term751.getClass(), "unknown", false);
        setBooleanField(term751, term751.getClass(), "resolved", true);
        setField(term751, term751.getClass(), "resolveResult", null);
        setField(term822, term822.getClass(), "templateKeys", null);
        setField(term822, term822.getClass(), "templateValues", null);
        setField(term822, term822.getClass(), "resolvedTemplateValues", null);
        setField(term822, term822.getClass(), "registry", null);
        setField(term751, term751.getClass(), "templateTypeMap", term822);
        setBooleanField(term751, term751.getClass(), "inTemplatedCheckVisit", false);
        setField(term751, term751.getClass(), "registry", null);
        setField(term750, term750.getClass(), "objectIndexTemplateKey", term751);
        setField(term824, term824.getClass(), "name", null);
        setField(term824, term824.getClass(), "referencedType", null);
        setField(term824, term824.getClass(), "referencedObjType", null);
        setBooleanField(term824, term824.getClass(), "visited", false);
        setField(term824, term824.getClass(), "docInfo", null);
        setBooleanField(term824, term824.getClass(), "unknown", false);
        setBooleanField(term824, term824.getClass(), "resolved", false);
        setField(term824, term824.getClass(), "resolveResult", null);
        setField(term824, term824.getClass(), "templateTypeMap", null);
        setBooleanField(term824, term824.getClass(), "inTemplatedCheckVisit", false);
        setField(term824, term824.getClass(), "registry", null);
        setField(term750, term750.getClass(), "objectElementTemplateKey", term824);
        setField(term750, term750.getClass(), "reporter", null);
        setField(term750, term750.getClass(), "nativeTypes", null);
        setField(term750, term750.getClass(), "namesToTypes", null);
        setField(term750, term750.getClass(), "namespaces", null);
        setField(term750, term750.getClass(), "nonNullableTypeNames", null);
        setField(term750, term750.getClass(), "forwardDeclaredTypes", null);
        setField(term750, term750.getClass(), "typesIndexedByProperty", null);
        setField(term750, term750.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term750, term750.getClass(), "greatestSubtypeByProperty", null);
        setField(term750, term750.getClass(), "interfaceToImplementors", null);
        setField(term750, term750.getClass(), "unresolvedNamedTypes", null);
        setField(term750, term750.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term750, term750.getClass(), "lastGeneration", false);
        setField(term750, term750.getClass(), "templateTypes", null);
        setField(term750, term750.getClass(), "emptyTemplateTypeMap", null);
        setBooleanField(term750, term750.getClass(), "tolerateUndefinedValues", false);
        setField(term750, term750.getClass(), "resolveMode", null);
        Class<? extends Object> term14372 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term14371 = ((Class) term14372).getDeclaredField((String) "OFF");
        ((Field) term14371).setAccessible(true);
        enum21 = ((Field) term14371).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term750;
        args[3] = enum21;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


