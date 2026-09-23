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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class ArrayUtils_add_435645533327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1759;
     Object term1765;
     Object term1767;

    public ArrayUtils_add_435645533327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1759 = (long[]) newLongArray(5);
        setLongElement(term1759, 0, 7994303628307559416L);
        setLongElement(term1759, 1, 2443640364875054177L);
        setLongElement(term1759, 2, -1610676979013636850L);
        setLongElement(term1759, 3, 2062173786000223358L);
        setLongElement(term1759, 4, -8658027316505137504L);
        term1765 = new Integer(1474524152);
        term1767 = new Long(414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = term1759;
        args[1] = term1765;
        args[2] = term1767;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


