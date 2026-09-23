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

public class JDOMNodePointer_getValue_210627446298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16956;
     Object term17200;

    public JDOMNodePointer_getValue_210627446298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term16994 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term16956, term16956.getClass(), "node", term16994);
        term17200 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term17201 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term17201, term17201.getClass(), "text", null);
        setField(term17201, term17201.getClass(), "parent", null);
        setField(term17200, term17200.getClass(), "node", term17201);
        setField(term17200, term17200.getClass(), "id", null);
        setField(term17200, term17200.getClass(), "localNamespaceResolver", null);
        setIntField(term17200, term17200.getClass(), "index", 0);
        setBooleanField(term17200, term17200.getClass(), "attribute", false);
        setField(term17200, term17200.getClass(), "rootNode", null);
        setField(term17200, term17200.getClass(), "namespaceResolver", null);
        setField(term17200, term17200.getClass(), "parent", null);
        setField(term17200, term17200.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term16956, args);
        assertTrue(recursiveEquals(term16956, term17200));
        assertTrue(recursiveEquals(retValue, null));
    }

};


