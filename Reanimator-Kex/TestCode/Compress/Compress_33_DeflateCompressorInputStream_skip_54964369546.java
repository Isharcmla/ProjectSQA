package org.apache.commons.compress.compressors.deflate;

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
import static org.apache.commons.compress.compressors.deflate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.compressors.deflate.EqualityUtils.*;
import java.lang.Object;

public class DeflateCompressorInputStream_skip_54964369546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11325;
     Object term11634;

    public DeflateCompressorInputStream_skip_54964369546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11325 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term11381 = newInstance(Class.forName("java.io.ObjectInputStream"));
        setField(term11325, term11325.getClass(), "in", term11381);
        term11634 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term11635 = newInstance(Class.forName("java.io.ObjectInputStream"));
        setField(term11635, term11635.getClass(), "bin", null);
        setField(term11635, term11635.getClass(), "vlist", null);
        setLongField(term11635, term11635.getClass(), "depth", 0L);
        setLongField(term11635, term11635.getClass(), "totalObjectRefs", 0L);
        setBooleanField(term11635, term11635.getClass(), "closed", false);
        setField(term11635, term11635.getClass(), "handles", null);
        setIntField(term11635, term11635.getClass(), "passHandle", 0);
        setBooleanField(term11635, term11635.getClass(), "defaultDataEnd", false);
        setBooleanField(term11635, term11635.getClass(), "enableOverride", false);
        setBooleanField(term11635, term11635.getClass(), "enableResolve", false);
        setField(term11635, term11635.getClass(), "curContext", null);
        setField(term11635, term11635.getClass(), "serialFilter", null);
        setField(term11634, term11634.getClass(), "in", term11635);
        setLongField(term11634, term11634.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = 0L;
        Object retValue = callMethod(klass, "skip", argTypes, term11325, args);
        assertTrue(recursiveEquals(term11325, term11634));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


