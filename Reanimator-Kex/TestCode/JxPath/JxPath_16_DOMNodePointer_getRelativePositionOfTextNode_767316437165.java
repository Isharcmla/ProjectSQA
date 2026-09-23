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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33441;
     Object term33536;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33523 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setField(term33441, term33441.getClass(), "node", term33523);
        term33536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33537 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setField(term33537, term33537.getClass(), "name", null);
        setField(term33537, term33537.getClass(), "attributes", null);
        setField(term33537, term33537.getClass(), "ownerDocument", null);
        setField(term33537, term33537.getClass(), "firstChild", null);
        setField(term33537, term33537.getClass(), "fNodeListCache", null);
        setField(term33537, term33537.getClass(), "previousSibling", null);
        setField(term33537, term33537.getClass(), "nextSibling", null);
        setField(term33537, term33537.getClass(), "ownerNode", null);
        setShortField(term33537, term33537.getClass(), "flags", (short) 0);
        setField(term33536, term33536.getClass(), "node", term33537);
        setField(term33536, term33536.getClass(), "namespaces", null);
        setField(term33536, term33536.getClass(), "defaultNamespace", null);
        setField(term33536, term33536.getClass(), "id", null);
        setField(term33536, term33536.getClass(), "localNamespaceResolver", null);
        setIntField(term33536, term33536.getClass(), "index", 0);
        setBooleanField(term33536, term33536.getClass(), "attribute", false);
        setField(term33536, term33536.getClass(), "rootNode", null);
        setField(term33536, term33536.getClass(), "namespaceResolver", null);
        setField(term33536, term33536.getClass(), "parent", null);
        setField(term33536, term33536.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term33441, args);
        assertTrue(recursiveEquals(term33441, term33536));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


