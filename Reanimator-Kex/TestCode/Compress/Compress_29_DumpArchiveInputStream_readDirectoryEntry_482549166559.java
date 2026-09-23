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

public class DumpArchiveInputStream_readDirectoryEntry_482549166559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012812;
     Object term1013340;

    public DumpArchiveInputStream_readDirectoryEntry_482549166559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1012860 = new HashMap();
        term1012812 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term1012247 = (byte[]) newByteArray(4);
        Object term1013086 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term1013216 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ExplodingInputStream"));
        byte[] term1012289 = (byte[]) newByteArray(256);
        setField(term1012812, term1012812.getClass(), "names", term1012860);
        setByteElement(term1012247, 0, (byte) 67);
        setByteElement(term1012247, 1, (byte) 76);
        setByteElement(term1012247, 2, (byte) 82);
        setByteElement(term1012247, 3, (byte) 73);
        setField(term1012812, term1012812.getClass(), "blockBuffer", term1012247);
        setIntField(term1013086, term1013086.getClass(), "readOffset", 1);
        setIntField(term1013086, term1013086.getClass(), "blockSize", 1);
        setField(term1013086, term1013086.getClass(), "in", term1013216);
        setBooleanField(term1013086, term1013086.getClass(), "isCompressed", true);
        setIntField(term1013086, term1013086.getClass(), "currBlkIdx", -1);
        setField(term1013086, term1013086.getClass(), "blockBuffer", term1012289);
        setField(term1012812, term1012812.getClass(), "raw", term1013086);
        Class<? extends Object> term1018511 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term1018510 = ((Class) term1018511).getDeclaredField((String) "END");
        ((Field) term1018510).setAccessible(true);
        Object enum160 = ((Field) term1018510).get((Object) null);
        term1013340 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term1013500 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term1013340, term1013340.getClass(), "size", 0L);
        setIntField(term1013500, term1013500.getClass(), "ino", 0);
        setField(term1013500, term1013500.getClass(), "type", enum160);
        setIntField(term1013500, term1013500.getClass(), "count", 0);
        setField(term1013340, term1013340.getClass(), "header", term1013500);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term1013340;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term1012812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


