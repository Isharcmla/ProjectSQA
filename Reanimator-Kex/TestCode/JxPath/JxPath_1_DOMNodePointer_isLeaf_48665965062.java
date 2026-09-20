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
     Object term1468;

    public DOMNodePointer_isLeaf_48665965062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1469 = new HashMap();
        HashMap term1506 = new HashMap();
        HashMap term1511 = new HashMap();
        HashMap term1517 = new HashMap();
        HashMap term1522 = new HashMap();
        HashMap term1528 = new HashMap();
        HashMap term1533 = new HashMap();
        term1468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1500 = newInstance(Class.forName("java.lang.Object"));
        Object term1501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1468, term1468.getClass(), "node", null);
        setField(term1468, term1468.getClass(), "namespaces", term1469);
        setField(term1468, term1468.getClass(), "defaultNamespace", "Ghbwtircqb");
        setField(term1468, term1468.getClass(), "id", "xrwlQZdwCp");
        setIntField(term1468, term1468.getClass(), "index", 1585847225);
        setBooleanField(term1468, term1468.getClass(), "attribute", false);
        setField(term1468, term1468.getClass(), "rootNode", term1500);
        setField(term1504, term1504.getClass(), "parent", null);
        setField(term1504, term1504.getClass(), "namespaceMap", null);
        setField(term1504, term1504.getClass(), "reverseMap", null);
        setField(term1504, term1504.getClass(), "pointer", null);
        setField(term1504, term1504.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1504, term1504.getClass(), "sealed", false);
        setField(term1503, term1503.getClass(), "parent", term1504);
        setField(term1503, term1503.getClass(), "namespaceMap", term1506);
        setField(term1503, term1503.getClass(), "reverseMap", term1511);
        setField(term1503, term1503.getClass(), "pointer", null);
        setField(term1503, term1503.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1503, term1503.getClass(), "sealed", false);
        setField(term1502, term1502.getClass(), "parent", term1503);
        setField(term1502, term1502.getClass(), "namespaceMap", term1517);
        setField(term1502, term1502.getClass(), "reverseMap", term1522);
        setField(term1502, term1502.getClass(), "pointer", null);
        setField(term1502, term1502.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1502, term1502.getClass(), "sealed", false);
        setField(term1501, term1501.getClass(), "parent", term1502);
        setField(term1501, term1501.getClass(), "namespaceMap", term1528);
        setField(term1501, term1501.getClass(), "reverseMap", term1533);
        setField(term1501, term1501.getClass(), "pointer", null);
        setField(term1501, term1501.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1501, term1501.getClass(), "sealed", false);
        setField(term1468, term1468.getClass(), "namespaceResolver", term1501);
        setField(term1468, term1468.getClass(), "parent", null);
        setField(term1468, term1468.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term1468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
