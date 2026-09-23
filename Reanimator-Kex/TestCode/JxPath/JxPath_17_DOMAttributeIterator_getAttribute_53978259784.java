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

public class DOMAttributeIterator_getAttribute_53978259784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20579;
     Object term20901;

    public DOMAttributeIterator_getAttribute_53978259784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term20703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        Object term20827 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        setField(term20703, term20703.getClass(), "namespaceResolver", null);
        setField(term20703, term20703.getClass(), "parent", term20827);
        setField(term20579, term20579.getClass(), "parent", term20703);
        term20901 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term20901, term20901.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Element");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20901;
        try {
            callMethod(klass, "getAttribute", argTypes, term20579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


