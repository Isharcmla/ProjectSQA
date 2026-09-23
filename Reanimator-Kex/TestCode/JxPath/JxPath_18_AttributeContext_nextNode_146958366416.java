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

public class AttributeContext_nextNode_146958366416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1186;

    public AttributeContext_nextNode_146958366416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term1292 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term1366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term1472 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        setIntField(term1186, term1186.getClass(), "position", 0);
        setBooleanField(term1186, term1186.getClass(), "setStarted", false);
        setField(term1292, term1292.getClass(), "qname", term1366);
        setField(term1186, term1186.getClass(), "nodeTest", term1292);
        setField(term1186, term1186.getClass(), "parentContext", term1472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextNode", argTypes, term1186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


