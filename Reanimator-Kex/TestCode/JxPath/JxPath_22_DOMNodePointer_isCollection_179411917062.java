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

public class DOMNodePointer_isCollection_179411917062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;
     Object term7648;

    public DOMNodePointer_isCollection_179411917062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1543 = new HashMap();
        HashMap term1577 = new HashMap();
        HashMap term1582 = new HashMap();
        HashMap term1588 = new HashMap();
        HashMap term1593 = new HashMap();
        HashMap term1599 = new HashMap();
        HashMap term1604 = new HashMap();
        HashMap term1613 = new HashMap();
        HashMap term1618 = new HashMap();
        term1542 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1612 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1542, term1542.getClass(), "node", null);
        setField(term1542, term1542.getClass(), "namespaces", term1543);
        setField(term1542, term1542.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term1542, term1542.getClass(), "id", "Ghbwtircqb");
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1575, term1575.getClass(), "namespaceMap", null);
        setField(term1575, term1575.getClass(), "reverseMap", null);
        setField(term1575, term1575.getClass(), "pointer", null);
        setBooleanField(term1575, term1575.getClass(), "sealed", false);
        setField(term1574, term1574.getClass(), "parent", term1575);
        setField(term1574, term1574.getClass(), "namespaceMap", term1577);
        setField(term1574, term1574.getClass(), "reverseMap", term1582);
        setField(term1574, term1574.getClass(), "pointer", null);
        setBooleanField(term1574, term1574.getClass(), "sealed", false);
        setField(term1573, term1573.getClass(), "parent", term1574);
        setField(term1573, term1573.getClass(), "namespaceMap", term1588);
        setField(term1573, term1573.getClass(), "reverseMap", term1593);
        setField(term1573, term1573.getClass(), "pointer", null);
        setBooleanField(term1573, term1573.getClass(), "sealed", false);
        setField(term1572, term1572.getClass(), "parent", term1573);
        setField(term1572, term1572.getClass(), "namespaceMap", term1599);
        setField(term1572, term1572.getClass(), "reverseMap", term1604);
        setField(term1572, term1572.getClass(), "pointer", null);
        setBooleanField(term1572, term1572.getClass(), "sealed", false);
        setField(term1542, term1542.getClass(), "localNamespaceResolver", term1572);
        setIntField(term1542, term1542.getClass(), "index", -883034806);
        setBooleanField(term1542, term1542.getClass(), "attribute", false);
        setField(term1612, term1612.getClass(), "parent", null);
        setField(term1612, term1612.getClass(), "namespaceMap", term1613);
        setField(term1612, term1612.getClass(), "reverseMap", term1618);
        setField(term1612, term1612.getClass(), "pointer", null);
        setBooleanField(term1612, term1612.getClass(), "sealed", false);
        setField(term1542, term1542.getClass(), "namespaceResolver", term1612);
        setField(term1542, term1542.getClass(), "exceptionHandler", null);
        setField(term1542, term1542.getClass(), "rootNode", null);
        setField(term1542, term1542.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "locale", null);
        HashMap term7649 = new HashMap();
        HashMap term7658 = new HashMap();
        HashMap term7659 = new HashMap();
        HashMap term7660 = new HashMap();
        HashMap term7661 = new HashMap();
        HashMap term7662 = new HashMap();
        HashMap term7663 = new HashMap();
        HashMap term7665 = new HashMap();
        HashMap term7666 = new HashMap();
        term7648 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7655 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7657 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7648, term7648.getClass(), "node", null);
        setField(term7648, term7648.getClass(), "namespaces", term7649);
        setField(term7648, term7648.getClass(), "defaultNamespace", "kuTXqwMtDB");
        setField(term7648, term7648.getClass(), "id", "Ghbwtircqb");
        setField(term7657, term7657.getClass(), "parent", null);
        setField(term7657, term7657.getClass(), "namespaceMap", null);
        setField(term7657, term7657.getClass(), "reverseMap", null);
        setField(term7657, term7657.getClass(), "pointer", null);
        setBooleanField(term7657, term7657.getClass(), "sealed", false);
        setField(term7656, term7656.getClass(), "parent", term7657);
        setField(term7656, term7656.getClass(), "namespaceMap", term7658);
        setField(term7656, term7656.getClass(), "reverseMap", term7659);
        setField(term7656, term7656.getClass(), "pointer", null);
        setBooleanField(term7656, term7656.getClass(), "sealed", false);
        setField(term7655, term7655.getClass(), "parent", term7656);
        setField(term7655, term7655.getClass(), "namespaceMap", term7660);
        setField(term7655, term7655.getClass(), "reverseMap", term7661);
        setField(term7655, term7655.getClass(), "pointer", null);
        setBooleanField(term7655, term7655.getClass(), "sealed", false);
        setField(term7654, term7654.getClass(), "parent", term7655);
        setField(term7654, term7654.getClass(), "namespaceMap", term7662);
        setField(term7654, term7654.getClass(), "reverseMap", term7663);
        setField(term7654, term7654.getClass(), "pointer", null);
        setBooleanField(term7654, term7654.getClass(), "sealed", false);
        setField(term7648, term7648.getClass(), "localNamespaceResolver", term7654);
        setIntField(term7648, term7648.getClass(), "index", -883034806);
        setBooleanField(term7648, term7648.getClass(), "attribute", false);
        setField(term7664, term7664.getClass(), "parent", null);
        setField(term7664, term7664.getClass(), "namespaceMap", term7665);
        setField(term7664, term7664.getClass(), "reverseMap", term7666);
        setField(term7664, term7664.getClass(), "pointer", null);
        setBooleanField(term7664, term7664.getClass(), "sealed", false);
        setField(term7648, term7648.getClass(), "namespaceResolver", term7664);
        setField(term7648, term7648.getClass(), "exceptionHandler", null);
        setField(term7648, term7648.getClass(), "rootNode", null);
        setField(term7648, term7648.getClass(), "parent", null);
        setField(term7648, term7648.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isCollection", argTypes, term1542, args);
        assertTrue(recursiveEquals(term1542, term7648));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


