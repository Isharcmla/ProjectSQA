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

public class DOMAttributeIterator_testAttr_895657089127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43154;
     Object term43344;
     Object term43439;
     Object term43443;

    public DOMAttributeIterator_testAttr_895657089127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term43228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term43228, term43228.getClass(), "name", "*");
        setField(term43154, term43154.getClass(), "name", term43228);
        term43344 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term43344, term43344.getClass(), "flags", (short) 0);
        setField(term43344, term43344.getClass(), "name", "");
        setField(term43344, term43344.getClass(), "localName", null);
        term43439 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term43440 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term43439, term43439.getClass(), "parent", null);
        setField(term43440, term43440.getClass(), "prefix", null);
        setField(term43440, term43440.getClass(), "name", "*");
        setField(term43440, term43440.getClass(), "qualifiedName", null);
        setField(term43439, term43439.getClass(), "name", term43440);
        setField(term43439, term43439.getClass(), "attributes", null);
        setIntField(term43439, term43439.getClass(), "position", 0);
        term43443 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term43443, term43443.getClass(), "fDeclaration", null);
        setField(term43443, term43443.getClass(), "fTypeDecl", null);
        setBooleanField(term43443, term43443.getClass(), "fSpecified", false);
        setField(term43443, term43443.getClass(), "fNormalizedValue", null);
        setField(term43443, term43443.getClass(), "fMemberType", null);
        setShortField(term43443, term43443.getClass(), "fValidationAttempted", (short) 0);
        setShortField(term43443, term43443.getClass(), "fValidity", (short) 0);
        setField(term43443, term43443.getClass(), "fErrorCodes", null);
        setField(term43443, term43443.getClass(), "fValidationContext", null);
        setField(term43443, term43443.getClass(), "namespaceURI", null);
        setField(term43443, term43443.getClass(), "localName", null);
        setField(term43443, term43443.getClass(), "value", null);
        setField(term43443, term43443.getClass(), "name", "");
        setField(term43443, term43443.getClass(), "type", null);
        setField(term43443, term43443.getClass(), "ownerNode", null);
        setShortField(term43443, term43443.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term43344;
        Object retValue = callMethod(klass, "testAttr", argTypes, term43154, args);
        assertTrue(recursiveEquals(term43154, term43439));
        assertTrue(recursiveEquals(term43344, term43443));
        assertTrue(recursiveEquals(retValue, true));
    }

};


