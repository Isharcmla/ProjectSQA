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
import java.lang.Object;

public class TarArchiveOutputStream_handleLongName_1576502222241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138382;
     Object term138592;

    public TarArchiveOutputStream_handleLongName_1576502222241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138382 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term138514 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
        setField(term138382, term138382.getClass(), "zipEncoding", term138514);
        term138592 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term138593 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.Simple8BitZipEncoding"));
        setLongField(term138592, term138592.getClass(), "currSize", 0L);
        setField(term138592, term138592.getClass(), "currName", null);
        setLongField(term138592, term138592.getClass(), "currBytes", 0L);
        setField(term138592, term138592.getClass(), "recordBuf", null);
        setIntField(term138592, term138592.getClass(), "assemLen", 0);
        setField(term138592, term138592.getClass(), "assemBuf", null);
        setIntField(term138592, term138592.getClass(), "longFileMode", 0);
        setIntField(term138592, term138592.getClass(), "bigNumberMode", 0);
        setIntField(term138592, term138592.getClass(), "recordsWritten", 0);
        setIntField(term138592, term138592.getClass(), "recordsPerBlock", 0);
        setIntField(term138592, term138592.getClass(), "recordSize", 0);
        setBooleanField(term138592, term138592.getClass(), "closed", false);
        setBooleanField(term138592, term138592.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term138592, term138592.getClass(), "finished", false);
        setField(term138592, term138592.getClass(), "out", null);
        setField(term138593, term138593.getClass(), "highChars", null);
        setField(term138593, term138593.getClass(), "reverseMapping", null);
        setField(term138592, term138592.getClass(), "zipEncoding", term138593);
        setBooleanField(term138592, term138592.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term138592, term138592.getClass(), "oneByte", null);
        setLongField(term138592, term138592.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = byte.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = "";
        args[2] = null;
        args[3] = null;
        args[4] = (byte) 0;
        args[5] = null;
        Object retValue = callMethod(klass, "handleLongName", argTypes, term138382, args);
        assertTrue(recursiveEquals(term138382, term138592));
        assertTrue(recursiveEquals(retValue, false));
    }

};


