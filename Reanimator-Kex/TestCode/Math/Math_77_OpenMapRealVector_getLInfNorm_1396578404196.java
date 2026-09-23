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
import java.lang.Object;

public class OpenMapRealVector_getLInfNorm_1396578404196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214409;

    public OpenMapRealVector_getLInfNorm_1396578404196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214409 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term214517 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term214018 = (byte[]) newByteArray(15);
        setIntField(term214517, term214517.getClass(), "count", 0);
        setByteElement(term214018, 11, (byte) 1);
        setByteElement(term214018, 12, (byte) 1);
        setByteElement(term214018, 13, (byte) 1);
        setByteElement(term214018, 14, (byte) 1);
        setField(term214517, term214517.getClass(), "states", term214018);
        setField(term214409, term214409.getClass(), "entries", term214517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLInfNorm", argTypes, term214409, args);
    }

};


