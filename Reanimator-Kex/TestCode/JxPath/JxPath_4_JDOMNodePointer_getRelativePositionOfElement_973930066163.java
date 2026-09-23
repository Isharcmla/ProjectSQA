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

public class JDOMNodePointer_getRelativePositionOfElement_973930066163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26090;
     Object term26157;

    public JDOMNodePointer_getRelativePositionOfElement_973930066163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26090 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term26128 = newInstance(Class.forName("org.jdom.Element"));
        setField(term26090, term26090.getClass(), "node", term26128);
        term26157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term26158 = newInstance(Class.forName("org.jdom.Element"));
        setField(term26158, term26158.getClass(), "name", null);
        setField(term26158, term26158.getClass(), "namespace", null);
        setField(term26158, term26158.getClass(), "additionalNamespaces", null);
        setField(term26158, term26158.getClass(), "attributes", null);
        setField(term26158, term26158.getClass(), "content", null);
        setField(term26158, term26158.getClass(), "parent", null);
        setField(term26157, term26157.getClass(), "node", term26158);
        setField(term26157, term26157.getClass(), "id", null);
        setIntField(term26157, term26157.getClass(), "index", 0);
        setBooleanField(term26157, term26157.getClass(), "attribute", false);
        setField(term26157, term26157.getClass(), "rootNode", null);
        setField(term26157, term26157.getClass(), "namespaceResolver", null);
        setField(term26157, term26157.getClass(), "parent", null);
        setField(term26157, term26157.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term26090, args);
        assertTrue(recursiveEquals(term26090, term26157));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


