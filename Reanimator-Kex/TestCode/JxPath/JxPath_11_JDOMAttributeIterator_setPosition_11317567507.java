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
import java.util.ArrayList;
import java.lang.Integer;

public class JDOMAttributeIterator_setPosition_11317567507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term86;
     Object term795;

    public JDOMAttributeIterator_setPosition_11317567507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81 = new ArrayList();
        term80 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(term80, term80.getClass(), "parent", null);
        setField(term80, term80.getClass(), "attributes", term81);
        setIntField(term80, term80.getClass(), "position", 1484323161);
        term86 = new Integer(391863371);
        ArrayList term796 = new ArrayList();
        term795 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(term795, term795.getClass(), "parent", null);
        setField(term795, term795.getClass(), "attributes", term796);
        setIntField(term795, term795.getClass(), "position", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term86;
        Object retValue = callMethod(klass, "setPosition", argTypes, term80, args);
        assertTrue(recursiveEquals(term80, term795));
        assertTrue(recursiveEquals(term86, 391863371));
        assertTrue(recursiveEquals(retValue, false));
    }

};


