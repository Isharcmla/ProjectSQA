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

public class DOMNodePointer_stringValue_2129170303212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49983;
     Object term50069;
     Object term50494;
     Object term50495;

    public DOMNodePointer_stringValue_2129170303212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term50069 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setShortField(term50069, term50069.getClass(), "nodeType", (short) 4);
        term50494 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term50494, term50494.getClass(), "node", null);
        setField(term50494, term50494.getClass(), "namespaces", null);
        setField(term50494, term50494.getClass(), "defaultNamespace", null);
        setField(term50494, term50494.getClass(), "id", null);
        setIntField(term50494, term50494.getClass(), "index", 0);
        setBooleanField(term50494, term50494.getClass(), "attribute", false);
        setField(term50494, term50494.getClass(), "rootNode", null);
        setField(term50494, term50494.getClass(), "namespaceResolver", null);
        setField(term50494, term50494.getClass(), "parent", null);
        setField(term50494, term50494.getClass(), "locale", null);
        term50495 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term50495, term50495.getClass(), "relations", null);
        setField(term50495, term50495.getClass(), "parent", null);
        setIntField(term50495, term50495.getClass(), "currLoc", 0);
        setIntField(term50495, term50495.getClass(), "nextFreeLoc", 0);
        setBooleanField(term50495, term50495.getClass(), "hidden", false);
        setField(term50495, term50495.getClass(), "prefix", null);
        setField(term50495, term50495.getClass(), "localpart", null);
        setField(term50495, term50495.getClass(), "rawname", null);
        setField(term50495, term50495.getClass(), "uri", null);
        setShortField(term50495, term50495.getClass(), "nodeType", (short) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term50069;
        Object retValue = callMethod(klass, "stringValue", argTypes, term49983, args);
        assertTrue(recursiveEquals(term49983, term50494));
        assertTrue(recursiveEquals(term50069, term50495));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


