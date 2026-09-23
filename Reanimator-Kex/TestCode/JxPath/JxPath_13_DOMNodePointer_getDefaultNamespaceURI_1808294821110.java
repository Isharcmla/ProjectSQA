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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15734;
     Object term17829;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15734 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term15734, term15734.getClass(), "defaultNamespace", "");
        term17829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17829, term17829.getClass(), "node", null);
        setField(term17829, term17829.getClass(), "namespaces", null);
        setField(term17829, term17829.getClass(), "defaultNamespace", "");
        setField(term17829, term17829.getClass(), "id", null);
        setIntField(term17829, term17829.getClass(), "index", 0);
        setBooleanField(term17829, term17829.getClass(), "attribute", false);
        setField(term17829, term17829.getClass(), "rootNode", null);
        setField(term17829, term17829.getClass(), "namespaceResolver", null);
        setField(term17829, term17829.getClass(), "parent", null);
        setField(term17829, term17829.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term15734, args);
        assertTrue(recursiveEquals(term15734, term17829));
        assertTrue(recursiveEquals(retValue, null));
    }

};


