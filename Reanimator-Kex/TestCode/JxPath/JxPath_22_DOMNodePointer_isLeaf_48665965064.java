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

public class DOMNodePointer_isLeaf_48665965064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1746;

    public DOMNodePointer_isLeaf_48665965064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1747 = new HashMap();
        HashMap term1781 = new HashMap();
        HashMap term1786 = new HashMap();
        HashMap term1792 = new HashMap();
        HashMap term1797 = new HashMap();
        HashMap term1803 = new HashMap();
        HashMap term1808 = new HashMap();
        HashMap term1817 = new HashMap();
        HashMap term1822 = new HashMap();
        term1746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1779 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1746, term1746.getClass(), "node", null);
        setField(term1746, term1746.getClass(), "namespaces", term1747);
        setField(term1746, term1746.getClass(), "defaultNamespace", "nyiiPDVjAc");
        setField(term1746, term1746.getClass(), "id", "aKnKipADSo");
        setField(term1779, term1779.getClass(), "parent", null);
        setField(term1779, term1779.getClass(), "namespaceMap", null);
        setField(term1779, term1779.getClass(), "reverseMap", null);
        setField(term1779, term1779.getClass(), "pointer", null);
        setBooleanField(term1779, term1779.getClass(), "sealed", false);
        setField(term1778, term1778.getClass(), "parent", term1779);
        setField(term1778, term1778.getClass(), "namespaceMap", term1781);
        setField(term1778, term1778.getClass(), "reverseMap", term1786);
        setField(term1778, term1778.getClass(), "pointer", null);
        setBooleanField(term1778, term1778.getClass(), "sealed", false);
        setField(term1777, term1777.getClass(), "parent", term1778);
        setField(term1777, term1777.getClass(), "namespaceMap", term1792);
        setField(term1777, term1777.getClass(), "reverseMap", term1797);
        setField(term1777, term1777.getClass(), "pointer", null);
        setBooleanField(term1777, term1777.getClass(), "sealed", false);
        setField(term1776, term1776.getClass(), "parent", term1777);
        setField(term1776, term1776.getClass(), "namespaceMap", term1803);
        setField(term1776, term1776.getClass(), "reverseMap", term1808);
        setField(term1776, term1776.getClass(), "pointer", null);
        setBooleanField(term1776, term1776.getClass(), "sealed", false);
        setField(term1746, term1746.getClass(), "localNamespaceResolver", term1776);
        setIntField(term1746, term1746.getClass(), "index", 597278769);
        setBooleanField(term1746, term1746.getClass(), "attribute", true);
        setField(term1816, term1816.getClass(), "parent", null);
        setField(term1816, term1816.getClass(), "namespaceMap", term1817);
        setField(term1816, term1816.getClass(), "reverseMap", term1822);
        setField(term1816, term1816.getClass(), "pointer", null);
        setBooleanField(term1816, term1816.getClass(), "sealed", false);
        setField(term1746, term1746.getClass(), "namespaceResolver", term1816);
        setField(term1746, term1746.getClass(), "exceptionHandler", null);
        setField(term1746, term1746.getClass(), "rootNode", null);
        setField(term1746, term1746.getClass(), "parent", null);
        setField(term1746, term1746.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term1746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


