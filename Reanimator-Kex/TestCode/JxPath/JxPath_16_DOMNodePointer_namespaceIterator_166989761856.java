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

public class DOMNodePointer_namespaceIterator_166989761856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782;

    public DOMNodePointer_namespaceIterator_166989761856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term783 = new HashMap();
        HashMap term817 = new HashMap();
        HashMap term822 = new HashMap();
        HashMap term828 = new HashMap();
        HashMap term833 = new HashMap();
        HashMap term839 = new HashMap();
        HashMap term844 = new HashMap();
        HashMap term854 = new HashMap();
        term782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term812 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term852 = newInstance(Class.forName("java.lang.Object"));
        Object term853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term782, term782.getClass(), "node", null);
        setField(term782, term782.getClass(), "namespaces", term783);
        setField(term782, term782.getClass(), "defaultNamespace", "pCTimMblYc");
        setField(term782, term782.getClass(), "id", "hNxWaHcfhY");
        setField(term815, term815.getClass(), "parent", null);
        setField(term815, term815.getClass(), "namespaceMap", null);
        setField(term815, term815.getClass(), "reverseMap", null);
        setField(term815, term815.getClass(), "pointer", null);
        setBooleanField(term815, term815.getClass(), "sealed", false);
        setField(term814, term814.getClass(), "parent", term815);
        setField(term814, term814.getClass(), "namespaceMap", term817);
        setField(term814, term814.getClass(), "reverseMap", term822);
        setField(term814, term814.getClass(), "pointer", null);
        setBooleanField(term814, term814.getClass(), "sealed", false);
        setField(term813, term813.getClass(), "parent", term814);
        setField(term813, term813.getClass(), "namespaceMap", term828);
        setField(term813, term813.getClass(), "reverseMap", term833);
        setField(term813, term813.getClass(), "pointer", null);
        setBooleanField(term813, term813.getClass(), "sealed", false);
        setField(term812, term812.getClass(), "parent", term813);
        setField(term812, term812.getClass(), "namespaceMap", term839);
        setField(term812, term812.getClass(), "reverseMap", term844);
        setField(term812, term812.getClass(), "pointer", null);
        setBooleanField(term812, term812.getClass(), "sealed", false);
        setField(term782, term782.getClass(), "localNamespaceResolver", term812);
        setIntField(term782, term782.getClass(), "index", -1955890973);
        setBooleanField(term782, term782.getClass(), "attribute", true);
        setField(term782, term782.getClass(), "rootNode", term852);
        setField(term853, term853.getClass(), "parent", null);
        setField(term853, term853.getClass(), "namespaceMap", term854);
        setField(term853, term853.getClass(), "reverseMap", null);
        setField(term853, term853.getClass(), "pointer", null);
        setBooleanField(term853, term853.getClass(), "sealed", false);
        setField(term782, term782.getClass(), "namespaceResolver", term853);
        setField(term782, term782.getClass(), "parent", null);
        setField(term782, term782.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "namespaceIterator", argTypes, term782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


