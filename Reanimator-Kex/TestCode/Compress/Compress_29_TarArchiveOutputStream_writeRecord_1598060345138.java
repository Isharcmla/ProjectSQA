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

public class TarArchiveOutputStream_writeRecord_1598060345138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85287;
     Object term85132;
     Object term85635;
     Object term85636;

    public TarArchiveOutputStream_writeRecord_1598060345138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85287 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term85287, term85287.getClass(), "recordSize", 0);
        setField(term85287, term85287.getClass(), "out", term85287);
        setBooleanField(term85287, term85287.getClass(), "haveUnclosedEntry", true);
        term85132 = (byte[]) newByteArray(0);
        term85635 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setLongField(term85635, term85635.getClass(), "currSize", 0L);
        setField(term85635, term85635.getClass(), "currName", null);
        setLongField(term85635, term85635.getClass(), "currBytes", 0L);
        setField(term85635, term85635.getClass(), "recordBuf", null);
        setIntField(term85635, term85635.getClass(), "assemLen", 0);
        setField(term85635, term85635.getClass(), "assemBuf", null);
        setIntField(term85635, term85635.getClass(), "longFileMode", 0);
        setIntField(term85635, term85635.getClass(), "bigNumberMode", 0);
        setIntField(term85635, term85635.getClass(), "recordsWritten", 1);
        setIntField(term85635, term85635.getClass(), "recordsPerBlock", 0);
        setIntField(term85635, term85635.getClass(), "recordSize", 0);
        setBooleanField(term85635, term85635.getClass(), "closed", false);
        setBooleanField(term85635, term85635.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term85635, term85635.getClass(), "finished", false);
        setField(term85635, term85635.getClass(), "out", term85635);
        setField(term85635, term85635.getClass(), "zipEncoding", null);
        setBooleanField(term85635, term85635.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term85635, term85635.getClass(), "oneByte", null);
        setLongField(term85635, term85635.getClass(), "bytesWritten", 0L);
        term85636 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term85132;
        args[1] = 0;
        callMethod(klass, "writeRecord", argTypes, term85287, args);
        assertTrue(recursiveEquals(term85287, term85635));
        assertTrue(recursiveEquals(term85132, term85636));
    }

};


