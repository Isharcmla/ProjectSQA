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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270950;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270950 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term271110 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term268716 = (boolean[]) newBooleanArray(383);
        setField(term271110, term271110.getClass(), "inUse", term268716);
        setField(term271110, term271110.getClass(), "recvDecodingTables_pos", null);
        setField(term271110, term271110.getClass(), "selector", null);
        setField(term271110, term271110.getClass(), "selectorMtf", null);
        setField(term270950, term270950.getClass(), "data", term271110);
        setIntField(term270950, term270950.getClass(), "bsLive", 29);
        setIntField(term270950, term270950.getClass(), "bsBuff", 252379136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term270950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


