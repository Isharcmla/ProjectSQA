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

public class DumpArchiveInputStream_readDirectoryEntry_482549166440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736424;
     Object term736908;

    public DumpArchiveInputStream_readDirectoryEntry_482549166440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term736472 = new HashMap();
        term736424 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term735859 = (byte[]) newByteArray(4);
        Object term736698 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term736784 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        byte[] term735901 = (byte[]) newByteArray(256);
        setField(term736424, term736424.getClass(), "names", term736472);
        setByteElement(term735859, 0, (byte) 67);
        setByteElement(term735859, 1, (byte) 76);
        setByteElement(term735859, 2, (byte) 82);
        setByteElement(term735859, 3, (byte) 73);
        setField(term736424, term736424.getClass(), "blockBuffer", term735859);
        setIntField(term736698, term736698.getClass(), "readOffset", 1);
        setIntField(term736698, term736698.getClass(), "blockSize", 1);
        setField(term736698, term736698.getClass(), "in", term736784);
        setBooleanField(term736698, term736698.getClass(), "isCompressed", true);
        setIntField(term736698, term736698.getClass(), "currBlkIdx", -1);
        setField(term736698, term736698.getClass(), "blockBuffer", term735901);
        setField(term736424, term736424.getClass(), "raw", term736698);
        Class<? extends Object> term740568 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term740567 = ((Class) term740568).getDeclaredField((String) "END");
        ((Field) term740567).setAccessible(true);
        Object enum109 = ((Field) term740567).get((Object) null);
        term736908 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term737068 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term736908, term736908.getClass(), "size", 0L);
        setIntField(term737068, term737068.getClass(), "ino", 0);
        setField(term737068, term737068.getClass(), "type", enum109);
        setIntField(term737068, term737068.getClass(), "count", 0);
        setField(term736908, term736908.getClass(), "header", term737068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term736908;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term736424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


