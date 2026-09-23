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
import java.util.HashSet;
import java.lang.Object;

public class ChangeSetPerformer_isDeletedLater_835706426124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49109;
     Object term49157;
     Object term49557;

    public ChangeSetPerformer_isDeletedLater_835706426124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49109 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term49347 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term49347, term49347.getClass(), "type", 1);
        setField(term49347, term49347.getClass(), "targetFile", "");
        term49157 = new HashSet();
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        ((HashSet) term49157).add(term49347);
        term49557 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term49557, term49557.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term49157;
        args[1] = term49557;
        callMethod(klass, "isDeletedLater", argTypes, term49109, args);
    }

};


