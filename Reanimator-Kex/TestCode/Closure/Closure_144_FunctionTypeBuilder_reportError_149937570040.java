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

public class FunctionTypeBuilder_reportError_149937570040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16114;
     Object term16241;
     Object term16300;

    public FunctionTypeBuilder_reportError_149937570040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16129 = new HashMap();
        HashMap term16138 = new HashMap();
        Set<Object> term38131 =  ((Map) term16138).keySet();
        HashSet term16137 = new HashSet((Collection<? extends Object>) term38131);
        HashMap term16144 = new HashMap();
        Set<Object> term38132 =  ((Map) term16144).keySet();
        HashSet term16143 = new HashSet((Collection<? extends Object>) term38132);
        HashMap term16151 = new HashMap();
        Set<Object> term38133 =  ((Map) term16151).keySet();
        HashSet term16150 = new HashSet((Collection<? extends Object>) term38133);
        HashMap term16156 = new HashMap();
        HashMap term16161 = new HashMap();
        Class<? extends Object> term38155 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term38154 = ((Class) term38155).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term38154).setAccessible(true);
        Object enum75 = ((Field) term38154).get((Object) null);
        term16114 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term16127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term16128 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term16182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term16196 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16237 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term16114, term16114.getClass(), "fnName", "EAIAAStlTz");
        setField(term16114, term16114.getClass(), "compiler", null);
        setField(term16114, term16114.getClass(), "codingConvention", null);
        setField(term16127, term16127.getClass(), "reporter", null);
        setField(term16127, term16127.getClass(), "nativeTypes", term16128);
        setField(term16127, term16127.getClass(), "namesToTypes", term16129);
        setField(term16127, term16127.getClass(), "namespaces", term16137);
        setField(term16127, term16127.getClass(), "enumTypeNames", term16143);
        setField(term16127, term16127.getClass(), "forwardDeclaredTypes", term16150);
        setField(term16127, term16127.getClass(), "typesIndexedByProperty", term16156);
        setField(term16127, term16127.getClass(), "greatestSubtypeByProperty", term16161);
        setField(term16127, term16127.getClass(), "interfaceToImplementors", null);
        setField(term16127, term16127.getClass(), "unresolvedNamedTypes", null);
        setField(term16127, term16127.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16127, term16127.getClass(), "lastGeneration", true);
        setField(term16127, term16127.getClass(), "templateTypeName", "VuLLXpvPpZ");
        setField(term16182, term16182.getClass(), "name", "UEdzEKEEEV");
        setField(term16182, term16182.getClass(), "referencedType", null);
        setBooleanField(term16182, term16182.getClass(), "visited", false);
        setField(term16196, term16196.getClass(), "info", null);
        setField(term16196, term16196.getClass(), "documentation", null);
        setField(term16196, term16196.getClass(), "sourceName", null);
        setField(term16196, term16196.getClass(), "visibility", null);
        setIntField(term16196, term16196.getClass(), "bitset", 0);
        setField(term16196, term16196.getClass(), "type", null);
        setField(term16196, term16196.getClass(), "thisType", null);
        setBooleanField(term16196, term16196.getClass(), "includeDocumentation", false);
        setField(term16182, term16182.getClass(), "docInfo", term16196);
        setBooleanField(term16182, term16182.getClass(), "unknown", true);
        setBooleanField(term16182, term16182.getClass(), "resolved", true);
        setField(term16182, term16182.getClass(), "resolveResult", null);
        setField(term16182, term16182.getClass(), "registry", null);
        setField(term16127, term16127.getClass(), "templateType", term16182);
        setBooleanField(term16127, term16127.getClass(), "tolerateUndefinedValues", false);
        setField(term16127, term16127.getClass(), "resolveMode", enum75);
        setField(term16114, term16114.getClass(), "typeRegistry", term16127);
        setIntField(term16222, term16222.getClass(), "type", 0);
        setField(term16222, term16222.getClass(), "next", null);
        setField(term16222, term16222.getClass(), "first", null);
        setField(term16222, term16222.getClass(), "last", null);
        setField(term16222, term16222.getClass(), "propListHead", null);
        setIntField(term16222, term16222.getClass(), "sourcePosition", 0);
        setField(term16222, term16222.getClass(), "jsType", null);
        setField(term16222, term16222.getClass(), "parent", null);
        setField(term16114, term16114.getClass(), "errorRoot", term16222);
        setField(term16114, term16114.getClass(), "sourceName", "BcENaQFYSd");
        setField(term16237, term16237.getClass(), "vars", null);
        setField(term16237, term16237.getClass(), "parent", null);
        setField(term16237, term16237.getClass(), "rootNode", null);
        setField(term16237, term16237.getClass(), "thisType", null);
        setBooleanField(term16237, term16237.getClass(), "isBottom", false);
        setField(term16114, term16114.getClass(), "scope", term16237);
        setField(term16114, term16114.getClass(), "returnType", null);
        setField(term16114, term16114.getClass(), "implementedInterfaces", null);
        setField(term16114, term16114.getClass(), "baseType", null);
        setField(term16114, term16114.getClass(), "thisType", null);
        setBooleanField(term16114, term16114.getClass(), "isConstructor", false);
        setBooleanField(term16114, term16114.getClass(), "isInterface", false);
        setField(term16114, term16114.getClass(), "parametersNode", null);
        setField(term16114, term16114.getClass(), "sourceNode", null);
        setField(term16114, term16114.getClass(), "templateTypeName", null);
        Class<? extends Object> term38548 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term38547 = ((Class) term38548).getDeclaredField((String) "WARNING");
        ((Field) term38547).setAccessible(true);
        Object enum76 = ((Field) term38547).get((Object) null);
        Class<? extends Object> term38771 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term38770 = ((Class) term38771).getDeclaredField((String) "OFF");
        ((Field) term38770).setAccessible(true);
        Object enum77 = ((Field) term38770).get((Object) null);
        term16241 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term16254 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term16255 = newInstance(Class.forName("java.util.Locale"));
        Object term16256 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term16275 = (Object[]) newArray("java.text.Format", 5);
        int[] term16276 = (int[]) newIntArray(3);
        int[] term16280 = (int[]) newIntArray(0);
        setField(term16241, term16241.getClass(), "key", "POPYycoDBy");
        setField(term16256, term16256.getClass(), "language", "");
        setField(term16256, term16256.getClass(), "script", "");
        setField(term16256, term16256.getClass(), "region", "");
        setField(term16256, term16256.getClass(), "variant", "");
        setIntField(term16256, term16256.getClass(), "hash", 106860317);
        setField(term16255, term16255.getClass(), "baseLocale", term16256);
        setField(term16255, term16255.getClass(), "localeExtensions", null);
        setIntField(term16255, term16255.getClass(), "hashCodeValue", 106860317);
        setField(term16255, term16255.getClass(), "languageTag", null);
        setField(term16254, term16254.getClass(), "locale", term16255);
        setField(term16254, term16254.getClass(), "pattern", "LuWMOXdAPA");
        setField(term16254, term16254.getClass(), "formats", term16275);
        setIntElement(term16276, 0, 1045547089);
        setIntElement(term16276, 1, -1122880881);
        setIntElement(term16276, 2, -542712742);
        setField(term16254, term16254.getClass(), "offsets", term16276);
        setField(term16254, term16254.getClass(), "argumentNumbers", term16280);
        setIntField(term16254, term16254.getClass(), "maxOffset", -1254072822);
        setField(term16241, term16241.getClass(), "format", term16254);
        setField(term16241, term16241.getClass(), "defaultLevel", enum76);
        setField(term16241, term16241.getClass(), "level", enum77);
        term16300 = (Object[]) newArray("java.lang.String", 1);
        setElement(term16300, 0, "blSffTnsOv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term16241;
        args[1] = term16300;
        try {
            callMethod(klass, "reportError", argTypes, term16114, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


