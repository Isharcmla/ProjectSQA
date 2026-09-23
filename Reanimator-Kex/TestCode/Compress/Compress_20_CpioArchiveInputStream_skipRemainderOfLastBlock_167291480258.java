package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CpioArchiveInputStream_skipRemainderOfLastBlock_167291480258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26412;

    public CpioArchiveInputStream_skipRemainderOfLastBlock_167291480258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26412 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream"));
        setLongField(term26412, term26412.getClass(), "bytesRead", -9223372036854775808L);
        setIntField(term26412, term26412.getClass(), "blockSize", -268435456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipRemainderOfLastBlock", argTypes, term26412, args);
    }

};


