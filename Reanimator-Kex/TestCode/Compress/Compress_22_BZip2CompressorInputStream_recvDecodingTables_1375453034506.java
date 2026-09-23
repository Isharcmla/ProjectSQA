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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679810;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679810 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term679970 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term676616 = (boolean[]) newBooleanArray(307);
        byte[] term676924 = (byte[]) newByteArray(716);
        byte[] term677641 = (byte[]) newByteArray(307);
        setField(term679970, term679970.getClass(), "inUse", term676616);
        setField(term679970, term679970.getClass(), "recvDecodingTables_pos", term676924);
        setField(term679970, term679970.getClass(), "selector", term677641);
        setField(term679970, term679970.getClass(), "selectorMtf", null);
        setField(term679810, term679810.getClass(), "data", term679970);
        setIntField(term679810, term679810.getClass(), "bsLive", 30);
        setIntField(term679810, term679810.getClass(), "bsBuff", 504758281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term679810, args);
    }

};


