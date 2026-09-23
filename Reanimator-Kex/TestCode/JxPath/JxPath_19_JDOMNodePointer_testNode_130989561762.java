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

public class JDOMNodePointer_testNode_130989561762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1906;
     Object term7843;

    public JDOMNodePointer_testNode_130989561762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1925 = new HashMap();
        HashMap term1930 = new HashMap();
        HashMap term1936 = new HashMap();
        HashMap term1941 = new HashMap();
        HashMap term1947 = new HashMap();
        HashMap term1952 = new HashMap();
        HashMap term1963 = new HashMap();
        HashMap term1968 = new HashMap();
        HashMap term1974 = new HashMap();
        HashMap term1979 = new HashMap();
        HashMap term1985 = new HashMap();
        HashMap term1990 = new HashMap();
        term1906 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1907 = newInstance(Class.forName("java.lang.Object"));
        Object term1920 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1921 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1922 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1961 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1962 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1996 = newInstance(Class.forName("java.lang.Object"));
        setField(term1906, term1906.getClass(), "node", term1907);
        setField(term1906, term1906.getClass(), "id", "eZFUvlxvGV");
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1923, term1923.getClass(), "namespaceMap", null);
        setField(term1923, term1923.getClass(), "reverseMap", null);
        setField(term1923, term1923.getClass(), "pointer", null);
        setBooleanField(term1923, term1923.getClass(), "sealed", false);
        setField(term1922, term1922.getClass(), "parent", term1923);
        setField(term1922, term1922.getClass(), "namespaceMap", term1925);
        setField(term1922, term1922.getClass(), "reverseMap", term1930);
        setField(term1922, term1922.getClass(), "pointer", null);
        setBooleanField(term1922, term1922.getClass(), "sealed", false);
        setField(term1921, term1921.getClass(), "parent", term1922);
        setField(term1921, term1921.getClass(), "namespaceMap", term1936);
        setField(term1921, term1921.getClass(), "reverseMap", term1941);
        setField(term1921, term1921.getClass(), "pointer", null);
        setBooleanField(term1921, term1921.getClass(), "sealed", false);
        setField(term1920, term1920.getClass(), "parent", term1921);
        setField(term1920, term1920.getClass(), "namespaceMap", term1947);
        setField(term1920, term1920.getClass(), "reverseMap", term1952);
        setField(term1920, term1920.getClass(), "pointer", null);
        setBooleanField(term1920, term1920.getClass(), "sealed", false);
        setField(term1906, term1906.getClass(), "localNamespaceResolver", term1920);
        setIntField(term1906, term1906.getClass(), "index", -1456670397);
        setBooleanField(term1906, term1906.getClass(), "attribute", false);
        setField(term1962, term1962.getClass(), "parent", null);
        setField(term1962, term1962.getClass(), "namespaceMap", term1963);
        setField(term1962, term1962.getClass(), "reverseMap", term1968);
        setField(term1962, term1962.getClass(), "pointer", null);
        setBooleanField(term1962, term1962.getClass(), "sealed", false);
        setField(term1961, term1961.getClass(), "parent", term1962);
        setField(term1961, term1961.getClass(), "namespaceMap", term1974);
        setField(term1961, term1961.getClass(), "reverseMap", term1979);
        setField(term1961, term1961.getClass(), "pointer", null);
        setBooleanField(term1961, term1961.getClass(), "sealed", false);
        setField(term1960, term1960.getClass(), "parent", term1961);
        setField(term1960, term1960.getClass(), "namespaceMap", term1985);
        setField(term1960, term1960.getClass(), "reverseMap", term1990);
        setField(term1960, term1960.getClass(), "pointer", null);
        setBooleanField(term1960, term1960.getClass(), "sealed", false);
        setField(term1906, term1906.getClass(), "namespaceResolver", term1960);
        setField(term1906, term1906.getClass(), "rootNode", term1996);
        setField(term1906, term1906.getClass(), "parent", null);
        setField(term1906, term1906.getClass(), "locale", null);
        HashMap term7851 = new HashMap();
        HashMap term7852 = new HashMap();
        HashMap term7853 = new HashMap();
        HashMap term7854 = new HashMap();
        HashMap term7855 = new HashMap();
        HashMap term7856 = new HashMap();
        HashMap term7860 = new HashMap();
        HashMap term7861 = new HashMap();
        HashMap term7862 = new HashMap();
        HashMap term7863 = new HashMap();
        HashMap term7864 = new HashMap();
        HashMap term7865 = new HashMap();
        term7843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term7844 = newInstance(Class.forName("java.lang.Object"));
        Object term7847 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7857 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7858 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7859 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7866 = newInstance(Class.forName("java.lang.Object"));
        setField(term7843, term7843.getClass(), "node", term7844);
        setField(term7843, term7843.getClass(), "id", "eZFUvlxvGV");
        setField(term7850, term7850.getClass(), "parent", null);
        setField(term7850, term7850.getClass(), "namespaceMap", null);
        setField(term7850, term7850.getClass(), "reverseMap", null);
        setField(term7850, term7850.getClass(), "pointer", null);
        setBooleanField(term7850, term7850.getClass(), "sealed", false);
        setField(term7849, term7849.getClass(), "parent", term7850);
        setField(term7849, term7849.getClass(), "namespaceMap", term7851);
        setField(term7849, term7849.getClass(), "reverseMap", term7852);
        setField(term7849, term7849.getClass(), "pointer", null);
        setBooleanField(term7849, term7849.getClass(), "sealed", false);
        setField(term7848, term7848.getClass(), "parent", term7849);
        setField(term7848, term7848.getClass(), "namespaceMap", term7853);
        setField(term7848, term7848.getClass(), "reverseMap", term7854);
        setField(term7848, term7848.getClass(), "pointer", null);
        setBooleanField(term7848, term7848.getClass(), "sealed", false);
        setField(term7847, term7847.getClass(), "parent", term7848);
        setField(term7847, term7847.getClass(), "namespaceMap", term7855);
        setField(term7847, term7847.getClass(), "reverseMap", term7856);
        setField(term7847, term7847.getClass(), "pointer", null);
        setBooleanField(term7847, term7847.getClass(), "sealed", false);
        setField(term7843, term7843.getClass(), "localNamespaceResolver", term7847);
        setIntField(term7843, term7843.getClass(), "index", -1456670397);
        setBooleanField(term7843, term7843.getClass(), "attribute", false);
        setField(term7859, term7859.getClass(), "parent", null);
        setField(term7859, term7859.getClass(), "namespaceMap", term7860);
        setField(term7859, term7859.getClass(), "reverseMap", term7861);
        setField(term7859, term7859.getClass(), "pointer", null);
        setBooleanField(term7859, term7859.getClass(), "sealed", false);
        setField(term7858, term7858.getClass(), "parent", term7859);
        setField(term7858, term7858.getClass(), "namespaceMap", term7862);
        setField(term7858, term7858.getClass(), "reverseMap", term7863);
        setField(term7858, term7858.getClass(), "pointer", null);
        setBooleanField(term7858, term7858.getClass(), "sealed", false);
        setField(term7857, term7857.getClass(), "parent", term7858);
        setField(term7857, term7857.getClass(), "namespaceMap", term7864);
        setField(term7857, term7857.getClass(), "reverseMap", term7865);
        setField(term7857, term7857.getClass(), "pointer", null);
        setBooleanField(term7857, term7857.getClass(), "sealed", false);
        setField(term7843, term7843.getClass(), "namespaceResolver", term7857);
        setField(term7843, term7843.getClass(), "rootNode", term7866);
        setField(term7843, term7843.getClass(), "parent", null);
        setField(term7843, term7843.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testNode", argTypes, term1906, args);
        assertTrue(recursiveEquals(term1906, term7843));
    }

};


