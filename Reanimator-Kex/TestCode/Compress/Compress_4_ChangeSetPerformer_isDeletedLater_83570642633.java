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

public class ChangeSetPerformer_isDeletedLater_83570642633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7019;
     Object term7139;

    public ChangeSetPerformer_isDeletedLater_83570642633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7019 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term7139 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term7139, term7139.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7139;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term7019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


