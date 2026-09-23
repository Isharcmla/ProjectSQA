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

public class JDOMNodePointer_equals_508970494141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22399;
     Object term22515;
     Object term23792;
     Object term23793;

    public JDOMNodePointer_equals_508970494141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22399 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term22515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term23792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term23792, term23792.getClass(), "node", null);
        setField(term23792, term23792.getClass(), "id", null);
        setField(term23792, term23792.getClass(), "localNamespaceResolver", null);
        setIntField(term23792, term23792.getClass(), "index", 0);
        setBooleanField(term23792, term23792.getClass(), "attribute", false);
        setField(term23792, term23792.getClass(), "rootNode", null);
        setField(term23792, term23792.getClass(), "namespaceResolver", null);
        setField(term23792, term23792.getClass(), "parent", null);
        setField(term23792, term23792.getClass(), "locale", null);
        term23793 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term23793, term23793.getClass(), "node", null);
        setField(term23793, term23793.getClass(), "id", null);
        setField(term23793, term23793.getClass(), "localNamespaceResolver", null);
        setIntField(term23793, term23793.getClass(), "index", 0);
        setBooleanField(term23793, term23793.getClass(), "attribute", false);
        setField(term23793, term23793.getClass(), "rootNode", null);
        setField(term23793, term23793.getClass(), "namespaceResolver", null);
        setField(term23793, term23793.getClass(), "parent", null);
        setField(term23793, term23793.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22515;
        Object retValue = callMethod(klass, "equals", argTypes, term22399, args);
        assertTrue(recursiveEquals(term22399, term23792));
        assertTrue(recursiveEquals(term22515, term23793));
        assertTrue(recursiveEquals(retValue, true));
    }

};


