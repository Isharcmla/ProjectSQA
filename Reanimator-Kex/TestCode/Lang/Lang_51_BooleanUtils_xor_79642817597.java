package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.lang.Boolean;

public class BooleanUtils_xor_79642817597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3398;
     Object term3537;
     Object term3535;

    public BooleanUtils_xor_79642817597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3501 = new Boolean(true);
        term3398 = (Object[]) newArray("java.lang.Boolean", 3);
        setElement(term3398, 0, term3501);
        setElement(term3398, 1, term3501);
        setElement(term3398, 2, term3501);
        Boolean term3538 = new Boolean(true);
        Boolean term3539 = new Boolean(true);
        Boolean term3540 = new Boolean(true);
        term3537 = (Object[]) newArray("java.lang.Boolean", 3);
        setElement(term3537, 0, term3538);
        setElement(term3537, 1, term3539);
        setElement(term3537, 2, term3540);
        term3535 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3398;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term3398, term3537));
        assertTrue(recursiveEquals(retValue, term3535));
    }

};


