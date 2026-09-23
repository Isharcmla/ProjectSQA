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

public class ChangeSetPerformer_isDeletedLater_835706426128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51465;
     Object term51513;
     Object term51913;

    public ChangeSetPerformer_isDeletedLater_835706426128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51465 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term51703 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term51703, term51703.getClass(), "type", 1);
        setField(term51703, term51703.getClass(), "targetFile", "");
        term51513 = new HashSet();
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        ((HashSet) term51513).add(term51703);
        term51913 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term51913, term51913.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term51513;
        args[1] = term51913;
        callMethod(klass, "isDeletedLater", argTypes, term51465, args);
    }

};


