package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;

public class DOMNodePointer_asPath_1752315222140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25276;
     Object term26679;

    public DOMNodePointer_asPath_1752315222140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term25276, term25276.getClass(), "id", "");
        term26679 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term26679, term26679.getClass(), "node", null);
        setField(term26679, term26679.getClass(), "namespaces", null);
        setField(term26679, term26679.getClass(), "defaultNamespace", null);
        setField(term26679, term26679.getClass(), "id", "");
        setIntField(term26679, term26679.getClass(), "index", 0);
        setBooleanField(term26679, term26679.getClass(), "attribute", false);
        setField(term26679, term26679.getClass(), "rootNode", null);
        setField(term26679, term26679.getClass(), "namespaceResolver", null);
        setField(term26679, term26679.getClass(), "parent", null);
        setField(term26679, term26679.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term25276, args);
        assertTrue(recursiveEquals(term25276, term26679));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


