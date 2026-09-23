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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69586;
     Object term69845;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69694 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        Object term69802 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        setShortField(term69694, term69694.getClass(), "flags", (short) 0);
        setField(term69694, term69694.getClass(), "previousSibling", term69802);
        setField(term69586, term69586.getClass(), "node", term69694);
        term69845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69846 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        Object term69847 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        setIntField(term69846, term69846.getClass(), "fNodeIndex", 0);
        setField(term69846, term69846.getClass(), "name", null);
        setField(term69846, term69846.getClass(), "attributes", null);
        setField(term69846, term69846.getClass(), "ownerDocument", null);
        setField(term69846, term69846.getClass(), "firstChild", null);
        setField(term69846, term69846.getClass(), "fNodeListCache", null);
        setIntField(term69847, term69847.getClass(), "fNodeIndex", 0);
        setField(term69847, term69847.getClass(), "name", null);
        setField(term69847, term69847.getClass(), "attributes", null);
        setField(term69847, term69847.getClass(), "ownerDocument", null);
        setField(term69847, term69847.getClass(), "firstChild", null);
        setField(term69847, term69847.getClass(), "fNodeListCache", null);
        setField(term69847, term69847.getClass(), "previousSibling", null);
        setField(term69847, term69847.getClass(), "nextSibling", null);
        setField(term69847, term69847.getClass(), "ownerNode", null);
        setShortField(term69847, term69847.getClass(), "flags", (short) 0);
        setField(term69846, term69846.getClass(), "previousSibling", term69847);
        setField(term69846, term69846.getClass(), "nextSibling", null);
        setField(term69846, term69846.getClass(), "ownerNode", null);
        setShortField(term69846, term69846.getClass(), "flags", (short) 0);
        setField(term69845, term69845.getClass(), "node", term69846);
        setField(term69845, term69845.getClass(), "namespaces", null);
        setField(term69845, term69845.getClass(), "defaultNamespace", null);
        setField(term69845, term69845.getClass(), "id", null);
        setIntField(term69845, term69845.getClass(), "index", 0);
        setBooleanField(term69845, term69845.getClass(), "attribute", false);
        setField(term69845, term69845.getClass(), "rootNode", null);
        setField(term69845, term69845.getClass(), "namespaceResolver", null);
        setField(term69845, term69845.getClass(), "parent", null);
        setField(term69845, term69845.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term69586, args);
        assertTrue(recursiveEquals(term69586, term69845));
    }

};


