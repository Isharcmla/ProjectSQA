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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160752;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160752 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term160912 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term157393 = (boolean[]) newBooleanArray(512);
        byte[] term157906 = (byte[]) newByteArray(512);
        byte[] term158419 = (byte[]) newByteArray(512);
        setField(term160912, term160912.getClass(), "inUse", term157393);
        setField(term160912, term160912.getClass(), "recvDecodingTables_pos", null);
        setField(term160912, term160912.getClass(), "selector", term157906);
        setField(term160912, term160912.getClass(), "selectorMtf", term158419);
        setField(term160752, term160752.getClass(), "data", term160912);
        setIntField(term160752, term160752.getClass(), "bsLive", 32);
        setIntField(term160752, term160752.getClass(), "bsBuff", 2019033120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term160752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


