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

public class JDOMNodePointer_isLeaf_1592954916259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50176;
     Object term56360;

    public JDOMNodePointer_isLeaf_1592954916259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term50214 = newInstance(Class.forName("org.jdom.Element"));
        Object term50260 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term50214, term50214.getClass(), "content", term50260);
        setField(term50176, term50176.getClass(), "node", term50214);
        term56360 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term56361 = newInstance(Class.forName("org.jdom.Element"));
        Object term56362 = newInstance(Class.forName("org.jdom.ContentList"));
        setField(term56361, term56361.getClass(), "name", null);
        setField(term56361, term56361.getClass(), "namespace", null);
        setField(term56361, term56361.getClass(), "additionalNamespaces", null);
        setField(term56361, term56361.getClass(), "attributes", null);
        setField(term56362, term56362.getClass(), "elementData", null);
        setIntField(term56362, term56362.getClass(), "size", 0);
        setField(term56362, term56362.getClass(), "parent", null);
        setIntField(term56362, term56362.getClass(), "modCount", 0);
        setField(term56361, term56361.getClass(), "content", term56362);
        setField(term56361, term56361.getClass(), "parent", null);
        setField(term56360, term56360.getClass(), "node", term56361);
        setField(term56360, term56360.getClass(), "id", null);
        setField(term56360, term56360.getClass(), "localNamespaceResolver", null);
        setIntField(term56360, term56360.getClass(), "index", 0);
        setBooleanField(term56360, term56360.getClass(), "attribute", false);
        setField(term56360, term56360.getClass(), "namespaceResolver", null);
        setField(term56360, term56360.getClass(), "rootNode", null);
        setField(term56360, term56360.getClass(), "parent", null);
        setField(term56360, term56360.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term50176, args);
        assertTrue(recursiveEquals(term50176, term56360));
        assertTrue(recursiveEquals(retValue, true));
    }

};


