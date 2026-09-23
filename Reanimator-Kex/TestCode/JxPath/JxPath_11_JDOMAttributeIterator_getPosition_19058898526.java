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

public class JDOMAttributeIterator_getPosition_19058898526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term781;

    public JDOMAttributeIterator_getPosition_19058898526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term75 = new ArrayList();
        term74 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(term74, term74.getClass(), "parent", null);
        setField(term74, term74.getClass(), "attributes", term75);
        setIntField(term74, term74.getClass(), "position", 1162663216);
        ArrayList term782 = new ArrayList();
        term781 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setField(term781, term781.getClass(), "parent", null);
        setField(term781, term781.getClass(), "attributes", term782);
        setIntField(term781, term781.getClass(), "position", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPosition", argTypes, term74, args);
        assertTrue(recursiveEquals(term74, term781));
        assertTrue(recursiveEquals(retValue, 1162663216));
    }

};


