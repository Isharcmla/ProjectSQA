package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_getRelativePositionByName_28253542399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13284;
     Object term13342;

    public JDOMNodePointer_getRelativePositionByName_28253542399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13284 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term13322 = newInstance(Class.forName("org.jdom.Element"));
        setField(term13284, term13284.getClass(), "node", term13322);
        term13342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term13343 = newInstance(Class.forName("org.jdom.Element"));
        setField(term13343, term13343.getClass(), "name", null);
        setField(term13343, term13343.getClass(), "namespace", null);
        setField(term13343, term13343.getClass(), "additionalNamespaces", null);
        setField(term13343, term13343.getClass(), "attributes", null);
        setField(term13343, term13343.getClass(), "content", null);
        setField(term13343, term13343.getClass(), "parent", null);
        setField(term13342, term13342.getClass(), "node", term13343);
        setField(term13342, term13342.getClass(), "id", null);
        setIntField(term13342, term13342.getClass(), "index", 0);
        setBooleanField(term13342, term13342.getClass(), "attribute", false);
        setField(term13342, term13342.getClass(), "rootNode", null);
        setField(term13342, term13342.getClass(), "namespaceResolver", null);
        setField(term13342, term13342.getClass(), "parent", null);
        setField(term13342, term13342.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term13284, args);
        assertTrue(recursiveEquals(term13284, term13342));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


