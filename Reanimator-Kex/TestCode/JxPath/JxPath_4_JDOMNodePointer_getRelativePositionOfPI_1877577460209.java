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

public class JDOMNodePointer_getRelativePositionOfPI_1877577460209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36914;
     Object term36988;

    public JDOMNodePointer_getRelativePositionOfPI_1877577460209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term36980 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term36914, term36914.getClass(), "node", term36980);
        term36988 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term36989 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term36989, term36989.getClass(), "target", null);
        setField(term36989, term36989.getClass(), "rawData", null);
        setField(term36989, term36989.getClass(), "mapData", null);
        setField(term36989, term36989.getClass(), "parent", null);
        setField(term36988, term36988.getClass(), "node", term36989);
        setField(term36988, term36988.getClass(), "id", null);
        setIntField(term36988, term36988.getClass(), "index", 0);
        setBooleanField(term36988, term36988.getClass(), "attribute", false);
        setField(term36988, term36988.getClass(), "rootNode", null);
        setField(term36988, term36988.getClass(), "namespaceResolver", null);
        setField(term36988, term36988.getClass(), "parent", null);
        setField(term36988, term36988.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term36914, args);
        assertTrue(recursiveEquals(term36914, term36988));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


