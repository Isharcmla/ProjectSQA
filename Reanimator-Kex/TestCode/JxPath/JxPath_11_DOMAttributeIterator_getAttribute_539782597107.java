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

public class DOMAttributeIterator_getAttribute_539782597107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55366;
     Object term55696;

    public DOMAttributeIterator_getAttribute_539782597107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term55494 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term55622 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term55622, term55622.getClass(), "valuePointer", null);
        setField(term55622, term55622.getClass(), "container", null);
        setIntField(term55622, term55622.getClass(), "index", 0);
        setField(term55494, term55494.getClass(), "valuePointer", term55622);
        setField(term55366, term55366.getClass(), "parent", term55494);
        term55696 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term55696, term55696.getClass(), "prefix", "");
        Object[] term55237 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 63);
        Object term55870 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term55988 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term56110 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term56252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term56392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        setElement(term55237, 0, term55870);
        setElement(term55237, 1, term55988);
        setElement(term55237, 2, term56110);
        setElement(term55237, 3, term56252);
        setElement(term55237, 4, term56392);
        setElement(term55237, 5, term56110);
        setElement(term55237, 6, term56110);
        setElement(term55237, 7, term56110);
        setElement(term55237, 8, term56110);
        setElement(term55237, 9, term56110);
        setElement(term55237, 10, term56110);
        setElement(term55237, 11, term56110);
        setElement(term55237, 12, term56110);
        setElement(term55237, 13, term56110);
        setElement(term55237, 14, term56110);
        setElement(term55237, 15, term56110);
        setElement(term55237, 16, term56110);
        setElement(term55237, 17, term56110);
        setElement(term55237, 18, term56110);
        setElement(term55237, 19, term56110);
        setElement(term55237, 20, term56110);
        setElement(term55237, 21, term56110);
        setElement(term55237, 22, term56110);
        setElement(term55237, 23, term56110);
        setElement(term55237, 24, term56110);
        setElement(term55237, 25, term56110);
        setElement(term55237, 26, term56110);
        setElement(term55237, 27, term56110);
        setElement(term55237, 28, term56110);
        setElement(term55237, 29, term56110);
        setElement(term55237, 30, term56110);
        setElement(term55237, 31, term56110);
        setElement(term55237, 32, term56110);
        setElement(term55237, 33, term56110);
        setElement(term55237, 34, term56110);
        setElement(term55237, 35, term56110);
        setElement(term55237, 36, term56110);
        setElement(term55237, 37, term56110);
        setElement(term55237, 38, term56110);
        setElement(term55237, 39, term56110);
        setElement(term55237, 40, term56110);
        setElement(term55237, 41, term56110);
        setElement(term55237, 42, term56110);
        setElement(term55237, 43, term56110);
        setElement(term55237, 44, term56110);
        setElement(term55237, 45, term56110);
        setElement(term55237, 46, term56110);
        setElement(term55237, 47, term56110);
        setElement(term55237, 48, term56110);
        setElement(term55237, 49, term56110);
        setElement(term55237, 50, term56110);
        setElement(term55237, 51, term56110);
        setElement(term55237, 52, term56110);
        setElement(term55237, 53, term56110);
        setElement(term55237, 54, term56110);
        setElement(term55237, 55, term56110);
        setElement(term55237, 56, term56110);
        setElement(term55237, 57, term56110);
        setElement(term55237, 58, term56110);
        setElement(term55237, 59, term56110);
        setElement(term55237, 60, term56110);
        setElement(term55237, 61, term56110);
        setElement(term55237, 62, term56110);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term55237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55696;
        try {
            callMethod(klass, "getAttribute", argTypes, term55366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


