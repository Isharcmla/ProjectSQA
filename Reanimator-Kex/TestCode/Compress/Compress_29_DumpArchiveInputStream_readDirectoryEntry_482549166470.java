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

public class DumpArchiveInputStream_readDirectoryEntry_482549166470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806655;
     Object term807257;

    public DumpArchiveInputStream_readDirectoryEntry_482549166470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term806703 = new HashMap();
        term806655 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term806206 = (byte[]) newByteArray(4);
        Object term806929 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term807007 = newInstance(Class.forName("org.tukaani.xz.SeekableXZInputStream"));
        Object term807089 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        Object term807133 = newInstance(Class.forName("java.io.IOException"));
        byte[] term806247 = (byte[]) newByteArray(128);
        setField(term806655, term806655.getClass(), "names", term806703);
        setByteElement(term806206, 0, (byte) 67);
        setByteElement(term806206, 1, (byte) 76);
        setByteElement(term806206, 2, (byte) 82);
        setByteElement(term806206, 3, (byte) 73);
        setField(term806655, term806655.getClass(), "blockBuffer", term806206);
        setIntField(term806929, term806929.getClass(), "readOffset", 0);
        setIntField(term806929, term806929.getClass(), "blockSize", 0);
        setField(term807007, term807007.getClass(), "in", term807089);
        setField(term807007, term807007.getClass(), "exception", term807133);
        setField(term806929, term806929.getClass(), "in", term807007);
        setBooleanField(term806929, term806929.getClass(), "isCompressed", true);
        setIntField(term806929, term806929.getClass(), "currBlkIdx", 0);
        setField(term806929, term806929.getClass(), "blockBuffer", term806247);
        setField(term806655, term806655.getClass(), "raw", term806929);
        Class<? extends Object> term809721 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term809720 = ((Class) term809721).getDeclaredField((String) "TAPE");
        ((Field) term809720).setAccessible(true);
        Object enum124 = ((Field) term809720).get((Object) null);
        term807257 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term807417 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term807257, term807257.getClass(), "size", 0L);
        setIntField(term807417, term807417.getClass(), "ino", 0);
        setField(term807417, term807417.getClass(), "type", enum124);
        setIntField(term807417, term807417.getClass(), "count", 0);
        setField(term807257, term807257.getClass(), "header", term807417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term807257;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term806655, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


