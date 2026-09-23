package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;
import java.lang.Double;

public class MathUtils_normalizeArray_981223562106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term171;
     Object term8687;
     Object term8672;

    public MathUtils_normalizeArray_981223562106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = (double[]) newDoubleArray(6);
        setDoubleElement(term164, 0, 0.6588948704887806);
        setDoubleElement(term164, 1, 0.6397214730945112);
        setDoubleElement(term164, 2, 0.25937345430928016);
        setDoubleElement(term164, 3, 0.5873228247510078);
        setDoubleElement(term164, 4, 0.8823181080774973);
        setDoubleElement(term164, 5, 0.2192450926212024);
        term171 = new Double(0.7591353014991907);
        term8687 = (double[]) newDoubleArray(6);
        setDoubleElement(term8687, 0, 0.6588948704887806);
        setDoubleElement(term8687, 1, 0.6397214730945112);
        setDoubleElement(term8687, 2, 0.25937345430928016);
        setDoubleElement(term8687, 3, 0.5873228247510078);
        setDoubleElement(term8687, 4, 0.8823181080774973);
        setDoubleElement(term8687, 5, 0.2192450926212024);
        term8672 = (double[]) newDoubleArray(6);
        setDoubleElement(term8672, 0, 0.15405281365207343);
        setDoubleElement(term8672, 1, 0.1495699804291263);
        setDoubleElement(term8672, 2, 0.06064277051263292);
        setDoubleElement(term8672, 3, 0.13731892252835046);
        setDoubleElement(term8672, 4, 0.2062902492846575);
        setDoubleElement(term8672, 5, 0.05126056509235001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term164;
        args[1] = term171;
        Object retValue = callMethod(klass, "normalizeArray", argTypes, null, args);
        assertTrue(recursiveEquals(term164, term8687));
        assertTrue(recursiveEquals(term171, 0.7591353014991907));
        assertTrue(recursiveEquals(retValue, term8672));
    }

};


