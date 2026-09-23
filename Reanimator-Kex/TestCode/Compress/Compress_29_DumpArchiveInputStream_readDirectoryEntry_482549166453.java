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

public class DumpArchiveInputStream_readDirectoryEntry_482549166453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term767835;
     Object term768493;

    public DumpArchiveInputStream_readDirectoryEntry_482549166453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term767883 = new HashMap();
        term767835 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term766860 = (byte[]) newByteArray(0);
        Object term768109 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term768245 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term768369 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        byte[] term767513 = (byte[]) newByteArray(0);
        byte[] term766867 = (byte[]) newByteArray(640);
        setField(term767835, term767835.getClass(), "names", term767883);
        setField(term767835, term767835.getClass(), "blockBuffer", term766860);
        setIntField(term768109, term768109.getClass(), "readOffset", 597);
        setIntField(term768109, term768109.getClass(), "blockSize", 597);
        setBooleanField(term768245, term768245.getClass(), "hasHitEOF", false);
        setBooleanField(term768245, term768245.getClass(), "isClosed", false);
        setLongField(term768245, term768245.getClass(), "entryOffset", 576495936675512320L);
        setLongField(term768245, term768245.getClass(), "entrySize", 576495936675512576L);
        setField(term768245, term768245.getClass(), "active", term768369);
        setField(term768245, term768245.getClass(), "readBuf", term767513);
        setIntField(term768245, term768245.getClass(), "recordOffset", -2147483648);
        setField(term768109, term768109.getClass(), "in", term768245);
        setBooleanField(term768109, term768109.getClass(), "isCompressed", true);
        setIntField(term768109, term768109.getClass(), "currBlkIdx", -1);
        setField(term768109, term768109.getClass(), "blockBuffer", term766867);
        setField(term767835, term767835.getClass(), "raw", term768109);
        Class<? extends Object> term777670 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term777669 = ((Class) term777670).getDeclaredField((String) "END");
        ((Field) term777669).setAccessible(true);
        Object enum119 = ((Field) term777669).get((Object) null);
        term768493 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term768653 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term768493, term768493.getClass(), "size", 0L);
        setIntField(term768653, term768653.getClass(), "ino", 0);
        setField(term768653, term768653.getClass(), "type", enum119);
        setIntField(term768653, term768653.getClass(), "count", 0);
        setField(term768493, term768493.getClass(), "header", term768653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term768493;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term767835, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


