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

public class DOMAttributeIterator_testAttr_895657089101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27075;
     Object term27159;
     Object term27575;
     Object term27576;

    public DOMAttributeIterator_testAttr_895657089101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term27159 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term27159, term27159.getClass(), "prefix", "xmlns");
        setField(term27159, term27159.getClass(), "localpart", null);
        setField(term27159, term27159.getClass(), "rawname", "");
        term27575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term27575, term27575.getClass(), "parent", null);
        setField(term27575, term27575.getClass(), "name", null);
        setField(term27575, term27575.getClass(), "attributes", null);
        setIntField(term27575, term27575.getClass(), "position", 0);
        term27576 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term27576, term27576.getClass(), "element", null);
        setField(term27576, term27576.getClass(), "value", null);
        setField(term27576, term27576.getClass(), "prefix", "xmlns");
        setField(term27576, term27576.getClass(), "localpart", null);
        setField(term27576, term27576.getClass(), "rawname", "");
        setField(term27576, term27576.getClass(), "uri", null);
        setShortField(term27576, term27576.getClass(), "nodeType", (short) 0);
        setBooleanField(term27576, term27576.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term27159;
        Object retValue = callMethod(klass, "testAttr", argTypes, term27075, args);
        assertTrue(recursiveEquals(term27075, term27575));
        assertTrue(recursiveEquals(term27159, term27576));
        assertTrue(recursiveEquals(retValue, false));
    }

};


