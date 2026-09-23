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

public class DOMNodePointer_setValue_96835476258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68871;
     Object term69035;
     Object term69387;
     Object term69389;

    public DOMNodePointer_setValue_96835476258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68953 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setShortField(term68953, term68953.getClass(), "flags", (short) 0);
        setField(term68953, term68953.getClass(), "fNodeListCache", null);
        setField(term68953, term68953.getClass(), "firstChild", null);
        setField(term68871, term68871.getClass(), "node", term68953);
        term69035 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        term69387 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69388 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term69388, term69388.getClass(), "name", null);
        setField(term69388, term69388.getClass(), "attributes", null);
        setField(term69388, term69388.getClass(), "ownerDocument", null);
        setField(term69388, term69388.getClass(), "firstChild", null);
        setField(term69388, term69388.getClass(), "fNodeListCache", null);
        setField(term69388, term69388.getClass(), "previousSibling", null);
        setField(term69388, term69388.getClass(), "nextSibling", null);
        setField(term69388, term69388.getClass(), "ownerNode", null);
        setShortField(term69388, term69388.getClass(), "flags", (short) 0);
        setField(term69387, term69387.getClass(), "node", term69388);
        setField(term69387, term69387.getClass(), "namespaces", null);
        setField(term69387, term69387.getClass(), "defaultNamespace", null);
        setField(term69387, term69387.getClass(), "id", null);
        setIntField(term69387, term69387.getClass(), "index", 0);
        setBooleanField(term69387, term69387.getClass(), "attribute", false);
        setField(term69387, term69387.getClass(), "rootNode", null);
        setField(term69387, term69387.getClass(), "namespaceResolver", null);
        setField(term69387, term69387.getClass(), "parent", null);
        setField(term69387, term69387.getClass(), "locale", null);
        term69389 = newInstance(Class.forName("org.apache.wml.dom.WMLSmallElementImpl"));
        setField(term69389, term69389.getClass(), "name", null);
        setField(term69389, term69389.getClass(), "attributes", null);
        setField(term69389, term69389.getClass(), "ownerDocument", null);
        setField(term69389, term69389.getClass(), "firstChild", null);
        setField(term69389, term69389.getClass(), "fNodeListCache", null);
        setField(term69389, term69389.getClass(), "previousSibling", null);
        setField(term69389, term69389.getClass(), "nextSibling", null);
        setField(term69389, term69389.getClass(), "ownerNode", null);
        setShortField(term69389, term69389.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term69035;
        callMethod(klass, "setValue", argTypes, term68871, args);
        assertTrue(recursiveEquals(term68871, term69387));
        assertTrue(recursiveEquals(term69035, term69389));
    }

};


