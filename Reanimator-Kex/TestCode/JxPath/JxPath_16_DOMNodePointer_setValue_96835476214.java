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

public class DOMNodePointer_setValue_96835476214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43736;
     Object term43900;
     Object term46989;
     Object term46991;

    public DOMNodePointer_setValue_96835476214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43736 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term43818 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setShortField(term43818, term43818.getClass(), "flags", (short) 0);
        setField(term43818, term43818.getClass(), "fNodeListCache", null);
        setField(term43818, term43818.getClass(), "firstChild", null);
        setField(term43736, term43736.getClass(), "node", term43818);
        term43900 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        term46989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term46990 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term46990, term46990.getClass(), "name", null);
        setField(term46990, term46990.getClass(), "attributes", null);
        setField(term46990, term46990.getClass(), "ownerDocument", null);
        setField(term46990, term46990.getClass(), "firstChild", null);
        setField(term46990, term46990.getClass(), "fNodeListCache", null);
        setField(term46990, term46990.getClass(), "previousSibling", null);
        setField(term46990, term46990.getClass(), "nextSibling", null);
        setField(term46990, term46990.getClass(), "ownerNode", null);
        setShortField(term46990, term46990.getClass(), "flags", (short) 0);
        setField(term46989, term46989.getClass(), "node", term46990);
        setField(term46989, term46989.getClass(), "namespaces", null);
        setField(term46989, term46989.getClass(), "defaultNamespace", null);
        setField(term46989, term46989.getClass(), "id", null);
        setField(term46989, term46989.getClass(), "localNamespaceResolver", null);
        setIntField(term46989, term46989.getClass(), "index", 0);
        setBooleanField(term46989, term46989.getClass(), "attribute", false);
        setField(term46989, term46989.getClass(), "rootNode", null);
        setField(term46989, term46989.getClass(), "namespaceResolver", null);
        setField(term46989, term46989.getClass(), "parent", null);
        setField(term46989, term46989.getClass(), "locale", null);
        term46991 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term46991, term46991.getClass(), "name", null);
        setField(term46991, term46991.getClass(), "attributes", null);
        setField(term46991, term46991.getClass(), "ownerDocument", null);
        setField(term46991, term46991.getClass(), "firstChild", null);
        setField(term46991, term46991.getClass(), "fNodeListCache", null);
        setField(term46991, term46991.getClass(), "previousSibling", null);
        setField(term46991, term46991.getClass(), "nextSibling", null);
        setField(term46991, term46991.getClass(), "ownerNode", null);
        setShortField(term46991, term46991.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term43900;
        callMethod(klass, "setValue", argTypes, term43736, args);
        assertTrue(recursiveEquals(term43736, term46989));
        assertTrue(recursiveEquals(term43900, term46991));
    }

};


