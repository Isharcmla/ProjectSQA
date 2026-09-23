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

public class ChangeSetPerformer_isDeletedLater_83570642670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20713;
     Object term20761;
     Object term20881;
     Object term21519;
     Object term21520;
     Object term21521;

    public ChangeSetPerformer_isDeletedLater_83570642670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20713 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        term20761 = new HashSet();
        term20881 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term20881, term20881.getClass(), "name", "");
        term21519 = newInstance(Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer"));
        setField(term21519, term21519.getClass(), "changes", null);
        term21520 = newInstance(Class.forName("org.apache.commons.compress.archivers.jar.JarArchiveEntry"));
        setField(term21520, term21520.getClass(), "manifestAttributes", null);
        setField(term21520, term21520.getClass(), "certificates", null);
        setIntField(term21520, term21520.getClass(), "internalAttributes", 0);
        setIntField(term21520, term21520.getClass(), "platform", 0);
        setLongField(term21520, term21520.getClass(), "externalAttributes", 0L);
        setField(term21520, term21520.getClass(), "extraFields", null);
        setField(term21520, term21520.getClass(), "name", null);
        setLongField(term21520, term21520.getClass(), "xdostime", 0L);
        setField(term21520, term21520.getClass(), "mtime", null);
        setField(term21520, term21520.getClass(), "atime", null);
        setField(term21520, term21520.getClass(), "ctime", null);
        setLongField(term21520, term21520.getClass(), "crc", 0L);
        setLongField(term21520, term21520.getClass(), "size", 0L);
        setLongField(term21520, term21520.getClass(), "csize", 0L);
        setIntField(term21520, term21520.getClass(), "method", 0);
        setIntField(term21520, term21520.getClass(), "flag", 0);
        setField(term21520, term21520.getClass(), "extra", null);
        setField(term21520, term21520.getClass(), "comment", null);
        HashMap term21522 = new HashMap();
        Set<Object> term21524 =  ((Map) term21522).keySet();
        term21521 = new HashSet((Collection<? extends Object>) term21524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.changes.ChangeSetPerformer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[2];
        args[0] = term20761;
        args[1] = term20881;
        Object retValue = callMethod(klass, "isDeletedLater", argTypes, term20713, args);
        assertTrue(recursiveEquals(term20713, term21519));
        assertTrue(recursiveEquals(term20761, term21520));
        assertTrue(recursiveEquals(term20881, term21521));
        assertTrue(recursiveEquals(retValue, false));
    }

};


