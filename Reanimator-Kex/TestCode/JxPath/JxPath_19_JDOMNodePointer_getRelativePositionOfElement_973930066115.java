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

public class JDOMNodePointer_getRelativePositionOfElement_973930066115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21727;
     Object term21773;

    public JDOMNodePointer_getRelativePositionOfElement_973930066115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21727 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term21765 = newInstance(Class.forName("org.jdom.Element"));
        setField(term21727, term21727.getClass(), "node", term21765);
        term21773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term21774 = newInstance(Class.forName("org.jdom.Element"));
        setField(term21774, term21774.getClass(), "name", null);
        setField(term21774, term21774.getClass(), "namespace", null);
        setField(term21774, term21774.getClass(), "additionalNamespaces", null);
        setField(term21774, term21774.getClass(), "attributes", null);
        setField(term21774, term21774.getClass(), "content", null);
        setField(term21774, term21774.getClass(), "parent", null);
        setField(term21773, term21773.getClass(), "node", term21774);
        setField(term21773, term21773.getClass(), "id", null);
        setField(term21773, term21773.getClass(), "localNamespaceResolver", null);
        setIntField(term21773, term21773.getClass(), "index", 0);
        setBooleanField(term21773, term21773.getClass(), "attribute", false);
        setField(term21773, term21773.getClass(), "namespaceResolver", null);
        setField(term21773, term21773.getClass(), "rootNode", null);
        setField(term21773, term21773.getClass(), "parent", null);
        setField(term21773, term21773.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term21727, args);
        assertTrue(recursiveEquals(term21727, term21773));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


