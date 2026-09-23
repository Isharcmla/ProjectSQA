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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UnionType_restrictByNotNullOrUndefined_43506638739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1439;

    public UnionType_restrictByNotNullOrUndefined_43506638739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1441 = new HashMap();
        Set<Object> term6395 =  ((Map) term1441).keySet();
        HashSet term1440 = new HashSet((Collection<? extends Object>) term6395);
        HashMap term1452 = new HashMap();
        HashMap term1461 = new HashMap();
        Set<Object> term6396 =  ((Map) term1461).keySet();
        HashSet term1460 = new HashSet((Collection<? extends Object>) term6396);
        HashMap term1468 = new HashMap();
        Set<Object> term6397 =  ((Map) term1468).keySet();
        HashSet term1467 = new HashSet((Collection<? extends Object>) term6397);
        HashMap term1474 = new HashMap();
        Set<Object> term6398 =  ((Map) term1474).keySet();
        HashSet term1473 = new HashSet((Collection<? extends Object>) term6398);
        HashMap term1480 = new HashMap();
        HashMap term1485 = new HashMap();
        term1439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term1450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term1451 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term1506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term1520 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1439, term1439.getClass(), "alternates", term1440);
        setBooleanField(term1439, term1439.getClass(), "resolved", true);
        setField(term1439, term1439.getClass(), "resolveResult", null);
        setField(term1450, term1450.getClass(), "reporter", null);
        setField(term1450, term1450.getClass(), "nativeTypes", term1451);
        setField(term1450, term1450.getClass(), "namesToTypes", term1452);
        setField(term1450, term1450.getClass(), "namespaces", term1460);
        setField(term1450, term1450.getClass(), "enumTypeNames", term1467);
        setField(term1450, term1450.getClass(), "forwardDeclaredTypes", term1473);
        setField(term1450, term1450.getClass(), "typesIndexedByProperty", term1480);
        setField(term1450, term1450.getClass(), "greatestSubtypeByProperty", term1485);
        setField(term1450, term1450.getClass(), "interfaceToImplementors", null);
        setField(term1450, term1450.getClass(), "unresolvedNamedTypes", null);
        setField(term1450, term1450.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term1450, term1450.getClass(), "lastGeneration", true);
        setField(term1450, term1450.getClass(), "templateTypeName", "HDaezxQfQR");
        setField(term1506, term1506.getClass(), "name", "iikZEapDlu");
        setField(term1506, term1506.getClass(), "referencedType", null);
        setBooleanField(term1506, term1506.getClass(), "visited", true);
        setField(term1520, term1520.getClass(), "info", null);
        setField(term1520, term1520.getClass(), "documentation", null);
        setField(term1520, term1520.getClass(), "sourceName", null);
        setField(term1520, term1520.getClass(), "visibility", null);
        setIntField(term1520, term1520.getClass(), "bitset", 0);
        setField(term1520, term1520.getClass(), "type", null);
        setField(term1520, term1520.getClass(), "thisType", null);
        setBooleanField(term1520, term1520.getClass(), "includeDocumentation", false);
        setField(term1506, term1506.getClass(), "docInfo", term1520);
        setBooleanField(term1506, term1506.getClass(), "unknown", false);
        setBooleanField(term1506, term1506.getClass(), "resolved", true);
        setField(term1506, term1506.getClass(), "resolveResult", null);
        setField(term1506, term1506.getClass(), "registry", null);
        setField(term1450, term1450.getClass(), "templateType", term1506);
        setField(term1439, term1439.getClass(), "registry", term1450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.UnionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "restrictByNotNullOrUndefined", argTypes, term1439, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


