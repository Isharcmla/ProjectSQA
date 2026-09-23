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

public class JDOMNodePointer_getBaseValue_148194603152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631;
     Object term4147;
     Object term4092;

    public JDOMNodePointer_getBaseValue_148194603152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term653 = new HashMap();
        HashMap term658 = new HashMap();
        HashMap term664 = new HashMap();
        HashMap term669 = new HashMap();
        HashMap term675 = new HashMap();
        HashMap term680 = new HashMap();
        term631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term632 = newInstance(Class.forName("java.lang.Object"));
        Object term647 = newInstance(Class.forName("java.lang.Object"));
        Object term648 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term649 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term650 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term651 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term631, term631.getClass(), "node", term632);
        setField(term631, term631.getClass(), "id", "LQFpaHEwXR");
        setIntField(term631, term631.getClass(), "index", -2038273078);
        setBooleanField(term631, term631.getClass(), "attribute", false);
        setField(term631, term631.getClass(), "rootNode", term647);
        setField(term651, term651.getClass(), "parent", null);
        setField(term651, term651.getClass(), "namespaceMap", null);
        setField(term651, term651.getClass(), "reverseMap", null);
        setField(term651, term651.getClass(), "pointer", null);
        setField(term651, term651.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term651, term651.getClass(), "sealed", false);
        setField(term650, term650.getClass(), "parent", term651);
        setField(term650, term650.getClass(), "namespaceMap", term653);
        setField(term650, term650.getClass(), "reverseMap", term658);
        setField(term650, term650.getClass(), "pointer", null);
        setField(term650, term650.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term650, term650.getClass(), "sealed", false);
        setField(term649, term649.getClass(), "parent", term650);
        setField(term649, term649.getClass(), "namespaceMap", term664);
        setField(term649, term649.getClass(), "reverseMap", term669);
        setField(term649, term649.getClass(), "pointer", null);
        setField(term649, term649.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term649, term649.getClass(), "sealed", false);
        setField(term648, term648.getClass(), "parent", term649);
        setField(term648, term648.getClass(), "namespaceMap", term675);
        setField(term648, term648.getClass(), "reverseMap", term680);
        setField(term648, term648.getClass(), "pointer", null);
        setField(term648, term648.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term648, term648.getClass(), "sealed", false);
        setField(term631, term631.getClass(), "namespaceResolver", term648);
        setField(term631, term631.getClass(), "parent", null);
        setField(term631, term631.getClass(), "locale", null);
        HashMap term4156 = new HashMap();
        HashMap term4157 = new HashMap();
        HashMap term4158 = new HashMap();
        HashMap term4159 = new HashMap();
        HashMap term4160 = new HashMap();
        HashMap term4161 = new HashMap();
        term4147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term4148 = newInstance(Class.forName("java.lang.Object"));
        Object term4151 = newInstance(Class.forName("java.lang.Object"));
        Object term4152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4147, term4147.getClass(), "node", term4148);
        setField(term4147, term4147.getClass(), "id", "LQFpaHEwXR");
        setIntField(term4147, term4147.getClass(), "index", -2038273078);
        setBooleanField(term4147, term4147.getClass(), "attribute", false);
        setField(term4147, term4147.getClass(), "rootNode", term4151);
        setField(term4155, term4155.getClass(), "parent", null);
        setField(term4155, term4155.getClass(), "namespaceMap", null);
        setField(term4155, term4155.getClass(), "reverseMap", null);
        setField(term4155, term4155.getClass(), "pointer", null);
        setField(term4155, term4155.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4155, term4155.getClass(), "sealed", false);
        setField(term4154, term4154.getClass(), "parent", term4155);
        setField(term4154, term4154.getClass(), "namespaceMap", term4156);
        setField(term4154, term4154.getClass(), "reverseMap", term4157);
        setField(term4154, term4154.getClass(), "pointer", null);
        setField(term4154, term4154.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4154, term4154.getClass(), "sealed", false);
        setField(term4153, term4153.getClass(), "parent", term4154);
        setField(term4153, term4153.getClass(), "namespaceMap", term4158);
        setField(term4153, term4153.getClass(), "reverseMap", term4159);
        setField(term4153, term4153.getClass(), "pointer", null);
        setField(term4153, term4153.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4153, term4153.getClass(), "sealed", false);
        setField(term4152, term4152.getClass(), "parent", term4153);
        setField(term4152, term4152.getClass(), "namespaceMap", term4160);
        setField(term4152, term4152.getClass(), "reverseMap", term4161);
        setField(term4152, term4152.getClass(), "pointer", null);
        setField(term4152, term4152.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4152, term4152.getClass(), "sealed", false);
        setField(term4147, term4147.getClass(), "namespaceResolver", term4152);
        setField(term4147, term4147.getClass(), "parent", null);
        setField(term4147, term4147.getClass(), "locale", null);
        term4092 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getBaseValue", argTypes, term631, args);
        assertTrue(recursiveEquals(term631, term4147));
        assertTrue(recursiveEquals(retValue, term4092));
    }

};


