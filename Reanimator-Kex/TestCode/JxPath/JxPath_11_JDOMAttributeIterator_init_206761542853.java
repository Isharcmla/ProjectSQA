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

public class JDOMAttributeIterator_init_206761542853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14611;
     Object term14741;
     Object term14743;

    public JDOMAttributeIterator_init_206761542853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14491 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term14491, term14491.getClass(), "position", 0);
        setField(term14491, term14491.getClass(), "parent", null);
        term14611 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term14721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term14721, term14721.getClass(), "UNINITIALIZED", term14721);
        setField(term14611, term14611.getClass(), "value", term14721);
        setIntField(term14611, term14611.getClass(), "index", -2147483648);
        term14741 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term14742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term14742, term14742.getClass(), "name", null);
        setField(term14742, term14742.getClass(), "bean", null);
        setField(term14742, term14742.getClass(), "handler", null);
        setField(term14742, term14742.getClass(), "value", null);
        setIntField(term14742, term14742.getClass(), "index", -2147483648);
        setBooleanField(term14742, term14742.getClass(), "attribute", false);
        setField(term14742, term14742.getClass(), "rootNode", null);
        setField(term14742, term14742.getClass(), "namespaceResolver", null);
        setField(term14742, term14742.getClass(), "parent", null);
        setField(term14742, term14742.getClass(), "locale", null);
        setField(term14741, term14741.getClass(), "parent", term14742);
        setField(term14741, term14741.getClass(), "attributes", null);
        setIntField(term14741, term14741.getClass(), "position", 0);
        term14743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term14743, term14743.getClass(), "name", null);
        setField(term14743, term14743.getClass(), "bean", null);
        setField(term14743, term14743.getClass(), "handler", null);
        setField(term14743, term14743.getClass(), "value", null);
        setIntField(term14743, term14743.getClass(), "index", -2147483648);
        setBooleanField(term14743, term14743.getClass(), "attribute", false);
        setField(term14743, term14743.getClass(), "rootNode", null);
        setField(term14743, term14743.getClass(), "namespaceResolver", null);
        setField(term14743, term14743.getClass(), "parent", null);
        setField(term14743, term14743.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term14611;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14741));
        assertTrue(recursiveEquals(term14611, term14743));
    }

};


