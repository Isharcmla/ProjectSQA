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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642651;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642651 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term642811 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term639879 = (boolean[]) newBooleanArray(891);
        byte[] term640771 = (byte[]) newByteArray(0);
        byte[] term640772 = (byte[]) newByteArray(0);
        byte[] term640773 = (byte[]) newByteArray(0);
        setField(term642811, term642811.getClass(), "inUse", term639879);
        setField(term642811, term642811.getClass(), "recvDecodingTables_pos", term640771);
        setField(term642811, term642811.getClass(), "selector", term640772);
        setField(term642811, term642811.getClass(), "selectorMtf", term640773);
        setField(term642651, term642651.getClass(), "data", term642811);
        setIntField(term642651, term642651.getClass(), "bsLive", 30);
        setIntField(term642651, term642651.getClass(), "bsBuff", -1642714111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term642651, args);
    }

};


