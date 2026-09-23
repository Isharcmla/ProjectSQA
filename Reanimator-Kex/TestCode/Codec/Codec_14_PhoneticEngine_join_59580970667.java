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

public class PhoneticEngine_join_59580970667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25895;
     Object term26079;

    public PhoneticEngine_join_59580970667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25895 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfLong"));
        term26079 = newInstance(Class.forName("java.util.stream.SpinedBuffer$OfLong"));
        setField(term26079, term26079.getClass(), "curChunk", null);
        setField(term26079, term26079.getClass(), "spine", null);
        setIntField(term26079, term26079.getClass(), "initialChunkPower", 0);
        setIntField(term26079, term26079.getClass(), "elementIndex", 0);
        setIntField(term26079, term26079.getClass(), "spineIndex", 0);
        setField(term26079, term26079.getClass(), "priorElementCount", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.bm.PhoneticEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Iterable");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term25895;
        args[1] = null;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term25895, term26079));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


