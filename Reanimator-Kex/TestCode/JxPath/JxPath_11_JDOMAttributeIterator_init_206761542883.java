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

public class JDOMAttributeIterator_init_206761542883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28184;
     Object term28746;
     Object term28750;

    public JDOMAttributeIterator_init_206761542883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term28068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        setIntField(term27940, term27940.getClass(), "position", 0);
        setField(term27940, term27940.getClass(), "parent", term28068);
        term28184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        setField(term28184, term28184.getClass(), "namespaceURI", "");
        term28746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term28747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        setField(term28747, term28747.getClass(), "prefix", null);
        setField(term28747, term28747.getClass(), "namespaceURI", "");
        setIntField(term28747, term28747.getClass(), "index", 0);
        setBooleanField(term28747, term28747.getClass(), "attribute", false);
        setField(term28747, term28747.getClass(), "rootNode", null);
        setField(term28747, term28747.getClass(), "namespaceResolver", null);
        setField(term28747, term28747.getClass(), "parent", null);
        setField(term28747, term28747.getClass(), "locale", null);
        setField(term28746, term28746.getClass(), "parent", term28747);
        setField(term28746, term28746.getClass(), "attributes", null);
        setIntField(term28746, term28746.getClass(), "position", 0);
        term28750 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.NamespacePointer"));
        setField(term28750, term28750.getClass(), "prefix", null);
        setField(term28750, term28750.getClass(), "namespaceURI", "");
        setIntField(term28750, term28750.getClass(), "index", 0);
        setBooleanField(term28750, term28750.getClass(), "attribute", false);
        setField(term28750, term28750.getClass(), "rootNode", null);
        setField(term28750, term28750.getClass(), "namespaceResolver", null);
        setField(term28750, term28750.getClass(), "parent", null);
        setField(term28750, term28750.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term28184;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28746));
        assertTrue(recursiveEquals(term28184, term28750));
    }

};


