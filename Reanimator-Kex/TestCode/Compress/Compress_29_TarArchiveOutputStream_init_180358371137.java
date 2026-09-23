package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class TarArchiveOutputStream_init_180358371137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term11806;

    public TarArchiveOutputStream_init_180358371137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term11806 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term11807 = (byte[]) newByteArray(512);
        byte[] term11808 = (byte[]) newByteArray(512);
        Object term11809 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term11810 = newInstance(Class.forName("java.lang.Object"));
        Object term11811 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term11814 = (byte[]) newByteArray(1);
        setLongField(term11806, term11806.getClass(), "currSize", 0L);
        setField(term11806, term11806.getClass(), "currName", null);
        setLongField(term11806, term11806.getClass(), "currBytes", 0L);
        setField(term11806, term11806.getClass(), "recordBuf", term11807);
        setIntField(term11806, term11806.getClass(), "assemLen", 0);
        setField(term11806, term11806.getClass(), "assemBuf", term11808);
        setIntField(term11806, term11806.getClass(), "longFileMode", 0);
        setIntField(term11806, term11806.getClass(), "bigNumberMode", 0);
        setIntField(term11806, term11806.getClass(), "recordsWritten", 0);
        setIntField(term11806, term11806.getClass(), "recordsPerBlock", 2270826);
        setIntField(term11806, term11806.getClass(), "recordSize", 512);
        setBooleanField(term11806, term11806.getClass(), "closed", false);
        setBooleanField(term11806, term11806.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term11806, term11806.getClass(), "finished", false);
        setLongField(term11809, term11809.getClass(), "bytesWritten", 0L);
        setField(term11809, term11809.getClass(), "out", null);
        setBooleanField(term11809, term11809.getClass(), "closed", false);
        setField(term11809, term11809.getClass(), "closeLock", term11810);
        setField(term11806, term11806.getClass(), "out", term11809);
        setField(term11811, term11811.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term11806, term11806.getClass(), "zipEncoding", term11811);
        setBooleanField(term11806, term11806.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term11806, term11806.getClass(), "oneByte", term11814);
        setLongField(term11806, term11806.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11806));
        assertTrue(recursiveEquals(term25, "sjlJAEtRrb"));
    }

};


