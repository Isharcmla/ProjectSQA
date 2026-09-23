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

public class ArrayUtils_add_437077037325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1721;
     Object term1728;
     Object term1730;

    public ArrayUtils_add_437077037325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1721 = (short[]) newShortArray(6);
        setShortElement(term1721, 0, (short) -31699);
        setShortElement(term1721, 1, (short) 28377);
        setShortElement(term1721, 2, (short) 27116);
        setShortElement(term1721, 3, (short) -6646);
        setShortElement(term1721, 4, (short) 18765);
        setShortElement(term1721, 5, (short) -31730);
        term1728 = new Integer(-1801760683);
        term1730 = new Short((short) -7525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = short.class;
        Object[] args = new Object[3];
        args[0] = term1721;
        args[1] = term1728;
        args[2] = term1730;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


