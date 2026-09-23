package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class FunctionType_forInterface_212681844057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;
     Object term2025;

    public FunctionType_forInterface_212681844057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1856 = new HashMap();
        HashMap term1866 = new HashMap();
        Set<Object> term24103 =  ((Map) term1866).keySet();
        HashSet term1865 = new HashSet((Collection<? extends Object>) term24103);
        HashMap term1877 = new HashMap();
        Set<Object> term24104 =  ((Map) term1877).keySet();
        HashSet term1876 = new HashSet((Collection<? extends Object>) term24104);
        HashMap term1886 = new HashMap();
        Set<Object> term24105 =  ((Map) term1886).keySet();
        HashSet term1885 = new HashSet((Collection<? extends Object>) term24105);
        HashMap term1906 = new HashMap();
        HashMap term1911 = new HashMap();
        ArrayList term1950 = new ArrayList();
        ((ArrayList) term1950).add((Object)null);
        ((ArrayList) term1950).add((Object)null);
        ((ArrayList) term1950).add((Object)null);
        HashMap term1953 = new HashMap();
        ArrayList term1958 = new ArrayList();
        ((ArrayList) term1958).add((Object)null);
        ((ArrayList) term1958).add((Object)null);
        ((ArrayList) term1958).add((Object)null);
        ((ArrayList) term1958).add((Object)null);
        ((ArrayList) term1958).add((Object)null);
        HashSet term1966 = new HashSet();
        HashSet term1967 = new HashSet();
        ArrayList term1970 = new ArrayList();
        ((ArrayList) term1970).add((Object)null);
        ((ArrayList) term1970).add((Object)null);
        ((ArrayList) term1970).add((Object)null);
        HashMap term1973 = new HashMap();
        Class<? extends Object> term24137 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term24136 = ((Class) term24137).getDeclaredField((String) "PRIVATE");
        ((Field) term24136).setAccessible(true);
        Object enum63 = ((Field) term24136).get((Object) null);
        Class<? extends Object> term24405 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term24404 = ((Class) term24405).getDeclaredField((String) "LAZY_NAMES");
        ((Field) term24404).setAccessible(true);
        Object enum64 = ((Field) term24404).get((Object) null);
        term1854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1855 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term1933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1947 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1948 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1949 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1969 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1994 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term1854, term1854.getClass(), "reporter", null);
        setField(term1854, term1854.getClass(), "nativeTypes", term1855);
        setField(term1854, term1854.getClass(), "namesToTypes", term1856);
        setField(term1854, term1854.getClass(), "namespaces", term1865);
        setField(term1854, term1854.getClass(), "nonNullableTypeNames", term1876);
        setField(term1854, term1854.getClass(), "forwardDeclaredTypes", term1885);
        setField(term1854, term1854.getClass(), "typesIndexedByProperty", term1906);
        setField(term1854, term1854.getClass(), "greatestSubtypeByProperty", term1911);
        setField(term1854, term1854.getClass(), "interfaceToImplementors", null);
        setField(term1854, term1854.getClass(), "unresolvedNamedTypes", null);
        setField(term1854, term1854.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1854, term1854.getClass(), "lastGeneration", false);
        setField(term1854, term1854.getClass(), "templateTypeName", "jUbSRrkrYZ");
        setField(term1933, term1933.getClass(), "name", "bWWfajKbEX");
        setField(term1933, term1933.getClass(), "referencedType", null);
        setField(term1933, term1933.getClass(), "referencedObjType", null);
        setBooleanField(term1933, term1933.getClass(), "visited", false);
        setField(term1949, term1949.getClass(), "root", null);
        setField(term1949, term1949.getClass(), "sourceName", null);
        setField(term1948, term1948.getClass(), "baseType", term1949);
        setField(term1948, term1948.getClass(), "implementedInterfaces", term1950);
        setField(term1948, term1948.getClass(), "parameters", term1953);
        setField(term1948, term1948.getClass(), "thrownTypes", term1958);
        setField(term1948, term1948.getClass(), "templateTypeName", "");
        setField(term1948, term1948.getClass(), "description", "");
        setField(term1948, term1948.getClass(), "meaning", "");
        setField(term1948, term1948.getClass(), "deprecated", "");
        setField(term1948, term1948.getClass(), "license", "");
        setField(term1948, term1948.getClass(), "suppressions", term1966);
        setField(term1948, term1948.getClass(), "modifies", term1967);
        setField(term1948, term1948.getClass(), "lendsName", "");
        setField(term1947, term1947.getClass(), "info", term1948);
        setField(term1969, term1969.getClass(), "markers", term1970);
        setField(term1969, term1969.getClass(), "parameters", term1973);
        setField(term1969, term1969.getClass(), "throwsDescriptions", null);
        setField(term1969, term1969.getClass(), "blockDescription", null);
        setField(term1969, term1969.getClass(), "fileOverview", null);
        setField(term1969, term1969.getClass(), "returnDescription", null);
        setField(term1969, term1969.getClass(), "version", null);
        setField(term1969, term1969.getClass(), "authors", null);
        setField(term1969, term1969.getClass(), "sees", null);
        setField(term1947, term1947.getClass(), "documentation", term1969);
        setField(term1947, term1947.getClass(), "sourceName", "qxSDVejjiY");
        setField(term1947, term1947.getClass(), "visibility", enum63);
        setIntField(term1947, term1947.getClass(), "bitset", 679763016);
        setField(term1994, term1994.getClass(), "root", null);
        setField(term1994, term1994.getClass(), "sourceName", null);
        setField(term1947, term1947.getClass(), "type", term1994);
        setField(term1947, term1947.getClass(), "thisType", term1949);
        setBooleanField(term1947, term1947.getClass(), "includeDocumentation", true);
        setField(term1933, term1933.getClass(), "docInfo", term1947);
        setBooleanField(term1933, term1933.getClass(), "unknown", true);
        setBooleanField(term1933, term1933.getClass(), "resolved", false);
        setField(term1933, term1933.getClass(), "resolveResult", null);
        setField(term1933, term1933.getClass(), "registry", null);
        setField(term1854, term1854.getClass(), "templateType", term1933);
        setBooleanField(term1854, term1854.getClass(), "tolerateUndefinedValues", false);
        setField(term1854, term1854.getClass(), "resolveMode", enum64);
        term2025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2038 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2048 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2025, term2025.getClass(), "type", 1876565163);
        setIntField(term2027, term2027.getClass(), "type", 579005622);
        setIntField(term2029, term2029.getClass(), "type", 0);
        setField(term2029, term2029.getClass(), "next", null);
        setField(term2029, term2029.getClass(), "first", null);
        setField(term2029, term2029.getClass(), "last", null);
        setField(term2029, term2029.getClass(), "propListHead", null);
        setIntField(term2029, term2029.getClass(), "sourcePosition", 0);
        setField(term2029, term2029.getClass(), "jsType", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "next", term2029);
        setIntField(term2032, term2032.getClass(), "type", 0);
        setField(term2032, term2032.getClass(), "next", null);
        setField(term2032, term2032.getClass(), "first", null);
        setField(term2032, term2032.getClass(), "last", null);
        setField(term2032, term2032.getClass(), "propListHead", null);
        setIntField(term2032, term2032.getClass(), "sourcePosition", 0);
        setField(term2032, term2032.getClass(), "jsType", null);
        setField(term2032, term2032.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "first", term2032);
        setIntField(term2035, term2035.getClass(), "type", 0);
        setField(term2035, term2035.getClass(), "next", null);
        setField(term2035, term2035.getClass(), "first", null);
        setField(term2035, term2035.getClass(), "last", null);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "last", term2035);
        setField(term2038, term2038.getClass(), "next", null);
        setIntField(term2038, term2038.getClass(), "type", 0);
        setIntField(term2038, term2038.getClass(), "intValue", 0);
        setField(term2038, term2038.getClass(), "objectValue", null);
        setField(term2027, term2027.getClass(), "propListHead", term2038);
        setIntField(term2027, term2027.getClass(), "sourcePosition", 454281060);
        setField(term2027, term2027.getClass(), "jsType", null);
        setField(term2027, term2027.getClass(), "parent", null);
        setField(term2025, term2025.getClass(), "next", term2027);
        setIntField(term2042, term2042.getClass(), "type", 0);
        setField(term2042, term2042.getClass(), "next", null);
        setField(term2042, term2042.getClass(), "first", null);
        setField(term2042, term2042.getClass(), "last", null);
        setField(term2042, term2042.getClass(), "propListHead", null);
        setIntField(term2042, term2042.getClass(), "sourcePosition", 0);
        setField(term2042, term2042.getClass(), "jsType", null);
        setField(term2042, term2042.getClass(), "parent", null);
        setField(term2025, term2025.getClass(), "first", term2042);
        setIntField(term2045, term2045.getClass(), "type", 0);
        setField(term2045, term2045.getClass(), "next", null);
        setField(term2045, term2045.getClass(), "first", null);
        setField(term2045, term2045.getClass(), "last", null);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2025, term2025.getClass(), "last", term2045);
        setField(term2048, term2048.getClass(), "next", null);
        setIntField(term2048, term2048.getClass(), "type", 0);
        setIntField(term2048, term2048.getClass(), "intValue", 0);
        setField(term2048, term2048.getClass(), "objectValue", null);
        setField(term2025, term2025.getClass(), "propListHead", term2048);
        setIntField(term2025, term2025.getClass(), "sourcePosition", -1786399638);
        setField(term2025, term2025.getClass(), "jsType", null);
        setField(term2025, term2025.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term1854;
        args[1] = "xBsXSDjXYK";
        args[2] = term2025;
        try {
            callMethod(klass, "forInterface", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


