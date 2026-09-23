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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23987;
     Object term24234;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23987 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term23987, term23987.getClass(), "defaultNamespace", null);
        term24234 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24234, term24234.getClass(), "node", null);
        setField(term24234, term24234.getClass(), "namespaces", null);
        setField(term24234, term24234.getClass(), "defaultNamespace", "");
        setField(term24234, term24234.getClass(), "id", null);
        setIntField(term24234, term24234.getClass(), "index", 0);
        setBooleanField(term24234, term24234.getClass(), "attribute", false);
        setField(term24234, term24234.getClass(), "rootNode", null);
        setField(term24234, term24234.getClass(), "namespaceResolver", null);
        setField(term24234, term24234.getClass(), "parent", null);
        setField(term24234, term24234.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term23987, args);
        assertTrue(recursiveEquals(term23987, term24234));
        assertTrue(recursiveEquals(retValue, null));
    }

};


