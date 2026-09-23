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

public class DOMAttributeIterator_testAttr_895657089135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46299;
     Object term46489;
     Object term50422;
     Object term50426;

    public DOMAttributeIterator_testAttr_895657089135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term46373 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term46373, term46373.getClass(), "name", " ***************************************************************************************************************************************************************************************************************************************************************");
        setField(term46299, term46299.getClass(), "name", term46373);
        term46489 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setShortField(term46489, term46489.getClass(), "flags", (short) -32768);
        setField(term46489, term46489.getClass(), "name", " ***************************************************************************************************************************************************************************************************************************************************************");
        setField(term46489, term46489.getClass(), "localName", null);
        term50422 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term50423 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term50422, term50422.getClass(), "parent", null);
        setField(term50423, term50423.getClass(), "prefix", null);
        setField(term50423, term50423.getClass(), "name", " ***************************************************************************************************************************************************************************************************************************************************************");
        setField(term50423, term50423.getClass(), "qualifiedName", null);
        setField(term50422, term50422.getClass(), "name", term50423);
        setField(term50422, term50422.getClass(), "attributes", null);
        setIntField(term50422, term50422.getClass(), "position", 0);
        term50426 = newInstance(Class.forName("org.apache.xerces.dom.PSVIAttrNSImpl"));
        setField(term50426, term50426.getClass(), "fDeclaration", null);
        setField(term50426, term50426.getClass(), "fTypeDecl", null);
        setBooleanField(term50426, term50426.getClass(), "fSpecified", false);
        setField(term50426, term50426.getClass(), "fNormalizedValue", null);
        setField(term50426, term50426.getClass(), "fMemberType", null);
        setShortField(term50426, term50426.getClass(), "fValidationAttempted", (short) 0);
        setShortField(term50426, term50426.getClass(), "fValidity", (short) 0);
        setField(term50426, term50426.getClass(), "fErrorCodes", null);
        setField(term50426, term50426.getClass(), "fValidationContext", null);
        setField(term50426, term50426.getClass(), "namespaceURI", null);
        setField(term50426, term50426.getClass(), "localName", null);
        setField(term50426, term50426.getClass(), "value", null);
        setField(term50426, term50426.getClass(), "name", " ***************************************************************************************************************************************************************************************************************************************************************");
        setField(term50426, term50426.getClass(), "type", null);
        setField(term50426, term50426.getClass(), "ownerNode", null);
        setShortField(term50426, term50426.getClass(), "flags", (short) -32768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Attr");
        Object[] args = new Object[1];
        args[0] = term46489;
        Object retValue = callMethod(klass, "testAttr", argTypes, term46299, args);
        assertTrue(recursiveEquals(term46299, term50422));
        assertTrue(recursiveEquals(term46489, term50426));
        assertTrue(recursiveEquals(retValue, true));
    }

};


