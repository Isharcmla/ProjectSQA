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

public class JDOMNodePointer_getRelativePositionOfTextNode_1448036293145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24677;
     Object term24808;

    public JDOMNodePointer_getRelativePositionOfTextNode_1448036293145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24677 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24711 = newInstance(Class.forName("org.jdom.CDATA"));
        setField(term24677, term24677.getClass(), "node", term24711);
        term24808 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24809 = newInstance(Class.forName("org.jdom.CDATA"));
        setField(term24809, term24809.getClass(), "value", null);
        setField(term24809, term24809.getClass(), "parent", null);
        setField(term24808, term24808.getClass(), "node", term24809);
        setField(term24808, term24808.getClass(), "id", null);
        setField(term24808, term24808.getClass(), "localNamespaceResolver", null);
        setIntField(term24808, term24808.getClass(), "index", 0);
        setBooleanField(term24808, term24808.getClass(), "attribute", false);
        setField(term24808, term24808.getClass(), "rootNode", null);
        setField(term24808, term24808.getClass(), "namespaceResolver", null);
        setField(term24808, term24808.getClass(), "parent", null);
        setField(term24808, term24808.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term24677, args);
        assertTrue(recursiveEquals(term24677, term24808));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


