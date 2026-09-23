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

public class TypeValidator_registerMismatch_17376663380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6749;
     Object term6805;

    public TypeValidator_registerMismatch_17376663380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6752 = new HashMap();
        HashMap term6761 = new HashMap();
        Set<Object> term17045 =  ((Map) term6761).keySet();
        HashSet term6760 = new HashSet((Collection<? extends Object>) term17045);
        HashMap term6768 = new HashMap();
        Set<Object> term17046 =  ((Map) term6768).keySet();
        HashSet term6767 = new HashSet((Collection<? extends Object>) term17046);
        HashMap term6775 = new HashMap();
        Set<Object> term17047 =  ((Map) term6775).keySet();
        HashSet term6774 = new HashSet((Collection<? extends Object>) term17047);
        HashMap term6781 = new HashMap();
        HashMap term6789 = new HashMap();
        HashMap term6794 = new HashMap();
        term6749 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term6750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6751 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term6749, term6749.getClass(), "compiler", null);
        setField(term6750, term6750.getClass(), "reporter", null);
        setField(term6750, term6750.getClass(), "nativeTypes", term6751);
        setField(term6750, term6750.getClass(), "namesToTypes", term6752);
        setField(term6750, term6750.getClass(), "namespaces", term6760);
        setField(term6750, term6750.getClass(), "nonNullableTypeNames", term6767);
        setField(term6750, term6750.getClass(), "forwardDeclaredTypes", term6774);
        setField(term6750, term6750.getClass(), "typesIndexedByProperty", term6781);
        setField(term6750, term6750.getClass(), "eachRefTypeIndexedByProperty", term6789);
        setField(term6750, term6750.getClass(), "greatestSubtypeByProperty", term6794);
        setField(term6750, term6750.getClass(), "interfaceToImplementors", null);
        setField(term6750, term6750.getClass(), "unresolvedNamedTypes", null);
        setField(term6750, term6750.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6750, term6750.getClass(), "lastGeneration", false);
        setField(term6750, term6750.getClass(), "templateTypes", null);
        setBooleanField(term6750, term6750.getClass(), "tolerateUndefinedValues", false);
        setField(term6750, term6750.getClass(), "resolveMode", null);
        setField(term6749, term6749.getClass(), "typeRegistry", term6750);
        setField(term6749, term6749.getClass(), "allValueTypes", null);
        setBooleanField(term6749, term6749.getClass(), "shouldReport", false);
        setField(term6749, term6749.getClass(), "nullOrUndefined", null);
        setField(term6749, term6749.getClass(), "mismatches", null);
        Class<? extends Object> term17078 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term17077 = ((Class) term17078).getDeclaredField((String) "WARNING");
        ((Field) term17077).setAccessible(true);
        Object enum11 = ((Field) term17077).get((Object) null);
        Class<? extends Object> term17301 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term17300 = ((Class) term17301).getDeclaredField((String) "OFF");
        ((Field) term17300).setAccessible(true);
        Object enum12 = ((Field) term17300).get((Object) null);
        term6805 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        Object term6806 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        Object term6819 = newInstance(Class.forName("java.text.MessageFormat"));
        Object term6820 = newInstance(Class.forName("java.util.Locale"));
        Object term6821 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term6836 = (Object[]) newArray("java.text.Format", 4);
        int[] term6837 = (int[]) newIntArray(5);
        int[] term6843 = (int[]) newIntArray(4);
        Object term6891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6806, term6806.getClass(), "key", "tydPpKxAbv");
        setField(term6821, term6821.getClass(), "language", null);
        setField(term6821, term6821.getClass(), "script", null);
        setField(term6821, term6821.getClass(), "region", null);
        setField(term6821, term6821.getClass(), "variant", null);
        setIntField(term6821, term6821.getClass(), "hash", 106966554);
        setField(term6820, term6820.getClass(), "baseLocale", term6821);
        setField(term6820, term6820.getClass(), "localeExtensions", null);
        setIntField(term6820, term6820.getClass(), "hashCodeValue", 106966554);
        setField(term6820, term6820.getClass(), "languageTag", null);
        setField(term6819, term6819.getClass(), "locale", term6820);
        setField(term6819, term6819.getClass(), "pattern", "CJxQpJUfLJ");
        setField(term6819, term6819.getClass(), "formats", term6836);
        setIntElement(term6837, 0, 1237549886);
        setIntElement(term6837, 1, -1945635750);
        setIntElement(term6837, 2, -1622760744);
        setIntElement(term6837, 3, 2068435279);
        setIntElement(term6837, 4, -1556527718);
        setField(term6819, term6819.getClass(), "offsets", term6837);
        setIntElement(term6843, 0, 895255351);
        setIntElement(term6843, 1, -1317044799);
        setIntElement(term6843, 2, -1428063820);
        setIntElement(term6843, 3, -1271375703);
        setField(term6819, term6819.getClass(), "argumentNumbers", term6843);
        setIntField(term6819, term6819.getClass(), "maxOffset", 1136208236);
        setField(term6806, term6806.getClass(), "format", term6819);
        setField(term6806, term6806.getClass(), "defaultLevel", enum11);
        setField(term6806, term6806.getClass(), "level", enum12);
        setField(term6805, term6805.getClass(), "type", term6806);
        setField(term6805, term6805.getClass(), "description", "NUUjAyqOva");
        setField(term6805, term6805.getClass(), "sourceName", "EoAMIIUdDX");
        setIntField(term6891, term6891.getClass(), "type", 1200440315);
        setIntField(term6893, term6893.getClass(), "type", 40571662);
        setIntField(term6895, term6895.getClass(), "type", 1863910269);
        setIntField(term6897, term6897.getClass(), "type", 864645689);
        setField(term6897, term6897.getClass(), "next", null);
        setField(term6897, term6897.getClass(), "first", null);
        setField(term6897, term6897.getClass(), "last", term6891);
        setField(term6897, term6897.getClass(), "propListHead", null);
        setIntField(term6897, term6897.getClass(), "sourcePosition", 0);
        setField(term6897, term6897.getClass(), "jsType", null);
        setField(term6897, term6897.getClass(), "parent", null);
        setField(term6895, term6895.getClass(), "next", term6897);
        setIntField(term6900, term6900.getClass(), "type", 1427305953);
        setField(term6900, term6900.getClass(), "next", null);
        setField(term6900, term6900.getClass(), "first", null);
        setField(term6900, term6900.getClass(), "last", null);
        setField(term6900, term6900.getClass(), "propListHead", null);
        setIntField(term6900, term6900.getClass(), "sourcePosition", 0);
        setField(term6900, term6900.getClass(), "jsType", null);
        setField(term6900, term6900.getClass(), "parent", null);
        setField(term6895, term6895.getClass(), "first", term6900);
        setField(term6895, term6895.getClass(), "last", term6897);
        setField(term6895, term6895.getClass(), "propListHead", null);
        setIntField(term6895, term6895.getClass(), "sourcePosition", 0);
        setField(term6895, term6895.getClass(), "jsType", null);
        setField(term6895, term6895.getClass(), "parent", null);
        setField(term6893, term6893.getClass(), "next", term6895);
        setField(term6893, term6893.getClass(), "first", term6893);
        setField(term6893, term6893.getClass(), "last", term6893);
        setField(term6893, term6893.getClass(), "propListHead", null);
        setIntField(term6893, term6893.getClass(), "sourcePosition", 0);
        setField(term6893, term6893.getClass(), "jsType", null);
        setField(term6893, term6893.getClass(), "parent", null);
        setField(term6891, term6891.getClass(), "next", term6893);
        setIntField(term6905, term6905.getClass(), "type", 0);
        setField(term6905, term6905.getClass(), "next", null);
        setField(term6905, term6905.getClass(), "first", null);
        setField(term6905, term6905.getClass(), "last", null);
        setField(term6905, term6905.getClass(), "propListHead", null);
        setIntField(term6905, term6905.getClass(), "sourcePosition", 0);
        setField(term6905, term6905.getClass(), "jsType", null);
        setField(term6905, term6905.getClass(), "parent", null);
        setField(term6891, term6891.getClass(), "first", term6905);
        setIntField(term6908, term6908.getClass(), "type", 0);
        setField(term6908, term6908.getClass(), "next", null);
        setField(term6908, term6908.getClass(), "first", null);
        setField(term6908, term6908.getClass(), "last", null);
        setField(term6908, term6908.getClass(), "propListHead", null);
        setIntField(term6908, term6908.getClass(), "sourcePosition", 0);
        setField(term6908, term6908.getClass(), "jsType", null);
        setField(term6908, term6908.getClass(), "parent", null);
        setField(term6891, term6891.getClass(), "last", term6908);
        setField(term6891, term6891.getClass(), "propListHead", null);
        setIntField(term6891, term6891.getClass(), "sourcePosition", 0);
        setField(term6891, term6891.getClass(), "jsType", null);
        setField(term6891, term6891.getClass(), "parent", null);
        setField(term6805, term6805.getClass(), "node", term6891);
        setIntField(term6805, term6805.getClass(), "lineNumber", -781832877);
        setField(term6805, term6805.getClass(), "level", enum11);
        setField(term6805, term6805.getClass(), "defaultLevel", enum12);
        setIntField(term6805, term6805.getClass(), "charno", 797203987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term6805;
        try {
            callMethod(klass, "registerMismatch", argTypes, term6749, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


