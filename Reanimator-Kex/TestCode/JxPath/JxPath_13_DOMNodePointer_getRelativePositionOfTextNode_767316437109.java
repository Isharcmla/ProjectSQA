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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15509;
     Object term17819;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15509 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term15593 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setField(term15509, term15509.getClass(), "node", term15593);
        term17819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term17820 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setField(term17820, term17820.getClass(), "name", null);
        setField(term17820, term17820.getClass(), "attributes", null);
        setField(term17820, term17820.getClass(), "ownerDocument", null);
        setField(term17820, term17820.getClass(), "firstChild", null);
        setField(term17820, term17820.getClass(), "fNodeListCache", null);
        setField(term17820, term17820.getClass(), "previousSibling", null);
        setField(term17820, term17820.getClass(), "nextSibling", null);
        setField(term17820, term17820.getClass(), "ownerNode", null);
        setShortField(term17820, term17820.getClass(), "flags", (short) 0);
        setField(term17819, term17819.getClass(), "node", term17820);
        setField(term17819, term17819.getClass(), "namespaces", null);
        setField(term17819, term17819.getClass(), "defaultNamespace", null);
        setField(term17819, term17819.getClass(), "id", null);
        setIntField(term17819, term17819.getClass(), "index", 0);
        setBooleanField(term17819, term17819.getClass(), "attribute", false);
        setField(term17819, term17819.getClass(), "rootNode", null);
        setField(term17819, term17819.getClass(), "namespaceResolver", null);
        setField(term17819, term17819.getClass(), "parent", null);
        setField(term17819, term17819.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term15509, args);
        assertTrue(recursiveEquals(term15509, term17819));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


