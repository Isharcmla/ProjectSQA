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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZipArchiveInputStream_init_40762374333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ZipArchiveInputStream_init_40762374333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21455 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        byte[] term20688 = (byte[]) newByteArray(0);
        byte[] term20680 = (byte[]) newByteArray(5);
        setField(term21455, term21455.getClass(), "SINGLE", term20688);
        setIntField(term21455, term21455.getClass(), "bytesRead", 0);
        setField(term21455, term21455.getClass(), "inf", null);
        setField(term21455, term21455.getClass(), "crc", null);
        setByteElement(term20680, 0, (byte) 117);
        setByteElement(term20680, 1, (byte) 116);
        setByteElement(term20680, 2, (byte) 102);
        setByteElement(term20680, 3, (byte) 45);
        setByteElement(term20680, 4, (byte) 56);
        setField(term21455, term21455.getClass(), "buf", term20680);
        setField(term21455, term21455.getClass(), "current", null);
        setBooleanField(term21455, term21455.getClass(), "closed", false);
        setBooleanField(term21455, term21455.getClass(), "hitCentralDirectory", false);
        setIntField(term21455, term21455.getClass(), "readBytesOfEntry", 0);
        setIntField(term21455, term21455.getClass(), "offsetInBuffer", 0);
        setIntField(term21455, term21455.getClass(), "bytesReadFromStream", 0);
        setIntField(term21455, term21455.getClass(), "lengthOfLastRead", 0);
        setBooleanField(term21455, term21455.getClass(), "hasDataDescriptor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


