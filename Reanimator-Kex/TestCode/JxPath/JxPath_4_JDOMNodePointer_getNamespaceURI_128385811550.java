package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getNamespaceURI_128385811550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479;
     Object term3777;

    public JDOMNodePointer_getNamespaceURI_128385811550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term501 = new HashMap();
        HashMap term506 = new HashMap();
        HashMap term512 = new HashMap();
        HashMap term517 = new HashMap();
        HashMap term523 = new HashMap();
        HashMap term528 = new HashMap();
        term479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term480 = newInstance(Class.forName("java.lang.Object"));
        Object term495 = newInstance(Class.forName("java.lang.Object"));
        Object term496 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term497 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term498 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term499 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term479, term479.getClass(), "node", term480);
        setField(term479, term479.getClass(), "id", "NRdvgJlhkX");
        setIntField(term479, term479.getClass(), "index", -616727354);
        setBooleanField(term479, term479.getClass(), "attribute", true);
        setField(term479, term479.getClass(), "rootNode", term495);
        setField(term499, term499.getClass(), "parent", null);
        setField(term499, term499.getClass(), "namespaceMap", null);
        setField(term499, term499.getClass(), "reverseMap", null);
        setField(term499, term499.getClass(), "pointer", null);
        setField(term499, term499.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term499, term499.getClass(), "sealed", false);
        setField(term498, term498.getClass(), "parent", term499);
        setField(term498, term498.getClass(), "namespaceMap", term501);
        setField(term498, term498.getClass(), "reverseMap", term506);
        setField(term498, term498.getClass(), "pointer", null);
        setField(term498, term498.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term498, term498.getClass(), "sealed", false);
        setField(term497, term497.getClass(), "parent", term498);
        setField(term497, term497.getClass(), "namespaceMap", term512);
        setField(term497, term497.getClass(), "reverseMap", term517);
        setField(term497, term497.getClass(), "pointer", null);
        setField(term497, term497.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term497, term497.getClass(), "sealed", false);
        setField(term496, term496.getClass(), "parent", term497);
        setField(term496, term496.getClass(), "namespaceMap", term523);
        setField(term496, term496.getClass(), "reverseMap", term528);
        setField(term496, term496.getClass(), "pointer", null);
        setField(term496, term496.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term496, term496.getClass(), "sealed", false);
        setField(term479, term479.getClass(), "namespaceResolver", term496);
        setField(term479, term479.getClass(), "parent", null);
        setField(term479, term479.getClass(), "locale", null);
        HashMap term3786 = new HashMap();
        HashMap term3787 = new HashMap();
        HashMap term3788 = new HashMap();
        HashMap term3789 = new HashMap();
        HashMap term3790 = new HashMap();
        HashMap term3791 = new HashMap();
        term3777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term3778 = newInstance(Class.forName("java.lang.Object"));
        Object term3781 = newInstance(Class.forName("java.lang.Object"));
        Object term3782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3783 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3785 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3777, term3777.getClass(), "node", term3778);
        setField(term3777, term3777.getClass(), "id", "NRdvgJlhkX");
        setIntField(term3777, term3777.getClass(), "index", -616727354);
        setBooleanField(term3777, term3777.getClass(), "attribute", true);
        setField(term3777, term3777.getClass(), "rootNode", term3781);
        setField(term3785, term3785.getClass(), "parent", null);
        setField(term3785, term3785.getClass(), "namespaceMap", null);
        setField(term3785, term3785.getClass(), "reverseMap", null);
        setField(term3785, term3785.getClass(), "pointer", null);
        setField(term3785, term3785.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3785, term3785.getClass(), "sealed", false);
        setField(term3784, term3784.getClass(), "parent", term3785);
        setField(term3784, term3784.getClass(), "namespaceMap", term3786);
        setField(term3784, term3784.getClass(), "reverseMap", term3787);
        setField(term3784, term3784.getClass(), "pointer", null);
        setField(term3784, term3784.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3784, term3784.getClass(), "sealed", false);
        setField(term3783, term3783.getClass(), "parent", term3784);
        setField(term3783, term3783.getClass(), "namespaceMap", term3788);
        setField(term3783, term3783.getClass(), "reverseMap", term3789);
        setField(term3783, term3783.getClass(), "pointer", null);
        setField(term3783, term3783.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3783, term3783.getClass(), "sealed", false);
        setField(term3782, term3782.getClass(), "parent", term3783);
        setField(term3782, term3782.getClass(), "namespaceMap", term3790);
        setField(term3782, term3782.getClass(), "reverseMap", term3791);
        setField(term3782, term3782.getClass(), "pointer", null);
        setField(term3782, term3782.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3782, term3782.getClass(), "sealed", false);
        setField(term3777, term3777.getClass(), "namespaceResolver", term3782);
        setField(term3777, term3777.getClass(), "parent", null);
        setField(term3777, term3777.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term479, args);
        assertTrue(recursiveEquals(term479, term3777));
        assertTrue(recursiveEquals(retValue, null));
    }

};


