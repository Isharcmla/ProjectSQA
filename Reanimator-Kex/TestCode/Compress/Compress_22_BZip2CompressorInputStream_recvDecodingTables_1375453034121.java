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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56920;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56920 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term57080 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        Object term57162 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        setField(term57080, term57080.getClass(), "inUse", null);
        setField(term57080, term57080.getClass(), "recvDecodingTables_pos", null);
        setField(term57080, term57080.getClass(), "selector", null);
        setField(term57080, term57080.getClass(), "selectorMtf", null);
        setField(term56920, term56920.getClass(), "data", term57080);
        setIntField(term56920, term56920.getClass(), "bsLive", 5);
        setIntField(term56920, term56920.getClass(), "bsBuff", 15);
        setField(term56920, term56920.getClass(), "in", term57162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term56920, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


