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

public class JDOMAttributeIterator_init_206761542814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1346;
     Object term1914;
     Object term1917;

    public JDOMAttributeIterator_init_206761542814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1218 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term1218, term1218.getClass(), "position", 0);
        setField(term1218, term1218.getClass(), "parent", null);
        term1346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        term1914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term1915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term1916 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term1915, term1915.getClass(), "container", null);
        setField(term1916, term1916.getClass(), "name", null);
        setField(term1916, term1916.getClass(), "id", null);
        setField(term1916, term1916.getClass(), "value", null);
        setIntField(term1916, term1916.getClass(), "index", -2147483648);
        setBooleanField(term1916, term1916.getClass(), "attribute", false);
        setField(term1916, term1916.getClass(), "rootNode", null);
        setField(term1916, term1916.getClass(), "namespaceResolver", null);
        setField(term1916, term1916.getClass(), "parent", term1915);
        setField(term1916, term1916.getClass(), "locale", null);
        setField(term1915, term1915.getClass(), "valuePointer", term1916);
        setIntField(term1915, term1915.getClass(), "index", 0);
        setBooleanField(term1915, term1915.getClass(), "attribute", false);
        setField(term1915, term1915.getClass(), "rootNode", null);
        setField(term1915, term1915.getClass(), "namespaceResolver", null);
        setField(term1915, term1915.getClass(), "parent", null);
        setField(term1915, term1915.getClass(), "locale", null);
        setField(term1914, term1914.getClass(), "parent", term1915);
        setField(term1914, term1914.getClass(), "attributes", null);
        setIntField(term1914, term1914.getClass(), "position", 0);
        term1917 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term1918 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term1917, term1917.getClass(), "container", null);
        setField(term1918, term1918.getClass(), "name", null);
        setField(term1918, term1918.getClass(), "id", null);
        setField(term1918, term1918.getClass(), "value", null);
        setIntField(term1918, term1918.getClass(), "index", -2147483648);
        setBooleanField(term1918, term1918.getClass(), "attribute", false);
        setField(term1918, term1918.getClass(), "rootNode", null);
        setField(term1918, term1918.getClass(), "namespaceResolver", null);
        setField(term1918, term1918.getClass(), "parent", term1917);
        setField(term1918, term1918.getClass(), "locale", null);
        setField(term1917, term1917.getClass(), "valuePointer", term1918);
        setIntField(term1917, term1917.getClass(), "index", 0);
        setBooleanField(term1917, term1917.getClass(), "attribute", false);
        setField(term1917, term1917.getClass(), "rootNode", null);
        setField(term1917, term1917.getClass(), "namespaceResolver", null);
        setField(term1917, term1917.getClass(), "parent", null);
        setField(term1917, term1917.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term1346;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1914));
        assertTrue(recursiveEquals(term1346, term1917));
    }

};


