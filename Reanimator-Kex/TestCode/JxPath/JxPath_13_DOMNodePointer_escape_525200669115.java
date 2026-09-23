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

public class DOMNodePointer_escape_525200669115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16283;
     Object term18427;

    public DOMNodePointer_escape_525200669115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16283 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term18427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term18427, term18427.getClass(), "node", null);
        setField(term18427, term18427.getClass(), "namespaces", null);
        setField(term18427, term18427.getClass(), "defaultNamespace", null);
        setField(term18427, term18427.getClass(), "id", null);
        setIntField(term18427, term18427.getClass(), "index", 0);
        setBooleanField(term18427, term18427.getClass(), "attribute", false);
        setField(term18427, term18427.getClass(), "rootNode", null);
        setField(term18427, term18427.getClass(), "namespaceResolver", null);
        setField(term18427, term18427.getClass(), "parent", null);
        setField(term18427, term18427.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term16283, args);
        assertTrue(recursiveEquals(term16283, term18427));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


