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

public class BooleanUtils_xor_796428175165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18418;
     Object term18926;
     Object term18924;

    public BooleanUtils_xor_796428175165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term18566 = new Boolean(false);
        Boolean term18614 = new Boolean(true);
        term18418 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term18418, 0, term18566);
        setElement(term18418, 1, term18566);
        setElement(term18418, 2, term18614);
        setElement(term18418, 3, term18566);
        Boolean term18927 = new Boolean(false);
        Boolean term18928 = new Boolean(false);
        Boolean term18929 = new Boolean(true);
        Boolean term18930 = new Boolean(false);
        term18926 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term18926, 0, term18927);
        setElement(term18926, 1, term18928);
        setElement(term18926, 2, term18929);
        setElement(term18926, 3, term18930);
        term18924 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term18418;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term18418, term18926));
        assertTrue(recursiveEquals(retValue, term18924));
    }

};


