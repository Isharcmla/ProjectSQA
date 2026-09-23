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

public class DOMNodePointer_testNode_769718949236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63760;
     Object term63980;
     Object term64401;
     Object term64403;

    public DOMNodePointer_testNode_769718949236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63848 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        setField(term63760, term63760.getClass(), "node", term63848);
        term63980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        term64401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64402 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        setIntField(term64402, term64402.getClass(), "fNodeIndex", 0);
        setField(term64402, term64402.getClass(), "data", null);
        setField(term64402, term64402.getClass(), "previousSibling", null);
        setField(term64402, term64402.getClass(), "nextSibling", null);
        setField(term64402, term64402.getClass(), "ownerNode", null);
        setShortField(term64402, term64402.getClass(), "flags", (short) 0);
        setField(term64401, term64401.getClass(), "node", term64402);
        setField(term64401, term64401.getClass(), "namespaces", null);
        setField(term64401, term64401.getClass(), "defaultNamespace", null);
        setField(term64401, term64401.getClass(), "id", null);
        setIntField(term64401, term64401.getClass(), "index", 0);
        setBooleanField(term64401, term64401.getClass(), "attribute", false);
        setField(term64401, term64401.getClass(), "rootNode", null);
        setField(term64401, term64401.getClass(), "namespaceResolver", null);
        setField(term64401, term64401.getClass(), "parent", null);
        setField(term64401, term64401.getClass(), "locale", null);
        term64403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
        setField(term64403, term64403.getClass(), "target", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term63980;
        callMethod(klass, "testNode", argTypes, term63760, args);
        assertTrue(recursiveEquals(term63760, term64401));
        assertTrue(recursiveEquals(term63980, term64403));
    }

};


