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

public class DOMNodePointer_namespaceIterator_166989761855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;

    public DOMNodePointer_namespaceIterator_166989761855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term741 = new HashMap();
        HashMap term778 = new HashMap();
        HashMap term783 = new HashMap();
        HashMap term789 = new HashMap();
        HashMap term794 = new HashMap();
        HashMap term800 = new HashMap();
        HashMap term805 = new HashMap();
        term740 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term772 = newInstance(Class.forName("java.lang.Object"));
        Object term773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term774 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term740, term740.getClass(), "node", null);
        setField(term740, term740.getClass(), "namespaces", term741);
        setField(term740, term740.getClass(), "defaultNamespace", "pCTimMblYc");
        setField(term740, term740.getClass(), "id", "hNxWaHcfhY");
        setIntField(term740, term740.getClass(), "index", -1955890973);
        setBooleanField(term740, term740.getClass(), "attribute", true);
        setField(term740, term740.getClass(), "rootNode", term772);
        setField(term776, term776.getClass(), "parent", null);
        setField(term776, term776.getClass(), "namespaceMap", null);
        setField(term776, term776.getClass(), "reverseMap", null);
        setField(term776, term776.getClass(), "pointer", null);
        setBooleanField(term776, term776.getClass(), "sealed", false);
        setField(term775, term775.getClass(), "parent", term776);
        setField(term775, term775.getClass(), "namespaceMap", term778);
        setField(term775, term775.getClass(), "reverseMap", term783);
        setField(term775, term775.getClass(), "pointer", null);
        setBooleanField(term775, term775.getClass(), "sealed", false);
        setField(term774, term774.getClass(), "parent", term775);
        setField(term774, term774.getClass(), "namespaceMap", term789);
        setField(term774, term774.getClass(), "reverseMap", term794);
        setField(term774, term774.getClass(), "pointer", null);
        setBooleanField(term774, term774.getClass(), "sealed", false);
        setField(term773, term773.getClass(), "parent", term774);
        setField(term773, term773.getClass(), "namespaceMap", term800);
        setField(term773, term773.getClass(), "reverseMap", term805);
        setField(term773, term773.getClass(), "pointer", null);
        setBooleanField(term773, term773.getClass(), "sealed", false);
        setField(term740, term740.getClass(), "namespaceResolver", term773);
        setField(term740, term740.getClass(), "parent", null);
        setField(term740, term740.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "namespaceIterator", argTypes, term740, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


