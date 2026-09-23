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
import java.util.HashMap;

public class DOMAttributeIterator_getAttribute_539782597365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9646960;
     Object term9647528;
     Object term9647602;
     Object term9647757;
     Object term9647762;
     Object term9647767;

    public DOMAttributeIterator_getAttribute_539782597365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9647230 = new HashMap();
        ((HashMap) term9647230).put("", "");
        term9646960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9647084 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term9647182 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9647182, term9647182.getClass(), "namespaceMap", term9647230);
        setField(term9647084, term9647084.getClass(), "namespaceResolver", term9647182);
        setField(term9646960, term9646960.getClass(), "parent", term9647084);
        term9647528 = newInstance(Class.forName("org.apache.html.dom.HTMLLIElementImpl"));
        term9647602 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9647602, term9647602.getClass(), "prefix", "");
        setField(term9647602, term9647602.getClass(), "name", "");
        HashMap term9647760 = new HashMap();
        term9647757 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9647758 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term9647759 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9647758, term9647758.getClass(), "collection", null);
        setField(term9647758, term9647758.getClass(), "valuePointer", null);
        setIntField(term9647758, term9647758.getClass(), "index", 0);
        setBooleanField(term9647758, term9647758.getClass(), "attribute", false);
        setField(term9647758, term9647758.getClass(), "rootNode", null);
        setField(term9647759, term9647759.getClass(), "parent", null);
        setField(term9647759, term9647759.getClass(), "namespaceMap", term9647760);
        setField(term9647759, term9647759.getClass(), "reverseMap", null);
        setField(term9647759, term9647759.getClass(), "pointer", null);
        setBooleanField(term9647759, term9647759.getClass(), "sealed", false);
        setField(term9647758, term9647758.getClass(), "namespaceResolver", term9647759);
        setField(term9647758, term9647758.getClass(), "parent", null);
        setField(term9647758, term9647758.getClass(), "locale", null);
        setField(term9647757, term9647757.getClass(), "parent", term9647758);
        setField(term9647757, term9647757.getClass(), "name", null);
        setField(term9647757, term9647757.getClass(), "attributes", null);
        setIntField(term9647757, term9647757.getClass(), "position", 0);
        term9647762 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9647762, term9647762.getClass(), "prefix", "");
        setField(term9647762, term9647762.getClass(), "name", "");
        setField(term9647762, term9647762.getClass(), "qualifiedName", null);
        term9647767 = newInstance(Class.forName("org.apache.html.dom.HTMLLIElementImpl"));
        Object term9647768 = newInstance(Class.forName("org.apache.xerces.dom.AttributeMap"));
        setField(term9647767, term9647767.getClass(), "name", null);
        setShortField(term9647768, term9647768.getClass(), "flags", (short) 0);
        setField(term9647768, term9647768.getClass(), "nodes", null);
        setField(term9647768, term9647768.getClass(), "ownerNode", term9647767);
        setField(term9647767, term9647767.getClass(), "attributes", term9647768);
        setField(term9647767, term9647767.getClass(), "ownerDocument", null);
        setField(term9647767, term9647767.getClass(), "firstChild", null);
        setField(term9647767, term9647767.getClass(), "fNodeListCache", null);
        setField(term9647767, term9647767.getClass(), "previousSibling", null);
        setField(term9647767, term9647767.getClass(), "nextSibling", null);
        setField(term9647767, term9647767.getClass(), "ownerNode", null);
        setShortField(term9647767, term9647767.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9647528;
        args[1] = term9647602;
        Object retValue = callMethod(klass, "getAttribute", argTypes, term9646960, args);
        assertTrue(recursiveEquals(term9646960, term9647757));
        assertTrue(recursiveEquals(term9647528, term9647762));
        assertTrue(recursiveEquals(term9647602, term9647767));
        assertTrue(recursiveEquals(retValue, null));
    }

};


