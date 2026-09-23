package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NullPropertyPointer_createChild_138236629195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16706;

    public NullPropertyPointer_createChild_138236629195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term16832 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term16706, term16706.getClass(), "parent", term16832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = 0;
        try {
            callMethod(klass, "createChild", argTypes, term16706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


