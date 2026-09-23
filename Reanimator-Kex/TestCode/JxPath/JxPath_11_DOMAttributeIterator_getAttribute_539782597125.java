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

public class DOMAttributeIterator_getAttribute_539782597125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112529;
     Object term112859;

    public DOMAttributeIterator_getAttribute_539782597125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term112657 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term112785 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term112785, term112785.getClass(), "valuePointer", null);
        setField(term112785, term112785.getClass(), "container", null);
        setIntField(term112785, term112785.getClass(), "index", 0);
        setField(term112657, term112657.getClass(), "valuePointer", term112785);
        setField(term112529, term112529.getClass(), "parent", term112657);
        term112859 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term112859, term112859.getClass(), "prefix", "");
        Object[] term112397 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 81);
        Object term113033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term113151 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term113273 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term113415 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term113555 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term113677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term113799 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term113919 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        setElement(term112397, 0, term113033);
        setElement(term112397, 1, term113151);
        setElement(term112397, 2, term113273);
        setElement(term112397, 3, term113415);
        setElement(term112397, 4, term113555);
        setElement(term112397, 5, term113677);
        setElement(term112397, 6, term113799);
        setElement(term112397, 7, term113799);
        setElement(term112397, 8, term113799);
        setElement(term112397, 9, term113799);
        setElement(term112397, 10, term113799);
        setElement(term112397, 11, term113799);
        setElement(term112397, 12, term113799);
        setElement(term112397, 13, term113799);
        setElement(term112397, 14, term113799);
        setElement(term112397, 15, term113919);
        setElement(term112397, 16, term113919);
        setElement(term112397, 17, term113919);
        setElement(term112397, 18, term113919);
        setElement(term112397, 19, term113919);
        setElement(term112397, 20, term113919);
        setElement(term112397, 21, term113919);
        setElement(term112397, 22, term113919);
        setElement(term112397, 23, term113919);
        setElement(term112397, 24, term113919);
        setElement(term112397, 25, term113919);
        setElement(term112397, 26, term113919);
        setElement(term112397, 27, term113919);
        setElement(term112397, 28, term113919);
        setElement(term112397, 29, term113919);
        setElement(term112397, 30, term113919);
        setElement(term112397, 31, term113919);
        setElement(term112397, 32, term113919);
        setElement(term112397, 33, term113919);
        setElement(term112397, 34, term113919);
        setElement(term112397, 35, term113919);
        setElement(term112397, 36, term113919);
        setElement(term112397, 37, term113919);
        setElement(term112397, 38, term113919);
        setElement(term112397, 39, term113919);
        setElement(term112397, 40, term113919);
        setElement(term112397, 41, term113919);
        setElement(term112397, 42, term113919);
        setElement(term112397, 43, term113919);
        setElement(term112397, 44, term113919);
        setElement(term112397, 45, term113919);
        setElement(term112397, 46, term113919);
        setElement(term112397, 47, term113919);
        setElement(term112397, 48, term113919);
        setElement(term112397, 49, term113919);
        setElement(term112397, 50, term113919);
        setElement(term112397, 51, term113919);
        setElement(term112397, 52, term113919);
        setElement(term112397, 53, term113919);
        setElement(term112397, 54, term113919);
        setElement(term112397, 55, term113919);
        setElement(term112397, 56, term113919);
        setElement(term112397, 57, term113919);
        setElement(term112397, 58, term113919);
        setElement(term112397, 59, term113919);
        setElement(term112397, 60, term113919);
        setElement(term112397, 61, term113919);
        setElement(term112397, 62, term113919);
        setElement(term112397, 63, term113919);
        setElement(term112397, 64, term113919);
        setElement(term112397, 65, term113919);
        setElement(term112397, 66, term113919);
        setElement(term112397, 67, term113919);
        setElement(term112397, 68, term113919);
        setElement(term112397, 69, term113919);
        setElement(term112397, 70, term113919);
        setElement(term112397, 71, term113919);
        setElement(term112397, 72, term113919);
        setElement(term112397, 73, term113919);
        setElement(term112397, 74, term113919);
        setElement(term112397, 75, term113919);
        setElement(term112397, 76, term113919);
        setElement(term112397, 77, term113919);
        setElement(term112397, 78, term113919);
        setElement(term112397, 79, term113919);
        setElement(term112397, 80, term113919);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term112397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term112859;
        try {
            callMethod(klass, "getAttribute", argTypes, term112529, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


