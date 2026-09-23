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
import java.util.ArrayList;

public class JDOMAttributeIterator_init_206761542858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15722;
     Object term15884;
     Object term16713;
     Object term16719;
     Object term16722;

    public JDOMAttributeIterator_init_206761542858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15602 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term15602, term15602.getClass(), "position", 0);
        setField(term15602, term15602.getClass(), "parent", null);
        setField(term15602, term15602.getClass(), "attributes", null);
        term15722 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term15760 = newInstance(Class.forName("org.jdom.Element"));
        Object term15810 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term15760, term15760.getClass(), "attributes", term15810);
        setField(term15722, term15722.getClass(), "value", term15760);
        term15884 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term15884, term15884.getClass(), "prefix", null);
        setField(term15884, term15884.getClass(), "name", "*");
        ArrayList term16717 = new ArrayList();
        term16713 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term16714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term16715 = newInstance(Class.forName("org.jdom.Element"));
        Object term16716 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term16714, term16714.getClass(), "name", null);
        setField(term16714, term16714.getClass(), "bean", null);
        setField(term16714, term16714.getClass(), "handler", null);
        setField(term16715, term16715.getClass(), "name", null);
        setField(term16715, term16715.getClass(), "namespace", null);
        setField(term16715, term16715.getClass(), "additionalNamespaces", null);
        setField(term16716, term16716.getClass(), "elementData", null);
        setIntField(term16716, term16716.getClass(), "size", 0);
        setField(term16716, term16716.getClass(), "parent", null);
        setIntField(term16716, term16716.getClass(), "modCount", 0);
        setField(term16715, term16715.getClass(), "attributes", term16716);
        setField(term16715, term16715.getClass(), "content", null);
        setField(term16715, term16715.getClass(), "parent", null);
        setField(term16714, term16714.getClass(), "value", term16715);
        setIntField(term16714, term16714.getClass(), "index", 0);
        setBooleanField(term16714, term16714.getClass(), "attribute", false);
        setField(term16714, term16714.getClass(), "rootNode", null);
        setField(term16714, term16714.getClass(), "namespaceResolver", null);
        setField(term16714, term16714.getClass(), "parent", null);
        setField(term16714, term16714.getClass(), "locale", null);
        setField(term16713, term16713.getClass(), "parent", term16714);
        setField(term16713, term16713.getClass(), "attributes", term16717);
        setIntField(term16713, term16713.getClass(), "position", 0);
        term16719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term16720 = newInstance(Class.forName("org.jdom.Element"));
        Object term16721 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term16719, term16719.getClass(), "name", null);
        setField(term16719, term16719.getClass(), "bean", null);
        setField(term16719, term16719.getClass(), "handler", null);
        setField(term16720, term16720.getClass(), "name", null);
        setField(term16720, term16720.getClass(), "namespace", null);
        setField(term16720, term16720.getClass(), "additionalNamespaces", null);
        setField(term16721, term16721.getClass(), "elementData", null);
        setIntField(term16721, term16721.getClass(), "size", 0);
        setField(term16721, term16721.getClass(), "parent", null);
        setIntField(term16721, term16721.getClass(), "modCount", 0);
        setField(term16720, term16720.getClass(), "attributes", term16721);
        setField(term16720, term16720.getClass(), "content", null);
        setField(term16720, term16720.getClass(), "parent", null);
        setField(term16719, term16719.getClass(), "value", term16720);
        setIntField(term16719, term16719.getClass(), "index", 0);
        setBooleanField(term16719, term16719.getClass(), "attribute", false);
        setField(term16719, term16719.getClass(), "rootNode", null);
        setField(term16719, term16719.getClass(), "namespaceResolver", null);
        setField(term16719, term16719.getClass(), "parent", null);
        setField(term16719, term16719.getClass(), "locale", null);
        term16722 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16722, term16722.getClass(), "prefix", null);
        setField(term16722, term16722.getClass(), "name", "*");
        setField(term16722, term16722.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term15722;
        args[1] = term15884;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16713));
        assertTrue(recursiveEquals(term15722, term16719));
        assertTrue(recursiveEquals(term15884, term16722));
    }

};


