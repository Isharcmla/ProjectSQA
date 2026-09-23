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

public class DOMNodePointer_getAbstractFactory_2140118586323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288819;
     Object term289131;

    public DOMNodePointer_getAbstractFactory_2140118586323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term288931 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term289015 = newInstance(Class.forName("org.apache.xerces.dom.PSVIElementNSImpl"));
        setField(term288819, term288819.getClass(), "id", null);
        setField(term288931, term288931.getClass(), "id", null);
        setField(term288931, term288931.getClass(), "parent", null);
        setField(term288931, term288931.getClass(), "node", term289015);
        setField(term288819, term288819.getClass(), "parent", term288931);
        term289131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term289131, term289131.getClass(), "factory", null);
        setField(term289131, term289131.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = term289131;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term288819, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


