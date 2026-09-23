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

public class DOMNodePointer_escape_525200669125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21238;
     Object term21347;

    public DOMNodePointer_escape_525200669125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21238 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term21347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21347, term21347.getClass(), "node", null);
        setField(term21347, term21347.getClass(), "namespaces", null);
        setField(term21347, term21347.getClass(), "defaultNamespace", null);
        setField(term21347, term21347.getClass(), "id", null);
        setField(term21347, term21347.getClass(), "localNamespaceResolver", null);
        setIntField(term21347, term21347.getClass(), "index", 0);
        setBooleanField(term21347, term21347.getClass(), "attribute", false);
        setField(term21347, term21347.getClass(), "rootNode", null);
        setField(term21347, term21347.getClass(), "namespaceResolver", null);
        setField(term21347, term21347.getClass(), "parent", null);
        setField(term21347, term21347.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term21238, args);
        assertTrue(recursiveEquals(term21238, term21347));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


