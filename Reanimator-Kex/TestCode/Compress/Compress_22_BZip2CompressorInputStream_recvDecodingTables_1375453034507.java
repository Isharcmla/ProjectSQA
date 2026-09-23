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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684382;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684382 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term684542 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term681303 = (boolean[]) newBooleanArray(383);
        byte[] term681687 = (byte[]) newByteArray(644);
        byte[] term682332 = (byte[]) newByteArray(161);
        setField(term684542, term684542.getClass(), "inUse", term681303);
        setField(term684542, term684542.getClass(), "recvDecodingTables_pos", null);
        setField(term684542, term684542.getClass(), "selector", term681687);
        setField(term684542, term684542.getClass(), "selectorMtf", term682332);
        setField(term684382, term684382.getClass(), "data", term684542);
        setIntField(term684382, term684382.getClass(), "bsLive", 32);
        setIntField(term684382, term684382.getClass(), "bsBuff", 2019078144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term684382, args);
    }

};


