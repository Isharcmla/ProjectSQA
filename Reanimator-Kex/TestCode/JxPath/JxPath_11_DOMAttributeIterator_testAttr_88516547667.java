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

public class DOMAttributeIterator_testAttr_88516547667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14863;
     Object term14945;
     Object term15036;
     Object term15037;

    public DOMAttributeIterator_testAttr_88516547667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14863 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term14945 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setShortField(term14945, term14945.getClass(), "flags", (short) 0);
        setField(term14945, term14945.getClass(), "name", "xmlns");
        term15036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term15036, term15036.getClass(), "parent", null);
        setField(term15036, term15036.getClass(), "name", null);
        setField(term15036, term15036.getClass(), "attributes", null);
        setIntField(term15036, term15036.getClass(), "position", 0);
        term15037 = newInstance(Class.forName("org.apache.xerces.dom.DeferredAttrImpl"));
        setIntField(term15037, term15037.getClass(), "fNodeIndex", 0);
        setField(term15037, term15037.getClass(), "value", null);
        setField(term15037, term15037.getClass(), "name", "xmlns");
        setField(term15037, term15037.getClass(), "type", null);
        setField(term15037, term15037.getClass(), "ownerNode", null);
        setShortField(term15037, term15037.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term14945;
        args[1] = null;
        Object retValue = callMethod(klass, "testAttr", argTypes, term14863, args);
        assertTrue(recursiveEquals(term14863, term15036));
        assertTrue(recursiveEquals(term14945, term15037));
        assertTrue(recursiveEquals(retValue, false));
    }

};


