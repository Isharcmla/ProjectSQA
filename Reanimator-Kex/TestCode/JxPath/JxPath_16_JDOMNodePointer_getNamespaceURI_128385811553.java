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

public class JDOMNodePointer_getNamespaceURI_128385811553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730;
     Object term5453;

    public JDOMNodePointer_getNamespaceURI_128385811553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term749 = new HashMap();
        HashMap term754 = new HashMap();
        HashMap term760 = new HashMap();
        HashMap term765 = new HashMap();
        HashMap term771 = new HashMap();
        HashMap term776 = new HashMap();
        HashMap term788 = new HashMap();
        HashMap term794 = new HashMap();
        HashMap term799 = new HashMap();
        HashMap term805 = new HashMap();
        HashMap term810 = new HashMap();
        term730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term731 = newInstance(Class.forName("java.lang.Object"));
        Object term744 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term745 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term784 = newInstance(Class.forName("java.lang.Object"));
        Object term785 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term786 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term787 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term730, term730.getClass(), "node", term731);
        setField(term730, term730.getClass(), "id", "uuaPigETmJ");
        setField(term747, term747.getClass(), "parent", null);
        setField(term747, term747.getClass(), "namespaceMap", null);
        setField(term747, term747.getClass(), "reverseMap", null);
        setField(term747, term747.getClass(), "pointer", null);
        setBooleanField(term747, term747.getClass(), "sealed", false);
        setField(term746, term746.getClass(), "parent", term747);
        setField(term746, term746.getClass(), "namespaceMap", term749);
        setField(term746, term746.getClass(), "reverseMap", term754);
        setField(term746, term746.getClass(), "pointer", null);
        setBooleanField(term746, term746.getClass(), "sealed", false);
        setField(term745, term745.getClass(), "parent", term746);
        setField(term745, term745.getClass(), "namespaceMap", term760);
        setField(term745, term745.getClass(), "reverseMap", term765);
        setField(term745, term745.getClass(), "pointer", null);
        setBooleanField(term745, term745.getClass(), "sealed", false);
        setField(term744, term744.getClass(), "parent", term745);
        setField(term744, term744.getClass(), "namespaceMap", term771);
        setField(term744, term744.getClass(), "reverseMap", term776);
        setField(term744, term744.getClass(), "pointer", null);
        setBooleanField(term744, term744.getClass(), "sealed", false);
        setField(term730, term730.getClass(), "localNamespaceResolver", term744);
        setIntField(term730, term730.getClass(), "index", -1955890973);
        setBooleanField(term730, term730.getClass(), "attribute", true);
        setField(term730, term730.getClass(), "rootNode", term784);
        setField(term787, term787.getClass(), "parent", null);
        setField(term787, term787.getClass(), "namespaceMap", term788);
        setField(term787, term787.getClass(), "reverseMap", null);
        setField(term787, term787.getClass(), "pointer", null);
        setBooleanField(term787, term787.getClass(), "sealed", false);
        setField(term786, term786.getClass(), "parent", term787);
        setField(term786, term786.getClass(), "namespaceMap", term794);
        setField(term786, term786.getClass(), "reverseMap", term799);
        setField(term786, term786.getClass(), "pointer", null);
        setBooleanField(term786, term786.getClass(), "sealed", false);
        setField(term785, term785.getClass(), "parent", term786);
        setField(term785, term785.getClass(), "namespaceMap", term805);
        setField(term785, term785.getClass(), "reverseMap", term810);
        setField(term785, term785.getClass(), "pointer", null);
        setBooleanField(term785, term785.getClass(), "sealed", false);
        setField(term730, term730.getClass(), "namespaceResolver", term785);
        setField(term730, term730.getClass(), "parent", null);
        setField(term730, term730.getClass(), "locale", null);
        HashMap term5461 = new HashMap();
        HashMap term5462 = new HashMap();
        HashMap term5463 = new HashMap();
        HashMap term5464 = new HashMap();
        HashMap term5465 = new HashMap();
        HashMap term5466 = new HashMap();
        HashMap term5471 = new HashMap();
        HashMap term5472 = new HashMap();
        HashMap term5473 = new HashMap();
        HashMap term5474 = new HashMap();
        HashMap term5475 = new HashMap();
        term5453 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term5454 = newInstance(Class.forName("java.lang.Object"));
        Object term5457 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5467 = newInstance(Class.forName("java.lang.Object"));
        Object term5468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5469 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5470 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5453, term5453.getClass(), "node", term5454);
        setField(term5453, term5453.getClass(), "id", "uuaPigETmJ");
        setField(term5460, term5460.getClass(), "parent", null);
        setField(term5460, term5460.getClass(), "namespaceMap", null);
        setField(term5460, term5460.getClass(), "reverseMap", null);
        setField(term5460, term5460.getClass(), "pointer", null);
        setBooleanField(term5460, term5460.getClass(), "sealed", false);
        setField(term5459, term5459.getClass(), "parent", term5460);
        setField(term5459, term5459.getClass(), "namespaceMap", term5461);
        setField(term5459, term5459.getClass(), "reverseMap", term5462);
        setField(term5459, term5459.getClass(), "pointer", null);
        setBooleanField(term5459, term5459.getClass(), "sealed", false);
        setField(term5458, term5458.getClass(), "parent", term5459);
        setField(term5458, term5458.getClass(), "namespaceMap", term5463);
        setField(term5458, term5458.getClass(), "reverseMap", term5464);
        setField(term5458, term5458.getClass(), "pointer", null);
        setBooleanField(term5458, term5458.getClass(), "sealed", false);
        setField(term5457, term5457.getClass(), "parent", term5458);
        setField(term5457, term5457.getClass(), "namespaceMap", term5465);
        setField(term5457, term5457.getClass(), "reverseMap", term5466);
        setField(term5457, term5457.getClass(), "pointer", null);
        setBooleanField(term5457, term5457.getClass(), "sealed", false);
        setField(term5453, term5453.getClass(), "localNamespaceResolver", term5457);
        setIntField(term5453, term5453.getClass(), "index", -1955890973);
        setBooleanField(term5453, term5453.getClass(), "attribute", true);
        setField(term5453, term5453.getClass(), "rootNode", term5467);
        setField(term5470, term5470.getClass(), "parent", null);
        setField(term5470, term5470.getClass(), "namespaceMap", term5471);
        setField(term5470, term5470.getClass(), "reverseMap", null);
        setField(term5470, term5470.getClass(), "pointer", null);
        setBooleanField(term5470, term5470.getClass(), "sealed", false);
        setField(term5469, term5469.getClass(), "parent", term5470);
        setField(term5469, term5469.getClass(), "namespaceMap", term5472);
        setField(term5469, term5469.getClass(), "reverseMap", term5473);
        setField(term5469, term5469.getClass(), "pointer", null);
        setBooleanField(term5469, term5469.getClass(), "sealed", false);
        setField(term5468, term5468.getClass(), "parent", term5469);
        setField(term5468, term5468.getClass(), "namespaceMap", term5474);
        setField(term5468, term5468.getClass(), "reverseMap", term5475);
        setField(term5468, term5468.getClass(), "pointer", null);
        setBooleanField(term5468, term5468.getClass(), "sealed", false);
        setField(term5453, term5453.getClass(), "namespaceResolver", term5468);
        setField(term5453, term5453.getClass(), "parent", null);
        setField(term5453, term5453.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term730, args);
        assertTrue(recursiveEquals(term730, term5453));
        assertTrue(recursiveEquals(retValue, null));
    }

};


