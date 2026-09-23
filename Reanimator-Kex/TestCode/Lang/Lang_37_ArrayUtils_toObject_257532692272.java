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
import java.lang.Object;
import java.lang.Long;

public class ArrayUtils_toObject_257532692272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162;
     Object term14240;
     Object term14229;

    public ArrayUtils_toObject_257532692272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1162 = (long[]) newLongArray(3);
        setLongElement(term1162, 0, -7612550318181586304L);
        setLongElement(term1162, 1, -2170847986967241072L);
        setLongElement(term1162, 2, 4044358158040652353L);
        term14240 = (long[]) newLongArray(3);
        setLongElement(term14240, 0, -7612550318181586304L);
        setLongElement(term14240, 1, -2170847986967241072L);
        setLongElement(term14240, 2, 4044358158040652353L);
        Long term14230 = new Long(-7612550318181586304L);
        Long term14232 = new Long(-2170847986967241072L);
        Long term14234 = new Long(4044358158040652353L);
        term14229 = (Object[]) newArray("java.lang.Long", 3);
        setElement(term14229, 0, term14230);
        setElement(term14229, 1, term14232);
        setElement(term14229, 2, term14234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1162;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1162, term14240));
        assertTrue(recursiveEquals(retValue, term14229));
    }

};


