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

public class JDOMNodePointer_getName_74540432899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17125;
     Object term17211;
     Object term17206;

    public JDOMNodePointer_getName_74540432899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term17191 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term17125, term17125.getClass(), "node", term17191);
        term17211 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term17212 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term17212, term17212.getClass(), "target", null);
        setField(term17212, term17212.getClass(), "rawData", null);
        setField(term17212, term17212.getClass(), "mapData", null);
        setField(term17212, term17212.getClass(), "parent", null);
        setField(term17211, term17211.getClass(), "node", term17212);
        setField(term17211, term17211.getClass(), "id", null);
        setField(term17211, term17211.getClass(), "localNamespaceResolver", null);
        setIntField(term17211, term17211.getClass(), "index", 0);
        setBooleanField(term17211, term17211.getClass(), "attribute", false);
        setField(term17211, term17211.getClass(), "rootNode", null);
        setField(term17211, term17211.getClass(), "namespaceResolver", null);
        setField(term17211, term17211.getClass(), "parent", null);
        setField(term17211, term17211.getClass(), "locale", null);
        term17206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term17206, term17206.getClass(), "prefix", null);
        setField(term17206, term17206.getClass(), "name", null);
        setField(term17206, term17206.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term17125, args);
        assertTrue(recursiveEquals(term17125, term17211));
        assertTrue(recursiveEquals(retValue, term17206));
    }

};


