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

public class JDOMNodePointer_getRelativePositionByQName_1908557234135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24438;
     Object term25008;

    public JDOMNodePointer_getRelativePositionByQName_1908557234135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24438 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24476 = newInstance(Class.forName("org.jdom.Element"));
        setField(term24438, term24438.getClass(), "node", term24476);
        term25008 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25009 = newInstance(Class.forName("org.jdom.Element"));
        setField(term25009, term25009.getClass(), "name", null);
        setField(term25009, term25009.getClass(), "namespace", null);
        setField(term25009, term25009.getClass(), "additionalNamespaces", null);
        setField(term25009, term25009.getClass(), "attributes", null);
        setField(term25009, term25009.getClass(), "content", null);
        setField(term25009, term25009.getClass(), "parent", null);
        setField(term25008, term25008.getClass(), "node", term25009);
        setField(term25008, term25008.getClass(), "id", null);
        setField(term25008, term25008.getClass(), "localNamespaceResolver", null);
        setIntField(term25008, term25008.getClass(), "index", 0);
        setBooleanField(term25008, term25008.getClass(), "attribute", false);
        setField(term25008, term25008.getClass(), "namespaceResolver", null);
        setField(term25008, term25008.getClass(), "rootNode", null);
        setField(term25008, term25008.getClass(), "parent", null);
        setField(term25008, term25008.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByQName", argTypes, term24438, args);
        assertTrue(recursiveEquals(term24438, term25008));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


