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
     Object term2754;
     Object term2756;

    public JDOMNodePointer_init_183960028543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("java.lang.Object"));
        term2754 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2755 = newInstance(Class.forName("java.lang.Object"));
        setField(term2754, term2754.getClass(), "node", term2755);
        setField(term2754, term2754.getClass(), "id", null);
        setIntField(term2754, term2754.getClass(), "index", -2147483648);
        setBooleanField(term2754, term2754.getClass(), "attribute", false);
        setField(term2754, term2754.getClass(), "rootNode", null);
        setField(term2754, term2754.getClass(), "namespaceResolver", null);
        setField(term2754, term2754.getClass(), "parent", null);
        setField(term2754, term2754.getClass(), "locale", null);
        term2756 = newInstance(Class.forName("java.lang.Object"));
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
        assertTrue(recursiveEquals(instance, term2754));
        assertTrue(recursiveEquals(term61, term2756));
    }

};


