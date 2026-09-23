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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395028;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395028 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term395188 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term391726 = (boolean[]) newBooleanArray(517);
        byte[] term392244 = (byte[]) newByteArray(424);
        byte[] term392669 = (byte[]) newByteArray(487);
        setField(term395188, term395188.getClass(), "inUse", term391726);
        setField(term395188, term395188.getClass(), "recvDecodingTables_pos", null);
        setField(term395188, term395188.getClass(), "selector", term392244);
        setField(term395188, term395188.getClass(), "selectorMtf", term392669);
        setField(term395028, term395028.getClass(), "data", term395188);
        setIntField(term395028, term395028.getClass(), "bsLive", 30);
        setIntField(term395028, term395028.getClass(), "bsBuff", 504759328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term395028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


