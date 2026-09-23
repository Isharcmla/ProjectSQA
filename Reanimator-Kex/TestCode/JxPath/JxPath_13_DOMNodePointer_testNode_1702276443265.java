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

public class DOMNodePointer_testNode_1702276443265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75260;
     Object term75392;
     Object term75404;
     Object term75405;

    public DOMNodePointer_testNode_1702276443265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75260 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrNSImpl"));
        term75392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term75404 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrNSImpl"));
        setIntField(term75404, term75404.getClass(), "fNodeIndex", 0);
        setField(term75404, term75404.getClass(), "namespaceURI", null);
        setField(term75404, term75404.getClass(), "localName", null);
        setField(term75404, term75404.getClass(), "value", null);
        setField(term75404, term75404.getClass(), "name", null);
        setField(term75404, term75404.getClass(), "type", null);
        setField(term75404, term75404.getClass(), "ownerNode", null);
        setShortField(term75404, term75404.getClass(), "flags", (short) 0);
        term75405 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term75405, term75405.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term75260;
        args[1] = term75392;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term75260, term75404));
        assertTrue(recursiveEquals(term75392, term75405));
        assertTrue(recursiveEquals(retValue, false));
    }

};


