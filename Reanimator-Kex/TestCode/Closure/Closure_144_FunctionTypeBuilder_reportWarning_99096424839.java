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

public class FunctionTypeBuilder_reportWarning_99096424839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14996;
     Object term15119;
     Object term15189;

    public FunctionTypeBuilder_reportWarning_99096424839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15011 = new HashMap();
        HashMap term15020 = new HashMap();
        Set<Object> term36379 =  ((Map) term15020).keySet();
        HashSet term15019 = new HashSet((Collection<? extends Object>) term36379);
        HashMap term15027 = new HashMap();
        Set<Object> term36380 =  ((Map) term15027).keySet();
        HashSet term15026 = new HashSet((Collection<? extends Object>) term36380);
        HashMap term15034 = new HashMap();
        Set<Object> term36381 =  ((Map) term15034).keySet();
        HashSet term15033 = new HashSet((Collection<? extends Object>) term36381);
        HashMap term15040 = new HashMap();
        HashMap term15045 = new HashMap();
        Class<? extends Object> term36403 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term36402 = ((Class) term36403).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term36402).setAccessible(true);
        Object enum70 = ((Field) term36402).get((Object) null);
        term14996 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term15009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term15010 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term15066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term15080 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15115 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term14996, term14996.getClass(), "fnName", "LvztehSlhM");
        setField(term14996, term14996.getClass(), "compiler", null);
        setField(term14996, term14996.getClass(), "codingConvention", null);
        setField(term15009, term15009.getClass(), "reporter", null);
        setField(term15009, term15009.getClass(), "nativeTypes", term15010);
        setField(term15009, term15009.getClass(), "namesToTypes", term15011);
        setField(term15009, term15009.getClass(), "namespaces", term15019);
        setField(term15009, term15009.getClass(), "enumTypeNames", term15026);
        setField(term15009, term15009.getClass(), "forwardDeclaredTypes", term15033);
        setField(term15009, term15009.getClass(), "typesIndexedByProperty", term15040);
        setField(term15009, term15009.getClass(), "greatestSubtypeByProperty", term15045);
        setField(term15009, term15009.getClass(), "interfaceToImplementors", null);
        setField(term15009, term15009.getClass(), "unresolvedNamedTypes", null);
        setField(term15009, term15009.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term15009, term15009.getClass(), "lastGeneration", true);
        setField(term15009, term15009.getClass(), "templateTypeName", "UqgLPaaAHi");
        setField(term15066, term15066.getClass(), "name", "xypryEkUPF");
        setField(term15066, term15066.getClass(), "referencedType", null);
        setBooleanField(term15066, term15066.getClass(), "visited", false);
        setField(term15080, term15080.getClass(), "info", null);
        setField(term15080, term15080.getClass(), "documentation", null);
        setField(term15080, term15080.getClass(), "sourceName", null);
        setField(term15080, term15080.getClass(), "visibility", null);
        setIntField(term15080, term15080.getClass(), "bitset", 0);
        setField(term15080, term15080.getClass(), "type", null);
        setField(term15080, term15080.getClass(), "thisType", null);
        setBooleanField(term15080, term15080.getClass(), "includeDocumentation", false);
        setField(term15066, term15066.getClass(), "docInfo", term15080);
        setBooleanField(term15066, term15066.getClass(), "unknown", false);
        setBooleanField(term15066, term15066.getClass(), "resolved", true);
        setField(term15066, term15066.getClass(), "resolveResult", null);
        setField(term15066, term15066.getClass(), "registry", null);
        setField(term15009, term15009.getClass(), "templateType", term15066);
        setBooleanField(term15009, term15009.getClass(), "tolerateUndefinedValues", true);
        setField(term15009, term15009.getClass(), "resolveMode", enum70);
        setField(term14996, term14996.getClass(), "typeRegistry", term15009);
        setIntField(term15100, term15100.getClass(), "type", 0);
        setField(term15100, term15100.getClass(), "next", null);
        setField(term15100, term15100.getClass(), "first", null);
        setField(term15100, term15100.getClass(), "last", null);
        setField(term15100, term15100.getClass(), "propListHead", null);
        setIntField(term15100, term15100.getClass(), "sourcePosition", 0);
        setField(term15100, term15100.getClass(), "jsType", null);
        setField(term15100, term15100.getClass(), "parent", null);
        setField(term14996, term14996.getClass(), "errorRoot", term15100);
        setField(term14996, term14996.getClass(), "sourceName", "zyZTzHNjQr");
        setField(term15115, term15115.getClass(), "vars", null);
        setField(term15115, term15115.getClass(), "parent", null);
        setField(term15115, term15115.getClass(), "rootNode", null);
        setField(term15115, term15115.getClass(), "thisType", null);
        setBooleanField(term15115, term15115.getClass(), "isBottom", false);
        setField(term14996, term14996.getClass(), "scope", term15115);
        setField(term14996, term14996.getClass(), "returnType", null);
        setField(term14996, term14996.getClass(), "implementedInterfaces", null);
        setField(term14996, term14996.getClass(), "baseType", null);
        setField(term14996, term14996.getClass(), "thisType", null);
        setBooleanField(term14996, term14996.getClass(), "isConstructor", false);
        setBooleanField(term14996, term14996.getClass(), "isInterface", false);
        setField(term14996, term14996.getClass(), "parametersNode", null);
        setField(term14996, term14996.getClass(), "sourceNode", null);
        setField(term14996, term14996.getClass(), "templateTypeName", null);
        Class<? extends Object> term36789 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term36788 = ((Class) term36789).getDeclaredField((String) "WARNING");
        ((Field) term36788).setAccessible(true);
        Object enum71 = ((Field) term36788).get((Object) null);
        Class<? extends Object> term37012 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term37011 = ((Class) term37012).getDeclaredField((String) "OFF");
        ((Field) term37011).setAccessible(true);
        Object enum72 = ((Field) term37011).get((Object) null);
        term15119 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term15132 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term15133 = newInstance(Class.forName("java.util.Locale"));
        Object term15134 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term15153 = (Object[]) newArray("java.text.Format", 6);
        int[] term15154 = (int[]) newIntArray(5);
        int[] term15160 = (int[]) newIntArray(9);
        setField(term15119, term15119.getClass(), "key", "YSrFKQQwXE");
        setField(term15134, term15134.getClass(), "language", "");
        setField(term15134, term15134.getClass(), "script", "");
        setField(term15134, term15134.getClass(), "region", "");
        setField(term15134, term15134.getClass(), "variant", "");
        setIntField(term15134, term15134.getClass(), "hash", 106966554);
        setField(term15133, term15133.getClass(), "baseLocale", term15134);
        setField(term15133, term15133.getClass(), "localeExtensions", null);
        setIntField(term15133, term15133.getClass(), "hashCodeValue", 106966554);
        setField(term15133, term15133.getClass(), "languageTag", null);
        setField(term15132, term15132.getClass(), "locale", term15133);
        setField(term15132, term15132.getClass(), "pattern", "qxhOsmyyjm");
        setField(term15132, term15132.getClass(), "formats", term15153);
        setIntElement(term15154, 0, 1694224101);
        setIntElement(term15154, 1, 937859191);
        setIntElement(term15154, 2, -916584829);
        setIntElement(term15154, 3, -2131181468);
        setIntElement(term15154, 4, 282916351);
        setField(term15132, term15132.getClass(), "offsets", term15154);
        setIntElement(term15160, 0, 880977281);
        setIntElement(term15160, 1, 371943306);
        setIntElement(term15160, 2, 982388293);
        setIntElement(term15160, 3, -159494544);
        setIntElement(term15160, 4, -75206835);
        setIntElement(term15160, 5, -1618206977);
        setIntElement(term15160, 6, -1747406163);
        setIntElement(term15160, 7, 388157121);
        setIntElement(term15160, 8, 1684998508);
        setField(term15132, term15132.getClass(), "argumentNumbers", term15160);
        setIntField(term15132, term15132.getClass(), "maxOffset", -1476644457);
        setField(term15119, term15119.getClass(), "format", term15132);
        setField(term15119, term15119.getClass(), "defaultLevel", enum71);
        setField(term15119, term15119.getClass(), "level", enum72);
        term15189 = (Object[]) newArray("java.lang.String", 2);
        setElement(term15189, 0, "DuKcNfVVYR");
        setElement(term15189, 1, "fRujHWvXjJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term15119;
        args[1] = term15189;
        try {
            callMethod(klass, "reportWarning", argTypes, term14996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


