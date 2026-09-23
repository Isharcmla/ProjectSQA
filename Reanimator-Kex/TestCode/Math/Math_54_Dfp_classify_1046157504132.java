package org.apache.commons.math.dfp;

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
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Dfp_classify_1046157504132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886411;

    public Dfp_classify_1046157504132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886411 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        setField(term886411, term886411.getClass(), "mant", null);
        setByteField(term886411, term886411.getClass(), "sign", (byte) 0);
        setIntField(term886411, term886411.getClass(), "exp", 0);
        setByteField(term886411, term886411.getClass(), "nans", (byte) 0);
        setField(term886411, term886411.getClass(), "field", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classify", argTypes, term886411, args);
    }

};


