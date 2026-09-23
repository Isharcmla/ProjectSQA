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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttributeContext_nextNode_146958366452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23171;

    public AttributeContext_nextNode_146958366452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23171 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term23277 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term23351 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term23457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term23585 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setIntField(term23171, term23171.getClass(), "position", 0);
        setBooleanField(term23171, term23171.getClass(), "setStarted", false);
        setField(term23277, term23277.getClass(), "qname", term23351);
        setField(term23171, term23171.getClass(), "nodeTest", term23277);
        setField(term23585, term23585.getClass(), "valuePointer", term23585);
        setField(term23457, term23457.getClass(), "currentNodePointer", term23585);
        setField(term23171, term23171.getClass(), "parentContext", term23457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nextNode", argTypes, term23171, args);
    }

};


