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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ChangeSetPerformer_isDeletedLater_8357064266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term25;

    public ChangeSetPerformer_isDeletedLater_8357064266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20 = new HashMap();
        Set<Object> term586 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term586);
        term18 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term18, term18.getClass(), "changes", term19);
        HashMap term26 = new HashMap();
        Set<Object> term587 =  ((Map) term26).keySet();
        term25 = new HashSet((Collection<? extends Object>) term587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term25;
        args[1] = null;
        try {
            callMethod(klass, "isDeletedLater", argTypes, term18, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


