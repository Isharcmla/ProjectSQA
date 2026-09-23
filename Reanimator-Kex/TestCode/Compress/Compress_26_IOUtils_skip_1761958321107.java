package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class IOUtils_skip_1761958321107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39600;
     Object term47309;

    public IOUtils_skip_1761958321107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39600 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term39674 = newInstance(Class.forName("org.tukaani.xz.SingleXZInputStream"));
        setLongField(term39600, term39600.getClass(), "max", 0L);
        setLongField(term39600, term39600.getClass(), "pos", -9223372036854775808L);
        setField(term39600, term39600.getClass(), "in", term39674);
        term47309 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream$BoundedInputStream"));
        Object term47310 = newInstance(Class.forName("org.tukaani.xz.SingleXZInputStream"));
        setField(term47310, term47310.getClass(), "in", null);
        setIntField(term47310, term47310.getClass(), "memoryLimit", 0);
        setField(term47310, term47310.getClass(), "streamHeaderFlags", null);
        setField(term47310, term47310.getClass(), "check", null);
        setField(term47310, term47310.getClass(), "blockDecoder", null);
        setField(term47310, term47310.getClass(), "indexHash", null);
        setBooleanField(term47310, term47310.getClass(), "endReached", false);
        setField(term47310, term47310.getClass(), "exception", null);
        setField(term47310, term47310.getClass(), "tempBuf", null);
        setField(term47309, term47309.getClass(), "in", term47310);
        setLongField(term47309, term47309.getClass(), "max", 0L);
        setLongField(term47309, term47309.getClass(), "pos", -9223372036854775808L);
        setField(term47309, term47309.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term39600;
        args[1] = 9223372034707292159L;
        Object retValue = callMethod(klass, "skip", argTypes, null, args);
        assertTrue(recursiveEquals(term39600, term47309));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


