package org.apache.commons.lang3.builder;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.lang3.builder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public class HashCodeBuilder_reflectionHashCode_180089111842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term140;
     Object term142;
     Object term143;
     Object term145;

    public HashCodeBuilder_reflectionHashCode_180089111842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = new Integer(-1955890973);
        term140 = new Integer(-2038273078);
        term142 = newInstance(Class.forName("java.lang.Object"));
        term143 = new Boolean(false);
        term145 = (Object[]) newArray("java.lang.String", 4);
        setElement(term145, 0, "EGtDIRbSSb");
        setElement(term145, 1, "SzjVpOQTyS");
        setElement(term145, 2, "MjGYSRKTNF");
        setElement(term145, 3, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.builder.HashCodeBuilder");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Class");
        argTypes[5] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = term138;
        args[1] = term140;
        args[2] = term142;
        args[3] = term143;
        args[4] = null;
        args[5] = term145;
        try {
            callMethod(klass, "reflectionHashCode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


