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
import java.lang.Object;

public class DOMNodePointer_getRelativePositionOfPI_202037106143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24887;
     Object term25346;

    public DOMNodePointer_getRelativePositionOfPI_202037106143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24887 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24969 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term24887, term24887.getClass(), "node", term24969);
        term25346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term25347 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term25347, term25347.getClass(), "name", null);
        setField(term25347, term25347.getClass(), "attributes", null);
        setField(term25347, term25347.getClass(), "ownerDocument", null);
        setField(term25347, term25347.getClass(), "firstChild", null);
        setField(term25347, term25347.getClass(), "fNodeListCache", null);
        setField(term25347, term25347.getClass(), "previousSibling", null);
        setField(term25347, term25347.getClass(), "nextSibling", null);
        setField(term25347, term25347.getClass(), "ownerNode", null);
        setShortField(term25347, term25347.getClass(), "flags", (short) 0);
        setField(term25346, term25346.getClass(), "node", term25347);
        setField(term25346, term25346.getClass(), "namespaces", null);
        setField(term25346, term25346.getClass(), "defaultNamespace", null);
        setField(term25346, term25346.getClass(), "id", null);
        setIntField(term25346, term25346.getClass(), "index", 0);
        setBooleanField(term25346, term25346.getClass(), "attribute", false);
        setField(term25346, term25346.getClass(), "rootNode", null);
        setField(term25346, term25346.getClass(), "namespaceResolver", null);
        setField(term25346, term25346.getClass(), "parent", null);
        setField(term25346, term25346.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term24887, args);
        assertTrue(recursiveEquals(term24887, term25346));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


