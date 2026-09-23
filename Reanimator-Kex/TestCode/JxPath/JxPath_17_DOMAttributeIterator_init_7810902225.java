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
import java.lang.Object;

public class DOMAttributeIterator_init_7810902225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119669;
     Object term119951;

    public DOMAttributeIterator_init_7810902225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term119475 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        Object term119549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term119365, term119365.getClass(), "position", 0);
        setField(term119365, term119365.getClass(), "parent", term119475);
        setField(term119365, term119365.getClass(), "name", term119549);
        setField(term119365, term119365.getClass(), "attributes", null);
        term119669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term119755 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term119877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        setField(term119669, term119669.getClass(), "value", term119755);
        setField(term119669, term119669.getClass(), "namespaceResolver", null);
        setField(term119669, term119669.getClass(), "parent", term119877);
        term119951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term119951, term119951.getClass(), "name", "********************************************************************************************************************************\uFF80*******************");
        setField(term119951, term119951.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term119669;
        args[1] = term119951;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


