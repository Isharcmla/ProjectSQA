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

public class DOMNodePointer_findEnclosingAttribute_1036825669114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16159;
     Object term18417;

    public DOMNodePointer_findEnclosingAttribute_1036825669114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16159 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        term18417 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term18417, term18417.getClass(), "name", null);
        setField(term18417, term18417.getClass(), "attributes", null);
        setField(term18417, term18417.getClass(), "ownerDocument", null);
        setField(term18417, term18417.getClass(), "firstChild", null);
        setField(term18417, term18417.getClass(), "fNodeListCache", null);
        setField(term18417, term18417.getClass(), "previousSibling", null);
        setField(term18417, term18417.getClass(), "nextSibling", null);
        setField(term18417, term18417.getClass(), "ownerNode", null);
        setShortField(term18417, term18417.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term16159;
        args[1] = null;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term16159, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


