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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24142;
     Object term24313;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24142 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24142, term24142.getClass(), "defaultNamespace", null);
        term24313 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term24313, term24313.getClass(), "node", null);
        setField(term24313, term24313.getClass(), "namespaces", null);
        setField(term24313, term24313.getClass(), "defaultNamespace", "");
        setField(term24313, term24313.getClass(), "id", null);
        setField(term24313, term24313.getClass(), "localNamespaceResolver", null);
        setIntField(term24313, term24313.getClass(), "index", 0);
        setBooleanField(term24313, term24313.getClass(), "attribute", false);
        setField(term24313, term24313.getClass(), "namespaceResolver", null);
        setField(term24313, term24313.getClass(), "exceptionHandler", null);
        setField(term24313, term24313.getClass(), "rootNode", null);
        setField(term24313, term24313.getClass(), "parent", null);
        setField(term24313, term24313.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term24142, args);
        assertTrue(recursiveEquals(term24142, term24313));
        assertTrue(recursiveEquals(retValue, null));
    }

};


