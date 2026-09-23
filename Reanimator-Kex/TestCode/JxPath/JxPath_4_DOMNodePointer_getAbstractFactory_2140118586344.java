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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DOMNodePointer_getAbstractFactory_2140118586344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113915;
     Object term114069;

    public DOMNodePointer_getAbstractFactory_2140118586344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term113915, term113915.getClass(), "id", "");
        term114069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term114069, term114069.getClass(), "factory", null);
        setField(term114069, term114069.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = term114069;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term113915, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


