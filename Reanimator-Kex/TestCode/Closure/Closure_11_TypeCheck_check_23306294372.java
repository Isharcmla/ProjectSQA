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
import java.lang.Boolean;

public class TypeCheck_check_23306294372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1524;
     Object term1578;
     Object term1605;

    public TypeCheck_check_23306294372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1528 = new HashMap();
        HashMap term1535 = new HashMap();
        Set<Object> term16235 =  ((Map) term1535).keySet();
        HashSet term1534 = new HashSet((Collection<? extends Object>) term16235);
        HashMap term1541 = new HashMap();
        Set<Object> term16236 =  ((Map) term1541).keySet();
        HashSet term1540 = new HashSet((Collection<? extends Object>) term16236);
        HashMap term1547 = new HashMap();
        Set<Object> term16237 =  ((Map) term1547).keySet();
        HashSet term1546 = new HashSet((Collection<? extends Object>) term16237);
        HashMap term1552 = new HashMap();
        HashMap term1558 = new HashMap();
        HashMap term1563 = new HashMap();
        term1524 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term1525 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term1526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1527 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term1524, term1524.getClass(), "compiler", null);
        setField(term1525, term1525.getClass(), "compiler", null);
        setField(term1526, term1526.getClass(), "reporter", null);
        setField(term1526, term1526.getClass(), "nativeTypes", term1527);
        setField(term1526, term1526.getClass(), "namesToTypes", term1528);
        setField(term1526, term1526.getClass(), "namespaces", term1534);
        setField(term1526, term1526.getClass(), "nonNullableTypeNames", term1540);
        setField(term1526, term1526.getClass(), "forwardDeclaredTypes", term1546);
        setField(term1526, term1526.getClass(), "typesIndexedByProperty", term1552);
        setField(term1526, term1526.getClass(), "eachRefTypeIndexedByProperty", term1558);
        setField(term1526, term1526.getClass(), "greatestSubtypeByProperty", term1563);
        setField(term1526, term1526.getClass(), "interfaceToImplementors", null);
        setField(term1526, term1526.getClass(), "unresolvedNamedTypes", null);
        setField(term1526, term1526.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1526, term1526.getClass(), "lastGeneration", false);
        setField(term1526, term1526.getClass(), "templateTypes", null);
        setBooleanField(term1526, term1526.getClass(), "tolerateUndefinedValues", false);
        setField(term1526, term1526.getClass(), "resolveMode", null);
        setField(term1525, term1525.getClass(), "typeRegistry", term1526);
        setField(term1525, term1525.getClass(), "allValueTypes", null);
        setBooleanField(term1525, term1525.getClass(), "shouldReport", false);
        setField(term1525, term1525.getClass(), "nullOrUndefined", null);
        setField(term1525, term1525.getClass(), "mismatches", null);
        setField(term1524, term1524.getClass(), "validator", term1525);
        setField(term1524, term1524.getClass(), "reverseInterpreter", null);
        setField(term1524, term1524.getClass(), "typeRegistry", null);
        setField(term1524, term1524.getClass(), "topScope", null);
        setField(term1524, term1524.getClass(), "scopeCreator", null);
        setField(term1524, term1524.getClass(), "reportMissingOverride", null);
        setField(term1524, term1524.getClass(), "reportUnknownTypes", null);
        setBooleanField(term1524, term1524.getClass(), "reportMissingProperties", false);
        setField(term1524, term1524.getClass(), "inferJSDocInfo", null);
        setIntField(term1524, term1524.getClass(), "typedCount", 0);
        setIntField(term1524, term1524.getClass(), "nullCount", 0);
        setIntField(term1524, term1524.getClass(), "unknownCount", 0);
        setBooleanField(term1524, term1524.getClass(), "inExterns", false);
        setIntField(term1524, term1524.getClass(), "noTypeCheckSection", 0);
        term1578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1578, term1578.getClass(), "type", 1240914516);
        setIntField(term1580, term1580.getClass(), "type", -1465035361);
        setIntField(term1582, term1582.getClass(), "type", 1090617576);
        setIntField(term1584, term1584.getClass(), "type", -1547384488);
        setIntField(term1586, term1586.getClass(), "type", 1442160736);
        setField(term1586, term1586.getClass(), "next", null);
        setField(term1586, term1586.getClass(), "first", null);
        setField(term1586, term1586.getClass(), "last", null);
        setField(term1586, term1586.getClass(), "propListHead", null);
        setIntField(term1586, term1586.getClass(), "sourcePosition", 0);
        setField(term1586, term1586.getClass(), "jsType", null);
        setField(term1586, term1586.getClass(), "parent", null);
        setField(term1584, term1584.getClass(), "next", term1586);
        setIntField(term1589, term1589.getClass(), "type", 1114000454);
        setField(term1589, term1589.getClass(), "next", null);
        setField(term1589, term1589.getClass(), "first", null);
        setField(term1589, term1589.getClass(), "last", term1586);
        setField(term1589, term1589.getClass(), "propListHead", null);
        setIntField(term1589, term1589.getClass(), "sourcePosition", 0);
        setField(term1589, term1589.getClass(), "jsType", null);
        setField(term1589, term1589.getClass(), "parent", null);
        setField(term1584, term1584.getClass(), "first", term1589);
        setField(term1584, term1584.getClass(), "last", term1582);
        setField(term1584, term1584.getClass(), "propListHead", null);
        setIntField(term1584, term1584.getClass(), "sourcePosition", 0);
        setField(term1584, term1584.getClass(), "jsType", null);
        setField(term1584, term1584.getClass(), "parent", null);
        setField(term1582, term1582.getClass(), "next", term1584);
        setField(term1582, term1582.getClass(), "first", term1586);
        setIntField(term1593, term1593.getClass(), "type", -1772434990);
        setIntField(term1595, term1595.getClass(), "type", -1845499264);
        setField(term1595, term1595.getClass(), "next", null);
        setField(term1595, term1595.getClass(), "first", term1589);
        setField(term1595, term1595.getClass(), "last", term1584);
        setField(term1595, term1595.getClass(), "propListHead", null);
        setIntField(term1595, term1595.getClass(), "sourcePosition", 0);
        setField(term1595, term1595.getClass(), "jsType", null);
        setField(term1595, term1595.getClass(), "parent", null);
        setField(term1593, term1593.getClass(), "next", term1595);
        setField(term1593, term1593.getClass(), "first", term1580);
        setField(term1593, term1593.getClass(), "last", term1580);
        setField(term1593, term1593.getClass(), "propListHead", null);
        setIntField(term1593, term1593.getClass(), "sourcePosition", 0);
        setField(term1593, term1593.getClass(), "jsType", null);
        setField(term1593, term1593.getClass(), "parent", null);
        setField(term1582, term1582.getClass(), "last", term1593);
        setField(term1582, term1582.getClass(), "propListHead", null);
        setIntField(term1582, term1582.getClass(), "sourcePosition", 0);
        setField(term1582, term1582.getClass(), "jsType", null);
        setField(term1582, term1582.getClass(), "parent", null);
        setField(term1580, term1580.getClass(), "next", term1582);
        setIntField(term1600, term1600.getClass(), "type", -505439934);
        setField(term1600, term1600.getClass(), "next", term1593);
        setField(term1600, term1600.getClass(), "first", term1595);
        setField(term1600, term1600.getClass(), "last", term1578);
        setField(term1600, term1600.getClass(), "propListHead", null);
        setIntField(term1600, term1600.getClass(), "sourcePosition", 0);
        setField(term1600, term1600.getClass(), "jsType", null);
        setField(term1600, term1600.getClass(), "parent", null);
        setField(term1580, term1580.getClass(), "first", term1600);
        setField(term1580, term1580.getClass(), "last", term1600);
        setField(term1580, term1580.getClass(), "propListHead", null);
        setIntField(term1580, term1580.getClass(), "sourcePosition", 0);
        setField(term1580, term1580.getClass(), "jsType", null);
        setField(term1580, term1580.getClass(), "parent", null);
        setField(term1578, term1578.getClass(), "next", term1580);
        setField(term1578, term1578.getClass(), "first", term1584);
        setField(term1578, term1578.getClass(), "last", term1586);
        setField(term1578, term1578.getClass(), "propListHead", null);
        setIntField(term1578, term1578.getClass(), "sourcePosition", 0);
        setField(term1578, term1578.getClass(), "jsType", null);
        setField(term1578, term1578.getClass(), "parent", null);
        term1605 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1578;
        args[1] = term1605;
        try {
            callMethod(klass, "check", argTypes, term1524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


