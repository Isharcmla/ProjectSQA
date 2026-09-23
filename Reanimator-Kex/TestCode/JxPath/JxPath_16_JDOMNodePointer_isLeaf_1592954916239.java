package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_isLeaf_1592954916239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50983;
     Object term51797;

    public JDOMNodePointer_isLeaf_1592954916239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51021 = newInstance(Class.forName("org.jdom.Element"));
        Object term51067 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term51021, term51021.getClass(), "content", term51067);
        setField(term50983, term50983.getClass(), "node", term51021);
        term51797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term51798 = newInstance(Class.forName("org.jdom.Element"));
        Object term51799 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term51798, term51798.getClass(), "name", null);
        setField(term51798, term51798.getClass(), "namespace", null);
        setField(term51798, term51798.getClass(), "additionalNamespaces", null);
        setField(term51798, term51798.getClass(), "attributes", null);
        setField(term51799, term51799.getClass(), "elementData", null);
        setIntField(term51799, term51799.getClass(), "size", 0);
        setField(term51799, term51799.getClass(), "parent", null);
        setIntField(term51799, term51799.getClass(), "modCount", 0);
        setField(term51798, term51798.getClass(), "content", term51799);
        setField(term51798, term51798.getClass(), "parent", null);
        setField(term51797, term51797.getClass(), "node", term51798);
        setField(term51797, term51797.getClass(), "id", null);
        setField(term51797, term51797.getClass(), "localNamespaceResolver", null);
        setIntField(term51797, term51797.getClass(), "index", 0);
        setBooleanField(term51797, term51797.getClass(), "attribute", false);
        setField(term51797, term51797.getClass(), "rootNode", null);
        setField(term51797, term51797.getClass(), "namespaceResolver", null);
        setField(term51797, term51797.getClass(), "parent", null);
        setField(term51797, term51797.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term50983, args);
        assertTrue(recursiveEquals(term50983, term51797));
        assertTrue(recursiveEquals(retValue, true));
    }

};


