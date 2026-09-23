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

public class DOMNodePointer_equals_157064407278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3454;
     Object term3537;
     Object term12518;
     Object term12538;

    public DOMNodePointer_equals_157064407278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3455 = new HashMap();
        HashMap term3489 = new HashMap();
        HashMap term3494 = new HashMap();
        HashMap term3500 = new HashMap();
        HashMap term3505 = new HashMap();
        HashMap term3511 = new HashMap();
        HashMap term3516 = new HashMap();
        HashMap term3525 = new HashMap();
        HashMap term3530 = new HashMap();
        term3454 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3486 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3487 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3536 = newInstance(Class.forName("java.lang.Object"));
        setField(term3454, term3454.getClass(), "node", null);
        setField(term3454, term3454.getClass(), "namespaces", term3455);
        setField(term3454, term3454.getClass(), "defaultNamespace", "vQVyKLdtaz");
        setField(term3454, term3454.getClass(), "id", "OWKQODBLzb");
        setField(term3487, term3487.getClass(), "parent", null);
        setField(term3487, term3487.getClass(), "namespaceMap", null);
        setField(term3487, term3487.getClass(), "reverseMap", null);
        setField(term3487, term3487.getClass(), "pointer", null);
        setBooleanField(term3487, term3487.getClass(), "sealed", false);
        setField(term3486, term3486.getClass(), "parent", term3487);
        setField(term3486, term3486.getClass(), "namespaceMap", term3489);
        setField(term3486, term3486.getClass(), "reverseMap", term3494);
        setField(term3486, term3486.getClass(), "pointer", null);
        setBooleanField(term3486, term3486.getClass(), "sealed", false);
        setField(term3485, term3485.getClass(), "parent", term3486);
        setField(term3485, term3485.getClass(), "namespaceMap", term3500);
        setField(term3485, term3485.getClass(), "reverseMap", term3505);
        setField(term3485, term3485.getClass(), "pointer", null);
        setBooleanField(term3485, term3485.getClass(), "sealed", false);
        setField(term3484, term3484.getClass(), "parent", term3485);
        setField(term3484, term3484.getClass(), "namespaceMap", term3511);
        setField(term3484, term3484.getClass(), "reverseMap", term3516);
        setField(term3484, term3484.getClass(), "pointer", null);
        setBooleanField(term3484, term3484.getClass(), "sealed", false);
        setField(term3454, term3454.getClass(), "localNamespaceResolver", term3484);
        setIntField(term3454, term3454.getClass(), "index", -1179120542);
        setBooleanField(term3454, term3454.getClass(), "attribute", true);
        setField(term3524, term3524.getClass(), "parent", null);
        setField(term3524, term3524.getClass(), "namespaceMap", term3525);
        setField(term3524, term3524.getClass(), "reverseMap", term3530);
        setField(term3524, term3524.getClass(), "pointer", null);
        setBooleanField(term3524, term3524.getClass(), "sealed", false);
        setField(term3454, term3454.getClass(), "namespaceResolver", term3524);
        setField(term3454, term3454.getClass(), "rootNode", term3536);
        setField(term3454, term3454.getClass(), "parent", null);
        setField(term3454, term3454.getClass(), "locale", null);
        term3537 = newInstance(Class.forName("java.lang.Object"));
        HashMap term12519 = new HashMap();
        HashMap term12528 = new HashMap();
        HashMap term12529 = new HashMap();
        HashMap term12530 = new HashMap();
        HashMap term12531 = new HashMap();
        HashMap term12532 = new HashMap();
        HashMap term12533 = new HashMap();
        HashMap term12535 = new HashMap();
        HashMap term12536 = new HashMap();
        term12518 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term12524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12537 = newInstance(Class.forName("java.lang.Object"));
        setField(term12518, term12518.getClass(), "node", null);
        setField(term12518, term12518.getClass(), "namespaces", term12519);
        setField(term12518, term12518.getClass(), "defaultNamespace", "vQVyKLdtaz");
        setField(term12518, term12518.getClass(), "id", "OWKQODBLzb");
        setField(term12527, term12527.getClass(), "parent", null);
        setField(term12527, term12527.getClass(), "namespaceMap", null);
        setField(term12527, term12527.getClass(), "reverseMap", null);
        setField(term12527, term12527.getClass(), "pointer", null);
        setBooleanField(term12527, term12527.getClass(), "sealed", false);
        setField(term12526, term12526.getClass(), "parent", term12527);
        setField(term12526, term12526.getClass(), "namespaceMap", term12528);
        setField(term12526, term12526.getClass(), "reverseMap", term12529);
        setField(term12526, term12526.getClass(), "pointer", null);
        setBooleanField(term12526, term12526.getClass(), "sealed", false);
        setField(term12525, term12525.getClass(), "parent", term12526);
        setField(term12525, term12525.getClass(), "namespaceMap", term12530);
        setField(term12525, term12525.getClass(), "reverseMap", term12531);
        setField(term12525, term12525.getClass(), "pointer", null);
        setBooleanField(term12525, term12525.getClass(), "sealed", false);
        setField(term12524, term12524.getClass(), "parent", term12525);
        setField(term12524, term12524.getClass(), "namespaceMap", term12532);
        setField(term12524, term12524.getClass(), "reverseMap", term12533);
        setField(term12524, term12524.getClass(), "pointer", null);
        setBooleanField(term12524, term12524.getClass(), "sealed", false);
        setField(term12518, term12518.getClass(), "localNamespaceResolver", term12524);
        setIntField(term12518, term12518.getClass(), "index", -1179120542);
        setBooleanField(term12518, term12518.getClass(), "attribute", true);
        setField(term12534, term12534.getClass(), "parent", null);
        setField(term12534, term12534.getClass(), "namespaceMap", term12535);
        setField(term12534, term12534.getClass(), "reverseMap", term12536);
        setField(term12534, term12534.getClass(), "pointer", null);
        setBooleanField(term12534, term12534.getClass(), "sealed", false);
        setField(term12518, term12518.getClass(), "namespaceResolver", term12534);
        setField(term12518, term12518.getClass(), "rootNode", term12537);
        setField(term12518, term12518.getClass(), "parent", null);
        setField(term12518, term12518.getClass(), "locale", null);
        term12538 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3537;
        Object retValue = callMethod(klass, "equals", argTypes, term3454, args);
        assertTrue(recursiveEquals(term3454, term12518));
        assertTrue(recursiveEquals(term3537, term12538));
        assertTrue(recursiveEquals(retValue, false));
    }

};


