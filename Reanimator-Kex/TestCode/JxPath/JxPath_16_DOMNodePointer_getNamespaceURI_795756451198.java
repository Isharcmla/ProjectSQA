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

public class DOMNodePointer_getNamespaceURI_795756451198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41661;
     Object term42436;

    public DOMNodePointer_getNamespaceURI_795756451198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term42436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term42436, term42436.getClass(), "node", null);
        setField(term42436, term42436.getClass(), "namespaces", null);
        setField(term42436, term42436.getClass(), "defaultNamespace", "");
        setField(term42436, term42436.getClass(), "id", null);
        setField(term42436, term42436.getClass(), "localNamespaceResolver", null);
        setIntField(term42436, term42436.getClass(), "index", 0);
        setBooleanField(term42436, term42436.getClass(), "attribute", false);
        setField(term42436, term42436.getClass(), "rootNode", null);
        setField(term42436, term42436.getClass(), "namespaceResolver", null);
        setField(term42436, term42436.getClass(), "parent", null);
        setField(term42436, term42436.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term41661, args);
        assertTrue(recursiveEquals(term41661, term42436));
        assertTrue(recursiveEquals(retValue, null));
    }

};


