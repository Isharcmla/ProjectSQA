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

public class JDOMNodePointer_getRelativePositionOfTextNode_1448036293172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31329;
     Object term31756;

    public JDOMNodePointer_getRelativePositionOfTextNode_1448036293172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31329 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term31363 = newInstance(Class.forName("org.jdom.CDATA"));
        setField(term31329, term31329.getClass(), "node", term31363);
        term31756 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term31757 = newInstance(Class.forName("org.jdom.CDATA"));
        setField(term31757, term31757.getClass(), "value", null);
        setField(term31757, term31757.getClass(), "parent", null);
        setField(term31756, term31756.getClass(), "node", term31757);
        setField(term31756, term31756.getClass(), "id", null);
        setField(term31756, term31756.getClass(), "localNamespaceResolver", null);
        setIntField(term31756, term31756.getClass(), "index", 0);
        setBooleanField(term31756, term31756.getClass(), "attribute", false);
        setField(term31756, term31756.getClass(), "namespaceResolver", null);
        setField(term31756, term31756.getClass(), "rootNode", null);
        setField(term31756, term31756.getClass(), "parent", null);
        setField(term31756, term31756.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term31329, args);
        assertTrue(recursiveEquals(term31329, term31756));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


