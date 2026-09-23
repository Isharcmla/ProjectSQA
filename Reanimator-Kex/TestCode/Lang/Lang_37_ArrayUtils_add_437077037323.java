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
import java.lang.Short;

public class ArrayUtils_add_437077037323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1710;
     Object term1717;
     Object term1719;

    public ArrayUtils_add_437077037323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1710 = (short[]) newShortArray(6);
        setShortElement(term1710, 0, (short) -31699);
        setShortElement(term1710, 1, (short) 28377);
        setShortElement(term1710, 2, (short) 27116);
        setShortElement(term1710, 3, (short) -6646);
        setShortElement(term1710, 4, (short) 18765);
        setShortElement(term1710, 5, (short) -31730);
        term1717 = new Integer(-1801760683);
        term1719 = new Short((short) -7525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term1710;
        args[1] = term1717;
        args[2] = term1719;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


