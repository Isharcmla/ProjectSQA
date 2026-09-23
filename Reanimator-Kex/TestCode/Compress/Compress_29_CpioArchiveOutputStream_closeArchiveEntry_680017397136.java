package org.apache.commons.compress.archivers.cpio;

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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.lang.Object;

public class CpioArchiveOutputStream_closeArchiveEntry_680017397136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58748;
     Object term58962;

    public CpioArchiveOutputStream_closeArchiveEntry_680017397136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58748 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term58872 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term58748, term58748.getClass(), "finished", false);
        setBooleanField(term58748, term58748.getClass(), "closed", false);
        setLongField(term58872, term58872.getClass(), "filesize", 0L);
        setIntField(term58872, term58872.getClass(), "alignmentBoundary", 0);
        setShortField(term58872, term58872.getClass(), "fileFormat", (short) 2);
        setField(term58748, term58748.getClass(), "entry", term58872);
        setLongField(term58748, term58748.getClass(), "written", 0L);
        term58962 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term58962, term58962.getClass(), "entry", null);
        setBooleanField(term58962, term58962.getClass(), "closed", false);
        setBooleanField(term58962, term58962.getClass(), "finished", false);
        setShortField(term58962, term58962.getClass(), "entryFormat", (short) 0);
        setField(term58962, term58962.getClass(), "names", null);
        setLongField(term58962, term58962.getClass(), "crc", 0L);
        setLongField(term58962, term58962.getClass(), "written", 0L);
        setField(term58962, term58962.getClass(), "out", null);
        setIntField(term58962, term58962.getClass(), "blockSize", 0);
        setLongField(term58962, term58962.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term58962, term58962.getClass(), "zipEncoding", null);
        setField(term58962, term58962.getClass(), "oneByte", null);
        setLongField(term58962, term58962.getClass(), "bytesWritten", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term58748, args);
        assertTrue(recursiveEquals(term58748, term58962));
    }

};


