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

public class JDOMNodePointer_getRelativePositionOfPI_1725324337138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25137;
     Object term25260;

    public JDOMNodePointer_getRelativePositionOfPI_1725324337138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25137 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25203 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term25137, term25137.getClass(), "node", term25203);
        term25260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term25261 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term25261, term25261.getClass(), "target", null);
        setField(term25261, term25261.getClass(), "rawData", null);
        setField(term25261, term25261.getClass(), "mapData", null);
        setField(term25261, term25261.getClass(), "parent", null);
        setField(term25260, term25260.getClass(), "node", term25261);
        setField(term25260, term25260.getClass(), "id", null);
        setField(term25260, term25260.getClass(), "localNamespaceResolver", null);
        setIntField(term25260, term25260.getClass(), "index", 0);
        setBooleanField(term25260, term25260.getClass(), "attribute", false);
        setField(term25260, term25260.getClass(), "namespaceResolver", null);
        setField(term25260, term25260.getClass(), "rootNode", null);
        setField(term25260, term25260.getClass(), "parent", null);
        setField(term25260, term25260.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term25137, args);
        assertTrue(recursiveEquals(term25137, term25260));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


