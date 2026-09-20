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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16597;
     Object term16656;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term16597, term16597.getClass(), "defaultNamespace", "");
        term16656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term16656, term16656.getClass(), "node", null);
        setField(term16656, term16656.getClass(), "namespaces", null);
        setField(term16656, term16656.getClass(), "defaultNamespace", "");
        setField(term16656, term16656.getClass(), "id", null);
        setIntField(term16656, term16656.getClass(), "index", 0);
        setBooleanField(term16656, term16656.getClass(), "attribute", false);
        setField(term16656, term16656.getClass(), "rootNode", null);
        setField(term16656, term16656.getClass(), "namespaceResolver", null);
        setField(term16656, term16656.getClass(), "parent", null);
        setField(term16656, term16656.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term16597, args);
        assertTrue(recursiveEquals(term16597, term16656));
        assertTrue(recursiveEquals(retValue, null));
    }

};
