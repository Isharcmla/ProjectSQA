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

public class DOMAttributeIterator_testAttr_895657089148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60301;
     Object term60625;
     Object term73065;
     Object term73070;

    public DOMAttributeIterator_testAttr_895657089148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term60375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term60541 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setField(term60375, term60375.getClass(), "name", "");
        setField(term60375, term60375.getClass(), "prefix", null);
        setField(term60301, term60301.getClass(), "name", term60375);
        setField(term60301, term60301.getClass(), "parent", term60541);
        term60625 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term60625, term60625.getClass(), "prefix", "*");
        setField(term60625, term60625.getClass(), "localpart", null);
        setField(term60625, term60625.getClass(), "rawname", "");
        term73065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term73066 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object term73067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term73066, term73066.getClass(), "index", 0);
        setBooleanField(term73066, term73066.getClass(), "attribute", false);
        setField(term73066, term73066.getClass(), "rootNode", null);
        setField(term73066, term73066.getClass(), "namespaceResolver", null);
        setField(term73066, term73066.getClass(), "parent", null);
        setField(term73066, term73066.getClass(), "locale", null);
        setField(term73065, term73065.getClass(), "parent", term73066);
        setField(term73067, term73067.getClass(), "prefix", null);
        setField(term73067, term73067.getClass(), "name", "");
        setField(term73067, term73067.getClass(), "qualifiedName", null);
        setField(term73065, term73065.getClass(), "name", term73067);
        setField(term73065, term73065.getClass(), "attributes", null);
        setIntField(term73065, term73065.getClass(), "position", 0);
        term73070 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term73070, term73070.getClass(), "element", null);
        setField(term73070, term73070.getClass(), "value", null);
        setField(term73070, term73070.getClass(), "prefix", "*");
        setField(term73070, term73070.getClass(), "localpart", null);
        setField(term73070, term73070.getClass(), "rawname", "");
        setField(term73070, term73070.getClass(), "uri", null);
        setShortField(term73070, term73070.getClass(), "nodeType", (short) 0);
        setBooleanField(term73070, term73070.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term60625;
        Object retValue = callMethod(klass, "testAttr", argTypes, term60301, args);
        assertTrue(recursiveEquals(term60301, term73065));
        assertTrue(recursiveEquals(term60625, term73070));
        assertTrue(recursiveEquals(retValue, true));
    }

};


