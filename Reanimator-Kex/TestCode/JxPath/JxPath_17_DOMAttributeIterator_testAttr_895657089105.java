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

public class DOMAttributeIterator_testAttr_895657089105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28308;
     Object term28386;
     Object term28760;
     Object term28761;

    public DOMAttributeIterator_testAttr_895657089105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28308 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        term28386 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term28386, term28386.getClass(), "flags", (short) 0);
        setField(term28386, term28386.getClass(), "name", "xmlns");
        setField(term28386, term28386.getClass(), "localName", null);
        term28760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setField(term28760, term28760.getClass(), "parent", null);
        setField(term28760, term28760.getClass(), "name", null);
        setField(term28760, term28760.getClass(), "attributes", null);
        setIntField(term28760, term28760.getClass(), "position", 0);
        term28761 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term28761, term28761.getClass(), "fDeclaration", null);
        setField(term28761, term28761.getClass(), "fTypeDecl", null);
        setBooleanField(term28761, term28761.getClass(), "fSpecified", false);
        setField(term28761, term28761.getClass(), "fNormalizedValue", null);
        setField(term28761, term28761.getClass(), "fMemberType", null);
        setShortField(term28761, term28761.getClass(), "fValidationAttempted", (short) 0);
        setShortField(term28761, term28761.getClass(), "fValidity", (short) 0);
        setField(term28761, term28761.getClass(), "fErrorCodes", null);
        setField(term28761, term28761.getClass(), "fValidationContext", null);
        setField(term28761, term28761.getClass(), "namespaceURI", null);
        setField(term28761, term28761.getClass(), "localName", null);
        setField(term28761, term28761.getClass(), "value", null);
        setField(term28761, term28761.getClass(), "name", "xmlns");
        setField(term28761, term28761.getClass(), "type", null);
        setField(term28761, term28761.getClass(), "ownerNode", null);
        setShortField(term28761, term28761.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term28386;
        Object retValue = callMethod(klass, "testAttr", argTypes, term28308, args);
        assertTrue(recursiveEquals(term28308, term28760));
        assertTrue(recursiveEquals(term28386, term28761));
        assertTrue(recursiveEquals(retValue, false));
    }

};


