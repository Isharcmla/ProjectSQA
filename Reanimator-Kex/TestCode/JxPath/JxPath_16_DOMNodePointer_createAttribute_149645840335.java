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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMNodePointer_createAttribute_149645840335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105368;

    public DOMNodePointer_createAttribute_149645840335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105368 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105592 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105704 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term105928 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106264 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106376 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106488 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term106600 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term105368, term105368.getClass(), "node", null);
        setField(term105368, term105368.getClass(), "id", null);
        setField(term105480, term105480.getClass(), "id", null);
        setField(term105592, term105592.getClass(), "id", null);
        setField(term105704, term105704.getClass(), "id", null);
        setField(term105816, term105816.getClass(), "id", null);
        setField(term105928, term105928.getClass(), "id", null);
        setField(term106040, term106040.getClass(), "id", null);
        setField(term106152, term106152.getClass(), "id", null);
        setField(term106264, term106264.getClass(), "id", null);
        setField(term106376, term106376.getClass(), "id", null);
        setField(term106488, term106488.getClass(), "id", null);
        setField(term106600, term106600.getClass(), "id", null);
        setField(term106600, term106600.getClass(), "parent", null);
        setField(term106488, term106488.getClass(), "parent", term106600);
        setField(term106376, term106376.getClass(), "parent", term106488);
        setField(term106264, term106264.getClass(), "parent", term106376);
        setField(term106152, term106152.getClass(), "parent", term106264);
        setField(term106040, term106040.getClass(), "parent", term106152);
        setField(term105928, term105928.getClass(), "parent", term106040);
        setField(term105816, term105816.getClass(), "parent", term105928);
        setField(term105704, term105704.getClass(), "parent", term105816);
        setField(term105592, term105592.getClass(), "parent", term105704);
        setField(term105480, term105480.getClass(), "parent", term105592);
        setField(term105368, term105368.getClass(), "parent", term105480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createAttribute", argTypes, term105368, args);
    }

};


