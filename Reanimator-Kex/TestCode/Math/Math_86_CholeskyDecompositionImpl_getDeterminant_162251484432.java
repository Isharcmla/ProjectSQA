package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class CholeskyDecompositionImpl_getDeterminant_162251484432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16551;
     Object term19796;

    public CholeskyDecompositionImpl_getDeterminant_162251484432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16551 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term16419 = (Object[]) newArray("[D", 0);
        setField(term16551, term16551.getClass(), "lTData", term16419);
        term19796 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object[] term19797 = (Object[]) newArray("[D", 0);
        setField(term19796, term19796.getClass(), "lTData", term19797);
        setField(term19796, term19796.getClass(), "cachedL", null);
        setField(term19796, term19796.getClass(), "cachedLT", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDeterminant", argTypes, term16551, args);
        assertTrue(recursiveEquals(term16551, term19796));
        assertTrue(recursiveEquals(retValue, 1.0));
    }

};


