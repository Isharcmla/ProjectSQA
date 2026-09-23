package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Integer;

public class MathUtils_subAndCheck_259148074121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;
     Object term207;

    public MathUtils_subAndCheck_259148074121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = new Integer(-203030934);
        term207 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term205;
        args[1] = term207;
        Object retValue = callMethod(klass, "subAndCheck", argTypes, null, args);
        assertTrue(recursiveEquals(term205, -203030934));
        assertTrue(recursiveEquals(term207, -1179120542));
        assertTrue(recursiveEquals(retValue, 976089608));
    }

};


