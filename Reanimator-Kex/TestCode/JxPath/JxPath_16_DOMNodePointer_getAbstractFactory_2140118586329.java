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

public class DOMNodePointer_getAbstractFactory_2140118586329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93286;
     Object term93606;

    public DOMNodePointer_getAbstractFactory_2140118586329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term93398 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term93490 = newInstance(Class.forName("org.apache.html.dom.HTMLOptGroupElementImpl"));
        setField(term93286, term93286.getClass(), "id", null);
        setField(term93398, term93398.getClass(), "id", null);
        setField(term93398, term93398.getClass(), "parent", null);
        setField(term93398, term93398.getClass(), "node", term93490);
        setField(term93286, term93286.getClass(), "parent", term93398);
        term93606 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term93606, term93606.getClass(), "factory", null);
        setField(term93606, term93606.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        Object[] args = new Object[1];
        args[0] = term93606;
        try {
            callMethod(klass, "getAbstractFactory", argTypes, term93286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


