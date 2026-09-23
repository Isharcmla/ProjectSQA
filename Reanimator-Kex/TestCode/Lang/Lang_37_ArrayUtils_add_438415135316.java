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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ArrayUtils_add_438415135316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635;
     Object term1643;

    public ArrayUtils_add_438415135316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1635 = (long[]) newLongArray(7);
        setLongElement(term1635, 0, -2850532706972744550L);
        setLongElement(term1635, 1, -2644215923136513282L);
        setLongElement(term1635, 2, -1468719814009985452L);
        setLongElement(term1635, 3, -7738503207562305297L);
        setLongElement(term1635, 4, 3825396310311739952L);
        setLongElement(term1635, 5, -3838084482494604218L);
        setLongElement(term1635, 6, 3892018155439224435L);
        term1643 = new Long(5953383087795962419L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1635;
        args[1] = term1643;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


