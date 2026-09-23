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

public class JDOMNodePointer_getLocalName_1737481960109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18494;
     Object term18498;

    public JDOMNodePointer_getLocalName_1737481960109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18494 = newInstance(Class.forName("org.jdom.Element"));
        term18498 = newInstance(Class.forName("org.jdom.Element"));
        setField(term18498, term18498.getClass(), "name", null);
        setField(term18498, term18498.getClass(), "namespace", null);
        setField(term18498, term18498.getClass(), "additionalNamespaces", null);
        setField(term18498, term18498.getClass(), "attributes", null);
        setField(term18498, term18498.getClass(), "content", null);
        setField(term18498, term18498.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18494;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term18494, term18498));
        assertTrue(recursiveEquals(retValue, null));
    }

};


