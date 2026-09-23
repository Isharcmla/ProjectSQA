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

public class DOMNodePointer_getLength_63871272661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1399;
     Object term7066;

    public DOMNodePointer_getLength_63871272661() {
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
        setField(term1435, term1435.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1435, term1435.getClass(), "sealed", false);
        setField(term1434, term1434.getClass(), "parent", term1435);
        setField(term1434, term1434.getClass(), "namespaceMap", term1437);
        setField(term1434, term1434.getClass(), "reverseMap", term1442);
        setField(term1434, term1434.getClass(), "pointer", null);
        setField(term1434, term1434.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1434, term1434.getClass(), "sealed", false);
        setField(term1433, term1433.getClass(), "parent", term1434);
        setField(term1433, term1433.getClass(), "namespaceMap", term1448);
        setField(term1433, term1433.getClass(), "reverseMap", term1453);
        setField(term1433, term1433.getClass(), "pointer", null);
        setField(term1433, term1433.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1433, term1433.getClass(), "sealed", false);
        setField(term1432, term1432.getClass(), "parent", term1433);
        setField(term1432, term1432.getClass(), "namespaceMap", term1459);
        setField(term1432, term1432.getClass(), "reverseMap", term1464);
        setField(term1432, term1432.getClass(), "pointer", null);
        setField(term1432, term1432.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1432, term1432.getClass(), "sealed", false);
        setField(term1399, term1399.getClass(), "namespaceResolver", term1432);
        setField(term1399, term1399.getClass(), "parent", null);
        setField(term1399, term1399.getClass(), "locale", null);
        HashMap term7067 = new HashMap();
        HashMap term7077 = new HashMap();
        HashMap term7078 = new HashMap();
        HashMap term7079 = new HashMap();
        HashMap term7080 = new HashMap();
        HashMap term7081 = new HashMap();
        HashMap term7082 = new HashMap();
        term7066 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7072 = newInstance(Class.forName("java.lang.Object"));
        Object term7073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7076 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7066, term7066.getClass(), "node", null);
        setField(term7066, term7066.getClass(), "namespaces", term7067);
        setField(term7066, term7066.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term7066, term7066.getClass(), "id", "Ghbwtircqb");
        setIntField(term7066, term7066.getClass(), "index", -883034806);
        setBooleanField(term7066, term7066.getClass(), "attribute", false);
        setField(term7066, term7066.getClass(), "rootNode", term7072);
        setField(term7076, term7076.getClass(), "parent", null);
        setField(term7076, term7076.getClass(), "namespaceMap", null);
        setField(term7076, term7076.getClass(), "reverseMap", null);
        setField(term7076, term7076.getClass(), "pointer", null);
        setField(term7076, term7076.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7076, term7076.getClass(), "sealed", false);
        setField(term7075, term7075.getClass(), "parent", term7076);
        setField(term7075, term7075.getClass(), "namespaceMap", term7077);
        setField(term7075, term7075.getClass(), "reverseMap", term7078);
        setField(term7075, term7075.getClass(), "pointer", null);
        setField(term7075, term7075.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7075, term7075.getClass(), "sealed", false);
        setField(term7074, term7074.getClass(), "parent", term7075);
        setField(term7074, term7074.getClass(), "namespaceMap", term7079);
        setField(term7074, term7074.getClass(), "reverseMap", term7080);
        setField(term7074, term7074.getClass(), "pointer", null);
        setField(term7074, term7074.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7074, term7074.getClass(), "sealed", false);
        setField(term7073, term7073.getClass(), "parent", term7074);
        setField(term7073, term7073.getClass(), "namespaceMap", term7081);
        setField(term7073, term7073.getClass(), "reverseMap", term7082);
        setField(term7073, term7073.getClass(), "pointer", null);
        setField(term7073, term7073.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term7073, term7073.getClass(), "sealed", false);
        setField(term7066, term7066.getClass(), "namespaceResolver", term7073);
        setField(term7066, term7066.getClass(), "parent", null);
        setField(term7066, term7066.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1399, args);
        assertTrue(recursiveEquals(term1399, term7066));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


