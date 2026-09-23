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

public class DOMNodePointer_getRelativePositionByName_1797079143138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24181;
     Object term24483;

    public DOMNodePointer_getRelativePositionByName_1797079143138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24263 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        setField(term24181, term24181.getClass(), "node", term24263);
        term24483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24484 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        setField(term24484, term24484.getClass(), "name", null);
        setField(term24484, term24484.getClass(), "attributes", null);
        setField(term24484, term24484.getClass(), "ownerDocument", null);
        setField(term24484, term24484.getClass(), "firstChild", null);
        setField(term24484, term24484.getClass(), "fNodeListCache", null);
        setField(term24484, term24484.getClass(), "previousSibling", null);
        setField(term24484, term24484.getClass(), "nextSibling", null);
        setField(term24484, term24484.getClass(), "ownerNode", null);
        setShortField(term24484, term24484.getClass(), "flags", (short) 0);
        setField(term24483, term24483.getClass(), "node", term24484);
        setField(term24483, term24483.getClass(), "namespaces", null);
        setField(term24483, term24483.getClass(), "defaultNamespace", null);
        setField(term24483, term24483.getClass(), "id", null);
        setIntField(term24483, term24483.getClass(), "index", 0);
        setBooleanField(term24483, term24483.getClass(), "attribute", false);
        setField(term24483, term24483.getClass(), "rootNode", null);
        setField(term24483, term24483.getClass(), "namespaceResolver", null);
        setField(term24483, term24483.getClass(), "parent", null);
        setField(term24483, term24483.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByName", argTypes, term24181, args);
        assertTrue(recursiveEquals(term24181, term24483));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


