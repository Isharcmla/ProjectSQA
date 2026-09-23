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

public class DOMAttributeIterator_testAttr_895657089223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117812;
     Object term118114;
     Object term118766;
     Object term118771;

    public DOMAttributeIterator_testAttr_895657089223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117812 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term117886 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term118030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setField(term117886, term117886.getClass(), "name", "");
        setField(term117886, term117886.getClass(), "prefix", null);
        setField(term117812, term117812.getClass(), "name", term117886);
        setField(term117812, term117812.getClass(), "parent", term118030);
        term118114 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term118114, term118114.getClass(), "prefix", "                                         ");
        setField(term118114, term118114.getClass(), "localpart", null);
        setField(term118114, term118114.getClass(), "rawname", "");
        term118766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term118767 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        Object term118768 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term118767, term118767.getClass(), "variables", null);
        setField(term118767, term118767.getClass(), "name", null);
        setField(term118767, term118767.getClass(), "valuePointer", null);
        setBooleanField(term118767, term118767.getClass(), "actual", false);
        setIntField(term118767, term118767.getClass(), "index", 0);
        setBooleanField(term118767, term118767.getClass(), "attribute", false);
        setField(term118767, term118767.getClass(), "rootNode", null);
        setField(term118767, term118767.getClass(), "namespaceResolver", null);
        setField(term118767, term118767.getClass(), "parent", null);
        setField(term118767, term118767.getClass(), "locale", null);
        setField(term118766, term118766.getClass(), "parent", term118767);
        setField(term118768, term118768.getClass(), "prefix", null);
        setField(term118768, term118768.getClass(), "name", "");
        setField(term118768, term118768.getClass(), "qualifiedName", null);
        setField(term118766, term118766.getClass(), "name", term118768);
        setField(term118766, term118766.getClass(), "attributes", null);
        setIntField(term118766, term118766.getClass(), "position", 0);
        term118771 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term118771, term118771.getClass(), "element", null);
        setField(term118771, term118771.getClass(), "value", null);
        setField(term118771, term118771.getClass(), "prefix", "                                         ");
        setField(term118771, term118771.getClass(), "localpart", null);
        setField(term118771, term118771.getClass(), "rawname", "");
        setField(term118771, term118771.getClass(), "uri", null);
        setShortField(term118771, term118771.getClass(), "nodeType", (short) 0);
        setBooleanField(term118771, term118771.getClass(), "hidden", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term118114;
        Object retValue = callMethod(klass, "testAttr", argTypes, term117812, args);
        assertTrue(recursiveEquals(term117812, term118766));
        assertTrue(recursiveEquals(term118114, term118771));
        assertTrue(recursiveEquals(retValue, true));
    }

};


