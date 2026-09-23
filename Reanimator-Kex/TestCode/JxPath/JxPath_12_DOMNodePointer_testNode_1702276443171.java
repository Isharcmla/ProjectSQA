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

public class DOMNodePointer_testNode_1702276443171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30510;
     Object term30642;
     Object term30951;
     Object term30952;

    public DOMNodePointer_testNode_1702276443171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30510 = newInstance(Class.forName("org.apache.html.dom.HTMLImageElementImpl"));
        term30642 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term30951 = newInstance(Class.forName("org.apache.html.dom.HTMLImageElementImpl"));
        setField(term30951, term30951.getClass(), "name", null);
        setField(term30951, term30951.getClass(), "attributes", null);
        setField(term30951, term30951.getClass(), "ownerDocument", null);
        setField(term30951, term30951.getClass(), "firstChild", null);
        setField(term30951, term30951.getClass(), "fNodeListCache", null);
        setField(term30951, term30951.getClass(), "previousSibling", null);
        setField(term30951, term30951.getClass(), "nextSibling", null);
        setField(term30951, term30951.getClass(), "ownerNode", null);
        setShortField(term30951, term30951.getClass(), "flags", (short) 0);
        term30952 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term30952, term30952.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term30510;
        args[1] = term30642;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term30510, term30951));
        assertTrue(recursiveEquals(term30642, term30952));
        assertTrue(recursiveEquals(retValue, false));
    }

};


