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

public class ZipFile_startsWithLocalFileHeader_149656391347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4940;

    public ZipFile_startsWithLocalFileHeader_149656391347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4941 = new HashMap();
        HashMap term4965 = new HashMap();
        ArrayList term5015 = new ArrayList();
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        ((ArrayList) term5015).add((Object)null);
        term4940 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term5011 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term5012 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4940, term4940.getClass(), "entries", term4941);
        setField(term4940, term4940.getClass(), "nameMap", term4965);
        setField(term4940, term4940.getClass(), "encoding", "iIRsCSYqXH");
        setField(term4940, term4940.getClass(), "zipEncoding", null);
        setField(term4940, term4940.getClass(), "archiveName", "nghfqDXyCG");
        setIntField(term5012, term5012.getClass(), "fd", -1);
        setLongField(term5012, term5012.getClass(), "handle", -1L);
        setField(term5012, term5012.getClass(), "parent", null);
        setField(term5012, term5012.getClass(), "otherParents", term5015);
        setBooleanField(term5012, term5012.getClass(), "closed", false);
        setBooleanField(term5012, term5012.getClass(), "append", false);
        setField(term5012, term5012.getClass(), "cleanup", null);
        setField(term5011, term5011.getClass(), "fd", term5012);
        setField(term5011, term5011.getClass(), "channel", null);
        setBooleanField(term5011, term5011.getClass(), "rw", false);
        setField(term5011, term5011.getClass(), "path", null);
        setField(term5011, term5011.getClass(), "closed", null);
        setField(term4940, term4940.getClass(), "archive", term5011);
        setBooleanField(term4940, term4940.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term4940, term4940.getClass(), "closed", true);
        setField(term4940, term4940.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "startsWithLocalFileHeader", argTypes, term4940, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


