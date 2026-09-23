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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class JDOMAttributeIterator_init_206761542882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27591;
     Object term27753;

    public JDOMAttributeIterator_init_206761542882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27471 = new ArrayList();
        Object term27419 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term27419, term27419.getClass(), "position", 0);
        setField(term27419, term27419.getClass(), "parent", null);
        setField(term27419, term27419.getClass(), "attributes", term27471);
        term27591 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term27629 = newInstance(Class.forName("org.jdom.Element"));
        Object term27679 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term27219 = (Object[]) newArray("org.jdom.Attribute", 0);
        setIntField(term27679, term27679.getClass(), "size", 1);
        setField(term27679, term27679.getClass(), "elementData", term27219);
        setField(term27629, term27629.getClass(), "attributes", term27679);
        setField(term27591, term27591.getClass(), "value", term27629);
        term27753 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term27753, term27753.getClass(), "prefix", null);
        setField(term27753, term27753.getClass(), "name", "*");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term27591;
        args[1] = term27753;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


