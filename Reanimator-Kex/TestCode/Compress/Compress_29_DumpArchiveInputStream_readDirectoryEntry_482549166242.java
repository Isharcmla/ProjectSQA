package org.apache.commons.compress.archivers.dump;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266340;
     Object term266888;

    public DumpArchiveInputStream_readDirectoryEntry_482549166242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term266388 = new HashMap();
        term266340 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term265814 = (byte[]) newByteArray(0);
        Object term266614 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term266764 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        byte[] term265820 = (byte[]) newByteArray(258);
        setField(term266340, term266340.getClass(), "names", term266388);
        setField(term266340, term266340.getClass(), "blockBuffer", term265814);
        setIntField(term266614, term266614.getClass(), "readOffset", 5);
        setIntField(term266614, term266614.getClass(), "blockSize", 5);
        setField(term266614, term266614.getClass(), "in", term266764);
        setBooleanField(term266614, term266614.getClass(), "isCompressed", false);
        setField(term266614, term266614.getClass(), "blockBuffer", term265820);
        setField(term266340, term266340.getClass(), "raw", term266614);
        Class<? extends Object> term268853 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term268852 = ((Class) term268853).getDeclaredField((String) "END");
        ((Field) term268852).setAccessible(true);
        Object enum40 = ((Field) term268852).get((Object) null);
        term266888 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term267048 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term266888, term266888.getClass(), "size", 0L);
        setIntField(term267048, term267048.getClass(), "ino", 0);
        setField(term267048, term267048.getClass(), "type", enum40);
        setIntField(term267048, term267048.getClass(), "count", 0);
        setField(term266888, term266888.getClass(), "header", term267048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term266888;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term266340, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


