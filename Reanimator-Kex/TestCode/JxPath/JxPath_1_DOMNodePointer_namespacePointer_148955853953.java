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
     Object term605;
     Object term5420;
     Object term5334;

    public DOMNodePointer_namespacePointer_148955853953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term606 = new HashMap();
        HashMap term643 = new HashMap();
        HashMap term648 = new HashMap();
        HashMap term654 = new HashMap();
        HashMap term659 = new HashMap();
        HashMap term665 = new HashMap();
        HashMap term670 = new HashMap();
        term605 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term637 = newInstance(Class.forName("java.lang.Object"));
        Object term638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term640 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term605, term605.getClass(), "node", null);
        setField(term605, term605.getClass(), "namespaces", term606);
        setField(term605, term605.getClass(), "defaultNamespace", "aJlieCFVtF");
        setField(term605, term605.getClass(), "id", "ZiaGIbnzTs");
        setIntField(term605, term605.getClass(), "index", -616727354);
        setBooleanField(term605, term605.getClass(), "attribute", true);
        setField(term605, term605.getClass(), "rootNode", term637);
        setField(term641, term641.getClass(), "parent", null);
        setField(term641, term641.getClass(), "namespaceMap", null);
        setField(term641, term641.getClass(), "reverseMap", null);
        setField(term641, term641.getClass(), "pointer", null);
        setField(term641, term641.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term641, term641.getClass(), "sealed", false);
        setField(term640, term640.getClass(), "parent", term641);
        setField(term640, term640.getClass(), "namespaceMap", term643);
        setField(term640, term640.getClass(), "reverseMap", term648);
        setField(term640, term640.getClass(), "pointer", null);
        setField(term640, term640.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term640, term640.getClass(), "sealed", false);
        setField(term639, term639.getClass(), "parent", term640);
        setField(term639, term639.getClass(), "namespaceMap", term654);
        setField(term639, term639.getClass(), "reverseMap", term659);
        setField(term639, term639.getClass(), "pointer", null);
        setField(term639, term639.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term639, term639.getClass(), "sealed", false);
        setField(term638, term638.getClass(), "parent", term639);
        setField(term638, term638.getClass(), "namespaceMap", term665);
        setField(term638, term638.getClass(), "reverseMap", term670);
        setField(term638, term638.getClass(), "pointer", null);
        setField(term638, term638.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term638, term638.getClass(), "sealed", false);
        setField(term605, term605.getClass(), "namespaceResolver", term638);
        setField(term605, term605.getClass(), "parent", null);
        setField(term605, term605.getClass(), "locale", null);
        HashMap term5421 = new HashMap();
        HashMap term5430 = new HashMap();
        HashMap term5431 = new HashMap();
        HashMap term5432 = new HashMap();
        HashMap term5433 = new HashMap();
        term5420 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5426 = newInstance(Class.forName("java.lang.Object"));
        Object term5427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5428 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5420, term5420.getClass(), "node", null);
        setField(term5420, term5420.getClass(), "namespaces", term5421);
        setField(term5420, term5420.getClass(), "defaultNamespace", "aJlieCFVtF");
        setField(term5420, term5420.getClass(), "id", "ZiaGIbnzTs");
        setIntField(term5420, term5420.getClass(), "index", -616727354);
        setBooleanField(term5420, term5420.getClass(), "attribute", true);
        setField(term5420, term5420.getClass(), "rootNode", term5426);
        setField(term5429, term5429.getClass(), "parent", null);
        setField(term5429, term5429.getClass(), "namespaceMap", null);
        setField(term5429, term5429.getClass(), "reverseMap", null);
        setField(term5429, term5429.getClass(), "pointer", null);
        setField(term5429, term5429.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5429, term5429.getClass(), "sealed", false);
        setField(term5428, term5428.getClass(), "parent", term5429);
        setField(term5428, term5428.getClass(), "namespaceMap", term5430);
        setField(term5428, term5428.getClass(), "reverseMap", term5431);
        setField(term5428, term5428.getClass(), "pointer", null);
        setField(term5428, term5428.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5428, term5428.getClass(), "sealed", false);
        setField(term5427, term5427.getClass(), "parent", term5428);
        setField(term5427, term5427.getClass(), "namespaceMap", term5432);
        setField(term5427, term5427.getClass(), "reverseMap", term5433);
        setField(term5427, term5427.getClass(), "pointer", null);
        setField(term5427, term5427.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5427, term5427.getClass(), "sealed", false);
        setField(term5420, term5420.getClass(), "namespaceResolver", term5427);
        setField(term5420, term5420.getClass(), "parent", null);
        setField(term5420, term5420.getClass(), "locale", null);
        HashMap term5350 = new HashMap();
        HashMap term5386 = new HashMap();
        HashMap term5391 = new HashMap();
        HashMap term5397 = new HashMap();
        HashMap term5402 = new HashMap();
        term5334 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        Object term5349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5381 = newInstance(Class.forName("java.lang.Object"));
        Object term5382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5384 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5334, term5334.getClass(), "prefix", "tbcdzjIfER");
        setField(term5334, term5334.getClass(), "namespaceURI", null);
        setIntField(term5334, term5334.getClass(), "index", -2147483648);
        setBooleanField(term5334, term5334.getClass(), "attribute", false);
        setField(term5334, term5334.getClass(), "rootNode", null);
        setField(term5334, term5334.getClass(), "namespaceResolver", null);
        setField(term5349, term5349.getClass(), "node", null);
        setField(term5349, term5349.getClass(), "namespaces", term5350);
        setField(term5349, term5349.getClass(), "defaultNamespace", "aJlieCFVtF");
        setField(term5349, term5349.getClass(), "id", "ZiaGIbnzTs");
        setIntField(term5349, term5349.getClass(), "index", -616727354);
        setBooleanField(term5349, term5349.getClass(), "attribute", true);
        setField(term5349, term5349.getClass(), "rootNode", term5381);
        setField(term5384, term5384.getClass(), "parent", null);
        setField(term5384, term5384.getClass(), "namespaceMap", null);
        setField(term5384, term5384.getClass(), "reverseMap", null);
        setField(term5384, term5384.getClass(), "pointer", null);
        setField(term5384, term5384.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5384, term5384.getClass(), "sealed", false);
        setField(term5383, term5383.getClass(), "parent", term5384);
        setField(term5383, term5383.getClass(), "namespaceMap", term5386);
        setField(term5383, term5383.getClass(), "reverseMap", term5391);
        setField(term5383, term5383.getClass(), "pointer", null);
        setField(term5383, term5383.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5383, term5383.getClass(), "sealed", false);
        setField(term5382, term5382.getClass(), "parent", term5383);
        setField(term5382, term5382.getClass(), "namespaceMap", term5397);
        setField(term5382, term5382.getClass(), "reverseMap", term5402);
        setField(term5382, term5382.getClass(), "pointer", null);
        setField(term5382, term5382.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term5382, term5382.getClass(), "sealed", false);
        setField(term5349, term5349.getClass(), "namespaceResolver", term5382);
        setField(term5349, term5349.getClass(), "parent", null);
        setField(term5349, term5349.getClass(), "locale", null);
        setField(term5334, term5334.getClass(), "parent", term5349);
        setField(term5334, term5334.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        Object retValue = callMethod(klass, "namespacePointer", argTypes, term605, args);
        assertTrue(recursiveEquals(term605, term5420));
        assertTrue(recursiveEquals(retValue, term5334));
    }

};
