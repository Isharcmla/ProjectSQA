package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;
import java.lang.Integer;

public class DoubleMetaphone_conditionM0_40348939775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2884;
     Object term2898;
     Object term16159;

    public DoubleMetaphone_conditionM0_40348939775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2884 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term2884, term2884.getClass(), "maxCodeLen", 4);
        term2898 = new Integer(1063420942);
        term16159 = newInstance(Class.forName("org.apache.commons.codec.language.DoubleMetaphone"));
        setIntField(term16159, term16159.getClass(), "maxCodeLen", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.DoubleMetaphone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "uWHnvSvaPl";
        args[1] = term2898;
        Object retValue = callMethod(klass, "conditionM0", argTypes, term2884, args);
        assertTrue(recursiveEquals(term2884, term16159));
        assertTrue(recursiveEquals(term2898, 1063420942));
        assertTrue(recursiveEquals(retValue, false));
    }

};


