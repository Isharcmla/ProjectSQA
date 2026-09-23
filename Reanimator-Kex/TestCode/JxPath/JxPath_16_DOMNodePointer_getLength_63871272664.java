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

public class DOMNodePointer_getLength_63871272664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1588;
     Object term7613;

    public DOMNodePointer_getLength_63871272664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1589 = new HashMap();
        HashMap term1623 = new HashMap();
        HashMap term1628 = new HashMap();
        HashMap term1634 = new HashMap();
        HashMap term1639 = new HashMap();
        HashMap term1645 = new HashMap();
        HashMap term1650 = new HashMap();
        HashMap term1660 = new HashMap();
        term1588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1620 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1658 = newInstance(Class.forName("java.lang.Object"));
        Object term1659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1588, term1588.getClass(), "node", null);
        setField(term1588, term1588.getClass(), "namespaces", term1589);
        setField(term1588, term1588.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term1588, term1588.getClass(), "id", "IDCWpPLRkE");
        setField(term1621, term1621.getClass(), "parent", null);
        setField(term1621, term1621.getClass(), "namespaceMap", null);
        setField(term1621, term1621.getClass(), "reverseMap", null);
        setField(term1621, term1621.getClass(), "pointer", null);
        setBooleanField(term1621, term1621.getClass(), "sealed", false);
        setField(term1620, term1620.getClass(), "parent", term1621);
        setField(term1620, term1620.getClass(), "namespaceMap", term1623);
        setField(term1620, term1620.getClass(), "reverseMap", term1628);
        setField(term1620, term1620.getClass(), "pointer", null);
        setBooleanField(term1620, term1620.getClass(), "sealed", false);
        setField(term1619, term1619.getClass(), "parent", term1620);
        setField(term1619, term1619.getClass(), "namespaceMap", term1634);
        setField(term1619, term1619.getClass(), "reverseMap", term1639);
        setField(term1619, term1619.getClass(), "pointer", null);
        setBooleanField(term1619, term1619.getClass(), "sealed", false);
        setField(term1618, term1618.getClass(), "parent", term1619);
        setField(term1618, term1618.getClass(), "namespaceMap", term1645);
        setField(term1618, term1618.getClass(), "reverseMap", term1650);
        setField(term1618, term1618.getClass(), "pointer", null);
        setBooleanField(term1618, term1618.getClass(), "sealed", false);
        setField(term1588, term1588.getClass(), "localNamespaceResolver", term1618);
        setIntField(term1588, term1588.getClass(), "index", 1585847225);
        setBooleanField(term1588, term1588.getClass(), "attribute", false);
        setField(term1588, term1588.getClass(), "rootNode", term1658);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1659, term1659.getClass(), "namespaceMap", term1660);
        setField(term1659, term1659.getClass(), "reverseMap", null);
        setField(term1659, term1659.getClass(), "pointer", null);
        setBooleanField(term1659, term1659.getClass(), "sealed", false);
        setField(term1588, term1588.getClass(), "namespaceResolver", term1659);
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1588, term1588.getClass(), "locale", null);
        HashMap term7614 = new HashMap();
        HashMap term7623 = new HashMap();
        HashMap term7624 = new HashMap();
        HashMap term7625 = new HashMap();
        HashMap term7626 = new HashMap();
        HashMap term7627 = new HashMap();
        HashMap term7628 = new HashMap();
        HashMap term7631 = new HashMap();
        term7613 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7620 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7629 = newInstance(Class.forName("java.lang.Object"));
        Object term7630 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7613, term7613.getClass(), "node", null);
        setField(term7613, term7613.getClass(), "namespaces", term7614);
        setField(term7613, term7613.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term7613, term7613.getClass(), "id", "IDCWpPLRkE");
        setField(term7622, term7622.getClass(), "parent", null);
        setField(term7622, term7622.getClass(), "namespaceMap", null);
        setField(term7622, term7622.getClass(), "reverseMap", null);
        setField(term7622, term7622.getClass(), "pointer", null);
        setBooleanField(term7622, term7622.getClass(), "sealed", false);
        setField(term7621, term7621.getClass(), "parent", term7622);
        setField(term7621, term7621.getClass(), "namespaceMap", term7623);
        setField(term7621, term7621.getClass(), "reverseMap", term7624);
        setField(term7621, term7621.getClass(), "pointer", null);
        setBooleanField(term7621, term7621.getClass(), "sealed", false);
        setField(term7620, term7620.getClass(), "parent", term7621);
        setField(term7620, term7620.getClass(), "namespaceMap", term7625);
        setField(term7620, term7620.getClass(), "reverseMap", term7626);
        setField(term7620, term7620.getClass(), "pointer", null);
        setBooleanField(term7620, term7620.getClass(), "sealed", false);
        setField(term7619, term7619.getClass(), "parent", term7620);
        setField(term7619, term7619.getClass(), "namespaceMap", term7627);
        setField(term7619, term7619.getClass(), "reverseMap", term7628);
        setField(term7619, term7619.getClass(), "pointer", null);
        setBooleanField(term7619, term7619.getClass(), "sealed", false);
        setField(term7613, term7613.getClass(), "localNamespaceResolver", term7619);
        setIntField(term7613, term7613.getClass(), "index", 1585847225);
        setBooleanField(term7613, term7613.getClass(), "attribute", false);
        setField(term7613, term7613.getClass(), "rootNode", term7629);
        setField(term7630, term7630.getClass(), "parent", null);
        setField(term7630, term7630.getClass(), "namespaceMap", term7631);
        setField(term7630, term7630.getClass(), "reverseMap", null);
        setField(term7630, term7630.getClass(), "pointer", null);
        setBooleanField(term7630, term7630.getClass(), "sealed", false);
        setField(term7613, term7613.getClass(), "namespaceResolver", term7630);
        setField(term7613, term7613.getClass(), "parent", null);
        setField(term7613, term7613.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1588, args);
        assertTrue(recursiveEquals(term1588, term7613));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


