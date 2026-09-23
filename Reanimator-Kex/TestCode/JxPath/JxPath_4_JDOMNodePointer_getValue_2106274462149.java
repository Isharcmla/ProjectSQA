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

public class JDOMNodePointer_getValue_2106274462149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23147;
     Object term24129;

    public JDOMNodePointer_getValue_2106274462149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term23213 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term23147, term23147.getClass(), "node", term23213);
        term24129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term24130 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term24130, term24130.getClass(), "target", null);
        setField(term24130, term24130.getClass(), "rawData", null);
        setField(term24130, term24130.getClass(), "mapData", null);
        setField(term24130, term24130.getClass(), "parent", null);
        setField(term24129, term24129.getClass(), "node", term24130);
        setField(term24129, term24129.getClass(), "id", null);
        setIntField(term24129, term24129.getClass(), "index", 0);
        setBooleanField(term24129, term24129.getClass(), "attribute", false);
        setField(term24129, term24129.getClass(), "rootNode", null);
        setField(term24129, term24129.getClass(), "namespaceResolver", null);
        setField(term24129, term24129.getClass(), "parent", null);
        setField(term24129, term24129.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term23147, args);
        assertTrue(recursiveEquals(term23147, term24129));
        assertTrue(recursiveEquals(retValue, null));
    }

};


