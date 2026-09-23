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

public class BZip2CompressorInputStream_setupNoRandPartB_728330636150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75547;

    public BZip2CompressorInputStream_setupNoRandPartB_728330636150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75547 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term75651 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setIntField(term75547, term75547.getClass(), "su_ch2", -1);
        setIntField(term75547, term75547.getClass(), "su_chPrev", 0);
        setIntField(term75547, term75547.getClass(), "su_count", 0);
        setIntField(term75547, term75547.getClass(), "su_i2", -2147483647);
        setIntField(term75547, term75547.getClass(), "last", -2147483648);
        setIntField(term75547, term75547.getClass(), "currentState", 0);
        setIntField(term75651, term75651.getClass(), "globalCrc", -1);
        setField(term75547, term75547.getClass(), "crc", term75651);
        setIntField(term75547, term75547.getClass(), "computedBlockCRC", 0);
        setIntField(term75547, term75547.getClass(), "storedBlockCRC", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "setupNoRandPartB", argTypes, term75547, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


