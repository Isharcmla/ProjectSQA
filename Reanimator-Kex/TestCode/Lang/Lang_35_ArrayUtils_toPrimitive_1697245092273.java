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

public class ArrayUtils_toPrimitive_1697245092273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;
     Object term1171;
     Object term14258;
     Object term14240;

    public ArrayUtils_toPrimitive_1697245092273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1161 = new Long(4872422362414183754L);
        Long term1163 = new Long(6811161968424632369L);
        Long term1165 = new Long(-7237588299778557629L);
        Long term1167 = new Long(6967924379644551255L);
        Long term1169 = new Long(-2813493605142626659L);
        term1160 = (Object[]) newArray("java.lang.Long", 5);
        setElement(term1160, 0, term1161);
        setElement(term1160, 1, term1163);
        setElement(term1160, 2, term1165);
        setElement(term1160, 3, term1167);
        setElement(term1160, 4, term1169);
        term1171 = new Long(4784595517102746672L);
        Long term14259 = new Long(4872422362414183754L);
        Long term14260 = new Long(6811161968424632369L);
        Long term14261 = new Long(-7237588299778557629L);
        Long term14262 = new Long(6967924379644551255L);
        Long term14263 = new Long(-2813493605142626659L);
        term14258 = (Object[]) newArray("java.lang.Long", 5);
        setElement(term14258, 0, term14259);
        setElement(term14258, 1, term14260);
        setElement(term14258, 2, term14261);
        setElement(term14258, 3, term14262);
        setElement(term14258, 4, term14263);
        term14240 = (long[]) newLongArray(5);
        setLongElement(term14240, 0, 4872422362414183754L);
        setLongElement(term14240, 1, 6811161968424632369L);
        setLongElement(term14240, 2, -7237588299778557629L);
        setLongElement(term14240, 3, 6967924379644551255L);
        setLongElement(term14240, 4, -2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Long"), 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1160;
        args[1] = term1171;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1160, term14258));
        assertTrue(recursiveEquals(term1171, 4784595517102746672L));
        assertTrue(recursiveEquals(retValue, term14240));
    }

};


