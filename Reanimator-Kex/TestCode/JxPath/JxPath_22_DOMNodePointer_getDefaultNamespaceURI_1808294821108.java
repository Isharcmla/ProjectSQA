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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16670;
     Object term18533;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term16670, term16670.getClass(), "defaultNamespace", "");
        term18533 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18533, term18533.getClass(), "node", null);
        setField(term18533, term18533.getClass(), "namespaces", null);
        setField(term18533, term18533.getClass(), "defaultNamespace", "");
        setField(term18533, term18533.getClass(), "id", null);
        setField(term18533, term18533.getClass(), "localNamespaceResolver", null);
        setIntField(term18533, term18533.getClass(), "index", 0);
        setBooleanField(term18533, term18533.getClass(), "attribute", false);
        setField(term18533, term18533.getClass(), "namespaceResolver", null);
        setField(term18533, term18533.getClass(), "exceptionHandler", null);
        setField(term18533, term18533.getClass(), "rootNode", null);
        setField(term18533, term18533.getClass(), "parent", null);
        setField(term18533, term18533.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term16670, args);
        assertTrue(recursiveEquals(term16670, term18533));
        assertTrue(recursiveEquals(retValue, null));
    }

};


