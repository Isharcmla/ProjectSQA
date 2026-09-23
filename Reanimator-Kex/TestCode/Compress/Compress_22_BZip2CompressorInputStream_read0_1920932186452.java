package org.apache.commons.compress.compressors.bzip2;

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
import java.lang.NullPointerException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_read0_1920932186452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581664;

    public BZip2CompressorInputStream_read0_1920932186452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581664 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term581824 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setIntField(term581664, term581664.getClass(), "currentChar", 0);
        setIntField(term581664, term581664.getClass(), "currentState", 3);
        setIntField(term581664, term581664.getClass(), "su_ch2", -1);
        setIntField(term581664, term581664.getClass(), "su_chPrev", 0);
        setIntField(term581664, term581664.getClass(), "su_count", 0);
        setIntField(term581664, term581664.getClass(), "su_i2", -2147483648);
        setIntField(term581664, term581664.getClass(), "last", -2147483648);
        setField(term581664, term581664.getClass(), "data", term581824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read0", argTypes, term581664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


