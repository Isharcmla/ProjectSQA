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
import java.util.ArrayList;

public class JDOMNodePointer_addContent_1429481788234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50351;
     Object term50441;
     Object term50780;
     Object term50782;

    public JDOMNodePointer_addContent_1429481788234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50351 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50389 = newInstance(Class.forName("org.jdom.Element"));
        setField(term50351, term50351.getClass(), "node", term50389);
        term50441 = new ArrayList();
        term50780 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50781 = newInstance(Class.forName("org.jdom.Element"));
        setField(term50781, term50781.getClass(), "name", null);
        setField(term50781, term50781.getClass(), "namespace", null);
        setField(term50781, term50781.getClass(), "additionalNamespaces", null);
        setField(term50781, term50781.getClass(), "attributes", null);
        setField(term50781, term50781.getClass(), "content", null);
        setField(term50781, term50781.getClass(), "parent", null);
        setField(term50780, term50780.getClass(), "node", term50781);
        setField(term50780, term50780.getClass(), "id", null);
        setField(term50780, term50780.getClass(), "localNamespaceResolver", null);
        setIntField(term50780, term50780.getClass(), "index", 0);
        setBooleanField(term50780, term50780.getClass(), "attribute", false);
        setField(term50780, term50780.getClass(), "rootNode", null);
        setField(term50780, term50780.getClass(), "namespaceResolver", null);
        setField(term50780, term50780.getClass(), "parent", null);
        setField(term50780, term50780.getClass(), "locale", null);
        term50782 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term50441;
        callMethod(klass, "addContent", argTypes, term50351, args);
        assertTrue(recursiveEquals(term50351, term50780));
        assertTrue(recursiveEquals(term50441, term50782));
    }

};


