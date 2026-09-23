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

public class JDOMNodePointer_getNamespaceURI_128385811593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16114;
     Object term16589;

    public JDOMNodePointer_getNamespaceURI_128385811593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term16589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term16589, term16589.getClass(), "node", null);
        setField(term16589, term16589.getClass(), "id", null);
        setField(term16589, term16589.getClass(), "localNamespaceResolver", null);
        setIntField(term16589, term16589.getClass(), "index", 0);
        setBooleanField(term16589, term16589.getClass(), "attribute", false);
        setField(term16589, term16589.getClass(), "namespaceResolver", null);
        setField(term16589, term16589.getClass(), "rootNode", null);
        setField(term16589, term16589.getClass(), "parent", null);
        setField(term16589, term16589.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xml";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term16114, args);
        assertTrue(recursiveEquals(term16114, term16589));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


