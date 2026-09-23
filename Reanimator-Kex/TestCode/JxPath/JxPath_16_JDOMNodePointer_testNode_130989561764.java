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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_testNode_130989561764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1821;
     Object term7829;

    public JDOMNodePointer_testNode_130989561764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1840 = new HashMap();
        HashMap term1845 = new HashMap();
        HashMap term1851 = new HashMap();
        HashMap term1856 = new HashMap();
        HashMap term1862 = new HashMap();
        HashMap term1867 = new HashMap();
        HashMap term1879 = new HashMap();
        HashMap term1885 = new HashMap();
        HashMap term1890 = new HashMap();
        HashMap term1896 = new HashMap();
        HashMap term1901 = new HashMap();
        term1821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1822 = newInstance(Class.forName("java.lang.Object"));
        Object term1835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1838 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1875 = newInstance(Class.forName("java.lang.Object"));
        Object term1876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1821, term1821.getClass(), "node", term1822);
        setField(term1821, term1821.getClass(), "id", "eZFUvlxvGV");
        setField(term1838, term1838.getClass(), "parent", null);
        setField(term1838, term1838.getClass(), "namespaceMap", null);
        setField(term1838, term1838.getClass(), "reverseMap", null);
        setField(term1838, term1838.getClass(), "pointer", null);
        setBooleanField(term1838, term1838.getClass(), "sealed", false);
        setField(term1837, term1837.getClass(), "parent", term1838);
        setField(term1837, term1837.getClass(), "namespaceMap", term1840);
        setField(term1837, term1837.getClass(), "reverseMap", term1845);
        setField(term1837, term1837.getClass(), "pointer", null);
        setBooleanField(term1837, term1837.getClass(), "sealed", false);
        setField(term1836, term1836.getClass(), "parent", term1837);
        setField(term1836, term1836.getClass(), "namespaceMap", term1851);
        setField(term1836, term1836.getClass(), "reverseMap", term1856);
        setField(term1836, term1836.getClass(), "pointer", null);
        setBooleanField(term1836, term1836.getClass(), "sealed", false);
        setField(term1835, term1835.getClass(), "parent", term1836);
        setField(term1835, term1835.getClass(), "namespaceMap", term1862);
        setField(term1835, term1835.getClass(), "reverseMap", term1867);
        setField(term1835, term1835.getClass(), "pointer", null);
        setBooleanField(term1835, term1835.getClass(), "sealed", false);
        setField(term1821, term1821.getClass(), "localNamespaceResolver", term1835);
        setIntField(term1821, term1821.getClass(), "index", -1456670397);
        setBooleanField(term1821, term1821.getClass(), "attribute", false);
        setField(term1821, term1821.getClass(), "rootNode", term1875);
        setField(term1878, term1878.getClass(), "parent", null);
        setField(term1878, term1878.getClass(), "namespaceMap", term1879);
        setField(term1878, term1878.getClass(), "reverseMap", null);
        setField(term1878, term1878.getClass(), "pointer", null);
        setBooleanField(term1878, term1878.getClass(), "sealed", false);
        setField(term1877, term1877.getClass(), "parent", term1878);
        setField(term1877, term1877.getClass(), "namespaceMap", term1885);
        setField(term1877, term1877.getClass(), "reverseMap", term1890);
        setField(term1877, term1877.getClass(), "pointer", null);
        setBooleanField(term1877, term1877.getClass(), "sealed", false);
        setField(term1876, term1876.getClass(), "parent", term1877);
        setField(term1876, term1876.getClass(), "namespaceMap", term1896);
        setField(term1876, term1876.getClass(), "reverseMap", term1901);
        setField(term1876, term1876.getClass(), "pointer", null);
        setBooleanField(term1876, term1876.getClass(), "sealed", false);
        setField(term1821, term1821.getClass(), "namespaceResolver", term1876);
        setField(term1821, term1821.getClass(), "parent", null);
        setField(term1821, term1821.getClass(), "locale", null);
        HashMap term7837 = new HashMap();
        HashMap term7838 = new HashMap();
        HashMap term7839 = new HashMap();
        HashMap term7840 = new HashMap();
        HashMap term7841 = new HashMap();
        HashMap term7842 = new HashMap();
        HashMap term7847 = new HashMap();
        HashMap term7848 = new HashMap();
        HashMap term7849 = new HashMap();
        HashMap term7850 = new HashMap();
        HashMap term7851 = new HashMap();
        term7829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term7830 = newInstance(Class.forName("java.lang.Object"));
        Object term7833 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7834 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7843 = newInstance(Class.forName("java.lang.Object"));
        Object term7844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7829, term7829.getClass(), "node", term7830);
        setField(term7829, term7829.getClass(), "id", "eZFUvlxvGV");
        setField(term7836, term7836.getClass(), "parent", null);
        setField(term7836, term7836.getClass(), "namespaceMap", null);
        setField(term7836, term7836.getClass(), "reverseMap", null);
        setField(term7836, term7836.getClass(), "pointer", null);
        setBooleanField(term7836, term7836.getClass(), "sealed", false);
        setField(term7835, term7835.getClass(), "parent", term7836);
        setField(term7835, term7835.getClass(), "namespaceMap", term7837);
        setField(term7835, term7835.getClass(), "reverseMap", term7838);
        setField(term7835, term7835.getClass(), "pointer", null);
        setBooleanField(term7835, term7835.getClass(), "sealed", false);
        setField(term7834, term7834.getClass(), "parent", term7835);
        setField(term7834, term7834.getClass(), "namespaceMap", term7839);
        setField(term7834, term7834.getClass(), "reverseMap", term7840);
        setField(term7834, term7834.getClass(), "pointer", null);
        setBooleanField(term7834, term7834.getClass(), "sealed", false);
        setField(term7833, term7833.getClass(), "parent", term7834);
        setField(term7833, term7833.getClass(), "namespaceMap", term7841);
        setField(term7833, term7833.getClass(), "reverseMap", term7842);
        setField(term7833, term7833.getClass(), "pointer", null);
        setBooleanField(term7833, term7833.getClass(), "sealed", false);
        setField(term7829, term7829.getClass(), "localNamespaceResolver", term7833);
        setIntField(term7829, term7829.getClass(), "index", -1456670397);
        setBooleanField(term7829, term7829.getClass(), "attribute", false);
        setField(term7829, term7829.getClass(), "rootNode", term7843);
        setField(term7846, term7846.getClass(), "parent", null);
        setField(term7846, term7846.getClass(), "namespaceMap", term7847);
        setField(term7846, term7846.getClass(), "reverseMap", null);
        setField(term7846, term7846.getClass(), "pointer", null);
        setBooleanField(term7846, term7846.getClass(), "sealed", false);
        setField(term7845, term7845.getClass(), "parent", term7846);
        setField(term7845, term7845.getClass(), "namespaceMap", term7848);
        setField(term7845, term7845.getClass(), "reverseMap", term7849);
        setField(term7845, term7845.getClass(), "pointer", null);
        setBooleanField(term7845, term7845.getClass(), "sealed", false);
        setField(term7844, term7844.getClass(), "parent", term7845);
        setField(term7844, term7844.getClass(), "namespaceMap", term7850);
        setField(term7844, term7844.getClass(), "reverseMap", term7851);
        setField(term7844, term7844.getClass(), "pointer", null);
        setBooleanField(term7844, term7844.getClass(), "sealed", false);
        setField(term7829, term7829.getClass(), "namespaceResolver", term7844);
        setField(term7829, term7829.getClass(), "parent", null);
        setField(term7829, term7829.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term1821, args);
        assertTrue(recursiveEquals(term1821, term7829));
    }

};


