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

public class DOMNodePointer_getRelativePositionOfPI_354290229190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38951;
     Object term39314;

    public DOMNodePointer_getRelativePositionOfPI_354290229190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term39067 = newInstance(Class.forName("org.apache.xerces.dom.DeferredProcessingInstructionImpl"));
        setField(term38951, term38951.getClass(), "node", term39067);
        term39314 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term39315 = newInstance(Class.forName("org.apache.xerces.dom.DeferredProcessingInstructionImpl"));
        setIntField(term39315, term39315.getClass(), "fNodeIndex", 0);
        setField(term39315, term39315.getClass(), "target", null);
        setField(term39315, term39315.getClass(), "data", null);
        setField(term39315, term39315.getClass(), "previousSibling", null);
        setField(term39315, term39315.getClass(), "nextSibling", null);
        setField(term39315, term39315.getClass(), "ownerNode", null);
        setShortField(term39315, term39315.getClass(), "flags", (short) 0);
        setField(term39314, term39314.getClass(), "node", term39315);
        setField(term39314, term39314.getClass(), "namespaces", null);
        setField(term39314, term39314.getClass(), "defaultNamespace", null);
        setField(term39314, term39314.getClass(), "id", null);
        setField(term39314, term39314.getClass(), "localNamespaceResolver", null);
        setIntField(term39314, term39314.getClass(), "index", 0);
        setBooleanField(term39314, term39314.getClass(), "attribute", false);
        setField(term39314, term39314.getClass(), "namespaceResolver", null);
        setField(term39314, term39314.getClass(), "rootNode", null);
        setField(term39314, term39314.getClass(), "parent", null);
        setField(term39314, term39314.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term38951, args);
        assertTrue(recursiveEquals(term38951, term39314));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


