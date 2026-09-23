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

public class JDOMNodePointer_getLocalName_1737481960166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30245;
     Object term30739;

    public JDOMNodePointer_getLocalName_1737481960166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30245 = newInstance(Class.forName("org.jdom.Attribute"));
        term30739 = newInstance(Class.forName("org.jdom.Attribute"));
        setField(term30739, term30739.getClass(), "name", null);
        setField(term30739, term30739.getClass(), "namespace", null);
        setField(term30739, term30739.getClass(), "value", null);
        setIntField(term30739, term30739.getClass(), "type", 0);
        setField(term30739, term30739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30245;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term30245, term30739));
        assertTrue(recursiveEquals(retValue, null));
    }

};


