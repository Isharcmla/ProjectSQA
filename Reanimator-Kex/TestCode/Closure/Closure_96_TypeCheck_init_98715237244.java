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
import java.util.ArrayList;
import java.lang.String;

public class TypeCheck_init_98715237244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1421;
     Object enum57;
     Object enum58;

    public TypeCheck_init_98715237244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1423 = new HashMap();
        HashMap term1433 = new HashMap();
        Set<Object> term26865 =  ((Map) term1433).keySet();
        HashSet term1432 = new HashSet((Collection<? extends Object>) term26865);
        HashMap term1439 = new HashMap();
        Set<Object> term26866 =  ((Map) term1439).keySet();
        HashSet term1438 = new HashSet((Collection<? extends Object>) term26866);
        HashMap term1448 = new HashMap();
        Set<Object> term26867 =  ((Map) term1448).keySet();
        HashSet term1447 = new HashSet((Collection<? extends Object>) term26867);
        HashMap term1453 = new HashMap();
        HashMap term1458 = new HashMap();
        ArrayList term1497 = new ArrayList();
        ((ArrayList) term1497).add((Object)null);
        ((ArrayList) term1497).add((Object)null);
        HashMap term1500 = new HashMap();
        ArrayList term1505 = new ArrayList();
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        HashSet term1512 = new HashSet();
        ArrayList term1514 = new ArrayList();
        ((ArrayList) term1514).add((Object)null);
        ((ArrayList) term1514).add((Object)null);
        ((ArrayList) term1514).add((Object)null);
        ((ArrayList) term1514).add((Object)null);
        ((ArrayList) term1514).add((Object)null);
        HashMap term1517 = new HashMap();
        HashMap term1522 = new HashMap();
        ArrayList term1531 = new ArrayList();
        ((ArrayList) term1531).add((Object)null);
        ((ArrayList) term1531).add((Object)null);
        ((ArrayList) term1531).add((Object)null);
        ((ArrayList) term1531).add((Object)null);
        ((ArrayList) term1531).add((Object)null);
        ArrayList term1534 = new ArrayList();
        ((ArrayList) term1534).add((Object)null);
        ((ArrayList) term1534).add((Object)null);
        ((ArrayList) term1534).add((Object)null);
        ((ArrayList) term1534).add((Object)null);
        Class<? extends Object> term26899 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term26898 = ((Class) term26899).getDeclaredField((String) "PUBLIC");
        ((Field) term26898).setAccessible(true);
        Object enum55 = ((Field) term26898).get((Object) null);
        Class<? extends Object> term27164 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term27163 = ((Class) term27164).getDeclaredField((String) "IMMEDIATE");
        ((Field) term27163).setAccessible(true);
        Object enum56 = ((Field) term27163).get((Object) null);
        term1421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1422 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term1480 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1494 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1495 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term1496 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1513 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term1553 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1558 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term1559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1421, term1421.getClass(), "reporter", null);
        setField(term1421, term1421.getClass(), "nativeTypes", term1422);
        setField(term1421, term1421.getClass(), "namesToTypes", term1423);
        setField(term1421, term1421.getClass(), "namespaces", term1432);
        setField(term1421, term1421.getClass(), "enumTypeNames", term1438);
        setField(term1421, term1421.getClass(), "forwardDeclaredTypes", term1447);
        setField(term1421, term1421.getClass(), "typesIndexedByProperty", term1453);
        setField(term1421, term1421.getClass(), "greatestSubtypeByProperty", term1458);
        setField(term1421, term1421.getClass(), "interfaceToImplementors", null);
        setField(term1421, term1421.getClass(), "unresolvedNamedTypes", null);
        setField(term1421, term1421.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1421, term1421.getClass(), "lastGeneration", true);
        setField(term1421, term1421.getClass(), "templateTypeName", "JDswTTCZHV");
        setField(term1480, term1480.getClass(), "name", "onpbIeEKoi");
        setField(term1480, term1480.getClass(), "referencedType", null);
        setBooleanField(term1480, term1480.getClass(), "visited", true);
        setField(term1496, term1496.getClass(), "root", null);
        setField(term1496, term1496.getClass(), "sourceName", null);
        setField(term1495, term1495.getClass(), "baseType", term1496);
        setField(term1495, term1495.getClass(), "implementedInterfaces", term1497);
        setField(term1495, term1495.getClass(), "parameters", term1500);
        setField(term1495, term1495.getClass(), "thrownTypes", term1505);
        setField(term1495, term1495.getClass(), "templateTypeName", "");
        setField(term1495, term1495.getClass(), "description", "");
        setField(term1495, term1495.getClass(), "deprecated", "");
        setField(term1495, term1495.getClass(), "license", "");
        setField(term1495, term1495.getClass(), "suppressions", term1512);
        setField(term1494, term1494.getClass(), "info", term1495);
        setField(term1513, term1513.getClass(), "markers", term1514);
        setField(term1513, term1513.getClass(), "parameters", term1517);
        setField(term1513, term1513.getClass(), "throwsDescriptions", term1522);
        setField(term1513, term1513.getClass(), "blockDescription", "");
        setField(term1513, term1513.getClass(), "fileOverview", "");
        setField(term1513, term1513.getClass(), "returnDescription", "");
        setField(term1513, term1513.getClass(), "version", "");
        setField(term1513, term1513.getClass(), "authors", term1531);
        setField(term1513, term1513.getClass(), "sees", term1534);
        setField(term1494, term1494.getClass(), "documentation", term1513);
        setField(term1494, term1494.getClass(), "sourceName", "TimdotUuNC");
        setField(term1494, term1494.getClass(), "visibility", enum55);
        setIntField(term1494, term1494.getClass(), "bitset", 1134449235);
        setIntField(term1554, term1554.getClass(), "type", 0);
        setField(term1554, term1554.getClass(), "next", null);
        setField(term1554, term1554.getClass(), "first", null);
        setField(term1554, term1554.getClass(), "last", null);
        setField(term1554, term1554.getClass(), "propListHead", null);
        setIntField(term1554, term1554.getClass(), "sourcePosition", 0);
        setField(term1554, term1554.getClass(), "jsType", null);
        setField(term1554, term1554.getClass(), "parent", null);
        setField(term1553, term1553.getClass(), "root", term1554);
        setField(term1553, term1553.getClass(), "sourceName", "");
        setField(term1494, term1494.getClass(), "type", term1553);
        setIntField(term1559, term1559.getClass(), "type", 0);
        setField(term1559, term1559.getClass(), "next", null);
        setField(term1559, term1559.getClass(), "first", null);
        setField(term1559, term1559.getClass(), "last", null);
        setField(term1559, term1559.getClass(), "propListHead", null);
        setIntField(term1559, term1559.getClass(), "sourcePosition", 0);
        setField(term1559, term1559.getClass(), "jsType", null);
        setField(term1559, term1559.getClass(), "parent", null);
        setField(term1558, term1558.getClass(), "root", term1559);
        setField(term1558, term1558.getClass(), "sourceName", "");
        setField(term1494, term1494.getClass(), "thisType", term1558);
        setBooleanField(term1494, term1494.getClass(), "includeDocumentation", false);
        setField(term1480, term1480.getClass(), "docInfo", term1494);
        setBooleanField(term1480, term1480.getClass(), "unknown", true);
        setBooleanField(term1480, term1480.getClass(), "resolved", false);
        setField(term1480, term1480.getClass(), "resolveResult", null);
        setField(term1566, term1566.getClass(), "reporter", null);
        setField(term1566, term1566.getClass(), "nativeTypes", null);
        setField(term1566, term1566.getClass(), "namesToTypes", null);
        setField(term1566, term1566.getClass(), "namespaces", null);
        setField(term1566, term1566.getClass(), "enumTypeNames", null);
        setField(term1566, term1566.getClass(), "forwardDeclaredTypes", null);
        setField(term1566, term1566.getClass(), "typesIndexedByProperty", null);
        setField(term1566, term1566.getClass(), "greatestSubtypeByProperty", null);
        setField(term1566, term1566.getClass(), "interfaceToImplementors", null);
        setField(term1566, term1566.getClass(), "unresolvedNamedTypes", null);
        setField(term1566, term1566.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1566, term1566.getClass(), "lastGeneration", false);
        setField(term1566, term1566.getClass(), "templateTypeName", null);
        setField(term1566, term1566.getClass(), "templateType", null);
        setBooleanField(term1566, term1566.getClass(), "tolerateUndefinedValues", false);
        setField(term1566, term1566.getClass(), "resolveMode", null);
        setField(term1480, term1480.getClass(), "registry", term1566);
        setField(term1421, term1421.getClass(), "templateType", term1480);
        setBooleanField(term1421, term1421.getClass(), "tolerateUndefinedValues", true);
        setField(term1421, term1421.getClass(), "resolveMode", enum56);
        Class<? extends Object> term27503 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term27502 = ((Class) term27503).getDeclaredField((String) "WARNING");
        ((Field) term27502).setAccessible(true);
        enum57 = ((Field) term27502).get((Object) null);
        Class<? extends Object> term27726 = Class.forName((String) "com.google.javascript.jscomp.CheckLevel");
        Field term27725 = ((Class) term27726).getDeclaredField((String) "OFF");
        ((Field) term27725).setAccessible(true);
        enum58 = ((Field) term27725).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.CheckLevel");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term1421;
        args[3] = enum57;
        args[4] = enum58;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


