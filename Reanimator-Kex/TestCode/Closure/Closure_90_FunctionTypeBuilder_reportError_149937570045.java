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
import java.lang.IndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionTypeBuilder_reportError_149937570045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17131;
     Object term17258;
     Object term17330;

    public FunctionTypeBuilder_reportError_149937570045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17146 = new HashMap();
        HashMap term17155 = new HashMap();
        Set<Object> term35467 =  ((Map) term17155).keySet();
        HashSet term17154 = new HashSet((Collection<? extends Object>) term35467);
        HashMap term17162 = new HashMap();
        Set<Object> term35468 =  ((Map) term17162).keySet();
        HashSet term17161 = new HashSet((Collection<? extends Object>) term35468);
        HashMap term17169 = new HashMap();
        Set<Object> term35469 =  ((Map) term17169).keySet();
        HashSet term17168 = new HashSet((Collection<? extends Object>) term35469);
        HashMap term17175 = new HashMap();
        HashMap term17180 = new HashMap();
        Class<? extends Object> term35491 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term35490 = ((Class) term35491).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term35490).setAccessible(true);
        Object enum67 = ((Field) term35490).get((Object) null);
        term17131 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term17144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term17145 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term17201 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term17238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17253 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term17131, term17131.getClass(), "fnName", "wUcSfItZgv");
        setField(term17131, term17131.getClass(), "compiler", null);
        setField(term17131, term17131.getClass(), "codingConvention", null);
        setField(term17144, term17144.getClass(), "reporter", null);
        setField(term17144, term17144.getClass(), "nativeTypes", term17145);
        setField(term17144, term17144.getClass(), "namesToTypes", term17146);
        setField(term17144, term17144.getClass(), "namespaces", term17154);
        setField(term17144, term17144.getClass(), "nonNullableTypeNames", term17161);
        setField(term17144, term17144.getClass(), "forwardDeclaredTypes", term17168);
        setField(term17144, term17144.getClass(), "typesIndexedByProperty", term17175);
        setField(term17144, term17144.getClass(), "greatestSubtypeByProperty", term17180);
        setField(term17144, term17144.getClass(), "interfaceToImplementors", null);
        setField(term17144, term17144.getClass(), "unresolvedNamedTypes", null);
        setField(term17144, term17144.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term17144, term17144.getClass(), "lastGeneration", true);
        setField(term17144, term17144.getClass(), "templateTypeName", "QXyFXBjFde");
        setField(term17201, term17201.getClass(), "name", "xVFgeyYxZS");
        setField(term17201, term17201.getClass(), "referencedType", null);
        setField(term17201, term17201.getClass(), "referencedObjType", null);
        setBooleanField(term17201, term17201.getClass(), "visited", false);
        setField(term17201, term17201.getClass(), "docInfo", null);
        setBooleanField(term17201, term17201.getClass(), "unknown", false);
        setBooleanField(term17201, term17201.getClass(), "resolved", false);
        setField(term17201, term17201.getClass(), "resolveResult", null);
        setField(term17201, term17201.getClass(), "registry", null);
        setField(term17144, term17144.getClass(), "templateType", term17201);
        setBooleanField(term17144, term17144.getClass(), "tolerateUndefinedValues", false);
        setField(term17144, term17144.getClass(), "resolveMode", enum67);
        setField(term17131, term17131.getClass(), "typeRegistry", term17144);
        setIntField(term17238, term17238.getClass(), "type", 0);
        setField(term17238, term17238.getClass(), "next", null);
        setField(term17238, term17238.getClass(), "first", null);
        setField(term17238, term17238.getClass(), "last", null);
        setField(term17238, term17238.getClass(), "propListHead", null);
        setIntField(term17238, term17238.getClass(), "sourcePosition", 0);
        setField(term17238, term17238.getClass(), "jsType", null);
        setField(term17238, term17238.getClass(), "parent", null);
        setField(term17131, term17131.getClass(), "errorRoot", term17238);
        setField(term17131, term17131.getClass(), "sourceName", "iQiGTulJiH");
        setField(term17253, term17253.getClass(), "vars", null);
        setField(term17253, term17253.getClass(), "parent", null);
        setField(term17253, term17253.getClass(), "rootNode", null);
        setField(term17253, term17253.getClass(), "thisType", null);
        setBooleanField(term17253, term17253.getClass(), "isBottom", false);
        setField(term17131, term17131.getClass(), "scope", term17253);
        setField(term17131, term17131.getClass(), "returnType", null);
        setBooleanField(term17131, term17131.getClass(), "returnTypeInferred", false);
        setField(term17131, term17131.getClass(), "implementedInterfaces", null);
        setField(term17131, term17131.getClass(), "baseType", null);
        setField(term17131, term17131.getClass(), "thisType", null);
        setBooleanField(term17131, term17131.getClass(), "isConstructor", false);
        setBooleanField(term17131, term17131.getClass(), "isInterface", false);
        setField(term17131, term17131.getClass(), "parametersNode", null);
        setField(term17131, term17131.getClass(), "sourceNode", null);
        setField(term17131, term17131.getClass(), "templateTypeName", null);
        Class<? extends Object> term35897 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term35896 = ((Class) term35897).getDeclaredField((String) "WARNING");
        ((Field) term35896).setAccessible(true);
        Object enum68 = ((Field) term35896).get((Object) null);
        Class<? extends Object> term36120 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term36119 = ((Class) term36120).getDeclaredField((String) "OFF");
        ((Field) term36119).setAccessible(true);
        Object enum69 = ((Field) term36119).get((Object) null);
        term17258 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term17271 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term17272 = newInstance(Class.forName("java.util.Locale"));
        Object term17273 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term17292 = (Object[]) newArray("java.text.Format", 9);
        int[] term17293 = (int[]) newIntArray(7);
        int[] term17301 = (int[]) newIntArray(9);
        setField(term17258, term17258.getClass(), "key", "utCuuVCKqE");
        setField(term17273, term17273.getClass(), "language", "");
        setField(term17273, term17273.getClass(), "script", "");
        setField(term17273, term17273.getClass(), "region", "");
        setField(term17273, term17273.getClass(), "variant", "");
        setIntField(term17273, term17273.getClass(), "hash", 106860317);
        setField(term17272, term17272.getClass(), "baseLocale", term17273);
        setField(term17272, term17272.getClass(), "localeExtensions", null);
        setIntField(term17272, term17272.getClass(), "hashCodeValue", 106860317);
        setField(term17272, term17272.getClass(), "languageTag", null);
        setField(term17271, term17271.getClass(), "locale", term17272);
        setField(term17271, term17271.getClass(), "pattern", "zSfoqzJbPT");
        setField(term17271, term17271.getClass(), "formats", term17292);
        setIntElement(term17293, 0, -1122880881);
        setIntElement(term17293, 1, -542712742);
        setIntElement(term17293, 2, -1254072822);
        setIntElement(term17293, 3, -1111249833);
        setIntElement(term17293, 4, -1692331299);
        setIntElement(term17293, 5, 479531250);
        setIntElement(term17293, 6, 1320570890);
        setField(term17271, term17271.getClass(), "offsets", term17293);
        setIntElement(term17301, 0, -130649791);
        setIntElement(term17301, 1, 534834644);
        setIntElement(term17301, 2, 1959097203);
        setIntElement(term17301, 3, -209654048);
        setIntElement(term17301, 4, 477625804);
        setIntElement(term17301, 5, 252575029);
        setIntElement(term17301, 6, 57189932);
        setIntElement(term17301, 7, 1460722225);
        setIntElement(term17301, 8, 1743224434);
        setField(term17271, term17271.getClass(), "argumentNumbers", term17301);
        setIntField(term17271, term17271.getClass(), "maxOffset", 842904495);
        setField(term17258, term17258.getClass(), "format", term17271);
        setField(term17258, term17258.getClass(), "defaultLevel", enum68);
        setField(term17258, term17258.getClass(), "level", enum69);
        term17330 = (Object[]) newArray("java.lang.String", 5);
        setElement(term17330, 0, "QUymMnsCIj");
        setElement(term17330, 1, "ikTtOgdVYS");
        setElement(term17330, 2, "JptuwlirlS");
        setElement(term17330, 3, "TKOMaGswbU");
        setElement(term17330, 4, "YcTbglHiUq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term17258;
        args[1] = term17330;
        try {
            callMethod(klass, "reportError", argTypes, term17131, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


