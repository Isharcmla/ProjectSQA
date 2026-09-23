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

public class DOMAttributeIterator_init_7810902211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109046;
     Object term109326;

    public DOMAttributeIterator_init_7810902211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term108926, term108926.getClass(), "position", 0);
        setField(term108926, term108926.getClass(), "parent", null);
        setField(term108926, term108926.getClass(), "name", null);
        setField(term108926, term108926.getClass(), "attributes", null);
        term109046 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term109132 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term109252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        setField(term109046, term109046.getClass(), "value", term109132);
        setField(term109046, term109046.getClass(), "namespaceResolver", null);
        setField(term109046, term109046.getClass(), "parent", term109252);
        term109326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term109326, term109326.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        setField(term109326, term109326.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term109046;
        args[1] = term109326;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


