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

public class JDOMAttributeIterator_init_2067615428333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232389;

    public JDOMAttributeIterator_init_2067615428333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term232247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term232247, term232247.getClass(), "position", 0);
        setField(term232247, term232247.getClass(), "parent", null);
        term232389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term232515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term232625 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        Object[] term231841 = (Object[]) newArray("java.lang.String", 0);
        setField(term232625, term232625.getClass(), "parent", null);
        setField(term232515, term232515.getClass(), "parent", term232625);
        setField(term232389, term232389.getClass(), "parent", term232515);
        setField(term232389, term232389.getClass(), "name", null);
        setField(term232389, term232389.getClass(), "names", term231841);
        setIntField(term232389, term232389.getClass(), "propertyIndex", 0);
        Object[] term232114 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 5);
        Object term232761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term232879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term233001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term233143 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term233263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        setElement(term232114, 0, term232761);
        setElement(term232114, 1, term232879);
        setElement(term232114, 2, term233001);
        setElement(term232114, 3, term233143);
        setElement(term232114, 4, term233263);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term232114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term232389;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


