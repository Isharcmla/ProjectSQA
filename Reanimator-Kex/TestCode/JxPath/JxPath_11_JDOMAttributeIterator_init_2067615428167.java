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

public class JDOMAttributeIterator_init_2067615428167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85422;
     Object term86728;
     Object term86735;

    public JDOMAttributeIterator_init_2067615428167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term85280 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        setIntField(term85158, term85158.getClass(), "position", 0);
        setField(term85158, term85158.getClass(), "parent", term85280);
        term85422 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term85548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term85658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        Object[] term84718 = (Object[]) newArray("java.lang.String", 0);
        setField(term85658, term85658.getClass(), "parent", null);
        setField(term85548, term85548.getClass(), "parent", term85658);
        setField(term85422, term85422.getClass(), "parent", term85548);
        setField(term85422, term85422.getClass(), "name", null);
        setField(term85422, term85422.getClass(), "names", term84718);
        setIntField(term85422, term85422.getClass(), "propertyIndex", 0);
        Object[] term85023 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term85794 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term85912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term86034 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term86176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term86316 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term86450 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term85023, 0, term85794);
        setElement(term85023, 1, term85912);
        setElement(term85023, 2, term86034);
        setElement(term85023, 3, term86176);
        setElement(term85023, 4, term86316);
        setElement(term85023, 5, term86450);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term85023);
        term86728 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term86729 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term86732 = (Object[]) newArray("java.lang.String", 0);
        Object term86733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term86734 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term86729, term86729.getClass(), "dynaBean", null);
        setField(term86729, term86729.getClass(), "name", "*");
        setField(term86729, term86729.getClass(), "names", term86732);
        setIntField(term86729, term86729.getClass(), "propertyIndex", 0);
        setField(term86729, term86729.getClass(), "bean", null);
        setField(term86729, term86729.getClass(), "value", null);
        setIntField(term86729, term86729.getClass(), "index", 0);
        setBooleanField(term86729, term86729.getClass(), "attribute", false);
        setField(term86729, term86729.getClass(), "rootNode", null);
        setField(term86729, term86729.getClass(), "namespaceResolver", null);
        setField(term86733, term86733.getClass(), "attr", null);
        setIntField(term86733, term86733.getClass(), "index", 0);
        setBooleanField(term86733, term86733.getClass(), "attribute", false);
        setField(term86733, term86733.getClass(), "rootNode", null);
        setField(term86733, term86733.getClass(), "namespaceResolver", null);
        setField(term86734, term86734.getClass(), "this$0", null);
        setField(term86734, term86734.getClass(), "name", null);
        setField(term86734, term86734.getClass(), "id", null);
        setField(term86734, term86734.getClass(), "value", null);
        setIntField(term86734, term86734.getClass(), "index", 0);
        setBooleanField(term86734, term86734.getClass(), "attribute", false);
        setField(term86734, term86734.getClass(), "rootNode", null);
        setField(term86734, term86734.getClass(), "namespaceResolver", null);
        setField(term86734, term86734.getClass(), "parent", null);
        setField(term86734, term86734.getClass(), "locale", null);
        setField(term86733, term86733.getClass(), "parent", term86734);
        setField(term86733, term86733.getClass(), "locale", null);
        setField(term86729, term86729.getClass(), "parent", term86733);
        setField(term86729, term86729.getClass(), "locale", null);
        setField(term86728, term86728.getClass(), "parent", term86729);
        setField(term86728, term86728.getClass(), "attributes", null);
        setIntField(term86728, term86728.getClass(), "position", 0);
        term86735 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term86738 = (Object[]) newArray("java.lang.String", 0);
        Object term86739 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term86740 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term86735, term86735.getClass(), "dynaBean", null);
        setField(term86735, term86735.getClass(), "name", "*");
        setField(term86735, term86735.getClass(), "names", term86738);
        setIntField(term86735, term86735.getClass(), "propertyIndex", 0);
        setField(term86735, term86735.getClass(), "bean", null);
        setField(term86735, term86735.getClass(), "value", null);
        setIntField(term86735, term86735.getClass(), "index", 0);
        setBooleanField(term86735, term86735.getClass(), "attribute", false);
        setField(term86735, term86735.getClass(), "rootNode", null);
        setField(term86735, term86735.getClass(), "namespaceResolver", null);
        setField(term86739, term86739.getClass(), "attr", null);
        setIntField(term86739, term86739.getClass(), "index", 0);
        setBooleanField(term86739, term86739.getClass(), "attribute", false);
        setField(term86739, term86739.getClass(), "rootNode", null);
        setField(term86739, term86739.getClass(), "namespaceResolver", null);
        setField(term86740, term86740.getClass(), "this$0", null);
        setField(term86740, term86740.getClass(), "name", null);
        setField(term86740, term86740.getClass(), "id", null);
        setField(term86740, term86740.getClass(), "value", null);
        setIntField(term86740, term86740.getClass(), "index", 0);
        setBooleanField(term86740, term86740.getClass(), "attribute", false);
        setField(term86740, term86740.getClass(), "rootNode", null);
        setField(term86740, term86740.getClass(), "namespaceResolver", null);
        setField(term86740, term86740.getClass(), "parent", null);
        setField(term86740, term86740.getClass(), "locale", null);
        setField(term86739, term86739.getClass(), "parent", term86740);
        setField(term86739, term86739.getClass(), "locale", null);
        setField(term86735, term86735.getClass(), "parent", term86739);
        setField(term86735, term86735.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term85422;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86728));
        assertTrue(recursiveEquals(term85422, term86735));
    }

};


