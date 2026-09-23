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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionTypeBuilder_reportWarning_99096424844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15996;
     Object term16122;
     Object term16179;

    public FunctionTypeBuilder_reportWarning_99096424844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16011 = new HashMap();
        HashMap term16020 = new HashMap();
        Set<Object> term34164 =  ((Map) term16020).keySet();
        HashSet term16019 = new HashSet((Collection<? extends Object>) term34164);
        HashMap term16027 = new HashMap();
        Set<Object> term34165 =  ((Map) term16027).keySet();
        HashSet term16026 = new HashSet((Collection<? extends Object>) term34165);
        HashMap term16033 = new HashMap();
        Set<Object> term34166 =  ((Map) term16033).keySet();
        HashSet term16032 = new HashSet((Collection<? extends Object>) term34166);
        HashMap term16039 = new HashMap();
        HashMap term16044 = new HashMap();
        Class<? extends Object> term34188 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term34187 = ((Class) term34188).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term34187).setAccessible(true);
        Object enum64 = ((Field) term34187).get((Object) null);
        term15996 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term16009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term16010 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term16065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16117 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15996, term15996.getClass(), "fnName", "ANHjlWPmZG");
        setField(term15996, term15996.getClass(), "compiler", null);
        setField(term15996, term15996.getClass(), "codingConvention", null);
        setField(term16009, term16009.getClass(), "reporter", null);
        setField(term16009, term16009.getClass(), "nativeTypes", term16010);
        setField(term16009, term16009.getClass(), "namesToTypes", term16011);
        setField(term16009, term16009.getClass(), "namespaces", term16019);
        setField(term16009, term16009.getClass(), "nonNullableTypeNames", term16026);
        setField(term16009, term16009.getClass(), "forwardDeclaredTypes", term16032);
        setField(term16009, term16009.getClass(), "typesIndexedByProperty", term16039);
        setField(term16009, term16009.getClass(), "greatestSubtypeByProperty", term16044);
        setField(term16009, term16009.getClass(), "interfaceToImplementors", null);
        setField(term16009, term16009.getClass(), "unresolvedNamedTypes", null);
        setField(term16009, term16009.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16009, term16009.getClass(), "lastGeneration", false);
        setField(term16009, term16009.getClass(), "templateTypeName", "PTEndmPMzk");
        setField(term16065, term16065.getClass(), "name", "aJQuCOCvZs");
        setField(term16065, term16065.getClass(), "referencedType", null);
        setField(term16065, term16065.getClass(), "referencedObjType", null);
        setBooleanField(term16065, term16065.getClass(), "visited", false);
        setField(term16065, term16065.getClass(), "docInfo", null);
        setBooleanField(term16065, term16065.getClass(), "unknown", false);
        setBooleanField(term16065, term16065.getClass(), "resolved", false);
        setField(term16065, term16065.getClass(), "resolveResult", null);
        setField(term16065, term16065.getClass(), "registry", null);
        setField(term16009, term16009.getClass(), "templateType", term16065);
        setBooleanField(term16009, term16009.getClass(), "tolerateUndefinedValues", false);
        setField(term16009, term16009.getClass(), "resolveMode", enum64);
        setField(term15996, term15996.getClass(), "typeRegistry", term16009);
        setIntField(term16102, term16102.getClass(), "type", 0);
        setField(term16102, term16102.getClass(), "next", null);
        setField(term16102, term16102.getClass(), "first", null);
        setField(term16102, term16102.getClass(), "last", null);
        setField(term16102, term16102.getClass(), "propListHead", null);
        setIntField(term16102, term16102.getClass(), "sourcePosition", 0);
        setField(term16102, term16102.getClass(), "jsType", null);
        setField(term16102, term16102.getClass(), "parent", null);
        setField(term15996, term15996.getClass(), "errorRoot", term16102);
        setField(term15996, term15996.getClass(), "sourceName", "lHYNCJRiOv");
        setField(term16117, term16117.getClass(), "vars", null);
        setField(term16117, term16117.getClass(), "parent", null);
        setField(term16117, term16117.getClass(), "rootNode", null);
        setField(term16117, term16117.getClass(), "thisType", null);
        setBooleanField(term16117, term16117.getClass(), "isBottom", false);
        setField(term15996, term15996.getClass(), "scope", term16117);
        setField(term15996, term15996.getClass(), "returnType", null);
        setBooleanField(term15996, term15996.getClass(), "returnTypeInferred", false);
        setField(term15996, term15996.getClass(), "implementedInterfaces", null);
        setField(term15996, term15996.getClass(), "baseType", null);
        setField(term15996, term15996.getClass(), "thisType", null);
        setBooleanField(term15996, term15996.getClass(), "isConstructor", false);
        setBooleanField(term15996, term15996.getClass(), "isInterface", false);
        setField(term15996, term15996.getClass(), "parametersNode", null);
        setField(term15996, term15996.getClass(), "sourceNode", null);
        setField(term15996, term15996.getClass(), "templateTypeName", null);
        Class<? extends Object> term34579 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term34578 = ((Class) term34579).getDeclaredField((String) "WARNING");
        ((Field) term34578).setAccessible(true);
        Object enum65 = ((Field) term34578).get((Object) null);
        Class<? extends Object> term34802 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term34801 = ((Class) term34802).getDeclaredField((String) "OFF");
        ((Field) term34801).setAccessible(true);
        Object enum66 = ((Field) term34801).get((Object) null);
        term16122 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term16135 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term16136 = newInstance(Class.forName("java.util.Locale"));
        Object term16137 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term16156 = (Object[]) newArray("java.text.Format", 3);
        int[] term16157 = (int[]) newIntArray(0);
        int[] term16158 = (int[]) newIntArray(1);
        setField(term16122, term16122.getClass(), "key", "QVLresHoaP");
        setField(term16137, term16137.getClass(), "language", "");
        setField(term16137, term16137.getClass(), "script", "");
        setField(term16137, term16137.getClass(), "region", "");
        setField(term16137, term16137.getClass(), "variant", "");
        setIntField(term16137, term16137.getClass(), "hash", 106966554);
        setField(term16136, term16136.getClass(), "baseLocale", term16137);
        setField(term16136, term16136.getClass(), "localeExtensions", null);
        setIntField(term16136, term16136.getClass(), "hashCodeValue", 106966554);
        setField(term16136, term16136.getClass(), "languageTag", null);
        setField(term16135, term16135.getClass(), "locale", term16136);
        setField(term16135, term16135.getClass(), "pattern", "IbxeAMwLVt");
        setField(term16135, term16135.getClass(), "formats", term16156);
        setField(term16135, term16135.getClass(), "offsets", term16157);
        setIntElement(term16158, 0, -1476644457);
        setField(term16135, term16135.getClass(), "argumentNumbers", term16158);
        setIntField(term16135, term16135.getClass(), "maxOffset", 1270666529);
        setField(term16122, term16122.getClass(), "format", term16135);
        setField(term16122, term16122.getClass(), "defaultLevel", enum65);
        setField(term16122, term16122.getClass(), "level", enum66);
        term16179 = (Object[]) newArray("java.lang.String", 3);
        setElement(term16179, 0, "bShlAqoTmZ");
        setElement(term16179, 1, "nOKlKlNhtU");
        setElement(term16179, 2, "gXFNBHJSey");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term16122;
        args[1] = term16179;
        try {
            callMethod(klass, "reportWarning", argTypes, term15996, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


