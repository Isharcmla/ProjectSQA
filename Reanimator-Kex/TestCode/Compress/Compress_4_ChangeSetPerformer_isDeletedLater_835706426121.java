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

public class ChangeSetPerformer_isDeletedLater_835706426121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47725;
     Object term47773;
     Object term48173;

    public ChangeSetPerformer_isDeletedLater_835706426121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47725 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        Object term47963 = newInstance(Class.forName("org.apache.commons.compress.changes.Change"));
        setIntField(term47963, term47963.getClass(), "type", 4);
        setField(term47963, term47963.getClass(), "targetFile", "");
        term47773 = new HashSet();
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        ((HashSet) term47773).add(term47963);
        term48173 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term48173, term48173.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term47773;
        args[1] = term48173;
        callMethod(klass, "isDeletedLater", argTypes, term47725, args);
    }

};


