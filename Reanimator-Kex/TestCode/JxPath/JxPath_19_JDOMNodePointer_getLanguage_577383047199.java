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

public class JDOMNodePointer_getLanguage_577383047199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38574;
     Object term38705;

    public JDOMNodePointer_getLanguage_577383047199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term38640 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term38574, term38574.getClass(), "node", term38640);
        term38705 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term38706 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term38706, term38706.getClass(), "target", null);
        setField(term38706, term38706.getClass(), "rawData", null);
        setField(term38706, term38706.getClass(), "mapData", null);
        setField(term38706, term38706.getClass(), "parent", null);
        setField(term38705, term38705.getClass(), "node", term38706);
        setField(term38705, term38705.getClass(), "id", null);
        setField(term38705, term38705.getClass(), "localNamespaceResolver", null);
        setIntField(term38705, term38705.getClass(), "index", 0);
        setBooleanField(term38705, term38705.getClass(), "attribute", false);
        setField(term38705, term38705.getClass(), "namespaceResolver", null);
        setField(term38705, term38705.getClass(), "rootNode", null);
        setField(term38705, term38705.getClass(), "parent", null);
        setField(term38705, term38705.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term38574, args);
        assertTrue(recursiveEquals(term38574, term38705));
        assertTrue(recursiveEquals(retValue, null));
    }

};


