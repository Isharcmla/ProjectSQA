package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getLength_63871272662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1399;
     Object term7088;

    public DOMNodePointer_getLength_63871272662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1400 = new HashMap();
        HashMap term1437 = new HashMap();
        HashMap term1442 = new HashMap();
        HashMap term1448 = new HashMap();
        HashMap term1453 = new HashMap();
        HashMap term1459 = new HashMap();
        HashMap term1464 = new HashMap();
        term1399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1431 = newInstance(Class.forName("java.lang.Object"));
        Object term1432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1435 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1399, term1399.getClass(), "node", null);
        setField(term1399, term1399.getClass(), "namespaces", term1400);
        setField(term1399, term1399.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term1399, term1399.getClass(), "id", "Ghbwtircqb");
        setIntField(term1399, term1399.getClass(), "index", -883034806);
        setBooleanField(term1399, term1399.getClass(), "attribute", false);
        setField(term1399, term1399.getClass(), "rootNode", term1431);
        setField(term1435, term1435.getClass(), "parent", null);
        setField(term1435, term1435.getClass(), "namespaceMap", null);
        setField(term1435, term1435.getClass(), "reverseMap", null);
        setField(term1435, term1435.getClass(), "pointer", null);
        setBooleanField(term1435, term1435.getClass(), "sealed", false);
        setField(term1434, term1434.getClass(), "parent", term1435);
        setField(term1434, term1434.getClass(), "namespaceMap", term1437);
        setField(term1434, term1434.getClass(), "reverseMap", term1442);
        setField(term1434, term1434.getClass(), "pointer", null);
        setBooleanField(term1434, term1434.getClass(), "sealed", false);
        setField(term1433, term1433.getClass(), "parent", term1434);
        setField(term1433, term1433.getClass(), "namespaceMap", term1448);
        setField(term1433, term1433.getClass(), "reverseMap", term1453);
        setField(term1433, term1433.getClass(), "pointer", null);
        setBooleanField(term1433, term1433.getClass(), "sealed", false);
        setField(term1432, term1432.getClass(), "parent", term1433);
        setField(term1432, term1432.getClass(), "namespaceMap", term1459);
        setField(term1432, term1432.getClass(), "reverseMap", term1464);
        setField(term1432, term1432.getClass(), "pointer", null);
        setBooleanField(term1432, term1432.getClass(), "sealed", false);
        setField(term1399, term1399.getClass(), "namespaceResolver", term1432);
        setField(term1399, term1399.getClass(), "parent", null);
        setField(term1399, term1399.getClass(), "locale", null);
        HashMap term7089 = new HashMap();
        HashMap term7099 = new HashMap();
        HashMap term7100 = new HashMap();
        HashMap term7101 = new HashMap();
        HashMap term7102 = new HashMap();
        HashMap term7103 = new HashMap();
        HashMap term7104 = new HashMap();
        term7088 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7094 = newInstance(Class.forName("java.lang.Object"));
        Object term7095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7098 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7088, term7088.getClass(), "node", null);
        setField(term7088, term7088.getClass(), "namespaces", term7089);
        setField(term7088, term7088.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term7088, term7088.getClass(), "id", "Ghbwtircqb");
        setIntField(term7088, term7088.getClass(), "index", -883034806);
        setBooleanField(term7088, term7088.getClass(), "attribute", false);
        setField(term7088, term7088.getClass(), "rootNode", term7094);
        setField(term7098, term7098.getClass(), "parent", null);
        setField(term7098, term7098.getClass(), "namespaceMap", null);
        setField(term7098, term7098.getClass(), "reverseMap", null);
        setField(term7098, term7098.getClass(), "pointer", null);
        setBooleanField(term7098, term7098.getClass(), "sealed", false);
        setField(term7097, term7097.getClass(), "parent", term7098);
        setField(term7097, term7097.getClass(), "namespaceMap", term7099);
        setField(term7097, term7097.getClass(), "reverseMap", term7100);
        setField(term7097, term7097.getClass(), "pointer", null);
        setBooleanField(term7097, term7097.getClass(), "sealed", false);
        setField(term7096, term7096.getClass(), "parent", term7097);
        setField(term7096, term7096.getClass(), "namespaceMap", term7101);
        setField(term7096, term7096.getClass(), "reverseMap", term7102);
        setField(term7096, term7096.getClass(), "pointer", null);
        setBooleanField(term7096, term7096.getClass(), "sealed", false);
        setField(term7095, term7095.getClass(), "parent", term7096);
        setField(term7095, term7095.getClass(), "namespaceMap", term7103);
        setField(term7095, term7095.getClass(), "reverseMap", term7104);
        setField(term7095, term7095.getClass(), "pointer", null);
        setBooleanField(term7095, term7095.getClass(), "sealed", false);
        setField(term7088, term7088.getClass(), "namespaceResolver", term7095);
        setField(term7088, term7088.getClass(), "parent", null);
        setField(term7088, term7088.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1399, args);
        assertTrue(recursiveEquals(term1399, term7088));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


