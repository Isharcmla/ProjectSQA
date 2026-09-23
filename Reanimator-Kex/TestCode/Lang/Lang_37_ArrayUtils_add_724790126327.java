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
import java.lang.Double;

public class ArrayUtils_add_724790126327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1772;
     Object term1779;
     Object term1781;

    public ArrayUtils_add_724790126327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1772 = (double[]) newDoubleArray(6);
        setDoubleElement(term1772, 0, 0.7865909711092062);
        setDoubleElement(term1772, 1, 0.06587158449170749);
        setDoubleElement(term1772, 2, 0.0865998004187658);
        setDoubleElement(term1772, 3, 0.9628647861255637);
        setDoubleElement(term1772, 4, 0.623231822150205);
        setDoubleElement(term1772, 5, 0.09037487793444521);
        term1779 = new Integer(53410913);
        term1781 = new Double(0.6561919196821765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term1772;
        args[1] = term1779;
        args[2] = term1781;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


