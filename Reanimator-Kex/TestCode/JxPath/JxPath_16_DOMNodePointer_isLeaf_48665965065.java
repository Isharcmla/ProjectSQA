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

public class DOMNodePointer_isLeaf_48665965065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;

    public DOMNodePointer_isLeaf_48665965065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1687 = new HashMap();
        HashMap term1721 = new HashMap();
        HashMap term1726 = new HashMap();
        HashMap term1732 = new HashMap();
        HashMap term1737 = new HashMap();
        HashMap term1743 = new HashMap();
        HashMap term1748 = new HashMap();
        HashMap term1758 = new HashMap();
        term1686 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1717 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1756 = newInstance(Class.forName("java.lang.Object"));
        Object term1757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1686, term1686.getClass(), "node", null);
        setField(term1686, term1686.getClass(), "namespaces", term1687);
        setField(term1686, term1686.getClass(), "defaultNamespace", "nyiiPDVjAc");
        setField(term1686, term1686.getClass(), "id", "aKnKipADSo");
        setField(term1719, term1719.getClass(), "parent", null);
        setField(term1719, term1719.getClass(), "namespaceMap", null);
        setField(term1719, term1719.getClass(), "reverseMap", null);
        setField(term1719, term1719.getClass(), "pointer", null);
        setBooleanField(term1719, term1719.getClass(), "sealed", false);
        setField(term1718, term1718.getClass(), "parent", term1719);
        setField(term1718, term1718.getClass(), "namespaceMap", term1721);
        setField(term1718, term1718.getClass(), "reverseMap", term1726);
        setField(term1718, term1718.getClass(), "pointer", null);
        setBooleanField(term1718, term1718.getClass(), "sealed", false);
        setField(term1717, term1717.getClass(), "parent", term1718);
        setField(term1717, term1717.getClass(), "namespaceMap", term1732);
        setField(term1717, term1717.getClass(), "reverseMap", term1737);
        setField(term1717, term1717.getClass(), "pointer", null);
        setBooleanField(term1717, term1717.getClass(), "sealed", false);
        setField(term1716, term1716.getClass(), "parent", term1717);
        setField(term1716, term1716.getClass(), "namespaceMap", term1743);
        setField(term1716, term1716.getClass(), "reverseMap", term1748);
        setField(term1716, term1716.getClass(), "pointer", null);
        setBooleanField(term1716, term1716.getClass(), "sealed", false);
        setField(term1686, term1686.getClass(), "localNamespaceResolver", term1716);
        setIntField(term1686, term1686.getClass(), "index", 597278769);
        setBooleanField(term1686, term1686.getClass(), "attribute", true);
        setField(term1686, term1686.getClass(), "rootNode", term1756);
        setField(term1757, term1757.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "namespaceMap", term1758);
        setField(term1757, term1757.getClass(), "reverseMap", null);
        setField(term1757, term1757.getClass(), "pointer", null);
        setBooleanField(term1757, term1757.getClass(), "sealed", false);
        setField(term1686, term1686.getClass(), "namespaceResolver", term1757);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1686, term1686.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term1686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


