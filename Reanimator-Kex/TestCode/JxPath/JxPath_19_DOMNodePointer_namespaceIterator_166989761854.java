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

public class DOMNodePointer_namespaceIterator_166989761854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812;

    public DOMNodePointer_namespaceIterator_166989761854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term813 = new HashMap();
        HashMap term847 = new HashMap();
        HashMap term852 = new HashMap();
        HashMap term858 = new HashMap();
        HashMap term863 = new HashMap();
        HashMap term869 = new HashMap();
        HashMap term874 = new HashMap();
        HashMap term883 = new HashMap();
        HashMap term888 = new HashMap();
        term812 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term894 = newInstance(Class.forName("java.lang.Object"));
        setField(term812, term812.getClass(), "node", null);
        setField(term812, term812.getClass(), "namespaces", term813);
        setField(term812, term812.getClass(), "defaultNamespace", "pCTimMblYc");
        setField(term812, term812.getClass(), "id", "hNxWaHcfhY");
        setField(term845, term845.getClass(), "parent", null);
        setField(term845, term845.getClass(), "namespaceMap", null);
        setField(term845, term845.getClass(), "reverseMap", null);
        setField(term845, term845.getClass(), "pointer", null);
        setBooleanField(term845, term845.getClass(), "sealed", false);
        setField(term844, term844.getClass(), "parent", term845);
        setField(term844, term844.getClass(), "namespaceMap", term847);
        setField(term844, term844.getClass(), "reverseMap", term852);
        setField(term844, term844.getClass(), "pointer", null);
        setBooleanField(term844, term844.getClass(), "sealed", false);
        setField(term843, term843.getClass(), "parent", term844);
        setField(term843, term843.getClass(), "namespaceMap", term858);
        setField(term843, term843.getClass(), "reverseMap", term863);
        setField(term843, term843.getClass(), "pointer", null);
        setBooleanField(term843, term843.getClass(), "sealed", false);
        setField(term842, term842.getClass(), "parent", term843);
        setField(term842, term842.getClass(), "namespaceMap", term869);
        setField(term842, term842.getClass(), "reverseMap", term874);
        setField(term842, term842.getClass(), "pointer", null);
        setBooleanField(term842, term842.getClass(), "sealed", false);
        setField(term812, term812.getClass(), "localNamespaceResolver", term842);
        setIntField(term812, term812.getClass(), "index", -1955890973);
        setBooleanField(term812, term812.getClass(), "attribute", true);
        setField(term882, term882.getClass(), "parent", null);
        setField(term882, term882.getClass(), "namespaceMap", term883);
        setField(term882, term882.getClass(), "reverseMap", term888);
        setField(term882, term882.getClass(), "pointer", null);
        setBooleanField(term882, term882.getClass(), "sealed", false);
        setField(term812, term812.getClass(), "namespaceResolver", term882);
        setField(term812, term812.getClass(), "rootNode", term894);
        setField(term812, term812.getClass(), "parent", null);
        setField(term812, term812.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "namespaceIterator", argTypes, term812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


