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
import java.lang.OutOfMemoryError;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ArrayUtils_subarray_115481797193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term162;
     Object term164;

    public ArrayUtils_subarray_115481797193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = (short[]) newShortArray(5);
        setShortElement(term156, 0, (short) -19694);
        setShortElement(term156, 1, (short) 31942);
        setShortElement(term156, 2, (short) 30947);
        setShortElement(term156, 3, (short) 27594);
        setShortElement(term156, 4, (short) 7670);
        term162 = new Integer(597278769);
        term164 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term156;
        args[1] = term162;
        args[2] = term164;
        try {
            callMethod(klass, "subarray", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


