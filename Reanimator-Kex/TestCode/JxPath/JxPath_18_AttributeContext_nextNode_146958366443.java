package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttributeContext_nextNode_146958366443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14330;

    public AttributeContext_nextNode_146958366443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14330 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term14436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term14510 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term14616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term14744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term14854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setIntField(term14330, term14330.getClass(), "position", 0);
        setBooleanField(term14330, term14330.getClass(), "setStarted", false);
        setField(term14436, term14436.getClass(), "qname", term14510);
        setField(term14330, term14330.getClass(), "nodeTest", term14436);
        setField(term14744, term14744.getClass(), "valuePointer", term14854);
        setField(term14616, term14616.getClass(), "currentNodePointer", term14744);
        setField(term14330, term14330.getClass(), "parentContext", term14616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNode", argTypes, term14330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


