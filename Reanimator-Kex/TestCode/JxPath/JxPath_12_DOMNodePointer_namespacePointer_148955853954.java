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
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_namespacePointer_148955853954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;
     Object term5539;
     Object term5453;

    public DOMNodePointer_namespacePointer_148955853954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term628 = new HashMap();
        HashMap term665 = new HashMap();
        HashMap term670 = new HashMap();
        HashMap term676 = new HashMap();
        HashMap term681 = new HashMap();
        HashMap term687 = new HashMap();
        HashMap term692 = new HashMap();
        term627 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term659 = newInstance(Class.forName("java.lang.Object"));
        Object term660 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term661 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term663 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term627, term627.getClass(), "node", null);
        setField(term627, term627.getClass(), "namespaces", term628);
        setField(term627, term627.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term627, term627.getClass(), "id", "tbcdzjIfER");
        setIntField(term627, term627.getClass(), "index", -616727354);
        setBooleanField(term627, term627.getClass(), "attribute", true);
        setField(term627, term627.getClass(), "rootNode", term659);
        setField(term663, term663.getClass(), "parent", null);
        setField(term663, term663.getClass(), "namespaceMap", null);
        setField(term663, term663.getClass(), "reverseMap", null);
        setField(term663, term663.getClass(), "pointer", null);
        setBooleanField(term663, term663.getClass(), "sealed", false);
        setField(term662, term662.getClass(), "parent", term663);
        setField(term662, term662.getClass(), "namespaceMap", term665);
        setField(term662, term662.getClass(), "reverseMap", term670);
        setField(term662, term662.getClass(), "pointer", null);
        setBooleanField(term662, term662.getClass(), "sealed", false);
        setField(term661, term661.getClass(), "parent", term662);
        setField(term661, term661.getClass(), "namespaceMap", term676);
        setField(term661, term661.getClass(), "reverseMap", term681);
        setField(term661, term661.getClass(), "pointer", null);
        setBooleanField(term661, term661.getClass(), "sealed", false);
        setField(term660, term660.getClass(), "parent", term661);
        setField(term660, term660.getClass(), "namespaceMap", term687);
        setField(term660, term660.getClass(), "reverseMap", term692);
        setField(term660, term660.getClass(), "pointer", null);
        setBooleanField(term660, term660.getClass(), "sealed", false);
        setField(term627, term627.getClass(), "namespaceResolver", term660);
        setField(term627, term627.getClass(), "parent", null);
        setField(term627, term627.getClass(), "locale", null);
        HashMap term5540 = new HashMap();
        HashMap term5549 = new HashMap();
        HashMap term5550 = new HashMap();
        HashMap term5551 = new HashMap();
        HashMap term5552 = new HashMap();
        term5539 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5545 = newInstance(Class.forName("java.lang.Object"));
        Object term5546 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5547 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5539, term5539.getClass(), "node", null);
        setField(term5539, term5539.getClass(), "namespaces", term5540);
        setField(term5539, term5539.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5539, term5539.getClass(), "id", "tbcdzjIfER");
        setIntField(term5539, term5539.getClass(), "index", -616727354);
        setBooleanField(term5539, term5539.getClass(), "attribute", true);
        setField(term5539, term5539.getClass(), "rootNode", term5545);
        setField(term5548, term5548.getClass(), "parent", null);
        setField(term5548, term5548.getClass(), "namespaceMap", null);
        setField(term5548, term5548.getClass(), "reverseMap", null);
        setField(term5548, term5548.getClass(), "pointer", null);
        setBooleanField(term5548, term5548.getClass(), "sealed", false);
        setField(term5547, term5547.getClass(), "parent", term5548);
        setField(term5547, term5547.getClass(), "namespaceMap", term5549);
        setField(term5547, term5547.getClass(), "reverseMap", term5550);
        setField(term5547, term5547.getClass(), "pointer", null);
        setBooleanField(term5547, term5547.getClass(), "sealed", false);
        setField(term5546, term5546.getClass(), "parent", term5547);
        setField(term5546, term5546.getClass(), "namespaceMap", term5551);
        setField(term5546, term5546.getClass(), "reverseMap", term5552);
        setField(term5546, term5546.getClass(), "pointer", null);
        setBooleanField(term5546, term5546.getClass(), "sealed", false);
        setField(term5539, term5539.getClass(), "namespaceResolver", term5546);
        setField(term5539, term5539.getClass(), "parent", null);
        setField(term5539, term5539.getClass(), "locale", null);
        HashMap term5469 = new HashMap();
        HashMap term5505 = new HashMap();
        HashMap term5510 = new HashMap();
        HashMap term5516 = new HashMap();
        HashMap term5521 = new HashMap();
        term5453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5500 = newInstance(Class.forName("java.lang.Object"));
        Object term5501 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5502 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5503 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5453, term5453.getClass(), "prefix", "HyxfbSQYBe");
        setField(term5453, term5453.getClass(), "namespaceURI", null);
        setIntField(term5453, term5453.getClass(), "index", -2147483648);
        setBooleanField(term5453, term5453.getClass(), "attribute", false);
        setField(term5453, term5453.getClass(), "rootNode", null);
        setField(term5453, term5453.getClass(), "namespaceResolver", null);
        setField(term5468, term5468.getClass(), "node", null);
        setField(term5468, term5468.getClass(), "namespaces", term5469);
        setField(term5468, term5468.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5468, term5468.getClass(), "id", "tbcdzjIfER");
        setIntField(term5468, term5468.getClass(), "index", -616727354);
        setBooleanField(term5468, term5468.getClass(), "attribute", true);
        setField(term5468, term5468.getClass(), "rootNode", term5500);
        setField(term5503, term5503.getClass(), "parent", null);
        setField(term5503, term5503.getClass(), "namespaceMap", null);
        setField(term5503, term5503.getClass(), "reverseMap", null);
        setField(term5503, term5503.getClass(), "pointer", null);
        setBooleanField(term5503, term5503.getClass(), "sealed", false);
        setField(term5502, term5502.getClass(), "parent", term5503);
        setField(term5502, term5502.getClass(), "namespaceMap", term5505);
        setField(term5502, term5502.getClass(), "reverseMap", term5510);
        setField(term5502, term5502.getClass(), "pointer", null);
        setBooleanField(term5502, term5502.getClass(), "sealed", false);
        setField(term5501, term5501.getClass(), "parent", term5502);
        setField(term5501, term5501.getClass(), "namespaceMap", term5516);
        setField(term5501, term5501.getClass(), "reverseMap", term5521);
        setField(term5501, term5501.getClass(), "pointer", null);
        setBooleanField(term5501, term5501.getClass(), "sealed", false);
        setField(term5468, term5468.getClass(), "namespaceResolver", term5501);
        setField(term5468, term5468.getClass(), "parent", null);
        setField(term5468, term5468.getClass(), "locale", null);
        setField(term5453, term5453.getClass(), "parent", term5468);
        setField(term5453, term5453.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term627, args);
        assertTrue(recursiveEquals(term627, term5539));
        assertTrue(recursiveEquals(retValue, term5453));
    }

};


