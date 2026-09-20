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
     Object term1377;
     Object term6969;

    public DOMNodePointer_getLength_63871272661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1378 = new HashMap();
        HashMap term1415 = new HashMap();
        HashMap term1420 = new HashMap();
        HashMap term1426 = new HashMap();
        HashMap term1431 = new HashMap();
        HashMap term1437 = new HashMap();
        HashMap term1442 = new HashMap();
        term1377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1409 = newInstance(Class.forName("java.lang.Object"));
        Object term1410 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1377, term1377.getClass(), "node", null);
        setField(term1377, term1377.getClass(), "namespaces", term1378);
        setField(term1377, term1377.getClass(), "defaultNamespace", "SbAoxhfrkn");
        setField(term1377, term1377.getClass(), "id", "kuTXqwMtDB");
        setIntField(term1377, term1377.getClass(), "index", -883034806);
        setBooleanField(term1377, term1377.getClass(), "attribute", false);
        setField(term1377, term1377.getClass(), "rootNode", term1409);
        setField(term1413, term1413.getClass(), "parent", null);
        setField(term1413, term1413.getClass(), "namespaceMap", null);
        setField(term1413, term1413.getClass(), "reverseMap", null);
        setField(term1413, term1413.getClass(), "pointer", null);
        setField(term1413, term1413.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1413, term1413.getClass(), "sealed", false);
        setField(term1412, term1412.getClass(), "parent", term1413);
        setField(term1412, term1412.getClass(), "namespaceMap", term1415);
        setField(term1412, term1412.getClass(), "reverseMap", term1420);
        setField(term1412, term1412.getClass(), "pointer", null);
        setField(term1412, term1412.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1412, term1412.getClass(), "sealed", false);
        setField(term1411, term1411.getClass(), "parent", term1412);
        setField(term1411, term1411.getClass(), "namespaceMap", term1426);
        setField(term1411, term1411.getClass(), "reverseMap", term1431);
        setField(term1411, term1411.getClass(), "pointer", null);
        setField(term1411, term1411.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1411, term1411.getClass(), "sealed", false);
        setField(term1410, term1410.getClass(), "parent", term1411);
        setField(term1410, term1410.getClass(), "namespaceMap", term1437);
        setField(term1410, term1410.getClass(), "reverseMap", term1442);
        setField(term1410, term1410.getClass(), "pointer", null);
        setField(term1410, term1410.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1410, term1410.getClass(), "sealed", false);
        setField(term1377, term1377.getClass(), "namespaceResolver", term1410);
        setField(term1377, term1377.getClass(), "parent", null);
        setField(term1377, term1377.getClass(), "locale", null);
        HashMap term6970 = new HashMap();
        HashMap term6980 = new HashMap();
        HashMap term6981 = new HashMap();
        HashMap term6982 = new HashMap();
        HashMap term6983 = new HashMap();
        HashMap term6984 = new HashMap();
        HashMap term6985 = new HashMap();
        term6969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term6975 = newInstance(Class.forName("java.lang.Object"));
        Object term6976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term6979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term6969, term6969.getClass(), "node", null);
        setField(term6969, term6969.getClass(), "namespaces", term6970);
        setField(term6969, term6969.getClass(), "defaultNamespace", "SbAoxhfrkn");
        setField(term6969, term6969.getClass(), "id", "kuTXqwMtDB");
        setIntField(term6969, term6969.getClass(), "index", -883034806);
        setBooleanField(term6969, term6969.getClass(), "attribute", false);
        setField(term6969, term6969.getClass(), "rootNode", term6975);
        setField(term6979, term6979.getClass(), "parent", null);
        setField(term6979, term6979.getClass(), "namespaceMap", null);
        setField(term6979, term6979.getClass(), "reverseMap", null);
        setField(term6979, term6979.getClass(), "pointer", null);
        setField(term6979, term6979.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6979, term6979.getClass(), "sealed", false);
        setField(term6978, term6978.getClass(), "parent", term6979);
        setField(term6978, term6978.getClass(), "namespaceMap", term6980);
        setField(term6978, term6978.getClass(), "reverseMap", term6981);
        setField(term6978, term6978.getClass(), "pointer", null);
        setField(term6978, term6978.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6978, term6978.getClass(), "sealed", false);
        setField(term6977, term6977.getClass(), "parent", term6978);
        setField(term6977, term6977.getClass(), "namespaceMap", term6982);
        setField(term6977, term6977.getClass(), "reverseMap", term6983);
        setField(term6977, term6977.getClass(), "pointer", null);
        setField(term6977, term6977.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6977, term6977.getClass(), "sealed", false);
        setField(term6976, term6976.getClass(), "parent", term6977);
        setField(term6976, term6976.getClass(), "namespaceMap", term6984);
        setField(term6976, term6976.getClass(), "reverseMap", term6985);
        setField(term6976, term6976.getClass(), "pointer", null);
        setField(term6976, term6976.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term6976, term6976.getClass(), "sealed", false);
        setField(term6969, term6969.getClass(), "namespaceResolver", term6976);
        setField(term6969, term6969.getClass(), "parent", null);
        setField(term6969, term6969.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1377, args);
        assertTrue(recursiveEquals(term1377, term6969));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
