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

public class ArrayUtils_toObject_257532692274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1173;
     Object term14286;
     Object term14275;

    public ArrayUtils_toObject_257532692274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1173 = (long[]) newLongArray(3);
        setLongElement(term1173, 0, -7612550318181586304L);
        setLongElement(term1173, 1, -2170847986967241072L);
        setLongElement(term1173, 2, 4044358158040652353L);
        term14286 = (long[]) newLongArray(3);
        setLongElement(term14286, 0, -7612550318181586304L);
        setLongElement(term14286, 1, -2170847986967241072L);
        setLongElement(term14286, 2, 4044358158040652353L);
        Long term14276 = new Long(-7612550318181586304L);
        Long term14278 = new Long(-2170847986967241072L);
        Long term14280 = new Long(4044358158040652353L);
        term14275 = (Object[]) newArray("java.lang.Long", 3);
        setElement(term14275, 0, term14276);
        setElement(term14275, 1, term14278);
        setElement(term14275, 2, term14280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1173;
        Object retValue = callMethod(klass, "toObject", argTypes, null, args);
        assertTrue(recursiveEquals(term1173, term14286));
        assertTrue(recursiveEquals(retValue, term14275));
    }

};


