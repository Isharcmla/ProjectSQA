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

public class DOMAttributeIterator_testAttr_895657089125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37721;
     Object term37917;
     Object term41888;
     Object term41892;

    public DOMAttributeIterator_testAttr_895657089125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term37795 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term37795, term37795.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term37721, term37721.getClass(), "name", term37795);
        term37917 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term37917, term37917.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term37917, term37917.getClass(), "localpart", null);
        setField(term37917, term37917.getClass(), "rawname", "");
        term41888 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term41889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term41888, term41888.getClass(), "parent", null);
        setField(term41889, term41889.getClass(), "prefix", null);
        setField(term41889, term41889.getClass(), "name", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term41889, term41889.getClass(), "qualifiedName", null);
        setField(term41888, term41888.getClass(), "name", term41889);
        setField(term41888, term41888.getClass(), "attributes", null);
        setIntField(term41888, term41888.getClass(), "position", 0);
        term41892 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term41892, term41892.getClass(), "element", null);
        setField(term41892, term41892.getClass(), "value", null);
        setField(term41892, term41892.getClass(), "prefix", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term41892, term41892.getClass(), "localpart", null);
        setField(term41892, term41892.getClass(), "rawname", "");
        setField(term41892, term41892.getClass(), "uri", null);
        setShortField(term41892, term41892.getClass(), "nodeType", (short) 0);
        setBooleanField(term41892, term41892.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term37917;
        Object retValue = callMethod(klass, "testAttr", argTypes, term37721, args);
        assertTrue(recursiveEquals(term37721, term41888));
        assertTrue(recursiveEquals(term37917, term41892));
        assertTrue(recursiveEquals(retValue, false));
    }

};


