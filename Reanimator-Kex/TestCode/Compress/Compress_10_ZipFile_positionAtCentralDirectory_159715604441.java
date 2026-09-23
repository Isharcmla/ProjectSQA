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

public class ZipFile_positionAtCentralDirectory_159715604441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4097;

    public ZipFile_positionAtCentralDirectory_159715604441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4098 = new HashMap();
        HashMap term4122 = new HashMap();
        ArrayList term4172 = new ArrayList();
        ((ArrayList) term4172).add((Object)null);
        ((ArrayList) term4172).add((Object)null);
        ((ArrayList) term4172).add((Object)null);
        ((ArrayList) term4172).add((Object)null);
        ((ArrayList) term4172).add((Object)null);
        term4097 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4168 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4169 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4097, term4097.getClass(), "entries", term4098);
        setField(term4097, term4097.getClass(), "nameMap", term4122);
        setField(term4097, term4097.getClass(), "encoding", "smnHEqRFRx");
        setField(term4097, term4097.getClass(), "zipEncoding", null);
        setField(term4097, term4097.getClass(), "archiveName", "XYtryyobou");
        setIntField(term4169, term4169.getClass(), "fd", -1);
        setLongField(term4169, term4169.getClass(), "handle", -1L);
        setField(term4169, term4169.getClass(), "parent", null);
        setField(term4169, term4169.getClass(), "otherParents", term4172);
        setBooleanField(term4169, term4169.getClass(), "closed", true);
        setBooleanField(term4169, term4169.getClass(), "append", false);
        setField(term4169, term4169.getClass(), "cleanup", null);
        setField(term4168, term4168.getClass(), "fd", term4169);
        setField(term4168, term4168.getClass(), "channel", null);
        setBooleanField(term4168, term4168.getClass(), "rw", false);
        setField(term4168, term4168.getClass(), "path", null);
        setField(term4168, term4168.getClass(), "closed", null);
        setField(term4097, term4097.getClass(), "archive", term4168);
        setBooleanField(term4097, term4097.getClass(), "useUnicodeExtraFields", false);
        setBooleanField(term4097, term4097.getClass(), "closed", true);
        setField(term4097, term4097.getClass(), "OFFSET_COMPARATOR", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "positionAtCentralDirectory", argTypes, term4097, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


