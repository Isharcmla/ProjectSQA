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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229906;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229906 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term230066 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term227503 = (boolean[]) newBooleanArray(377);
        byte[] term227881 = (byte[]) newByteArray(296);
        setField(term230066, term230066.getClass(), "inUse", term227503);
        setField(term230066, term230066.getClass(), "recvDecodingTables_pos", term227881);
        setField(term230066, term230066.getClass(), "selector", null);
        setField(term230066, term230066.getClass(), "selectorMtf", null);
        setField(term229906, term229906.getClass(), "data", term230066);
        setIntField(term229906, term229906.getClass(), "bsLive", 31);
        setIntField(term229906, term229906.getClass(), "bsBuff", 1009518592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term229906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


