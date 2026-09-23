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
import static org.apache.commons.compress.changes.EqualityUtils.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;

public class ChangeSetPerformer_isDeletedLater_83570642656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15812;
     Object term15860;
     Object term15980;
     Object term16598;
     Object term16599;
     Object term16602;

    public ChangeSetPerformer_isDeletedLater_83570642656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15812 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term15860 = new HashSet();
        term15980 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term15980, term15980.getClass(), "name", "");
        term16598 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term16598, term16598.getClass(), "changes", null);
        term16599 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term16599, term16599.getClass(), "name", "");
        setIntField(term16599, term16599.getClass(), "mode", 0);
        setIntField(term16599, term16599.getClass(), "userId", 0);
        setIntField(term16599, term16599.getClass(), "groupId", 0);
        setLongField(term16599, term16599.getClass(), "size", 0L);
        setLongField(term16599, term16599.getClass(), "modTime", 0L);
        setByteField(term16599, term16599.getClass(), "linkFlag", (byte) 0);
        setField(term16599, term16599.getClass(), "linkName", null);
        setField(term16599, term16599.getClass(), "magic", null);
        setField(term16599, term16599.getClass(), "version", null);
        setField(term16599, term16599.getClass(), "userName", null);
        setField(term16599, term16599.getClass(), "groupName", null);
        setIntField(term16599, term16599.getClass(), "devMajor", 0);
        setIntField(term16599, term16599.getClass(), "devMinor", 0);
        setField(term16599, term16599.getClass(), "file", null);
        HashMap term16603 = new HashMap();
        Set<Object> term16605 =  ((Map) term16603).keySet();
        term16602 = new HashSet((Collection<? extends Object>) term16605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term15860;
        args[1] = term15980;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term15812, args);
        assertTrue(recursiveEquals(term15812, term16598));
        assertTrue(recursiveEquals(term15860, term16599));
        assertTrue(recursiveEquals(term15980, term16602));
        assertTrue(recursiveEquals(retValue, false));
    }

};


