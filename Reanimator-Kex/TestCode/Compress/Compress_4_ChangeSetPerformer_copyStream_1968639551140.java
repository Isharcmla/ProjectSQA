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

public class ChangeSetPerformer_copyStream_1968639551140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58284;
     Object term58418;
     Object term58538;

    public ChangeSetPerformer_copyStream_1968639551140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58284 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term58418 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveOutputStream"));
        setBooleanField(term58418, term58418.getClass(), "jarMarkerAdded", false);
        term58538 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
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
        args[1] = term58418;
        args[2] = term58538;
        callMethod(klass, "copyStream", argTypes, term58284, args);
    }

};


