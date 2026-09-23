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

public class DOMNodePointer_getRelativePositionOfPI_202037106199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43269;
     Object term44038;

    public DOMNodePointer_getRelativePositionOfPI_202037106199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term43351 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term43433 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setShortField(term43351, term43351.getClass(), "flags", (short) 0);
        setField(term43351, term43351.getClass(), "previousSibling", term43433);
        setField(term43269, term43269.getClass(), "node", term43351);
        term44038 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term44039 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        Object term44040 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term44039, term44039.getClass(), "name", null);
        setField(term44039, term44039.getClass(), "attributes", null);
        setField(term44039, term44039.getClass(), "ownerDocument", null);
        setField(term44039, term44039.getClass(), "firstChild", null);
        setField(term44039, term44039.getClass(), "fNodeListCache", null);
        setField(term44040, term44040.getClass(), "name", null);
        setField(term44040, term44040.getClass(), "attributes", null);
        setField(term44040, term44040.getClass(), "ownerDocument", null);
        setField(term44040, term44040.getClass(), "firstChild", null);
        setField(term44040, term44040.getClass(), "fNodeListCache", null);
        setField(term44040, term44040.getClass(), "previousSibling", null);
        setField(term44040, term44040.getClass(), "nextSibling", null);
        setField(term44040, term44040.getClass(), "ownerNode", null);
        setShortField(term44040, term44040.getClass(), "flags", (short) 0);
        setField(term44039, term44039.getClass(), "previousSibling", term44040);
        setField(term44039, term44039.getClass(), "nextSibling", null);
        setField(term44039, term44039.getClass(), "ownerNode", null);
        setShortField(term44039, term44039.getClass(), "flags", (short) 0);
        setField(term44038, term44038.getClass(), "node", term44039);
        setField(term44038, term44038.getClass(), "namespaces", null);
        setField(term44038, term44038.getClass(), "defaultNamespace", null);
        setField(term44038, term44038.getClass(), "id", null);
        setIntField(term44038, term44038.getClass(), "index", 0);
        setBooleanField(term44038, term44038.getClass(), "attribute", false);
        setField(term44038, term44038.getClass(), "rootNode", null);
        setField(term44038, term44038.getClass(), "namespaceResolver", null);
        setField(term44038, term44038.getClass(), "parent", null);
        setField(term44038, term44038.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term43269, args);
        assertTrue(recursiveEquals(term43269, term44038));
    }

};


