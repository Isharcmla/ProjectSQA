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

public class DOMAttributeIterator_getAttribute_539782597117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88220;
     Object term88550;

    public DOMAttributeIterator_getAttribute_539782597117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88220 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term88348 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term88476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term88476, term88476.getClass(), "valuePointer", null);
        setField(term88476, term88476.getClass(), "container", null);
        setIntField(term88476, term88476.getClass(), "index", 0);
        setField(term88348, term88348.getClass(), "valuePointer", term88476);
        setField(term88220, term88220.getClass(), "parent", term88348);
        term88550 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term88550, term88550.getClass(), "prefix", "");
        Object[] term88091 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 152);
        Object term88724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term88842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term88964 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term89106 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term89246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        setElement(term88091, 0, term88724);
        setElement(term88091, 1, term88842);
        setElement(term88091, 2, term88964);
        setElement(term88091, 3, term89106);
        setElement(term88091, 4, term89246);
        setElement(term88091, 5, term88964);
        setElement(term88091, 6, term88964);
        setElement(term88091, 7, term88964);
        setElement(term88091, 8, term88964);
        setElement(term88091, 9, term88964);
        setElement(term88091, 10, term88964);
        setElement(term88091, 11, term88964);
        setElement(term88091, 12, term88964);
        setElement(term88091, 13, term88964);
        setElement(term88091, 14, term88964);
        setElement(term88091, 15, term88964);
        setElement(term88091, 16, term88964);
        setElement(term88091, 17, term88964);
        setElement(term88091, 18, term88964);
        setElement(term88091, 19, term88964);
        setElement(term88091, 20, term88964);
        setElement(term88091, 21, term88964);
        setElement(term88091, 22, term88964);
        setElement(term88091, 23, term88964);
        setElement(term88091, 24, term88964);
        setElement(term88091, 25, term88964);
        setElement(term88091, 26, term88964);
        setElement(term88091, 27, term88964);
        setElement(term88091, 28, term88964);
        setElement(term88091, 29, term88964);
        setElement(term88091, 30, term88964);
        setElement(term88091, 31, term88964);
        setElement(term88091, 32, term88964);
        setElement(term88091, 33, term88964);
        setElement(term88091, 34, term88964);
        setElement(term88091, 35, term88964);
        setElement(term88091, 36, term88964);
        setElement(term88091, 37, term88964);
        setElement(term88091, 38, term88964);
        setElement(term88091, 39, term88964);
        setElement(term88091, 40, term88964);
        setElement(term88091, 41, term88964);
        setElement(term88091, 42, term88964);
        setElement(term88091, 43, term88964);
        setElement(term88091, 44, term88964);
        setElement(term88091, 45, term88964);
        setElement(term88091, 46, term88964);
        setElement(term88091, 47, term88964);
        setElement(term88091, 48, term88964);
        setElement(term88091, 49, term88964);
        setElement(term88091, 50, term88964);
        setElement(term88091, 51, term88964);
        setElement(term88091, 52, term88964);
        setElement(term88091, 53, term88964);
        setElement(term88091, 54, term88964);
        setElement(term88091, 55, term88964);
        setElement(term88091, 56, term88964);
        setElement(term88091, 57, term88964);
        setElement(term88091, 58, term88964);
        setElement(term88091, 59, term88964);
        setElement(term88091, 60, term88964);
        setElement(term88091, 61, term88964);
        setElement(term88091, 62, term88964);
        setElement(term88091, 63, term88964);
        setElement(term88091, 64, term88964);
        setElement(term88091, 65, term88964);
        setElement(term88091, 66, term88964);
        setElement(term88091, 67, term88964);
        setElement(term88091, 68, term88964);
        setElement(term88091, 69, term88964);
        setElement(term88091, 70, term88964);
        setElement(term88091, 71, term88964);
        setElement(term88091, 72, term88964);
        setElement(term88091, 73, term88964);
        setElement(term88091, 74, term88964);
        setElement(term88091, 75, term88964);
        setElement(term88091, 76, term88964);
        setElement(term88091, 77, term88964);
        setElement(term88091, 78, term88964);
        setElement(term88091, 79, term88964);
        setElement(term88091, 80, term88964);
        setElement(term88091, 81, term88964);
        setElement(term88091, 82, term88964);
        setElement(term88091, 83, term88964);
        setElement(term88091, 84, term88964);
        setElement(term88091, 85, term88964);
        setElement(term88091, 86, term88964);
        setElement(term88091, 87, term88964);
        setElement(term88091, 88, term88964);
        setElement(term88091, 89, term88964);
        setElement(term88091, 90, term88964);
        setElement(term88091, 91, term88964);
        setElement(term88091, 92, term88964);
        setElement(term88091, 93, term88964);
        setElement(term88091, 94, term88964);
        setElement(term88091, 95, term88964);
        setElement(term88091, 96, term88964);
        setElement(term88091, 97, term88964);
        setElement(term88091, 98, term88964);
        setElement(term88091, 99, term88964);
        setElement(term88091, 100, term88964);
        setElement(term88091, 101, term88964);
        setElement(term88091, 102, term88964);
        setElement(term88091, 103, term88964);
        setElement(term88091, 104, term88964);
        setElement(term88091, 105, term88964);
        setElement(term88091, 106, term88964);
        setElement(term88091, 107, term88964);
        setElement(term88091, 108, term88964);
        setElement(term88091, 109, term88964);
        setElement(term88091, 110, term88964);
        setElement(term88091, 111, term88964);
        setElement(term88091, 112, term88964);
        setElement(term88091, 113, term88964);
        setElement(term88091, 114, term88964);
        setElement(term88091, 115, term88964);
        setElement(term88091, 116, term88964);
        setElement(term88091, 117, term88964);
        setElement(term88091, 118, term88964);
        setElement(term88091, 119, term88964);
        setElement(term88091, 120, term88964);
        setElement(term88091, 121, term88964);
        setElement(term88091, 122, term88964);
        setElement(term88091, 123, term88964);
        setElement(term88091, 124, term88964);
        setElement(term88091, 125, term88964);
        setElement(term88091, 126, term88964);
        setElement(term88091, 127, term88964);
        setElement(term88091, 128, term88964);
        setElement(term88091, 129, term88964);
        setElement(term88091, 130, term88964);
        setElement(term88091, 131, term88964);
        setElement(term88091, 132, term88964);
        setElement(term88091, 133, term88964);
        setElement(term88091, 134, term88964);
        setElement(term88091, 135, term88964);
        setElement(term88091, 136, term88964);
        setElement(term88091, 137, term88964);
        setElement(term88091, 138, term88964);
        setElement(term88091, 139, term88964);
        setElement(term88091, 140, term88964);
        setElement(term88091, 141, term88964);
        setElement(term88091, 142, term88964);
        setElement(term88091, 143, term88964);
        setElement(term88091, 144, term88964);
        setElement(term88091, 145, term88964);
        setElement(term88091, 146, term88964);
        setElement(term88091, 147, term88964);
        setElement(term88091, 148, term88964);
        setElement(term88091, 149, term88964);
        setElement(term88091, 150, term88964);
        setElement(term88091, 151, term88964);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term88091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term88550;
        try {
            callMethod(klass, "getAttribute", argTypes, term88220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


