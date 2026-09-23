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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17693;
     Object term20090;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17693 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17693, term17693.getClass(), "defaultNamespace", "");
        term20090 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term20090, term20090.getClass(), "node", null);
        setField(term20090, term20090.getClass(), "namespaces", null);
        setField(term20090, term20090.getClass(), "defaultNamespace", "");
        setField(term20090, term20090.getClass(), "id", null);
        setIntField(term20090, term20090.getClass(), "index", 0);
        setBooleanField(term20090, term20090.getClass(), "attribute", false);
        setField(term20090, term20090.getClass(), "rootNode", null);
        setField(term20090, term20090.getClass(), "namespaceResolver", null);
        setField(term20090, term20090.getClass(), "parent", null);
        setField(term20090, term20090.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term17693, args);
        assertTrue(recursiveEquals(term17693, term20090));
        assertTrue(recursiveEquals(retValue, null));
    }

};


