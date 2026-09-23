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

public class DOMAttributeIterator_testAttr_895657089115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32916;
     Object term33106;
     Object term33468;
     Object term33472;

    public DOMAttributeIterator_testAttr_895657089115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32916 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term32990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term32990, term32990.getClass(), "name", "");
        setField(term32916, term32916.getClass(), "name", term32990);
        term33106 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term33106, term33106.getClass(), "flags", (short) 0);
        setField(term33106, term33106.getClass(), "name", " ");
        setField(term33106, term33106.getClass(), "localName", null);
        term33468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term33469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term33468, term33468.getClass(), "parent", null);
        setField(term33469, term33469.getClass(), "prefix", null);
        setField(term33469, term33469.getClass(), "name", "");
        setField(term33469, term33469.getClass(), "qualifiedName", null);
        setField(term33468, term33468.getClass(), "name", term33469);
        setField(term33468, term33468.getClass(), "attributes", null);
        setIntField(term33468, term33468.getClass(), "position", 0);
        term33472 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term33472, term33472.getClass(), "fDeclaration", null);
        setField(term33472, term33472.getClass(), "fTypeDecl", null);
        setBooleanField(term33472, term33472.getClass(), "fSpecified", false);
        setField(term33472, term33472.getClass(), "fNormalizedValue", null);
        setField(term33472, term33472.getClass(), "fMemberType", null);
        setShortField(term33472, term33472.getClass(), "fValidationAttempted", (short) 0);
        setShortField(term33472, term33472.getClass(), "fValidity", (short) 0);
        setField(term33472, term33472.getClass(), "fErrorCodes", null);
        setField(term33472, term33472.getClass(), "fValidationContext", null);
        setField(term33472, term33472.getClass(), "namespaceURI", null);
        setField(term33472, term33472.getClass(), "localName", null);
        setField(term33472, term33472.getClass(), "value", null);
        setField(term33472, term33472.getClass(), "name", " ");
        setField(term33472, term33472.getClass(), "type", null);
        setField(term33472, term33472.getClass(), "ownerNode", null);
        setShortField(term33472, term33472.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term33106;
        Object retValue = callMethod(klass, "testAttr", argTypes, term32916, args);
        assertTrue(recursiveEquals(term32916, term33468));
        assertTrue(recursiveEquals(term33106, term33472));
        assertTrue(recursiveEquals(retValue, false));
    }

};


