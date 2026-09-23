package org.apache.commons.codec.language.bm;

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
import static org.apache.commons.codec.language.bm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.bm.EqualityUtils.*;

public class PhoneticEngine_join_59580970670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26261;
     Object term26276;

    public PhoneticEngine_join_59580970670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26261 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfLong"));
        term26276 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfLong"));
        setField(term26276, term26276.getClass(), "curChunk", null);
        setField(term26276, term26276.getClass(), "spine", null);
        setIntField(term26276, term26276.getClass(), "initialChunkPower", 0);
        setIntField(term26276, term26276.getClass(), "elementIndex", 0);
        setIntField(term26276, term26276.getClass(), "spineIndex", 0);
        setField(term26276, term26276.getClass(), "priorElementCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term26261;
        args[1] = null;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term26261, term26276));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


