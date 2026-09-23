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

public class ArrayUtils_toPrimitive_1699580642272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147;
     Object term14214;
     Object term14194;

    public ArrayUtils_toPrimitive_1699580642272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1148 = new Long(2442117782898005296L);
        Long term1150 = new Long(6375119433582206027L);
        Long term1152 = new Long(-8257434502486459194L);
        Long term1154 = new Long(-8400487765614892086L);
        Long term1156 = new Long(5270370404989704783L);
        Long term1158 = new Long(7411271909051562686L);
        term1147 = (Object[]) newArray("java.lang.Long", 6);
        setElement(term1147, 0, term1148);
        setElement(term1147, 1, term1150);
        setElement(term1147, 2, term1152);
        setElement(term1147, 3, term1154);
        setElement(term1147, 4, term1156);
        setElement(term1147, 5, term1158);
        Long term14215 = new Long(2442117782898005296L);
        Long term14216 = new Long(6375119433582206027L);
        Long term14217 = new Long(-8257434502486459194L);
        Long term14218 = new Long(-8400487765614892086L);
        Long term14219 = new Long(5270370404989704783L);
        Long term14220 = new Long(7411271909051562686L);
        term14214 = (Object[]) newArray("java.lang.Long", 6);
        setElement(term14214, 0, term14215);
        setElement(term14214, 1, term14216);
        setElement(term14214, 2, term14217);
        setElement(term14214, 3, term14218);
        setElement(term14214, 4, term14219);
        setElement(term14214, 5, term14220);
        term14194 = (long[]) newLongArray(6);
        setLongElement(term14194, 0, 2442117782898005296L);
        setLongElement(term14194, 1, 6375119433582206027L);
        setLongElement(term14194, 2, -8257434502486459194L);
        setLongElement(term14194, 3, -8400487765614892086L);
        setLongElement(term14194, 4, 5270370404989704783L);
        setLongElement(term14194, 5, 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Long"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1147;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1147, term14214));
        assertTrue(recursiveEquals(retValue, term14194));
    }

};


