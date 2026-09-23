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

public class JDOMNodePointer_getValue_2106274462144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23075;
     Object term24784;

    public JDOMNodePointer_getValue_2106274462144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term23141 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term23075, term23075.getClass(), "node", term23141);
        term24784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24785 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term24785, term24785.getClass(), "target", null);
        setField(term24785, term24785.getClass(), "rawData", null);
        setField(term24785, term24785.getClass(), "mapData", null);
        setField(term24785, term24785.getClass(), "parent", null);
        setField(term24784, term24784.getClass(), "node", term24785);
        setField(term24784, term24784.getClass(), "id", null);
        setField(term24784, term24784.getClass(), "localNamespaceResolver", null);
        setIntField(term24784, term24784.getClass(), "index", 0);
        setBooleanField(term24784, term24784.getClass(), "attribute", false);
        setField(term24784, term24784.getClass(), "rootNode", null);
        setField(term24784, term24784.getClass(), "namespaceResolver", null);
        setField(term24784, term24784.getClass(), "parent", null);
        setField(term24784, term24784.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term23075, args);
        assertTrue(recursiveEquals(term23075, term24784));
        assertTrue(recursiveEquals(retValue, null));
    }

};


