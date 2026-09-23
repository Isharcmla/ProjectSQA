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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408739;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408739 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term408899 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term404631 = (boolean[]) newBooleanArray(751);
        byte[] term405383 = (byte[]) newByteArray(751);
        setField(term408899, term408899.getClass(), "inUse", term404631);
        setField(term408899, term408899.getClass(), "recvDecodingTables_pos", term405383);
        setField(term408899, term408899.getClass(), "selector", term405383);
        setField(term408899, term408899.getClass(), "selectorMtf", null);
        setField(term408739, term408739.getClass(), "data", term408899);
        setIntField(term408739, term408739.getClass(), "bsLive", 29);
        setIntField(term408739, term408739.getClass(), "bsBuff", -1895104511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term408739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


