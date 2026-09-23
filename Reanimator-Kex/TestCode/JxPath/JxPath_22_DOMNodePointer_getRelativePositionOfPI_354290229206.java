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

public class DOMNodePointer_getRelativePositionOfPI_354290229206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48822;
     Object term49216;

    public DOMNodePointer_getRelativePositionOfPI_354290229206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48822 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48938 = newInstance(Class.forName("org.apache.xerces.dom.DeferredProcessingInstructionImpl"));
        setField(term48822, term48822.getClass(), "node", term48938);
        term49216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term49217 = newInstance(Class.forName("org.apache.xerces.dom.DeferredProcessingInstructionImpl"));
        setIntField(term49217, term49217.getClass(), "fNodeIndex", 0);
        setField(term49217, term49217.getClass(), "target", null);
        setField(term49217, term49217.getClass(), "data", null);
        setField(term49217, term49217.getClass(), "previousSibling", null);
        setField(term49217, term49217.getClass(), "nextSibling", null);
        setField(term49217, term49217.getClass(), "ownerNode", null);
        setShortField(term49217, term49217.getClass(), "flags", (short) 0);
        setField(term49216, term49216.getClass(), "node", term49217);
        setField(term49216, term49216.getClass(), "namespaces", null);
        setField(term49216, term49216.getClass(), "defaultNamespace", null);
        setField(term49216, term49216.getClass(), "id", null);
        setField(term49216, term49216.getClass(), "localNamespaceResolver", null);
        setIntField(term49216, term49216.getClass(), "index", 0);
        setBooleanField(term49216, term49216.getClass(), "attribute", false);
        setField(term49216, term49216.getClass(), "namespaceResolver", null);
        setField(term49216, term49216.getClass(), "exceptionHandler", null);
        setField(term49216, term49216.getClass(), "rootNode", null);
        setField(term49216, term49216.getClass(), "parent", null);
        setField(term49216, term49216.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term48822, args);
        assertTrue(recursiveEquals(term48822, term49216));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


