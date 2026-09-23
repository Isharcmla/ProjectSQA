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
import org.tukaani.xz.XZIOException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530214;
     Object term530680;

    public DumpArchiveInputStream_readDirectoryEntry_482549166344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term530262 = new HashMap();
        term530214 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term529429 = (byte[]) newByteArray(0);
        Object term530488 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term530556 = newInstance(Class.forName("org.tukaani.xz.LZMA2InputStream"));
        byte[] term529435 = (byte[]) newByteArray(512);
        setField(term530214, term530214.getClass(), "names", term530262);
        setField(term530214, term530214.getClass(), "blockBuffer", term529429);
        setIntField(term530488, term530488.getClass(), "readOffset", 1);
        setIntField(term530488, term530488.getClass(), "blockSize", 1);
        setField(term530488, term530488.getClass(), "in", term530556);
        setBooleanField(term530488, term530488.getClass(), "isCompressed", false);
        setField(term530488, term530488.getClass(), "blockBuffer", term529435);
        setField(term530214, term530214.getClass(), "raw", term530488);
        Class<? extends Object> term533893 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term533892 = ((Class) term533893).getDeclaredField((String) "END");
        ((Field) term533892).setAccessible(true);
        Object enum64 = ((Field) term533892).get((Object) null);
        term530680 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term530840 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term530680, term530680.getClass(), "size", 0L);
        setIntField(term530840, term530840.getClass(), "ino", 0);
        setField(term530840, term530840.getClass(), "type", enum64);
        setIntField(term530840, term530840.getClass(), "count", 0);
        setField(term530680, term530680.getClass(), "header", term530840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term530680;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term530214, args);
            assertTrue(false);
        }
        catch (XZIOException e) {
        }

    }

};


