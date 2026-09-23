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

public class ChangeSetPerformer_isDeletedLater_83570642682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26050;
     Object term26098;
     Object term26214;
     Object term26795;
     Object term26796;
     Object term26797;

    public ChangeSetPerformer_isDeletedLater_83570642682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26050 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term26098 = new HashSet();
        term26214 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(term26214, term26214.getClass(), "name", null);
        term26795 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term26795, term26795.getClass(), "changes", null);
        term26796 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveEntry"));
        setField(term26796, term26796.getClass(), "name", null);
        setIntField(term26796, term26796.getClass(), "userId", 0);
        setIntField(term26796, term26796.getClass(), "groupId", 0);
        setIntField(term26796, term26796.getClass(), "mode", 0);
        setLongField(term26796, term26796.getClass(), "lastModified", 0L);
        setLongField(term26796, term26796.getClass(), "length", 0L);
        HashMap term26798 = new HashMap();
        Set<Object> term26800 =  ((Map) term26798).keySet();
        term26797 = new HashSet((Collection<? extends Object>) term26800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term26098;
        args[1] = term26214;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term26050, args);
        assertTrue(recursiveEquals(term26050, term26795));
        assertTrue(recursiveEquals(term26098, term26796));
        assertTrue(recursiveEquals(term26214, term26797));
        assertTrue(recursiveEquals(retValue, false));
    }

};


