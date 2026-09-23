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
     Object term517;
     Object term600;

    public DOMNodePointer_attributeIterator_73551815852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term518 = new HashMap();
        HashMap term552 = new HashMap();
        HashMap term557 = new HashMap();
        HashMap term563 = new HashMap();
        HashMap term568 = new HashMap();
        HashMap term574 = new HashMap();
        HashMap term579 = new HashMap();
        HashMap term588 = new HashMap();
        HashMap term593 = new HashMap();
        term517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term550 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term599 = newInstance(Class.forName("java.lang.Object"));
        setField(term517, term517.getClass(), "node", null);
        setField(term517, term517.getClass(), "namespaces", term518);
        setField(term517, term517.getClass(), "defaultNamespace", "uuaPigETmJ");
        setField(term517, term517.getClass(), "id", "MxlszYVzRf");
        setField(term550, term550.getClass(), "parent", null);
        setField(term550, term550.getClass(), "namespaceMap", null);
        setField(term550, term550.getClass(), "reverseMap", null);
        setField(term550, term550.getClass(), "pointer", null);
        setBooleanField(term550, term550.getClass(), "sealed", false);
        setField(term549, term549.getClass(), "parent", term550);
        setField(term549, term549.getClass(), "namespaceMap", term552);
        setField(term549, term549.getClass(), "reverseMap", term557);
        setField(term549, term549.getClass(), "pointer", null);
        setBooleanField(term549, term549.getClass(), "sealed", false);
        setField(term548, term548.getClass(), "parent", term549);
        setField(term548, term548.getClass(), "namespaceMap", term563);
        setField(term548, term548.getClass(), "reverseMap", term568);
        setField(term548, term548.getClass(), "pointer", null);
        setBooleanField(term548, term548.getClass(), "sealed", false);
        setField(term547, term547.getClass(), "parent", term548);
        setField(term547, term547.getClass(), "namespaceMap", term574);
        setField(term547, term547.getClass(), "reverseMap", term579);
        setField(term547, term547.getClass(), "pointer", null);
        setBooleanField(term547, term547.getClass(), "sealed", false);
        setField(term517, term517.getClass(), "localNamespaceResolver", term547);
        setIntField(term517, term517.getClass(), "index", -1922583790);
        setBooleanField(term517, term517.getClass(), "attribute", true);
        setField(term587, term587.getClass(), "parent", null);
        setField(term587, term587.getClass(), "namespaceMap", term588);
        setField(term587, term587.getClass(), "reverseMap", term593);
        setField(term587, term587.getClass(), "pointer", null);
        setBooleanField(term587, term587.getClass(), "sealed", false);
        setField(term517, term517.getClass(), "namespaceResolver", term587);
        setField(term517, term517.getClass(), "rootNode", term599);
        setField(term517, term517.getClass(), "parent", null);
        setField(term517, term517.getClass(), "locale", null);
        term600 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term600, term600.getClass(), "prefix", "LQFpaHEwXR");
        setField(term600, term600.getClass(), "name", "oVcInYnLWB");
        setField(term600, term600.getClass(), "qualifiedName", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[1];
        args[0] = term600;
        try {
            callMethod(klass, "attributeIterator", argTypes, term517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


