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

public class ArrayUtils_add_436599869324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;
     Object term1736;
     Object term1738;

    public ArrayUtils_add_436599869324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727 = (int[]) newIntArray(8);
        setIntElement(term1727, 0, 1141317871);
        setIntElement(term1727, 1, 890669485);
        setIntElement(term1727, 2, 691577392);
        setIntElement(term1727, 3, -893623680);
        setIntElement(term1727, 4, -1963434938);
        setIntElement(term1727, 5, 906181092);
        setIntElement(term1727, 6, 1045657203);
        setIntElement(term1727, 7, 1386130016);
        term1736 = new Integer(1072005683);
        term1738 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1727;
        args[1] = term1736;
        args[2] = term1738;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


