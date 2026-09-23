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
     Object term21018;
     Object term21285;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21018 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21018, term21018.getClass(), "defaultNamespace", "");
        term21285 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term21285, term21285.getClass(), "node", null);
        setField(term21285, term21285.getClass(), "namespaces", null);
        setField(term21285, term21285.getClass(), "defaultNamespace", "");
        setField(term21285, term21285.getClass(), "id", null);
        setField(term21285, term21285.getClass(), "localNamespaceResolver", null);
        setIntField(term21285, term21285.getClass(), "index", 0);
        setBooleanField(term21285, term21285.getClass(), "attribute", false);
        setField(term21285, term21285.getClass(), "rootNode", null);
        setField(term21285, term21285.getClass(), "namespaceResolver", null);
        setField(term21285, term21285.getClass(), "parent", null);
        setField(term21285, term21285.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term21018, args);
        assertTrue(recursiveEquals(term21018, term21285));
        assertTrue(recursiveEquals(retValue, null));
    }

};


