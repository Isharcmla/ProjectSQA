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

public class DOMAttributeIterator_getAttribute_53978259768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16174;
     Object term16256;
     Object term16330;
     Object term16937;
     Object term16938;
     Object term16941;

    public DOMAttributeIterator_getAttribute_53978259768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16174 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term16256 = newInstance(Class.forName("org.apache.html.dom.HTMLModElementImpl"));
        term16330 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16330, term16330.getClass(), "prefix", null);
        setField(term16330, term16330.getClass(), "name", "en");
        term16937 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term16937, term16937.getClass(), "parent", null);
        setField(term16937, term16937.getClass(), "name", null);
        setField(term16937, term16937.getClass(), "attributes", null);
        setIntField(term16937, term16937.getClass(), "position", 0);
        term16938 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16938, term16938.getClass(), "prefix", null);
        setField(term16938, term16938.getClass(), "name", "en");
        setField(term16938, term16938.getClass(), "qualifiedName", null);
        term16941 = newInstance(Class.forName("org.apache.html.dom.HTMLModElementImpl"));
        setField(term16941, term16941.getClass(), "name", null);
        setField(term16941, term16941.getClass(), "attributes", null);
        setField(term16941, term16941.getClass(), "ownerDocument", null);
        setField(term16941, term16941.getClass(), "firstChild", null);
        setField(term16941, term16941.getClass(), "fNodeListCache", null);
        setField(term16941, term16941.getClass(), "previousSibling", null);
        setField(term16941, term16941.getClass(), "nextSibling", null);
        setField(term16941, term16941.getClass(), "ownerNode", null);
        setShortField(term16941, term16941.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term16256;
        args[1] = term16330;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term16174, args);
        assertTrue(recursiveEquals(term16174, term16937));
        assertTrue(recursiveEquals(term16256, term16938));
        assertTrue(recursiveEquals(term16330, term16941));
        assertTrue(recursiveEquals(retValue, null));
    }

};


