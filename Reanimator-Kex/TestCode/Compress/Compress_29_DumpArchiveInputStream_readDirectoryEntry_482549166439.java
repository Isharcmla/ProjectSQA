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

public class DumpArchiveInputStream_readDirectoryEntry_482549166439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730468;
     Object term730934;

    public DumpArchiveInputStream_readDirectoryEntry_482549166439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term730516 = new HashMap();
        term730468 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term729681 = (byte[]) newByteArray(0);
        Object term730742 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term730810 = newInstance(Class.forName("java.util.Base64$DecInputStream"));
        byte[] term729687 = (byte[]) newByteArray(512);
        setField(term730468, term730468.getClass(), "names", term730516);
        setField(term730468, term730468.getClass(), "blockBuffer", term729681);
        setIntField(term730742, term730742.getClass(), "readOffset", 2);
        setIntField(term730742, term730742.getClass(), "blockSize", 2);
        setField(term730742, term730742.getClass(), "in", term730810);
        setBooleanField(term730742, term730742.getClass(), "isCompressed", false);
        setField(term730742, term730742.getClass(), "blockBuffer", term729687);
        setField(term730468, term730468.getClass(), "raw", term730742);
        Class<? extends Object> term738811 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term738810 = ((Class) term738811).getDeclaredField((String) "BITS");
        ((Field) term738810).setAccessible(true);
        Object enum107 = ((Field) term738810).get((Object) null);
        term730934 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term731094 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term730934, term730934.getClass(), "size", 0L);
        setIntField(term731094, term731094.getClass(), "ino", 0);
        setField(term731094, term731094.getClass(), "type", enum107);
        setIntField(term731094, term731094.getClass(), "count", 0);
        setField(term730934, term730934.getClass(), "header", term731094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term730934;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term730468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


