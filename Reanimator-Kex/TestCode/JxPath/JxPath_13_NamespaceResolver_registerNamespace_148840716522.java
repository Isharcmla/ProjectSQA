package org.apache.commons.jxpath.ri;

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
import static org.apache.commons.jxpath.ri.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NamespaceResolver_registerNamespace_148840716522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;

    public NamespaceResolver_registerNamespace_148840716522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1993 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setBooleanField(term1993, term1993.getClass(), "sealed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "registerNamespace", argTypes, term1993, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


