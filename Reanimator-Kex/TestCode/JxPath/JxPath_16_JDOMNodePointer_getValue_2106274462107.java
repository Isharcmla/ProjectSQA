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

public class JDOMNodePointer_getValue_2106274462107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18134;
     Object term18447;

    public JDOMNodePointer_getValue_2106274462107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term18134, term18134.getClass(), "node", null);
        term18447 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term18447, term18447.getClass(), "node", null);
        setField(term18447, term18447.getClass(), "id", null);
        setField(term18447, term18447.getClass(), "localNamespaceResolver", null);
        setIntField(term18447, term18447.getClass(), "index", 0);
        setBooleanField(term18447, term18447.getClass(), "attribute", false);
        setField(term18447, term18447.getClass(), "rootNode", null);
        setField(term18447, term18447.getClass(), "namespaceResolver", null);
        setField(term18447, term18447.getClass(), "parent", null);
        setField(term18447, term18447.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term18134, args);
        assertTrue(recursiveEquals(term18134, term18447));
        assertTrue(recursiveEquals(retValue, null));
    }

};


