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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63436;
     Object term63447;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term63436, term63436.getClass(), "defaultNamespace", null);
        setField(term63436, term63436.getClass(), "node", null);
        term63447 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term63447, term63447.getClass(), "node", null);
        setField(term63447, term63447.getClass(), "namespaces", null);
        setField(term63447, term63447.getClass(), "defaultNamespace", "");
        setField(term63447, term63447.getClass(), "id", null);
        setIntField(term63447, term63447.getClass(), "index", 0);
        setBooleanField(term63447, term63447.getClass(), "attribute", false);
        setField(term63447, term63447.getClass(), "rootNode", null);
        setField(term63447, term63447.getClass(), "namespaceResolver", null);
        setField(term63447, term63447.getClass(), "parent", null);
        setField(term63447, term63447.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term63436, args);
        assertTrue(recursiveEquals(term63436, term63447));
        assertTrue(recursiveEquals(retValue, null));
    }

};
