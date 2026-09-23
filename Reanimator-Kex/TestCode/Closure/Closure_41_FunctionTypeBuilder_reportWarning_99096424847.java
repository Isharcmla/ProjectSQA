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

public class FunctionTypeBuilder_reportWarning_99096424847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7758;
     Object term7844;
     Object term7917;

    public FunctionTypeBuilder_reportWarning_99096424847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7773 = new HashMap();
        HashMap term7782 = new HashMap();
        Set<Object> term15159 =  ((Map) term7782).keySet();
        HashSet term7781 = new HashSet((Collection<? extends Object>) term15159);
        HashMap term7788 = new HashMap();
        Set<Object> term15160 =  ((Map) term7788).keySet();
        HashSet term7787 = new HashSet((Collection<? extends Object>) term15160);
        HashMap term7794 = new HashMap();
        Set<Object> term15161 =  ((Map) term7794).keySet();
        HashSet term7793 = new HashSet((Collection<? extends Object>) term15161);
        HashMap term7800 = new HashMap();
        HashMap term7808 = new HashMap();
        HashMap term7813 = new HashMap();
        term7758 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term7771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7772 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term7823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7838 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term7758, term7758.getClass(), "fnName", "AxfSZmaiyA");
        setField(term7758, term7758.getClass(), "compiler", null);
        setField(term7758, term7758.getClass(), "codingConvention", null);
        setField(term7771, term7771.getClass(), "reporter", null);
        setField(term7771, term7771.getClass(), "nativeTypes", term7772);
        setField(term7771, term7771.getClass(), "namesToTypes", term7773);
        setField(term7771, term7771.getClass(), "namespaces", term7781);
        setField(term7771, term7771.getClass(), "nonNullableTypeNames", term7787);
        setField(term7771, term7771.getClass(), "forwardDeclaredTypes", term7793);
        setField(term7771, term7771.getClass(), "typesIndexedByProperty", term7800);
        setField(term7771, term7771.getClass(), "eachRefTypeIndexedByProperty", term7808);
        setField(term7771, term7771.getClass(), "greatestSubtypeByProperty", term7813);
        setField(term7771, term7771.getClass(), "interfaceToImplementors", null);
        setField(term7771, term7771.getClass(), "unresolvedNamedTypes", null);
        setField(term7771, term7771.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7771, term7771.getClass(), "lastGeneration", false);
        setField(term7771, term7771.getClass(), "templateTypeName", null);
        setField(term7771, term7771.getClass(), "templateType", null);
        setBooleanField(term7771, term7771.getClass(), "tolerateUndefinedValues", false);
        setField(term7771, term7771.getClass(), "resolveMode", null);
        setField(term7758, term7758.getClass(), "typeRegistry", term7771);
        setIntField(term7823, term7823.getClass(), "type", 0);
        setField(term7823, term7823.getClass(), "next", null);
        setField(term7823, term7823.getClass(), "first", null);
        setField(term7823, term7823.getClass(), "last", null);
        setField(term7823, term7823.getClass(), "propListHead", null);
        setIntField(term7823, term7823.getClass(), "sourcePosition", 0);
        setField(term7823, term7823.getClass(), "jsType", null);
        setField(term7823, term7823.getClass(), "parent", null);
        setField(term7758, term7758.getClass(), "errorRoot", term7823);
        setField(term7758, term7758.getClass(), "sourceName", "YaDWphDOSz");
        setField(term7838, term7838.getClass(), "vars", null);
        setField(term7838, term7838.getClass(), "parent", null);
        setIntField(term7838, term7838.getClass(), "depth", 0);
        setField(term7838, term7838.getClass(), "rootNode", null);
        setField(term7838, term7838.getClass(), "thisType", null);
        setBooleanField(term7838, term7838.getClass(), "isBottom", false);
        setField(term7838, term7838.getClass(), "arguments", null);
        setField(term7758, term7758.getClass(), "scope", term7838);
        setField(term7758, term7758.getClass(), "contents", null);
        setField(term7758, term7758.getClass(), "returnType", null);
        setBooleanField(term7758, term7758.getClass(), "returnTypeInferred", false);
        setField(term7758, term7758.getClass(), "implementedInterfaces", null);
        setField(term7758, term7758.getClass(), "extendedInterfaces", null);
        setField(term7758, term7758.getClass(), "baseType", null);
        setField(term7758, term7758.getClass(), "thisType", null);
        setBooleanField(term7758, term7758.getClass(), "isConstructor", false);
        setBooleanField(term7758, term7758.getClass(), "isInterface", false);
        setField(term7758, term7758.getClass(), "parametersNode", null);
        setField(term7758, term7758.getClass(), "templateTypeName", null);
        Class<? extends Object> term15210 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term15209 = ((Class) term15210).getDeclaredField((String) "WARNING");
        ((Field) term15209).setAccessible(true);
        Object enum20 = ((Field) term15209).get((Object) null);
        Class<? extends Object> term15433 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term15432 = ((Class) term15433).getDeclaredField((String) "OFF");
        ((Field) term15432).setAccessible(true);
        Object enum21 = ((Field) term15432).get((Object) null);
        term7844 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term7857 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term7858 = newInstance(Class.forName("java.util.Locale"));
        Object term7859 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term7878 = (Object[]) newArray("java.text.Format", 5);
        int[] term7879 = (int[]) newIntArray(8);
        int[] term7888 = (int[]) newIntArray(9);
        setField(term7844, term7844.getClass(), "key", "nnnmCgFBLw");
        setField(term7859, term7859.getClass(), "language", "");
        setField(term7859, term7859.getClass(), "script", "");
        setField(term7859, term7859.getClass(), "region", "");
        setField(term7859, term7859.getClass(), "variant", "");
        setIntField(term7859, term7859.getClass(), "hash", 106966554);
        setField(term7858, term7858.getClass(), "baseLocale", term7859);
        setField(term7858, term7858.getClass(), "localeExtensions", null);
        setIntField(term7858, term7858.getClass(), "hashCodeValue", 106966554);
        setField(term7858, term7858.getClass(), "languageTag", null);
        setField(term7857, term7857.getClass(), "locale", term7858);
        setField(term7857, term7857.getClass(), "pattern", "hSSCyNEhyH");
        setField(term7857, term7857.getClass(), "formats", term7878);
        setIntElement(term7879, 0, -2131181468);
        setIntElement(term7879, 1, 282916351);
        setIntElement(term7879, 2, 880977281);
        setIntElement(term7879, 3, 371943306);
        setIntElement(term7879, 4, 982388293);
        setIntElement(term7879, 5, -159494544);
        setIntElement(term7879, 6, -75206835);
        setIntElement(term7879, 7, -1618206977);
        setField(term7857, term7857.getClass(), "offsets", term7879);
        setIntElement(term7888, 0, -1747406163);
        setIntElement(term7888, 1, 388157121);
        setIntElement(term7888, 2, 1684998508);
        setIntElement(term7888, 3, -1476644457);
        setIntElement(term7888, 4, 1270666529);
        setIntElement(term7888, 5, -1146679443);
        setIntElement(term7888, 6, -860131894);
        setIntElement(term7888, 7, -1022990421);
        setIntElement(term7888, 8, 1045547089);
        setField(term7857, term7857.getClass(), "argumentNumbers", term7888);
        setIntField(term7857, term7857.getClass(), "maxOffset", -1122880881);
        setField(term7844, term7844.getClass(), "format", term7857);
        setField(term7844, term7844.getClass(), "defaultLevel", enum20);
        setField(term7844, term7844.getClass(), "level", enum21);
        term7917 = (Object[]) newArray("java.lang.String", 7);
        setElement(term7917, 0, "jDFNSuvZqm");
        setElement(term7917, 1, "pLvkKHqNYX");
        setElement(term7917, 2, "PwqnuJJwjR");
        setElement(term7917, 3, "NFkbBiPeiw");
        setElement(term7917, 4, "tlRvilQyjJ");
        setElement(term7917, 5, "gwTUlYNpjM");
        setElement(term7917, 6, "uXYojRmxrM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term7844;
        args[1] = term7917;
        try {
            callMethod(klass, "reportWarning", argTypes, term7758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


