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

public class DOMNodePointer_getRelativePositionByName_1797079143118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16762;
     Object term18703;

    public DOMNodePointer_getRelativePositionByName_1797079143118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term16846 = newInstance(Class.forName("org.apache.html.dom.HTMLAreaElementImpl"));
        setField(term16762, term16762.getClass(), "node", term16846);
        term18703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term18704 = newInstance(Class.forName("org.apache.html.dom.HTMLAreaElementImpl"));
        setField(term18704, term18704.getClass(), "name", null);
        setField(term18704, term18704.getClass(), "attributes", null);
        setField(term18704, term18704.getClass(), "ownerDocument", null);
        setField(term18704, term18704.getClass(), "firstChild", null);
        setField(term18704, term18704.getClass(), "fNodeListCache", null);
        setField(term18704, term18704.getClass(), "previousSibling", null);
        setField(term18704, term18704.getClass(), "nextSibling", null);
        setField(term18704, term18704.getClass(), "ownerNode", null);
        setShortField(term18704, term18704.getClass(), "flags", (short) 0);
        setField(term18703, term18703.getClass(), "node", term18704);
        setField(term18703, term18703.getClass(), "namespaces", null);
        setField(term18703, term18703.getClass(), "defaultNamespace", null);
        setField(term18703, term18703.getClass(), "id", null);
        setIntField(term18703, term18703.getClass(), "index", 0);
        setBooleanField(term18703, term18703.getClass(), "attribute", false);
        setField(term18703, term18703.getClass(), "rootNode", null);
        setField(term18703, term18703.getClass(), "namespaceResolver", null);
        setField(term18703, term18703.getClass(), "parent", null);
        setField(term18703, term18703.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term16762, args);
        assertTrue(recursiveEquals(term16762, term18703));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


