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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_isLeaf_48665965062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490;

    public DOMNodePointer_isLeaf_48665965062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1491 = new HashMap();
        HashMap term1528 = new HashMap();
        HashMap term1533 = new HashMap();
        HashMap term1539 = new HashMap();
        HashMap term1544 = new HashMap();
        HashMap term1550 = new HashMap();
        HashMap term1555 = new HashMap();
        term1490 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1522 = newInstance(Class.forName("java.lang.Object"));
        Object term1523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1490, term1490.getClass(), "node", null);
        setField(term1490, term1490.getClass(), "namespaces", term1491);
        setField(term1490, term1490.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term1490, term1490.getClass(), "id", "IDCWpPLRkE");
        setIntField(term1490, term1490.getClass(), "index", 1585847225);
        setBooleanField(term1490, term1490.getClass(), "attribute", false);
        setField(term1490, term1490.getClass(), "rootNode", term1522);
        setField(term1526, term1526.getClass(), "parent", null);
        setField(term1526, term1526.getClass(), "namespaceMap", null);
        setField(term1526, term1526.getClass(), "reverseMap", null);
        setField(term1526, term1526.getClass(), "pointer", null);
        setField(term1526, term1526.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1526, term1526.getClass(), "sealed", false);
        setField(term1525, term1525.getClass(), "parent", term1526);
        setField(term1525, term1525.getClass(), "namespaceMap", term1528);
        setField(term1525, term1525.getClass(), "reverseMap", term1533);
        setField(term1525, term1525.getClass(), "pointer", null);
        setField(term1525, term1525.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1525, term1525.getClass(), "sealed", false);
        setField(term1524, term1524.getClass(), "parent", term1525);
        setField(term1524, term1524.getClass(), "namespaceMap", term1539);
        setField(term1524, term1524.getClass(), "reverseMap", term1544);
        setField(term1524, term1524.getClass(), "pointer", null);
        setField(term1524, term1524.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1524, term1524.getClass(), "sealed", false);
        setField(term1523, term1523.getClass(), "parent", term1524);
        setField(term1523, term1523.getClass(), "namespaceMap", term1550);
        setField(term1523, term1523.getClass(), "reverseMap", term1555);
        setField(term1523, term1523.getClass(), "pointer", null);
        setField(term1523, term1523.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1523, term1523.getClass(), "sealed", false);
        setField(term1490, term1490.getClass(), "namespaceResolver", term1523);
        setField(term1490, term1490.getClass(), "parent", null);
        setField(term1490, term1490.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term1490, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


