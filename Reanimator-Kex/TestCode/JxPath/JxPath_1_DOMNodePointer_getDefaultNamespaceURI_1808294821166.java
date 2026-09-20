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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29112;
     Object term29123;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29112, term29112.getClass(), "defaultNamespace", null);
        term29123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term29123, term29123.getClass(), "node", null);
        setField(term29123, term29123.getClass(), "namespaces", null);
        setField(term29123, term29123.getClass(), "defaultNamespace", "");
        setField(term29123, term29123.getClass(), "id", null);
        setIntField(term29123, term29123.getClass(), "index", 0);
        setBooleanField(term29123, term29123.getClass(), "attribute", false);
        setField(term29123, term29123.getClass(), "rootNode", null);
        setField(term29123, term29123.getClass(), "namespaceResolver", null);
        setField(term29123, term29123.getClass(), "parent", null);
        setField(term29123, term29123.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term29112, args);
        assertTrue(recursiveEquals(term29112, term29123));
        assertTrue(recursiveEquals(retValue, null));
    }

};
