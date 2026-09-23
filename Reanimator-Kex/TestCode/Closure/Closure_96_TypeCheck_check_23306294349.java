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
import java.util.ArrayList;
import java.lang.Boolean;

public class TypeCheck_check_23306294349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4949;
     Object term5028;
     Object term5055;

    public TypeCheck_check_23306294349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4953 = new HashMap();
        HashMap term4960 = new HashMap();
        Set<Object> term32135 =  ((Map) term4960).keySet();
        HashSet term4959 = new HashSet((Collection<? extends Object>) term32135);
        HashMap term4966 = new HashMap();
        Set<Object> term32136 =  ((Map) term4966).keySet();
        HashSet term4965 = new HashSet((Collection<? extends Object>) term32136);
        HashMap term4972 = new HashMap();
        Set<Object> term32137 =  ((Map) term4972).keySet();
        HashSet term4971 = new HashSet((Collection<? extends Object>) term32137);
        HashMap term4977 = new HashMap();
        HashMap term4982 = new HashMap();
        Class<? extends Object> term32149 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term32148 = ((Class) term32149).getDeclaredField((String) "IMMEDIATE");
        ((Field) term32148).setAccessible(true);
        Object enum66 = ((Field) term32148).get((Object) null);
        Object term5013 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term5013, term5013.getClass(), "typeA", null);
        setField(term5013, term5013.getClass(), "typeB", null);
        Object term5014 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term5014, term5014.getClass(), "typeA", null);
        setField(term5014, term5014.getClass(), "typeB", null);
        ArrayList term5011 = new ArrayList();
        ((ArrayList) term5011).add(term5013);
        ((ArrayList) term5011).add(term5014);
        term4949 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term4950 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term4951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4952 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term5001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term5020 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4949, term4949.getClass(), "compiler", null);
        setField(term4950, term4950.getClass(), "compiler", null);
        setField(term4951, term4951.getClass(), "reporter", null);
        setField(term4951, term4951.getClass(), "nativeTypes", term4952);
        setField(term4951, term4951.getClass(), "namesToTypes", term4953);
        setField(term4951, term4951.getClass(), "namespaces", term4959);
        setField(term4951, term4951.getClass(), "enumTypeNames", term4965);
        setField(term4951, term4951.getClass(), "forwardDeclaredTypes", term4971);
        setField(term4951, term4951.getClass(), "typesIndexedByProperty", term4977);
        setField(term4951, term4951.getClass(), "greatestSubtypeByProperty", term4982);
        setField(term4951, term4951.getClass(), "interfaceToImplementors", null);
        setField(term4951, term4951.getClass(), "unresolvedNamedTypes", null);
        setField(term4951, term4951.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4951, term4951.getClass(), "lastGeneration", true);
        setField(term4951, term4951.getClass(), "templateTypeName", "FwPbDZcHmB");
        setField(term5001, term5001.getClass(), "name", "");
        setField(term5001, term5001.getClass(), "referencedType", null);
        setBooleanField(term5001, term5001.getClass(), "visited", false);
        setField(term5001, term5001.getClass(), "docInfo", null);
        setBooleanField(term5001, term5001.getClass(), "unknown", false);
        setBooleanField(term5001, term5001.getClass(), "resolved", false);
        setField(term5001, term5001.getClass(), "resolveResult", null);
        setField(term5001, term5001.getClass(), "registry", null);
        setField(term4951, term4951.getClass(), "templateType", term5001);
        setBooleanField(term4951, term4951.getClass(), "tolerateUndefinedValues", true);
        setField(term4951, term4951.getClass(), "resolveMode", enum66);
        setField(term4950, term4950.getClass(), "typeRegistry", term4951);
        setField(term4950, term4950.getClass(), "allValueTypes", null);
        setBooleanField(term4950, term4950.getClass(), "shouldReport", true);
        setField(term4950, term4950.getClass(), "mismatches", term5011);
        setField(term4949, term4949.getClass(), "validator", term4950);
        setField(term4949, term4949.getClass(), "reverseInterpreter", null);
        setField(term5017, term5017.getClass(), "reporter", null);
        setField(term5017, term5017.getClass(), "nativeTypes", null);
        setField(term5017, term5017.getClass(), "namesToTypes", null);
        setField(term5017, term5017.getClass(), "namespaces", null);
        setField(term5017, term5017.getClass(), "enumTypeNames", null);
        setField(term5017, term5017.getClass(), "forwardDeclaredTypes", null);
        setField(term5017, term5017.getClass(), "typesIndexedByProperty", null);
        setField(term5017, term5017.getClass(), "greatestSubtypeByProperty", null);
        setField(term5017, term5017.getClass(), "interfaceToImplementors", null);
        setField(term5017, term5017.getClass(), "unresolvedNamedTypes", null);
        setField(term5017, term5017.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5017, term5017.getClass(), "lastGeneration", false);
        setField(term5017, term5017.getClass(), "templateTypeName", null);
        setField(term5017, term5017.getClass(), "templateType", null);
        setBooleanField(term5017, term5017.getClass(), "tolerateUndefinedValues", false);
        setField(term5017, term5017.getClass(), "resolveMode", null);
        setField(term4949, term4949.getClass(), "typeRegistry", term5017);
        setField(term5020, term5020.getClass(), "vars", null);
        setField(term5020, term5020.getClass(), "parent", null);
        setField(term5020, term5020.getClass(), "rootNode", null);
        setField(term5020, term5020.getClass(), "thisType", null);
        setBooleanField(term5020, term5020.getClass(), "isBottom", false);
        setField(term4949, term4949.getClass(), "topScope", term5020);
        setField(term4949, term4949.getClass(), "scopeCreator", null);
        setField(term4949, term4949.getClass(), "reportMissingOverride", null);
        setField(term4949, term4949.getClass(), "reportUnknownTypes", null);
        setBooleanField(term4949, term4949.getClass(), "reportMissingProperties", false);
        setField(term4949, term4949.getClass(), "inferJSDocInfo", null);
        setIntField(term4949, term4949.getClass(), "typedCount", 0);
        setIntField(term4949, term4949.getClass(), "nullCount", 0);
        setIntField(term4949, term4949.getClass(), "unknownCount", 0);
        setBooleanField(term4949, term4949.getClass(), "inExterns", false);
        setIntField(term4949, term4949.getClass(), "noTypeCheckSection", 0);
        term5028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5041 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5051 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5028, term5028.getClass(), "type", -93135961);
        setIntField(term5030, term5030.getClass(), "type", 962840079);
        setIntField(term5032, term5032.getClass(), "type", 0);
        setField(term5032, term5032.getClass(), "next", null);
        setField(term5032, term5032.getClass(), "first", null);
        setField(term5032, term5032.getClass(), "last", null);
        setField(term5032, term5032.getClass(), "propListHead", null);
        setIntField(term5032, term5032.getClass(), "sourcePosition", 0);
        setField(term5032, term5032.getClass(), "jsType", null);
        setField(term5032, term5032.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "next", term5032);
        setIntField(term5035, term5035.getClass(), "type", 0);
        setField(term5035, term5035.getClass(), "next", null);
        setField(term5035, term5035.getClass(), "first", null);
        setField(term5035, term5035.getClass(), "last", null);
        setField(term5035, term5035.getClass(), "propListHead", null);
        setIntField(term5035, term5035.getClass(), "sourcePosition", 0);
        setField(term5035, term5035.getClass(), "jsType", null);
        setField(term5035, term5035.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "first", term5035);
        setIntField(term5038, term5038.getClass(), "type", 0);
        setField(term5038, term5038.getClass(), "next", null);
        setField(term5038, term5038.getClass(), "first", null);
        setField(term5038, term5038.getClass(), "last", null);
        setField(term5038, term5038.getClass(), "propListHead", null);
        setIntField(term5038, term5038.getClass(), "sourcePosition", 0);
        setField(term5038, term5038.getClass(), "jsType", null);
        setField(term5038, term5038.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "last", term5038);
        setField(term5041, term5041.getClass(), "next", null);
        setIntField(term5041, term5041.getClass(), "type", 0);
        setIntField(term5041, term5041.getClass(), "intValue", 0);
        setField(term5041, term5041.getClass(), "objectValue", null);
        setField(term5030, term5030.getClass(), "propListHead", term5041);
        setIntField(term5030, term5030.getClass(), "sourcePosition", 335112684);
        setField(term5030, term5030.getClass(), "jsType", null);
        setField(term5030, term5030.getClass(), "parent", null);
        setField(term5028, term5028.getClass(), "next", term5030);
        setIntField(term5045, term5045.getClass(), "type", 0);
        setField(term5045, term5045.getClass(), "next", null);
        setField(term5045, term5045.getClass(), "first", null);
        setField(term5045, term5045.getClass(), "last", null);
        setField(term5045, term5045.getClass(), "propListHead", null);
        setIntField(term5045, term5045.getClass(), "sourcePosition", 0);
        setField(term5045, term5045.getClass(), "jsType", null);
        setField(term5045, term5045.getClass(), "parent", null);
        setField(term5028, term5028.getClass(), "first", term5045);
        setIntField(term5048, term5048.getClass(), "type", 0);
        setField(term5048, term5048.getClass(), "next", null);
        setField(term5048, term5048.getClass(), "first", null);
        setField(term5048, term5048.getClass(), "last", null);
        setField(term5048, term5048.getClass(), "propListHead", null);
        setIntField(term5048, term5048.getClass(), "sourcePosition", 0);
        setField(term5048, term5048.getClass(), "jsType", null);
        setField(term5048, term5048.getClass(), "parent", null);
        setField(term5028, term5028.getClass(), "last", term5048);
        setField(term5051, term5051.getClass(), "next", null);
        setIntField(term5051, term5051.getClass(), "type", 0);
        setIntField(term5051, term5051.getClass(), "intValue", 0);
        setField(term5051, term5051.getClass(), "objectValue", null);
        setField(term5028, term5028.getClass(), "propListHead", term5051);
        setIntField(term5028, term5028.getClass(), "sourcePosition", 1551099402);
        setField(term5028, term5028.getClass(), "jsType", null);
        setField(term5028, term5028.getClass(), "parent", null);
        term5055 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5028;
        args[1] = term5055;
        try {
            callMethod(klass, "check", argTypes, term4949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


