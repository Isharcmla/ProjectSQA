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

public class DOMNodePointer_getPointerByID_2127216393293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87214;
     Object term89782;
     Object term89778;

    public DOMNodePointer_getPointerByID_2127216393293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87214 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term87300 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setShortField(term87300, term87300.getClass(), "nodeType", (short) 9);
        setField(term87214, term87214.getClass(), "node", term87300);
        term89782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89783 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term89783, term89783.getClass(), "relations", null);
        setField(term89783, term89783.getClass(), "parent", null);
        setIntField(term89783, term89783.getClass(), "currLoc", 0);
        setIntField(term89783, term89783.getClass(), "nextFreeLoc", 0);
        setBooleanField(term89783, term89783.getClass(), "hidden", false);
        setField(term89783, term89783.getClass(), "prefix", null);
        setField(term89783, term89783.getClass(), "localpart", null);
        setField(term89783, term89783.getClass(), "rawname", null);
        setField(term89783, term89783.getClass(), "uri", null);
        setShortField(term89783, term89783.getClass(), "nodeType", (short) 9);
        setField(term89782, term89782.getClass(), "node", term89783);
        setField(term89782, term89782.getClass(), "namespaces", null);
        setField(term89782, term89782.getClass(), "defaultNamespace", null);
        setField(term89782, term89782.getClass(), "id", null);
        setIntField(term89782, term89782.getClass(), "index", 0);
        setBooleanField(term89782, term89782.getClass(), "attribute", false);
        setField(term89782, term89782.getClass(), "rootNode", null);
        setField(term89782, term89782.getClass(), "namespaceResolver", null);
        setField(term89782, term89782.getClass(), "parent", null);
        setField(term89782, term89782.getClass(), "locale", null);
        term89778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term89779 = newInstance(Class.forName("java.lang.Object"));
        setField(term89778, term89778.getClass(), "name", null);
        setField(term89778, term89778.getClass(), "id", null);
        setField(term89778, term89778.getClass(), "value", term89779);
        setIntField(term89778, term89778.getClass(), "index", -2147483648);
        setBooleanField(term89778, term89778.getClass(), "attribute", false);
        setField(term89778, term89778.getClass(), "rootNode", null);
        setField(term89778, term89778.getClass(), "namespaceResolver", null);
        setField(term89778, term89778.getClass(), "parent", null);
        setField(term89778, term89778.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term87214, args);
        assertTrue(recursiveEquals(term87214, term89782));
        assertTrue(recursiveEquals(retValue, term89778));
    }

};


