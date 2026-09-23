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

public class ChangeSetPerformer_isDeletedLater_83570642675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23357;
     Object term23405;
     Object term23843;

    public ChangeSetPerformer_isDeletedLater_83570642675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23357 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term23595 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term23595, term23595.getClass(), "type", 4);
        setField(term23595, term23595.getClass(), "targetFile", "");
        Object term23671 = newInstance(Class.forName("java.lang.Object"));
        term23405 = new HashSet();
        ((HashSet) term23405).add(term23595);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add(term23671);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        ((HashSet) term23405).add((Object)null);
        term23843 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term23843, term23843.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term23405;
        args[1] = term23843;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term23357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


