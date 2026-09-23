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

public class DOMNodePointer_setValue_9683547665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1785;
     Object term1856;

    public DOMNodePointer_setValue_9683547665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1786 = new HashMap();
        HashMap term1823 = new HashMap();
        HashMap term1828 = new HashMap();
        HashMap term1834 = new HashMap();
        HashMap term1839 = new HashMap();
        HashMap term1845 = new HashMap();
        HashMap term1850 = new HashMap();
        term1785 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1817 = newInstance(Class.forName("java.lang.Object"));
        Object term1818 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1785, term1785.getClass(), "node", null);
        setField(term1785, term1785.getClass(), "namespaces", term1786);
        setField(term1785, term1785.getClass(), "defaultNamespace", "hxCBltsObl");
        setField(term1785, term1785.getClass(), "id", "BndsHwAFMv");
        setIntField(term1785, term1785.getClass(), "index", -1456670397);
        setBooleanField(term1785, term1785.getClass(), "attribute", false);
        setField(term1785, term1785.getClass(), "rootNode", term1817);
        setField(term1821, term1821.getClass(), "parent", null);
        setField(term1821, term1821.getClass(), "namespaceMap", null);
        setField(term1821, term1821.getClass(), "reverseMap", null);
        setField(term1821, term1821.getClass(), "pointer", null);
        setField(term1821, term1821.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1821, term1821.getClass(), "sealed", false);
        setField(term1820, term1820.getClass(), "parent", term1821);
        setField(term1820, term1820.getClass(), "namespaceMap", term1823);
        setField(term1820, term1820.getClass(), "reverseMap", term1828);
        setField(term1820, term1820.getClass(), "pointer", null);
        setField(term1820, term1820.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1820, term1820.getClass(), "sealed", false);
        setField(term1819, term1819.getClass(), "parent", term1820);
        setField(term1819, term1819.getClass(), "namespaceMap", term1834);
        setField(term1819, term1819.getClass(), "reverseMap", term1839);
        setField(term1819, term1819.getClass(), "pointer", null);
        setField(term1819, term1819.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1819, term1819.getClass(), "sealed", false);
        setField(term1818, term1818.getClass(), "parent", term1819);
        setField(term1818, term1818.getClass(), "namespaceMap", term1845);
        setField(term1818, term1818.getClass(), "reverseMap", term1850);
        setField(term1818, term1818.getClass(), "pointer", null);
        setField(term1818, term1818.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1818, term1818.getClass(), "sealed", false);
        setField(term1785, term1785.getClass(), "namespaceResolver", term1818);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1785, term1785.getClass(), "locale", null);
        term1856 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1856;
        try {
            callMethod(klass, "setValue", argTypes, term1785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


