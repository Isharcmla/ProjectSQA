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

public class DOMNodePointer_escape_525200669237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64421;
     Object term64471;

    public DOMNodePointer_escape_525200669237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term64471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term64471, term64471.getClass(), "node", null);
        setField(term64471, term64471.getClass(), "namespaces", null);
        setField(term64471, term64471.getClass(), "defaultNamespace", null);
        setField(term64471, term64471.getClass(), "id", null);
        setIntField(term64471, term64471.getClass(), "index", 0);
        setBooleanField(term64471, term64471.getClass(), "attribute", false);
        setField(term64471, term64471.getClass(), "rootNode", null);
        setField(term64471, term64471.getClass(), "namespaceResolver", null);
        setField(term64471, term64471.getClass(), "parent", null);
        setField(term64471, term64471.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term64421, args);
        assertTrue(recursiveEquals(term64421, term64471));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


