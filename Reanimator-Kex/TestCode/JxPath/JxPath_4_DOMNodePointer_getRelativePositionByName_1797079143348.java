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

public class DOMNodePointer_getRelativePositionByName_1797079143348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115627;
     Object term117937;

    public DOMNodePointer_getRelativePositionByName_1797079143348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term115707 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        Object term115787 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setShortField(term115707, term115707.getClass(), "flags", (short) 0);
        setShortField(term115787, term115787.getClass(), "flags", (short) 0);
        setField(term115787, term115787.getClass(), "name", "");
        setField(term115707, term115707.getClass(), "previousSibling", term115787);
        setField(term115707, term115707.getClass(), "name", "");
        setField(term115627, term115627.getClass(), "node", term115707);
        term117937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term117938 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        Object term117941 = newInstance(Class.forName("org.apache.wml.dom.WMLMetaElementImpl"));
        setField(term117938, term117938.getClass(), "name", "");
        setField(term117938, term117938.getClass(), "attributes", null);
        setField(term117938, term117938.getClass(), "ownerDocument", null);
        setField(term117938, term117938.getClass(), "firstChild", null);
        setField(term117938, term117938.getClass(), "fNodeListCache", null);
        setField(term117941, term117941.getClass(), "name", "");
        setField(term117941, term117941.getClass(), "attributes", null);
        setField(term117941, term117941.getClass(), "ownerDocument", null);
        setField(term117941, term117941.getClass(), "firstChild", null);
        setField(term117941, term117941.getClass(), "fNodeListCache", null);
        setField(term117941, term117941.getClass(), "previousSibling", null);
        setField(term117941, term117941.getClass(), "nextSibling", null);
        setField(term117941, term117941.getClass(), "ownerNode", null);
        setShortField(term117941, term117941.getClass(), "flags", (short) 0);
        setField(term117938, term117938.getClass(), "previousSibling", term117941);
        setField(term117938, term117938.getClass(), "nextSibling", null);
        setField(term117938, term117938.getClass(), "ownerNode", null);
        setShortField(term117938, term117938.getClass(), "flags", (short) 0);
        setField(term117937, term117937.getClass(), "node", term117938);
        setField(term117937, term117937.getClass(), "namespaces", null);
        setField(term117937, term117937.getClass(), "defaultNamespace", null);
        setField(term117937, term117937.getClass(), "id", null);
        setIntField(term117937, term117937.getClass(), "index", 0);
        setBooleanField(term117937, term117937.getClass(), "attribute", false);
        setField(term117937, term117937.getClass(), "rootNode", null);
        setField(term117937, term117937.getClass(), "namespaceResolver", null);
        setField(term117937, term117937.getClass(), "parent", null);
        setField(term117937, term117937.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionByName", argTypes, term115627, args);
        assertTrue(recursiveEquals(term115627, term117937));
    }

};


