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

public class DOMNodePointer_testNode_1702276443243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65186;
     Object term65318;
     Object term65685;
     Object term65686;

    public DOMNodePointer_testNode_1702276443243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65186 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        term65318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term65685 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term65685, term65685.getClass(), "name", null);
        setField(term65685, term65685.getClass(), "attributes", null);
        setField(term65685, term65685.getClass(), "ownerDocument", null);
        setField(term65685, term65685.getClass(), "firstChild", null);
        setField(term65685, term65685.getClass(), "fNodeListCache", null);
        setField(term65685, term65685.getClass(), "previousSibling", null);
        setField(term65685, term65685.getClass(), "nextSibling", null);
        setField(term65685, term65685.getClass(), "ownerNode", null);
        setShortField(term65685, term65685.getClass(), "flags", (short) 0);
        term65686 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term65686, term65686.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term65186;
        args[1] = term65318;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term65186, term65685));
        assertTrue(recursiveEquals(term65318, term65686));
        assertTrue(recursiveEquals(retValue, false));
    }

};


