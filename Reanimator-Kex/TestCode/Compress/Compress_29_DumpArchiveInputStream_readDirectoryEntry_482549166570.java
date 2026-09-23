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

public class DumpArchiveInputStream_readDirectoryEntry_482549166570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033078;
     Object term1033656;

    public DumpArchiveInputStream_readDirectoryEntry_482549166570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1033126 = new HashMap();
        term1033078 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1032204 = (byte[]) newByteArray(4);
        Object term1033352 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1033476 = newInstance(Class.forName("org.apache.commons.compress.utils.CRC32VerifyingInputStream"));
        Object term1033532 = newInstance(Class.forName("java.io.FilterInputStream"));
        byte[] term1032246 = (byte[]) newByteArray(560);
        setField(term1033078, term1033078.getClass(), "names", term1033126);
        setByteElement(term1032204, 0, (byte) 67);
        setByteElement(term1032204, 1, (byte) 76);
        setByteElement(term1032204, 2, (byte) 82);
        setByteElement(term1032204, 3, (byte) 73);
        setField(term1033078, term1033078.getClass(), "blockBuffer", term1032204);
        setIntField(term1033352, term1033352.getClass(), "readOffset", 49);
        setIntField(term1033352, term1033352.getClass(), "blockSize", 49);
        setField(term1033476, term1033476.getClass(), "in", term1033532);
        setField(term1033352, term1033352.getClass(), "in", term1033476);
        setBooleanField(term1033352, term1033352.getClass(), "isCompressed", true);
        setIntField(term1033352, term1033352.getClass(), "currBlkIdx", -1);
        setField(term1033352, term1033352.getClass(), "blockBuffer", term1032246);
        setField(term1033078, term1033078.getClass(), "raw", term1033352);
        Class<? extends Object> term1037003 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1037002 = ((Class) term1037003).getDeclaredField((String) "ADDR");
        ((Field) term1037002).setAccessible(true);
        Object enum166 = ((Field) term1037002).get((Object) null);
        term1033656 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1033816 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1033656, term1033656.getClass(), "size", 0L);
        setIntField(term1033816, term1033816.getClass(), "ino", 0);
        setField(term1033816, term1033816.getClass(), "type", enum166);
        setIntField(term1033816, term1033816.getClass(), "count", 0);
        setField(term1033656, term1033656.getClass(), "header", term1033816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1033656;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term1033078, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


