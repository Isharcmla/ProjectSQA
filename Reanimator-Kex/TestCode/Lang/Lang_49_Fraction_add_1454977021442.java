package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_add_1454977021442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120190;
     Object term120270;
     Object term121225;
     Object term121226;
     Object term121222;

    public Fraction_add_1454977021442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term120190, term120190.getClass(), "numerator", 4);
        setIntField(term120190, term120190.getClass(), "denominator", 1245548);
        term120270 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term120270, term120270.getClass(), "numerator", 8);
        setIntField(term120270, term120270.getClass(), "denominator", -1048986);
        term121225 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term121225, term121225.getClass(), "numerator", 4);
        setIntField(term121225, term121225.getClass(), "denominator", 1245548);
        setField(term121225, term121225.getClass(), "toString", null);
        setField(term121225, term121225.getClass(), "toProperString", null);
        term121226 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term121226, term121226.getClass(), "numerator", 8);
        setIntField(term121226, term121226.getClass(), "denominator", -1048986);
        setField(term121226, term121226.getClass(), "toString", null);
        setField(term121226, term121226.getClass(), "toProperString", null);
        term121222 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term121222, term121222.getClass(), "numerator", 1442110);
        setIntField(term121222, term121222.getClass(), "denominator", -223089086);
        setField(term121222, term121222.getClass(), "toString", null);
        setField(term121222, term121222.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term120270;
        Object retValue = callMethod(klass, "add", argTypes, term120190, args);
        assertTrue(recursiveEquals(term120190, term121225));
        assertTrue(recursiveEquals(term120270, term121226));
        assertTrue(recursiveEquals(retValue, term121222));
    }

};


