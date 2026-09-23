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

public class JDOMNodePointer_testNode_202417738254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56504;
     Object term56639;

    public JDOMNodePointer_testNode_202417738254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term56504, term56504.getClass(), "nodeType", 3);
        term56639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term56639, term56639.getClass(), "nodeType", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term56504;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term56504, term56639));
        assertTrue(recursiveEquals(retValue, false));
    }

};


