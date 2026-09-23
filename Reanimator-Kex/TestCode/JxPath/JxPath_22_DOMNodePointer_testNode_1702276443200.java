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

public class DOMNodePointer_testNode_1702276443200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45022;
     Object term45154;
     Object term45635;
     Object term45636;

    public DOMNodePointer_testNode_1702276443200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45022 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        term45154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term45635 = newInstance(Class.forName("org.apache.wml.dom.WMLWmlElementImpl"));
        setField(term45635, term45635.getClass(), "name", null);
        setField(term45635, term45635.getClass(), "attributes", null);
        setField(term45635, term45635.getClass(), "ownerDocument", null);
        setField(term45635, term45635.getClass(), "firstChild", null);
        setField(term45635, term45635.getClass(), "fNodeListCache", null);
        setField(term45635, term45635.getClass(), "previousSibling", null);
        setField(term45635, term45635.getClass(), "nextSibling", null);
        setField(term45635, term45635.getClass(), "ownerNode", null);
        setShortField(term45635, term45635.getClass(), "flags", (short) 0);
        term45636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term45636, term45636.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term45022;
        args[1] = term45154;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term45022, term45635));
        assertTrue(recursiveEquals(term45154, term45636));
        assertTrue(recursiveEquals(retValue, false));
    }

};


