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

public class DOMNodePointer_isLeaf_48665965063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1761;

    public DOMNodePointer_isLeaf_48665965063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1762 = new HashMap();
        HashMap term1796 = new HashMap();
        HashMap term1801 = new HashMap();
        HashMap term1807 = new HashMap();
        HashMap term1812 = new HashMap();
        HashMap term1818 = new HashMap();
        HashMap term1823 = new HashMap();
        HashMap term1832 = new HashMap();
        HashMap term1837 = new HashMap();
        term1761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1791 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1793 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1794 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1831 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1843 = newInstance(Class.forName("java.lang.Object"));
        setField(term1761, term1761.getClass(), "node", null);
        setField(term1761, term1761.getClass(), "namespaces", term1762);
        setField(term1761, term1761.getClass(), "defaultNamespace", "nyiiPDVjAc");
        setField(term1761, term1761.getClass(), "id", "aKnKipADSo");
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1794, term1794.getClass(), "namespaceMap", null);
        setField(term1794, term1794.getClass(), "reverseMap", null);
        setField(term1794, term1794.getClass(), "pointer", null);
        setBooleanField(term1794, term1794.getClass(), "sealed", false);
        setField(term1793, term1793.getClass(), "parent", term1794);
        setField(term1793, term1793.getClass(), "namespaceMap", term1796);
        setField(term1793, term1793.getClass(), "reverseMap", term1801);
        setField(term1793, term1793.getClass(), "pointer", null);
        setBooleanField(term1793, term1793.getClass(), "sealed", false);
        setField(term1792, term1792.getClass(), "parent", term1793);
        setField(term1792, term1792.getClass(), "namespaceMap", term1807);
        setField(term1792, term1792.getClass(), "reverseMap", term1812);
        setField(term1792, term1792.getClass(), "pointer", null);
        setBooleanField(term1792, term1792.getClass(), "sealed", false);
        setField(term1791, term1791.getClass(), "parent", term1792);
        setField(term1791, term1791.getClass(), "namespaceMap", term1818);
        setField(term1791, term1791.getClass(), "reverseMap", term1823);
        setField(term1791, term1791.getClass(), "pointer", null);
        setBooleanField(term1791, term1791.getClass(), "sealed", false);
        setField(term1761, term1761.getClass(), "localNamespaceResolver", term1791);
        setIntField(term1761, term1761.getClass(), "index", 597278769);
        setBooleanField(term1761, term1761.getClass(), "attribute", true);
        setField(term1831, term1831.getClass(), "parent", null);
        setField(term1831, term1831.getClass(), "namespaceMap", term1832);
        setField(term1831, term1831.getClass(), "reverseMap", term1837);
        setField(term1831, term1831.getClass(), "pointer", null);
        setBooleanField(term1831, term1831.getClass(), "sealed", false);
        setField(term1761, term1761.getClass(), "namespaceResolver", term1831);
        setField(term1761, term1761.getClass(), "rootNode", term1843);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term1761, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


