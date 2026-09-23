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
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;

public class DOMNodePointer_asPath_1752315222114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19053;
     Object term19495;

    public DOMNodePointer_asPath_1752315222114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19053 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19053, term19053.getClass(), "id", "");
        term19495 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19495, term19495.getClass(), "node", null);
        setField(term19495, term19495.getClass(), "namespaces", null);
        setField(term19495, term19495.getClass(), "defaultNamespace", null);
        setField(term19495, term19495.getClass(), "id", "");
        setField(term19495, term19495.getClass(), "localNamespaceResolver", null);
        setIntField(term19495, term19495.getClass(), "index", 0);
        setBooleanField(term19495, term19495.getClass(), "attribute", false);
        setField(term19495, term19495.getClass(), "rootNode", null);
        setField(term19495, term19495.getClass(), "namespaceResolver", null);
        setField(term19495, term19495.getClass(), "parent", null);
        setField(term19495, term19495.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term19053, args);
        assertTrue(recursiveEquals(term19053, term19495));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


