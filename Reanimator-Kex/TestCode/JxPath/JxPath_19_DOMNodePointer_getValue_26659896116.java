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

public class DOMNodePointer_getValue_26659896116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20424;
     Object term20792;

    public DOMNodePointer_getValue_26659896116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20424 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20508 = newInstance(Class.forName("org.apache.wml.dom.WMLAnchorElementImpl"));
        setField(term20424, term20424.getClass(), "node", term20508);
        term20792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20793 = newInstance(Class.forName("org.apache.wml.dom.WMLAnchorElementImpl"));
        setField(term20793, term20793.getClass(), "name", null);
        setField(term20793, term20793.getClass(), "attributes", null);
        setField(term20793, term20793.getClass(), "ownerDocument", null);
        setField(term20793, term20793.getClass(), "firstChild", null);
        setField(term20793, term20793.getClass(), "fNodeListCache", null);
        setField(term20793, term20793.getClass(), "previousSibling", null);
        setField(term20793, term20793.getClass(), "nextSibling", null);
        setField(term20793, term20793.getClass(), "ownerNode", null);
        setShortField(term20793, term20793.getClass(), "flags", (short) 0);
        setField(term20792, term20792.getClass(), "node", term20793);
        setField(term20792, term20792.getClass(), "namespaces", null);
        setField(term20792, term20792.getClass(), "defaultNamespace", null);
        setField(term20792, term20792.getClass(), "id", null);
        setField(term20792, term20792.getClass(), "localNamespaceResolver", null);
        setIntField(term20792, term20792.getClass(), "index", 0);
        setBooleanField(term20792, term20792.getClass(), "attribute", false);
        setField(term20792, term20792.getClass(), "namespaceResolver", null);
        setField(term20792, term20792.getClass(), "rootNode", null);
        setField(term20792, term20792.getClass(), "parent", null);
        setField(term20792, term20792.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term20424, args);
        assertTrue(recursiveEquals(term20424, term20792));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


