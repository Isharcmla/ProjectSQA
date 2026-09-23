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

public class ChangeSetPerformer_isDeletedLater_835706426109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38765;
     Object term38813;
     Object term39179;

    public ChangeSetPerformer_isDeletedLater_835706426109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38765 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term39003 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term39003, term39003.getClass(), "type", 4);
        setField(term39003, term39003.getClass(), "targetFile", null);
        term38813 = new HashSet();
        ((HashSet) term38813).add(term39003);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        ((HashSet) term38813).add((Object)null);
        term39179 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setField(term39179, term39179.getClass(), "name", "                 ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term38813;
        args[1] = term39179;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term38765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


