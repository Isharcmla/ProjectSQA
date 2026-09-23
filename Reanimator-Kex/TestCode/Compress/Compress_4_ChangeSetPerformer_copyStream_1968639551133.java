package org.apache.commons.compress.changes;

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
import static org.apache.commons.compress.changes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangeSetPerformer_copyStream_1968639551133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53995;
     Object term54133;

    public ChangeSetPerformer_copyStream_1968639551133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53995 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term54133 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term54257 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term54133, term54133.getClass(), "closed", false);
        setLongField(term54257, term54257.getClass(), "filesize", 0L);
        setIntField(term54257, term54257.getClass(), "alignmentBoundary", 0);
        setShortField(term54257, term54257.getClass(), "fileFormat", (short) 2);
        setLongField(term54257, term54257.getClass(), "chksum", 4611686018427387904L);
        setField(term54133, term54133.getClass(), "entry", term54257);
        setLongField(term54133, term54133.getClass(), "written", 0L);
        setLongField(term54133, term54133.getClass(), "crc", -4611686018427387905L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveOutputStream");
        argTypes[2] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term54133;
        args[2] = null;
        callMethod(klass, "copyStream", argTypes, term53995, args);
    }

};


