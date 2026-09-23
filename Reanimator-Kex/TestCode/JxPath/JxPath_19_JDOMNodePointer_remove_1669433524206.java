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

public class JDOMNodePointer_remove_1669433524206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39060;

    public JDOMNodePointer_remove_1669433524206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term39098 = newInstance(Class.forName("org.jdom.Element"));
        setField(term39098, term39098.getClass(), "parent", term39098);
        setField(term39060, term39060.getClass(), "node", term39098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term39060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


