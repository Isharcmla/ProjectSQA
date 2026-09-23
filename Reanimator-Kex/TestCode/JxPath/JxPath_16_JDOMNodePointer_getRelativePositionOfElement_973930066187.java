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

public class JDOMNodePointer_getRelativePositionOfElement_973930066187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34418;
     Object term34796;

    public JDOMNodePointer_getRelativePositionOfElement_973930066187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34418 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34456 = newInstance(Class.forName("org.jdom.Element"));
        setField(term34418, term34418.getClass(), "node", term34456);
        term34796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term34797 = newInstance(Class.forName("org.jdom.Element"));
        setField(term34797, term34797.getClass(), "name", null);
        setField(term34797, term34797.getClass(), "namespace", null);
        setField(term34797, term34797.getClass(), "additionalNamespaces", null);
        setField(term34797, term34797.getClass(), "attributes", null);
        setField(term34797, term34797.getClass(), "content", null);
        setField(term34797, term34797.getClass(), "parent", null);
        setField(term34796, term34796.getClass(), "node", term34797);
        setField(term34796, term34796.getClass(), "id", null);
        setField(term34796, term34796.getClass(), "localNamespaceResolver", null);
        setIntField(term34796, term34796.getClass(), "index", 0);
        setBooleanField(term34796, term34796.getClass(), "attribute", false);
        setField(term34796, term34796.getClass(), "rootNode", null);
        setField(term34796, term34796.getClass(), "namespaceResolver", null);
        setField(term34796, term34796.getClass(), "parent", null);
        setField(term34796, term34796.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term34418, args);
        assertTrue(recursiveEquals(term34418, term34796));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


