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

public class JDOMNodePointer_escape_1554413897162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28356;
     Object term28454;

    public JDOMNodePointer_escape_1554413897162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term28454 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term28454, term28454.getClass(), "node", null);
        setField(term28454, term28454.getClass(), "id", null);
        setField(term28454, term28454.getClass(), "localNamespaceResolver", null);
        setIntField(term28454, term28454.getClass(), "index", 0);
        setBooleanField(term28454, term28454.getClass(), "attribute", false);
        setField(term28454, term28454.getClass(), "rootNode", null);
        setField(term28454, term28454.getClass(), "namespaceResolver", null);
        setField(term28454, term28454.getClass(), "parent", null);
        setField(term28454, term28454.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term28356, args);
        assertTrue(recursiveEquals(term28356, term28454));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


