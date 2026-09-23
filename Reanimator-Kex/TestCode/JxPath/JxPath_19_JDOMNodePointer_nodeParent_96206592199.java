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

public class JDOMNodePointer_nodeParent_96206592199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17349;
     Object term17604;

    public JDOMNodePointer_nodeParent_96206592199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17349 = newInstance(Class.forName("org.jdom.Element"));
        term17604 = newInstance(Class.forName("org.jdom.Element"));
        setField(term17604, term17604.getClass(), "name", null);
        setField(term17604, term17604.getClass(), "namespace", null);
        setField(term17604, term17604.getClass(), "additionalNamespaces", null);
        setField(term17604, term17604.getClass(), "attributes", null);
        setField(term17604, term17604.getClass(), "content", null);
        setField(term17604, term17604.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17349;
        Object retValue = callMethod(klass, "nodeParent", argTypes, null, args);
        assertTrue(recursiveEquals(term17349, term17604));
        assertTrue(recursiveEquals(retValue, null));
    }

};


