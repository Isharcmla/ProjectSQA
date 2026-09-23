package org.apache.commons.jxpath.ri.model.jdom;

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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class JDOMNodePointer_addContent_142948178861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1793;
     Object term1884;

    public JDOMNodePointer_addContent_142948178861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1812 = new HashMap();
        HashMap term1817 = new HashMap();
        HashMap term1823 = new HashMap();
        HashMap term1828 = new HashMap();
        HashMap term1834 = new HashMap();
        HashMap term1839 = new HashMap();
        HashMap term1850 = new HashMap();
        HashMap term1855 = new HashMap();
        HashMap term1861 = new HashMap();
        HashMap term1866 = new HashMap();
        HashMap term1872 = new HashMap();
        HashMap term1877 = new HashMap();
        term1793 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1794 = newInstance(Class.forName("java.lang.Object"));
        Object term1807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1808 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1809 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1847 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1883 = newInstance(Class.forName("java.lang.Object"));
        setField(term1793, term1793.getClass(), "node", term1794);
        setField(term1793, term1793.getClass(), "id", "xOEqzGAmDU");
        setField(term1810, term1810.getClass(), "parent", null);
        setField(term1810, term1810.getClass(), "namespaceMap", null);
        setField(term1810, term1810.getClass(), "reverseMap", null);
        setField(term1810, term1810.getClass(), "pointer", null);
        setBooleanField(term1810, term1810.getClass(), "sealed", false);
        setField(term1809, term1809.getClass(), "parent", term1810);
        setField(term1809, term1809.getClass(), "namespaceMap", term1812);
        setField(term1809, term1809.getClass(), "reverseMap", term1817);
        setField(term1809, term1809.getClass(), "pointer", null);
        setBooleanField(term1809, term1809.getClass(), "sealed", false);
        setField(term1808, term1808.getClass(), "parent", term1809);
        setField(term1808, term1808.getClass(), "namespaceMap", term1823);
        setField(term1808, term1808.getClass(), "reverseMap", term1828);
        setField(term1808, term1808.getClass(), "pointer", null);
        setBooleanField(term1808, term1808.getClass(), "sealed", false);
        setField(term1807, term1807.getClass(), "parent", term1808);
        setField(term1807, term1807.getClass(), "namespaceMap", term1834);
        setField(term1807, term1807.getClass(), "reverseMap", term1839);
        setField(term1807, term1807.getClass(), "pointer", null);
        setBooleanField(term1807, term1807.getClass(), "sealed", false);
        setField(term1793, term1793.getClass(), "localNamespaceResolver", term1807);
        setIntField(term1793, term1793.getClass(), "index", -1685132342);
        setBooleanField(term1793, term1793.getClass(), "attribute", true);
        setField(term1849, term1849.getClass(), "parent", null);
        setField(term1849, term1849.getClass(), "namespaceMap", term1850);
        setField(term1849, term1849.getClass(), "reverseMap", term1855);
        setField(term1849, term1849.getClass(), "pointer", null);
        setBooleanField(term1849, term1849.getClass(), "sealed", false);
        setField(term1848, term1848.getClass(), "parent", term1849);
        setField(term1848, term1848.getClass(), "namespaceMap", term1861);
        setField(term1848, term1848.getClass(), "reverseMap", term1866);
        setField(term1848, term1848.getClass(), "pointer", null);
        setBooleanField(term1848, term1848.getClass(), "sealed", false);
        setField(term1847, term1847.getClass(), "parent", term1848);
        setField(term1847, term1847.getClass(), "namespaceMap", term1872);
        setField(term1847, term1847.getClass(), "reverseMap", term1877);
        setField(term1847, term1847.getClass(), "pointer", null);
        setBooleanField(term1847, term1847.getClass(), "sealed", false);
        setField(term1793, term1793.getClass(), "namespaceResolver", term1847);
        setField(term1793, term1793.getClass(), "rootNode", term1883);
        setField(term1793, term1793.getClass(), "parent", null);
        setField(term1793, term1793.getClass(), "locale", null);
        Object term1887 = newInstance(Class.forName("java.lang.Object"));
        Object term1889 = newInstance(Class.forName("java.lang.Object"));
        Object term1891 = newInstance(Class.forName("java.lang.Object"));
        term1884 = new LinkedList();
        ((LinkedList) term1884).add(term1887);
        ((LinkedList) term1884).add(term1889);
        ((LinkedList) term1884).add(term1891);
        ((LinkedList) term1884).add((Object)null);
        ((LinkedList) term1884).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1884;
        try {
            callMethod(klass, "addContent", argTypes, term1793, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


