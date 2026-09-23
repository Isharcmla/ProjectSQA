package com.fasterxml.jackson.core.sym;

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
import static com.fasterxml.jackson.core.sym.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.sym.EqualityUtils.*;
import java.lang.Object;

public class ByteQuadsCanonicalizer_createRoot_126110925147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2587;

    public ByteQuadsCanonicalizer_createRoot_126110925147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2587 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer"));
        Object term2588 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicReference"));
        Object term2589 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$TableInfo"));
        int[] term2593 = (int[]) newIntArray(512);
        Object[] term3106 = (Object[]) newArray("java.lang.String", 128);
        setField(term2587, term2587.getClass(), "_parent", null);
        setIntField(term2589, term2589.getClass(), "size", 64);
        setIntField(term2589, term2589.getClass(), "count", 0);
        setIntField(term2589, term2589.getClass(), "tertiaryShift", 4);
        setField(term2589, term2589.getClass(), "mainHash", term2593);
        setField(term2589, term2589.getClass(), "names", term3106);
        setIntField(term2589, term2589.getClass(), "spilloverEnd", 448);
        setIntField(term2589, term2589.getClass(), "longNameOffset", 512);
        setField(term2588, term2588.getClass(), "value", term2589);
        setField(term2587, term2587.getClass(), "_tableInfo", term2588);
        setIntField(term2587, term2587.getClass(), "_seed", -987833433);
        setBooleanField(term2587, term2587.getClass(), "_intern", true);
        setBooleanField(term2587, term2587.getClass(), "_failOnDoS", true);
        setField(term2587, term2587.getClass(), "_hashArea", null);
        setIntField(term2587, term2587.getClass(), "_hashSize", 0);
        setIntField(term2587, term2587.getClass(), "_secondaryStart", 0);
        setIntField(term2587, term2587.getClass(), "_tertiaryStart", 0);
        setIntField(term2587, term2587.getClass(), "_tertiaryShift", 0);
        setIntField(term2587, term2587.getClass(), "_count", 0);
        setField(term2587, term2587.getClass(), "_names", null);
        setIntField(term2587, term2587.getClass(), "_spilloverEnd", 0);
        setIntField(term2587, term2587.getClass(), "_longNameOffset", 0);
        setBooleanField(term2587, term2587.getClass(), "_needRehash", false);
        setBooleanField(term2587, term2587.getClass(), "_hashShared", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createRoot", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term2587));
    }

};


