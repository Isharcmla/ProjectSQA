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

public class JDOMAttributeIterator_init_2067615428165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83842;
     Object term84663;
     Object term84670;

    public JDOMAttributeIterator_init_2067615428165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term83700 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setIntField(term83574, term83574.getClass(), "position", 0);
        setField(term83574, term83574.getClass(), "parent", term83700);
        term83842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term83968 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term84110 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term84236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term84236, term84236.getClass(), "parent", null);
        setField(term84110, term84110.getClass(), "parent", term84236);
        setField(term83968, term83968.getClass(), "parent", term84110);
        setField(term83842, term83842.getClass(), "parent", term83968);
        setField(term83842, term83842.getClass(), "name", "*");
        term84663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term84664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term84667 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term84668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term84669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term84664, term84664.getClass(), "dynaBean", null);
        setField(term84664, term84664.getClass(), "name", "*");
        setField(term84664, term84664.getClass(), "names", null);
        setIntField(term84664, term84664.getClass(), "propertyIndex", 0);
        setField(term84664, term84664.getClass(), "bean", null);
        setField(term84664, term84664.getClass(), "value", null);
        setIntField(term84664, term84664.getClass(), "index", 0);
        setBooleanField(term84664, term84664.getClass(), "attribute", false);
        setField(term84664, term84664.getClass(), "rootNode", null);
        setField(term84664, term84664.getClass(), "namespaceResolver", null);
        setField(term84667, term84667.getClass(), "attr", null);
        setIntField(term84667, term84667.getClass(), "index", 0);
        setBooleanField(term84667, term84667.getClass(), "attribute", false);
        setField(term84667, term84667.getClass(), "rootNode", null);
        setField(term84667, term84667.getClass(), "namespaceResolver", null);
        setField(term84668, term84668.getClass(), "dynaBean", null);
        setField(term84668, term84668.getClass(), "name", null);
        setField(term84668, term84668.getClass(), "names", null);
        setIntField(term84668, term84668.getClass(), "propertyIndex", 0);
        setField(term84668, term84668.getClass(), "bean", null);
        setField(term84668, term84668.getClass(), "value", null);
        setIntField(term84668, term84668.getClass(), "index", 0);
        setBooleanField(term84668, term84668.getClass(), "attribute", false);
        setField(term84668, term84668.getClass(), "rootNode", null);
        setField(term84668, term84668.getClass(), "namespaceResolver", null);
        setField(term84669, term84669.getClass(), "propertyName", null);
        setBooleanField(term84669, term84669.getClass(), "byNameAttribute", false);
        setIntField(term84669, term84669.getClass(), "propertyIndex", 0);
        setField(term84669, term84669.getClass(), "bean", null);
        setField(term84669, term84669.getClass(), "value", null);
        setIntField(term84669, term84669.getClass(), "index", 0);
        setBooleanField(term84669, term84669.getClass(), "attribute", false);
        setField(term84669, term84669.getClass(), "rootNode", null);
        setField(term84669, term84669.getClass(), "namespaceResolver", null);
        setField(term84669, term84669.getClass(), "parent", null);
        setField(term84669, term84669.getClass(), "locale", null);
        setField(term84668, term84668.getClass(), "parent", term84669);
        setField(term84668, term84668.getClass(), "locale", null);
        setField(term84667, term84667.getClass(), "parent", term84668);
        setField(term84667, term84667.getClass(), "locale", null);
        setField(term84664, term84664.getClass(), "parent", term84667);
        setField(term84664, term84664.getClass(), "locale", null);
        setField(term84663, term84663.getClass(), "parent", term84664);
        setField(term84663, term84663.getClass(), "attributes", null);
        setIntField(term84663, term84663.getClass(), "position", 0);
        term84670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term84673 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term84674 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term84675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term84670, term84670.getClass(), "dynaBean", null);
        setField(term84670, term84670.getClass(), "name", "*");
        setField(term84670, term84670.getClass(), "names", null);
        setIntField(term84670, term84670.getClass(), "propertyIndex", 0);
        setField(term84670, term84670.getClass(), "bean", null);
        setField(term84670, term84670.getClass(), "value", null);
        setIntField(term84670, term84670.getClass(), "index", 0);
        setBooleanField(term84670, term84670.getClass(), "attribute", false);
        setField(term84670, term84670.getClass(), "rootNode", null);
        setField(term84670, term84670.getClass(), "namespaceResolver", null);
        setField(term84673, term84673.getClass(), "attr", null);
        setIntField(term84673, term84673.getClass(), "index", 0);
        setBooleanField(term84673, term84673.getClass(), "attribute", false);
        setField(term84673, term84673.getClass(), "rootNode", null);
        setField(term84673, term84673.getClass(), "namespaceResolver", null);
        setField(term84674, term84674.getClass(), "dynaBean", null);
        setField(term84674, term84674.getClass(), "name", null);
        setField(term84674, term84674.getClass(), "names", null);
        setIntField(term84674, term84674.getClass(), "propertyIndex", 0);
        setField(term84674, term84674.getClass(), "bean", null);
        setField(term84674, term84674.getClass(), "value", null);
        setIntField(term84674, term84674.getClass(), "index", 0);
        setBooleanField(term84674, term84674.getClass(), "attribute", false);
        setField(term84674, term84674.getClass(), "rootNode", null);
        setField(term84674, term84674.getClass(), "namespaceResolver", null);
        setField(term84675, term84675.getClass(), "propertyName", null);
        setBooleanField(term84675, term84675.getClass(), "byNameAttribute", false);
        setIntField(term84675, term84675.getClass(), "propertyIndex", 0);
        setField(term84675, term84675.getClass(), "bean", null);
        setField(term84675, term84675.getClass(), "value", null);
        setIntField(term84675, term84675.getClass(), "index", 0);
        setBooleanField(term84675, term84675.getClass(), "attribute", false);
        setField(term84675, term84675.getClass(), "rootNode", null);
        setField(term84675, term84675.getClass(), "namespaceResolver", null);
        setField(term84675, term84675.getClass(), "parent", null);
        setField(term84675, term84675.getClass(), "locale", null);
        setField(term84674, term84674.getClass(), "parent", term84675);
        setField(term84674, term84674.getClass(), "locale", null);
        setField(term84673, term84673.getClass(), "parent", term84674);
        setField(term84673, term84673.getClass(), "locale", null);
        setField(term84670, term84670.getClass(), "parent", term84673);
        setField(term84670, term84670.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term83842;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term84663));
        assertTrue(recursiveEquals(term83842, term84670));
    }

};


