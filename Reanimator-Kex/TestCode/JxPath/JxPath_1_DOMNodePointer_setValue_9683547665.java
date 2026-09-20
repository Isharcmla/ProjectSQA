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
     Object term1763;
     Object term1834;

    public DOMNodePointer_setValue_9683547665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1764 = new HashMap();
        HashMap term1801 = new HashMap();
        HashMap term1806 = new HashMap();
        HashMap term1812 = new HashMap();
        HashMap term1817 = new HashMap();
        HashMap term1823 = new HashMap();
        HashMap term1828 = new HashMap();
        term1763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1795 = newInstance(Class.forName("java.lang.Object"));
        Object term1796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1799 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1763, term1763.getClass(), "node", null);
        setField(term1763, term1763.getClass(), "namespaces", term1764);
        setField(term1763, term1763.getClass(), "defaultNamespace", "gGSMzuGICf");
        setField(term1763, term1763.getClass(), "id", "hxCBltsObl");
        setIntField(term1763, term1763.getClass(), "index", -1456670397);
        setBooleanField(term1763, term1763.getClass(), "attribute", false);
        setField(term1763, term1763.getClass(), "rootNode", term1795);
        setField(term1799, term1799.getClass(), "parent", null);
        setField(term1799, term1799.getClass(), "namespaceMap", null);
        setField(term1799, term1799.getClass(), "reverseMap", null);
        setField(term1799, term1799.getClass(), "pointer", null);
        setField(term1799, term1799.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1799, term1799.getClass(), "sealed", false);
        setField(term1798, term1798.getClass(), "parent", term1799);
        setField(term1798, term1798.getClass(), "namespaceMap", term1801);
        setField(term1798, term1798.getClass(), "reverseMap", term1806);
        setField(term1798, term1798.getClass(), "pointer", null);
        setField(term1798, term1798.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1798, term1798.getClass(), "sealed", false);
        setField(term1797, term1797.getClass(), "parent", term1798);
        setField(term1797, term1797.getClass(), "namespaceMap", term1812);
        setField(term1797, term1797.getClass(), "reverseMap", term1817);
        setField(term1797, term1797.getClass(), "pointer", null);
        setField(term1797, term1797.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1797, term1797.getClass(), "sealed", false);
        setField(term1796, term1796.getClass(), "parent", term1797);
        setField(term1796, term1796.getClass(), "namespaceMap", term1823);
        setField(term1796, term1796.getClass(), "reverseMap", term1828);
        setField(term1796, term1796.getClass(), "pointer", null);
        setField(term1796, term1796.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1796, term1796.getClass(), "sealed", false);
        setField(term1763, term1763.getClass(), "namespaceResolver", term1796);
        setField(term1763, term1763.getClass(), "parent", null);
        setField(term1763, term1763.getClass(), "locale", null);
        term1834 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1834;
        try {
            callMethod(klass, "setValue", argTypes, term1763, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
