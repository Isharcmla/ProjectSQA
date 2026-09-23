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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JDOMAttributeIterator_init_2067615428161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79854;

    public JDOMAttributeIterator_init_2067615428161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79712 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term79712, term79712.getClass(), "position", 0);
        setField(term79712, term79712.getClass(), "parent", null);
        term79854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term79270 = (Object[]) newArray("java.lang.String", 1);
        setField(term79854, term79854.getClass(), "parent", null);
        setField(term79854, term79854.getClass(), "name", null);
        setElement(term79270, 0, "*");
        setField(term79854, term79854.getClass(), "names", term79270);
        setIntField(term79854, term79854.getClass(), "propertyIndex", 0);
        Object[] term79576 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 8);
        Object term80028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term80146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term80268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term80410 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term80530 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term80670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term80790 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term80912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        setElement(term79576, 0, term80028);
        setElement(term79576, 1, term80146);
        setElement(term79576, 2, term80268);
        setElement(term79576, 3, term80410);
        setElement(term79576, 4, term80530);
        setElement(term79576, 5, term80670);
        setElement(term79576, 6, term80790);
        setElement(term79576, 7, term80912);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term79576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term79854;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


