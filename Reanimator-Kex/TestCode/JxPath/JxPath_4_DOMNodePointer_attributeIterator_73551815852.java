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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_attributeIterator_73551815852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469;
     Object term540;

    public DOMNodePointer_attributeIterator_73551815852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term470 = new HashMap();
        HashMap term507 = new HashMap();
        HashMap term512 = new HashMap();
        HashMap term518 = new HashMap();
        HashMap term523 = new HashMap();
        HashMap term529 = new HashMap();
        HashMap term534 = new HashMap();
        term469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term501 = newInstance(Class.forName("java.lang.Object"));
        Object term502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term505 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term469, term469.getClass(), "node", null);
        setField(term469, term469.getClass(), "namespaces", term470);
        setField(term469, term469.getClass(), "defaultNamespace", "uuaPigETmJ");
        setField(term469, term469.getClass(), "id", "MxlszYVzRf");
        setIntField(term469, term469.getClass(), "index", -1922583790);
        setBooleanField(term469, term469.getClass(), "attribute", true);
        setField(term469, term469.getClass(), "rootNode", term501);
        setField(term505, term505.getClass(), "parent", null);
        setField(term505, term505.getClass(), "namespaceMap", null);
        setField(term505, term505.getClass(), "reverseMap", null);
        setField(term505, term505.getClass(), "pointer", null);
        setField(term505, term505.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term505, term505.getClass(), "sealed", false);
        setField(term504, term504.getClass(), "parent", term505);
        setField(term504, term504.getClass(), "namespaceMap", term507);
        setField(term504, term504.getClass(), "reverseMap", term512);
        setField(term504, term504.getClass(), "pointer", null);
        setField(term504, term504.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term504, term504.getClass(), "sealed", false);
        setField(term503, term503.getClass(), "parent", term504);
        setField(term503, term503.getClass(), "namespaceMap", term518);
        setField(term503, term503.getClass(), "reverseMap", term523);
        setField(term503, term503.getClass(), "pointer", null);
        setField(term503, term503.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term503, term503.getClass(), "sealed", false);
        setField(term502, term502.getClass(), "parent", term503);
        setField(term502, term502.getClass(), "namespaceMap", term529);
        setField(term502, term502.getClass(), "reverseMap", term534);
        setField(term502, term502.getClass(), "pointer", null);
        setField(term502, term502.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term502, term502.getClass(), "sealed", false);
        setField(term469, term469.getClass(), "namespaceResolver", term502);
        setField(term469, term469.getClass(), "parent", null);
        setField(term469, term469.getClass(), "locale", null);
        term540 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term540, term540.getClass(), "prefix", "LQFpaHEwXR");
        setField(term540, term540.getClass(), "name", "oVcInYnLWB");
        setField(term540, term540.getClass(), "qualifiedName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[1];
        args[0] = term540;
        try {
            callMethod(klass, "attributeIterator", argTypes, term469, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


