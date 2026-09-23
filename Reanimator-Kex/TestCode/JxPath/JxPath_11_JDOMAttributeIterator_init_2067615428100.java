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

public class JDOMAttributeIterator_init_2067615428100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35600;
     Object term36738;
     Object term36744;

    public JDOMAttributeIterator_init_2067615428100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term35458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setIntField(term35338, term35338.getClass(), "position", 0);
        setField(term35338, term35338.getClass(), "parent", term35458);
        term35600 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term35726 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term35854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term35854, term35854.getClass(), "parent", null);
        setField(term35726, term35726.getClass(), "parent", term35854);
        setField(term35600, term35600.getClass(), "parent", term35726);
        setField(term35600, term35600.getClass(), "name", "*");
        term36738 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term36739 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term36742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term36743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term36739, term36739.getClass(), "dynaBean", null);
        setField(term36739, term36739.getClass(), "name", "*");
        setField(term36739, term36739.getClass(), "names", null);
        setIntField(term36739, term36739.getClass(), "propertyIndex", 0);
        setField(term36739, term36739.getClass(), "bean", null);
        setField(term36739, term36739.getClass(), "value", null);
        setIntField(term36739, term36739.getClass(), "index", 0);
        setBooleanField(term36739, term36739.getClass(), "attribute", false);
        setField(term36739, term36739.getClass(), "rootNode", null);
        setField(term36739, term36739.getClass(), "namespaceResolver", null);
        setField(term36742, term36742.getClass(), "attr", null);
        setIntField(term36742, term36742.getClass(), "index", 0);
        setBooleanField(term36742, term36742.getClass(), "attribute", false);
        setField(term36742, term36742.getClass(), "rootNode", null);
        setField(term36742, term36742.getClass(), "namespaceResolver", null);
        setIntField(term36743, term36743.getClass(), "index", 0);
        setBooleanField(term36743, term36743.getClass(), "attribute", false);
        setField(term36743, term36743.getClass(), "rootNode", null);
        setField(term36743, term36743.getClass(), "namespaceResolver", null);
        setField(term36743, term36743.getClass(), "parent", null);
        setField(term36743, term36743.getClass(), "locale", null);
        setField(term36742, term36742.getClass(), "parent", term36743);
        setField(term36742, term36742.getClass(), "locale", null);
        setField(term36739, term36739.getClass(), "parent", term36742);
        setField(term36739, term36739.getClass(), "locale", null);
        setField(term36738, term36738.getClass(), "parent", term36739);
        setField(term36738, term36738.getClass(), "attributes", null);
        setIntField(term36738, term36738.getClass(), "position", 0);
        term36744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term36747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term36748 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term36744, term36744.getClass(), "dynaBean", null);
        setField(term36744, term36744.getClass(), "name", "*");
        setField(term36744, term36744.getClass(), "names", null);
        setIntField(term36744, term36744.getClass(), "propertyIndex", 0);
        setField(term36744, term36744.getClass(), "bean", null);
        setField(term36744, term36744.getClass(), "value", null);
        setIntField(term36744, term36744.getClass(), "index", 0);
        setBooleanField(term36744, term36744.getClass(), "attribute", false);
        setField(term36744, term36744.getClass(), "rootNode", null);
        setField(term36744, term36744.getClass(), "namespaceResolver", null);
        setField(term36747, term36747.getClass(), "attr", null);
        setIntField(term36747, term36747.getClass(), "index", 0);
        setBooleanField(term36747, term36747.getClass(), "attribute", false);
        setField(term36747, term36747.getClass(), "rootNode", null);
        setField(term36747, term36747.getClass(), "namespaceResolver", null);
        setIntField(term36748, term36748.getClass(), "index", 0);
        setBooleanField(term36748, term36748.getClass(), "attribute", false);
        setField(term36748, term36748.getClass(), "rootNode", null);
        setField(term36748, term36748.getClass(), "namespaceResolver", null);
        setField(term36748, term36748.getClass(), "parent", null);
        setField(term36748, term36748.getClass(), "locale", null);
        setField(term36747, term36747.getClass(), "parent", term36748);
        setField(term36747, term36747.getClass(), "locale", null);
        setField(term36744, term36744.getClass(), "parent", term36747);
        setField(term36744, term36744.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term35600;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36738));
        assertTrue(recursiveEquals(term35600, term36744));
    }

};


