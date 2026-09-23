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

public class DOMNodePointer_getNamespaceURI_795756451202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43711;
     Object term44097;

    public DOMNodePointer_getNamespaceURI_795756451202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43711 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term43811 = newInstance(Class.forName("org.apache.xerces.dom.ProcessingInstructionImpl"));
        setField(term43711, term43711.getClass(), "defaultNamespace", null);
        setField(term43711, term43711.getClass(), "node", term43811);
        term44097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term44098 = newInstance(Class.forName("org.apache.xerces.dom.ProcessingInstructionImpl"));
        setField(term44098, term44098.getClass(), "target", null);
        setField(term44098, term44098.getClass(), "data", null);
        setField(term44098, term44098.getClass(), "previousSibling", null);
        setField(term44098, term44098.getClass(), "nextSibling", null);
        setField(term44098, term44098.getClass(), "ownerNode", null);
        setShortField(term44098, term44098.getClass(), "flags", (short) 0);
        setField(term44097, term44097.getClass(), "node", term44098);
        setField(term44097, term44097.getClass(), "namespaces", null);
        setField(term44097, term44097.getClass(), "defaultNamespace", "");
        setField(term44097, term44097.getClass(), "id", null);
        setIntField(term44097, term44097.getClass(), "index", 0);
        setBooleanField(term44097, term44097.getClass(), "attribute", false);
        setField(term44097, term44097.getClass(), "rootNode", null);
        setField(term44097, term44097.getClass(), "namespaceResolver", null);
        setField(term44097, term44097.getClass(), "parent", null);
        setField(term44097, term44097.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term43711, args);
        assertTrue(recursiveEquals(term43711, term44097));
        assertTrue(recursiveEquals(retValue, null));
    }

};


