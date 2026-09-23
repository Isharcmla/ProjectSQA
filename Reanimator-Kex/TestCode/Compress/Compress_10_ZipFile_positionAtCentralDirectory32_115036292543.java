package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class ZipFile_positionAtCentralDirectory32_115036292543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4305;

    public ZipFile_positionAtCentralDirectory32_115036292543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4306 = new HashMap();
        HashMap term4330 = new HashMap();
        ArrayList term4380 = new ArrayList();
        term4305 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4376 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4377 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4305, term4305.getClass(), "entries", term4306);
        setField(term4305, term4305.getClass(), "nameMap", term4330);
        setField(term4305, term4305.getClass(), "encoding", "kNqaJKIATy");
        setField(term4305, term4305.getClass(), "zipEncoding", null);
        setField(term4305, term4305.getClass(), "archiveName", "vKQukfbJUd");
        setIntField(term4377, term4377.getClass(), "fd", -1);
        setLongField(term4377, term4377.getClass(), "handle", -1L);
        setField(term4377, term4377.getClass(), "parent", null);
        setField(term4377, term4377.getClass(), "otherParents", term4380);
        setBooleanField(term4377, term4377.getClass(), "closed", true);
        setBooleanField(term4377, term4377.getClass(), "append", false);
        setField(term4377, term4377.getClass(), "cleanup", null);
        setField(term4376, term4376.getClass(), "fd", term4377);
        setField(term4376, term4376.getClass(), "channel", null);
        setBooleanField(term4376, term4376.getClass(), "rw", false);
        setField(term4376, term4376.getClass(), "path", null);
        setField(term4376, term4376.getClass(), "closed", null);
        setField(term4305, term4305.getClass(), "archive", term4376);
        setBooleanField(term4305, term4305.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term4305, term4305.getClass(), "closed", false);
        setField(term4305, term4305.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "positionAtCentralDirectory32", argTypes, term4305, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


