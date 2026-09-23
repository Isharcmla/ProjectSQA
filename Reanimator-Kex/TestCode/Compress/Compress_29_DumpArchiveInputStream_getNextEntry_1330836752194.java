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
import java.util.LinkedList;
import java.lang.Object;

public class DumpArchiveInputStream_getNextEntry_1330836752194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174065;

    public DumpArchiveInputStream_getNextEntry_1330836752194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term174119 = new LinkedList();
        term174065 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term174243 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry"));
        Object term174403 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader"));
        byte[] term173884 = (byte[]) newByteArray(8);
        setField(term174065, term174065.getClass(), "queue", term174119);
        setBooleanField(term174065, term174065.getClass(), "hasHitEOF", false);
        setIntField(term174065, term174065.getClass(), "readIdx", -2147483648);
        setIntField(term174403, term174403.getClass(), "count", -2147483647);
        setField(term174403, term174403.getClass(), "cdata", term173884);
        setField(term174243, term174243.getClass(), "header", term174403);
        setField(term174065, term174065.getClass(), "active", term174243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNextEntry", argTypes, term174065, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


