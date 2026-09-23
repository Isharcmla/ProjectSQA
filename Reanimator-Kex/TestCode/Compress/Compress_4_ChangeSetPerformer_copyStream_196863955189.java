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
import java.lang.NullPointerException;
import static org.apache.commons.compress.changes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangeSetPerformer_copyStream_196863955189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28818;
     Object term28956;

    public ChangeSetPerformer_copyStream_196863955189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28818 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term28956 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term29080 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term28956, term28956.getClass(), "closed", false);
        setLongField(term29080, term29080.getClass(), "filesize", 0L);
        setIntField(term29080, term29080.getClass(), "alignmentBoundary", 0);
        setShortField(term29080, term29080.getClass(), "fileFormat", (short) 2);
        setField(term28956, term28956.getClass(), "entry", term29080);
        setLongField(term28956, term28956.getClass(), "written", 0L);
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
        args[1] = term28956;
        args[2] = null;
        try {
            callMethod(klass, "copyStream", argTypes, term28818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


