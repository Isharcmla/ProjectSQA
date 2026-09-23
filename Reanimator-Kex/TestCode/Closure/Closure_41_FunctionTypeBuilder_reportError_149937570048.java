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

public class FunctionTypeBuilder_reportError_149937570048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8593;
     Object term8681;
     Object term8749;

    public FunctionTypeBuilder_reportError_149937570048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8608 = new HashMap();
        HashMap term8617 = new HashMap();
        Set<Object> term16762 =  ((Map) term8617).keySet();
        HashSet term8616 = new HashSet((Collection<? extends Object>) term16762);
        HashMap term8624 = new HashMap();
        Set<Object> term16763 =  ((Map) term8624).keySet();
        HashSet term8623 = new HashSet((Collection<? extends Object>) term16763);
        HashMap term8631 = new HashMap();
        Set<Object> term16764 =  ((Map) term8631).keySet();
        HashSet term8630 = new HashSet((Collection<? extends Object>) term16764);
        HashMap term8637 = new HashMap();
        HashMap term8645 = new HashMap();
        HashMap term8650 = new HashMap();
        term8593 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term8606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term8607 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term8660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8675 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term8593, term8593.getClass(), "fnName", "cxRwRcodud");
        setField(term8593, term8593.getClass(), "compiler", null);
        setField(term8593, term8593.getClass(), "codingConvention", null);
        setField(term8606, term8606.getClass(), "reporter", null);
        setField(term8606, term8606.getClass(), "nativeTypes", term8607);
        setField(term8606, term8606.getClass(), "namesToTypes", term8608);
        setField(term8606, term8606.getClass(), "namespaces", term8616);
        setField(term8606, term8606.getClass(), "nonNullableTypeNames", term8623);
        setField(term8606, term8606.getClass(), "forwardDeclaredTypes", term8630);
        setField(term8606, term8606.getClass(), "typesIndexedByProperty", term8637);
        setField(term8606, term8606.getClass(), "eachRefTypeIndexedByProperty", term8645);
        setField(term8606, term8606.getClass(), "greatestSubtypeByProperty", term8650);
        setField(term8606, term8606.getClass(), "interfaceToImplementors", null);
        setField(term8606, term8606.getClass(), "unresolvedNamedTypes", null);
        setField(term8606, term8606.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term8606, term8606.getClass(), "lastGeneration", false);
        setField(term8606, term8606.getClass(), "templateTypeName", null);
        setField(term8606, term8606.getClass(), "templateType", null);
        setBooleanField(term8606, term8606.getClass(), "tolerateUndefinedValues", false);
        setField(term8606, term8606.getClass(), "resolveMode", null);
        setField(term8593, term8593.getClass(), "typeRegistry", term8606);
        setIntField(term8660, term8660.getClass(), "type", 0);
        setField(term8660, term8660.getClass(), "next", null);
        setField(term8660, term8660.getClass(), "first", null);
        setField(term8660, term8660.getClass(), "last", null);
        setField(term8660, term8660.getClass(), "propListHead", null);
        setIntField(term8660, term8660.getClass(), "sourcePosition", 0);
        setField(term8660, term8660.getClass(), "jsType", null);
        setField(term8660, term8660.getClass(), "parent", null);
        setField(term8593, term8593.getClass(), "errorRoot", term8660);
        setField(term8593, term8593.getClass(), "sourceName", "EyojsbSjWT");
        setField(term8675, term8675.getClass(), "vars", null);
        setField(term8675, term8675.getClass(), "parent", null);
        setIntField(term8675, term8675.getClass(), "depth", 0);
        setField(term8675, term8675.getClass(), "rootNode", null);
        setField(term8675, term8675.getClass(), "thisType", null);
        setBooleanField(term8675, term8675.getClass(), "isBottom", false);
        setField(term8675, term8675.getClass(), "arguments", null);
        setField(term8593, term8593.getClass(), "scope", term8675);
        setField(term8593, term8593.getClass(), "contents", null);
        setField(term8593, term8593.getClass(), "returnType", null);
        setBooleanField(term8593, term8593.getClass(), "returnTypeInferred", false);
        setField(term8593, term8593.getClass(), "implementedInterfaces", null);
        setField(term8593, term8593.getClass(), "extendedInterfaces", null);
        setField(term8593, term8593.getClass(), "baseType", null);
        setField(term8593, term8593.getClass(), "thisType", null);
        setBooleanField(term8593, term8593.getClass(), "isConstructor", false);
        setBooleanField(term8593, term8593.getClass(), "isInterface", false);
        setField(term8593, term8593.getClass(), "parametersNode", null);
        setField(term8593, term8593.getClass(), "templateTypeName", null);
        Class<? extends Object> term16808 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term16807 = ((Class) term16808).getDeclaredField((String) "WARNING");
        ((Field) term16807).setAccessible(true);
        Object enum24 = ((Field) term16807).get((Object) null);
        Class<? extends Object> term17031 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term17030 = ((Class) term17031).getDeclaredField((String) "OFF");
        ((Field) term17030).setAccessible(true);
        Object enum25 = ((Field) term17030).get((Object) null);
        term8681 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term8694 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term8695 = newInstance(Class.forName("java.util.Locale"));
        Object term8696 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term8715 = (Object[]) newArray("java.text.Format", 0);
        int[] term8716 = (int[]) newIntArray(4);
        int[] term8721 = (int[]) newIntArray(8);
        setField(term8681, term8681.getClass(), "key", "szGicGyWDL");
        setField(term8696, term8696.getClass(), "language", "");
        setField(term8696, term8696.getClass(), "script", "");
        setField(term8696, term8696.getClass(), "region", "");
        setField(term8696, term8696.getClass(), "variant", "");
        setIntField(term8696, term8696.getClass(), "hash", 106860317);
        setField(term8695, term8695.getClass(), "baseLocale", term8696);
        setField(term8695, term8695.getClass(), "localeExtensions", null);
        setIntField(term8695, term8695.getClass(), "hashCodeValue", 106860317);
        setField(term8695, term8695.getClass(), "languageTag", null);
        setField(term8694, term8694.getClass(), "locale", term8695);
        setField(term8694, term8694.getClass(), "pattern", "lkdvUiYwRq");
        setField(term8694, term8694.getClass(), "formats", term8715);
        setIntElement(term8716, 0, 534834644);
        setIntElement(term8716, 1, 1959097203);
        setIntElement(term8716, 2, -209654048);
        setIntElement(term8716, 3, 477625804);
        setField(term8694, term8694.getClass(), "offsets", term8716);
        setIntElement(term8721, 0, 252575029);
        setIntElement(term8721, 1, 57189932);
        setIntElement(term8721, 2, 1460722225);
        setIntElement(term8721, 3, 1743224434);
        setIntElement(term8721, 4, 842904495);
        setIntElement(term8721, 5, 1008080511);
        setIntElement(term8721, 6, 1935707624);
        setIntElement(term8721, 7, 1507074215);
        setField(term8694, term8694.getClass(), "argumentNumbers", term8721);
        setIntField(term8694, term8694.getClass(), "maxOffset", -282881827);
        setField(term8681, term8681.getClass(), "format", term8694);
        setField(term8681, term8681.getClass(), "defaultLevel", enum24);
        setField(term8681, term8681.getClass(), "level", enum25);
        term8749 = (Object[]) newArray("java.lang.String", 8);
        setElement(term8749, 0, "XuxkPrpfND");
        setElement(term8749, 1, "OxNXeKMDje");
        setElement(term8749, 2, "hGTqHomrbc");
        setElement(term8749, 3, "NNMBrIWEBw");
        setElement(term8749, 4, "GrTaccOQzl");
        setElement(term8749, 5, "uuSYOUCVHU");
        setElement(term8749, 6, "DfWwbodtVw");
        setElement(term8749, 7, "kTbFMpVWqx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term8681;
        args[1] = term8749;
        try {
            callMethod(klass, "reportError", argTypes, term8593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


