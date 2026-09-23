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

public class DOMNodePointer_asPath_1752315222207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42457;
     Object term46650;

    public DOMNodePointer_asPath_1752315222207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42545 = newInstance(Class.forName("org.apache.wml.dom.WMLTemplateElementImpl"));
        setField(term42457, term42457.getClass(), "id", null);
        setField(term42457, term42457.getClass(), "parent", null);
        setField(term42457, term42457.getClass(), "node", term42545);
        term46650 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term46651 = newInstance(Class.forName("org.apache.wml.dom.WMLTemplateElementImpl"));
        setField(term46651, term46651.getClass(), "name", null);
        setField(term46651, term46651.getClass(), "attributes", null);
        setField(term46651, term46651.getClass(), "ownerDocument", null);
        setField(term46651, term46651.getClass(), "firstChild", null);
        setField(term46651, term46651.getClass(), "fNodeListCache", null);
        setField(term46651, term46651.getClass(), "previousSibling", null);
        setField(term46651, term46651.getClass(), "nextSibling", null);
        setField(term46651, term46651.getClass(), "ownerNode", null);
        setShortField(term46651, term46651.getClass(), "flags", (short) 0);
        setField(term46650, term46650.getClass(), "node", term46651);
        setField(term46650, term46650.getClass(), "namespaces", null);
        setField(term46650, term46650.getClass(), "defaultNamespace", null);
        setField(term46650, term46650.getClass(), "id", null);
        setField(term46650, term46650.getClass(), "localNamespaceResolver", null);
        setIntField(term46650, term46650.getClass(), "index", 0);
        setBooleanField(term46650, term46650.getClass(), "attribute", false);
        setField(term46650, term46650.getClass(), "namespaceResolver", null);
        setField(term46650, term46650.getClass(), "rootNode", null);
        setField(term46650, term46650.getClass(), "parent", null);
        setField(term46650, term46650.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term42457, args);
        assertTrue(recursiveEquals(term42457, term46650));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


