package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_getAttribute_53978259710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term228;

    public DOMAttributeIterator_getAttribute_53978259710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term223 = new ArrayList();
        term185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term185, term185.getClass(), "parent", null);
        setField(term186, term186.getClass(), "prefix", "hRNSzYYIrc");
        setField(term186, term186.getClass(), "name", "RMFIsYGgne");
        setField(term186, term186.getClass(), "qualifiedName", "NRdvgJlhkX");
        setField(term185, term185.getClass(), "name", term186);
        setField(term185, term185.getClass(), "attributes", term223);
        setIntField(term185, term185.getClass(), "position", 1162663216);
        term228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term228, term228.getClass(), "prefix", "uuaPigETmJ");
        setField(term228, term228.getClass(), "name", "MxlszYVzRf");
        setField(term228, term228.getClass(), "qualifiedName", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term228;
        try {
            callMethod(klass, "getAttribute", argTypes, term185, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


