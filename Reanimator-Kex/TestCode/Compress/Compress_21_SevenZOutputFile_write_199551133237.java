package org.apache.commons.compress.archivers.sevenz;

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
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SevenZOutputFile_write_199551133237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3977;
     Object term4033;
     Object term4036;
     Object term4038;

    public SevenZOutputFile_write_199551133237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3982 = new ArrayList();
        ((ArrayList) term3982).add((Object)null);
        ArrayList term4003 = new ArrayList();
        Class<? extends Object> term21070 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term21069 = ((Class) term21070).getDeclaredField((String) "DEFLATE");
        ((Field) term21069).setAccessible(true);
        Object enum48 = ((Field) term21069).get((Object) null);
        term3977 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term3978 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term3979 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term4001 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term4008 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4010 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4014 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term4017 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3979, term3979.getClass(), "fd", -1);
        setLongField(term3979, term3979.getClass(), "handle", -1L);
        setField(term3979, term3979.getClass(), "parent", null);
        setField(term3979, term3979.getClass(), "otherParents", term3982);
        setBooleanField(term3979, term3979.getClass(), "closed", false);
        setBooleanField(term3979, term3979.getClass(), "append", true);
        setField(term3979, term3979.getClass(), "cleanup", null);
        setField(term3978, term3978.getClass(), "fd", term3979);
        setField(term3978, term3978.getClass(), "channel", null);
        setBooleanField(term3978, term3978.getClass(), "rw", false);
        setField(term3978, term3978.getClass(), "path", "nyiiPDVjAc");
        setIntField(term4001, term4001.getClass(), "value", 1328271830);
        setField(term3978, term3978.getClass(), "closed", term4001);
        setField(term3977, term3977.getClass(), "file", term3978);
        setField(term3977, term3977.getClass(), "files", term4003);
        setIntField(term3977, term3977.getClass(), "numNonEmptyStreams", 1596070772);
        setIntField(term4008, term4008.getClass(), "crc", 97029295);
        setField(term3977, term3977.getClass(), "crc32", term4008);
        setIntField(term4010, term4010.getClass(), "crc", -1371869594);
        setField(term3977, term3977.getClass(), "compressedCrc32", term4010);
        setLongField(term3977, term3977.getClass(), "fileBytesWritten", 6426732259596412988L);
        setBooleanField(term3977, term3977.getClass(), "finished", false);
        setLongField(term4014, term4014.getClass(), "bytesWritten", 185793058502220865L);
        setField(term4014, term4014.getClass(), "out", null);
        setBooleanField(term4014, term4014.getClass(), "closed", false);
        setField(term4014, term4014.getClass(), "closeLock", term4017);
        setField(term3977, term3977.getClass(), "currentOutputStream", term4014);
        setField(term3977, term3977.getClass(), "contentCompression", enum48);
        term4033 = (byte[]) newByteArray(2);
        setByteElement(term4033, 0, (byte) 75);
        setByteElement(term4033, 1, (byte) 18);
        term4036 = new Integer(-2095575670);
        term4038 = new Integer(1225272962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4033;
        args[1] = term4036;
        args[2] = term4038;
        try {
            callMethod(klass, "write", argTypes, term3977, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


