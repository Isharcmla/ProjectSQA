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

public class JDOMAttributeIterator_init_2067615428137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62827;
     Object term63391;
     Object term63397;

    public JDOMAttributeIterator_init_2067615428137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62543 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term62685 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setIntField(term62543, term62543.getClass(), "position", 0);
        setField(term62543, term62543.getClass(), "parent", term62685);
        term62827 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term62953 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term63063 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term63063, term63063.getClass(), "parent", null);
        setField(term62953, term62953.getClass(), "parent", term63063);
        setField(term62827, term62827.getClass(), "parent", term62953);
        setField(term62827, term62827.getClass(), "name", "*");
        term63391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term63392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term63395 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term63396 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term63392, term63392.getClass(), "dynaBean", null);
        setField(term63392, term63392.getClass(), "name", "*");
        setField(term63392, term63392.getClass(), "names", null);
        setIntField(term63392, term63392.getClass(), "propertyIndex", 0);
        setField(term63392, term63392.getClass(), "bean", null);
        setField(term63392, term63392.getClass(), "value", null);
        setIntField(term63392, term63392.getClass(), "index", 0);
        setBooleanField(term63392, term63392.getClass(), "attribute", false);
        setField(term63392, term63392.getClass(), "rootNode", null);
        setField(term63392, term63392.getClass(), "namespaceResolver", null);
        setField(term63395, term63395.getClass(), "attr", null);
        setIntField(term63395, term63395.getClass(), "index", 0);
        setBooleanField(term63395, term63395.getClass(), "attribute", false);
        setField(term63395, term63395.getClass(), "rootNode", null);
        setField(term63395, term63395.getClass(), "namespaceResolver", null);
        setField(term63396, term63396.getClass(), "this$0", null);
        setField(term63396, term63396.getClass(), "name", null);
        setField(term63396, term63396.getClass(), "id", null);
        setField(term63396, term63396.getClass(), "value", null);
        setIntField(term63396, term63396.getClass(), "index", 0);
        setBooleanField(term63396, term63396.getClass(), "attribute", false);
        setField(term63396, term63396.getClass(), "rootNode", null);
        setField(term63396, term63396.getClass(), "namespaceResolver", null);
        setField(term63396, term63396.getClass(), "parent", null);
        setField(term63396, term63396.getClass(), "locale", null);
        setField(term63395, term63395.getClass(), "parent", term63396);
        setField(term63395, term63395.getClass(), "locale", null);
        setField(term63392, term63392.getClass(), "parent", term63395);
        setField(term63392, term63392.getClass(), "locale", null);
        setField(term63391, term63391.getClass(), "parent", term63392);
        setField(term63391, term63391.getClass(), "attributes", null);
        setIntField(term63391, term63391.getClass(), "position", 0);
        term63397 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term63400 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term63401 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term63397, term63397.getClass(), "dynaBean", null);
        setField(term63397, term63397.getClass(), "name", "*");
        setField(term63397, term63397.getClass(), "names", null);
        setIntField(term63397, term63397.getClass(), "propertyIndex", 0);
        setField(term63397, term63397.getClass(), "bean", null);
        setField(term63397, term63397.getClass(), "value", null);
        setIntField(term63397, term63397.getClass(), "index", 0);
        setBooleanField(term63397, term63397.getClass(), "attribute", false);
        setField(term63397, term63397.getClass(), "rootNode", null);
        setField(term63397, term63397.getClass(), "namespaceResolver", null);
        setField(term63400, term63400.getClass(), "attr", null);
        setIntField(term63400, term63400.getClass(), "index", 0);
        setBooleanField(term63400, term63400.getClass(), "attribute", false);
        setField(term63400, term63400.getClass(), "rootNode", null);
        setField(term63400, term63400.getClass(), "namespaceResolver", null);
        setField(term63401, term63401.getClass(), "this$0", null);
        setField(term63401, term63401.getClass(), "name", null);
        setField(term63401, term63401.getClass(), "id", null);
        setField(term63401, term63401.getClass(), "value", null);
        setIntField(term63401, term63401.getClass(), "index", 0);
        setBooleanField(term63401, term63401.getClass(), "attribute", false);
        setField(term63401, term63401.getClass(), "rootNode", null);
        setField(term63401, term63401.getClass(), "namespaceResolver", null);
        setField(term63401, term63401.getClass(), "parent", null);
        setField(term63401, term63401.getClass(), "locale", null);
        setField(term63400, term63400.getClass(), "parent", term63401);
        setField(term63400, term63400.getClass(), "locale", null);
        setField(term63397, term63397.getClass(), "parent", term63400);
        setField(term63397, term63397.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term62827;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term63391));
        assertTrue(recursiveEquals(term62827, term63397));
    }

};


