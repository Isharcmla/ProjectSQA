package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.DimensionMismatchException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MathArrays_checkRectangular_70359231759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1580;

    public MathArrays_checkRectangular_70359231759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1580 = (Object[]) newArray("[J", 5);
        long[] term1581 = (long[]) newLongArray(3);
        long[] term1585 = (long[]) newLongArray(7);
        long[] term1593 = (long[]) newLongArray(2);
        long[] term1596 = (long[]) newLongArray(6);
        long[] term1603 = (long[]) newLongArray(6);
        setLongElement(term1581, 0, 2442117782898005296L);
        setLongElement(term1581, 1, 6375119433582206027L);
        setLongElement(term1581, 2, -8257434502486459194L);
        setElement(term1580, 0, term1581);
        setLongElement(term1585, 0, -8400487765614892086L);
        setLongElement(term1585, 1, 5270370404989704783L);
        setLongElement(term1585, 2, 7411271909051562686L);
        setLongElement(term1585, 3, 4872422362414183754L);
        setLongElement(term1585, 4, 6811161968424632369L);
        setLongElement(term1585, 5, -7237588299778557629L);
        setLongElement(term1585, 6, 6967924379644551255L);
        setElement(term1580, 1, term1585);
        setLongElement(term1593, 0, -2813493605142626659L);
        setLongElement(term1593, 1, -8885298608300233488L);
        setElement(term1580, 2, term1593);
        setLongElement(term1596, 0, -4325723315152823407L);
        setLongElement(term1596, 1, 2535595959091595249L);
        setLongElement(term1596, 2, -5476826692763582090L);
        setLongElement(term1596, 3, -872011222785455006L);
        setLongElement(term1596, 4, -316468845751588286L);
        setLongElement(term1596, 5, 5127676408959197577L);
        setElement(term1580, 3, term1596);
        setLongElement(term1603, 0, -6573104506744284592L);
        setLongElement(term1603, 1, -4920224193275732920L);
        setLongElement(term1603, 2, 8428634514691209827L);
        setLongElement(term1603, 3, -2585684163342970173L);
        setLongElement(term1603, 4, 8059786003080744426L);
        setLongElement(term1603, 5, -4365849114644724155L);
        setElement(term1580, 4, term1603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1580;
        try {
            callMethod(klass, "checkRectangular", argTypes, null, args);
            assertTrue(false);
        }
        catch (DimensionMismatchException e) {
        }

    }

};


