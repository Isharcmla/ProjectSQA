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

public class DOMNodePointer_asPath_1752315222138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21860;
     Object term22122;

    public DOMNodePointer_asPath_1752315222138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21860 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21860, term21860.getClass(), "id", "");
        term22122 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term22122, term22122.getClass(), "node", null);
        setField(term22122, term22122.getClass(), "namespaces", null);
        setField(term22122, term22122.getClass(), "defaultNamespace", null);
        setField(term22122, term22122.getClass(), "id", "");
        setIntField(term22122, term22122.getClass(), "index", 0);
        setBooleanField(term22122, term22122.getClass(), "attribute", false);
        setField(term22122, term22122.getClass(), "rootNode", null);
        setField(term22122, term22122.getClass(), "namespaceResolver", null);
        setField(term22122, term22122.getClass(), "parent", null);
        setField(term22122, term22122.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term21860, args);
        assertTrue(recursiveEquals(term21860, term22122));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


