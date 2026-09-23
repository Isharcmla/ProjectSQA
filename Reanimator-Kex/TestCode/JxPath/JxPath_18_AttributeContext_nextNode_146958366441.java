package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;

public class AttributeContext_nextNode_146958366441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13567;
     Object term14177;

    public AttributeContext_nextNode_146958366441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13567 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term13673 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term13747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term13853 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term13981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term14107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setIntField(term13567, term13567.getClass(), "position", 0);
        setBooleanField(term13567, term13567.getClass(), "setStarted", false);
        setField(term13673, term13673.getClass(), "qname", term13747);
        setField(term13567, term13567.getClass(), "nodeTest", term13673);
        setField(term13981, term13981.getClass(), "valuePointer", term14107);
        setField(term13853, term13853.getClass(), "currentNodePointer", term13981);
        setField(term13567, term13567.getClass(), "parentContext", term13853);
        term14177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term14178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        Object term14179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        Object term14180 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term14181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term14182 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setField(term14179, term14179.getClass(), "prefix", null);
        setField(term14179, term14179.getClass(), "name", null);
        setField(term14179, term14179.getClass(), "qualifiedName", null);
        setField(term14178, term14178.getClass(), "qname", term14179);
        setField(term14178, term14178.getClass(), "namespaceURI", null);
        setField(term14177, term14177.getClass(), "nodeTest", term14178);
        setBooleanField(term14177, term14177.getClass(), "setStarted", true);
        setField(term14177, term14177.getClass(), "iterator", null);
        setField(term14177, term14177.getClass(), "currentNodePointer", null);
        setField(term14180, term14180.getClass(), "nodeTest", null);
        setBooleanField(term14180, term14180.getClass(), "setStarted", false);
        setField(term14180, term14180.getClass(), "iterator", null);
        setField(term14181, term14181.getClass(), "container", null);
        setField(term14182, term14182.getClass(), "prefix", null);
        setField(term14182, term14182.getClass(), "namespaceURI", null);
        setIntField(term14182, term14182.getClass(), "index", 0);
        setBooleanField(term14182, term14182.getClass(), "attribute", false);
        setField(term14182, term14182.getClass(), "rootNode", null);
        setField(term14182, term14182.getClass(), "namespaceResolver", null);
        setField(term14182, term14182.getClass(), "parent", null);
        setField(term14182, term14182.getClass(), "locale", null);
        setField(term14181, term14181.getClass(), "valuePointer", term14182);
        setIntField(term14181, term14181.getClass(), "index", 0);
        setBooleanField(term14181, term14181.getClass(), "attribute", false);
        setField(term14181, term14181.getClass(), "rootNode", null);
        setField(term14181, term14181.getClass(), "namespaceResolver", null);
        setField(term14181, term14181.getClass(), "parent", null);
        setField(term14181, term14181.getClass(), "locale", null);
        setField(term14180, term14180.getClass(), "currentNodePointer", term14181);
        setField(term14180, term14180.getClass(), "parentContext", null);
        setField(term14180, term14180.getClass(), "rootContext", null);
        setIntField(term14180, term14180.getClass(), "position", 0);
        setBooleanField(term14180, term14180.getClass(), "startedSetIteration", false);
        setBooleanField(term14180, term14180.getClass(), "done", false);
        setBooleanField(term14180, term14180.getClass(), "hasPerformedIteratorStep", false);
        setField(term14180, term14180.getClass(), "pointerIterator", null);
        setField(term14177, term14177.getClass(), "parentContext", term14180);
        setField(term14177, term14177.getClass(), "rootContext", null);
        setIntField(term14177, term14177.getClass(), "position", 1);
        setBooleanField(term14177, term14177.getClass(), "startedSetIteration", false);
        setBooleanField(term14177, term14177.getClass(), "done", false);
        setBooleanField(term14177, term14177.getClass(), "hasPerformedIteratorStep", false);
        setField(term14177, term14177.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextNode", argTypes, term13567, args);
        assertTrue(recursiveEquals(term13567, term14177));
        assertTrue(recursiveEquals(retValue, false));
    }

};


