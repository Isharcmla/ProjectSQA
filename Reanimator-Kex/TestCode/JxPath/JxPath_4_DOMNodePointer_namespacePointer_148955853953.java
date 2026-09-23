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

public class DOMNodePointer_namespacePointer_148955853953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;
     Object term5517;
     Object term5431;

    public DOMNodePointer_namespacePointer_148955853953() {
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
        setField(term663, term663.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term663, term663.getClass(), "sealed", false);
        setField(term662, term662.getClass(), "parent", term663);
        setField(term662, term662.getClass(), "namespaceMap", term665);
        setField(term662, term662.getClass(), "reverseMap", term670);
        setField(term662, term662.getClass(), "pointer", null);
        setField(term662, term662.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term662, term662.getClass(), "sealed", false);
        setField(term661, term661.getClass(), "parent", term662);
        setField(term661, term661.getClass(), "namespaceMap", term676);
        setField(term661, term661.getClass(), "reverseMap", term681);
        setField(term661, term661.getClass(), "pointer", null);
        setField(term661, term661.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term661, term661.getClass(), "sealed", false);
        setField(term660, term660.getClass(), "parent", term661);
        setField(term660, term660.getClass(), "namespaceMap", term687);
        setField(term660, term660.getClass(), "reverseMap", term692);
        setField(term660, term660.getClass(), "pointer", null);
        setField(term660, term660.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term660, term660.getClass(), "sealed", false);
        setField(term627, term627.getClass(), "namespaceResolver", term660);
        setField(term627, term627.getClass(), "parent", null);
        setField(term627, term627.getClass(), "locale", null);
        HashMap term5518 = new HashMap();
        HashMap term5527 = new HashMap();
        HashMap term5528 = new HashMap();
        HashMap term5529 = new HashMap();
        HashMap term5530 = new HashMap();
        term5517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5523 = newInstance(Class.forName("java.lang.Object"));
        Object term5524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5517, term5517.getClass(), "node", null);
        setField(term5517, term5517.getClass(), "namespaces", term5518);
        setField(term5517, term5517.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5517, term5517.getClass(), "id", "tbcdzjIfER");
        setIntField(term5517, term5517.getClass(), "index", -616727354);
        setBooleanField(term5517, term5517.getClass(), "attribute", true);
        setField(term5517, term5517.getClass(), "rootNode", term5523);
        setField(term5526, term5526.getClass(), "parent", null);
        setField(term5526, term5526.getClass(), "namespaceMap", null);
        setField(term5526, term5526.getClass(), "reverseMap", null);
        setField(term5526, term5526.getClass(), "pointer", null);
        setField(term5526, term5526.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5526, term5526.getClass(), "sealed", false);
        setField(term5525, term5525.getClass(), "parent", term5526);
        setField(term5525, term5525.getClass(), "namespaceMap", term5527);
        setField(term5525, term5525.getClass(), "reverseMap", term5528);
        setField(term5525, term5525.getClass(), "pointer", null);
        setField(term5525, term5525.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5525, term5525.getClass(), "sealed", false);
        setField(term5524, term5524.getClass(), "parent", term5525);
        setField(term5524, term5524.getClass(), "namespaceMap", term5529);
        setField(term5524, term5524.getClass(), "reverseMap", term5530);
        setField(term5524, term5524.getClass(), "pointer", null);
        setField(term5524, term5524.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5524, term5524.getClass(), "sealed", false);
        setField(term5517, term5517.getClass(), "namespaceResolver", term5524);
        setField(term5517, term5517.getClass(), "parent", null);
        setField(term5517, term5517.getClass(), "locale", null);
        HashMap term5447 = new HashMap();
        HashMap term5483 = new HashMap();
        HashMap term5488 = new HashMap();
        HashMap term5494 = new HashMap();
        HashMap term5499 = new HashMap();
        term5431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5446 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5478 = newInstance(Class.forName("java.lang.Object"));
        Object term5479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5431, term5431.getClass(), "prefix", "HyxfbSQYBe");
        setField(term5431, term5431.getClass(), "namespaceURI", null);
        setIntField(term5431, term5431.getClass(), "index", -2147483648);
        setBooleanField(term5431, term5431.getClass(), "attribute", false);
        setField(term5431, term5431.getClass(), "rootNode", null);
        setField(term5431, term5431.getClass(), "namespaceResolver", null);
        setField(term5446, term5446.getClass(), "node", null);
        setField(term5446, term5446.getClass(), "namespaces", term5447);
        setField(term5446, term5446.getClass(), "defaultNamespace", "ZiaGIbnzTs");
        setField(term5446, term5446.getClass(), "id", "tbcdzjIfER");
        setIntField(term5446, term5446.getClass(), "index", -616727354);
        setBooleanField(term5446, term5446.getClass(), "attribute", true);
        setField(term5446, term5446.getClass(), "rootNode", term5478);
        setField(term5481, term5481.getClass(), "parent", null);
        setField(term5481, term5481.getClass(), "namespaceMap", null);
        setField(term5481, term5481.getClass(), "reverseMap", null);
        setField(term5481, term5481.getClass(), "pointer", null);
        setField(term5481, term5481.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5481, term5481.getClass(), "sealed", false);
        setField(term5480, term5480.getClass(), "parent", term5481);
        setField(term5480, term5480.getClass(), "namespaceMap", term5483);
        setField(term5480, term5480.getClass(), "reverseMap", term5488);
        setField(term5480, term5480.getClass(), "pointer", null);
        setField(term5480, term5480.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5480, term5480.getClass(), "sealed", false);
        setField(term5479, term5479.getClass(), "parent", term5480);
        setField(term5479, term5479.getClass(), "namespaceMap", term5494);
        setField(term5479, term5479.getClass(), "reverseMap", term5499);
        setField(term5479, term5479.getClass(), "pointer", null);
        setField(term5479, term5479.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5479, term5479.getClass(), "sealed", false);
        setField(term5446, term5446.getClass(), "namespaceResolver", term5479);
        setField(term5446, term5446.getClass(), "parent", null);
        setField(term5446, term5446.getClass(), "locale", null);
        setField(term5431, term5431.getClass(), "parent", term5446);
        setField(term5431, term5431.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term627, args);
        assertTrue(recursiveEquals(term627, term5517));
        assertTrue(recursiveEquals(retValue, term5431));
    }

};


