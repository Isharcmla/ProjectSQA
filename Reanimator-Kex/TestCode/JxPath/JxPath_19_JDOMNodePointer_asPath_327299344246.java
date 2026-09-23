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

public class JDOMNodePointer_asPath_327299344246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48669;
     Object term49055;

    public JDOMNodePointer_asPath_327299344246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term48735 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term48669, term48669.getClass(), "id", null);
        setField(term48669, term48669.getClass(), "parent", null);
        setField(term48669, term48669.getClass(), "node", term48735);
        term49055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term49056 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term49056, term49056.getClass(), "target", null);
        setField(term49056, term49056.getClass(), "rawData", null);
        setField(term49056, term49056.getClass(), "mapData", null);
        setField(term49056, term49056.getClass(), "parent", null);
        setField(term49055, term49055.getClass(), "node", term49056);
        setField(term49055, term49055.getClass(), "id", null);
        setField(term49055, term49055.getClass(), "localNamespaceResolver", null);
        setIntField(term49055, term49055.getClass(), "index", 0);
        setBooleanField(term49055, term49055.getClass(), "attribute", false);
        setField(term49055, term49055.getClass(), "namespaceResolver", null);
        setField(term49055, term49055.getClass(), "rootNode", null);
        setField(term49055, term49055.getClass(), "parent", null);
        setField(term49055, term49055.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term48669, args);
        assertTrue(recursiveEquals(term48669, term49055));
        assertTrue(recursiveEquals(retValue, "/processing-instruction(\'null\')[1]"));
    }

};


