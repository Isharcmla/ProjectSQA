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

public class BooleanUtils_xor_79642817573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;
     Object term2957;
     Object term2955;

    public BooleanUtils_xor_79642817573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term423 = new Boolean(false);
        Boolean term425 = new Boolean(false);
        Boolean term427 = new Boolean(true);
        Boolean term429 = new Boolean(true);
        term422 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term422, 0, term423);
        setElement(term422, 1, term425);
        setElement(term422, 2, term427);
        setElement(term422, 3, term429);
        Boolean term2958 = new Boolean(false);
        Boolean term2959 = new Boolean(false);
        Boolean term2960 = new Boolean(true);
        Boolean term2961 = new Boolean(true);
        term2957 = (Object[]) newArray("java.lang.Boolean", 4);
        setElement(term2957, 0, term2958);
        setElement(term2957, 1, term2959);
        setElement(term2957, 2, term2960);
        setElement(term2957, 3, term2961);
        term2955 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.BooleanUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Boolean"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term422;
        Object retValue = callMethod(klass, "xor", argTypes, null, args);
        assertTrue(recursiveEquals(term422, term2957));
        assertTrue(recursiveEquals(retValue, term2955));
    }

};


