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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JDOMNodePointer_createChild_1743050120262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59305;
     Object term59575;

    public JDOMNodePointer_createChild_1743050120262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59305 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term59421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term59459 = newInstance(Class.forName("org.jdom.Element"));
        setField(term59305, term59305.getClass(), "id", null);
        setField(term59421, term59421.getClass(), "id", null);
        setField(term59421, term59421.getClass(), "parent", null);
        setField(term59421, term59421.getClass(), "node", term59459);
        setField(term59305, term59305.getClass(), "parent", term59421);
        term59575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"));
        setField(term59575, term59575.getClass(), "factory", null);
        setField(term59575, term59575.getClass(), "parentContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term59575;
        args[1] = null;
        args[2] = 2147483647;
        try {
            callMethod(klass, "createChild", argTypes, term59305, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


