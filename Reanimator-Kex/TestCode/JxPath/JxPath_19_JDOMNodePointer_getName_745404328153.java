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

public class JDOMNodePointer_getName_745404328153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28010;
     Object term28621;
     Object term28616;

    public JDOMNodePointer_getName_745404328153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28010 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term28076 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term28010, term28010.getClass(), "node", term28076);
        term28621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term28622 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term28622, term28622.getClass(), "target", null);
        setField(term28622, term28622.getClass(), "rawData", null);
        setField(term28622, term28622.getClass(), "mapData", null);
        setField(term28622, term28622.getClass(), "parent", null);
        setField(term28621, term28621.getClass(), "node", term28622);
        setField(term28621, term28621.getClass(), "id", null);
        setField(term28621, term28621.getClass(), "localNamespaceResolver", null);
        setIntField(term28621, term28621.getClass(), "index", 0);
        setBooleanField(term28621, term28621.getClass(), "attribute", false);
        setField(term28621, term28621.getClass(), "namespaceResolver", null);
        setField(term28621, term28621.getClass(), "rootNode", null);
        setField(term28621, term28621.getClass(), "parent", null);
        setField(term28621, term28621.getClass(), "locale", null);
        term28616 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term28616, term28616.getClass(), "prefix", null);
        setField(term28616, term28616.getClass(), "name", null);
        setField(term28616, term28616.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term28010, args);
        assertTrue(recursiveEquals(term28010, term28621));
        assertTrue(recursiveEquals(retValue, term28616));
    }

};


