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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_compareChildNodePointers_98093308551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566;

    public JDOMNodePointer_compareChildNodePointers_98093308551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term588 = new HashMap();
        HashMap term593 = new HashMap();
        HashMap term599 = new HashMap();
        HashMap term604 = new HashMap();
        HashMap term610 = new HashMap();
        HashMap term615 = new HashMap();
        term566 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term567 = newInstance(Class.forName("java.lang.Object"));
        Object term582 = newInstance(Class.forName("java.lang.Object"));
        Object term583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term584 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term585 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term566, term566.getClass(), "node", term567);
        setField(term566, term566.getClass(), "id", "MxlszYVzRf");
        setIntField(term566, term566.getClass(), "index", -1955890973);
        setBooleanField(term566, term566.getClass(), "attribute", true);
        setField(term566, term566.getClass(), "rootNode", term582);
        setField(term586, term586.getClass(), "parent", null);
        setField(term586, term586.getClass(), "namespaceMap", null);
        setField(term586, term586.getClass(), "reverseMap", null);
        setField(term586, term586.getClass(), "pointer", null);
        setField(term586, term586.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term586, term586.getClass(), "sealed", false);
        setField(term585, term585.getClass(), "parent", term586);
        setField(term585, term585.getClass(), "namespaceMap", term588);
        setField(term585, term585.getClass(), "reverseMap", term593);
        setField(term585, term585.getClass(), "pointer", null);
        setField(term585, term585.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term585, term585.getClass(), "sealed", false);
        setField(term584, term584.getClass(), "parent", term585);
        setField(term584, term584.getClass(), "namespaceMap", term599);
        setField(term584, term584.getClass(), "reverseMap", term604);
        setField(term584, term584.getClass(), "pointer", null);
        setField(term584, term584.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term584, term584.getClass(), "sealed", false);
        setField(term583, term583.getClass(), "parent", term584);
        setField(term583, term583.getClass(), "namespaceMap", term610);
        setField(term583, term583.getClass(), "reverseMap", term615);
        setField(term583, term583.getClass(), "pointer", null);
        setField(term583, term583.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term583, term583.getClass(), "sealed", false);
        setField(term566, term566.getClass(), "namespaceResolver", term583);
        setField(term566, term566.getClass(), "parent", null);
        setField(term566, term566.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "compareChildNodePointers", argTypes, term566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


