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

public class DOMNodePointer_isLeaf_486659650156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29305;
     Object term30324;

    public DOMNodePointer_isLeaf_486659650156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29305 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term29383 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term29305, term29305.getClass(), "node", term29383);
        term30324 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term30325 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term30325, term30325.getClass(), "fDeclaration", null);
        setField(term30325, term30325.getClass(), "fTypeDecl", null);
        setBooleanField(term30325, term30325.getClass(), "fSpecified", false);
        setField(term30325, term30325.getClass(), "fNormalizedValue", null);
        setField(term30325, term30325.getClass(), "fMemberType", null);
        setShortField(term30325, term30325.getClass(), "fValidationAttempted", (short) 0);
        setShortField(term30325, term30325.getClass(), "fValidity", (short) 0);
        setField(term30325, term30325.getClass(), "fErrorCodes", null);
        setField(term30325, term30325.getClass(), "fValidationContext", null);
        setField(term30325, term30325.getClass(), "namespaceURI", null);
        setField(term30325, term30325.getClass(), "localName", null);
        setField(term30325, term30325.getClass(), "value", null);
        setField(term30325, term30325.getClass(), "name", null);
        setField(term30325, term30325.getClass(), "type", null);
        setField(term30325, term30325.getClass(), "ownerNode", null);
        setShortField(term30325, term30325.getClass(), "flags", (short) 0);
        setField(term30324, term30324.getClass(), "node", term30325);
        setField(term30324, term30324.getClass(), "namespaces", null);
        setField(term30324, term30324.getClass(), "defaultNamespace", null);
        setField(term30324, term30324.getClass(), "id", null);
        setIntField(term30324, term30324.getClass(), "index", 0);
        setBooleanField(term30324, term30324.getClass(), "attribute", false);
        setField(term30324, term30324.getClass(), "rootNode", null);
        setField(term30324, term30324.getClass(), "namespaceResolver", null);
        setField(term30324, term30324.getClass(), "parent", null);
        setField(term30324, term30324.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term29305, args);
        assertTrue(recursiveEquals(term29305, term30324));
        assertTrue(recursiveEquals(retValue, true));
    }

};


