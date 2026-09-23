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
import java.lang.Long;

public class ZipFile_tryToLocateSignature_190099819844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4409;
     Object term4493;
     Object term4495;
     Object term4497;

    public ZipFile_tryToLocateSignature_190099819844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4410 = new HashMap();
        HashMap term4434 = new HashMap();
        ArrayList term4484 = new ArrayList();
        ((ArrayList) term4484).add((Object)null);
        ((ArrayList) term4484).add((Object)null);
        ((ArrayList) term4484).add((Object)null);
        term4409 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4480 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4481 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4409, term4409.getClass(), "entries", term4410);
        setField(term4409, term4409.getClass(), "nameMap", term4434);
        setField(term4409, term4409.getClass(), "encoding", "HDaezxQfQR");
        setField(term4409, term4409.getClass(), "zipEncoding", null);
        setField(term4409, term4409.getClass(), "archiveName", "iikZEapDlu");
        setIntField(term4481, term4481.getClass(), "fd", -1);
        setLongField(term4481, term4481.getClass(), "handle", -1L);
        setField(term4481, term4481.getClass(), "parent", null);
        setField(term4481, term4481.getClass(), "otherParents", term4484);
        setBooleanField(term4481, term4481.getClass(), "closed", false);
        setBooleanField(term4481, term4481.getClass(), "append", true);
        setField(term4481, term4481.getClass(), "cleanup", null);
        setField(term4480, term4480.getClass(), "fd", term4481);
        setField(term4480, term4480.getClass(), "channel", null);
        setBooleanField(term4480, term4480.getClass(), "rw", false);
        setField(term4480, term4480.getClass(), "path", null);
        setField(term4480, term4480.getClass(), "closed", null);
        setField(term4409, term4409.getClass(), "archive", term4480);
        setBooleanField(term4409, term4409.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term4409, term4409.getClass(), "closed", false);
        setField(term4409, term4409.getClass(), "OFFSET_COMPARATOR", null);
        term4493 = new Long(-6587807377747738663L);
        term4495 = new Long(-6301101997917060727L);
        term4497 = (byte[]) newByteArray(9);
        setByteElement(term4497, 0, (byte) 9);
        setByteElement(term4497, 1, (byte) 44);
        setByteElement(term4497, 2, (byte) 26);
        setByteElement(term4497, 3, (byte) 125);
        setByteElement(term4497, 4, (byte) -119);
        setByteElement(term4497, 5, (byte) 94);
        setByteElement(term4497, 6, (byte) -1);
        setByteElement(term4497, 7, (byte) 99);
        setByteElement(term4497, 8, (byte) 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term4493;
        args[1] = term4495;
        args[2] = term4497;
        try {
            callMethod(klass, "tryToLocateSignature", argTypes, term4409, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


