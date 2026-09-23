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

public class ChangeSetPerformer_isDeletedLater_835706426115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42872;
     Object term42920;
     Object term43286;

    public ChangeSetPerformer_isDeletedLater_835706426115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42872 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term43110 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term43110, term43110.getClass(), "type", 4);
        setField(term43110, term43110.getClass(), "targetFile", null);
        term42920 = new HashSet();
        ((HashSet) term42920).add(term43110);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        ((HashSet) term42920).add((Object)null);
        term43286 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(term43286, term43286.getClass(), "name", "  ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term42920;
        args[1] = term43286;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term42872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


