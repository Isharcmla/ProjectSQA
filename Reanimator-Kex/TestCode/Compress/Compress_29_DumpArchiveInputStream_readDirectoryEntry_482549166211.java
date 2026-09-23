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

public class DumpArchiveInputStream_readDirectoryEntry_482549166211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209788;
     Object term210308;

    public DumpArchiveInputStream_readDirectoryEntry_482549166211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term209836 = new HashMap();
        term209788 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term209531 = (byte[]) newByteArray(0);
        Object term210062 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term210184 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        setField(term209788, term209788.getClass(), "names", term209836);
        setField(term209788, term209788.getClass(), "blockBuffer", term209531);
        setIntField(term210062, term210062.getClass(), "readOffset", 0);
        setIntField(term210062, term210062.getClass(), "blockSize", 0);
        setField(term210062, term210062.getClass(), "in", term210184);
        setBooleanField(term210062, term210062.getClass(), "isCompressed", true);
        setField(term209788, term209788.getClass(), "raw", term210062);
        Class<? extends Object> term214076 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term214075 = ((Class) term214076).getDeclaredField((String) "TAPE");
        ((Field) term214075).setAccessible(true);
        Object enum35 = ((Field) term214075).get((Object) null);
        term210308 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term210468 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term210308, term210308.getClass(), "size", 0L);
        setIntField(term210468, term210468.getClass(), "ino", 0);
        setField(term210468, term210468.getClass(), "type", enum35);
        setIntField(term210468, term210468.getClass(), "count", 0);
        setField(term210308, term210308.getClass(), "header", term210468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term210308;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term209788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


