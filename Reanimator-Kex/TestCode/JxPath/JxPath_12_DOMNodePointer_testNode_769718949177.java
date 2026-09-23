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
import java.lang.Object;

public class DOMNodePointer_testNode_769718949177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33763;
     Object term33979;
     Object term33996;
     Object term33998;

    public DOMNodePointer_testNode_769718949177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33847 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadElementImpl"));
        setField(term33763, term33763.getClass(), "node", term33847);
        term33979 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term33996 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33997 = newInstance(Class.forName("org.apache.html.dom.HTMLHeadElementImpl"));
        setField(term33997, term33997.getClass(), "name", null);
        setField(term33997, term33997.getClass(), "attributes", null);
        setField(term33997, term33997.getClass(), "ownerDocument", null);
        setField(term33997, term33997.getClass(), "firstChild", null);
        setField(term33997, term33997.getClass(), "fNodeListCache", null);
        setField(term33997, term33997.getClass(), "previousSibling", null);
        setField(term33997, term33997.getClass(), "nextSibling", null);
        setField(term33997, term33997.getClass(), "ownerNode", null);
        setShortField(term33997, term33997.getClass(), "flags", (short) 0);
        setField(term33996, term33996.getClass(), "node", term33997);
        setField(term33996, term33996.getClass(), "namespaces", null);
        setField(term33996, term33996.getClass(), "defaultNamespace", null);
        setField(term33996, term33996.getClass(), "id", null);
        setIntField(term33996, term33996.getClass(), "index", 0);
        setBooleanField(term33996, term33996.getClass(), "attribute", false);
        setField(term33996, term33996.getClass(), "rootNode", null);
        setField(term33996, term33996.getClass(), "namespaceResolver", null);
        setField(term33996, term33996.getClass(), "parent", null);
        setField(term33996, term33996.getClass(), "locale", null);
        term33998 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term33998, term33998.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term33979;
        callMethod(klass, "testNode", argTypes, term33763, args);
        assertTrue(recursiveEquals(term33763, term33996));
        assertTrue(recursiveEquals(term33979, term33998));
    }

};


