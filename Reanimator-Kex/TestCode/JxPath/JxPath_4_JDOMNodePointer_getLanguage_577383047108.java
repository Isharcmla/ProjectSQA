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

public class JDOMNodePointer_getLanguage_577383047108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14263;
     Object term14549;

    public JDOMNodePointer_getLanguage_577383047108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term14329 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term14263, term14263.getClass(), "node", term14329);
        term14549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term14550 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term14550, term14550.getClass(), "target", null);
        setField(term14550, term14550.getClass(), "rawData", null);
        setField(term14550, term14550.getClass(), "mapData", null);
        setField(term14550, term14550.getClass(), "parent", null);
        setField(term14549, term14549.getClass(), "node", term14550);
        setField(term14549, term14549.getClass(), "id", null);
        setIntField(term14549, term14549.getClass(), "index", 0);
        setBooleanField(term14549, term14549.getClass(), "attribute", false);
        setField(term14549, term14549.getClass(), "rootNode", null);
        setField(term14549, term14549.getClass(), "namespaceResolver", null);
        setField(term14549, term14549.getClass(), "parent", null);
        setField(term14549, term14549.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term14263, args);
        assertTrue(recursiveEquals(term14263, term14549));
        assertTrue(recursiveEquals(retValue, null));
    }

};


