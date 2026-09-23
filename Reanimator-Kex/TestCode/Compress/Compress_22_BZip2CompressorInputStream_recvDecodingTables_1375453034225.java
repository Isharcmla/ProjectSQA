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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155977;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155977 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term156137 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term155586 = (boolean[]) newBooleanArray(136);
        byte[] term155723 = (byte[]) newByteArray(0);
        setField(term156137, term156137.getClass(), "inUse", term155586);
        setField(term156137, term156137.getClass(), "recvDecodingTables_pos", null);
        setField(term156137, term156137.getClass(), "selector", term155723);
        setField(term156137, term156137.getClass(), "selectorMtf", null);
        setField(term155977, term155977.getClass(), "data", term156137);
        setIntField(term155977, term155977.getClass(), "bsLive", 6);
        setIntField(term155977, term155977.getClass(), "bsBuff", -2146435048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term155977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


