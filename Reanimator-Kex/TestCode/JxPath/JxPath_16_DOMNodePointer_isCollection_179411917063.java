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

public class DOMNodePointer_isCollection_179411917063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;
     Object term7515;

    public DOMNodePointer_isCollection_179411917063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1491 = new HashMap();
        HashMap term1525 = new HashMap();
        HashMap term1530 = new HashMap();
        HashMap term1536 = new HashMap();
        HashMap term1541 = new HashMap();
        HashMap term1547 = new HashMap();
        HashMap term1552 = new HashMap();
        HashMap term1562 = new HashMap();
        term1490 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1520 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1522 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1560 = newInstance(Class.forName("java.lang.Object"));
        Object term1561 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1490, term1490.getClass(), "node", null);
        setField(term1490, term1490.getClass(), "namespaces", term1491);
        setField(term1490, term1490.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term1490, term1490.getClass(), "id", "Ghbwtircqb");
        setField(term1523, term1523.getClass(), "parent", null);
        setField(term1523, term1523.getClass(), "namespaceMap", null);
        setField(term1523, term1523.getClass(), "reverseMap", null);
        setField(term1523, term1523.getClass(), "pointer", null);
        setBooleanField(term1523, term1523.getClass(), "sealed", false);
        setField(term1522, term1522.getClass(), "parent", term1523);
        setField(term1522, term1522.getClass(), "namespaceMap", term1525);
        setField(term1522, term1522.getClass(), "reverseMap", term1530);
        setField(term1522, term1522.getClass(), "pointer", null);
        setBooleanField(term1522, term1522.getClass(), "sealed", false);
        setField(term1521, term1521.getClass(), "parent", term1522);
        setField(term1521, term1521.getClass(), "namespaceMap", term1536);
        setField(term1521, term1521.getClass(), "reverseMap", term1541);
        setField(term1521, term1521.getClass(), "pointer", null);
        setBooleanField(term1521, term1521.getClass(), "sealed", false);
        setField(term1520, term1520.getClass(), "parent", term1521);
        setField(term1520, term1520.getClass(), "namespaceMap", term1547);
        setField(term1520, term1520.getClass(), "reverseMap", term1552);
        setField(term1520, term1520.getClass(), "pointer", null);
        setBooleanField(term1520, term1520.getClass(), "sealed", false);
        setField(term1490, term1490.getClass(), "localNamespaceResolver", term1520);
        setIntField(term1490, term1490.getClass(), "index", -883034806);
        setBooleanField(term1490, term1490.getClass(), "attribute", false);
        setField(term1490, term1490.getClass(), "rootNode", term1560);
        setField(term1561, term1561.getClass(), "parent", null);
        setField(term1561, term1561.getClass(), "namespaceMap", term1562);
        setField(term1561, term1561.getClass(), "reverseMap", null);
        setField(term1561, term1561.getClass(), "pointer", null);
        setBooleanField(term1561, term1561.getClass(), "sealed", false);
        setField(term1490, term1490.getClass(), "namespaceResolver", term1561);
        setField(term1490, term1490.getClass(), "parent", null);
        setField(term1490, term1490.getClass(), "locale", null);
        HashMap term7516 = new HashMap();
        HashMap term7525 = new HashMap();
        HashMap term7526 = new HashMap();
        HashMap term7527 = new HashMap();
        HashMap term7528 = new HashMap();
        HashMap term7529 = new HashMap();
        HashMap term7530 = new HashMap();
        HashMap term7533 = new HashMap();
        term7515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7521 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7522 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7531 = newInstance(Class.forName("java.lang.Object"));
        Object term7532 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7515, term7515.getClass(), "node", null);
        setField(term7515, term7515.getClass(), "namespaces", term7516);
        setField(term7515, term7515.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term7515, term7515.getClass(), "id", "Ghbwtircqb");
        setField(term7524, term7524.getClass(), "parent", null);
        setField(term7524, term7524.getClass(), "namespaceMap", null);
        setField(term7524, term7524.getClass(), "reverseMap", null);
        setField(term7524, term7524.getClass(), "pointer", null);
        setBooleanField(term7524, term7524.getClass(), "sealed", false);
        setField(term7523, term7523.getClass(), "parent", term7524);
        setField(term7523, term7523.getClass(), "namespaceMap", term7525);
        setField(term7523, term7523.getClass(), "reverseMap", term7526);
        setField(term7523, term7523.getClass(), "pointer", null);
        setBooleanField(term7523, term7523.getClass(), "sealed", false);
        setField(term7522, term7522.getClass(), "parent", term7523);
        setField(term7522, term7522.getClass(), "namespaceMap", term7527);
        setField(term7522, term7522.getClass(), "reverseMap", term7528);
        setField(term7522, term7522.getClass(), "pointer", null);
        setBooleanField(term7522, term7522.getClass(), "sealed", false);
        setField(term7521, term7521.getClass(), "parent", term7522);
        setField(term7521, term7521.getClass(), "namespaceMap", term7529);
        setField(term7521, term7521.getClass(), "reverseMap", term7530);
        setField(term7521, term7521.getClass(), "pointer", null);
        setBooleanField(term7521, term7521.getClass(), "sealed", false);
        setField(term7515, term7515.getClass(), "localNamespaceResolver", term7521);
        setIntField(term7515, term7515.getClass(), "index", -883034806);
        setBooleanField(term7515, term7515.getClass(), "attribute", false);
        setField(term7515, term7515.getClass(), "rootNode", term7531);
        setField(term7532, term7532.getClass(), "parent", null);
        setField(term7532, term7532.getClass(), "namespaceMap", term7533);
        setField(term7532, term7532.getClass(), "reverseMap", null);
        setField(term7532, term7532.getClass(), "pointer", null);
        setBooleanField(term7532, term7532.getClass(), "sealed", false);
        setField(term7515, term7515.getClass(), "namespaceResolver", term7532);
        setField(term7515, term7515.getClass(), "parent", null);
        setField(term7515, term7515.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1490, args);
        assertTrue(recursiveEquals(term1490, term7515));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


