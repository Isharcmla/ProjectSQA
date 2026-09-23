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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211397;
     Object term211931;

    public DumpArchiveInputStream_readDirectoryEntry_482549166212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term211445 = new HashMap();
        term211397 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term211097 = (byte[]) newByteArray(4);
        Object term211671 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term211807 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term211138 = (byte[]) newByteArray(2);
        setField(term211397, term211397.getClass(), "names", term211445);
        setByteElement(term211097, 0, (byte) 67);
        setByteElement(term211097, 1, (byte) 76);
        setByteElement(term211097, 2, (byte) 82);
        setByteElement(term211097, 3, (byte) 73);
        setField(term211397, term211397.getClass(), "blockBuffer", term211097);
        setIntField(term211671, term211671.getClass(), "readOffset", 0);
        setIntField(term211671, term211671.getClass(), "blockSize", 0);
        setField(term211671, term211671.getClass(), "in", term211807);
        setBooleanField(term211671, term211671.getClass(), "isCompressed", false);
        setField(term211671, term211671.getClass(), "blockBuffer", term211138);
        setField(term211397, term211397.getClass(), "raw", term211671);
        Class<? extends Object> term215396 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term215395 = ((Class) term215396).getDeclaredField((String) "ADDR");
        ((Field) term215395).setAccessible(true);
        Object enum37 = ((Field) term215395).get((Object) null);
        term211931 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term212091 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term211931, term211931.getClass(), "size", 0L);
        setIntField(term212091, term212091.getClass(), "ino", 0);
        setField(term212091, term212091.getClass(), "type", enum37);
        setIntField(term212091, term212091.getClass(), "count", 0);
        setField(term211931, term211931.getClass(), "header", term212091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term211931;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term211397, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


