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

public class DOMNodePointer_getNamespaceURI_795756451105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17591;
     Object term17936;

    public DOMNodePointer_getNamespaceURI_795756451105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17591 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term17936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17936, term17936.getClass(), "node", null);
        setField(term17936, term17936.getClass(), "namespaces", null);
        setField(term17936, term17936.getClass(), "defaultNamespace", null);
        setField(term17936, term17936.getClass(), "id", null);
        setField(term17936, term17936.getClass(), "localNamespaceResolver", null);
        setIntField(term17936, term17936.getClass(), "index", 0);
        setBooleanField(term17936, term17936.getClass(), "attribute", false);
        setField(term17936, term17936.getClass(), "namespaceResolver", null);
        setField(term17936, term17936.getClass(), "rootNode", null);
        setField(term17936, term17936.getClass(), "parent", null);
        setField(term17936, term17936.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xml";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term17591, args);
        assertTrue(recursiveEquals(term17591, term17936));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


