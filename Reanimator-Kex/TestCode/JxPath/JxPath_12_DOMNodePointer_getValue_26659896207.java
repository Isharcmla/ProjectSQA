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

public class DOMNodePointer_getValue_26659896207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45543;
     Object term48995;

    public DOMNodePointer_getValue_26659896207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term45625 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setShortField(term45625, term45625.getClass(), "flags", (short) -32768);
        setField(term45625, term45625.getClass(), "data", "preserve                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term45543, term45543.getClass(), "node", term45625);
        term48995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48996 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term48996, term48996.getClass(), "data", "preserve                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term48996, term48996.getClass(), "previousSibling", null);
        setField(term48996, term48996.getClass(), "nextSibling", null);
        setField(term48996, term48996.getClass(), "ownerNode", null);
        setShortField(term48996, term48996.getClass(), "flags", (short) -32768);
        setField(term48995, term48995.getClass(), "node", term48996);
        setField(term48995, term48995.getClass(), "namespaces", null);
        setField(term48995, term48995.getClass(), "defaultNamespace", null);
        setField(term48995, term48995.getClass(), "id", null);
        setIntField(term48995, term48995.getClass(), "index", 0);
        setBooleanField(term48995, term48995.getClass(), "attribute", false);
        setField(term48995, term48995.getClass(), "rootNode", null);
        setField(term48995, term48995.getClass(), "namespaceResolver", null);
        setField(term48995, term48995.getClass(), "parent", null);
        setField(term48995, term48995.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term45543, args);
        assertTrue(recursiveEquals(term45543, term48995));
        assertTrue(recursiveEquals(retValue, "preserve"));
    }

};


