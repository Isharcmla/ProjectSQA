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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667441;
     Object term667963;

    public DumpArchiveInputStream_readDirectoryEntry_482549166410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term667489 = new HashMap();
        term667441 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term666831 = (byte[]) newByteArray(4);
        Object term667715 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term667839 = newInstance(Class.forName("org.apache.commons.compress.utils.CRC32VerifyingInputStream"));
        byte[] term666873 = (byte[]) newByteArray(298);
        setField(term667441, term667441.getClass(), "names", term667489);
        setByteElement(term666831, 0, (byte) 67);
        setByteElement(term666831, 1, (byte) 76);
        setByteElement(term666831, 2, (byte) 82);
        setByteElement(term666831, 3, (byte) 73);
        setField(term667441, term667441.getClass(), "blockBuffer", term666831);
        setIntField(term667715, term667715.getClass(), "readOffset", 43);
        setIntField(term667715, term667715.getClass(), "blockSize", 43);
        setField(term667715, term667715.getClass(), "in", term667839);
        setBooleanField(term667715, term667715.getClass(), "isCompressed", true);
        setIntField(term667715, term667715.getClass(), "currBlkIdx", -1);
        setField(term667715, term667715.getClass(), "blockBuffer", term666873);
        setField(term667441, term667441.getClass(), "raw", term667715);
        Class<? extends Object> term670021 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term670020 = ((Class) term670021).getDeclaredField((String) "END");
        ((Field) term670020).setAccessible(true);
        Object enum88 = ((Field) term670020).get((Object) null);
        term667963 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term668123 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term667963, term667963.getClass(), "size", 0L);
        setIntField(term668123, term668123.getClass(), "ino", 0);
        setField(term668123, term668123.getClass(), "type", enum88);
        setIntField(term668123, term668123.getClass(), "count", 0);
        setField(term667963, term667963.getClass(), "header", term668123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term667963;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term667441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


