package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_acos_1430561531401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97306;
     Object term98411;
     Object term98408;

    public Complex_acos_1430561531401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97306 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term97306, term97306.getClass(), "real", 2.3058430263935631E18);
        setDoubleField(term97306, term97306.getClass(), "imaginary", 4.6116860184273879E18);
        term98411 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98411, term98411.getClass(), "imaginary", 4.6116860184273879E18);
        setDoubleField(term98411, term98411.getClass(), "real", 2.3058430263935631E18);
        term98408 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term98408, term98408.getClass(), "imaginary", -43.77984415242378);
        setDoubleField(term98408, term98408.getClass(), "real", 1.1071487148138583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term97306, args);
        assertTrue(recursiveEquals(term97306, term98411));
        assertTrue(recursiveEquals(retValue, term98408));
    }

};


