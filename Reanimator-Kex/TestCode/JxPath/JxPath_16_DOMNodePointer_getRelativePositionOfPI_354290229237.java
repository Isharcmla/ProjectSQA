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

public class DOMNodePointer_getRelativePositionOfPI_354290229237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53610;
     Object term54024;

    public DOMNodePointer_getRelativePositionOfPI_354290229237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53610 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term53710 = newInstance(Class.forName("org.apache.xerces.dom.ProcessingInstructionImpl"));
        setField(term53610, term53610.getClass(), "node", term53710);
        term54024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term54025 = newInstance(Class.forName("org.apache.xerces.dom.ProcessingInstructionImpl"));
        setField(term54025, term54025.getClass(), "target", null);
        setField(term54025, term54025.getClass(), "data", null);
        setField(term54025, term54025.getClass(), "previousSibling", null);
        setField(term54025, term54025.getClass(), "nextSibling", null);
        setField(term54025, term54025.getClass(), "ownerNode", null);
        setShortField(term54025, term54025.getClass(), "flags", (short) 0);
        setField(term54024, term54024.getClass(), "node", term54025);
        setField(term54024, term54024.getClass(), "namespaces", null);
        setField(term54024, term54024.getClass(), "defaultNamespace", null);
        setField(term54024, term54024.getClass(), "id", null);
        setField(term54024, term54024.getClass(), "localNamespaceResolver", null);
        setIntField(term54024, term54024.getClass(), "index", 0);
        setBooleanField(term54024, term54024.getClass(), "attribute", false);
        setField(term54024, term54024.getClass(), "rootNode", null);
        setField(term54024, term54024.getClass(), "namespaceResolver", null);
        setField(term54024, term54024.getClass(), "parent", null);
        setField(term54024, term54024.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term53610, args);
        assertTrue(recursiveEquals(term53610, term54024));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


