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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446777;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446777 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term446937 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term444547 = (boolean[]) newBooleanArray(512);
        setField(term446937, term446937.getClass(), "inUse", term444547);
        setField(term446937, term446937.getClass(), "recvDecodingTables_pos", null);
        setField(term446937, term446937.getClass(), "selector", null);
        setField(term446937, term446937.getClass(), "selectorMtf", null);
        setField(term446777, term446777.getClass(), "data", term446937);
        setIntField(term446777, term446777.getClass(), "bsLive", 31);
        setIntField(term446777, term446777.getClass(), "bsBuff", 1009537024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term446777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


