package org.jfree.data;

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
import org.jfree.data.UnknownKeyException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class DefaultKeyedValues2D_getValue_1361298107109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19970;
     Object term20109;

    public DefaultKeyedValues2D_getValue_1361298107109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20022 = new ArrayList();
        term19970 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term19970, term19970.getClass(), "columnKeys", term20022);
        term20109 = newInstance(Class.forName("org.jfree.data.time.Minute"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[2];
        args[0] = term20109;
        args[1] = term20109;
        try {
            callMethod(klass, "getValue", argTypes, term19970, args);
            assertTrue(false);
        }
        catch (UnknownKeyException e) {
        }

    }

};


