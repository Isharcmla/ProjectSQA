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

public class JDOMNodePointer_testNode_1309895617215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43523;
     Object term43721;

    public JDOMNodePointer_testNode_1309895617215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43523 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term43589 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term43523, term43523.getClass(), "node", term43589);
        term43721 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term43721;
        try {
            callMethod(klass, "testNode", argTypes, term43523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


