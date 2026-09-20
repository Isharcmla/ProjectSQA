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

public class DOMNodePointer_isLanguage_153304781563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1559;

    public DOMNodePointer_isLanguage_153304781563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1560 = new HashMap();
        HashMap term1597 = new HashMap();
        HashMap term1602 = new HashMap();
        HashMap term1608 = new HashMap();
        HashMap term1613 = new HashMap();
        HashMap term1619 = new HashMap();
        HashMap term1624 = new HashMap();
        term1559 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1591 = newInstance(Class.forName("java.lang.Object"));
        Object term1592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1559, term1559.getClass(), "node", null);
        setField(term1559, term1559.getClass(), "namespaces", term1560);
        setField(term1559, term1559.getClass(), "defaultNamespace", "IDCWpPLRkE");
        setField(term1559, term1559.getClass(), "id", "nyiiPDVjAc");
        setIntField(term1559, term1559.getClass(), "index", 597278769);
        setBooleanField(term1559, term1559.getClass(), "attribute", true);
        setField(term1559, term1559.getClass(), "rootNode", term1591);
        setField(term1595, term1595.getClass(), "parent", null);
        setField(term1595, term1595.getClass(), "namespaceMap", null);
        setField(term1595, term1595.getClass(), "reverseMap", null);
        setField(term1595, term1595.getClass(), "pointer", null);
        setField(term1595, term1595.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1595, term1595.getClass(), "sealed", false);
        setField(term1594, term1594.getClass(), "parent", term1595);
        setField(term1594, term1594.getClass(), "namespaceMap", term1597);
        setField(term1594, term1594.getClass(), "reverseMap", term1602);
        setField(term1594, term1594.getClass(), "pointer", null);
        setField(term1594, term1594.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1594, term1594.getClass(), "sealed", false);
        setField(term1593, term1593.getClass(), "parent", term1594);
        setField(term1593, term1593.getClass(), "namespaceMap", term1608);
        setField(term1593, term1593.getClass(), "reverseMap", term1613);
        setField(term1593, term1593.getClass(), "pointer", null);
        setField(term1593, term1593.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1593, term1593.getClass(), "sealed", false);
        setField(term1592, term1592.getClass(), "parent", term1593);
        setField(term1592, term1592.getClass(), "namespaceMap", term1619);
        setField(term1592, term1592.getClass(), "reverseMap", term1624);
        setField(term1592, term1592.getClass(), "pointer", null);
        setField(term1592, term1592.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1592, term1592.getClass(), "sealed", false);
        setField(term1559, term1559.getClass(), "namespaceResolver", term1592);
        setField(term1559, term1559.getClass(), "parent", null);
        setField(term1559, term1559.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        try {
            callMethod(klass, "isLanguage", argTypes, term1559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
