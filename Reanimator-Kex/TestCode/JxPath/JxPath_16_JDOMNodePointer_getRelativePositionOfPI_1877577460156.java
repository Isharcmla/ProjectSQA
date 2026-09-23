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

public class JDOMNodePointer_getRelativePositionOfPI_1877577460156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27338;
     Object term27780;

    public JDOMNodePointer_getRelativePositionOfPI_1877577460156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27404 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term27338, term27338.getClass(), "node", term27404);
        term27780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27781 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term27781, term27781.getClass(), "target", null);
        setField(term27781, term27781.getClass(), "rawData", null);
        setField(term27781, term27781.getClass(), "mapData", null);
        setField(term27781, term27781.getClass(), "parent", null);
        setField(term27780, term27780.getClass(), "node", term27781);
        setField(term27780, term27780.getClass(), "id", null);
        setField(term27780, term27780.getClass(), "localNamespaceResolver", null);
        setIntField(term27780, term27780.getClass(), "index", 0);
        setBooleanField(term27780, term27780.getClass(), "attribute", false);
        setField(term27780, term27780.getClass(), "rootNode", null);
        setField(term27780, term27780.getClass(), "namespaceResolver", null);
        setField(term27780, term27780.getClass(), "parent", null);
        setField(term27780, term27780.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getRelativePositionOfPI", argTypes, term27338, args);
        assertTrue(recursiveEquals(term27338, term27780));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


