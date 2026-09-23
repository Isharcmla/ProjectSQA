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

public class ArrayUtils_reverse_137130152209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;
     Object term12161;

    public ArrayUtils_reverse_137130152209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386 = (long[]) newLongArray(5);
        setLongElement(term386, 0, 2535595959091595249L);
        setLongElement(term386, 1, -5476826692763582090L);
        setLongElement(term386, 2, -872011222785455006L);
        setLongElement(term386, 3, -316468845751588286L);
        setLongElement(term386, 4, 5127676408959197577L);
        term12161 = (long[]) newLongArray(5);
        setLongElement(term12161, 0, 5127676408959197577L);
        setLongElement(term12161, 1, -316468845751588286L);
        setLongElement(term12161, 2, -872011222785455006L);
        setLongElement(term12161, 3, -5476826692763582090L);
        setLongElement(term12161, 4, 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term386;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term386, term12161));
    }

};


