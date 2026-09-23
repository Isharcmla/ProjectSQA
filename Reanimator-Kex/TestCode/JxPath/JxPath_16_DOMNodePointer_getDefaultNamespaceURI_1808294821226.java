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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48982;
     Object term50399;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term48982, term48982.getClass(), "defaultNamespace", null);
        term50399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term50399, term50399.getClass(), "node", null);
        setField(term50399, term50399.getClass(), "namespaces", null);
        setField(term50399, term50399.getClass(), "defaultNamespace", "");
        setField(term50399, term50399.getClass(), "id", null);
        setField(term50399, term50399.getClass(), "localNamespaceResolver", null);
        setIntField(term50399, term50399.getClass(), "index", 0);
        setBooleanField(term50399, term50399.getClass(), "attribute", false);
        setField(term50399, term50399.getClass(), "rootNode", null);
        setField(term50399, term50399.getClass(), "namespaceResolver", null);
        setField(term50399, term50399.getClass(), "parent", null);
        setField(term50399, term50399.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term48982, args);
        assertTrue(recursiveEquals(term48982, term50399));
        assertTrue(recursiveEquals(retValue, null));
    }

};


