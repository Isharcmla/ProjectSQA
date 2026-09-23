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

public class JDOMNodePointer_init_183960028543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term3829;
     Object term3831;

    public JDOMNodePointer_init_183960028543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("java.lang.Object"));
        term3829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3830 = newInstance(Class.forName("java.lang.Object"));
        setField(term3829, term3829.getClass(), "node", term3830);
        setField(term3829, term3829.getClass(), "id", null);
        setField(term3829, term3829.getClass(), "localNamespaceResolver", null);
        setIntField(term3829, term3829.getClass(), "index", -2147483648);
        setBooleanField(term3829, term3829.getClass(), "attribute", false);
        setField(term3829, term3829.getClass(), "namespaceResolver", null);
        setField(term3829, term3829.getClass(), "rootNode", null);
        setField(term3829, term3829.getClass(), "parent", null);
        setField(term3829, term3829.getClass(), "locale", null);
        term3831 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3829));
        assertTrue(recursiveEquals(term61, term3831));
    }

};


