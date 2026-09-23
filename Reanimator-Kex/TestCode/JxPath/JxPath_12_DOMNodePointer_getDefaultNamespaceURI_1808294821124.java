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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18652;
     Object term19687;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18652 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18652, term18652.getClass(), "defaultNamespace", "");
        term19687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term19687, term19687.getClass(), "node", null);
        setField(term19687, term19687.getClass(), "namespaces", null);
        setField(term19687, term19687.getClass(), "defaultNamespace", "");
        setField(term19687, term19687.getClass(), "id", null);
        setIntField(term19687, term19687.getClass(), "index", 0);
        setBooleanField(term19687, term19687.getClass(), "attribute", false);
        setField(term19687, term19687.getClass(), "rootNode", null);
        setField(term19687, term19687.getClass(), "namespaceResolver", null);
        setField(term19687, term19687.getClass(), "parent", null);
        setField(term19687, term19687.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term18652, args);
        assertTrue(recursiveEquals(term18652, term19687));
        assertTrue(recursiveEquals(retValue, null));
    }

};


