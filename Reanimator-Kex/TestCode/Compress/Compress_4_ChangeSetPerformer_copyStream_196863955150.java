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

public class ChangeSetPerformer_copyStream_196863955150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13335;
     Object term13473;

    public ChangeSetPerformer_copyStream_196863955150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13335 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term13473 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term13597 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term13473, term13473.getClass(), "closed", false);
        setField(term13473, term13473.getClass(), "entry", term13597);
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
        args[1] = term13473;
        args[2] = null;
        try {
            callMethod(klass, "copyStream", argTypes, term13335, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


