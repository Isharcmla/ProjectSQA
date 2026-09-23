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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_testForEquality_87171697940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549;
     Object term6496;

    public UnionType_testForEquality_87171697940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1551 = new HashMap();
        Set<Object> term6517 =  ((Map) term1551).keySet();
        HashSet term1550 = new HashSet((Collection<? extends Object>) term6517);
        HashMap term1562 = new HashMap();
        HashMap term1571 = new HashMap();
        Set<Object> term6518 =  ((Map) term1571).keySet();
        HashSet term1570 = new HashSet((Collection<? extends Object>) term6518);
        HashMap term1578 = new HashMap();
        Set<Object> term6519 =  ((Map) term1578).keySet();
        HashSet term1577 = new HashSet((Collection<? extends Object>) term6519);
        HashMap term1585 = new HashMap();
        Set<Object> term6520 =  ((Map) term1585).keySet();
        HashSet term1584 = new HashSet((Collection<? extends Object>) term6520);
        HashMap term1591 = new HashMap();
        HashMap term1596 = new HashMap();
        term1549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1561 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term1617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1631 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1549, term1549.getClass(), "alternates", term1550);
        setBooleanField(term1549, term1549.getClass(), "resolved", false);
        setField(term1549, term1549.getClass(), "resolveResult", null);
        setField(term1560, term1560.getClass(), "reporter", null);
        setField(term1560, term1560.getClass(), "nativeTypes", term1561);
        setField(term1560, term1560.getClass(), "namesToTypes", term1562);
        setField(term1560, term1560.getClass(), "namespaces", term1570);
        setField(term1560, term1560.getClass(), "enumTypeNames", term1577);
        setField(term1560, term1560.getClass(), "forwardDeclaredTypes", term1584);
        setField(term1560, term1560.getClass(), "typesIndexedByProperty", term1591);
        setField(term1560, term1560.getClass(), "greatestSubtypeByProperty", term1596);
        setField(term1560, term1560.getClass(), "interfaceToImplementors", null);
        setField(term1560, term1560.getClass(), "unresolvedNamedTypes", null);
        setField(term1560, term1560.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1560, term1560.getClass(), "lastGeneration", false);
        setField(term1560, term1560.getClass(), "templateTypeName", "qCpEbQDHdF");
        setField(term1617, term1617.getClass(), "name", "AHbZyFOmlo");
        setField(term1617, term1617.getClass(), "referencedType", null);
        setBooleanField(term1617, term1617.getClass(), "visited", true);
        setField(term1631, term1631.getClass(), "info", null);
        setField(term1631, term1631.getClass(), "documentation", null);
        setField(term1631, term1631.getClass(), "sourceName", null);
        setField(term1631, term1631.getClass(), "visibility", null);
        setIntField(term1631, term1631.getClass(), "bitset", 0);
        setField(term1631, term1631.getClass(), "type", null);
        setField(term1631, term1631.getClass(), "thisType", null);
        setBooleanField(term1631, term1631.getClass(), "includeDocumentation", false);
        setField(term1617, term1617.getClass(), "docInfo", term1631);
        setBooleanField(term1617, term1617.getClass(), "unknown", false);
        setBooleanField(term1617, term1617.getClass(), "resolved", true);
        setField(term1617, term1617.getClass(), "resolveResult", null);
        setField(term1617, term1617.getClass(), "registry", null);
        setField(term1560, term1560.getClass(), "templateType", term1617);
        setField(term1549, term1549.getClass(), "registry", term1560);
        HashMap term6498 = new HashMap();
        Set<Object> term6541 =  ((Map) term6498).keySet();
        HashSet term6497 = new HashSet((Collection<? extends Object>) term6541);
        HashMap term6502 = new HashMap();
        HashMap term6504 = new HashMap();
        Set<Object> term6542 =  ((Map) term6504).keySet();
        HashSet term6503 = new HashSet((Collection<? extends Object>) term6542);
        HashMap term6506 = new HashMap();
        Set<Object> term6543 =  ((Map) term6506).keySet();
        HashSet term6505 = new HashSet((Collection<? extends Object>) term6543);
        HashMap term6508 = new HashMap();
        Set<Object> term6544 =  ((Map) term6508).keySet();
        HashSet term6507 = new HashSet((Collection<? extends Object>) term6544);
        HashMap term6509 = new HashMap();
        HashMap term6510 = new HashMap();
        term6496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term6500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6501 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term6513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term6516 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6496, term6496.getClass(), "alternates", term6497);
        setBooleanField(term6496, term6496.getClass(), "resolved", false);
        setField(term6496, term6496.getClass(), "resolveResult", null);
        setField(term6500, term6500.getClass(), "reporter", null);
        setField(term6500, term6500.getClass(), "nativeTypes", term6501);
        setField(term6500, term6500.getClass(), "namesToTypes", term6502);
        setField(term6500, term6500.getClass(), "namespaces", term6503);
        setField(term6500, term6500.getClass(), "enumTypeNames", term6505);
        setField(term6500, term6500.getClass(), "forwardDeclaredTypes", term6507);
        setField(term6500, term6500.getClass(), "typesIndexedByProperty", term6509);
        setField(term6500, term6500.getClass(), "greatestSubtypeByProperty", term6510);
        setField(term6500, term6500.getClass(), "interfaceToImplementors", null);
        setField(term6500, term6500.getClass(), "unresolvedNamedTypes", null);
        setField(term6500, term6500.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6500, term6500.getClass(), "lastGeneration", false);
        setField(term6500, term6500.getClass(), "templateTypeName", "qCpEbQDHdF");
        setField(term6513, term6513.getClass(), "name", "AHbZyFOmlo");
        setField(term6513, term6513.getClass(), "referencedType", null);
        setBooleanField(term6513, term6513.getClass(), "visited", true);
        setField(term6516, term6516.getClass(), "info", null);
        setField(term6516, term6516.getClass(), "documentation", null);
        setField(term6516, term6516.getClass(), "sourceName", null);
        setField(term6516, term6516.getClass(), "visibility", null);
        setIntField(term6516, term6516.getClass(), "bitset", 0);
        setField(term6516, term6516.getClass(), "type", null);
        setField(term6516, term6516.getClass(), "thisType", null);
        setBooleanField(term6516, term6516.getClass(), "includeDocumentation", false);
        setField(term6513, term6513.getClass(), "docInfo", term6516);
        setBooleanField(term6513, term6513.getClass(), "unknown", false);
        setBooleanField(term6513, term6513.getClass(), "resolved", true);
        setField(term6513, term6513.getClass(), "resolveResult", null);
        setField(term6513, term6513.getClass(), "registry", null);
        setField(term6500, term6500.getClass(), "templateType", term6513);
        setField(term6496, term6496.getClass(), "registry", term6500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "testForEquality", argTypes, term1549, args);
        assertTrue(recursiveEquals(term1549, term6496));
        assertTrue(recursiveEquals(retValue, null));
    }

};


