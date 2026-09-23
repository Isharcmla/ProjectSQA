package org.apache.commons.jxpath.ri.model;

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
import static org.apache.commons.jxpath.ri.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class NodePointer_createChild_146147261472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term293;
     Object term295;

    public NodePointer_createChild_146147261472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term256, term256.getClass(), "prefix", "hRNSzYYIrc");
        setField(term256, term256.getClass(), "name", "RMFIsYGgne");
        setField(term256, term256.getClass(), "qualifiedName", "NRdvgJlhkX");
        term293 = new Integer(1162663216);
        term295 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term256;
        args[2] = term293;
        args[3] = term295;
        try {
            callMethod(klass, "createChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


