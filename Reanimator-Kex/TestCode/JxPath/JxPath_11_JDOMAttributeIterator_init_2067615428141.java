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

public class JDOMAttributeIterator_init_2067615428141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64507;
     Object term65021;
     Object term65028;

    public JDOMAttributeIterator_init_2067615428141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term64365, term64365.getClass(), "position", 0);
        setField(term64365, term64365.getClass(), "parent", null);
        term64507 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term64633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term64743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        Object[] term64189 = (Object[]) newArray("java.lang.String", 0);
        setField(term64743, term64743.getClass(), "parent", null);
        setField(term64633, term64633.getClass(), "parent", term64743);
        setField(term64507, term64507.getClass(), "parent", term64633);
        setField(term64507, term64507.getClass(), "name", null);
        setField(term64507, term64507.getClass(), "names", term64189);
        term65021 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term65022 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term65025 = (Object[]) newArray("java.lang.String", 0);
        Object term65026 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term65027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term65022, term65022.getClass(), "dynaBean", null);
        setField(term65022, term65022.getClass(), "name", "*");
        setField(term65022, term65022.getClass(), "names", term65025);
        setIntField(term65022, term65022.getClass(), "propertyIndex", 0);
        setField(term65022, term65022.getClass(), "bean", null);
        setField(term65022, term65022.getClass(), "value", null);
        setIntField(term65022, term65022.getClass(), "index", 0);
        setBooleanField(term65022, term65022.getClass(), "attribute", false);
        setField(term65022, term65022.getClass(), "rootNode", null);
        setField(term65022, term65022.getClass(), "namespaceResolver", null);
        setField(term65026, term65026.getClass(), "attr", null);
        setIntField(term65026, term65026.getClass(), "index", 0);
        setBooleanField(term65026, term65026.getClass(), "attribute", false);
        setField(term65026, term65026.getClass(), "rootNode", null);
        setField(term65026, term65026.getClass(), "namespaceResolver", null);
        setField(term65027, term65027.getClass(), "this$0", null);
        setField(term65027, term65027.getClass(), "name", null);
        setField(term65027, term65027.getClass(), "id", null);
        setField(term65027, term65027.getClass(), "value", null);
        setIntField(term65027, term65027.getClass(), "index", 0);
        setBooleanField(term65027, term65027.getClass(), "attribute", false);
        setField(term65027, term65027.getClass(), "rootNode", null);
        setField(term65027, term65027.getClass(), "namespaceResolver", null);
        setField(term65027, term65027.getClass(), "parent", null);
        setField(term65027, term65027.getClass(), "locale", null);
        setField(term65026, term65026.getClass(), "parent", term65027);
        setField(term65026, term65026.getClass(), "locale", null);
        setField(term65022, term65022.getClass(), "parent", term65026);
        setField(term65022, term65022.getClass(), "locale", null);
        setField(term65021, term65021.getClass(), "parent", term65022);
        setField(term65021, term65021.getClass(), "attributes", null);
        setIntField(term65021, term65021.getClass(), "position", 0);
        term65028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term65031 = (Object[]) newArray("java.lang.String", 0);
        Object term65032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term65033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term65028, term65028.getClass(), "dynaBean", null);
        setField(term65028, term65028.getClass(), "name", "*");
        setField(term65028, term65028.getClass(), "names", term65031);
        setIntField(term65028, term65028.getClass(), "propertyIndex", 0);
        setField(term65028, term65028.getClass(), "bean", null);
        setField(term65028, term65028.getClass(), "value", null);
        setIntField(term65028, term65028.getClass(), "index", 0);
        setBooleanField(term65028, term65028.getClass(), "attribute", false);
        setField(term65028, term65028.getClass(), "rootNode", null);
        setField(term65028, term65028.getClass(), "namespaceResolver", null);
        setField(term65032, term65032.getClass(), "attr", null);
        setIntField(term65032, term65032.getClass(), "index", 0);
        setBooleanField(term65032, term65032.getClass(), "attribute", false);
        setField(term65032, term65032.getClass(), "rootNode", null);
        setField(term65032, term65032.getClass(), "namespaceResolver", null);
        setField(term65033, term65033.getClass(), "this$0", null);
        setField(term65033, term65033.getClass(), "name", null);
        setField(term65033, term65033.getClass(), "id", null);
        setField(term65033, term65033.getClass(), "value", null);
        setIntField(term65033, term65033.getClass(), "index", 0);
        setBooleanField(term65033, term65033.getClass(), "attribute", false);
        setField(term65033, term65033.getClass(), "rootNode", null);
        setField(term65033, term65033.getClass(), "namespaceResolver", null);
        setField(term65033, term65033.getClass(), "parent", null);
        setField(term65033, term65033.getClass(), "locale", null);
        setField(term65032, term65032.getClass(), "parent", term65033);
        setField(term65032, term65032.getClass(), "locale", null);
        setField(term65028, term65028.getClass(), "parent", term65032);
        setField(term65028, term65028.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term64507;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65021));
        assertTrue(recursiveEquals(term64507, term65028));
    }

};


