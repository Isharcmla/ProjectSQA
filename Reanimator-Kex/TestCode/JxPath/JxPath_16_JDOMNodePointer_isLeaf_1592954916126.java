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

public class JDOMNodePointer_isLeaf_1592954916126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20549;

    public JDOMNodePointer_isLeaf_1592954916126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20549 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term20587 = newInstance(Class.forName("org.jdom.Element"));
        setField(term20549, term20549.getClass(), "node", term20587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isLeaf", argTypes, term20549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


