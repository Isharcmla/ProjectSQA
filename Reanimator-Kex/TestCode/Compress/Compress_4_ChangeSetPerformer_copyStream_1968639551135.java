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

public class ChangeSetPerformer_copyStream_1968639551135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55415;
     Object term55549;
     Object term55669;

    public ChangeSetPerformer_copyStream_1968639551135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55415 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term55549 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term55190 = (byte[]) newByteArray(15);
        setField(term55549, term55549.getClass(), "recordBuf", term55190);
        term55669 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term55669, term55669.getClass(), "name", "");
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
        args[1] = term55549;
        args[2] = term55669;
        callMethod(klass, "copyStream", argTypes, term55415, args);
    }

};


