package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Integer;

public class StringUtils_abbreviate_1944826605497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167042;
     Object term167043;
     Object term167045;
     Object term177973;

    public StringUtils_abbreviate_1944826605497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167042 = newInstance(Class.forName("org.apache.commons.lang3.StringUtils"));
        term167043 = new Integer(0);
        term167045 = new Integer(0);
        term177973 = (byte[]) newByteArray(1);
        setByteElement(term177973, 0, (byte) 116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term167043;
        args[2] = term167045;
        Object retValue = callMethod(klass, "abbreviate", argTypes, term167042, args);
        assertTrue(recursiveEquals(term167043, term177973));
        assertTrue(recursiveEquals(term167045, ""));
        assertTrue(recursiveEquals(retValue, null));
    }

};


