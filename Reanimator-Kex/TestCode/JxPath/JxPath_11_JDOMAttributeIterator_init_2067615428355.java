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

public class JDOMAttributeIterator_init_2067615428355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253123;
     Object term253657;
     Object term253664;

    public JDOMAttributeIterator_init_2067615428355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term252981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term252981, term252981.getClass(), "position", 0);
        setField(term252981, term252981.getClass(), "parent", null);
        term253123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term253249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term253377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object[] term252805 = (Object[]) newArray("java.lang.String", 0);
        setField(term253377, term253377.getClass(), "parent", null);
        setField(term253249, term253249.getClass(), "parent", term253377);
        setField(term253123, term253123.getClass(), "parent", term253249);
        setField(term253123, term253123.getClass(), "name", null);
        setField(term253123, term253123.getClass(), "names", term252805);
        term253657 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term253658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term253661 = (Object[]) newArray("java.lang.String", 0);
        Object term253662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term253663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term253658, term253658.getClass(), "dynaBean", null);
        setField(term253658, term253658.getClass(), "name", "*");
        setField(term253658, term253658.getClass(), "names", term253661);
        setIntField(term253658, term253658.getClass(), "propertyIndex", 0);
        setField(term253658, term253658.getClass(), "bean", null);
        setField(term253658, term253658.getClass(), "value", null);
        setIntField(term253658, term253658.getClass(), "index", 0);
        setBooleanField(term253658, term253658.getClass(), "attribute", false);
        setField(term253658, term253658.getClass(), "rootNode", null);
        setField(term253658, term253658.getClass(), "namespaceResolver", null);
        setField(term253662, term253662.getClass(), "attr", null);
        setIntField(term253662, term253662.getClass(), "index", 0);
        setBooleanField(term253662, term253662.getClass(), "attribute", false);
        setField(term253662, term253662.getClass(), "rootNode", null);
        setField(term253662, term253662.getClass(), "namespaceResolver", null);
        setIntField(term253663, term253663.getClass(), "index", 0);
        setBooleanField(term253663, term253663.getClass(), "attribute", false);
        setField(term253663, term253663.getClass(), "rootNode", null);
        setField(term253663, term253663.getClass(), "namespaceResolver", null);
        setField(term253663, term253663.getClass(), "parent", null);
        setField(term253663, term253663.getClass(), "locale", null);
        setField(term253662, term253662.getClass(), "parent", term253663);
        setField(term253662, term253662.getClass(), "locale", null);
        setField(term253658, term253658.getClass(), "parent", term253662);
        setField(term253658, term253658.getClass(), "locale", null);
        setField(term253657, term253657.getClass(), "parent", term253658);
        setField(term253657, term253657.getClass(), "attributes", null);
        setIntField(term253657, term253657.getClass(), "position", 0);
        term253664 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term253667 = (Object[]) newArray("java.lang.String", 0);
        Object term253668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term253669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term253664, term253664.getClass(), "dynaBean", null);
        setField(term253664, term253664.getClass(), "name", "*");
        setField(term253664, term253664.getClass(), "names", term253667);
        setIntField(term253664, term253664.getClass(), "propertyIndex", 0);
        setField(term253664, term253664.getClass(), "bean", null);
        setField(term253664, term253664.getClass(), "value", null);
        setIntField(term253664, term253664.getClass(), "index", 0);
        setBooleanField(term253664, term253664.getClass(), "attribute", false);
        setField(term253664, term253664.getClass(), "rootNode", null);
        setField(term253664, term253664.getClass(), "namespaceResolver", null);
        setField(term253668, term253668.getClass(), "attr", null);
        setIntField(term253668, term253668.getClass(), "index", 0);
        setBooleanField(term253668, term253668.getClass(), "attribute", false);
        setField(term253668, term253668.getClass(), "rootNode", null);
        setField(term253668, term253668.getClass(), "namespaceResolver", null);
        setIntField(term253669, term253669.getClass(), "index", 0);
        setBooleanField(term253669, term253669.getClass(), "attribute", false);
        setField(term253669, term253669.getClass(), "rootNode", null);
        setField(term253669, term253669.getClass(), "namespaceResolver", null);
        setField(term253669, term253669.getClass(), "parent", null);
        setField(term253669, term253669.getClass(), "locale", null);
        setField(term253668, term253668.getClass(), "parent", term253669);
        setField(term253668, term253668.getClass(), "locale", null);
        setField(term253664, term253664.getClass(), "parent", term253668);
        setField(term253664, term253664.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term253123;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term253657));
        assertTrue(recursiveEquals(term253123, term253664));
    }

};


