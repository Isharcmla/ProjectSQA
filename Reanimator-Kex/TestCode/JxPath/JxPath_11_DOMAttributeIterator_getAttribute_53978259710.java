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
     Object term252;
     Object term295;

    public DOMAttributeIterator_getAttribute_53978259710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term290 = new ArrayList();
        term252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term252, term252.getClass(), "parent", null);
        setField(term253, term253.getClass(), "prefix", "uuaPigETmJ");
        setField(term253, term253.getClass(), "name", "MxlszYVzRf");
        setField(term253, term253.getClass(), "qualifiedName", "LQFpaHEwXR");
        setField(term252, term252.getClass(), "name", term253);
        setField(term252, term252.getClass(), "attributes", term290);
        setIntField(term252, term252.getClass(), "position", 1162663216);
        term295 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term295, term295.getClass(), "prefix", "oVcInYnLWB");
        setField(term295, term295.getClass(), "name", "aJlieCFVtF");
        setField(term295, term295.getClass(), "qualifiedName", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term295;
        try {
            callMethod(klass, "getAttribute", argTypes, term252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


