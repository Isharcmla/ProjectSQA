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

public class JDOMAttributeIterator_init_2067615428357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254412;
     Object term255995;
     Object term256002;

    public JDOMAttributeIterator_init_2067615428357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term254144 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term254270 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setIntField(term254144, term254144.getClass(), "position", 0);
        setField(term254144, term254144.getClass(), "parent", term254270);
        term254412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term254538 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term254680 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term254806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term254806, term254806.getClass(), "parent", null);
        setField(term254680, term254680.getClass(), "parent", term254806);
        setField(term254538, term254538.getClass(), "parent", term254680);
        setField(term254412, term254412.getClass(), "parent", term254538);
        setField(term254412, term254412.getClass(), "name", "*");
        Object[] term254010 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term254980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term255098 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term255220 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term255362 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term255482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term255616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term254010, 0, term254980);
        setElement(term254010, 1, term255098);
        setElement(term254010, 2, term255220);
        setElement(term254010, 3, term255362);
        setElement(term254010, 4, term255482);
        setElement(term254010, 5, term255616);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term254010);
        term255995 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term255996 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term255999 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term256000 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term256001 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term255996, term255996.getClass(), "dynaBean", null);
        setField(term255996, term255996.getClass(), "name", "*");
        setField(term255996, term255996.getClass(), "names", null);
        setIntField(term255996, term255996.getClass(), "propertyIndex", 0);
        setField(term255996, term255996.getClass(), "bean", null);
        setField(term255996, term255996.getClass(), "value", null);
        setIntField(term255996, term255996.getClass(), "index", 0);
        setBooleanField(term255996, term255996.getClass(), "attribute", false);
        setField(term255996, term255996.getClass(), "rootNode", null);
        setField(term255996, term255996.getClass(), "namespaceResolver", null);
        setField(term255999, term255999.getClass(), "attr", null);
        setIntField(term255999, term255999.getClass(), "index", 0);
        setBooleanField(term255999, term255999.getClass(), "attribute", false);
        setField(term255999, term255999.getClass(), "rootNode", null);
        setField(term255999, term255999.getClass(), "namespaceResolver", null);
        setField(term256000, term256000.getClass(), "dynaBean", null);
        setField(term256000, term256000.getClass(), "name", null);
        setField(term256000, term256000.getClass(), "names", null);
        setIntField(term256000, term256000.getClass(), "propertyIndex", 0);
        setField(term256000, term256000.getClass(), "bean", null);
        setField(term256000, term256000.getClass(), "value", null);
        setIntField(term256000, term256000.getClass(), "index", 0);
        setBooleanField(term256000, term256000.getClass(), "attribute", false);
        setField(term256000, term256000.getClass(), "rootNode", null);
        setField(term256000, term256000.getClass(), "namespaceResolver", null);
        setField(term256001, term256001.getClass(), "propertyName", null);
        setBooleanField(term256001, term256001.getClass(), "byNameAttribute", false);
        setIntField(term256001, term256001.getClass(), "propertyIndex", 0);
        setField(term256001, term256001.getClass(), "bean", null);
        setField(term256001, term256001.getClass(), "value", null);
        setIntField(term256001, term256001.getClass(), "index", 0);
        setBooleanField(term256001, term256001.getClass(), "attribute", false);
        setField(term256001, term256001.getClass(), "rootNode", null);
        setField(term256001, term256001.getClass(), "namespaceResolver", null);
        setField(term256001, term256001.getClass(), "parent", null);
        setField(term256001, term256001.getClass(), "locale", null);
        setField(term256000, term256000.getClass(), "parent", term256001);
        setField(term256000, term256000.getClass(), "locale", null);
        setField(term255999, term255999.getClass(), "parent", term256000);
        setField(term255999, term255999.getClass(), "locale", null);
        setField(term255996, term255996.getClass(), "parent", term255999);
        setField(term255996, term255996.getClass(), "locale", null);
        setField(term255995, term255995.getClass(), "parent", term255996);
        setField(term255995, term255995.getClass(), "attributes", null);
        setIntField(term255995, term255995.getClass(), "position", 0);
        term256002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term256005 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term256006 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term256007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        setField(term256002, term256002.getClass(), "dynaBean", null);
        setField(term256002, term256002.getClass(), "name", "*");
        setField(term256002, term256002.getClass(), "names", null);
        setIntField(term256002, term256002.getClass(), "propertyIndex", 0);
        setField(term256002, term256002.getClass(), "bean", null);
        setField(term256002, term256002.getClass(), "value", null);
        setIntField(term256002, term256002.getClass(), "index", 0);
        setBooleanField(term256002, term256002.getClass(), "attribute", false);
        setField(term256002, term256002.getClass(), "rootNode", null);
        setField(term256002, term256002.getClass(), "namespaceResolver", null);
        setField(term256005, term256005.getClass(), "attr", null);
        setIntField(term256005, term256005.getClass(), "index", 0);
        setBooleanField(term256005, term256005.getClass(), "attribute", false);
        setField(term256005, term256005.getClass(), "rootNode", null);
        setField(term256005, term256005.getClass(), "namespaceResolver", null);
        setField(term256006, term256006.getClass(), "dynaBean", null);
        setField(term256006, term256006.getClass(), "name", null);
        setField(term256006, term256006.getClass(), "names", null);
        setIntField(term256006, term256006.getClass(), "propertyIndex", 0);
        setField(term256006, term256006.getClass(), "bean", null);
        setField(term256006, term256006.getClass(), "value", null);
        setIntField(term256006, term256006.getClass(), "index", 0);
        setBooleanField(term256006, term256006.getClass(), "attribute", false);
        setField(term256006, term256006.getClass(), "rootNode", null);
        setField(term256006, term256006.getClass(), "namespaceResolver", null);
        setField(term256007, term256007.getClass(), "propertyName", null);
        setBooleanField(term256007, term256007.getClass(), "byNameAttribute", false);
        setIntField(term256007, term256007.getClass(), "propertyIndex", 0);
        setField(term256007, term256007.getClass(), "bean", null);
        setField(term256007, term256007.getClass(), "value", null);
        setIntField(term256007, term256007.getClass(), "index", 0);
        setBooleanField(term256007, term256007.getClass(), "attribute", false);
        setField(term256007, term256007.getClass(), "rootNode", null);
        setField(term256007, term256007.getClass(), "namespaceResolver", null);
        setField(term256007, term256007.getClass(), "parent", null);
        setField(term256007, term256007.getClass(), "locale", null);
        setField(term256006, term256006.getClass(), "parent", term256007);
        setField(term256006, term256006.getClass(), "locale", null);
        setField(term256005, term256005.getClass(), "parent", term256006);
        setField(term256005, term256005.getClass(), "locale", null);
        setField(term256002, term256002.getClass(), "parent", term256005);
        setField(term256002, term256002.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term254412;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term255995));
        assertTrue(recursiveEquals(term254412, term256002));
    }

};


