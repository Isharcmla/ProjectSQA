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

public class JDOMAttributeIterator_init_2067615428114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42981;
     Object term44871;
     Object term44896;

    public JDOMAttributeIterator_init_2067615428114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42839 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term42839, term42839.getClass(), "position", 0);
        setField(term42839, term42839.getClass(), "parent", null);
        term42981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term42667 = (Object[]) newArray("java.lang.String", 10);
        setField(term42981, term42981.getClass(), "parent", null);
        setField(term42981, term42981.getClass(), "name", null);
        setElement(term42667, 0, "");
        setElement(term42667, 1, "");
        setElement(term42667, 2, "");
        setElement(term42667, 3, "");
        setElement(term42667, 4, "");
        setElement(term42667, 5, "");
        setElement(term42667, 6, "");
        setElement(term42667, 7, "");
        setElement(term42667, 8, "");
        setElement(term42667, 9, "");
        setField(term42981, term42981.getClass(), "names", term42667);
        setIntField(term42981, term42981.getClass(), "propertyIndex", -1);
        term44871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term44872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term44875 = (Object[]) newArray("java.lang.String", 10);
        setField(term44872, term44872.getClass(), "dynaBean", null);
        setField(term44872, term44872.getClass(), "name", "*");
        setElement(term44875, 0, "");
        setElement(term44875, 1, "");
        setElement(term44875, 2, "");
        setElement(term44875, 3, "");
        setElement(term44875, 4, "");
        setElement(term44875, 5, "");
        setElement(term44875, 6, "");
        setElement(term44875, 7, "");
        setElement(term44875, 8, "");
        setElement(term44875, 9, "");
        setField(term44872, term44872.getClass(), "names", term44875);
        setIntField(term44872, term44872.getClass(), "propertyIndex", -1);
        setField(term44872, term44872.getClass(), "bean", null);
        setField(term44872, term44872.getClass(), "value", null);
        setIntField(term44872, term44872.getClass(), "index", 0);
        setBooleanField(term44872, term44872.getClass(), "attribute", false);
        setField(term44872, term44872.getClass(), "rootNode", null);
        setField(term44872, term44872.getClass(), "namespaceResolver", null);
        setField(term44872, term44872.getClass(), "parent", null);
        setField(term44872, term44872.getClass(), "locale", null);
        setField(term44871, term44871.getClass(), "parent", term44872);
        setField(term44871, term44871.getClass(), "attributes", null);
        setIntField(term44871, term44871.getClass(), "position", 0);
        term44896 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term44899 = (Object[]) newArray("java.lang.String", 10);
        setField(term44896, term44896.getClass(), "dynaBean", null);
        setField(term44896, term44896.getClass(), "name", "*");
        setElement(term44899, 0, "");
        setElement(term44899, 1, "");
        setElement(term44899, 2, "");
        setElement(term44899, 3, "");
        setElement(term44899, 4, "");
        setElement(term44899, 5, "");
        setElement(term44899, 6, "");
        setElement(term44899, 7, "");
        setElement(term44899, 8, "");
        setElement(term44899, 9, "");
        setField(term44896, term44896.getClass(), "names", term44899);
        setIntField(term44896, term44896.getClass(), "propertyIndex", -1);
        setField(term44896, term44896.getClass(), "bean", null);
        setField(term44896, term44896.getClass(), "value", null);
        setIntField(term44896, term44896.getClass(), "index", 0);
        setBooleanField(term44896, term44896.getClass(), "attribute", false);
        setField(term44896, term44896.getClass(), "rootNode", null);
        setField(term44896, term44896.getClass(), "namespaceResolver", null);
        setField(term44896, term44896.getClass(), "parent", null);
        setField(term44896, term44896.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term42981;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44871));
        assertTrue(recursiveEquals(term42981, term44896));
    }

};


