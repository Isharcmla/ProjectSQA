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

public class AttributeContext_setPosition_180004580039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12742;

    public AttributeContext_setPosition_180004580039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term12856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        Object term12962 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term13036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term13132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setIntField(term12742, term12742.getClass(), "position", 131073);
        setBooleanField(term12742, term12742.getClass(), "setStarted", false);
        setField(term12742, term12742.getClass(), "iterator", term12856);
        setField(term12962, term12962.getClass(), "qname", term13036);
        setField(term12742, term12742.getClass(), "nodeTest", term12962);
        setField(term12742, term12742.getClass(), "parentContext", term13132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 131072;
        try {
            callMethod(klass, "setPosition", argTypes, term12742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


