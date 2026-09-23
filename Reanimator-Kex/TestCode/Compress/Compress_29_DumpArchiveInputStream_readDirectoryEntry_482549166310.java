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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class DumpArchiveInputStream_readDirectoryEntry_482549166310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433716;
     Object term434182;

    public DumpArchiveInputStream_readDirectoryEntry_482549166310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term433764 = new HashMap();
        term433716 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        byte[] term433456 = (byte[]) newByteArray(0);
        Object term433990 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term434058 = newInstance(Class.forName("java.util.Base64$DecInputStream"));
        setField(term433716, term433716.getClass(), "names", term433764);
        setField(term433716, term433716.getClass(), "blockBuffer", term433456);
        setIntField(term433990, term433990.getClass(), "readOffset", -1);
        setIntField(term433990, term433990.getClass(), "blockSize", -1);
        setField(term433990, term433990.getClass(), "in", term434058);
        setBooleanField(term433990, term433990.getClass(), "isCompressed", false);
        setField(term433990, term433990.getClass(), "blockBuffer", null);
        setField(term433716, term433716.getClass(), "raw", term433990);
        Class<? extends Object> term435340 = Class.forName((String) "org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE");
        Field term435339 = ((Class) term435340).getDeclaredField((String) "CLRI");
        ((Field) term435339).setAccessible(true);
        Object enum58 = ((Field) term435339).get((Object) null);
        term434182 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term434342 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        setLongField(term434182, term434182.getClass(), "size", 0L);
        setIntField(term434342, term434342.getClass(), "ino", 0);
        setField(term434342, term434342.getClass(), "type", enum58);
        setIntField(term434342, term434342.getClass(), "count", 0);
        setField(term434182, term434182.getClass(), "header", term434342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry");
        Object[] args = new Object[1];
        args[0] = term434182;
        try {
            callMethod(klass, "readDirectoryEntry", argTypes, term433716, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


