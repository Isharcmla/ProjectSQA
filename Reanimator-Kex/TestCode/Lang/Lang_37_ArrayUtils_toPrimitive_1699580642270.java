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

public class ArrayUtils_toPrimitive_1699580642270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1136;
     Object term14168;
     Object term14148;

    public ArrayUtils_toPrimitive_1699580642270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1137 = new Long(2442117782898005296L);
        Long term1139 = new Long(6375119433582206027L);
        Long term1141 = new Long(-8257434502486459194L);
        Long term1143 = new Long(-8400487765614892086L);
        Long term1145 = new Long(5270370404989704783L);
        Long term1147 = new Long(7411271909051562686L);
        term1136 = (Object[]) newArray("java.lang.Long", 6);
        setElement(term1136, 0, term1137);
        setElement(term1136, 1, term1139);
        setElement(term1136, 2, term1141);
        setElement(term1136, 3, term1143);
        setElement(term1136, 4, term1145);
        setElement(term1136, 5, term1147);
        Long term14169 = new Long(2442117782898005296L);
        Long term14170 = new Long(6375119433582206027L);
        Long term14171 = new Long(-8257434502486459194L);
        Long term14172 = new Long(-8400487765614892086L);
        Long term14173 = new Long(5270370404989704783L);
        Long term14174 = new Long(7411271909051562686L);
        term14168 = (Object[]) newArray("java.lang.Long", 6);
        setElement(term14168, 0, term14169);
        setElement(term14168, 1, term14170);
        setElement(term14168, 2, term14171);
        setElement(term14168, 3, term14172);
        setElement(term14168, 4, term14173);
        setElement(term14168, 5, term14174);
        term14148 = (long[]) newLongArray(6);
        setLongElement(term14148, 0, 2442117782898005296L);
        setLongElement(term14148, 1, 6375119433582206027L);
        setLongElement(term14148, 2, -8257434502486459194L);
        setLongElement(term14148, 3, -8400487765614892086L);
        setLongElement(term14148, 4, 5270370404989704783L);
        setLongElement(term14148, 5, 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Long"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1136;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1136, term14168));
        assertTrue(recursiveEquals(retValue, term14148));
    }

};


