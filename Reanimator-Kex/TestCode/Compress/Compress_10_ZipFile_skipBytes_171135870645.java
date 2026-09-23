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
import java.lang.Integer;

public class ZipFile_skipBytes_171135870645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4536;
     Object term4620;

    public ZipFile_skipBytes_171135870645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4537 = new HashMap();
        HashMap term4561 = new HashMap();
        ArrayList term4611 = new ArrayList();
        ((ArrayList) term4611).add((Object)null);
        ((ArrayList) term4611).add((Object)null);
        ((ArrayList) term4611).add((Object)null);
        term4536 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        Object term4607 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4608 = newInstance(Class.forName("java.io.FileDescriptor"));
        setField(term4536, term4536.getClass(), "entries", term4537);
        setField(term4536, term4536.getClass(), "nameMap", term4561);
        setField(term4536, term4536.getClass(), "encoding", "hOncybyCAH");
        setField(term4536, term4536.getClass(), "zipEncoding", null);
        setField(term4536, term4536.getClass(), "archiveName", "QduALnDSVo");
        setIntField(term4608, term4608.getClass(), "fd", -1);
        setLongField(term4608, term4608.getClass(), "handle", -1L);
        setField(term4608, term4608.getClass(), "parent", null);
        setField(term4608, term4608.getClass(), "otherParents", term4611);
        setBooleanField(term4608, term4608.getClass(), "closed", false);
        setBooleanField(term4608, term4608.getClass(), "append", true);
        setField(term4608, term4608.getClass(), "cleanup", null);
        setField(term4607, term4607.getClass(), "fd", term4608);
        setField(term4607, term4607.getClass(), "channel", null);
        setBooleanField(term4607, term4607.getClass(), "rw", false);
        setField(term4607, term4607.getClass(), "path", null);
        setField(term4607, term4607.getClass(), "closed", null);
        setField(term4536, term4536.getClass(), "archive", term4607);
        setBooleanField(term4536, term4536.getClass(), "useUnicodeExtraFields", true);
        setBooleanField(term4536, term4536.getClass(), "closed", true);
        setField(term4536, term4536.getClass(), "OFFSET_COMPARATOR", null);
        term4620 = new Integer(1743224434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4620;
        try {
            callMethod(klass, "skipBytes", argTypes, term4536, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


