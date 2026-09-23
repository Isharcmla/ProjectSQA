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

public class ChangeSetPerformer_isDeletedLater_83570642623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4703;
     Object term4751;
     Object term4871;
     Object term4893;
     Object term4894;
     Object term4895;

    public ChangeSetPerformer_isDeletedLater_83570642623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4703 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term4751 = new HashSet();
        term4871 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term4871, term4871.getClass(), "name", null);
        term4893 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term4893, term4893.getClass(), "changes", null);
        term4894 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term4894, term4894.getClass(), "manifestAttributes", null);
        setField(term4894, term4894.getClass(), "certificates", null);
        setIntField(term4894, term4894.getClass(), "internalAttributes", 0);
        setIntField(term4894, term4894.getClass(), "platform", 0);
        setLongField(term4894, term4894.getClass(), "externalAttributes", 0L);
        setField(term4894, term4894.getClass(), "extraFields", null);
        setField(term4894, term4894.getClass(), "name", null);
        setLongField(term4894, term4894.getClass(), "xdostime", 0L);
        setField(term4894, term4894.getClass(), "mtime", null);
        setField(term4894, term4894.getClass(), "atime", null);
        setField(term4894, term4894.getClass(), "ctime", null);
        setLongField(term4894, term4894.getClass(), "crc", 0L);
        setLongField(term4894, term4894.getClass(), "size", 0L);
        setLongField(term4894, term4894.getClass(), "csize", 0L);
        setIntField(term4894, term4894.getClass(), "method", 0);
        setIntField(term4894, term4894.getClass(), "flag", 0);
        setField(term4894, term4894.getClass(), "extra", null);
        setField(term4894, term4894.getClass(), "comment", null);
        HashMap term4896 = new HashMap();
        Set<Object> term4898 =  ((Map) term4896).keySet();
        term4895 = new HashSet((Collection<? extends Object>) term4898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term4751;
        args[1] = term4871;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term4703, args);
        assertTrue(recursiveEquals(term4703, term4893));
        assertTrue(recursiveEquals(term4751, term4894));
        assertTrue(recursiveEquals(term4871, term4895));
        assertTrue(recursiveEquals(retValue, false));
    }

};


