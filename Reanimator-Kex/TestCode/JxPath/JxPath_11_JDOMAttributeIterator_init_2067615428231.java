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

public class JDOMAttributeIterator_init_2067615428231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141690;
     Object term143245;
     Object term143250;

    public JDOMAttributeIterator_init_2067615428231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term141548, term141548.getClass(), "position", 0);
        setField(term141548, term141548.getClass(), "parent", null);
        term141690 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term141802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term141802, term141802.getClass(), "parent", null);
        setField(term141690, term141690.getClass(), "parent", term141802);
        setField(term141690, term141690.getClass(), "name", "*");
        Object[] term141411 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 9);
        Object term141976 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term142094 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term142216 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term142358 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term142478 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term142618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term142738 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term142856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term142980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term141411, 0, term141976);
        setElement(term141411, 1, term142094);
        setElement(term141411, 2, term142216);
        setElement(term141411, 3, term142358);
        setElement(term141411, 4, term142478);
        setElement(term141411, 5, term142618);
        setElement(term141411, 6, term142738);
        setElement(term141411, 7, term142856);
        setElement(term141411, 8, term142980);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term141411);
        term143245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term143246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term143249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term143246, term143246.getClass(), "dynaBean", null);
        setField(term143246, term143246.getClass(), "name", "*");
        setField(term143246, term143246.getClass(), "names", null);
        setIntField(term143246, term143246.getClass(), "propertyIndex", 0);
        setField(term143246, term143246.getClass(), "bean", null);
        setField(term143246, term143246.getClass(), "value", null);
        setIntField(term143246, term143246.getClass(), "index", 0);
        setBooleanField(term143246, term143246.getClass(), "attribute", false);
        setField(term143246, term143246.getClass(), "rootNode", null);
        setField(term143246, term143246.getClass(), "namespaceResolver", null);
        setField(term143249, term143249.getClass(), "node", null);
        setField(term143249, term143249.getClass(), "namespaces", null);
        setField(term143249, term143249.getClass(), "defaultNamespace", null);
        setField(term143249, term143249.getClass(), "id", null);
        setIntField(term143249, term143249.getClass(), "index", 0);
        setBooleanField(term143249, term143249.getClass(), "attribute", false);
        setField(term143249, term143249.getClass(), "rootNode", null);
        setField(term143249, term143249.getClass(), "namespaceResolver", null);
        setField(term143249, term143249.getClass(), "parent", null);
        setField(term143249, term143249.getClass(), "locale", null);
        setField(term143246, term143246.getClass(), "parent", term143249);
        setField(term143246, term143246.getClass(), "locale", null);
        setField(term143245, term143245.getClass(), "parent", term143246);
        setField(term143245, term143245.getClass(), "attributes", null);
        setIntField(term143245, term143245.getClass(), "position", 0);
        term143250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term143253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term143250, term143250.getClass(), "dynaBean", null);
        setField(term143250, term143250.getClass(), "name", "*");
        setField(term143250, term143250.getClass(), "names", null);
        setIntField(term143250, term143250.getClass(), "propertyIndex", 0);
        setField(term143250, term143250.getClass(), "bean", null);
        setField(term143250, term143250.getClass(), "value", null);
        setIntField(term143250, term143250.getClass(), "index", 0);
        setBooleanField(term143250, term143250.getClass(), "attribute", false);
        setField(term143250, term143250.getClass(), "rootNode", null);
        setField(term143250, term143250.getClass(), "namespaceResolver", null);
        setField(term143253, term143253.getClass(), "node", null);
        setField(term143253, term143253.getClass(), "namespaces", null);
        setField(term143253, term143253.getClass(), "defaultNamespace", null);
        setField(term143253, term143253.getClass(), "id", null);
        setIntField(term143253, term143253.getClass(), "index", 0);
        setBooleanField(term143253, term143253.getClass(), "attribute", false);
        setField(term143253, term143253.getClass(), "rootNode", null);
        setField(term143253, term143253.getClass(), "namespaceResolver", null);
        setField(term143253, term143253.getClass(), "parent", null);
        setField(term143253, term143253.getClass(), "locale", null);
        setField(term143250, term143250.getClass(), "parent", term143253);
        setField(term143250, term143250.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term141690;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term143245));
        assertTrue(recursiveEquals(term141690, term143250));
    }

};


