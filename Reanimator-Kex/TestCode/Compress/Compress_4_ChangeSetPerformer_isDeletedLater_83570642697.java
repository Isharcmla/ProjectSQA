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
import java.util.HashSet;
import java.lang.Object;

public class ChangeSetPerformer_isDeletedLater_83570642697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31982;
     Object term32030;
     Object term32298;

    public ChangeSetPerformer_isDeletedLater_83570642697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31982 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term32030 = new HashSet();
        ((HashSet) term32030).add((Object)null);
        term32298 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(term32298, term32298.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term32030;
        args[1] = term32298;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term31982, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


