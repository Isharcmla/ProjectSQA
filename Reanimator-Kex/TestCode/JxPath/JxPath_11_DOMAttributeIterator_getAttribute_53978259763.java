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

public class DOMAttributeIterator_getAttribute_53978259763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13757;
     Object term13847;
     Object term13921;
     Object term13933;
     Object term13934;
     Object term13935;

    public DOMAttributeIterator_getAttribute_53978259763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term13847 = newInstance(Class.forName("org.apache.wml.dom.WMLPostfieldElementImpl"));
        term13921 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term13921, term13921.getClass(), "prefix", null);
        setField(term13921, term13921.getClass(), "name", null);
        term13933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term13933, term13933.getClass(), "parent", null);
        setField(term13933, term13933.getClass(), "name", null);
        setField(term13933, term13933.getClass(), "attributes", null);
        setIntField(term13933, term13933.getClass(), "position", 0);
        term13934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term13934, term13934.getClass(), "prefix", null);
        setField(term13934, term13934.getClass(), "name", null);
        setField(term13934, term13934.getClass(), "qualifiedName", null);
        term13935 = newInstance(Class.forName("org.apache.wml.dom.WMLPostfieldElementImpl"));
        setField(term13935, term13935.getClass(), "name", null);
        setField(term13935, term13935.getClass(), "attributes", null);
        setField(term13935, term13935.getClass(), "ownerDocument", null);
        setField(term13935, term13935.getClass(), "firstChild", null);
        setField(term13935, term13935.getClass(), "fNodeListCache", null);
        setField(term13935, term13935.getClass(), "previousSibling", null);
        setField(term13935, term13935.getClass(), "nextSibling", null);
        setField(term13935, term13935.getClass(), "ownerNode", null);
        setShortField(term13935, term13935.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term13847;
        args[1] = term13921;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term13757, args);
        assertTrue(recursiveEquals(term13757, term13933));
        assertTrue(recursiveEquals(term13847, term13934));
        assertTrue(recursiveEquals(term13921, term13935));
        assertTrue(recursiveEquals(retValue, null));
    }

};


