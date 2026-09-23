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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376107;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376107 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term376267 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term375729 = (byte[]) newByteArray(0);
        Object term376331 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setField(term376267, term376267.getClass(), "inUse", null);
        setField(term376267, term376267.getClass(), "recvDecodingTables_pos", null);
        setField(term376267, term376267.getClass(), "selector", term375729);
        setField(term376267, term376267.getClass(), "selectorMtf", null);
        setField(term376107, term376107.getClass(), "data", term376267);
        setIntField(term376107, term376107.getClass(), "bsLive", 12);
        setIntField(term376107, term376107.getClass(), "bsBuff", 1926);
        setField(term376107, term376107.getClass(), "in", term376331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term376107, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


