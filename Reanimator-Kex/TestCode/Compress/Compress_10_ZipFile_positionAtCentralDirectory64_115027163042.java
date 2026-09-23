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

public class ZipFile_positionAtCentralDirectory64_115027163042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201;

    public ZipFile_positionAtCentralDirectory64_115027163042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4202 = new HashMap();
        HashMap term4226 = new HashMap();
        ArrayList term4276 = new ArrayList();
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        ((ArrayList) term4276).add((Object)null);
        term4201 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4272 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4273 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4201, term4201.getClass(), "entries", term4202);
        setField(term4201, term4201.getClass(), "nameMap", term4226);
        setField(term4201, term4201.getClass(), "encoding", "JmcmxoGhIK");
        setField(term4201, term4201.getClass(), "zipEncoding", null);
        setField(term4201, term4201.getClass(), "archiveName", "jXzmYyrnnT");
        setIntField(term4273, term4273.getClass(), "fd", -1);
        setLongField(term4273, term4273.getClass(), "handle", -1L);
        setField(term4273, term4273.getClass(), "parent", null);
        setField(term4273, term4273.getClass(), "otherParents", term4276);
        setBooleanField(term4273, term4273.getClass(), "closed", false);
        setBooleanField(term4273, term4273.getClass(), "append", true);
        setField(term4273, term4273.getClass(), "cleanup", null);
        setField(term4272, term4272.getClass(), "fd", term4273);
        setField(term4272, term4272.getClass(), "channel", null);
        setBooleanField(term4272, term4272.getClass(), "rw", false);
        setField(term4272, term4272.getClass(), "path", null);
        setField(term4272, term4272.getClass(), "closed", null);
        setField(term4201, term4201.getClass(), "archive", term4272);
        setBooleanField(term4201, term4201.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term4201, term4201.getClass(), "closed", false);
        setField(term4201, term4201.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "positionAtCentralDirectory64", argTypes, term4201, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


