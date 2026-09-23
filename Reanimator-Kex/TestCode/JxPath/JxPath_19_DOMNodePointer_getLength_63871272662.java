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
     Object term1658;
     Object term7754;

    public DOMNodePointer_getLength_63871272662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1659 = new HashMap();
        HashMap term1693 = new HashMap();
        HashMap term1698 = new HashMap();
        HashMap term1704 = new HashMap();
        HashMap term1709 = new HashMap();
        HashMap term1715 = new HashMap();
        HashMap term1720 = new HashMap();
        HashMap term1729 = new HashMap();
        HashMap term1734 = new HashMap();
        term1658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1688 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1690 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1691 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1740 = newInstance(Class.forName("java.lang.Object"));
        setField(term1658, term1658.getClass(), "node", null);
        setField(term1658, term1658.getClass(), "namespaces", term1659);
        setField(term1658, term1658.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term1658, term1658.getClass(), "id", "IDCWpPLRkE");
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1691, term1691.getClass(), "namespaceMap", null);
        setField(term1691, term1691.getClass(), "reverseMap", null);
        setField(term1691, term1691.getClass(), "pointer", null);
        setBooleanField(term1691, term1691.getClass(), "sealed", false);
        setField(term1690, term1690.getClass(), "parent", term1691);
        setField(term1690, term1690.getClass(), "namespaceMap", term1693);
        setField(term1690, term1690.getClass(), "reverseMap", term1698);
        setField(term1690, term1690.getClass(), "pointer", null);
        setBooleanField(term1690, term1690.getClass(), "sealed", false);
        setField(term1689, term1689.getClass(), "parent", term1690);
        setField(term1689, term1689.getClass(), "namespaceMap", term1704);
        setField(term1689, term1689.getClass(), "reverseMap", term1709);
        setField(term1689, term1689.getClass(), "pointer", null);
        setBooleanField(term1689, term1689.getClass(), "sealed", false);
        setField(term1688, term1688.getClass(), "parent", term1689);
        setField(term1688, term1688.getClass(), "namespaceMap", term1715);
        setField(term1688, term1688.getClass(), "reverseMap", term1720);
        setField(term1688, term1688.getClass(), "pointer", null);
        setBooleanField(term1688, term1688.getClass(), "sealed", false);
        setField(term1658, term1658.getClass(), "localNamespaceResolver", term1688);
        setIntField(term1658, term1658.getClass(), "index", 1585847225);
        setBooleanField(term1658, term1658.getClass(), "attribute", false);
        setField(term1728, term1728.getClass(), "parent", null);
        setField(term1728, term1728.getClass(), "namespaceMap", term1729);
        setField(term1728, term1728.getClass(), "reverseMap", term1734);
        setField(term1728, term1728.getClass(), "pointer", null);
        setBooleanField(term1728, term1728.getClass(), "sealed", false);
        setField(term1658, term1658.getClass(), "namespaceResolver", term1728);
        setField(term1658, term1658.getClass(), "rootNode", term1740);
        setField(term1658, term1658.getClass(), "parent", null);
        setField(term1658, term1658.getClass(), "locale", null);
        HashMap term7755 = new HashMap();
        HashMap term7764 = new HashMap();
        HashMap term7765 = new HashMap();
        HashMap term7766 = new HashMap();
        HashMap term7767 = new HashMap();
        HashMap term7768 = new HashMap();
        HashMap term7769 = new HashMap();
        HashMap term7771 = new HashMap();
        HashMap term7772 = new HashMap();
        term7754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7770 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7773 = newInstance(Class.forName("java.lang.Object"));
        setField(term7754, term7754.getClass(), "node", null);
        setField(term7754, term7754.getClass(), "namespaces", term7755);
        setField(term7754, term7754.getClass(), "defaultNamespace", "xrwlQZdwCp");
        setField(term7754, term7754.getClass(), "id", "IDCWpPLRkE");
        setField(term7763, term7763.getClass(), "parent", null);
        setField(term7763, term7763.getClass(), "namespaceMap", null);
        setField(term7763, term7763.getClass(), "reverseMap", null);
        setField(term7763, term7763.getClass(), "pointer", null);
        setBooleanField(term7763, term7763.getClass(), "sealed", false);
        setField(term7762, term7762.getClass(), "parent", term7763);
        setField(term7762, term7762.getClass(), "namespaceMap", term7764);
        setField(term7762, term7762.getClass(), "reverseMap", term7765);
        setField(term7762, term7762.getClass(), "pointer", null);
        setBooleanField(term7762, term7762.getClass(), "sealed", false);
        setField(term7761, term7761.getClass(), "parent", term7762);
        setField(term7761, term7761.getClass(), "namespaceMap", term7766);
        setField(term7761, term7761.getClass(), "reverseMap", term7767);
        setField(term7761, term7761.getClass(), "pointer", null);
        setBooleanField(term7761, term7761.getClass(), "sealed", false);
        setField(term7760, term7760.getClass(), "parent", term7761);
        setField(term7760, term7760.getClass(), "namespaceMap", term7768);
        setField(term7760, term7760.getClass(), "reverseMap", term7769);
        setField(term7760, term7760.getClass(), "pointer", null);
        setBooleanField(term7760, term7760.getClass(), "sealed", false);
        setField(term7754, term7754.getClass(), "localNamespaceResolver", term7760);
        setIntField(term7754, term7754.getClass(), "index", 1585847225);
        setBooleanField(term7754, term7754.getClass(), "attribute", false);
        setField(term7770, term7770.getClass(), "parent", null);
        setField(term7770, term7770.getClass(), "namespaceMap", term7771);
        setField(term7770, term7770.getClass(), "reverseMap", term7772);
        setField(term7770, term7770.getClass(), "pointer", null);
        setBooleanField(term7770, term7770.getClass(), "sealed", false);
        setField(term7754, term7754.getClass(), "namespaceResolver", term7770);
        setField(term7754, term7754.getClass(), "rootNode", term7773);
        setField(term7754, term7754.getClass(), "parent", null);
        setField(term7754, term7754.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLength", argTypes, term1658, args);
        assertTrue(recursiveEquals(term1658, term7754));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


