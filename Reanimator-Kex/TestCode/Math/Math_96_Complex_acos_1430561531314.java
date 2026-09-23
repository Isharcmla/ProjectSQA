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

public class Complex_acos_1430561531314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65708;
     Object term66717;
     Object term66714;

    public Complex_acos_1430561531314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65708 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term65708, term65708.getClass(), "real", 1.45241087982698496E17);
        setDoubleField(term65708, term65708.getClass(), "imaginary", 2.3080948090273792E18);
        term66717 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66717, term66717.getClass(), "imaginary", 2.3080948090273792E18);
        setDoubleField(term66717, term66717.getClass(), "real", 1.45241087982698496E17);
        term66714 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66714, term66714.getClass(), "imaginary", -42.97807726395211);
        setDoubleField(term66714, term66714.getClass(), "real", 1.5079523596682503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term65708, args);
        assertTrue(recursiveEquals(term65708, term66717));
        assertTrue(recursiveEquals(retValue, term66714));
    }

};


