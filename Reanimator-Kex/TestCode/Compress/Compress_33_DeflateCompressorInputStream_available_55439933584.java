package org.apache.commons.compress.compressors.deflate;

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
import static org.apache.commons.compress.compressors.deflate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.compressors.deflate.EqualityUtils.*;
import java.lang.Object;

public class DeflateCompressorInputStream_available_55439933584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22075;
     Object term24779;

    public DeflateCompressorInputStream_available_55439933584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22075 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term22233 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term22299 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setField(term22233, term22233.getClass(), "in", term22299);
        setField(term22075, term22075.getClass(), "in", term22233);
        term24779 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term24780 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term24781 = newInstance(Class.forName("org.tukaani.xz.LZMAInputStream"));
        setField(term24781, term24781.getClass(), "in", null);
        setField(term24781, term24781.getClass(), "lz", null);
        setField(term24781, term24781.getClass(), "rc", null);
        setField(term24781, term24781.getClass(), "lzma", null);
        setBooleanField(term24781, term24781.getClass(), "endReached", false);
        setField(term24781, term24781.getClass(), "tempBuf", null);
        setLongField(term24781, term24781.getClass(), "remainingSize", 0L);
        setField(term24781, term24781.getClass(), "exception", null);
        setField(term24780, term24780.getClass(), "in", term24781);
        setLongField(term24780, term24780.getClass(), "bytesRead", 0L);
        setField(term24779, term24779.getClass(), "in", term24780);
        setLongField(term24779, term24779.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "available", argTypes, term22075, args);
        assertTrue(recursiveEquals(term22075, term24779));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


